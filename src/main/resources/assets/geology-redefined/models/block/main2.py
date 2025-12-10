name = ["Conglomerate","Sandstone","Siltstone","Mudstone","Claystone","Limestone","Dolostone","Travertine","Diatomite"]
for i in name:
    with open(f"fossiliferous_{i.lower()}.json","w") as f:
        f.write(f"""
{{
  "parent": "geology-redefined:block/fossiliferous_{i.lower()}"
}}

""")
