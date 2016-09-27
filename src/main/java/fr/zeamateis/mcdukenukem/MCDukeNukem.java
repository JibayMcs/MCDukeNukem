package fr.zeamateis.mcdukenukem;

import fr.zeamateis.mcdukenukem.common.SoundList;
import fr.zeamateis.mcdukenukem.common.item.MCDukeNukemItem;
import fr.zeamateis.mcdukenukem.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MCDukeNukem.MODID, name = "MCDuke Nukem", version = "InDev")
public class MCDukeNukem
{
    public static final String MODID = "mcdukenukem";

    @SidedProxy(clientSide = "fr.zeamateis.mcdukenukem.proxy.ClientProxy", serverSide = "fr.zeamateis.mcdukenukem.proxy.ServerProxy")
    static CommonProxy         proxy;

    @Instance(MODID)
    private MCDukeNukem        instance;

    public MCDukeNukem getInstance()
    {
        return instance;
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
        SoundList.preInitSound();
        MCDukeNukemItem.preInitItem();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }

}
