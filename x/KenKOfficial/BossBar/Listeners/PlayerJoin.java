package x.KenKOfficial.BossBar.Listeners;

import x.KenKOfficial.BossBar.Api.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.BossBar.Main.*;
import x.KenKOfficial.BossBar.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class PlayerJoin implements Listener
{
    private static /* synthetic */ BossBarApi barAPI;
    private static final /* synthetic */ String[] I;
    private static final /* synthetic */ int[] IIl;
    
    private static void llIl() {
        (IIl = new int[14])[0] = ((0x72 ^ 0x3D) & ~(0x4 ^ 0x4B));
        PlayerJoin.IIl[1] = " ".length();
        PlayerJoin.IIl[2] = "  ".length();
        PlayerJoin.IIl[3] = "   ".length();
        PlayerJoin.IIl[4] = (0x2F ^ 0xE ^ (0x4F ^ 0x6A));
        PlayerJoin.IIl[5] = (0x38 ^ 0x3D);
        PlayerJoin.IIl[6] = (0x77 ^ 0x71);
        PlayerJoin.IIl[7] = (0x9C ^ 0xA6 ^ (0xA0 ^ 0x9D));
        PlayerJoin.IIl[8] = (0x3C ^ 0x34);
        PlayerJoin.IIl[9] = (0xD2 ^ 0x8F ^ (0x7A ^ 0x2E));
        PlayerJoin.IIl[10] = (9 + 143 - 87 + 86 ^ 101 + 86 - 95 + 65);
        PlayerJoin.IIl[11] = (136 + 25 - 97 + 97 ^ 60 + 125 - 42 + 27);
        PlayerJoin.IIl[12] = (0x5B ^ 0x0 ^ (0x11 ^ 0x46));
        PlayerJoin.IIl[13] = (0x7E ^ 0x51 ^ (0x23 ^ 0x1));
    }
    
    public PlayerJoin() {
        PlayerJoin.barAPI.createBar();
    }
    
    private static boolean IIll(final int llIlIlIllllllll) {
        return llIlIlIllllllll == 0;
    }
    
    private static boolean lIll(final int lIllIlIllllllll) {
        return lIllIlIllllllll != 0;
    }
    
    static {
        llIl();
        IlIl();
        PlayerJoin.barAPI = new BossBarApi();
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent IIIlIllllllllll) {
        final Player lllIIllllllllll = IIIlIllllllllll.getPlayer();
        if (IIll(PlayerJoin.barAPI.getBar().getPlayers().contains(lllIIllllllllll) ? 1 : 0)) {
            PlayerJoin.barAPI.addPlayer(lllIIllllllllll);
        }
        if (IIll(Main.getPlugin().getConfig().getBoolean(PlayerJoin.I[PlayerJoin.IIl[0]]) ? 1 : 0) && lIll(lllIIllllllllll.hasPermission(PlayerJoin.I[PlayerJoin.IIl[1]]) ? 1 : 0)) {
            lllIIllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.IIl[2]]));
            lllIIllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.IIl[3]]));
            lllIIllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.IIl[4]]));
            lllIIllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.IIl[5]]));
            lllIIllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.IIl[6]]));
            lllIIllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.IIl[7]]));
            lllIIllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.IIl[8]]));
            lllIIllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.IIl[9]]));
            lllIIllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.IIl[10]]));
            lllIIllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.IIl[11]]));
            lllIIllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.IIl[12]]));
        }
    }
    
    private static String IIIl(final String IIIIlIlllllllll, final String llllIIlllllllll) {
        try {
            final SecretKeySpec llIIlIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIlllllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.IIl[8]), "DES");
            final Cipher IlIIlIlllllllll = Cipher.getInstance("DES");
            IlIIlIlllllllll.init(PlayerJoin.IIl[2], llIIlIlllllllll);
            return new String(IlIIlIlllllllll.doFinal(Base64.getDecoder().decode(IIIIlIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIlllllllll) {
            lIIIlIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void IlIl() {
        (I = new String[PlayerJoin.IIl[13]])[PlayerJoin.IIl[0]] = I("42APbnaptb3hGQd/4hUJwA==", "RoATu");
        PlayerJoin.I[PlayerJoin.IIl[1]] = IIIl("EnipZ8WF4LZvCA6tDtwiINXLADd3+OYtXAJErgDEcQk=", "BiPjF");
        PlayerJoin.I[PlayerJoin.IIl[2]] = IIIl("PXPhEFmn5zLJqUD7t8i35/El9R6cuSdecGrMW35gjWbMWBrxHNmzFxEn2vxDwDAVn+ibqTSUdUE=", "oKcrS");
        PlayerJoin.I[PlayerJoin.IIl[3]] = IIIl("13IUQNwYTuo=", "mGYIY");
        PlayerJoin.I[PlayerJoin.IIl[4]] = IIIl("AGilZNOiQnUTOXMRMvszdeh7YytzSP2j", "wdxWy");
        PlayerJoin.I[PlayerJoin.IIl[5]] = lIIl("", "imWGT");
        PlayerJoin.I[PlayerJoin.IIl[6]] = lIIl("bENmBj84DT41bHRfcWEoNC40KQEDAzcuKSUEPQ==", "LeQGJ");
        PlayerJoin.I[PlayerJoin.IIl[7]] = IIIl("6S+NjfIG4rY=", "cRcBC");
        PlayerJoin.I[PlayerJoin.IIl[8]] = I("sZ1gRPtTRHJkLsrq77xcH0KzSPQgfFlImXSKEFa97lHWoaxKPcoBeIf+kgy78NOH", "crzzQ");
        PlayerJoin.I[PlayerJoin.IIl[9]] = I("w5zVo5OPC78=", "RYmCX");
        PlayerJoin.I[PlayerJoin.IIl[10]] = IIIl("OiJKt39PfhLOML7gjatIiMnuJ8lZ/yN9p7hNMCXegYa3PoBNr0uxKHy8lLVe/P3p", "dBYRm");
        PlayerJoin.I[PlayerJoin.IIl[11]] = I("0FqaN5nNdA4=", "LINum");
        PlayerJoin.I[PlayerJoin.IIl[12]] = I("r+/mTseghtu6WYiDqd+jI1i4HSGg+5RQg9TmZPI/1owNzbbn81P4CFkqPvd9/ZVyn7q9hfcEJE0=", "NfBPs");
    }
    
    private static String lIIl(String llIlllIllllllll, final String IlIlllIllllllll) {
        llIlllIllllllll = (boolean)new String(Base64.getDecoder().decode(((String)llIlllIllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlllllIllllllll = new StringBuilder();
        final char[] lIllllIllllllll = IlIlllIllllllll.toCharArray();
        int IIllllIllllllll = PlayerJoin.IIl[0];
        final float IllIllIllllllll = (Object)((String)llIlllIllllllll).toCharArray();
        final Exception lIlIllIllllllll = (Exception)IllIllIllllllll.length;
        char IIlIllIllllllll = (char)PlayerJoin.IIl[0];
        while (Illl(IIlIllIllllllll, (int)lIlIllIllllllll)) {
            final char lIIIIIlllllllll = IllIllIllllllll[IIlIllIllllllll];
            IlllllIllllllll.append((char)(lIIIIIlllllllll ^ lIllllIllllllll[IIllllIllllllll % lIllllIllllllll.length]));
            "".length();
            ++IIllllIllllllll;
            ++IIlIllIllllllll;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(IlllllIllllllll);
    }
    
    private static String I(final String lIlllIlllllllll, final String IlIllIlllllllll) {
        try {
            final SecretKeySpec IIIIIllllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIllIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllIlllllllll = Cipher.getInstance("Blowfish");
            lllllIlllllllll.init(PlayerJoin.IIl[2], IIIIIllllllllll);
            return new String(lllllIlllllllll.doFinal(Base64.getDecoder().decode(lIlllIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllllIlllllllll) {
            IllllIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean Illl(final int IIIIllIllllllll, final int llllIlIllllllll) {
        return IIIIllIllllllll < llllIlIllllllll;
    }
}
