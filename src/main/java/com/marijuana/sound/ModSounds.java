package com.marijuana.sound;

import com.marijuana.Marijuana;
import net.minecraft.client.sound.Sound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent BONG_LIT = registerSoundEvent("bonglit");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Marijuana.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds() {
        Marijuana.LOGGER.info("Registering Sounds for" + Marijuana.MOD_ID);

    }
}
