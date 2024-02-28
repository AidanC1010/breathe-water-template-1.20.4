package net.adwr.breathewater;

import net.adwr.breathewater.item.ModItemGroups;
import net.adwr.breathewater.item.custom.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BreatheWater implements ModInitializer {

    public static final String MOD_ID = "breathewater";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}