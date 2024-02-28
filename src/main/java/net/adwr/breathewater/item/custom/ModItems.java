package net.adwr.breathewater.item.custom;

import net.adwr.breathewater.BreatheWater;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CGlass = registerItem("compressedglass", new Item(new FabricItemSettings()));
    public static final Item Plastic = registerItem("plastic", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CGlass);
        entries.add(Plastic);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BreatheWater.MOD_ID, name), item);
    }
    public static void registerModItems() {
        BreatheWater.LOGGER.info("Registering Mod Items for "+ BreatheWater.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTabItemGroup);
    }
}
