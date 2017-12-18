package com.hoborific.mobjar.items;

import com.hoborific.mobjar.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ItemJar extends Item {

    public ItemJar(){
        setUnlocalizedName(Reference.MobJarItems.JAR.getUnlocalizedName());
        setRegistryName(Reference.MobJarItems.JAR.getRegistryName());
    }
}
