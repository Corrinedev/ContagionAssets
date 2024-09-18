
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.corrinedev.contagionassets.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import com.corrinedev.contagionassets.item.WrappedBaseballBatItem;
import com.corrinedev.contagionassets.item.HatchetItem;
import com.corrinedev.contagionassets.item.HandSawItem;
import com.corrinedev.contagionassets.item.CleaverItem;
import com.corrinedev.contagionassets.item.BrokenBaseballBatItem;
import com.corrinedev.contagionassets.item.BaseballBatItem;
import com.corrinedev.contagionassets.CcMod;

public class CcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CcMod.MODID);
	public static final RegistryObject<Item> CLEAVER = REGISTRY.register("cleaver", () -> new CleaverItem());
	public static final RegistryObject<Item> HATCHET = REGISTRY.register("hatchet", () -> new HatchetItem());
	public static final RegistryObject<Item> HAND_SAW = REGISTRY.register("hand_saw", () -> new HandSawItem());
	public static final RegistryObject<Item> BASEBALL_BAT = REGISTRY.register("baseball_bat", () -> new BaseballBatItem());
	public static final RegistryObject<Item> BROKEN_BASEBALL_BAT = REGISTRY.register("broken_baseball_bat", () -> new BrokenBaseballBatItem());
	public static final RegistryObject<Item> WRAPPED_BASEBALL_BAT = REGISTRY.register("wrapped_baseball_bat", () -> new WrappedBaseballBatItem());
	// Start of user code block custom items
	// End of user code block custom items
}
