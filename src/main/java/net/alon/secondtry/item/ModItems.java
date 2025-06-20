package net.alon.secondtry.item;

import net.alon.secondtry.SecondTry;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SecondTry.MOD_ID);


public static final DeferredItem<Item> BISMUTH =ITEMS.register("bismuth",
        () -> new Item(new Item.Properties()));

public static final DeferredItem<Item> RAW_BISMUTH=ITEMS.register("raw_bismuth",
        () -> new Item(new Item.Properties()));

public static final DeferredItem<Item> DICK=ITEMS.register("dick",
        () -> new Item(new Item.Properties().food(ModFoodProperties.DICK)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }



}
