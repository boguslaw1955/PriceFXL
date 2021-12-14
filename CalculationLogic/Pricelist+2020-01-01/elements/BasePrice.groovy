def avgCost = api.productExtension("ProductCost")?.find()?.attribute1
if( avgCost == null){
    api.addWarning("Could not find Average Cost in PX table ProductCost")
    return null;
}
api.trace("avgCost",null, avgCost)
return avgCost