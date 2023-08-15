package net.letscode.treebark;

import net.letscode.treebark.item.ModItemGroup;
import net.letscode.treebark.item.ModItems;
import net.letscode.treebark.registries.ModRegistry;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TreeBark implements ModInitializer {

	public static final String MOD_ID = "treebark";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();

		ModItems.registerModItems();

		ModRegistry.registerModFuels();

		ModRegistry.registerEvents();
	}
}