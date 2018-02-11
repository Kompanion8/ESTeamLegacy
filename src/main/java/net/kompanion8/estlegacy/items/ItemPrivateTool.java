package net.kompanion8.estlegacy.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPrivateTool extends Item {
	public ItemPrivateTool(String name, int maxStackSize) {
		this.setRegistryName(name);
		this.setUnlocalizedName("privatetool");
		this.setMaxStackSize(maxStackSize);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}
}