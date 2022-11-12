package crispyamo.bnd.forge;

import dev.architectury.platform.forge.EventBuses;
import crispyamo.bnd.BladeAndDagger;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BladeAndDagger.MOD_ID)
public class BladeAndDaggerForge {
    public BladeAndDaggerForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(BladeAndDagger.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        BladeAndDagger.init();
    }
}