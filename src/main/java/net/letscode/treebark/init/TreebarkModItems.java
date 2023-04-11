
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.letscode.treebark.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.letscode.treebark.item.WarpedBarkItem;
import net.letscode.treebark.item.SpruceBarkItem;
import net.letscode.treebark.item.OakBarkItem;
import net.letscode.treebark.item.MangroveBarkItem;
import net.letscode.treebark.item.JungleBarkItem;
import net.letscode.treebark.item.DarkOakBarkItem;
import net.letscode.treebark.item.CrimsonBarkItem;
import net.letscode.treebark.item.BirchBarkItem;
import net.letscode.treebark.item.AcaciaBarkItem;
import net.letscode.treebark.TreebarkMod;

public class TreebarkModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TreebarkMod.MODID);
	public static final RegistryObject<Item> OAK_BARK = REGISTRY.register("oak_bark", () -> new OakBarkItem());
	public static final RegistryObject<Item> SPRUCE_BARK = REGISTRY.register("spruce_bark", () -> new SpruceBarkItem());
	public static final RegistryObject<Item> BIRCH_BARK = REGISTRY.register("birch_bark", () -> new BirchBarkItem());
	public static final RegistryObject<Item> JUNGLE_BARK = REGISTRY.register("jungle_bark", () -> new JungleBarkItem());
	public static final RegistryObject<Item> ACACIA_BARK = REGISTRY.register("acacia_bark", () -> new AcaciaBarkItem());
	public static final RegistryObject<Item> DARK_OAK_BARK = REGISTRY.register("dark_oak_bark", () -> new DarkOakBarkItem());
	public static final RegistryObject<Item> MANGROVE_BARK = REGISTRY.register("mangrove_bark", () -> new MangroveBarkItem());
	public static final RegistryObject<Item> CRIMSON_BARK = REGISTRY.register("crimson_bark", () -> new CrimsonBarkItem());
	public static final RegistryObject<Item> WARPED_BARK = REGISTRY.register("warped_bark", () -> new WarpedBarkItem());
	public static final RegistryObject<Item> OAK_BARK_BLOCK = block(TreebarkModBlocks.OAK_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final RegistryObject<Item> SPRUCE_BARK_BLOCK = block(TreebarkModBlocks.SPRUCE_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final RegistryObject<Item> BIRCH_BARK_BLOCK = block(TreebarkModBlocks.BIRCH_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final RegistryObject<Item> JUNGLE_BARK_BLOCK = block(TreebarkModBlocks.JUNGLE_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final RegistryObject<Item> ACACIA_BARK_BLOCK = block(TreebarkModBlocks.ACACIA_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final RegistryObject<Item> DARK_OAK_BARK_BLOCK = block(TreebarkModBlocks.DARK_OAK_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final RegistryObject<Item> WARPED_BARK_BLOCK = block(TreebarkModBlocks.WARPED_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final RegistryObject<Item> MANGROVE_BARK_BLOCK = block(TreebarkModBlocks.MANGROVE_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);
	public static final RegistryObject<Item> CRIMSON_BARK_BLOCK = block(TreebarkModBlocks.CRIMSON_BARK_BLOCK, TreebarkModTabs.TAB_BARK_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
