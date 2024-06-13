package net.darkmass.stonecraft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.darkmass.stonecraft.Stonecraft;

public class StonecraftItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Stonecraft.MOD_ID);

    // ores --------------------------------

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));

    // ingredients ------------------------
    public static final RegistryObject<Item> ROCK = ITEMS.register("rock",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARP_ROCK = ITEMS.register("sharp_rock",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLANT_FIBRE = ITEMS.register("plant_fibre",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROPE = ITEMS.register("rope",
            () -> new Item(new Item.Properties()));
    // items ------------------------------
    public static final RegistryObject<Item> SPEAR_HEAD = ITEMS.register("spear_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPEAR = ITEMS.register("spear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HANDLE = ITEMS.register("handle",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
