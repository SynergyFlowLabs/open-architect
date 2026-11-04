package org.apache.commons.codec.digest;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.m;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f335241b = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Mac f335242a;

    @Deprecated
    public e() {
        this(null);
    }

    @Deprecated
    public static String A(String str, String str2) {
        return new e(d.HMAC_SHA_1, str).o(str2);
    }

    @Deprecated
    public static String B(byte[] bArr, InputStream inputStream) throws IOException {
        return new e(d.HMAC_SHA_1, bArr).n(inputStream);
    }

    @Deprecated
    public static String C(byte[] bArr, byte[] bArr2) {
        return new e(d.HMAC_SHA_1, bArr).q(bArr2);
    }

    @Deprecated
    public static byte[] D(String str, String str2) {
        return new e(d.HMAC_SHA_256, str).j(str2);
    }

    @Deprecated
    public static byte[] E(byte[] bArr, InputStream inputStream) throws IOException {
        return new e(d.HMAC_SHA_256, bArr).i(inputStream);
    }

    @Deprecated
    public static byte[] F(byte[] bArr, byte[] bArr2) {
        return new e(d.HMAC_SHA_256, bArr).l(bArr2);
    }

    @Deprecated
    public static String G(String str, String str2) {
        return new e(d.HMAC_SHA_256, str).o(str2);
    }

    @Deprecated
    public static String H(byte[] bArr, InputStream inputStream) throws IOException {
        return new e(d.HMAC_SHA_256, bArr).n(inputStream);
    }

    @Deprecated
    public static String I(byte[] bArr, byte[] bArr2) {
        return new e(d.HMAC_SHA_256, bArr).q(bArr2);
    }

    @Deprecated
    public static byte[] J(String str, String str2) {
        return new e(d.HMAC_SHA_384, str).j(str2);
    }

    @Deprecated
    public static byte[] K(byte[] bArr, InputStream inputStream) throws IOException {
        return new e(d.HMAC_SHA_384, bArr).i(inputStream);
    }

    @Deprecated
    public static byte[] L(byte[] bArr, byte[] bArr2) {
        return new e(d.HMAC_SHA_384, bArr).l(bArr2);
    }

    @Deprecated
    public static String M(String str, String str2) {
        return new e(d.HMAC_SHA_384, str).o(str2);
    }

    @Deprecated
    public static String N(byte[] bArr, InputStream inputStream) throws IOException {
        return new e(d.HMAC_SHA_384, bArr).n(inputStream);
    }

    @Deprecated
    public static String O(byte[] bArr, byte[] bArr2) {
        return new e(d.HMAC_SHA_384, bArr).q(bArr2);
    }

    @Deprecated
    public static byte[] P(String str, String str2) {
        return new e(d.HMAC_SHA_512, str).j(str2);
    }

    @Deprecated
    public static byte[] Q(byte[] bArr, InputStream inputStream) throws IOException {
        return new e(d.HMAC_SHA_512, bArr).i(inputStream);
    }

    @Deprecated
    public static byte[] R(byte[] bArr, byte[] bArr2) {
        return new e(d.HMAC_SHA_512, bArr).l(bArr2);
    }

    @Deprecated
    public static String S(String str, String str2) {
        return new e(d.HMAC_SHA_512, str).o(str2);
    }

    @Deprecated
    public static String T(byte[] bArr, InputStream inputStream) throws IOException {
        return new e(d.HMAC_SHA_512, bArr).n(inputStream);
    }

    @Deprecated
    public static String U(byte[] bArr, byte[] bArr2) {
        return new e(d.HMAC_SHA_512, bArr).q(bArr2);
    }

    public static boolean V(String str) {
        try {
            Mac.getInstance(str);
            return true;
        } catch (NoSuchAlgorithmException unused) {
            return false;
        }
    }

    public static boolean W(d dVar) {
        try {
            Mac.getInstance(dVar.getName());
            return true;
        } catch (NoSuchAlgorithmException unused) {
            return false;
        }
    }

    public static Mac X(Mac mac, InputStream inputStream) throws IOException {
        mac.reset();
        byte[] bArr = new byte[1024];
        int i10 = inputStream.read(bArr, 0, 1024);
        while (i10 > -1) {
            mac.update(bArr, 0, i10);
            i10 = inputStream.read(bArr, 0, 1024);
        }
        return mac;
    }

    public static Mac Y(Mac mac, String str) {
        mac.reset();
        mac.update(m.k(str));
        return mac;
    }

    public static Mac Z(Mac mac, byte[] bArr) {
        mac.reset();
        mac.update(bArr);
        return mac;
    }

    @Deprecated
    public static Mac a(byte[] bArr) {
        return g(d.HMAC_MD5, bArr);
    }

    @Deprecated
    public static Mac b(byte[] bArr) {
        return g(d.HMAC_SHA_1, bArr);
    }

    @Deprecated
    public static Mac c(byte[] bArr) {
        return g(d.HMAC_SHA_256, bArr);
    }

    @Deprecated
    public static Mac d(byte[] bArr) {
        return g(d.HMAC_SHA_384, bArr);
    }

    @Deprecated
    public static Mac e(byte[] bArr) {
        return g(d.HMAC_SHA_512, bArr);
    }

    public static Mac f(String str, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Null key");
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, str);
            Mac mac = Mac.getInstance(str);
            mac.init(secretKeySpec);
            return mac;
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public static Mac g(d dVar, byte[] bArr) {
        return f(dVar.getName(), bArr);
    }

    @Deprecated
    public static byte[] r(String str, String str2) {
        return new e(d.HMAC_MD5, str).j(str2);
    }

    @Deprecated
    public static byte[] s(byte[] bArr, InputStream inputStream) throws IOException {
        return new e(d.HMAC_MD5, bArr).i(inputStream);
    }

    @Deprecated
    public static byte[] t(byte[] bArr, byte[] bArr2) {
        return new e(d.HMAC_MD5, bArr).l(bArr2);
    }

    @Deprecated
    public static String u(String str, String str2) {
        return new e(d.HMAC_MD5, str).o(str2);
    }

    @Deprecated
    public static String v(byte[] bArr, InputStream inputStream) throws IOException {
        return new e(d.HMAC_MD5, bArr).n(inputStream);
    }

    @Deprecated
    public static String w(byte[] bArr, byte[] bArr2) {
        return new e(d.HMAC_MD5, bArr).q(bArr2);
    }

    @Deprecated
    public static byte[] x(String str, String str2) {
        return new e(d.HMAC_SHA_1, str).j(str2);
    }

    @Deprecated
    public static byte[] y(byte[] bArr, InputStream inputStream) throws IOException {
        return new e(d.HMAC_SHA_1, bArr).i(inputStream);
    }

    @Deprecated
    public static byte[] z(byte[] bArr, byte[] bArr2) {
        return new e(d.HMAC_SHA_1, bArr).l(bArr2);
    }

    public byte[] h(File file) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            return i(bufferedInputStream);
        } finally {
            bufferedInputStream.close();
        }
    }

    public byte[] i(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 1024);
            if (i10 <= -1) {
                return this.f335242a.doFinal();
            }
            this.f335242a.update(bArr, 0, i10);
        }
    }

    public byte[] j(String str) {
        return this.f335242a.doFinal(m.k(str));
    }

    public byte[] k(ByteBuffer byteBuffer) {
        this.f335242a.update(byteBuffer);
        return this.f335242a.doFinal();
    }

    public byte[] l(byte[] bArr) {
        return this.f335242a.doFinal(bArr);
    }

    public String m(File file) throws IOException {
        return org.apache.commons.codec.binary.l.s(h(file));
    }

    public String n(InputStream inputStream) throws IOException {
        return org.apache.commons.codec.binary.l.s(i(inputStream));
    }

    public String o(String str) {
        return org.apache.commons.codec.binary.l.s(j(str));
    }

    public String p(ByteBuffer byteBuffer) {
        return org.apache.commons.codec.binary.l.s(k(byteBuffer));
    }

    public String q(byte[] bArr) {
        return org.apache.commons.codec.binary.l.s(l(bArr));
    }

    private e(Mac mac) {
        this.f335242a = mac;
    }

    public e(String str, byte[] bArr) {
        this(f(str, bArr));
    }

    public e(String str, String str2) {
        this(str, m.k(str2));
    }

    public e(d dVar, String str) {
        this(dVar.getName(), m.k(str));
    }

    public e(d dVar, byte[] bArr) {
        this(dVar.getName(), bArr);
    }
}
