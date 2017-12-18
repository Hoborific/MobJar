package com.hoborific.mobjar.client;

import com.hoborific.mobjar.common.ProxyCommon;
import com.hoborific.mobjar.init.ModBlocks;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

/**
 * Created by hobo on 2/5/2017.
 */
public class ProxyClient extends ProxyCommon {
    public void preInit() {

        super.preInit();

    }

    public void init() {
        ModBlocks.registerRenders();
        super.init();
    }

    public void postInit() {
        super.postInit();
    }
}