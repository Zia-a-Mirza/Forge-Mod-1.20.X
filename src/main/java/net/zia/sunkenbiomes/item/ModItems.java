package net.zia.sunkenbiomes.item;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zia.sunkenbiomes.SunkenBiomes;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SunkenBiomes.MOD_ID);

    public static final RegistryObject<Item> Chlorophyte_Ingot = ITEMS.register("chlorophyte_ingot",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> Raw_Chlorophyte = ITEMS.register("raw_chlorophyte",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
