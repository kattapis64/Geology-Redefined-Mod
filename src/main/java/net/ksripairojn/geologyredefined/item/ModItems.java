package net.ksripairojn.geologyredefined.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ksripairojn.geologyredefined.GeologyRedefined;
import net.ksripairojn.geologyredefined.GeologyRedefinedClient;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item OLIVINE = registerItem("olivine",new Item(new Item.Settings()));
    public static final Item PYROXENE = registerItem("pyroxene",new Item(new Item.Settings()));
    public static final Item AMPHIBOLE = registerItem("amphibole",new Item(new Item.Settings()));
    public static final Item MUSCOVITE = registerItem("muscovite",new Item(new Item.Settings()));
    public static final Item BIOTITE = registerItem("biotite",new Item(new Item.Settings()));
    public static final Item ANORTHITE = registerItem("anorthite",new Item(new Item.Settings()));
    public static final Item ALBITE = registerItem("albite",new Item(new Item.Settings()));
    public static final Item ORTHOCLASE = registerItem("orthoclase",new Item(new Item.Settings()));
    public static final Item LABRADORITE = registerItem("labradorite",new Item(new Item.Settings()));
    public static final Item SMOKY_QUARTZ = registerItem("smoky_quartz",new Item(new Item.Settings()));
    public static final Item ROSE_QUARTZ = registerItem("rose_quartz",new Item(new Item.Settings()));
    public static final Item OPAL = registerItem("opal",new Item(new Item.Settings()));
    public static final Item PYROPE = registerItem("pyrope",new Item(new Item.Settings()));
    public static final Item UVAROVITE = registerItem("uvarovite",new Item(new Item.Settings()));
    public static final Item BLUE_ZIRCON = registerItem("blue_zircon",new Item(new Item.Settings()));
    public static final Item RED_ZIRCON = registerItem("red_zircon",new Item(new Item.Settings()));
    public static final Item KYANITE = registerItem("kyanite",new Item(new Item.Settings()));
    public static final Item EPIDOTE = registerItem("epidote",new Item(new Item.Settings()));
    public static final Item YELLOW_TOPAZ = registerItem("yellow_topaz",new Item(new Item.Settings()));
    public static final Item TURQUOISE = registerItem("turquoise",new Item(new Item.Settings()));
    public static final Item CALCITE = registerItem("calcite",new Item(new Item.Settings()));
    public static final Item AZURITE = registerItem("azurite",new Item(new Item.Settings()));
    public static final Item MALACHITE = registerItem("malachite",new Item(new Item.Settings()));
    public static final Item BLACK_TOUR = registerItem("black_prismatic_tourmaline",new Item(new Item.Settings()));
    public static final Item WATER_TOUR = registerItem("watermelon_tourmaline",new Item(new Item.Settings()));
    public static final Item GOETHITE = registerItem("goethite",new Item(new Item.Settings()));
    public static final Item BAUXITE = registerItem("bauxite",new Item(new Item.Settings()));
    public static final Item PYRITE = registerItem("pyrite",new Item(new Item.Settings()));
    public static final Item PYRITEWGOE = registerItem("pyrite_with_goethite",new Item(new Item.Settings()));
    public static final Item GALENA = registerItem("galena",new Item(new Item.Settings()));
    public static final Item FLUORITE = registerItem("fluorite",new Item(new Item.Settings()));
    public static final Item SYLVITE = registerItem("sylvite",new Item(new Item.Settings()));
    public static final Item GYPSUM = registerItem("gypsum",new Item(new Item.Settings()));
    public static final Item SULFUR = registerItem("sulfur",new Item(new Item.Settings()));
    public static final Item MAGNETITE = registerItem("magnetite",new Item(new Item.Settings()));
    public static final Item MAGNETITEWGOE = registerItem("magnetite_with_goethite",new Item(new Item.Settings()));
    public static final Item SPINEL = registerItem("spinel",new Item(new Item.Settings()));
    public static final Item HALITE = registerItem("halite",new Item(new Item.Settings()));
    public static final Item SHELL_SCRAPS = registerItem("shell_scraps",new Item(new Item.Settings()));
    public static final Item TRILOBITE = registerItem("trilobite",new Item(new Item.Settings()));
    public static final Item GRAPTOLITE = registerItem("graptolite",new Item(new Item.Settings()));
    public static final Item CEPHALOPOD = registerItem("cephalopod",new Item(new Item.Settings()));
    public static final Item CONODONT = registerItem("conodont",new Item(new Item.Settings()));
    public static final Item NAUTILOID = registerItem("nautiloid",new Item(new Item.Settings()));
    public static final Item CRINOID = registerItem("crinoid",new Item(new Item.Settings()));
    public static final Item FUSILINID = registerItem("fusilinid",new Item(new Item.Settings()));
    public static final Item BIVALVES = registerItem("bivalves",new Item(new Item.Settings()));
    public static final Item NERINEA = registerItem("nerinea",new Item(new Item.Settings()));
    public static final Item AMMONITE = registerItem("ammonite",new Item(new Item.Settings()));
    public static final Item DIATOM = registerItem("diatom",new Item(new Item.Settings()));
    public static final Item SCALLOP = registerItem("scallop",new Item(new Item.Settings()));
    public static final Item SEA_SNAIL = registerItem("sea_snail",new Item(new Item.Settings()));

    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, Identifier.of(GeologyRedefined.MOD_ID,name),item);
    }
    public static void registerModItems(){
        GeologyRedefined.LOGGER.info("Registering ModItems"+GeologyRedefined.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(OLIVINE);
            entries.add(PYROXENE);
            entries.add(AMPHIBOLE);
            entries.add(MUSCOVITE);
            entries.add(BIOTITE);
            entries.add(ANORTHITE);
            entries.add(ALBITE);
            entries.add(ORTHOCLASE);
            entries.add(LABRADORITE);
            entries.add(SMOKY_QUARTZ);
            entries.add(ROSE_QUARTZ);
            entries.add(OPAL);
            entries.add(PYROPE);
            entries.add(UVAROVITE);
            entries.add(BLUE_ZIRCON);
            entries.add(RED_ZIRCON);
            entries.add(KYANITE);
            entries.add(EPIDOTE);
            entries.add(YELLOW_TOPAZ);
            entries.add(TURQUOISE);
            entries.add(CALCITE);
            entries.add(AZURITE);
            entries.add(MALACHITE);
            entries.add(BLACK_TOUR);
            entries.add(WATER_TOUR);
            entries.add(GOETHITE);
            entries.add(BAUXITE);
            entries.add(PYRITE);
            entries.add(PYRITEWGOE);
            entries.add(GALENA);
            entries.add(FLUORITE);
            entries.add(SYLVITE);
            entries.add(GYPSUM);
            entries.add(SULFUR);
            entries.add(MAGNETITE);
            entries.add(MAGNETITEWGOE);
            entries.add(SPINEL);
            entries.add(SHELL_SCRAPS);
            entries.add(TRILOBITE);
            entries.add(GRAPTOLITE);
            entries.add(CEPHALOPOD);
            entries.add(CONODONT);
            entries.add(NAUTILOID);
            entries.add(CRINOID);
            entries.add(FUSILINID);
            entries.add(BIVALVES);
            entries.add(NERINEA);
            entries.add(AMMONITE);
            entries.add(DIATOM);
            entries.add(SCALLOP);
            entries.add(SEA_SNAIL);



        });
    }
}
