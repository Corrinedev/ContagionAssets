
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.corrinedev.contagionassets.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.corrinedev.contagionassets.CcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CcModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CcMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(CcModItems.CLEAVER.get());
			tabData.accept(CcModItems.BASEBALL_BAT.get());
			tabData.accept(CcModItems.BROKEN_BASEBALL_BAT.get());
			tabData.accept(CcModItems.WRAPPED_BASEBALL_BAT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CcModItems.HATCHET.get());
			tabData.accept(CcModItems.HAND_SAW.get());
		}
	}
}
