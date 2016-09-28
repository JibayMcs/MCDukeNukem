package fr.zeamateis.mcdukenukem.client.event;

import fr.zeamateis.mcdukenukem.client.render.DukeNukemHUDRenderer;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientEventHandler
{
    private DukeNukemHUDRenderer dukeNukemHudRenderer;

    public ClientEventHandler()
    {
        dukeNukemHudRenderer = new DukeNukemHUDRenderer();
    }

    @SubscribeEvent
    public void onOverlayPreRender(RenderGameOverlayEvent.Pre event)
    {
        float verticalOffset = 0;
        if (event.getType() == RenderGameOverlayEvent.ElementType.HOTBAR)
        {
            verticalOffset = dukeNukemHudRenderer.draw(event.getResolution(), event.getPartialTicks());
            event.setCanceled(true);
        }

        switch (event.getType())
        {
            case ARMOR:
            case EXPERIENCE:
            case HEALTH:
            case HOTBAR:
                event.setCanceled(true);
        }
    }
}