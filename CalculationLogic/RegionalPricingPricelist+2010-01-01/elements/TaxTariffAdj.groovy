
def region = api.findLookupTableValues("Region",
        Filter.equal("Currency",input.Region)).find().name
def tax = api.vLookup("TaxAdj", region)
//api.trace(region)

return output.BasePrice * tax