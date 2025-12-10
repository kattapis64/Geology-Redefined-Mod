name = ["Dunite","Peridotite","Pyroxenite","Komatiite","Gabbro","Basalt","Granite","Diorite","Andesite","Scoria","Pumice","Aplite","Rhyolite","Conglomerate","Sandstone","Siltstone","Silt","Mudstone","Claystone","Limestone","Dolostone","Travertine","Diatomite","Coquina","Chalk","Shale","Slate","Phyllite","Schist","Gneiss","Marble","Quartzite","Migmatite"]
for i in name:
    with open(f"{i.lower()}.json","w") as f:
        f.write(f"""""")
