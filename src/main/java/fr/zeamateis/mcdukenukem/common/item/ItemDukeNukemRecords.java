package fr.zeamateis.mcdukenukem.common.item;

import fr.zeamateis.mcdukenukem.MCDukeNukem;
import fr.zeamateis.mcdukenukem.common.SoundList;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;

public class ItemDukeNukemRecords extends ItemRecord
{
    public ItemDukeNukemRecords()
    {
        super("duketheme", SoundList.dukeTheme);
        this.setCreativeTab(CreativeTabs.MISC);
        this.setUnlocalizedName("dukeThemeDisc");
        this.setRegistryName(MCDukeNukem.MODID, "dukeThemeDisc");
    }

    @Override
    public ResourceLocation getRecordResource(String name)
    {
        return new ResourceLocation(MCDukeNukem.MODID, name);
    }
}
