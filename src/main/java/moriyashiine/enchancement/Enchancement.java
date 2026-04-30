package com.moriyashiine.enchancement;

import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(Enchancement.MOD_ID)
public class Enchancement {
    public static final String MOD_ID = "enchancement";

    public Enchancement() {
    ModItems.ITEMS.register(net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext.get().getModEventBus());
}

    @SubscribeEvent
    public void onCommonSetup(FMLCommonSetupEvent event) {
        // Здесь ты будешь вызывать регистрацию способностей, эффектов, пакетов и т.д.
    }
}
