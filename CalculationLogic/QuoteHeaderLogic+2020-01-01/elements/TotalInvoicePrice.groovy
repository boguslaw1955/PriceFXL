api.trace("quoteView", quoteProcessor.quoteView)
if (quoteProcessor.isPrePhase()) {
    return
}

List<Object> lineItems = quoteProcessor.quoteView.lineItems.findAll {
    !it.folder
}
BigDecimal sum = 0.0
for (lineItem in lineItems) {
    BigDecimal price = lineItem?.outputs?.find { lineItemOutput ->
        lineItemOutput.resultName == "TotalInvoicePrice"
    }?.result

    sum += price

    api.trace("Line", lineItem?.sku, price) // TODO remove
}

api.trace("Total invoice price", sum) // TODO remove
