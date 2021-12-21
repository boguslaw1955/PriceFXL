if(out.ListPrice && out.ProductCost )
    if (out.ListPrice != 0)
    {  return (out.ListPrice - out.ProductCost) / out.ListPrice}
else
    {
        api.addWarning("ListPrice == 0 , canot divide by 0")
        return
    }
