def cost = api.productExtension("ProductCost")?.find()?.attribute1
return libs.MoneyUtils.ExchangeRate.convertMoney(cost, "USD", "EUR")




