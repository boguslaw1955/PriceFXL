def productLifeCycle = api.product("ProductLifeCycle")
def attributeAdjPct = api.vLookup("AttributeAdj", "AttributeAdj", productLifeCycle)
return output.BasePrice * attributeAdjPct
