package com.devtodev.core.utils.k;

import com.google.common.base.c;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("UTF-8"));
            return a(messageDigest.digest());
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return "cfcd208495d565ef66e7dff9f98764da";
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return "cfcd208495d565ef66e7dff9f98764da";
        }
    }

    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = (bArr[i10] >>> 4) & 15;
            int i12 = 0;
            while (true) {
                if (i11 >= 0 && i11 <= 9) {
                    sb2.append((char) (i11 + 48));
                } else {
                    sb2.append((char) (i11 + 87));
                }
                i11 = bArr[i10] & c.f116464q;
                int i13 = i12 + 1;
                if (i12 >= 1) {
                    break;
                }
                i12 = i13;
            }
        }
        return sb2.toString();
    }
}
