package org.apache.commons.codec.digest;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f335243a = "$apr1$";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f335244b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f335245c = "$1$";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f335246d = 1000;

    public static String a(String str) {
        return c(str.getBytes(nk.d.f333413f));
    }

    public static String b(String str, String str2) {
        return d(str.getBytes(nk.d.f333413f), str2);
    }

    public static String c(byte[] bArr) {
        return d(bArr, f335243a + a.b(8));
    }

    public static String d(byte[] bArr, String str) {
        if (str != null && !str.startsWith(f335243a)) {
            str = f335243a + str;
        }
        return g(bArr, str, f335243a);
    }

    public static String e(byte[] bArr) {
        return f(bArr, f335245c + a.b(8));
    }

    public static String f(byte[] bArr, String str) {
        return g(bArr, str, f335245c);
    }

    public static String g(byte[] bArr, String str, String str2) {
        String strGroup;
        int length = bArr.length;
        if (str == null) {
            strGroup = a.b(8);
        } else {
            Matcher matcher = Pattern.compile("^" + str2.replace("$", "\\$") + "([\\.\\/a-zA-Z0-9]{1,8}).*").matcher(str);
            if (!matcher.find()) {
                throw new IllegalArgumentException("Invalid salt value: " + str);
            }
            strGroup = matcher.group(1);
        }
        Charset charset = nk.d.f333413f;
        byte[] bytes = strGroup.getBytes(charset);
        MessageDigest messageDigestR = c.r();
        messageDigestR.update(bArr);
        messageDigestR.update(str2.getBytes(charset));
        messageDigestR.update(bytes);
        MessageDigest messageDigestR2 = c.r();
        messageDigestR2.update(bArr);
        messageDigestR2.update(bytes);
        messageDigestR2.update(bArr);
        byte[] bArrDigest = messageDigestR2.digest();
        int i10 = length;
        while (true) {
            int i11 = 16;
            if (i10 <= 0) {
                break;
            }
            if (i10 <= 16) {
                i11 = i10;
            }
            messageDigestR.update(bArrDigest, 0, i11);
            i10 -= 16;
        }
        Arrays.fill(bArrDigest, (byte) 0);
        while (length > 0) {
            if ((length & 1) == 1) {
                messageDigestR.update(bArrDigest[0]);
            } else {
                messageDigestR.update(bArr[0]);
            }
            length >>= 1;
        }
        StringBuilder sb2 = new StringBuilder(str2 + strGroup + "$");
        byte[] bArrDigest2 = messageDigestR.digest();
        for (int i12 = 0; i12 < 1000; i12++) {
            messageDigestR2 = c.r();
            int i13 = i12 & 1;
            if (i13 != 0) {
                messageDigestR2.update(bArr);
            } else {
                messageDigestR2.update(bArrDigest2, 0, 16);
            }
            if (i12 % 3 != 0) {
                messageDigestR2.update(bytes);
            }
            if (i12 % 7 != 0) {
                messageDigestR2.update(bArr);
            }
            if (i13 != 0) {
                messageDigestR2.update(bArrDigest2, 0, 16);
            } else {
                messageDigestR2.update(bArr);
            }
            bArrDigest2 = messageDigestR2.digest();
        }
        a.a(bArrDigest2[0], bArrDigest2[6], bArrDigest2[12], 4, sb2);
        a.a(bArrDigest2[1], bArrDigest2[7], bArrDigest2[13], 4, sb2);
        a.a(bArrDigest2[2], bArrDigest2[8], bArrDigest2[14], 4, sb2);
        a.a(bArrDigest2[3], bArrDigest2[9], bArrDigest2[15], 4, sb2);
        a.a(bArrDigest2[4], bArrDigest2[10], bArrDigest2[5], 4, sb2);
        a.a((byte) 0, (byte) 0, bArrDigest2[11], 2, sb2);
        messageDigestR.reset();
        messageDigestR2.reset();
        Arrays.fill(bArr, (byte) 0);
        Arrays.fill(bytes, (byte) 0);
        Arrays.fill(bArrDigest2, (byte) 0);
        return sb2.toString();
    }
}
