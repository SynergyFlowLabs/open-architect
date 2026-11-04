package com.google.android.vending.licensing;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class a implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f114985c = "UTF-8";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f114986d = "PBEWITHSHAAND256BITAES-CBC-BC";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f114987e = "AES/CBC/PKCS5Padding";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f114988f = {com.google.common.base.c.f116465r, 74, 71, -80, 32, 101, org.msgpack.core.h.a.f339286v, 72, 117, -14, 0, -29, 70, 65, -12, 74};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f114989g = "com.android.vending.licensing.AESObfuscator-1|";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Cipher f114990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Cipher f114991b;

    public a(byte[] bArr, String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance(f114986d).generateSecret(new PBEKeySpec((str + str2).toCharArray(), bArr, 1024, 256)).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance(f114987e);
            this.f114990a = cipher;
            byte[] bArr2 = f114988f;
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            Cipher cipher2 = Cipher.getInstance(f114987e);
            this.f114991b = cipher2;
            cipher2.init(2, secretKeySpec, new IvParameterSpec(bArr2));
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException("Invalid environment", e10);
        }
    }

    @Override // com.google.android.vending.licensing.j
    public String a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return com.google.android.vending.licensing.util.a.i(this.f114990a.doFinal((f114989g + str2 + str).getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            throw new RuntimeException("Invalid environment", e10);
        }
    }

    @Override // com.google.android.vending.licensing.j
    public String b(String str, String str2) throws r {
        if (str == null) {
            return null;
        }
        try {
            String str3 = new String(this.f114991b.doFinal(com.google.android.vending.licensing.util.a.a(str)), "UTF-8");
            if (str3.indexOf(f114989g + str2) == 0) {
                return str3.substring(46 + str2.length(), str3.length());
            }
            throw new r("Header not found (invalid data or key):" + str);
        } catch (com.google.android.vending.licensing.util.b | BadPaddingException | IllegalBlockSizeException e10) {
            throw new r(e10.getMessage() + ":" + str);
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("Invalid environment", e11);
        }
    }
}
