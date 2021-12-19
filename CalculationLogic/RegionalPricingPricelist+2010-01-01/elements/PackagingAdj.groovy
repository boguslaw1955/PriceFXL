def size = api.product("Size")
def PackageAdJPct = api.vLookup("PackagingAdj", "PackagingAdj", size )
return PackageAdJPct * output.BasePrice