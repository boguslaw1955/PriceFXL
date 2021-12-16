if (api.isSyntaxCheck()) {
    api.abortCalculation()
    return
}

workflow.addApprovalStep("Sales Manager")
        .withApprovers("john.price")
        .withReasons("Sales manager needs to approve this quote")