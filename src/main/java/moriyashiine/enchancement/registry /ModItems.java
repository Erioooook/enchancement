package com.moriyashiine.enchancement.registry;

import com.moriyashiine.enchancement.Enchancement;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.ForgeRegistries;
import net.neoforged.neoforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Enchancement.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Enchancement.MOD_ID);

    public static final RegistryObject<Item> TEST_ITEM =
            ITEMS.register("test_item", () -> new Item(new Item.Properties()));

    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        // если нужно что-то инициализировать
    }
}
