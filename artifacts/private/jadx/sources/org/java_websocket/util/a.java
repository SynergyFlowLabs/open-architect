package org.java_websocket.util;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f337944a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f337945b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f337946c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f337947d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f337948e = 16;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f337949f = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f337950g = 76;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte f337951h = 61;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte f337952i = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f337953j = "US-ASCII";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final /* synthetic */ boolean f337961r = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f337955l = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte f337954k = -5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f337956m = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f337954k, f337954k, -9, -9, f337954k, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f337954k, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 19, com.google.common.base.c.f116471x, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.C, -9, -9, -9, -9, -9, -9, com.google.common.base.c.D, com.google.common.base.c.E, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, com.google.common.base.c.I, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f337957n = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f337958o = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f337954k, f337954k, -9, -9, f337954k, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f337954k, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 19, com.google.common.base.c.f116471x, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.C, -9, -9, -9, -9, 63, -9, com.google.common.base.c.D, com.google.common.base.c.E, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, com.google.common.base.c.I, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f337959p = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final byte[] f337960q = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f337954k, f337954k, -9, -9, f337954k, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f337954k, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 19, com.google.common.base.c.f116471x, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.C, com.google.common.base.c.D, com.google.common.base.c.E, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, com.google.common.base.c.I, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: org.java_websocket.util.a$a, reason: collision with other inner class name */
    public static class C2419a extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f337962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f337963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f337964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f337965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f337966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f337967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f337968g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f337969h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f337970i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f337971j;

        public C2419a(OutputStream outputStream) {
            this(outputStream, 1);
        }

        public void a() throws IOException {
            int i10 = this.f337963b;
            if (i10 > 0) {
                if (!this.f337962a) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(a.f(this.f337968g, this.f337964c, i10, this.f337970i));
                this.f337963b = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a();
            super.close();
            this.f337964c = null;
            ((FilterOutputStream) this).out = null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i10) throws IOException {
            if (this.f337969h) {
                ((FilterOutputStream) this).out.write(i10);
                return;
            }
            if (!this.f337962a) {
                byte b10 = this.f337971j[i10 & 127];
                if (b10 <= -5) {
                    if (b10 != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr = this.f337964c;
                int i11 = this.f337963b;
                int i12 = i11 + 1;
                this.f337963b = i12;
                bArr[i11] = (byte) i10;
                if (i12 >= this.f337965d) {
                    ((FilterOutputStream) this).out.write(this.f337968g, 0, a.d(bArr, 0, this.f337968g, 0, this.f337970i));
                    this.f337963b = 0;
                    return;
                }
                return;
            }
            byte[] bArr2 = this.f337964c;
            int i13 = this.f337963b;
            int i14 = i13 + 1;
            this.f337963b = i14;
            bArr2[i13] = (byte) i10;
            int i15 = this.f337965d;
            if (i14 >= i15) {
                ((FilterOutputStream) this).out.write(a.f(this.f337968g, bArr2, i15, this.f337970i));
                int i16 = this.f337966e + 4;
                this.f337966e = i16;
                if (this.f337967f && i16 >= 76) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f337966e = 0;
                }
                this.f337963b = 0;
            }
        }

        public C2419a(OutputStream outputStream, int i10) {
            super(outputStream);
            this.f337967f = (i10 & 8) != 0;
            boolean z10 = (i10 & 1) != 0;
            this.f337962a = z10;
            int i11 = z10 ? 3 : 4;
            this.f337965d = i11;
            this.f337964c = new byte[i11];
            this.f337963b = 0;
            this.f337966e = 0;
            this.f337969h = false;
            this.f337968g = new byte[4];
            this.f337970i = i10;
            this.f337971j = a.k(i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            if (this.f337969h) {
                ((FilterOutputStream) this).out.write(bArr, i10, i11);
                return;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                write(bArr[i10 + i12]);
            }
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13;
        int i14;
        if (bArr == null) {
            throw new IllegalArgumentException("Source array was null.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Destination array was null.");
        }
        if (i10 < 0 || (i13 = i10 + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i10)));
        }
        if (i11 < 0 || (i14 = i11 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i11)));
        }
        byte[] bArrK = k(i12);
        byte b10 = bArr[i10 + 2];
        if (b10 == 61) {
            bArr2[i11] = (byte) ((((bArrK[bArr[i10 + 1]] & 255) << 12) | ((bArrK[bArr[i10]] & 255) << 18)) >>> 16);
            return 1;
        }
        byte b11 = bArr[i13];
        if (b11 == 61) {
            int i15 = ((bArrK[bArr[i10 + 1]] & 255) << 12) | ((bArrK[bArr[i10]] & 255) << 18) | ((bArrK[b10] & 255) << 6);
            bArr2[i11] = (byte) (i15 >>> 16);
            bArr2[i11 + 1] = (byte) (i15 >>> 8);
            return 2;
        }
        int i16 = ((bArrK[bArr[i10 + 1]] & 255) << 12) | ((bArrK[bArr[i10]] & 255) << 18) | ((bArrK[b10] & 255) << 6) | (bArrK[b11] & 255);
        bArr2[i11] = (byte) (i16 >> 16);
        bArr2[i11 + 1] = (byte) (i16 >> 8);
        bArr2[i14] = (byte) i16;
        return 3;
    }

    private static byte[] e(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        byte[] bArrJ = j(i13);
        int i14 = (i11 > 0 ? (bArr[i10] << com.google.common.base.c.B) >>> 8 : 0) | (i11 > 1 ? (bArr[i10 + 1] << com.google.common.base.c.B) >>> 16 : 0) | (i11 > 2 ? (bArr[i10 + 2] << com.google.common.base.c.B) >>> 24 : 0);
        if (i11 == 1) {
            bArr2[i12] = bArrJ[i14 >>> 18];
            bArr2[i12 + 1] = bArrJ[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = 61;
            bArr2[i12 + 3] = 61;
            return bArr2;
        }
        if (i11 == 2) {
            bArr2[i12] = bArrJ[i14 >>> 18];
            bArr2[i12 + 1] = bArrJ[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = bArrJ[(i14 >>> 6) & 63];
            bArr2[i12 + 3] = 61;
            return bArr2;
        }
        if (i11 != 3) {
            return bArr2;
        }
        bArr2[i12] = bArrJ[i14 >>> 18];
        bArr2[i12 + 1] = bArrJ[(i14 >>> 12) & 63];
        bArr2[i12 + 2] = bArrJ[(i14 >>> 6) & 63];
        bArr2[i12 + 3] = bArrJ[i14 & 63];
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] f(byte[] bArr, byte[] bArr2, int i10, int i11) {
        e(bArr2, 0, i10, bArr, 0, i11);
        return bArr;
    }

    public static String g(byte[] bArr) {
        try {
            return h(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String h(byte[] bArr, int i10, int i11, int i12) throws Throwable {
        byte[] bArrI = i(bArr, i10, i11, i12);
        try {
            return new String(bArrI, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrI);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] i(byte[] bArr, int i10, int i11, int i12) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        C2419a c2419a;
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            throw new IllegalArgumentException("Cannot serialize a null array.");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i10);
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i11);
        }
        if (i10 + i11 > bArr2.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr2.length)));
        }
        if ((i12 & 2) == 0) {
            Object[] objArr = (i12 & 8) != 0;
            int i13 = ((i11 / 3) * 4) + (i11 % 3 > 0 ? 4 : 0);
            if (objArr != false) {
                i13 += i13 / 76;
            }
            int i14 = i13;
            byte[] bArr3 = new byte[i14];
            int i15 = i11 - 2;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i17 < i15) {
                e(bArr2, i17 + i10, 3, bArr3, i16, i12);
                i18 += 4;
                if (objArr != false && i18 >= 76) {
                    bArr3[i16 + 4] = 10;
                    i16++;
                    i18 = 0;
                }
                i17 += 3;
                i16 += 4;
                bArr2 = bArr;
            }
            if (i17 < i11) {
                e(bArr, i17 + i10, i11 - i17, bArr3, i16, i12);
                i16 += 4;
            }
            if (i16 > i14 - 1) {
                return bArr3;
            }
            byte[] bArr4 = new byte[i16];
            System.arraycopy(bArr3, 0, bArr4, 0, i16);
            return bArr4;
        }
        GZIPOutputStream gZIPOutputStream2 = null;
        gZIPOutputStream2 = null;
        gZIPOutputStream2 = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                c2419a = new C2419a(byteArrayOutputStream, i12 | 1);
                try {
                    gZIPOutputStream = new GZIPOutputStream(c2419a);
                    try {
                        gZIPOutputStream.write(bArr2, i10, i11);
                        gZIPOutputStream.close();
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused) {
                        }
                        try {
                            c2419a.close();
                        } catch (Exception unused2) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused3) {
                        }
                        return byteArrayOutputStream.toByteArray();
                    } catch (IOException e10) {
                        e = e10;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        try {
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            gZIPOutputStream2 = gZIPOutputStream;
                            if (gZIPOutputStream2 != null) {
                                try {
                                    gZIPOutputStream2.close();
                                } catch (Exception unused4) {
                                }
                            }
                            if (c2419a != null) {
                                try {
                                    c2419a.close();
                                } catch (Exception unused5) {
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                throw th;
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (Exception unused6) {
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        gZIPOutputStream2 = gZIPOutputStream;
                        if (gZIPOutputStream2 != null) {
                            gZIPOutputStream2.close();
                        }
                        if (c2419a != null) {
                            c2419a.close();
                        }
                        if (byteArrayOutputStream == null) {
                            throw th;
                        }
                        byteArrayOutputStream.close();
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                    gZIPOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    if (gZIPOutputStream2 != null) {
                        gZIPOutputStream2.close();
                    }
                    if (c2419a != null) {
                        c2419a.close();
                    }
                    if (byteArrayOutputStream == null) {
                        throw th;
                    }
                    byteArrayOutputStream.close();
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                c2419a = null;
                gZIPOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                c2419a = null;
            }
        } catch (IOException e13) {
            e = e13;
            c2419a = null;
            gZIPOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            byteArrayOutputStream = null;
            c2419a = null;
        }
    }

    private static final byte[] j(int i10) {
        if ((i10 & 16) == 16) {
            return f337957n;
        }
        return (i10 & 32) == 32 ? f337959p : f337955l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] k(int i10) {
        if ((i10 & 16) == 16) {
            return f337958o;
        }
        return (i10 & 32) == 32 ? f337960q : f337956m;
    }
}
