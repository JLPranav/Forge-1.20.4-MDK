package net.pranav.stonecraft.item;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pranav.stonecraft.MyMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MyMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MY_MOD_TAB = CREATIVE_MODE_TABS.register("my_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.PLATINUM_INGOT.get()))
                    .title(Component.translatable("creative_tab.my_mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.PLATINUM_INGOT.get());
                        pOutput.accept(Moditems.RAW_PLATINUM.get());

                        pOutput.accept(Items.DIAMOND);



                    })
                    .build());

    public static void register(IEventBus eventbus){
        CREATIVE_MODE_TABS.register(eventbus);
    }
}
