if(api.isSyntaxCheck())
{
    api.integerUserEntry("Quantity")
    def quantityParam = api.getParameter("Quantity")
    quantityParam.setLabel("Required Quantity")
    quantityParam.setRequired(true)
    quantityParam.setConfigParameter("inputType", "range")
    quantityParam.setConfigParameter("from", 1)\


    api.userEntry("SalesDiscountPct")
    def discountParam= api.getParameter("SalesDiscountPct")
    discountParam.setLabel("Sales Discount (%)")
    discountParam.setRequired(false)
    discountParam.setValue(0)
    discountParam.setConfigParameter("format type", "PERCENT")
    discountParam.setConfigParameter("formatType", "range")
    discountParam.setConfigParameter("from",0)
    discountParam.setConfigParameter("to", 1)
    api.abortCalculation()
}