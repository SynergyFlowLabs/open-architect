package org.apache.commons.codec.binary;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class d extends g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f335172s = 6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f335173t = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f335174u = 4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final byte[] f335175v = {com.google.common.base.c.f116462o, 10};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte[] f335176w = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte[] f335177x = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final byte[] f335178y = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, kotlin.io.encoding.a.f312535i, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 19, com.google.common.base.c.f116471x, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.C, -1, -1, -1, -1, 63, -1, com.google.common.base.c.D, com.google.common.base.c.E, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, com.google.common.base.c.I, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f335179z = 63;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f335180n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final byte[] f335181o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final byte[] f335182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f335183q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f335184r;

    public d() {
        this(0);
    }

    public static BigInteger A(byte[] bArr) {
        return new BigInteger(1, z(bArr));
    }

    public static byte[] B(byte[] bArr) {
        return C(bArr, false);
    }

    public static byte[] C(byte[] bArr, boolean z10) {
        return D(bArr, z10, false);
    }

    public static byte[] D(byte[] bArr, boolean z10, boolean z11) {
        return E(bArr, z10, z11, Integer.MAX_VALUE);
    }

    public static byte[] E(byte[] bArr, boolean z10, boolean z11, int i10) {
        if (bArr != null && bArr.length != 0) {
            d dVar = z10 ? new d(z11) : new d(0, f335175v, z11);
            long jQ = dVar.q(bArr);
            if (jQ <= i10) {
                return dVar.e(bArr);
            }
            throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + jQ + ") than the specified maximum size of " + i10);
        }
        return bArr;
    }

    public static byte[] F(byte[] bArr) {
        return C(bArr, true);
    }

    public static String G(byte[] bArr) {
        return m.p(C(bArr, false));
    }

    public static byte[] H(byte[] bArr) {
        return D(bArr, false, true);
    }

    public static String I(byte[] bArr) {
        return m.p(D(bArr, false, true));
    }

    public static byte[] J(BigInteger bigInteger) {
        if (bigInteger != null) {
            return C(P(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    @Deprecated
    public static boolean K(byte[] bArr) {
        return N(bArr);
    }

    public static boolean L(byte b10) {
        if (b10 != 61) {
            if (b10 < 0) {
                return false;
            }
            byte[] bArr = f335178y;
            if (b10 >= bArr.length) {
                return false;
            }
            int i10 = 2 ^ (-1);
            if (bArr[b10] == -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean M(String str) {
        return N(m.k(str));
    }

    public static boolean N(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (!L(bArr[i10]) && !g.v(bArr[i10])) {
                return false;
            }
        }
        return true;
    }

    static byte[] P(BigInteger bigInteger) {
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

    public static byte[] y(String str) {
        return new d().j(str);
    }

    public static byte[] z(byte[] bArr) {
        return new d().d(bArr);
    }

    public boolean O() {
        return this.f335180n == f335177x;
    }

    @Override // org.apache.commons.codec.binary.g
    void i(byte[] bArr, int i10, int i11, g.a aVar) {
        byte b10;
        if (aVar.f335203f) {
            return;
        }
        if (i11 < 0) {
            aVar.f335203f = true;
        }
        int i12 = 0;
        while (i12 < i11) {
            byte[] bArrO = o(this.f335183q, aVar);
            int i13 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 == this.f335193b) {
                aVar.f335203f = true;
                break;
            }
            if (b11 >= 0) {
                byte[] bArr2 = f335178y;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i14 = (aVar.f335205h + 1) % 4;
                    aVar.f335205h = i14;
                    int i15 = (aVar.f335198a << 6) + b10;
                    aVar.f335198a = i15;
                    if (i14 == 0) {
                        int i16 = aVar.f335201d;
                        int i17 = i16 + 1;
                        aVar.f335201d = i17;
                        bArrO[i16] = (byte) ((i15 >> 16) & 255);
                        int i18 = i16 + 2;
                        aVar.f335201d = i18;
                        bArrO[i17] = (byte) ((i15 >> 8) & 255);
                        aVar.f335201d = i16 + 3;
                        bArrO[i18] = (byte) (i15 & 255);
                    }
                }
            }
            i12++;
            i10 = i13;
        }
        if (!aVar.f335203f || aVar.f335205h == 0) {
            return;
        }
        byte[] bArrO2 = o(this.f335183q, aVar);
        int i19 = aVar.f335205h;
        if (i19 != 1) {
            if (i19 == 2) {
                int i20 = aVar.f335198a >> 4;
                aVar.f335198a = i20;
                int i21 = aVar.f335201d;
                aVar.f335201d = i21 + 1;
                bArrO2[i21] = (byte) (i20 & 255);
                return;
            }
            if (i19 != 3) {
                throw new IllegalStateException("Impossible modulus " + aVar.f335205h);
            }
            int i22 = aVar.f335198a;
            int i23 = i22 >> 2;
            aVar.f335198a = i23;
            int i24 = aVar.f335201d;
            int i25 = i24 + 1;
            aVar.f335201d = i25;
            bArrO2[i24] = (byte) ((i22 >> 10) & 255);
            aVar.f335201d = i24 + 2;
            bArrO2[i25] = (byte) (i23 & 255);
        }
    }

    @Override // org.apache.commons.codec.binary.g
    void k(byte[] bArr, int i10, int i11, g.a aVar) {
        if (!aVar.f335203f) {
            if (i11 < 0) {
                aVar.f335203f = true;
                if (aVar.f335205h != 0 || this.f335196e != 0) {
                    byte[] bArrO = o(this.f335184r, aVar);
                    int i12 = aVar.f335201d;
                    int i13 = aVar.f335205h;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            int i14 = i12 + 1;
                            aVar.f335201d = i14;
                            byte[] bArr2 = this.f335180n;
                            int i15 = aVar.f335198a;
                            bArrO[i12] = bArr2[(i15 >> 2) & 63];
                            int i16 = i12 + 2;
                            aVar.f335201d = i16;
                            bArrO[i14] = bArr2[(i15 << 4) & 63];
                            if (bArr2 == f335176w) {
                                int i17 = i12 + 3;
                                aVar.f335201d = i17;
                                byte b10 = this.f335193b;
                                bArrO[i16] = b10;
                                aVar.f335201d = i12 + 4;
                                bArrO[i17] = b10;
                            }
                        } else {
                            if (i13 != 2) {
                                throw new IllegalStateException("Impossible modulus " + aVar.f335205h);
                            }
                            int i18 = i12 + 1;
                            aVar.f335201d = i18;
                            byte[] bArr3 = this.f335180n;
                            int i19 = aVar.f335198a;
                            bArrO[i12] = bArr3[(i19 >> 10) & 63];
                            int i20 = i12 + 2;
                            aVar.f335201d = i20;
                            bArrO[i18] = bArr3[(i19 >> 4) & 63];
                            int i21 = i12 + 3;
                            aVar.f335201d = i21;
                            bArrO[i20] = bArr3[(i19 << 2) & 63];
                            if (bArr3 == f335176w) {
                                aVar.f335201d = i12 + 4;
                                bArrO[i21] = this.f335193b;
                            }
                        }
                    }
                    int i22 = aVar.f335204g;
                    int i23 = aVar.f335201d;
                    int i24 = i22 + (i23 - i12);
                    aVar.f335204g = i24;
                    if (this.f335196e > 0 && i24 > 0) {
                        byte[] bArr4 = this.f335182p;
                        System.arraycopy(bArr4, 0, bArrO, i23, bArr4.length);
                        aVar.f335201d += this.f335182p.length;
                    }
                }
            } else {
                int i25 = 0;
                while (i25 < i11) {
                    byte[] bArrO2 = o(this.f335184r, aVar);
                    int i26 = (aVar.f335205h + 1) % 3;
                    aVar.f335205h = i26;
                    int i27 = i10 + 1;
                    int i28 = bArr[i10];
                    if (i28 < 0) {
                        i28 += 256;
                    }
                    int i29 = (aVar.f335198a << 8) + i28;
                    aVar.f335198a = i29;
                    if (i26 == 0) {
                        int i30 = aVar.f335201d;
                        int i31 = i30 + 1;
                        aVar.f335201d = i31;
                        byte[] bArr5 = this.f335180n;
                        bArrO2[i30] = bArr5[(i29 >> 18) & 63];
                        int i32 = i30 + 2;
                        aVar.f335201d = i32;
                        bArrO2[i31] = bArr5[(i29 >> 12) & 63];
                        int i33 = i30 + 3;
                        aVar.f335201d = i33;
                        bArrO2[i32] = bArr5[(i29 >> 6) & 63];
                        int i34 = i30 + 4;
                        aVar.f335201d = i34;
                        bArrO2[i33] = bArr5[i29 & 63];
                        int i35 = aVar.f335204g + 4;
                        aVar.f335204g = i35;
                        int i36 = this.f335196e;
                        if (i36 > 0 && i36 <= i35) {
                            byte[] bArr6 = this.f335182p;
                            System.arraycopy(bArr6, 0, bArrO2, i34, bArr6.length);
                            aVar.f335201d += this.f335182p.length;
                            aVar.f335204g = 0;
                        }
                    }
                    i25++;
                    i10 = i27;
                }
            }
        }
    }

    @Override // org.apache.commons.codec.binary.g
    protected boolean s(byte b10) {
        if (b10 >= 0) {
            byte[] bArr = this.f335181o;
            if (b10 < bArr.length && bArr[b10] != -1) {
                return true;
            }
        }
        return false;
    }

    public d(boolean z10) {
        this(76, f335175v, z10);
    }

    public d(int i10) {
        this(i10, f335175v);
    }

    public d(int i10, byte[] bArr) {
        this(i10, bArr, false);
    }

    public d(int i10, byte[] bArr, boolean z10) {
        super(3, 4, i10, bArr == null ? 0 : bArr.length);
        this.f335181o = f335178y;
        if (bArr == null) {
            this.f335184r = 4;
            this.f335182p = null;
        } else {
            if (h(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + m.t(bArr) + "]");
            }
            if (i10 > 0) {
                this.f335184r = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.f335182p = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.f335184r = 4;
                this.f335182p = null;
            }
        }
        this.f335183q = this.f335184r - 1;
        this.f335180n = z10 ? f335177x : f335176w;
    }
}
