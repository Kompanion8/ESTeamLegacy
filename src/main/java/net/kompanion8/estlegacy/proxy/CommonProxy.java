package net.kompanion8.estlegacy.proxy;

import net.kompanion8.estlegacy.itemsregister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
    	itemsregister.register();
    }
    public void init(FMLInitializationEvent event) {
    }
    public void postInit(FMLPostInitializationEvent event) {}
}