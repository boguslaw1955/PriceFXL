def regions = api.findLookupTableValues("Region")
        .collectEntries {p -> [p.attribute1, p.name] }

api.inputBuilderFactory()
        .createOptionEntry("Region")
        .setLabel("Region")
        .setRequired(true)
        .setLabels(regions)
        .setOptions(regions.keySet() as List)
        .getInput()