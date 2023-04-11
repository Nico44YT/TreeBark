
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.letscode.treebark.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

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

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TreebarkModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block OAK_BARK_BLOCK = register(new OakBarkBlockBlock());
	public static final Block SPRUCE_BARK_BLOCK = register(new SpruceBarkBlockBlock());
	public static final Block BIRCH_BARK_BLOCK = register(new BirchBarkBlockBlock());
	public static final Block JUNGLE_BARK_BLOCK = register(new JungleBarkBlockBlock());
	public static final Block ACACIA_BARK_BLOCK = register(new AcaciaBarkBlockBlock());
	public static final Block DARK_OAK_BARK_BLOCK = register(new DarkOakBarkBlockBlock());
	public static final Block WARPED_BARK_BLOCK = register(new WarpedBarkBlockBlock());
	public static final Block MANGROVE_BARK_BLOCK = register(new MangroveBarkBlockBlock());
	public static final Block CRIMSON_BARK_BLOCK = register(new CrimsonBarkBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			OakBarkBlockBlock.registerRenderLayer();
			SpruceBarkBlockBlock.registerRenderLayer();
			BirchBarkBlockBlock.registerRenderLayer();
			JungleBarkBlockBlock.registerRenderLayer();
			AcaciaBarkBlockBlock.registerRenderLayer();
			DarkOakBarkBlockBlock.registerRenderLayer();
			WarpedBarkBlockBlock.registerRenderLayer();
			MangroveBarkBlockBlock.registerRenderLayer();
			CrimsonBarkBlockBlock.registerRenderLayer();
		}
	}
}
