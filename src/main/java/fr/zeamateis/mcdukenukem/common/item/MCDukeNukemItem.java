package fr.zeamateis.mcdukenukem.common.item;

import fr.zeamateis.mcdukenukem.MCDukeNukem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MCDukeNukemItem
{

    public static Item dukeThemeDisc;

    public static void preInitItem()
    {
        dukeThemeDisc = new ItemDukeNukemRecords();
        registerItem(dukeThemeDisc);

    }

    public static void initItemRender()
    {
        registerRender(dukeThemeDisc, "dukeThemeDisc");
    }

    private static void registerRender(Item item, String itemName)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
                new ModelResourceLocation(MCDukeNukem.MODID + ":" + itemName, "inventory"));
    }

    private static void registerItem(Item item)
    {
        GameRegistry.register(item);
    }

}
