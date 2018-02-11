package net.kompanion8.estlegacy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.kompanion8.estlegacy.proxy.CommonProxy;

@Mod(modid = main.MODID, name = main.NAME, version = main.VERSION, acceptedMinecraftVersions = "[1.12]")
public class main
{
    public static final String MODID = "estlegacy";
    public static final String NAME = "ESTeam Legacy";
    public static final String VERSION = "1.0.0";

   	@SidedProxy(clientSide = "net.kompanion8.estlegacy.proxy.ClientProxy", serverSide = "net.kompanion8.estlegacy.proxy.CommonProxy")
   	public static CommonProxy proxy;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}