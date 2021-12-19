def productGroup = api.product("ProductGroup")
def marginAdjPct = api.vLookup("MarginAdj", productGroup).find()

return output.BasePrice * marginAdjPct
