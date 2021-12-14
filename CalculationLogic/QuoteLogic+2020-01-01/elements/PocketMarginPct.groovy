if (out.PocketMarginAbs == null
        || out.ListPrice == null) {
    api.addWarning("Pocket Margin % cannot be calculated: missing parameter(s)")
    return null
}

if (out.ListPrice == 0) {
    api.addWarning("List Price is 0, which means that Pocket Margin cannot be " +
            "calculated, since this would lead to division by 0")
    return null
}

def pocketMarginPct = out.PocketMarginAbs / out.ListPrice

if(pocketMarginPct < 0){
    api.redAlert("Pocket Margin % is too low")
}

return pocketMarginPct