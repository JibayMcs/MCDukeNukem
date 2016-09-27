package fr.zeamateis.mcdukenukem.common;

import fr.zeamateis.mcdukenukem.MCDukeNukem;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author jglrxavpok
 */
public class SoundList
{
    public static SoundEvent dukeTheme;

    public static void preInitSound()
    {
        dukeTheme = registerSound(new ResourceLocation(MCDukeNukem.MODID, "records.duketheme"));
    }

    private static SoundEvent registerSound(ResourceLocation location)
    {
        return GameRegistry.register(new SoundEvent(location).setRegistryName(location));
    }

}
