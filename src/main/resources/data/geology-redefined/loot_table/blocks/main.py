name = ["albite","amphibole","anorthite","azurite","bauxite","biotite","black_prismatic_tourmaline","blue_zircon","calcite","epidote","fluorite","galena","goethite","gypsum","kyanite","labradorite","magnetite","magnetite_with_goethite","malachite","muscovite","olivine","opal","orthoclase","pyrite","pyrite_with_goethite","pyrope","pyroxene","red_zircon","rose_quartz","salt","smoky_quartz","spinel","sulfur","sylvite","turquoise","uvarovite","watermelon_tourmaline","yellow_topaz"]
for i in name:
    with open(f"block_of_{i}.json","w") as f:
        f.write(f"""{{
                      "type": "minecraft:block",
                      "pools": [
                        {{
                          "bonus_rolls": 0.0,
                          "conditions": [
                            {{
                              "condition": "minecraft:survives_explosion"
                            }}
                          ],
                          "entries": [
                            {{
                              "type": "minecraft:item",
                              "name": "geology-redefined:block_of_{i}"
                            }}
                          ],
                          "rolls": 1.0
                        }}
                      ]
                    }}""")
