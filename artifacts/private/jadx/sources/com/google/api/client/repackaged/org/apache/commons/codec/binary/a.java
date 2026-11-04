package com.google.api.client.repackaged.org.apache.commons.codec.binary;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class a extends b {
    static final byte[] A = {com.google.common.base.c.f116462o, 10};
    private static final byte[] B = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] C = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] D = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, kotlin.io.encoding.a.f312535i, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 19, com.google.common.base.c.f116471x, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.C, -1, -1, -1, -1, 63, -1, com.google.common.base.c.D, com.google.common.base.c.E, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, com.google.common.base.c.I, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private static final int E = 63;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f115948x = 6;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f115949y = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f115950z = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final byte[] f115951r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final byte[] f115952s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final byte[] f115953t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f115954u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f115955v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f115956w;

    public a() {
        this(0);
    }

    public static byte[] A(byte[] bArr, boolean z10) {
        return B(bArr, z10, false);
    }

    public static byte[] B(byte[] bArr, boolean z10, boolean z11) {
        return C(bArr, z10, z11, Integer.MAX_VALUE);
    }

    public static byte[] C(byte[] bArr, boolean z10, boolean z11, int i10) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = z10 ? new a(z11) : new a(0, A, z11);
        long jN = aVar.n(bArr);
        if (jN <= i10) {
            return aVar.e(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + jN + ") than the specified maximum size of " + i10);
    }

    public static byte[] D(byte[] bArr) {
        return A(bArr, true);
    }

    public static String E(byte[] bArr) {
        return c.o(A(bArr, false));
    }

    public static byte[] F(byte[] bArr) {
        return B(bArr, false, true);
    }

    public static String G(byte[] bArr) {
        return c.o(B(bArr, false, true));
    }

    public static byte[] H(BigInteger bigInteger) {
        if (bigInteger != null) {
            return A(N(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    public static boolean I(byte[] bArr) {
        return L(bArr);
    }

    public static boolean J(byte b10) {
        if (b10 == 61) {
            return true;
        }
        if (b10 < 0) {
            return false;
        }
        byte[] bArr = D;
        return b10 < bArr.length && bArr[b10] != -1;
    }

    public static boolean K(String str) {
        return L(c.g(str));
    }

    public static boolean L(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (!J(bArr[i10]) && !b.s(bArr[i10])) {
                return false;
            }
        }
        return true;
    }

    static byte[] N(BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i10 = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == iBitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i10 = 0;
        }
        int i11 = iBitLength / 8;
        int i12 = i11 - length;
        byte[] bArr = new byte[i11];
        System.arraycopy(byteArray, i10, bArr, i12, length);
        return bArr;
    }

    public static byte[] w(String str) {
        return new a().h(str);
    }

    public static byte[] x(byte[] bArr) {
        return new a().d(bArr);
    }

    public static BigInteger y(byte[] bArr) {
        return new BigInteger(1, x(bArr));
    }

    public static byte[] z(byte[] bArr) {
        return A(bArr, false);
    }

    public boolean M() {
        return this.f115951r == C;
    }

    @Override // com.google.api.client.repackaged.org.apache.commons.codec.binary.b
    void g(byte[] bArr, int i10, int i11) {
        byte b10;
        if (this.f115971i) {
            return;
        }
        if (i11 < 0) {
            this.f115971i = true;
        }
        int i12 = 0;
        while (i12 < i11) {
            l(this.f115954u);
            int i13 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 == 61) {
                this.f115971i = true;
                break;
            }
            if (b11 >= 0) {
                byte[] bArr2 = D;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i14 = (this.f115973k + 1) % 4;
                    this.f115973k = i14;
                    int i15 = (this.f115956w << 6) + b10;
                    this.f115956w = i15;
                    if (i14 == 0) {
                        byte[] bArr3 = this.f115968f;
                        int i16 = this.f115969g;
                        int i17 = i16 + 1;
                        this.f115969g = i17;
                        bArr3[i16] = (byte) ((i15 >> 16) & 255);
                        int i18 = i16 + 2;
                        this.f115969g = i18;
                        bArr3[i17] = (byte) ((i15 >> 8) & 255);
                        this.f115969g = i16 + 3;
                        bArr3[i18] = (byte) (i15 & 255);
                    }
                }
            }
            i12++;
            i10 = i13;
        }
        if (!this.f115971i || this.f115973k == 0) {
            return;
        }
        l(this.f115954u);
        int i19 = this.f115973k;
        if (i19 == 2) {
            int i20 = this.f115956w >> 4;
            this.f115956w = i20;
            byte[] bArr4 = this.f115968f;
            int i21 = this.f115969g;
            this.f115969g = i21 + 1;
            bArr4[i21] = (byte) (i20 & 255);
            return;
        }
        if (i19 != 3) {
            return;
        }
        int i22 = this.f115956w;
        int i23 = i22 >> 2;
        this.f115956w = i23;
        byte[] bArr5 = this.f115968f;
        int i24 = this.f115969g;
        int i25 = i24 + 1;
        this.f115969g = i25;
        bArr5[i24] = (byte) ((i22 >> 10) & 255);
        this.f115969g = i24 + 2;
        bArr5[i25] = (byte) (i23 & 255);
    }

    @Override // com.google.api.client.repackaged.org.apache.commons.codec.binary.b
    void i(byte[] bArr, int i10, int i11) {
        if (!this.f115971i) {
            if (i11 < 0) {
                this.f115971i = true;
                if (this.f115973k != 0 || this.f115966d != 0) {
                    l(this.f115955v);
                    int i12 = this.f115969g;
                    int i13 = this.f115973k;
                    if (i13 == 1) {
                        byte[] bArr2 = this.f115968f;
                        int i14 = i12 + 1;
                        this.f115969g = i14;
                        byte[] bArr3 = this.f115951r;
                        int i15 = this.f115956w;
                        bArr2[i12] = bArr3[(i15 >> 2) & 63];
                        int i16 = i12 + 2;
                        this.f115969g = i16;
                        bArr2[i14] = bArr3[(i15 << 4) & 63];
                        if (bArr3 == B) {
                            int i17 = i12 + 3;
                            this.f115969g = i17;
                            bArr2[i16] = kotlin.io.encoding.a.f312535i;
                            this.f115969g = i12 + 4;
                            bArr2[i17] = kotlin.io.encoding.a.f312535i;
                        }
                    } else if (i13 == 2) {
                        byte[] bArr4 = this.f115968f;
                        int i18 = i12 + 1;
                        this.f115969g = i18;
                        byte[] bArr5 = this.f115951r;
                        int i19 = this.f115956w;
                        bArr4[i12] = bArr5[(i19 >> 10) & 63];
                        int i20 = i12 + 2;
                        this.f115969g = i20;
                        bArr4[i18] = bArr5[(i19 >> 4) & 63];
                        int i21 = i12 + 3;
                        this.f115969g = i21;
                        bArr4[i20] = bArr5[(i19 << 2) & 63];
                        if (bArr5 == B) {
                            this.f115969g = i12 + 4;
                            bArr4[i21] = kotlin.io.encoding.a.f312535i;
                        }
                    }
                    int i22 = this.f115972j;
                    int i23 = this.f115969g;
                    int i24 = i22 + (i23 - i12);
                    this.f115972j = i24;
                    if (this.f115966d > 0 && i24 > 0) {
                        byte[] bArr6 = this.f115953t;
                        System.arraycopy(bArr6, 0, this.f115968f, i23, bArr6.length);
                        this.f115969g += this.f115953t.length;
                    }
                }
            } else {
                int i25 = 0;
                while (i25 < i11) {
                    l(this.f115955v);
                    int i26 = (this.f115973k + 1) % 3;
                    this.f115973k = i26;
                    int i27 = i10 + 1;
                    int i28 = bArr[i10];
                    if (i28 < 0) {
                        i28 += 256;
                    }
                    int i29 = (this.f115956w << 8) + i28;
                    this.f115956w = i29;
                    if (i26 == 0) {
                        byte[] bArr7 = this.f115968f;
                        int i30 = this.f115969g;
                        int i31 = i30 + 1;
                        this.f115969g = i31;
                        byte[] bArr8 = this.f115951r;
                        bArr7[i30] = bArr8[(i29 >> 18) & 63];
                        int i32 = i30 + 2;
                        this.f115969g = i32;
                        bArr7[i31] = bArr8[(i29 >> 12) & 63];
                        int i33 = i30 + 3;
                        this.f115969g = i33;
                        bArr7[i32] = bArr8[(i29 >> 6) & 63];
                        int i34 = i30 + 4;
                        this.f115969g = i34;
                        bArr7[i33] = bArr8[i29 & 63];
                        int i35 = this.f115972j + 4;
                        this.f115972j = i35;
                        int i36 = this.f115966d;
                        if (i36 > 0 && i36 <= i35) {
                            byte[] bArr9 = this.f115953t;
                            System.arraycopy(bArr9, 0, bArr7, i34, bArr9.length);
                            this.f115969g += this.f115953t.length;
                            this.f115972j = 0;
                        }
                    }
                    i25++;
                    i10 = i27;
                }
            }
        }
    }

    @Override // com.google.api.client.repackaged.org.apache.commons.codec.binary.b
    protected boolean p(byte b10) {
        if (b10 >= 0) {
            byte[] bArr = this.f115952s;
            if (b10 < bArr.length && bArr[b10] != -1) {
                return true;
            }
        }
        return false;
    }

    public a(boolean z10) {
        this(76, A, z10);
    }

    public a(int i10) {
        this(i10, A);
    }

    public a(int i10, byte[] bArr) {
        this(i10, bArr, false);
    }

    public a(int i10, byte[] bArr, boolean z10) {
        super(3, 4, i10, bArr == null ? 0 : bArr.length);
        this.f115952s = D;
        if (bArr != null) {
            if (f(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + c.o(bArr) + "]");
            }
            if (i10 > 0) {
                this.f115955v = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.f115953t = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.f115955v = 4;
                this.f115953t = null;
            }
        } else {
            this.f115955v = 4;
            this.f115953t = null;
        }
        this.f115954u = this.f115955v - 1;
        this.f115951r = z10 ? C : B;
    }
}
