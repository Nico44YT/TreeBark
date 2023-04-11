
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.letscode.treebark.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TreebarkModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item OAK_BARK = register(new OakBarkItem());
	public static final Item SPRUCE_BARK = register(new SpruceBarkItem());
	public static final Item BIRCH_BARK = register(new BirchBarkItem());
	public static final Item JUNGLE_BARK = register(new JungleBarkItem());
	public static final Item ACACIA_BARK = register(new AcaciaBarkItem());
	public static final Item DARK_OAK_BARK = register(new DarkOakBarkItem());
	public static final Item MANGROVE_BARK = register(new MangroveBarkItem());
	public static final Item CRIMSON_BARK = register(new CrimsonBarkItem());
	public static final Item WARPED_BARK = register(new WarpedBarkItem());
	public static final Item OAK_BARK_BLOCK = register(TreebarkModBlocks.OAK_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final Item SPRUCE_BARK_BLOCK = register(TreebarkModBlocks.SPRUCE_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final Item BIRCH_BARK_BLOCK = register(TreebarkModBlocks.BIRCH_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final Item JUNGLE_BARK_BLOCK = register(TreebarkModBlocks.JUNGLE_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final Item ACACIA_BARK_BLOCK = register(TreebarkModBlocks.ACACIA_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final Item DARK_OAK_BARK_BLOCK = register(TreebarkModBlocks.DARK_OAK_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final Item WARPED_BARK_BLOCK = register(TreebarkModBlocks.WARPED_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final Item MANGROVE_BARK_BLOCK = register(TreebarkModBlocks.MANGROVE_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final Item CRIMSON_BARK_BLOCK = register(TreebarkModBlocks.CRIMSON_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
