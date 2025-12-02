package net.ksripairojn.geologyredefined.item;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ksripairojn.geologyredefined.GeologyRedefined;
import net.ksripairojn.geologyredefined.GeologyRedefinedClient;
import net.ksripairojn.geologyredefined.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ModItemGroups {
    public static final ItemGroup GEOLOGY_REDEFINED_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GeologyRedefined.MOD_ID,"geology_redefined_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.OLIVINE))
                    .displayName(Text.translatable("itemgroup.geology-redefined.geology_redefined_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.OLIVINE);
                        entries.add(ModItems.PYROXENE);
                        entries.add(ModItems.AMPHIBOLE);
                        entries.add(ModItems.MUSCOVITE);
                        entries.add(ModItems.BIOTITE);
                        entries.add(ModItems.ANORTHITE);
                        entries.add(ModItems.ALBITE);
                        entries.add(ModItems.ORTHOCLASE);
                        entries.add(ModItems.LABRADORITE);
                        entries.add(ModItems.SMOKY_QUARTZ);
                        entries.add(ModItems.ROSE_QUARTZ);
                        entries.add(ModItems.OPAL);
                        entries.add(ModItems.PYROPE);
                        entries.add(ModItems.UVAROVITE);
                        entries.add(ModItems.BLUE_ZIRCON);
                        entries.add(ModItems.RED_ZIRCON);
                        entries.add(ModItems.KYANITE);
                        entries.add(ModItems.EPIDOTE);
                        entries.add(ModItems.YELLOW_TOPAZ);
                        entries.add(ModItems.TURQUOISE);
                        entries.add(ModItems.CALCITE);
                        entries.add(ModItems.AZURITE);
                        entries.add(ModItems.MALACHITE);
                        entries.add(ModItems.BLACK_TOUR);
                        entries.add(ModItems.WATER_TOUR);
                        entries.add(ModItems.GOETHITE);
                        entries.add(ModItems.BAUXITE);
                        entries.add(ModItems.PYRITE);
                        entries.add(ModItems.PYRITEWGOE);
                        entries.add(ModItems.GALENA);
                        entries.add(ModItems.FLUORITE);
                        entries.add(ModItems.SYLVITE);
                        entries.add(ModItems.GYPSUM);
                        entries.add(ModItems.SULFUR);
                        entries.add(ModItems.MAGNETITE);
                        entries.add(ModItems.MAGNETITEWGOE);
                        entries.add(ModItems.SPINEL);
                        entries.add(ModItems.HALITE);
                        entries.add(ModBlocks.BLOCK_OF_PYROXENE);
                        entries.add(ModBlocks.BLOCK_OF_AMPHIBOLE);
                        entries.add(ModBlocks.BLOCK_OF_MUSCOVITE);
                        entries.add(ModBlocks.BLOCK_OF_BIOTITE);
                        entries.add(ModBlocks.BLOCK_OF_ANORTHITE);
                        entries.add(ModBlocks.BLOCK_OF_ALBITE);
                        entries.add(ModBlocks.BLOCK_OF_ORTHOCLASE);
                        entries.add(ModBlocks.BLOCK_OF_LABRADORITE);
                        entries.add(ModBlocks.BLOCK_OF_SMOKY_QUARTZ);
                        entries.add(ModBlocks.BLOCK_OF_ROSE_QUARTZ);
                        entries.add(ModBlocks.BLOCK_OF_OPAL);
                        entries.add(ModBlocks.BLOCK_OF_PYROPE);
                        entries.add(ModBlocks.BLOCK_OF_UVAROVITE);
                        entries.add(ModBlocks.BLOCK_OF_BLUE_ZIRCON);
                        entries.add(ModBlocks.BLOCK_OF_RED_ZIRCON);
                        entries.add(ModBlocks.BLOCK_OF_KYANITE);
                        entries.add(ModBlocks.BLOCK_OF_EPIDOTE);
                        entries.add(ModBlocks.BLOCK_OF_YELLOW_TOPAZ);
                        entries.add(ModBlocks.BLOCK_OF_TURQUOISE);
                        entries.add(ModBlocks.BLOCK_OF_CALCITE);
                        entries.add(ModBlocks.BLOCK_OF_AZURITE);
                        entries.add(ModBlocks.BLOCK_OF_MALACHITE);
                        entries.add(ModBlocks.BLOCK_OF_BLACK_TOUR);
                        entries.add(ModBlocks.BLOCK_OF_WATER_TOUR);
                        entries.add(ModBlocks.BLOCK_OF_GOETHITE);
                        entries.add(ModBlocks.BLOCK_OF_BAUXITE);
                        entries.add(ModBlocks.BLOCK_OF_PYRITE);
                        entries.add(ModBlocks.BLOCK_OF_GALENA);
                        entries.add(ModBlocks.BLOCK_OF_PYRITEWGOE);
                        entries.add(ModBlocks.BLOCK_OF_FLUORITE);
                        entries.add(ModBlocks.BLOCK_OF_SYLVITE);
                        entries.add(ModBlocks.BLOCK_OF_GYPSUM);
                        entries.add(ModBlocks.BLOCK_OF_SULFUR);
                        entries.add(ModBlocks.BLOCK_OF_MAGNETITE);
                        entries.add(ModBlocks.BLOCK_OF_MAGNETITEWGOE);
                        entries.add(ModBlocks.BLOCK_OF_SPINEL);
                        entries.add(ModBlocks.BLOCK_OF_SALT);
                        entries.add(ModBlocks.DUNITE);
                        entries.add(ModBlocks.PERIDOTITE);
                        entries.add(ModBlocks.PYROXENITE);
                        entries.add(ModBlocks.KOMATIITE);
                        entries.add(ModBlocks.GABBRO);
                        entries.add(ModBlocks.BASALT);
                        entries.add(ModBlocks.GRANITE);
                        entries.add(ModBlocks.DIORITE);
                        entries.add(ModBlocks.ANDESITE);
                        entries.add(ModBlocks.SCORIA);
                        entries.add(ModBlocks.PUMICE);
                        entries.add(ModBlocks.APLITE);
                        entries.add(ModBlocks.RHYOLITE);
                        entries.add(ModBlocks.CONGLOMERATE);
                        entries.add(ModBlocks.SANDSTONE);
                        entries.add(ModBlocks.SILTSTONE);
                        entries.add(ModBlocks.SILT);
                        entries.add(ModBlocks.MUDSTONE);
                        entries.add(ModBlocks.CLAYSTONE);
                        entries.add(ModBlocks.LIMESTONE);
                        entries.add(ModBlocks.DOLOSTONE);
                        entries.add(ModBlocks.TRAVERTINE);
                        entries.add(ModBlocks.DIATOMITE);
                        entries.add(ModBlocks.COQUINA);
                        entries.add(ModBlocks.CHALK);
                        entries.add(ModBlocks.SHALE);
                        entries.add(ModBlocks.SLATE);
                        entries.add(ModBlocks.PHYLLITE);
                        entries.add(ModBlocks.SCHIST);
                        entries.add(ModBlocks.GNEISS);
                        entries.add(ModBlocks.MARBLE);
                        entries.add(ModBlocks.QUARTZITE);
                        entries.add(ModBlocks.MIGMATITE);

                    }).build());
    public static void registerItemGroups(){
        GeologyRedefined.LOGGER.info("Geology Redefined Items"+GeologyRedefined.MOD_ID);

    }
}
