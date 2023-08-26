package net.zia.sunkenbiomes.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.zia.sunkenbiomes.SunkenBiomes;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SunkenBiomes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SUNKEN_BIOMES_TAB = CREATIVE_MODE_TABS.register("sunken_biomes_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Chlorophyte_Ingot.get()))
                    .title(Component.translatable("creativetab.sunken_biomes_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.Chlorophyte_Ingot.get());
                        pOutput.accept(ModItems.Raw_Chlorophyte.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
