package me.evanskistudios.rm;

import me.evanskistudios.rm.item.ModItemGroups;
import me.evanskistudios.rm.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RaccoonMayhem implements ModInitializer {
	public static final String MOD_ID = "raccoonmayhem";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Raccoon Mayhem Initializing!");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}