def dmCtx = api.getDatamartContext()
def salesDM = dmCtx.getDatamart("Transaction")

def customer = out.Customer
def datamartQuery = dmCtx.newQuery(salesDM, false)

datamartQuery.select("CustomerId")
datamartQuery.select("Cost")
datamartQuery.select("InvoiceDate")

datamartQuery.where(
        Filter.equal("CustomerId", customer)
)

def result = dmCtx.executeQuery(datamartQuery)
return result