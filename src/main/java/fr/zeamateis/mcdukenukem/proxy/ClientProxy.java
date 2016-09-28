package fr.zeamateis.mcdukenukem.proxy;

import fr.zeamateis.mcdukenukem.client.event.ClientEventHandler;
import fr.zeamateis.mcdukenukem.common.item.MCDukeNukemItem;

import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit()
    {
    }

    @Override
    public void init()
    {
        MCDukeNukemItem.initItemRender();
        MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
    }

    @Override
    public void postInit()
    {

    }
}
