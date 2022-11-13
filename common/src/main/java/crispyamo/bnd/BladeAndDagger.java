package crispyamo.bnd;

import crispyamo.bnd.util.BNDItemProperties;

public class BladeAndDagger {
    public static final String MOD_ID = "bnd";

    public static void init() {
        BNDItems.init();
    }

    private void clientSetup() {
        BNDItemProperties.addCustomItemProperties();
    }
}