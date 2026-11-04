package org.apache.commons.codec.binary;

/* JADX INFO: loaded from: classes9.dex */
public class a extends g {
    private static final int A = 31;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f335159s = 5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f335160t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f335161u = 5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f335162v = {com.google.common.base.c.f116462o, 10};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte[] f335163w = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, com.google.common.base.c.D, com.google.common.base.c.E, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, com.google.common.base.c.I, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 19, com.google.common.base.c.f116471x, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.C, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 19, com.google.common.base.c.f116471x, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.C};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte[] f335164x = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final byte[] f335165y = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 19, com.google.common.base.c.f116471x, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.C, com.google.common.base.c.D, com.google.common.base.c.E, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, com.google.common.base.c.I, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, com.google.common.base.c.f116464q, com.google.common.base.c.f116465r, 17, com.google.common.base.c.f116468u, 19, com.google.common.base.c.f116471x, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.C, com.google.common.base.c.D, com.google.common.base.c.E, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, com.google.common.base.c.I};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final byte[] f335166z = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f335167n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final byte[] f335168o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f335169p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final byte[] f335170q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final byte[] f335171r;

    public a() {
        this(false);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [int] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // org.apache.commons.codec.binary.g
    void i(byte[] bArr, int i10, int i11, g.a aVar) {
        ?? r15;
        byte b10;
        if (aVar.f335203f) {
            return;
        }
        ?? r10 = 1;
        if (i11 < 0) {
            aVar.f335203f = true;
        }
        int i12 = 0;
        int i13 = i10;
        while (i12 < i11) {
            int i14 = i13 + 1;
            byte b11 = bArr[i13];
            if (b11 == this.f335193b) {
                aVar.f335203f = r10;
                break;
            }
            byte[] bArrO = o(this.f335167n, aVar);
            if (b11 >= 0) {
                byte[] bArr2 = this.f335168o;
                if (b11 >= bArr2.length || (b10 = bArr2[b11]) < 0) {
                    r15 = r10;
                } else {
                    int i15 = (aVar.f335205h + r10) % 8;
                    aVar.f335205h = i15;
                    r15 = r10;
                    long j10 = (aVar.f335199b << 5) + ((long) b10);
                    aVar.f335199b = j10;
                    if (i15 == 0) {
                        int i16 = aVar.f335201d;
                        int i17 = i16 + 1;
                        aVar.f335201d = i17;
                        bArrO[i16] = (byte) ((j10 >> 32) & 255);
                        int i18 = i16 + 2;
                        aVar.f335201d = i18;
                        bArrO[i17] = (byte) ((j10 >> 24) & 255);
                        int i19 = i16 + 3;
                        aVar.f335201d = i19;
                        bArrO[i18] = (byte) ((j10 >> 16) & 255);
                        int i20 = i16 + 4;
                        aVar.f335201d = i20;
                        bArrO[i19] = (byte) ((j10 >> 8) & 255);
                        aVar.f335201d = i16 + 5;
                        bArrO[i20] = (byte) (j10 & 255);
                    }
                }
            } else {
                r15 = r10;
            }
            i12++;
            i13 = i14;
            r10 = r15;
        }
        ?? r16 = r10;
        if (!aVar.f335203f || aVar.f335205h < 2) {
            return;
        }
        byte[] bArrO2 = o(this.f335167n, aVar);
        switch (aVar.f335205h) {
            case 2:
                int i21 = aVar.f335201d;
                aVar.f335201d = i21 + 1;
                bArrO2[i21] = (byte) ((aVar.f335199b >> 2) & 255);
                return;
            case 3:
                int i22 = aVar.f335201d;
                aVar.f335201d = i22 + 1;
                bArrO2[i22] = (byte) ((aVar.f335199b >> 7) & 255);
                return;
            case 4:
                long j11 = aVar.f335199b;
                long j12 = j11 >> 4;
                aVar.f335199b = j12;
                int i23 = aVar.f335201d;
                int i24 = i23 + 1;
                aVar.f335201d = i24;
                bArrO2[i23] = (byte) ((j11 >> 12) & 255);
                aVar.f335201d = i23 + 2;
                bArrO2[i24] = (byte) (j12 & 255);
                return;
            case 5:
                long j13 = aVar.f335199b;
                long j14 = j13 >> (r16 == true ? 1L : 0L);
                aVar.f335199b = j14;
                int i25 = aVar.f335201d;
                int i26 = i25 + 1;
                aVar.f335201d = i26;
                bArrO2[i25] = (byte) ((j13 >> 17) & 255);
                int i27 = i25 + 2;
                aVar.f335201d = i27;
                bArrO2[i26] = (byte) ((j13 >> 9) & 255);
                aVar.f335201d = i25 + 3;
                bArrO2[i27] = (byte) (j14 & 255);
                return;
            case 6:
                long j15 = aVar.f335199b;
                long j16 = j15 >> 6;
                aVar.f335199b = j16;
                int i28 = aVar.f335201d;
                int i29 = i28 + 1;
                aVar.f335201d = i29;
                bArrO2[i28] = (byte) ((j15 >> 22) & 255);
                int i30 = i28 + 2;
                aVar.f335201d = i30;
                bArrO2[i29] = (byte) ((j15 >> 14) & 255);
                aVar.f335201d = i28 + 3;
                bArrO2[i30] = (byte) (j16 & 255);
                return;
            case 7:
                long j17 = aVar.f335199b;
                long j18 = j17 >> 3;
                aVar.f335199b = j18;
                int i31 = aVar.f335201d;
                int i32 = i31 + 1;
                aVar.f335201d = i32;
                bArrO2[i31] = (byte) ((j17 >> 27) & 255);
                int i33 = i31 + 2;
                aVar.f335201d = i33;
                bArrO2[i32] = (byte) ((j17 >> 19) & 255);
                int i34 = i31 + 3;
                aVar.f335201d = i34;
                bArrO2[i33] = (byte) ((j17 >> 11) & 255);
                aVar.f335201d = i31 + 4;
                bArrO2[i34] = (byte) (j18 & 255);
                return;
            default:
                throw new IllegalStateException("Impossible modulus " + aVar.f335205h);
        }
    }

    @Override // org.apache.commons.codec.binary.g
    void k(byte[] bArr, int i10, int i11, g.a aVar) {
        int i12;
        if (aVar.f335203f) {
            return;
        }
        int i13 = 1;
        if (i11 >= 0) {
            int i14 = i10;
            int i15 = 0;
            while (i15 < i11) {
                byte[] bArrO = o(this.f335169p, aVar);
                int i16 = (aVar.f335205h + i13) % 5;
                aVar.f335205h = i16;
                int i17 = i14 + 1;
                int i18 = bArr[i14];
                if (i18 < 0) {
                    i18 += 256;
                }
                long j10 = (aVar.f335199b << 8) + ((long) i18);
                aVar.f335199b = j10;
                if (i16 == 0) {
                    int i19 = aVar.f335201d;
                    int i20 = i19 + 1;
                    aVar.f335201d = i20;
                    byte[] bArr2 = this.f335170q;
                    bArrO[i19] = bArr2[((int) (j10 >> 35)) & 31];
                    int i21 = i19 + 2;
                    aVar.f335201d = i21;
                    i12 = i17;
                    bArrO[i20] = bArr2[((int) (j10 >> 30)) & 31];
                    int i22 = i19 + 3;
                    aVar.f335201d = i22;
                    bArrO[i21] = bArr2[((int) (j10 >> 25)) & 31];
                    int i23 = i19 + 4;
                    aVar.f335201d = i23;
                    bArrO[i22] = bArr2[((int) (j10 >> 20)) & 31];
                    int i24 = i19 + 5;
                    aVar.f335201d = i24;
                    bArrO[i23] = bArr2[((int) (j10 >> 15)) & 31];
                    int i25 = i19 + 6;
                    aVar.f335201d = i25;
                    bArrO[i24] = bArr2[((int) (j10 >> 10)) & 31];
                    int i26 = i19 + 7;
                    aVar.f335201d = i26;
                    bArrO[i25] = bArr2[((int) (j10 >> 5)) & 31];
                    int i27 = i19 + 8;
                    aVar.f335201d = i27;
                    bArrO[i26] = bArr2[((int) j10) & 31];
                    int i28 = aVar.f335204g + 8;
                    aVar.f335204g = i28;
                    int i29 = this.f335196e;
                    if (i29 > 0 && i29 <= i28) {
                        byte[] bArr3 = this.f335171r;
                        System.arraycopy(bArr3, 0, bArrO, i27, bArr3.length);
                        aVar.f335201d += this.f335171r.length;
                        aVar.f335204g = 0;
                    }
                } else {
                    i12 = i17;
                }
                i15++;
                i14 = i12;
                i13 = 1;
            }
            return;
        }
        aVar.f335203f = true;
        if (aVar.f335205h == 0 && this.f335196e == 0) {
            return;
        }
        byte[] bArrO2 = o(this.f335169p, aVar);
        int i30 = aVar.f335201d;
        int i31 = aVar.f335205h;
        if (i31 != 0) {
            if (i31 == 1) {
                int i32 = i30 + 1;
                aVar.f335201d = i32;
                byte[] bArr4 = this.f335170q;
                long j11 = aVar.f335199b;
                bArrO2[i30] = bArr4[((int) (j11 >> 3)) & 31];
                int i33 = i30 + 2;
                aVar.f335201d = i33;
                bArrO2[i32] = bArr4[((int) (j11 << 2)) & 31];
                int i34 = i30 + 3;
                aVar.f335201d = i34;
                byte b10 = this.f335193b;
                bArrO2[i33] = b10;
                int i35 = i30 + 4;
                aVar.f335201d = i35;
                bArrO2[i34] = b10;
                int i36 = i30 + 5;
                aVar.f335201d = i36;
                bArrO2[i35] = b10;
                int i37 = i30 + 6;
                aVar.f335201d = i37;
                bArrO2[i36] = b10;
                int i38 = i30 + 7;
                aVar.f335201d = i38;
                bArrO2[i37] = b10;
                aVar.f335201d = i30 + 8;
                bArrO2[i38] = b10;
            } else if (i31 == 2) {
                int i39 = i30 + 1;
                aVar.f335201d = i39;
                byte[] bArr5 = this.f335170q;
                long j12 = aVar.f335199b;
                bArrO2[i30] = bArr5[((int) (j12 >> 11)) & 31];
                int i40 = i30 + 2;
                aVar.f335201d = i40;
                bArrO2[i39] = bArr5[((int) (j12 >> 6)) & 31];
                int i41 = i30 + 3;
                aVar.f335201d = i41;
                bArrO2[i40] = bArr5[((int) (j12 >> 1)) & 31];
                int i42 = i30 + 4;
                aVar.f335201d = i42;
                bArrO2[i41] = bArr5[((int) (j12 << 4)) & 31];
                int i43 = i30 + 5;
                aVar.f335201d = i43;
                byte b11 = this.f335193b;
                bArrO2[i42] = b11;
                int i44 = i30 + 6;
                aVar.f335201d = i44;
                bArrO2[i43] = b11;
                int i45 = i30 + 7;
                aVar.f335201d = i45;
                bArrO2[i44] = b11;
                aVar.f335201d = i30 + 8;
                bArrO2[i45] = b11;
            } else if (i31 == 3) {
                int i46 = i30 + 1;
                aVar.f335201d = i46;
                byte[] bArr6 = this.f335170q;
                long j13 = aVar.f335199b;
                bArrO2[i30] = bArr6[((int) (j13 >> 19)) & 31];
                int i47 = i30 + 2;
                aVar.f335201d = i47;
                bArrO2[i46] = bArr6[((int) (j13 >> 14)) & 31];
                int i48 = i30 + 3;
                aVar.f335201d = i48;
                bArrO2[i47] = bArr6[((int) (j13 >> 9)) & 31];
                int i49 = i30 + 4;
                aVar.f335201d = i49;
                bArrO2[i48] = bArr6[((int) (j13 >> 4)) & 31];
                int i50 = i30 + 5;
                aVar.f335201d = i50;
                bArrO2[i49] = bArr6[((int) (j13 << 1)) & 31];
                int i51 = i30 + 6;
                aVar.f335201d = i51;
                byte b12 = this.f335193b;
                bArrO2[i50] = b12;
                int i52 = i30 + 7;
                aVar.f335201d = i52;
                bArrO2[i51] = b12;
                aVar.f335201d = i30 + 8;
                bArrO2[i52] = b12;
            } else {
                if (i31 != 4) {
                    throw new IllegalStateException("Impossible modulus " + aVar.f335205h);
                }
                int i53 = i30 + 1;
                aVar.f335201d = i53;
                byte[] bArr7 = this.f335170q;
                long j14 = aVar.f335199b;
                bArrO2[i30] = bArr7[((int) (j14 >> 27)) & 31];
                int i54 = i30 + 2;
                aVar.f335201d = i54;
                bArrO2[i53] = bArr7[((int) (j14 >> 22)) & 31];
                int i55 = i30 + 3;
                aVar.f335201d = i55;
                bArrO2[i54] = bArr7[((int) (j14 >> 17)) & 31];
                int i56 = i30 + 4;
                aVar.f335201d = i56;
                bArrO2[i55] = bArr7[((int) (j14 >> 12)) & 31];
                int i57 = i30 + 5;
                aVar.f335201d = i57;
                bArrO2[i56] = bArr7[((int) (j14 >> 7)) & 31];
                int i58 = i30 + 6;
                aVar.f335201d = i58;
                bArrO2[i57] = bArr7[((int) (j14 >> 2)) & 31];
                int i59 = i30 + 7;
                aVar.f335201d = i59;
                bArrO2[i58] = bArr7[((int) (j14 << 3)) & 31];
                aVar.f335201d = i30 + 8;
                bArrO2[i59] = this.f335193b;
            }
        }
        int i60 = aVar.f335204g;
        int i61 = aVar.f335201d;
        int i62 = i60 + (i61 - i30);
        aVar.f335204g = i62;
        if (this.f335196e <= 0 || i62 <= 0) {
            return;
        }
        byte[] bArr8 = this.f335171r;
        System.arraycopy(bArr8, 0, bArrO2, i61, bArr8.length);
        aVar.f335201d += this.f335171r.length;
    }

    @Override // org.apache.commons.codec.binary.g
    public boolean s(byte b10) {
        if (b10 < 0) {
            return false;
        }
        byte[] bArr = this.f335168o;
        return b10 < bArr.length && bArr[b10] != -1;
    }

    public a(byte b10) {
        this(false, b10);
    }

    public a(boolean z10) {
        this(0, null, z10, kotlin.io.encoding.a.f312535i);
    }

    public a(boolean z10, byte b10) {
        this(0, null, z10, b10);
    }

    public a(int i10) {
        this(i10, f335162v);
    }

    public a(int i10, byte[] bArr) {
        this(i10, bArr, false, kotlin.io.encoding.a.f312535i);
    }

    public a(int i10, byte[] bArr, boolean z10) {
        this(i10, bArr, z10, kotlin.io.encoding.a.f312535i);
    }

    public a(int i10, byte[] bArr, boolean z10, byte b10) {
        super(5, 8, i10, bArr == null ? 0 : bArr.length, b10);
        if (z10) {
            this.f335170q = f335166z;
            this.f335168o = f335165y;
        } else {
            this.f335170q = f335164x;
            this.f335168o = f335163w;
        }
        if (i10 <= 0) {
            this.f335169p = 8;
            this.f335171r = null;
        } else if (bArr != null) {
            if (!h(bArr)) {
                this.f335169p = bArr.length + 8;
                byte[] bArr2 = new byte[bArr.length];
                this.f335171r = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                throw new IllegalArgumentException("lineSeparator must not contain Base32 characters: [" + m.t(bArr) + "]");
            }
        } else {
            throw new IllegalArgumentException("lineLength " + i10 + " > 0, but lineSeparator is null");
        }
        this.f335167n = this.f335169p - 1;
        if (s(b10) || g.v(b10)) {
            throw new IllegalArgumentException("pad must not be in alphabet or whitespace");
        }
    }
}
