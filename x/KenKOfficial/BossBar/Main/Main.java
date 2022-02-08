package x.KenKOfficial.BossBar.Main;

import org.bukkit.plugin.java.*;
import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.*;
import x.KenKOfficial.BossBar.Listeners.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;

public class Main extends JavaPlugin
{
    private static final /* synthetic */ int[] Ill;
    private static /* synthetic */ Main plugin;
    private static final /* synthetic */ String[] lIl;
    
    private static void llIIl() {
        (Ill = new int[14])[0] = ((0x2F ^ 0x7) & ~(0x45 ^ 0x6D));
        Main.Ill[1] = " ".length();
        Main.Ill[2] = "  ".length();
        Main.Ill[3] = "   ".length();
        Main.Ill[4] = (0x47 ^ 0x43);
        Main.Ill[5] = (0xBE ^ 0xBB);
        Main.Ill[6] = (0x85 ^ 0x83);
        Main.Ill[7] = (0x10 ^ 0x17);
        Main.Ill[8] = (0xBC ^ 0xB4);
        Main.Ill[9] = (125 + 22 - 125 + 124 ^ 151 + 63 - 78 + 19);
        Main.Ill[10] = (0x52 ^ 0x15 ^ (0x63 ^ 0x2E));
        Main.Ill[11] = (16 + 64 - 4 + 75 ^ 154 + 41 - 112 + 73);
        Main.Ill[12] = (0x64 ^ 0x68);
        Main.Ill[13] = (0xA3 ^ 0xAE);
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        System.out.println(Main.lIl[Main.Ill[6]]);
        System.out.println(Main.lIl[Main.Ill[7]]);
        System.out.println(Main.lIl[Main.Ill[8]]);
        System.out.println(Main.lIl[Main.Ill[9]]);
        System.out.println(Main.lIl[Main.Ill[10]]);
        System.out.println(Main.lIl[Main.Ill[11]]);
    }
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerListeners();
        System.out.println(Main.lIl[Main.Ill[0]]);
        System.out.println(Main.lIl[Main.Ill[1]]);
        System.out.println(Main.lIl[Main.Ill[2]]);
        System.out.println(Main.lIl[Main.Ill[3]]);
        System.out.println(Main.lIl[Main.Ill[4]]);
        System.out.println(Main.lIl[Main.Ill[5]]);
    }
    
    private static String llll(String lIlIlllIlllllll, final String lIIllllIlllllll) {
        lIlIlllIlllllll = new String(Base64.getDecoder().decode(lIlIlllIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIllllIlllllll = new StringBuilder();
        final char[] lllIlllIlllllll = lIIllllIlllllll.toCharArray();
        int IllIlllIlllllll = Main.Ill[0];
        final String IIIIlllIlllllll = (Object)lIlIlllIlllllll.toCharArray();
        final byte llllIllIlllllll = (byte)IIIIlllIlllllll.length;
        byte IlllIllIlllllll = (byte)Main.Ill[0];
        while (IIlIl(IlllIllIlllllll, llllIllIlllllll)) {
            final char llIllllIlllllll = IIIIlllIlllllll[IlllIllIlllllll];
            IIIllllIlllllll.append((char)(llIllllIlllllll ^ lllIlllIlllllll[IllIlllIlllllll % lllIlllIlllllll.length]));
            "".length();
            ++IllIlllIlllllll;
            ++IlllIllIlllllll;
            "".length();
            if (("   ".length() & ~"   ".length()) != 0x0) {
                return null;
            }
        }
        return String.valueOf(IIIllllIlllllll);
    }
    
    private static boolean IIlIl(final int IlIlIllIlllllll, final int lIIlIllIlllllll) {
        return IlIlIllIlllllll < lIIlIllIlllllll;
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    private static String IIIIl(final String lllIlIIllllllll, final String IllIlIIllllllll) {
        try {
            final SecretKeySpec IlIllIIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIlIIllllllll.getBytes(StandardCharsets.UTF_8)), Main.Ill[8]), "DES");
            final Cipher lIIllIIllllllll = Cipher.getInstance("DES");
            lIIllIIllllllll.init(Main.Ill[2], IlIllIIllllllll);
            return new String(lIIllIIllllllll.doFinal(Base64.getDecoder().decode(lllIlIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIllIIllllllll) {
            IIIllIIllllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIl();
        IlIIl();
    }
    
    public void registerListeners() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.lIl[Main.Ill[12]]).append(this.getName())));
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
    
    private static String lIIIl(final String IlIlIIIllllllll, final String lllIIIIllllllll) {
        try {
            final SecretKeySpec lIllIIIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIllIIIllllllll = Cipher.getInstance("Blowfish");
            IIllIIIllllllll.init(Main.Ill[2], lIllIIIllllllll);
            return new String(IIllIIIllllllll.doFinal(Base64.getDecoder().decode(IlIlIIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIIllllllll) {
            llIlIIIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void IlIIl() {
        (lIl = new String[Main.Ill[13]])[Main.Ill[0]] = llll("b0tIYGtvS0hga29LSGBrb0tIYGtvS0hga29LSGBrb0tIYGtvS0hga29LSGBrb0tIYGtvS0hga29LSGA=", "LhkCH");
        Main.lIl[Main.Ill[1]] = IIIIl("wYd9wEgfXKKJ/rCXNJFAmQ==", "tkcMO");
        Main.lIl[Main.Ill[2]] = IIIIl("8WtiEef4r/btWwnZVuNz9Nt+3QT+QWPH", "TnFLR");
        Main.lIl[Main.Ill[3]] = llll("ODsOMyMWJxskLVg=", "yPzJT");
        Main.lIl[Main.Ill[4]] = IIIIl("ya8qWd7+FeKVDk3Kj4Q+hgaU6DLvKIOTVPTmlWR59kmEmJAnGYg+qtc6oUfxB7HEXI71YV15rNr8aCSa3+1FVg==", "LqAcG");
        Main.lIl[Main.Ill[5]] = IIIIl("6ascN8PTpK3pqxw3w9OkremrHDfD06St6ascN8PTpK3pqxw3w9OkremrHDfD06St6ascN8PTpK2riBo2yEmnkA==", "cUsSs");
        Main.lIl[Main.Ill[6]] = lIIIl("TcCPYlLiaT9NwI9iUuJpP03Aj2JS4mk/TcCPYlLiaT9NwI9iUuJpP03Aj2JS4mk/TcCPYlLiaT/xuvRqdDRzPA==", "WFHky");
        Main.lIl[Main.Ill[7]] = llll("NA0PLDQjNRkAFz4LGSU=", "LFjBv");
        Main.lIl[Main.Ill[8]] = lIIIl("FopYQHpJlejdkN6lKkml1uZUL2ioTBZ2", "qIDGQ");
        Main.lIl[Main.Ill[9]] = IIIIl("DfoNqxH9gQwLLWKrpDGcSg==", "hxnwQ");
        Main.lIl[Main.Ill[10]] = lIIIl("2ikufqNDSYovO32ZaHHKV7SvmXkLy9Q3+k1sFrLmkfcnDvt4gjTPtdXe5KHyffibSon8rdK+qUbbpyeGhz7gBw==", "mkSVO");
        Main.lIl[Main.Ill[11]] = lIIIl("QMTcd7ngHYdAxNx3ueAdh0DE3He54B2HQMTcd7ngHYdAxNx3ueAdh0DE3He54B2HQMTcd7ngHYdXuF/DEYn0QQ==", "wdTiW");
        Main.lIl[Main.Ill[12]] = lIIIl("wsaktHireHAV52NUrlEwtoG2HzmUEOwSPGu84idm1t8=", "PmjZa");
    }
}
