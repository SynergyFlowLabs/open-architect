package io.ably.lib.util;

import io.ably.lib.types.b0;
import io.ably.lib.types.r;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes13.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f288210a = "aes";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f288211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f288212c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final SecureRandom f288213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f288214e;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final SecretKeySpec f288215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final IvParameterSpec f288216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Cipher f288217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final int f288218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final String f288219e;

        protected a(b bVar) throws io.ably.lib.types.a {
            String strC = bVar.c();
            String str = strC.toUpperCase(Locale.ROOT) + "/CBC/PKCS5Padding";
            try {
                this.f288219e = strC + org.apache.commons.codec.language.l.f335457d + bVar.d() + "-cbc";
                this.f288215a = bVar.f288222c;
                IvParameterSpec ivParameterSpec = bVar.f288223d;
                this.f288216b = ivParameterSpec;
                this.f288218d = ivParameterSpec.getIV().length;
                this.f288217c = Cipher.getInstance(str);
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                throw io.ably.lib.types.a.c(e10);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f288220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f288221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SecretKeySpec f288222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final IvParameterSpec f288223d;

        b(String str, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
            str = str == null ? e.f288210a : str;
            this.f288220a = str;
            this.f288221b = bArr.length * 8;
            this.f288222c = new SecretKeySpec(bArr, str.toUpperCase(Locale.ROOT));
            this.f288223d = new IvParameterSpec(bArr2);
        }

        String c() {
            return this.f288220a;
        }

        int d() {
            return this.f288221b;
        }
    }

    private static class c extends a implements d {
        c(b bVar) throws io.ably.lib.types.a {
            super(bVar);
        }

        @Override // io.ably.lib.util.e.d
        public byte[] b(byte[] bArr) throws io.ably.lib.types.a {
            if (bArr == null) {
                return null;
            }
            try {
                this.f288217c.init(2, this.f288215a, new IvParameterSpec(bArr, 0, this.f288218d));
                Cipher cipher = this.f288217c;
                int i10 = this.f288218d;
                return cipher.doFinal(bArr, i10, bArr.length - i10);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e10) {
                throw io.ably.lib.types.a.c(e10);
            }
        }
    }

    public interface d {
        byte[] b(byte[] bArr) throws io.ably.lib.types.a;
    }

    /* JADX INFO: renamed from: io.ably.lib.util.e$e, reason: collision with other inner class name */
    private static class C1947e extends a implements f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final byte[] f288224g = new byte[16];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final byte[][] f288225h = {new byte[]{com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r}, new byte[]{1}, new byte[]{2, 2}, new byte[]{3, 3, 3}, new byte[]{4, 4, 4, 4}, new byte[]{5, 5, 5, 5, 5}, new byte[]{6, 6, 6, 6, 6, 6}, new byte[]{7, 7, 7, 7, 7, 7, 7}, new byte[]{8, 8, 8, 8, 8, 8, 8, 8}, new byte[]{9, 9, 9, 9, 9, 9, 9, 9, 9}, new byte[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, new byte[]{11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11}, new byte[]{com.google.common.base.c.f116461n, com.google.common.base.c.f116461n, com.google.common.base.c.f116461n, com.google.common.base.c.f116461n, com.google.common.base.c.f116461n, com.google.common.base.c.f116461n, com.google.common.base.c.f116461n, com.google.common.base.c.f116461n, com.google.common.base.c.f116461n, com.google.common.base.c.f116461n, com.google.common.base.c.f116461n, com.google.common.base.c.f116461n}, new byte[]{com.google.common.base.c.f116462o, com.google.common.base.c.f116462o, com.google.common.base.c.f116462o, com.google.common.base.c.f116462o, com.google.common.base.c.f116462o, com.google.common.base.c.f116462o, com.google.common.base.c.f116462o, com.google.common.base.c.f116462o, com.google.common.base.c.f116462o, com.google.common.base.c.f116462o, com.google.common.base.c.f116462o, com.google.common.base.c.f116462o, com.google.common.base.c.f116462o}, new byte[]{com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p}, new byte[]{com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q}, new byte[]{com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r}};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte[] f288226f;

        C1947e(b bVar) throws io.ably.lib.types.a {
            super(bVar);
            try {
                this.f288217c.init(1, this.f288215a, this.f288216b);
                this.f288226f = bVar.f288223d.getIV();
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw io.ably.lib.types.a.c(e10);
            }
        }

        private byte[] c() {
            byte[] bArr = this.f288226f;
            if (bArr == null) {
                return this.f288217c.update(f288224g);
            }
            this.f288226f = null;
            return bArr;
        }

        private static int d(int i10) {
            return (i10 + 16) & (-16);
        }

        @Override // io.ably.lib.util.e.f
        public byte[] a(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            int length = bArr.length;
            int iD = d(length);
            byte[] bArr2 = new byte[iD];
            byte[] bArr3 = new byte[this.f288218d + iD];
            int i10 = iD - length;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            System.arraycopy(f288225h[i10], 0, bArr2, length, i10);
            System.arraycopy(c(), 0, bArr3, 0, this.f288218d);
            System.arraycopy(this.f288217c.update(bArr2), 0, bArr3, this.f288218d, iD);
            return bArr3;
        }

        @Override // io.ably.lib.util.e.f
        public String getAlgorithm() {
            return this.f288219e;
        }
    }

    public interface f {
        byte[] a(byte[] bArr) throws io.ably.lib.types.a;

        String getAlgorithm();
    }

    static {
        f288211b = p() ? 256 : 128;
        f288213d = new SecureRandom();
        f288214e = e.class.getName();
    }

    public static b a(Object obj) throws io.ably.lib.types.a {
        if (obj == null) {
            return g();
        }
        if (obj instanceof b) {
            return (b) obj;
        }
        throw io.ably.lib.types.a.a(new r("ChannelOptions not supported", 400, 40000));
    }

    public static d b(b bVar) throws io.ably.lib.types.a {
        return new c(bVar);
    }

    public static f c(b bVar) throws io.ably.lib.types.a {
        return new C1947e(bVar);
    }

    public static byte[] d() {
        return e(f288211b);
    }

    public static byte[] e(int i10) {
        byte[] bArr = new byte[(i10 + 7) / 8];
        f288213d.nextBytes(bArr);
        return bArr;
    }

    public static b0 f() {
        return new b0("request_id", o());
    }

    public static b g() {
        return l(f288210a, f288211b);
    }

    public static b h(String str) {
        return j(io.ably.lib.util.b.a(str));
    }

    static b i(String str, byte[] bArr) throws NoSuchAlgorithmException {
        return new b(null, io.ably.lib.util.b.a(str), bArr);
    }

    public static b j(byte[] bArr) {
        try {
            return m(f288210a, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    static b k(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        return new b(f288210a, bArr, bArr2);
    }

    public static b l(String str, int i10) {
        if (str == null) {
            str = f288210a;
        }
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(str.toUpperCase(Locale.ROOT));
            keyGenerator.init(i10);
            return m(str, keyGenerator.generateKey().getEncoded());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static b m(String str, byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArr2 = new byte[16];
        f288213d.nextBytes(bArr2);
        return n(str, bArr, bArr2);
    }

    public static b n(String str, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        return new b(str, bArr, bArr2);
    }

    public static String o() {
        byte[] bArr = new byte[9];
        f288213d.nextBytes(bArr);
        return io.ably.lib.util.b.l(bArr);
    }

    private static boolean p() {
        try {
            return Cipher.getMaxAllowedKeyLength(f288210a) >= 256;
        } catch (NoSuchAlgorithmException unused) {
            return false;
        }
    }
}
