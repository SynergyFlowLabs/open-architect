package org.apache.commons.codec.binary;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
public class m {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null) {
            if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
                return charSequence.equals(charSequence2);
            }
            if (charSequence.length() == charSequence2.length() && k.a(charSequence, false, 0, charSequence2, 0, charSequence.length())) {
                return true;
            }
        }
        return false;
    }

    private static ByteBuffer b(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return ByteBuffer.wrap(str.getBytes(charset));
    }

    public static ByteBuffer c(String str) {
        return b(str, nk.d.f333413f);
    }

    private static byte[] d(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] e(String str) {
        return d(str, nk.d.f333408a);
    }

    public static byte[] f(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e10) {
            throw l(str2, e10);
        }
    }

    public static byte[] g(String str) {
        return d(str, nk.d.f333409b);
    }

    public static byte[] h(String str) {
        return d(str, nk.d.f333410c);
    }

    public static byte[] i(String str) {
        return d(str, nk.d.f333411d);
    }

    public static byte[] j(String str) {
        return d(str, nk.d.f333412e);
    }

    public static byte[] k(String str) {
        return d(str, nk.d.f333413f);
    }

    private static IllegalStateException l(String str, UnsupportedEncodingException unsupportedEncodingException) {
        return new IllegalStateException(str + ": " + unsupportedEncodingException);
    }

    public static String m(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e10) {
            throw l(str, e10);
        }
    }

    private static String n(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }

    public static String o(byte[] bArr) {
        return n(bArr, nk.d.f333408a);
    }

    public static String p(byte[] bArr) {
        return n(bArr, nk.d.f333409b);
    }

    public static String q(byte[] bArr) {
        return n(bArr, nk.d.f333410c);
    }

    public static String r(byte[] bArr) {
        return n(bArr, nk.d.f333411d);
    }

    public static String s(byte[] bArr) {
        return n(bArr, nk.d.f333412e);
    }

    public static String t(byte[] bArr) {
        return n(bArr, nk.d.f333413f);
    }
}
