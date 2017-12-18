package com.hoborific.mobjar;


import com.hoborific.mobjar.common.ProxyCommon;
import com.hoborific.mobjar.init.ModBlocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MobJar.MODID, version = MobJar.VERSION)
public class MobJar
{
    public static final String MODID = "mobjar";
    public static final String VERSION = "1.0";

    @Mod.Instance(MODID)
    public static MobJar instance;

    @SidedProxy(clientSide = "com.hoborific.mobjar.client.ProxyClient", serverSide = "com.hoborific.mobjar.ProxySerb")
    public static ProxyCommon proxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ModBlocks.init();
        proxy.preInit();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
        // some example code
        instance = this;
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }



}
