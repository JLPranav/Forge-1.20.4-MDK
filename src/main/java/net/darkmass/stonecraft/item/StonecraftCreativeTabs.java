package net.darkmass.stonecraft.item;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.darkmass.stonecraft.Stonecraft;

public class StonecraftCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Stonecraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MY_MOD_TAB = CREATIVE_MODE_TABS.register("stonecraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(StonecraftItems.PLATINUM_INGOT.get()))
                    .title(Component.translatable("creative_tab.stonecraft_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(StonecraftItems.PLATINUM_INGOT.get());
                        pOutput.accept(StonecraftItems.RAW_PLATINUM.get());
                        pOutput.accept(StonecraftItems.ROCK.get());
                        pOutput.accept(StonecraftItems.PLANT_FIBRE.get());
                        pOutput.accept(StonecraftItems.ROPE.get());
                        pOutput.accept(StonecraftItems.SHARP_ROCK.get());
                        pOutput.accept(StonecraftItems.SPEAR_HEAD.get());
                        pOutput.accept(StonecraftItems.HANDLE.get());
                        pOutput.accept(StonecraftItems.SPEAR.get());




                    })
                    .build());

    public static void register(IEventBus eventbus){
        CREATIVE_MODE_TABS.register(eventbus);
    }
}
