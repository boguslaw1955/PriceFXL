def totalInvoicePrice = 0.0

quote.lineItems.findAll {
    !it.folder
}.each { lineItem ->
    BigDecimal lineItemTotalInvoicePrice = lineItem.outputs.find {
        it.resultName == "TotalInvoicePrice"
    }?.result
    totalInvoicePrice += lineItemTotalInvoicePrice
}
def approvalLevels = api.findLookupTableValues("ApprovalLevelsRevenue")

approvalLevels.sort {
    it.name
}.each { level ->
    def threshold = level.attribute1
    def userGroup = level.attribute2

    if (totalInvoicePrice >= threshold) {
        workflow.addApprovalStep(userGroup)
                .withReasons("Total Invoice Price > " +
                        (threshold as String) + "EUR")
                .withUserGroupApprovers(userGroup)
                .withMinApprovalsNeeded(1)
    }
}