
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.corrinedev.contagionassets.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import com.corrinedev.contagionassets.item.WrappedBaseballBatItem;
import com.corrinedev.contagionassets.item.SwitchKnifeItem;
import com.corrinedev.contagionassets.item.PipeItem;
import com.corrinedev.contagionassets.item.HatchetItem;
import com.corrinedev.contagionassets.item.HandSawItem;
import com.corrinedev.contagionassets.item.CleaverItem;
import com.corrinedev.contagionassets.item.ClawHammerItem;
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
	public static final RegistryObject<Item> SWITCH_KNIFE = REGISTRY.register("switch_knife", () -> new SwitchKnifeItem());
	public static final RegistryObject<Item> CLAW_HAMMER = REGISTRY.register("claw_hammer", () -> new ClawHammerItem());
	public static final RegistryObject<Item> PIPE = REGISTRY.register("pipe", () -> new PipeItem());
	// Start of user code block custom items
	// End of user code block custom items
}
