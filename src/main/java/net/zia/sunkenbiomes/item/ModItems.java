package net.zia.sunkenbiomes.item;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zia.sunkenbiomes.SunkenBiomes;
import net.zia.sunkenbiomes.item.custom.ModArmorItem;
import net.zia.sunkenbiomes.item.custom.PoisonSwordItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SunkenBiomes.MOD_ID);

    public static final RegistryObject<Item> Chlorophyte_Ingot = ITEMS.register("chlorophyte_ingot",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> Raw_Chlorophyte = ITEMS.register("raw_chlorophyte",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> Jungle_Key = ITEMS.register("jungle_key",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> Chlorophyte_Upgrade_Smithing_Template = ITEMS.register
            ("chlorophyte_upgrade_smithing_template",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> Jungle_Spores = ITEMS.register("jungle_spores",
            () -> new Item(new Item.Properties().food(ModFoods.JUNGLE_SPORES)));


    //Chlorophyte Tools
    public static final RegistryObject<Item> Chlorophyte_Sword = ITEMS.register("chlorophyte_sword",
            () -> new PoisonSwordItem(ModToolTiers.CHLOROPHYTE, 3, -2.4f,
                    new Item.Properties().durability(256).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> Chlorophyte_Pickaxe = ITEMS.register("chlorophyte_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHLOROPHYTE, 1, -2.8f,
                    new Item.Properties().durability(256).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> Chlorophyte_Shovel = ITEMS.register("chlorophyte_shovel",
            () -> new ShovelItem(ModToolTiers.CHLOROPHYTE, 1.5f, -3f,
                    new Item.Properties().durability(256).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> Chlorophyte_Axe = ITEMS.register("chlorophyte_axe",
            () -> new AxeItem(ModToolTiers.CHLOROPHYTE, 5, -3f,
                    new Item.Properties().durability(256).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> Chlorophyte_Hoe = ITEMS.register("chlorophyte_hoe",
            () -> new HoeItem(ModToolTiers.CHLOROPHYTE, -4, 0,
                    new Item.Properties().durability(256).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> Chlorophyte_Helmet = ITEMS.register("chlorophyte_helmet",
            () -> new ModArmorItem(ModArmorMaterials.CHLOROPHYTE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> Chlorophyte_Chestplate = ITEMS.register("chlorophyte_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.CHLOROPHYTE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> Chlorophyte_Leggings = ITEMS.register("chlorophyte_leggings",
            () -> new ModArmorItem(ModArmorMaterials.CHLOROPHYTE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> Chlorophyte_Boots = ITEMS.register("chlorophyte_boots",
            () -> new ModArmorItem(ModArmorMaterials.CHLOROPHYTE, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
