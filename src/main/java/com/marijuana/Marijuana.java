package com.marijuana;

import com.marijuana.block.ModBlocks;
import com.marijuana.effect.HighEffect;
import com.marijuana.moditems.ModItemGroups;
import com.marijuana.moditems.ModItems;
import com.marijuana.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Marijuana implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "marijuana";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final StatusEffect HIGH = new HighEffect();
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModSounds.registerSounds();
		Registry.register(Registries.STATUS_EFFECT, new Identifier("marijuana", "high"), HIGH);
		ModBlocks.registerModBlocks();
	}
}