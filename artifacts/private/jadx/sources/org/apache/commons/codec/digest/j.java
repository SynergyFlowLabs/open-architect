package org.apache.commons.codec.digest;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f335270a = 5000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f335271b = 999999999;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f335272c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f335273d = "rounds=";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f335274e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f335275f = "$5$";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f335276g = 64;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f335277h = "$6$";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f335278i = Pattern.compile("^\\$([56])\\$(rounds=(\\d+)\\$)?([\\.\\/a-zA-Z0-9]{1,16}).*");

    public static String a(byte[] bArr) {
        return b(bArr, null);
    }

    public static String b(byte[] bArr, String str) {
        if (str == null) {
            str = f335275f + a.b(8);
        }
        return c(bArr, str, f335275f, 32, g.f335251e);
    }

    private static String c(byte[] bArr, String str, String str2, int i10, String str3) {
        int iMax;
        boolean z10;
        int length = bArr.length;
        if (str == null) {
            throw new IllegalArgumentException("Salt must not be null");
        }
        Matcher matcher = f335278i.matcher(str);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Invalid salt value: " + str);
        }
        if (matcher.group(3) != null) {
            iMax = Math.max(1000, Math.min(999999999, Integer.parseInt(matcher.group(3))));
            z10 = true;
        } else {
            iMax = 5000;
            z10 = false;
        }
        String strGroup = matcher.group(4);
        byte[] bytes = strGroup.getBytes(nk.d.f333413f);
        int length2 = bytes.length;
        MessageDigest messageDigestO = c.o(str3);
        messageDigestO.update(bArr);
        messageDigestO.update(bytes);
        MessageDigest messageDigestO2 = c.o(str3);
        messageDigestO2.update(bArr);
        messageDigestO2.update(bytes);
        messageDigestO2.update(bArr);
        byte[] bArrDigest = messageDigestO2.digest();
        int length3 = bArr.length;
        while (length3 > i10) {
            messageDigestO.update(bArrDigest, 0, i10);
            length3 -= i10;
        }
        messageDigestO.update(bArrDigest, 0, length3);
        for (int length4 = bArr.length; length4 > 0; length4 >>= 1) {
            if ((length4 & 1) != 0) {
                messageDigestO.update(bArrDigest, 0, i10);
            } else {
                messageDigestO.update(bArr);
            }
        }
        byte[] bArrDigest2 = messageDigestO.digest();
        MessageDigest messageDigestO3 = c.o(str3);
        for (int i11 = 1; i11 <= length; i11++) {
            messageDigestO3.update(bArr);
        }
        byte[] bArrDigest3 = messageDigestO3.digest();
        byte[] bArr2 = new byte[length];
        int i12 = 0;
        while (i12 < length - i10) {
            System.arraycopy(bArrDigest3, 0, bArr2, i12, i10);
            i12 += i10;
        }
        System.arraycopy(bArrDigest3, 0, bArr2, i12, length - i12);
        MessageDigest messageDigestO4 = c.o(str3);
        for (int i13 = 1; i13 <= (bArrDigest2[0] & 255) + 16; i13++) {
            messageDigestO4.update(bytes);
        }
        byte[] bArrDigest4 = messageDigestO4.digest();
        byte[] bArr3 = new byte[length2];
        int i14 = 0;
        while (i14 < length2 - i10) {
            System.arraycopy(bArrDigest4, 0, bArr3, i14, i10);
            i14 += i10;
        }
        System.arraycopy(bArrDigest4, 0, bArr3, i14, length2 - i14);
        for (int i15 = 0; i15 <= iMax - 1; i15++) {
            messageDigestO = c.o(str3);
            int i16 = i15 & 1;
            if (i16 != 0) {
                messageDigestO.update(bArr2, 0, length);
            } else {
                messageDigestO.update(bArrDigest2, 0, i10);
            }
            if (i15 % 3 != 0) {
                messageDigestO.update(bArr3, 0, length2);
            }
            if (i15 % 7 != 0) {
                messageDigestO.update(bArr2, 0, length);
            }
            if (i16 != 0) {
                messageDigestO.update(bArrDigest2, 0, i10);
            } else {
                messageDigestO.update(bArr2, 0, length);
            }
            bArrDigest2 = messageDigestO.digest();
        }
        StringBuilder sb2 = new StringBuilder(str2);
        if (z10) {
            sb2.append(f335273d);
            sb2.append(iMax);
            sb2.append("$");
        }
        sb2.append(strGroup);
        sb2.append("$");
        if (i10 == 32) {
            a.a(bArrDigest2[0], bArrDigest2[10], bArrDigest2[20], 4, sb2);
            a.a(bArrDigest2[21], bArrDigest2[1], bArrDigest2[11], 4, sb2);
            a.a(bArrDigest2[12], bArrDigest2[22], bArrDigest2[2], 4, sb2);
            a.a(bArrDigest2[3], bArrDigest2[13], bArrDigest2[23], 4, sb2);
            a.a(bArrDigest2[24], bArrDigest2[4], bArrDigest2[14], 4, sb2);
            a.a(bArrDigest2[15], bArrDigest2[25], bArrDigest2[5], 4, sb2);
            a.a(bArrDigest2[6], bArrDigest2[16], bArrDigest2[26], 4, sb2);
            a.a(bArrDigest2[27], bArrDigest2[7], bArrDigest2[17], 4, sb2);
            a.a(bArrDigest2[18], bArrDigest2[28], bArrDigest2[8], 4, sb2);
            a.a(bArrDigest2[9], bArrDigest2[19], bArrDigest2[29], 4, sb2);
            a.a((byte) 0, bArrDigest2[31], bArrDigest2[30], 3, sb2);
        } else {
            a.a(bArrDigest2[0], bArrDigest2[21], bArrDigest2[42], 4, sb2);
            a.a(bArrDigest2[22], bArrDigest2[43], bArrDigest2[1], 4, sb2);
            a.a(bArrDigest2[44], bArrDigest2[2], bArrDigest2[23], 4, sb2);
            a.a(bArrDigest2[3], bArrDigest2[24], bArrDigest2[45], 4, sb2);
            a.a(bArrDigest2[25], bArrDigest2[46], bArrDigest2[4], 4, sb2);
            a.a(bArrDigest2[47], bArrDigest2[5], bArrDigest2[26], 4, sb2);
            a.a(bArrDigest2[6], bArrDigest2[27], bArrDigest2[48], 4, sb2);
            a.a(bArrDigest2[28], bArrDigest2[49], bArrDigest2[7], 4, sb2);
            a.a(bArrDigest2[50], bArrDigest2[8], bArrDigest2[29], 4, sb2);
            a.a(bArrDigest2[9], bArrDigest2[30], bArrDigest2[51], 4, sb2);
            a.a(bArrDigest2[31], bArrDigest2[52], bArrDigest2[10], 4, sb2);
            a.a(bArrDigest2[53], bArrDigest2[11], bArrDigest2[32], 4, sb2);
            a.a(bArrDigest2[12], bArrDigest2[33], bArrDigest2[54], 4, sb2);
            a.a(bArrDigest2[34], bArrDigest2[55], bArrDigest2[13], 4, sb2);
            a.a(bArrDigest2[56], bArrDigest2[14], bArrDigest2[35], 4, sb2);
            a.a(bArrDigest2[15], bArrDigest2[36], bArrDigest2[57], 4, sb2);
            a.a(bArrDigest2[37], bArrDigest2[58], bArrDigest2[16], 4, sb2);
            a.a(bArrDigest2[59], bArrDigest2[17], bArrDigest2[38], 4, sb2);
            a.a(bArrDigest2[18], bArrDigest2[39], bArrDigest2[60], 4, sb2);
            a.a(bArrDigest2[40], bArrDigest2[61], bArrDigest2[19], 4, sb2);
            a.a(bArrDigest2[62], bArrDigest2[20], bArrDigest2[41], 4, sb2);
            a.a((byte) 0, (byte) 0, bArrDigest2[63], 2, sb2);
        }
        Arrays.fill(bArrDigest4, (byte) 0);
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(bArr3, (byte) 0);
        messageDigestO.reset();
        messageDigestO4.reset();
        Arrays.fill(bArr, (byte) 0);
        Arrays.fill(bytes, (byte) 0);
        return sb2.toString();
    }

    public static String d(byte[] bArr) {
        return e(bArr, null);
    }

    public static String e(byte[] bArr, String str) {
        if (str == null) {
            str = f335277h + a.b(8);
        }
        return c(bArr, str, f335277h, 64, g.f335253g);
    }
}
