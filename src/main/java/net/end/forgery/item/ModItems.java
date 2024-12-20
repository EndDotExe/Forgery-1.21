package net.end.forgery.item;

import net.end.forgery.Forgery;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

// All the items in the mod & their properties
public class ModItems {
    // Smithing templates
    public static final Item SMITHING_TEMPLATE_EX = registerItem("smithing_template_ex", new net.end.forgery.item.custom.ModSmithingTemplateItem (new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SMITHING_TEMPLATE_PH = registerItem("smithing_template_ph", new net.end.forgery.item.custom.ModSmithingTemplateItem (new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item SMITHING_TEMPLATE_GC = registerItem("smithing_template_gc", new net.end.forgery.item.custom.ModSmithingTemplateItem (new Item.Settings().rarity(Rarity.RARE)));
    public static final Item SMITHING_TEMPLATE_WI = registerItem("smithing_template_wi", new net.end.forgery.item.custom.ModSmithingTemplateItem (new Item.Settings().rarity(Rarity.RARE)));
    public static final Item SMITHING_TEMPLATE_FL = registerItem("smithing_template_fl", new net.end.forgery.item.custom.ModSmithingTemplateItem (new Item.Settings().rarity(Rarity.EPIC)));
    // Pickaxes
    public static final Item LAPIS_EXCAVATOR_PICKAXE = registerItem("lapis_excavator_pickaxe", (new net.end.forgery.item.custom.VeinminerToolItemTwo(ModToolMaterials.FORGERY_VEINMINER, 1, 2.8F, (new Item.Settings()).rarity(Rarity.EPIC))));
    public static final Item AMETHYST_EXCAVATOR_PICKAXE = registerItem("amethyst_excavator_pickaxe", (new net.end.forgery.item.custom.BlockInteractionRangeTool(ModToolMaterials.FORGERY_UPGRADED, (new Item.Settings()).rarity(Rarity.EPIC).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.FORGERY_UPGRADED, 1.0F, -2.8F )))));
    public static final Item REDSTONE_EXCAVATOR_PICKAXE = registerItem("redstone_excavator_pickaxe", (new net.minecraft.item.PickaxeItem(ModToolMaterials.FORGERY_INSTATOOL, (new Item.Settings()).rarity(Rarity.EPIC).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.FORGERY_UPGRADED, 1.0F, -2.8F )))));
    public static final Item EMERALD_EXCAVATOR_PICKAXE = registerItem("emerald_excavator_pickaxe", new net.end.forgery.item.custom.FortuneToolItem(ModToolMaterials.FORGERY_UPGRADED, 3, new Item.Settings().rarity(Rarity.EPIC).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.FORGERY_UPGRADED, 1.0F, -2.8F))));
    // Swords
    public static final Item BLIGHTED_BLADE = registerItem("blighted_blade", (new net.end.forgery.item.custom.PoisonSwordItem(ModToolMaterials.FORGERY_UPGRADED, (new Item.Settings()).rarity(Rarity.RARE).attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.FORGERY_UPGRADED, 3, -1.5F)))));
    public static final Item FRIGID_FLAMBERGE = registerItem("frigid_flamberge", (new net.end.forgery.item.custom.SlownessSwordItem(ModToolMaterials.FORGERY_UPGRADED, (new Item.Settings()).rarity(Rarity.RARE).attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.FORGERY_UPGRADED, 6, -1.8F)))));
    public static final Item EDGE_OF_FRAILTY = registerItem("edge_of_frailty", (new net.end.forgery.item.custom.WeaknessSwordItem(ModToolMaterials.FORGERY_UPGRADED, (new Item.Settings()).rarity(Rarity.RARE).attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.FORGERY_UPGRADED, 9, -3.0F)))));
    public static final Item TERRA_BLADE = registerItem("terra_blade", (new net.minecraft.item.SwordItem(ModToolMaterials.FORGERY_UPGRADED, (new Item.Settings()).rarity(Rarity.RARE).attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.FORGERY_UPGRADED, 80, -1.8F)))));
    // Tridents
    public static final Item ECHO_TRIDENT = registerItem("echo_trident", (new TridentItem(new Item.Settings().rarity(Rarity.EPIC).maxDamage(300).attributeModifiers(TridentItem.createAttributeModifiers()).component(DataComponentTypes.TOOL, TridentItem.createToolComponent()))));
    public static final Item COPPER_TRIDENT = registerItem("copper_trident", (new TridentItem(new Item.Settings().rarity(Rarity.EPIC).maxDamage(300).attributeModifiers(TridentItem.createAttributeModifiers()).component(DataComponentTypes.TOOL, TridentItem.createToolComponent()))));
    // Shields
    public static final Item NETHERITE_SHIELD = registerItem("netherite_shield", (new net.minecraft.item.ShieldItem (new Item.Settings().rarity(Rarity.UNCOMMON))));
    public static final Item GOLD_SHIELD = registerItem("goldshield", (new net.end.forgery.item.custom.KnockbackShieldItem (new Item.Settings().rarity(Rarity.UNCOMMON))));
    public static final Item BLAZE_SHIELD = registerItem("blaze_shield", (new net.end.forgery.item.custom.BlazeShieldItem (new Item.Settings().rarity(Rarity.UNCOMMON))));
    // Bows
    public static final Item ENDER_BOW = registerItem("ender_bow", (new net.minecraft.item.BowItem (new Item.Settings().maxDamage(400).rarity(Rarity.EPIC))));
    public static final Item SWIRLING_WINDS = registerItem("swirling_winds", (new net.end.forgery.item.custom.BreezeBowItem (new Item.Settings().maxDamage(450).rarity(Rarity.EPIC))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Forgery.MOD_ID, name), item);
    }

// Adding items to their respective item groups
    public static void registerModItems() {
        Forgery.LOGGER.info("Registering Mod Items for " + Forgery.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {

            entries.add(LAPIS_EXCAVATOR_PICKAXE);
            entries.add(AMETHYST_EXCAVATOR_PICKAXE);
            entries.add(REDSTONE_EXCAVATOR_PICKAXE);
            entries.add(EMERALD_EXCAVATOR_PICKAXE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(BLIGHTED_BLADE);
            entries.add(FRIGID_FLAMBERGE);
            entries.add(EDGE_OF_FRAILTY);
            entries.add(TERRA_BLADE);

            entries.add(ECHO_TRIDENT);
            entries.add(COPPER_TRIDENT);

            entries.add(NETHERITE_SHIELD);
            entries.add(GOLD_SHIELD);
            entries.add(BLAZE_SHIELD);

            entries.add(ENDER_BOW);
            entries.add(SWIRLING_WINDS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SMITHING_TEMPLATE_EX);
            entries.add(SMITHING_TEMPLATE_PH);
            entries.add(SMITHING_TEMPLATE_GC);
            entries.add(SMITHING_TEMPLATE_WI);
            entries.add(SMITHING_TEMPLATE_FL);
        });

    }
}

