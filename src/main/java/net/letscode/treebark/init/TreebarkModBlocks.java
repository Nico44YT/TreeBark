
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.letscode.treebark.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.letscode.treebark.block.WarpedBarkBlockBlock;
import net.letscode.treebark.block.SpruceBarkBlockBlock;
import net.letscode.treebark.block.OakBarkBlockBlock;
import net.letscode.treebark.block.MangroveBarkBlockBlock;
import net.letscode.treebark.block.JungleBarkBlockBlock;
import net.letscode.treebark.block.DarkOakBarkBlockBlock;
import net.letscode.treebark.block.CrimsonBarkBlockBlock;
import net.letscode.treebark.block.BirchBarkBlockBlock;
import net.letscode.treebark.block.AcaciaBarkBlockBlock;
import net.letscode.treebark.TreebarkMod;

public class TreebarkModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TreebarkMod.MODID);
	public static final RegistryObject<Block> OAK_BARK_BLOCK = REGISTRY.register("oak_bark_block", () -> new OakBarkBlockBlock());
	public static final RegistryObject<Block> SPRUCE_BARK_BLOCK = REGISTRY.register("spruce_bark_block", () -> new SpruceBarkBlockBlock());
	public static final RegistryObject<Block> BIRCH_BARK_BLOCK = REGISTRY.register("birch_bark_block", () -> new BirchBarkBlockBlock());
	public static final RegistryObject<Block> JUNGLE_BARK_BLOCK = REGISTRY.register("jungle_bark_block", () -> new JungleBarkBlockBlock());
	public static final RegistryObject<Block> ACACIA_BARK_BLOCK = REGISTRY.register("acacia_bark_block", () -> new AcaciaBarkBlockBlock());
	public static final RegistryObject<Block> DARK_OAK_BARK_BLOCK = REGISTRY.register("dark_oak_bark_block", () -> new DarkOakBarkBlockBlock());
	public static final RegistryObject<Block> WARPED_BARK_BLOCK = REGISTRY.register("warped_bark_block", () -> new WarpedBarkBlockBlock());
	public static final RegistryObject<Block> MANGROVE_BARK_BLOCK = REGISTRY.register("mangrove_bark_block", () -> new MangroveBarkBlockBlock());
	public static final RegistryObject<Block> CRIMSON_BARK_BLOCK = REGISTRY.register("crimson_bark_block", () -> new CrimsonBarkBlockBlock());
}
