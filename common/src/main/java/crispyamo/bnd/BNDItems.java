package crispyamo.bnd;

import crispyamo.bnd.item.Halberd;
import crispyamo.bnd.item.Longbow;
import crispyamo.bnd.item.Scythe;
import crispyamo.bnd.item.Spear;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.Registries;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

import java.util.function.Supplier;

public class BNDItems {
    private static final Registrar<Item> REGISTRY = Registries.get(BladeAndDagger.MOD_ID).get(Registry.ITEM_REGISTRY);

    public static final RegistrySupplier<Item> GOLDEN_HALBERD = REGISTRY.register(new ResourceLocation(BladeAndDagger.MOD_ID, "golden_halberd"), () -> new Halberd(Tiers.GOLD, 5, 0.8f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> LONGBOW = REGISTRY.register(new ResourceLocation(BladeAndDagger.MOD_ID, "longbow"), () -> new Longbow(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> SPEAR = REGISTRY.register(new ResourceLocation(BladeAndDagger.MOD_ID, "spear"), () -> new Spear(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> SCYTHE = REGISTRY.register(new ResourceLocation(BladeAndDagger.MOD_ID, "scythe"), () -> new Scythe(Tiers.IRON, 5, 0.8f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));


    public static void init(){

    }
}
