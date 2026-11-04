package com.devtodev.analytics.internal.platform.repository.utils;

import com.google.common.base.c;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class Odin {
    private static final String CHAR_SET = "iso-8859-1";
    private static final String SHA1_ALGORITHM = "SHA-1";

    private Odin() {
        throw new IllegalStateException("Utility class");
    }

    private static String convertToHex(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            int i10 = (b10 >>> 4) & 15;
            int i11 = 0;
            while (true) {
                if (i10 < 0 || i10 > 9) {
                    sb2.append((char) (i10 + 87));
                } else {
                    sb2.append((char) (i10 + 48));
                }
                i10 = b10 & c.f116464q;
                int i12 = i11 + 1;
                if (i11 >= 1) {
                    break;
                }
                i11 = i12;
            }
        }
        return sb2.toString();
    }

    public static String getODIN1(String str) {
        return sha1(str);
    }

    private static String sha1(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes(CHAR_SET), 0, str.length());
            return convertToHex(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }
}
