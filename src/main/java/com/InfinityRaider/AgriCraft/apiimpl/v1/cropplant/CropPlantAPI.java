package com.InfinityRaider.AgriCraft.apiimpl.v1.cropplant;

import com.InfinityRaider.AgriCraft.api.v1.ICropPlant;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

public class CropPlantAPI extends CropPlant {
    private ICropPlant plant;

    public CropPlantAPI(ICropPlant plant) {
        this.plant = plant;
    }

    @Override
    public int tier() {
        return plant.tier();
    }

    @Override
    public ItemStack getSeed() {
        return plant.getSeed();
    }

    @Override
    public ArrayList<ItemStack> getAllFruits() {
        return plant.getAllFruits();
    }

    @Override
    public ItemStack getRandomFruit(Random rand) {
        return plant.getRandomFruit(rand);
    }

    @Override
    public ArrayList<ItemStack> getFruitsOnHarvest(int gain, Random rand) {
        return plant.getFruitsOnHarvest(gain, rand);
    }

    @Override
    public boolean canBonemeal() {
        return plant.canBonemeal();
    }

    @Override
    public boolean onAllowedGrowthTick(World world, int x, int y, int z, int oldGrowthStage) {
        return plant.onAllowedGrowthTick(world, x, y, z, oldGrowthStage);
    }

    @Override
    public boolean isFertile(World world, int x, int y, int z) {
        return plant.isFertile(world, x, y, z);
    }

    @Override
    public float getHeight(int meta) {
        return plant.getHeight(meta);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getPlantIcon(int growthStage) {
        return plant.getPlantIcon(growthStage);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean renderAsFlower() {
        return plant.renderAsFlower();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getInformation() {
        return plant.getInformation();
    }
}