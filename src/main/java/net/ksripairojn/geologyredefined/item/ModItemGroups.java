package net.ksripairojn.geologyredefined.item;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ksripairojn.geologyredefined.GeologyRedefined;
import net.ksripairojn.geologyredefined.GeologyRedefinedClient;
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
                    }).build());
    public static void registerItemGroups(){
        GeologyRedefined.LOGGER.info("Geology Redefined Items"+GeologyRedefined.MOD_ID);

    }
}
