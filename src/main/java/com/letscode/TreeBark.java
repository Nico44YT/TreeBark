package com.letscode;

import com.letscode.item.ModItems;
import com.letscode.registries.ModRegistry;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TreeBark implements ModInitializer {

	public static final String MOD_ID = "treebark";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		ModRegistry.registerModFuels();

		ModRegistry.registerEvents();
	}
}