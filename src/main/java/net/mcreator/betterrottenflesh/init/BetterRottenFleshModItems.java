
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterrottenflesh.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.betterrottenflesh.item.FleshItem;
import net.mcreator.betterrottenflesh.BetterRottenFleshMod;

public class BetterRottenFleshModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BetterRottenFleshMod.MODID);
	public static final RegistryObject<Item> FLESH = REGISTRY.register("flesh", () -> new FleshItem());
}
