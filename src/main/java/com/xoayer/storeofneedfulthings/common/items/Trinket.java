package com.xoayer.storeofneedfulthings.common.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class Trinket extends Item {

    public Trinket(Properties properties) {
        super(properties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.appendHoverText(stack, world, tooltip, flagIn);

        if (InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
            tooltip.add(new StringTextComponent("Advanced info"));
            //"the " + "\u00A77" + " shift " + "\u00A7e" + "key is pressed!"
        } else {
            tooltip.add(new TranslationTextComponent("tooltip.storeofneedfulthings.trinket.hold_shift") );
        }
    }

    @Override
    public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        playerIn.addEffect(new EffectInstance(Effects.JUMP, 20, 3, false, false, false));
            ZombieEntity zomb = new ZombieEntity(worldIn);
            zomb.setPos(playerIn.getX(), playerIn.getY(), playerIn.getZ());
            worldIn.addFreshEntity(zomb);
        return ActionResult.success(playerIn.getItemInHand(handIn));
    }
}
