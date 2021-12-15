if(api.isSyntaxCheck()) {
    api.userEntry("ListPrice")
    api.userEntry("Discount")
} else {
    if(input.ListPrice == null || input.Discount == null) {
        return null
    }
    return input.ListPrice - input.Discount
}

