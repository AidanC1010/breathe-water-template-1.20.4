package net.adwr.breathewater.item;

import net.adwr.breathewater.BreatheWater;
import net.adwr.breathewater.item.custom.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TURTLE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BreatheWater.MOD_ID, "turtle"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.turtle"))
                .icon(() -> new ItemStack(ModItems.CGlass)).entries((displayContext, entries) -> {
                    entries.add(ModItems.CGlass);
                    entries.add(ModItems.Plastic);

                }).build());

    public static void registerItemGroups(){
        BreatheWater.LOGGER.info("Registering Item Groups for "+BreatheWater.MOD_ID);

    }
}
