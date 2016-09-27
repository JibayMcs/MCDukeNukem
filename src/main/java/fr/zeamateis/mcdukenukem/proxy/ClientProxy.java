package fr.zeamateis.mcdukenukem.proxy;

import fr.zeamateis.mcdukenukem.common.item.MCDukeNukemItem;

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
    }

    @Override
    public void postInit()
    {

    }
}
