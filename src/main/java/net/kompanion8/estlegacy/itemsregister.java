package net.kompanion8.estlegacy;

import net.kompanion8.estlegacy.items.ItemPrivateTool;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class itemsregister {
	public static Item privatetool = new ItemPrivateTool("privatetool", 1);

    public static void register()
    {
        setRegister(privatetool);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender()
    {
        setRender(privatetool);
    }

    private static void setRegister(Item item)
    {
        ForgeRegistries.ITEMS.register(item);
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item item)
    {
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}