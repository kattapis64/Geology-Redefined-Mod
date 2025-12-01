package net.ksripairojn.geologyredefined.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ksripairojn.geologyredefined.GeologyRedefined;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BLOCK_OF_OLIVINE = registerBlock("block_of_olivine",new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(GeologyRedefined.MOD_ID,name),new BlockItem(block,new Item.Settings()));
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name ,block);
        return Registry.register(Registries.BLOCK, Identifier.of(GeologyRedefined.MOD_ID,name),block);
    }
    public static void registerModBlocks(){
        GeologyRedefined.LOGGER.info("Registering ModBlocks for"+GeologyRedefined.MOD_ID );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{entries.add(ModBlocks.BLOCK_OF_OLIVINE);});
    }
}
