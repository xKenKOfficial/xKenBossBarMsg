package x.KenKOfficial.BossBar.Utils;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ChatUtil
{
    private static final /* synthetic */ int[] lIIl;
    private static final /* synthetic */ String[] ll;
    
    private static String lIl(final String lIlllIllIllllll, final String IIlllIllIllllll) {
        try {
            final SecretKeySpec IlIIIlllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlllIllIllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.lIIl[8]), "DES");
            final Cipher lIIIIlllIllllll = Cipher.getInstance("DES");
            lIIIIlllIllllll.init(ChatUtil.lIIl[2], IlIIIlllIllllll);
            return new String(lIIIIlllIllllll.doFinal(Base64.getDecoder().decode(lIlllIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIlllIllllll) {
            IIIIIlllIllllll.printStackTrace();
            return null;
        }
    }
    
    private static void llIll() {
        (ll = new String[ChatUtil.lIIl[8]])[ChatUtil.lIIl[0]] = lIl("/mdm5shf5R0=", "ibWhc");
        ChatUtil.ll[ChatUtil.lIIl[1]] = Ill("w4E=", "fvppL");
        ChatUtil.ll[ChatUtil.lIIl[2]] = lll("Zu93je52jIw=", "LUmuB");
        ChatUtil.ll[ChatUtil.lIIl[3]] = Ill("w5U=", "nwdmD");
        ChatUtil.ll[ChatUtil.lIIl[4]] = lIl("nBqyWYidREs=", "agHQN");
        ChatUtil.ll[ChatUtil.lIIl[5]] = Ill("w4E=", "jxReo");
        ChatUtil.ll[ChatUtil.lIIl[6]] = lIl("xlKyTRGmCDc=", "IsEXV");
        ChatUtil.ll[ChatUtil.lIIl[7]] = Ill("fg==", "twPlW");
    }
    
    public static String fixColor(final String lIllIIIIlllllll) {
        return lIllIIIIlllllll.replaceAll(ChatUtil.ll[ChatUtil.lIIl[0]], ChatUtil.ll[ChatUtil.lIIl[1]]).replace(ChatUtil.ll[ChatUtil.lIIl[2]], ChatUtil.ll[ChatUtil.lIIl[3]]).replace(ChatUtil.ll[ChatUtil.lIIl[4]], ChatUtil.ll[ChatUtil.lIIl[5]]).replace(ChatUtil.ll[ChatUtil.lIIl[6]], ChatUtil.ll[ChatUtil.lIIl[7]]);
    }
    
    static {
        IIlll();
        llIll();
    }
    
    private static boolean lIlll(final int lllIlIllIllllll, final int IllIlIllIllllll) {
        return lllIlIllIllllll < IllIlIllIllllll;
    }
    
    private static String lll(final String IIllIlllIllllll, final String lIIlIlllIllllll) {
        try {
            final SecretKeySpec llllIlllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIlllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlllIlllIllllll = Cipher.getInstance("Blowfish");
            IlllIlllIllllll.init(ChatUtil.lIIl[2], llllIlllIllllll);
            return new String(IlllIlllIllllll.doFinal(Base64.getDecoder().decode(IIllIlllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIlllIllllll) {
            lIllIlllIllllll.printStackTrace();
            return null;
        }
    }
    
    private static String Ill(String IIllllllIllllll, final String llIlllllIllllll) {
        IIllllllIllllll = (short)new String(Base64.getDecoder().decode(((String)IIllllllIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllIllllll = new StringBuilder();
        final char[] IlllllllIllllll = llIlllllIllllll.toCharArray();
        int lIllllllIllllll = ChatUtil.lIIl[0];
        final long lllIllllIllllll = (Object)((String)IIllllllIllllll).toCharArray();
        final double IllIllllIllllll = lllIllllIllllll.length;
        short lIlIllllIllllll = (short)ChatUtil.lIIl[0];
        while (lIlll(lIlIllllIllllll, (int)IllIllllIllllll)) {
            final char IlIIIIIIlllllll = lllIllllIllllll[lIlIllllIllllll];
            llllllllIllllll.append((char)(IlIIIIIIlllllll ^ IlllllllIllllll[lIllllllIllllll % IlllllllIllllll.length]));
            "".length();
            ++lIllllllIllllll;
            ++lIlIllllIllllll;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllIllllll);
    }
    
    private static void IIlll() {
        (lIIl = new int[9])[0] = ((26 + 58 - 5 + 126 ^ 33 + 2 + 79 + 25) & (0x4D ^ 0x40 ^ (0xE6 ^ 0xAD) ^ -" ".length()));
        ChatUtil.lIIl[1] = " ".length();
        ChatUtil.lIIl[2] = "  ".length();
        ChatUtil.lIIl[3] = "   ".length();
        ChatUtil.lIIl[4] = (0x66 ^ 0x3B ^ (0xC1 ^ 0x98));
        ChatUtil.lIIl[5] = (0xE ^ 0x56 ^ (0x47 ^ 0x1A));
        ChatUtil.lIIl[6] = (89 + 17 - 57 + 149 ^ 187 + 81 - 105 + 29);
        ChatUtil.lIIl[7] = (0x4A ^ 0x4D);
        ChatUtil.lIIl[8] = (0xA3 ^ 0xAB);
    }
}
