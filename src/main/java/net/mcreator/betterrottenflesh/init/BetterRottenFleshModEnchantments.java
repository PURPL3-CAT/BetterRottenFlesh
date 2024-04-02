
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterrottenflesh.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.betterrottenflesh.enchantment.PreservationEnchantment;
import net.mcreator.betterrottenflesh.BetterRottenFleshMod;

public class BetterRottenFleshModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BetterRottenFleshMod.MODID);
	public static final RegistryObject<Enchantment> PRESERVATION = REGISTRY.register("preservation", () -> new PreservationEnchantment());
}
