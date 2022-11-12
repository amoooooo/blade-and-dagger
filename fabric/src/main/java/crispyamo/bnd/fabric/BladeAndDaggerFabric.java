package crispyamo.bnd.fabric;

import crispyamo.bnd.BladeAndDagger;
import net.fabricmc.api.ModInitializer;

public class BladeAndDaggerFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        BladeAndDagger.init();
    }
}