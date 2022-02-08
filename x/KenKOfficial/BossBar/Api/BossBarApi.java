package x.KenKOfficial.BossBar.Api;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import x.KenKOfficial.BossBar.Main.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import org.bukkit.scheduler.*;
import java.util.*;
import x.KenKOfficial.BossBar.Utils.*;
import org.bukkit.plugin.*;
import org.bukkit.boss.*;

public class BossBarApi
{
    private static final /* synthetic */ String bossbar_Color;
    private static final /* synthetic */ int[] IIIl;
    private /* synthetic */ int taskID;
    private static final /* synthetic */ String[] lll;
    private /* synthetic */ BossBar bar;
    private static final /* synthetic */ String bossbar_Style;
    private static final /* synthetic */ String first_message;
    
    private static String IllIl(final String llIllIIIlllllll, final String IlIllIIIlllllll) {
        try {
            final SecretKeySpec IllllIIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIllIIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIlllIIIlllllll = Cipher.getInstance("Blowfish");
            lIlllIIIlllllll.init(BossBarApi.IIIl[3], IllllIIIlllllll);
            return new String(lIlllIIIlllllll.doFinal(Base64.getDecoder().decode(llIllIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlllIIIlllllll) {
            IIlllIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    public void setTaskID(final int llIlIIlIlllllll) {
        this.taskID = llIlIIlIlllllll;
    }
    
    private static String lllIl(final String IlllllIIlllllll, final String lIllllIIlllllll) {
        try {
            final SecretKeySpec llIIIIlIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllIIlllllll.getBytes(StandardCharsets.UTF_8)), BossBarApi.IIIl[6]), "DES");
            final Cipher IlIIIIlIlllllll = Cipher.getInstance("DES");
            IlIIIIlIlllllll.init(BossBarApi.IIIl[3], llIIIIlIlllllll);
            return new String(IlIIIIlIlllllll.doFinal(Base64.getDecoder().decode(IlllllIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIlIlllllll) {
            lIIIIIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIll();
        IIIll();
        first_message = Main.getPlugin().getConfig().getString(BossBarApi.lll[BossBarApi.IIIl[2]]);
        bossbar_Color = Main.getPlugin().getConfig().getString(BossBarApi.lll[BossBarApi.IIIl[3]]);
        bossbar_Style = Main.getPlugin().getConfig().getString(BossBarApi.lll[BossBarApi.IIIl[4]]);
    }
    
    public void addPlayer(final Player IIIIIllIlllllll) {
        this.bar.addPlayer(IIIIIllIlllllll);
    }
    
    private static void lIIll() {
        (IIIl = new int[7])[0] = -" ".length();
        BossBarApi.IIIl[1] = ((0xDD ^ 0xC3) & ~(0x35 ^ 0x2B));
        BossBarApi.IIIl[2] = " ".length();
        BossBarApi.IIIl[3] = "  ".length();
        BossBarApi.IIIl[4] = "   ".length();
        BossBarApi.IIIl[5] = (0xAE ^ 0xAA);
        BossBarApi.IIIl[6] = (0x1C ^ 0x14);
    }
    
    public int getTaskID() {
        return this.taskID;
    }
    
    private static void IIIll() {
        (lll = new String[BossBarApi.IIIl[5]])[BossBarApi.IIIl[1]] = lIlIl("DwEXKxoMHEovEQwKCzUXHg0N", "mndXx");
        BossBarApi.lll[BossBarApi.IIIl[2]] = IllIl("MqT1mM0vBQkhQ5itF3N2dM8pGWPDyT/C", "dZQde");
        BossBarApi.lll[BossBarApi.IIIl[3]] = lIlIl("BTYiHDYGKw4MOws2Iw==", "gYQoT");
        BossBarApi.lll[BossBarApi.IIIl[4]] = lllIl("X2UAmjuk19oZbBkVGB47zw==", "yOogP");
    }
    
    public BossBar getBar() {
        return this.bar;
    }
    
    public void cast() {
        final List<String> IllIlIlIlllllll = (List<String>)Main.getPlugin().getConfig().getStringList(BossBarApi.lll[BossBarApi.IIIl[1]]);
        this.setTaskID(Bukkit.getScheduler().scheduleAsyncRepeatingTask((Plugin)Main.getPlugin(), (Runnable)new BukkitRunnable() {
            /* synthetic */ int i = BossBarApi$1.Il[1];
            /* synthetic */ double progress = 1.0;
            private static final /* synthetic */ int[] Il;
            /* synthetic */ double time = 0.03333333333333333;
            /* synthetic */ int count = BossBarApi$1.Il[0];
            
            private static void l() {
                (Il = new int[3])[0] = -" ".length();
                BossBarApi$1.Il[1] = ((0x70 ^ 0x56) & ~(0x63 ^ 0x45));
                BossBarApi$1.Il[2] = " ".length();
            }
            
            static {
                l();
            }
            
            private static int Il(final double n, final double n2) {
                return dcmpg(n, n2);
            }
            
            public void run() {
                BossBarApi.this.bar.setProgress(this.progress);
                switch (this.count) {
                    case -1: {
                        "".length();
                        if ((0xC4 ^ 0xC0) <= ((0x74 ^ 0x56) & ~(0x63 ^ 0x41))) {
                            return;
                        }
                        break;
                    }
                    case 0: {
                        if (ll(this.i, IllIlIlIlllllll.size())) {
                            BossBarApi.this.bar.setColor(BarColor.valueOf(BossBarApi.bossbar_Color));
                            BossBarApi.this.bar.setTitle(ChatUtil.fixColor(IllIlIlIlllllll.get(this.i)));
                            this.i += BossBarApi$1.Il[2];
                            "".length();
                            if ("   ".length() <= "  ".length()) {
                                return;
                            }
                            break;
                        }
                        else {
                            this.i = BossBarApi$1.Il[1];
                            "".length();
                            if (-(0xA5 ^ 0xA0) >= 0) {
                                return;
                            }
                            break;
                        }
                        break;
                    }
                    case 1: {
                        "".length();
                        if (((35 + 71 + 46 + 3 ^ 94 + 24 - 50 + 88) & (0xAA ^ 0x9A ^ (0x74 ^ 0x43) ^ -" ".length())) >= " ".length()) {
                            return;
                        }
                        break;
                    }
                    default: {
                        BossBarApi.this.bar.setColor(BarColor.valueOf(BossBarApi.bossbar_Color));
                        BossBarApi.this.bar.setTitle(ChatUtil.fixColor(BossBarApi.first_message));
                        this.count = BossBarApi$1.Il[0];
                        break;
                    }
                }
                this.progress -= this.time;
                if (IIl(Il(this.progress, 0.0))) {
                    this.count += BossBarApi$1.Il[2];
                    this.progress = 1.0;
                }
            }
            
            private static boolean IIl(final int llllIllllllllll) {
                return llllIllllllllll <= 0;
            }
            
            private static boolean ll(final int IlIIlllllllllll, final int lIIIlllllllllll) {
                return IlIIlllllllllll < lIIIlllllllllll;
            }
        }, 0L, 20L));
    }
    
    public BossBarApi() {
        this.taskID = BossBarApi.IIIl[0];
    }
    
    private static String lIlIl(String llIlIlIIlllllll, final String llllIlIIlllllll) {
        llIlIlIIlllllll = (long)new String(Base64.getDecoder().decode(((String)llIlIlIIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlllIlIIlllllll = new StringBuilder();
        final char[] lIllIlIIlllllll = llllIlIIlllllll.toCharArray();
        int IIllIlIIlllllll = BossBarApi.IIIl[1];
        final short IllIIlIIlllllll = (Object)((String)llIlIlIIlllllll).toCharArray();
        final String lIlIIlIIlllllll = (String)IllIIlIIlllllll.length;
        long IIlIIlIIlllllll = BossBarApi.IIIl[1];
        while (IlIll((int)IIlIIlIIlllllll, (int)lIlIIlIIlllllll)) {
            final char lIIIllIIlllllll = IllIIlIIlllllll[IIlIIlIIlllllll];
            IlllIlIIlllllll.append((char)(lIIIllIIlllllll ^ lIllIlIIlllllll[IIllIlIIlllllll % lIllIlIIlllllll.length]));
            "".length();
            ++IIllIlIIlllllll;
            ++IIlIIlIIlllllll;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(IlllIlIIlllllll);
    }
    
    private static boolean IlIll(final int llIIlIIIlllllll, final int IlIIlIIIlllllll) {
        return llIIlIIIlllllll < IlIIlIIIlllllll;
    }
    
    public void createBar() {
        this.bar = Bukkit.createBossBar(ChatUtil.fixColor(BossBarApi.first_message), BarColor.valueOf(BossBarApi.bossbar_Color), BarStyle.valueOf(BossBarApi.bossbar_Style), new BarFlag[BossBarApi.IIIl[1]]);
        this.bar.setVisible((boolean)(BossBarApi.IIIl[2] != 0));
        this.cast();
    }
}
