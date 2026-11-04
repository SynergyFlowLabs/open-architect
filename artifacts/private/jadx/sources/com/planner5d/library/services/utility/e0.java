package com.planner5d.library.services.utility;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes10.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f225193a = "MD5";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f225194b = "SHA1";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f225195c = new byte[4096];

    public static MessageDigest a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    @androidx.annotation.m1
    public static String b() {
        return h("p5d:" + Math.random() + ":" + new Date().getTime(), "MD5");
    }

    public static String c(String str) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
        cipher.init(2, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAw9OxqD0+OFo5mDtDidlZeWQDmjyCERZ7I7YvYXl79wiPFIiXF72lBe+tXzOXMbiRaZpxHE00s15NFXTy7zKuPIAws6yzXurc4V2ySzYj6dms8Za5ZAdqcPqYHDcO6aPDWyVsHBSfCQS33JKXxv6sgLG518z0NnL2w4ZyRfZY4jcfQBrn6YXj5Gjkc7nlSBdZ0y019nFZ1doEUhre9XNEoqyAfa2wMBW9LopeOCh5Xa8oDCIWAJuMqT70i3qvcQVStVyP4+sdecQ1DH8m07DH31SkIV8FpM8yIfov26f6jqErc1sNDuBwOxZzVO1BhLdolIqRwE6d2Vn9yCJEchSqAnL1v3BzX+zkix9DtGsOPmq3fme4zSOGdtTMGa2sZLMvrnU1C9VpPLh21LwWTaFgvEdJ8JKdLrsjMxXGjSZk90j1gMvsMqVKbL0FLp1xs6tt/alU7P5u6fG5cuZQoS9FHtClPF/xAmnIp+3922g2Zl6eWKdmY7zVFDwjtmvnB16XdF2BSRmhsE48Lo7fHupN2mm/R5bXAv4Fe4Q0d7Fza2AMZ5LmBhZm35mGN69byLe6a8GeWc2HrKTKpPP3M7VWNdmh5Yho7uEWTA9xbRq2TrytnkiCU/LZfk1K00hyyUFfN1BJGM4cOpM14d5TAzrL/BwUkSFejIvO9Nh2hMpoN80CAwEAAQ==", 0))));
        return new String(cipher.doFinal(Base64.decode(str, 0)));
    }

    @androidx.annotation.m1
    public static String d(File file) throws Throwable {
        return e(file, null);
    }

    @androidx.annotation.m1
    public static String e(File file, @androidx.annotation.p0 MessageDigest messageDigest) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (file == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                String strG = g(fileInputStream, messageDigest);
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return strG;
            } catch (FileNotFoundException unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @androidx.annotation.m1
    public static String f(InputStream inputStream) throws Throwable {
        return g(inputStream, null);
    }

    @androidx.annotation.m1
    public static String g(InputStream inputStream, @androidx.annotation.p0 MessageDigest messageDigest) throws Throwable {
        if (messageDigest == null) {
            messageDigest = a("MD5");
        }
        DigestInputStream digestInputStream = null;
        try {
            DigestInputStream digestInputStream2 = new DigestInputStream(inputStream, messageDigest);
            try {
                synchronized (f225195c) {
                    do {
                        try {
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } while (digestInputStream2.read(f225195c) != -1);
                }
                String strE = l.e(messageDigest.digest());
                digestInputStream2.close();
                try {
                    digestInputStream2.close();
                } catch (IOException unused) {
                }
                return strE;
            } catch (Throwable th3) {
                th = th3;
                digestInputStream = digestInputStream2;
                try {
                    throw new RuntimeException(th);
                } catch (Throwable th4) {
                    if (digestInputStream != null) {
                        try {
                            digestInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static String h(String str, String str2) {
        MessageDigest messageDigestA = a(str2);
        messageDigestA.update(str.getBytes());
        return l.e(messageDigestA.digest());
    }

    @NonNull
    public static byte[] i(@NonNull byte[] bArr, @NonNull String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    @NonNull
    @androidx.annotation.m1
    public static String j(@androidx.annotation.g0(from = 1) int i10) {
        byte[] bArr = new byte[i10];
        new SecureRandom().nextBytes(bArr);
        return new String(bArr);
    }

    public static String k(String str) {
        if (str == null) {
            str = "";
        }
        return l(str) + ";" + str;
    }

    private static String l(String str) {
        return h(h(str + "p5_ad5", "MD5") + "p5_as1", f225194b);
    }

    public static String m(String str) {
        if (str != null && !str.isEmpty()) {
            int iIndexOf = str.indexOf(";");
            if (iIndexOf == -1) {
                return "";
            }
            String strSubstring = str.substring(iIndexOf + 1);
            if (str.substring(0, iIndexOf).equals(l(strSubstring))) {
                return strSubstring;
            }
        }
        return "";
    }
}
