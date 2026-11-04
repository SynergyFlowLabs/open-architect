package org.apache.commons.codec.digest;

/* JADX INFO: loaded from: classes9.dex */
public class b {
    public static String a(String str) {
        return b(str, null);
    }

    public static String b(String str, String str2) {
        return d(str.getBytes(nk.d.f333413f), str2);
    }

    public static String c(byte[] bArr) {
        return d(bArr, null);
    }

    public static String d(byte[] bArr, String str) {
        if (str == null) {
            return j.d(bArr);
        }
        if (str.startsWith("$6$")) {
            return j.e(bArr, str);
        }
        if (str.startsWith("$5$")) {
            return j.b(bArr, str);
        }
        return str.startsWith("$1$") ? f.f(bArr, str) : k.f(bArr, str);
    }
}
