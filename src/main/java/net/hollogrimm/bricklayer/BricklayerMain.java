package net.hollogrimm.bricklayer;

import net.fabricmc.api.ModInitializer;
import net.hollogrimm.bricklayer.block.ModBlocks;
import net.hollogrimm.bricklayer.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BricklayerMain implements ModInitializer {
	public static final String MOD_ID = "bricklayer";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
