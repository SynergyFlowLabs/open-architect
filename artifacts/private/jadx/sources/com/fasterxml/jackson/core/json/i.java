package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class i extends c {

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final byte f102589q3 = 48;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final byte f102590r3 = 91;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final byte f102591s3 = 93;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final byte f102592t3 = 123;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final byte f102593u3 = 125;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final byte f102594v3 = 92;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final byte f102595w3 = 44;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final byte f102596x3 = 58;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private static final int f102597y3 = 512;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    protected byte f102599g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    protected byte[] f102600h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    protected int f102601i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    protected final int f102602j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    protected final int f102603k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    protected char[] f102604l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    protected final int f102605m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    protected byte[] f102606n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    protected boolean f102607o3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    protected final OutputStream f102608p2;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private static final byte[] f102598z3 = com.fasterxml.jackson.core.io.a.c();

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final byte f102588p3 = 117;
    private static final byte[] A3 = {110, f102588p3, 108, 108};
    private static final byte[] B3 = {116, 114, f102588p3, 101};
    private static final byte[] C3 = {102, 97, 108, 115, 101};

    public i(com.fasterxml.jackson.core.io.d dVar, int i10, q qVar, OutputStream outputStream) {
        super(dVar, i10, qVar);
        this.f102599g3 = (byte) 34;
        this.f102608p2 = outputStream;
        this.f102607o3 = true;
        byte[] bArrL = dVar.l();
        this.f102600h3 = bArrL;
        int length = bArrL.length;
        this.f102602j3 = length;
        this.f102603k3 = length >> 3;
        char[] cArrF = dVar.f();
        this.f102604l3 = cArrF;
        this.f102605m3 = cArrF.length;
        if (g0(com.fasterxml.jackson.core.h.b.ESCAPE_NON_ASCII)) {
            y0(127);
        }
    }

    private final void C4(char[] cArr, int i10, int i11) throws IOException {
        int i12 = this.f102602j3;
        byte[] bArr = this.f102600h3;
        int i13 = i11 + i10;
        loop0: while (i10 < i13) {
            while (true) {
                char c10 = cArr[i10];
                if (c10 >= 128) {
                    break;
                }
                if (this.f102601i3 >= i12) {
                    F3();
                }
                int i14 = this.f102601i3;
                this.f102601i3 = i14 + 1;
                bArr[i14] = (byte) c10;
                i10++;
                if (i10 >= i13) {
                    break loop0;
                }
            }
            if (this.f102601i3 + 3 >= this.f102602j3) {
                F3();
            }
            int i15 = i10 + 1;
            char c11 = cArr[i10];
            if (c11 < 2048) {
                int i16 = this.f102601i3;
                int i17 = i16 + 1;
                this.f102601i3 = i17;
                bArr[i16] = (byte) ((c11 >> 6) | 192);
                this.f102601i3 = i16 + 2;
                bArr[i17] = (byte) ((c11 & '?') | 128);
                i10 = i15;
            } else {
                i10 = I3(c11, cArr, i15, i13);
            }
        }
    }

    private final void D4(String str, int i10, int i11) throws IOException {
        int i12 = i11 + i10;
        int i13 = this.f102601i3;
        byte[] bArr = this.f102600h3;
        int[] iArr = this.X;
        while (i10 < i12) {
            char cCharAt = str.charAt(i10);
            if (cCharAt > 127 || iArr[cCharAt] != 0) {
                break;
            }
            bArr[i13] = (byte) cCharAt;
            i10++;
            i13++;
        }
        this.f102601i3 = i13;
        if (i10 < i12) {
            if (this.Z != null) {
                f4(str, i10, i12);
            } else if (this.Y == 0) {
                H4(str, i10, i12);
            } else {
                J4(str, i10, i12);
            }
        }
    }

    private final void E4(char[] cArr, int i10, int i11) throws IOException {
        int i12 = i11 + i10;
        int i13 = this.f102601i3;
        byte[] bArr = this.f102600h3;
        int[] iArr = this.X;
        while (i10 < i12) {
            char c10 = cArr[i10];
            if (c10 > 127 || iArr[c10] != 0) {
                break;
            }
            bArr[i13] = (byte) c10;
            i10++;
            i13++;
        }
        this.f102601i3 = i13;
        if (i10 < i12) {
            if (this.Z != null) {
                g4(cArr, i10, i12);
            } else if (this.Y == 0) {
                I4(cArr, i10, i12);
            } else {
                N4(cArr, i10, i12);
            }
        }
    }

    private final int G3(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IOException {
        int length = bArr2.length;
        if (i10 + length > i11) {
            this.f102601i3 = i10;
            F3();
            int i13 = this.f102601i3;
            if (length > bArr.length) {
                this.f102608p2.write(bArr2, 0, length);
                return i13;
            }
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i10 = i13 + length;
        }
        if ((i12 * 6) + i10 <= i11) {
            return i10;
        }
        F3();
        return this.f102601i3;
    }

    private final int H3(int i10, int i11) throws IOException {
        byte[] bArr = this.f102600h3;
        if (i10 < 55296 || i10 > 57343) {
            bArr[i11] = (byte) ((i10 >> 12) | 224);
            int i12 = i11 + 2;
            bArr[i11 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            int i13 = i11 + 3;
            bArr[i12] = (byte) ((i10 & 63) | 128);
            return i13;
        }
        bArr[i11] = f102594v3;
        bArr[i11 + 1] = f102588p3;
        byte[] bArr2 = f102598z3;
        bArr[i11 + 2] = bArr2[(i10 >> 12) & 15];
        bArr[i11 + 3] = bArr2[(i10 >> 8) & 15];
        int i14 = i11 + 5;
        bArr[i11 + 4] = bArr2[(i10 >> 4) & 15];
        int i15 = i11 + 6;
        bArr[i14] = bArr2[i10 & 15];
        return i15;
    }

    private final void H4(String str, int i10, int i11) throws IOException {
        if (this.f102601i3 + ((i11 - i10) * 6) > this.f102602j3) {
            F3();
        }
        int iH3 = this.f102601i3;
        byte[] bArr = this.f102600h3;
        int[] iArr = this.X;
        while (i10 < i11) {
            i10++;
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 127) {
                int i12 = iArr[cCharAt];
                if (i12 == 0) {
                    bArr[iH3] = (byte) cCharAt;
                    iH3++;
                } else if (i12 > 0) {
                    int i13 = iH3 + 1;
                    bArr[iH3] = f102594v3;
                    iH3 += 2;
                    bArr[i13] = (byte) i12;
                } else {
                    iH3 = h4(cCharAt, iH3);
                }
            } else if (cCharAt <= 2047) {
                int i14 = iH3 + 1;
                bArr[iH3] = (byte) ((cCharAt >> 6) | 192);
                iH3 += 2;
                bArr[i14] = (byte) ((cCharAt & '?') | 128);
            } else {
                iH3 = H3(cCharAt, iH3);
            }
        }
        this.f102601i3 = iH3;
    }

    private final int I3(int i10, char[] cArr, int i11, int i12) throws IOException {
        if (i10 >= 55296 && i10 <= 57343) {
            if (i11 >= i12 || cArr == null) {
                a(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i10)));
            }
            M3(i10, cArr[i11]);
            return i11 + 1;
        }
        byte[] bArr = this.f102600h3;
        int i13 = this.f102601i3;
        int i14 = i13 + 1;
        this.f102601i3 = i14;
        bArr[i13] = (byte) ((i10 >> 12) | 224);
        int i15 = i13 + 2;
        this.f102601i3 = i15;
        bArr[i14] = (byte) (((i10 >> 6) & 63) | 128);
        this.f102601i3 = i13 + 3;
        bArr[i15] = (byte) ((i10 & 63) | 128);
        return i11;
    }

    private final void I4(char[] cArr, int i10, int i11) throws IOException {
        if (this.f102601i3 + ((i11 - i10) * 6) > this.f102602j3) {
            F3();
        }
        int iH3 = this.f102601i3;
        byte[] bArr = this.f102600h3;
        int[] iArr = this.X;
        while (i10 < i11) {
            i10++;
            char c10 = cArr[i10];
            if (c10 <= 127) {
                int i12 = iArr[c10];
                if (i12 == 0) {
                    bArr[iH3] = (byte) c10;
                    iH3++;
                } else if (i12 > 0) {
                    int i13 = iH3 + 1;
                    bArr[iH3] = f102594v3;
                    iH3 += 2;
                    bArr[i13] = (byte) i12;
                } else {
                    iH3 = h4(c10, iH3);
                }
            } else if (c10 <= 2047) {
                int i14 = iH3 + 1;
                bArr[iH3] = (byte) ((c10 >> 6) | 192);
                iH3 += 2;
                bArr[i14] = (byte) ((c10 & '?') | 128);
            } else {
                iH3 = H3(c10, iH3);
            }
        }
        this.f102601i3 = iH3;
    }

    private final void J4(String str, int i10, int i11) throws IOException {
        if (this.f102601i3 + ((i11 - i10) * 6) > this.f102602j3) {
            F3();
        }
        int iH3 = this.f102601i3;
        byte[] bArr = this.f102600h3;
        int[] iArr = this.X;
        int i12 = this.Y;
        while (i10 < i11) {
            i10++;
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 127) {
                int i13 = iArr[cCharAt];
                if (i13 == 0) {
                    bArr[iH3] = (byte) cCharAt;
                    iH3++;
                } else if (i13 > 0) {
                    int i14 = iH3 + 1;
                    bArr[iH3] = f102594v3;
                    iH3 += 2;
                    bArr[i14] = (byte) i13;
                } else {
                    iH3 = h4(cCharAt, iH3);
                }
            } else if (cCharAt > i12) {
                iH3 = h4(cCharAt, iH3);
            } else if (cCharAt <= 2047) {
                int i15 = iH3 + 1;
                bArr[iH3] = (byte) ((cCharAt >> 6) | 192);
                iH3 += 2;
                bArr[i15] = (byte) ((cCharAt & '?') | 128);
            } else {
                iH3 = H3(cCharAt, iH3);
            }
        }
        this.f102601i3 = iH3;
    }

    private final int N3(InputStream inputStream, byte[] bArr, int i10, int i11, int i12) throws IOException {
        int i13;
        int i14 = 0;
        while (i10 < i11) {
            bArr[i14] = bArr[i10];
            i14++;
            i10++;
        }
        int iMin = Math.min(i12, bArr.length);
        do {
            int i15 = iMin - i14;
            if (i15 != 0 && (i13 = inputStream.read(bArr, i14, i15)) >= 0) {
                i14 += i13;
            }
            return i14;
        } while (i14 < 3);
        return i14;
    }

    private final void N4(char[] cArr, int i10, int i11) throws IOException {
        if (this.f102601i3 + ((i11 - i10) * 6) > this.f102602j3) {
            F3();
        }
        int iH3 = this.f102601i3;
        byte[] bArr = this.f102600h3;
        int[] iArr = this.X;
        int i12 = this.Y;
        while (i10 < i11) {
            i10++;
            char c10 = cArr[i10];
            if (c10 <= 127) {
                int i13 = iArr[c10];
                if (i13 == 0) {
                    bArr[iH3] = (byte) c10;
                    iH3++;
                } else if (i13 > 0) {
                    int i14 = iH3 + 1;
                    bArr[iH3] = f102594v3;
                    iH3 += 2;
                    bArr[i14] = (byte) i13;
                } else {
                    iH3 = h4(c10, iH3);
                }
            } else if (c10 > i12) {
                iH3 = h4(c10, iH3);
            } else if (c10 <= 2047) {
                int i15 = iH3 + 1;
                bArr[iH3] = (byte) ((c10 >> 6) | 192);
                iH3 += 2;
                bArr[i15] = (byte) ((c10 & '?') | 128);
            } else {
                iH3 = H3(c10, iH3);
            }
        }
        this.f102601i3 = iH3;
    }

    private final void O4(String str, int i10, int i11) throws IOException {
        do {
            int iMin = Math.min(this.f102603k3, i11);
            if (this.f102601i3 + iMin > this.f102602j3) {
                F3();
            }
            D4(str, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    private final void Q4(String str, boolean z10) throws IOException {
        if (z10) {
            if (this.f102601i3 >= this.f102602j3) {
                F3();
            }
            byte[] bArr = this.f102600h3;
            int i10 = this.f102601i3;
            this.f102601i3 = i10 + 1;
            bArr[i10] = this.f102599g3;
        }
        int length = str.length();
        int i11 = 0;
        while (length > 0) {
            int iMin = Math.min(this.f102603k3, length);
            if (this.f102601i3 + iMin > this.f102602j3) {
                F3();
            }
            D4(str, i11, iMin);
            i11 += iMin;
            length -= iMin;
        }
        if (z10) {
            if (this.f102601i3 >= this.f102602j3) {
                F3();
            }
            byte[] bArr2 = this.f102600h3;
            int i12 = this.f102601i3;
            this.f102601i3 = i12 + 1;
            bArr2[i12] = this.f102599g3;
        }
    }

    private final void R4(char[] cArr, int i10, int i11) throws IOException {
        do {
            int iMin = Math.min(this.f102603k3, i11);
            if (this.f102601i3 + iMin > this.f102602j3) {
                F3();
            }
            E4(cArr, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    private final void T4(byte[] bArr, int i10, int i11) throws IOException {
        int[] iArr = this.X;
        int i12 = i10 + i11;
        int i13 = i10;
        while (i13 < i12) {
            int i14 = i13 + 1;
            byte b10 = bArr[i13];
            if (b10 >= 0 && iArr[b10] != 0) {
                V4(bArr, i10, i11);
                return;
            }
            i13 = i14;
        }
        if (this.f102601i3 + i11 > this.f102602j3) {
            F3();
        }
        System.arraycopy(bArr, i10, this.f102600h3, this.f102601i3, i11);
        this.f102601i3 += i11;
    }

    private final void V3(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f102601i3 + length > this.f102602j3) {
            F3();
            if (length > 512) {
                this.f102608p2.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f102600h3, this.f102601i3, length);
        this.f102601i3 += length;
    }

    private final void V4(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int iH4 = this.f102601i3;
        if ((i11 * 6) + iH4 > this.f102602j3) {
            F3();
            iH4 = this.f102601i3;
        }
        byte[] bArr2 = this.f102600h3;
        int[] iArr = this.X;
        int i13 = i11 + i10;
        while (i10 < i13) {
            i10++;
            byte b10 = bArr[i10];
            if (b10 < 0 || (i12 = iArr[b10]) == 0) {
                bArr2[iH4] = b10;
                iH4++;
            } else if (i12 > 0) {
                int i14 = iH4 + 1;
                bArr2[iH4] = f102594v3;
                iH4 += 2;
                bArr2[i14] = (byte) i12;
            } else {
                iH4 = h4(b10, iH4);
            }
        }
        this.f102601i3 = iH4;
    }

    private final void W4(byte[] bArr, int i10, int i11) throws IOException {
        do {
            int iMin = Math.min(this.f102603k3, i11);
            T4(bArr, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    private final void X4(s sVar) throws IOException {
        int iE = sVar.e(this.f102600h3, this.f102601i3);
        if (iE < 0) {
            V3(sVar.d());
        } else {
            this.f102601i3 += iE;
        }
    }

    private final void a4(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f102601i3 + i11 > this.f102602j3) {
            F3();
            if (i11 > 512) {
                this.f102608p2.write(bArr, i10, i11);
                return;
            }
        }
        System.arraycopy(bArr, i10, this.f102600h3, this.f102601i3, i11);
        this.f102601i3 += i11;
    }

    private final int b4(byte[] bArr, int i10, s sVar, int i11) throws IOException {
        byte[] bArrL = sVar.l();
        int length = bArrL.length;
        if (length > 6) {
            return G3(bArr, i10, this.f102602j3, bArrL, i11);
        }
        System.arraycopy(bArrL, 0, bArr, i10, length);
        return i10 + length;
    }

    private final void f4(String str, int i10, int i11) throws IOException {
        if (this.f102601i3 + ((i11 - i10) * 6) > this.f102602j3) {
            F3();
        }
        int iH3 = this.f102601i3;
        byte[] bArr = this.f102600h3;
        int[] iArr = this.X;
        int i12 = this.Y;
        if (i12 <= 0) {
            i12 = 65535;
        }
        com.fasterxml.jackson.core.io.b bVar = this.Z;
        while (i10 < i11) {
            i10++;
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 127) {
                int i13 = iArr[cCharAt];
                if (i13 == 0) {
                    bArr[iH3] = (byte) cCharAt;
                    iH3++;
                } else if (i13 > 0) {
                    int i14 = iH3 + 1;
                    bArr[iH3] = f102594v3;
                    iH3 += 2;
                    bArr[i14] = (byte) i13;
                } else if (i13 == -2) {
                    s sVarB = bVar.b(cCharAt);
                    if (sVarB == null) {
                        a("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(cCharAt) + ", although was supposed to have one");
                    }
                    iH3 = b4(bArr, iH3, sVarB, i11 - i10);
                } else {
                    iH3 = h4(cCharAt, iH3);
                }
            } else if (cCharAt > i12) {
                iH3 = h4(cCharAt, iH3);
            } else {
                s sVarB2 = bVar.b(cCharAt);
                if (sVarB2 != null) {
                    iH3 = b4(bArr, iH3, sVarB2, i11 - i10);
                } else if (cCharAt <= 2047) {
                    int i15 = iH3 + 1;
                    bArr[iH3] = (byte) ((cCharAt >> 6) | 192);
                    iH3 += 2;
                    bArr[i15] = (byte) ((cCharAt & '?') | 128);
                } else {
                    iH3 = H3(cCharAt, iH3);
                }
            }
        }
        this.f102601i3 = iH3;
    }

    private final void g4(char[] cArr, int i10, int i11) throws IOException {
        if (this.f102601i3 + ((i11 - i10) * 6) > this.f102602j3) {
            F3();
        }
        int iH3 = this.f102601i3;
        byte[] bArr = this.f102600h3;
        int[] iArr = this.X;
        int i12 = this.Y;
        if (i12 <= 0) {
            i12 = 65535;
        }
        com.fasterxml.jackson.core.io.b bVar = this.Z;
        while (i10 < i11) {
            i10++;
            char c10 = cArr[i10];
            if (c10 <= 127) {
                int i13 = iArr[c10];
                if (i13 == 0) {
                    bArr[iH3] = (byte) c10;
                    iH3++;
                } else if (i13 > 0) {
                    int i14 = iH3 + 1;
                    bArr[iH3] = f102594v3;
                    iH3 += 2;
                    bArr[i14] = (byte) i13;
                } else if (i13 == -2) {
                    s sVarB = bVar.b(c10);
                    if (sVarB == null) {
                        a("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c10) + ", although was supposed to have one");
                    }
                    iH3 = b4(bArr, iH3, sVarB, i11 - i10);
                } else {
                    iH3 = h4(c10, iH3);
                }
            } else if (c10 > i12) {
                iH3 = h4(c10, iH3);
            } else {
                s sVarB2 = bVar.b(c10);
                if (sVarB2 != null) {
                    iH3 = b4(bArr, iH3, sVarB2, i11 - i10);
                } else if (c10 <= 2047) {
                    int i15 = iH3 + 1;
                    bArr[iH3] = (byte) ((c10 >> 6) | 192);
                    iH3 += 2;
                    bArr[i15] = (byte) ((c10 & '?') | 128);
                } else {
                    iH3 = H3(c10, iH3);
                }
            }
        }
        this.f102601i3 = iH3;
    }

    private int h4(int i10, int i11) throws IOException {
        int i12;
        byte[] bArr = this.f102600h3;
        bArr[i11] = f102594v3;
        int i13 = i11 + 2;
        bArr[i11 + 1] = f102588p3;
        if (i10 > 255) {
            int i14 = i10 >> 8;
            int i15 = i11 + 3;
            byte[] bArr2 = f102598z3;
            bArr[i13] = bArr2[(i14 & 255) >> 4];
            i12 = i11 + 4;
            bArr[i15] = bArr2[i14 & 15];
            i10 &= 255;
        } else {
            int i16 = i11 + 3;
            bArr[i13] = f102589q3;
            i12 = i11 + 4;
            bArr[i16] = f102589q3;
        }
        int i17 = i12 + 1;
        byte[] bArr3 = f102598z3;
        bArr[i12] = bArr3[i10 >> 4];
        int i18 = i12 + 2;
        bArr[i17] = bArr3[i10 & 15];
        return i18;
    }

    private final void j4() throws IOException {
        if (this.f102601i3 + 4 >= this.f102602j3) {
            F3();
        }
        System.arraycopy(A3, 0, this.f102600h3, this.f102601i3, 4);
        this.f102601i3 += 4;
    }

    private final void o4(int i10) throws IOException {
        if (this.f102601i3 + 13 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i11 = this.f102601i3;
        int i12 = i11 + 1;
        this.f102601i3 = i12;
        bArr[i11] = this.f102599g3;
        int iO = com.fasterxml.jackson.core.io.j.o(i10, bArr, i12);
        byte[] bArr2 = this.f102600h3;
        this.f102601i3 = iO + 1;
        bArr2[iO] = this.f102599g3;
    }

    private final void r4(long j10) throws IOException {
        if (this.f102601i3 + 23 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i10 = this.f102601i3;
        int i11 = i10 + 1;
        this.f102601i3 = i11;
        bArr[i10] = this.f102599g3;
        int iQ = com.fasterxml.jackson.core.io.j.q(j10, bArr, i11);
        byte[] bArr2 = this.f102600h3;
        this.f102601i3 = iQ + 1;
        bArr2[iQ] = this.f102599g3;
    }

    private final void s4(String str) throws IOException {
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i10 = this.f102601i3;
        this.f102601i3 = i10 + 1;
        bArr[i10] = this.f102599g3;
        G2(str);
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr2 = this.f102600h3;
        int i11 = this.f102601i3;
        this.f102601i3 = i11 + 1;
        bArr2[i11] = this.f102599g3;
    }

    private final void t4(short s10) throws IOException {
        if (this.f102601i3 + 8 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i10 = this.f102601i3;
        int i11 = i10 + 1;
        this.f102601i3 = i11;
        bArr[i10] = this.f102599g3;
        int iO = com.fasterxml.jackson.core.io.j.o(s10, bArr, i11);
        byte[] bArr2 = this.f102600h3;
        this.f102601i3 = iO + 1;
        bArr2[iO] = this.f102599g3;
    }

    private void w4(char[] cArr, int i10, int i11) throws IOException {
        char c10;
        loop0: while (i10 < i11) {
            while (true) {
                c10 = cArr[i10];
                if (c10 > 127) {
                    break;
                }
                byte[] bArr = this.f102600h3;
                int i12 = this.f102601i3;
                this.f102601i3 = i12 + 1;
                bArr[i12] = (byte) c10;
                i10++;
                if (i10 >= i11) {
                    break loop0;
                }
            }
            i10++;
            if (c10 < 2048) {
                byte[] bArr2 = this.f102600h3;
                int i13 = this.f102601i3;
                int i14 = i13 + 1;
                this.f102601i3 = i14;
                bArr2[i13] = (byte) ((c10 >> 6) | 192);
                this.f102601i3 = i13 + 2;
                bArr2[i14] = (byte) ((c10 & '?') | 128);
            } else {
                i10 = I3(c10, cArr, i10, i11);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h
    public void B1(s sVar) throws IOException {
        if (this.f102376a != null) {
            k4(sVar);
            return;
        }
        int iB = this.f102247e.B(sVar.getValue());
        if (iB == 4) {
            a("Can not write a field name, expecting a value");
        }
        if (iB == 1) {
            if (this.f102601i3 >= this.f102602j3) {
                F3();
            }
            byte[] bArr = this.f102600h3;
            int i10 = this.f102601i3;
            this.f102601i3 = i10 + 1;
            bArr[i10] = f102595w3;
        }
        if (this.f102544p1) {
            X4(sVar);
            return;
        }
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr2 = this.f102600h3;
        int i11 = this.f102601i3;
        int i12 = i11 + 1;
        this.f102601i3 = i12;
        bArr2[i11] = this.f102599g3;
        int iE = sVar.e(bArr2, i12);
        if (iE < 0) {
            V3(sVar.d());
        } else {
            this.f102601i3 += iE;
        }
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr3 = this.f102600h3;
        int i13 = this.f102601i3;
        this.f102601i3 = i13 + 1;
        bArr3[i13] = this.f102599g3;
    }

    @Override // com.fasterxml.jackson.core.h
    public void D2(char c10) throws IOException {
        if (this.f102601i3 + 3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        if (c10 <= 127) {
            int i10 = this.f102601i3;
            this.f102601i3 = i10 + 1;
            bArr[i10] = (byte) c10;
        } else {
            if (c10 >= 2048) {
                I3(c10, null, 0, 0);
                return;
            }
            int i11 = this.f102601i3;
            int i12 = i11 + 1;
            this.f102601i3 = i12;
            bArr[i11] = (byte) ((c10 >> 6) | 192);
            this.f102601i3 = i11 + 2;
            bArr[i12] = (byte) ((c10 & '?') | 128);
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public void E1(String str) throws IOException {
        if (this.f102376a != null) {
            n4(str);
            return;
        }
        int iB = this.f102247e.B(str);
        if (iB == 4) {
            a("Can not write a field name, expecting a value");
        }
        if (iB == 1) {
            if (this.f102601i3 >= this.f102602j3) {
                F3();
            }
            byte[] bArr = this.f102600h3;
            int i10 = this.f102601i3;
            this.f102601i3 = i10 + 1;
            bArr[i10] = f102595w3;
        }
        if (this.f102544p1) {
            Q4(str, false);
            return;
        }
        int length = str.length();
        if (length > this.f102605m3) {
            Q4(str, true);
            return;
        }
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr2 = this.f102600h3;
        int i11 = this.f102601i3;
        int i12 = i11 + 1;
        this.f102601i3 = i12;
        bArr2[i11] = this.f102599g3;
        if (length <= this.f102603k3) {
            if (i12 + length > this.f102602j3) {
                F3();
            }
            D4(str, 0, length);
        } else {
            O4(str, 0, length);
        }
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr3 = this.f102600h3;
        int i13 = this.f102601i3;
        this.f102601i3 = i13 + 1;
        bArr3[i13] = this.f102599g3;
    }

    @Override // com.fasterxml.jackson.core.h
    public void E2(s sVar) throws IOException {
        byte[] bArrL = sVar.l();
        if (bArrL.length > 0) {
            V3(bArrL);
        }
    }

    protected final void F3() throws IOException {
        int i10 = this.f102601i3;
        if (i10 > 0) {
            this.f102601i3 = 0;
            this.f102608p2.write(this.f102600h3, 0, i10);
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public void G2(String str) throws IOException {
        int length = str.length();
        char[] cArr = this.f102604l3;
        if (length > cArr.length) {
            J2(str, 0, length);
        } else {
            str.getChars(0, length, cArr, 0);
            L2(cArr, 0, length);
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public void J1() throws IOException {
        y3("write a null");
        j4();
    }

    @Override // com.fasterxml.jackson.core.h
    public void J2(String str, int i10, int i11) throws IOException {
        char c10;
        char[] cArr = this.f102604l3;
        int length = cArr.length;
        if (i11 <= length) {
            str.getChars(i10, i10 + i11, cArr, 0);
            L2(cArr, 0, i11);
            return;
        }
        int i12 = this.f102602j3;
        int iMin = Math.min(length, (i12 >> 2) + (i12 >> 4));
        int i13 = iMin * 3;
        while (i11 > 0) {
            int iMin2 = Math.min(iMin, i11);
            str.getChars(i10, i10 + iMin2, cArr, 0);
            if (this.f102601i3 + i13 > this.f102602j3) {
                F3();
            }
            if (iMin2 > 1 && (c10 = cArr[iMin2 - 1]) >= 55296 && c10 <= 56319) {
                iMin2--;
            }
            w4(cArr, 0, iMin2);
            i10 += iMin2;
            i11 -= iMin2;
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public final void L2(char[] cArr, int i10, int i11) throws IOException {
        char c10;
        int i12 = i11 + i11 + i11;
        int i13 = this.f102601i3 + i12;
        int i14 = this.f102602j3;
        if (i13 > i14) {
            if (i14 < i12) {
                C4(cArr, i10, i11);
                return;
            }
            F3();
        }
        int i15 = i11 + i10;
        loop0: while (i10 < i15) {
            while (true) {
                c10 = cArr[i10];
                if (c10 > 127) {
                    break;
                }
                byte[] bArr = this.f102600h3;
                int i16 = this.f102601i3;
                this.f102601i3 = i16 + 1;
                bArr[i16] = (byte) c10;
                i10++;
                if (i10 >= i15) {
                    break loop0;
                }
            }
            i10++;
            if (c10 < 2048) {
                byte[] bArr2 = this.f102600h3;
                int i17 = this.f102601i3;
                int i18 = i17 + 1;
                this.f102601i3 = i18;
                bArr2[i17] = (byte) ((c10 >> 6) | 192);
                this.f102601i3 = i17 + 2;
                bArr2[i18] = (byte) ((c10 & '?') | 128);
            } else {
                i10 = I3(c10, cArr, i10, i15);
            }
        }
    }

    protected final void M3(int i10, int i11) throws IOException {
        int iW3 = w3(i10, i11);
        if (this.f102601i3 + 4 > this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i12 = this.f102601i3;
        int i13 = i12 + 1;
        this.f102601i3 = i13;
        bArr[i12] = (byte) ((iW3 >> 18) | 240);
        int i14 = i12 + 2;
        this.f102601i3 = i14;
        bArr[i13] = (byte) (((iW3 >> 12) & 63) | 128);
        int i15 = i12 + 3;
        this.f102601i3 = i15;
        bArr[i14] = (byte) (((iW3 >> 6) & 63) | 128);
        this.f102601i3 = i12 + 4;
        bArr[i15] = (byte) ((iW3 & 63) | 128);
    }

    @Override // com.fasterxml.jackson.core.h
    public void N2(byte[] bArr, int i10, int i11) throws IOException {
        y3("write a string");
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr2 = this.f102600h3;
        int i12 = this.f102601i3;
        this.f102601i3 = i12 + 1;
        bArr2[i12] = this.f102599g3;
        a4(bArr, i10, i11);
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr3 = this.f102600h3;
        int i13 = this.f102601i3;
        this.f102601i3 = i13 + 1;
        bArr3[i13] = this.f102599g3;
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h
    public void O2(s sVar) throws IOException {
        y3("write a raw (unencoded) value");
        byte[] bArrL = sVar.l();
        if (bArrL.length > 0) {
            V3(bArrL);
        }
    }

    protected final int P3(com.fasterxml.jackson.core.a aVar, InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f102602j3 - 6;
        int i11 = 2;
        int i12 = -3;
        int iR = aVar.r() >> 2;
        int i13 = 0;
        int iN3 = 0;
        int i14 = 0;
        while (true) {
            if (i13 > i12) {
                iN3 = N3(inputStream, bArr, i13, iN3, bArr.length);
                if (iN3 < 3) {
                    break;
                }
                i12 = iN3 - 3;
                i13 = 0;
            }
            if (this.f102601i3 > i10) {
                F3();
            }
            int i15 = i13 + 2;
            int i16 = ((bArr[i13 + 1] & 255) | (bArr[i13] << 8)) << 8;
            i13 += 3;
            i14 += 3;
            int iL = aVar.l(i16 | (bArr[i15] & 255), this.f102600h3, this.f102601i3);
            this.f102601i3 = iL;
            iR--;
            if (iR <= 0) {
                byte[] bArr2 = this.f102600h3;
                int i17 = iL + 1;
                this.f102601i3 = i17;
                bArr2[iL] = f102594v3;
                this.f102601i3 = iL + 2;
                bArr2[i17] = 110;
                iR = aVar.r() >> 2;
            }
        }
        if (iN3 <= 0) {
            return i14;
        }
        if (this.f102601i3 > i10) {
            F3();
        }
        int i18 = bArr[0] << com.google.common.base.c.f116465r;
        if (1 < iN3) {
            i18 |= (bArr[1] & 255) << 8;
        } else {
            i11 = 1;
        }
        int i19 = i14 + i11;
        this.f102601i3 = aVar.o(i18, i11, this.f102600h3, this.f102601i3);
        return i19;
    }

    protected final int S3(com.fasterxml.jackson.core.a aVar, InputStream inputStream, byte[] bArr, int i10) throws IOException {
        i iVar;
        InputStream inputStream2;
        byte[] bArr2;
        int iN3;
        int i11 = this.f102602j3 - 6;
        int i12 = 2;
        int iR = aVar.r() >> 2;
        int i13 = -3;
        int i14 = i10;
        int i15 = 0;
        int iN4 = 0;
        while (true) {
            if (i14 <= 2) {
                iVar = this;
                inputStream2 = inputStream;
                bArr2 = bArr;
                break;
            }
            iVar = this;
            inputStream2 = inputStream;
            bArr2 = bArr;
            if (i15 > i13) {
                iN4 = iVar.N3(inputStream2, bArr2, i15, iN4, i14);
                if (iN4 < 3) {
                    i15 = 0;
                    break;
                }
                i13 = iN4 - 3;
                i15 = 0;
            }
            if (iVar.f102601i3 > i11) {
                iVar.F3();
            }
            int i16 = i15 + 2;
            int i17 = ((bArr2[i15 + 1] & 255) | (bArr2[i15] << 8)) << 8;
            i15 += 3;
            i14 -= 3;
            int iL = aVar.l(i17 | (bArr2[i16] & 255), iVar.f102600h3, iVar.f102601i3);
            iVar.f102601i3 = iL;
            iR--;
            if (iR <= 0) {
                byte[] bArr3 = iVar.f102600h3;
                int i18 = iL + 1;
                iVar.f102601i3 = i18;
                bArr3[iL] = f102594v3;
                iVar.f102601i3 = iL + 2;
                bArr3[i18] = 110;
                iR = aVar.r() >> 2;
            }
            this = iVar;
            inputStream = inputStream2;
            bArr = bArr2;
        }
        if (i14 <= 0 || (iN3 = iVar.N3(inputStream2, bArr2, i15, iN4, i14)) <= 0) {
            return i14;
        }
        if (iVar.f102601i3 > i11) {
            iVar.F3();
        }
        int i19 = bArr2[0] << com.google.common.base.c.f116465r;
        if (1 < iN3) {
            i19 |= (bArr2[1] & 255) << 8;
        } else {
            i12 = 1;
        }
        iVar.f102601i3 = aVar.o(i19, i12, iVar.f102600h3, iVar.f102601i3);
        return i14 - i12;
    }

    @Override // com.fasterxml.jackson.core.h
    public int T() {
        return this.f102601i3;
    }

    @Override // com.fasterxml.jackson.core.h
    public void T1(double d10) throws IOException {
        if (!this.f102246d && ((!Double.isNaN(d10) && !Double.isInfinite(d10)) || !com.fasterxml.jackson.core.h.b.QUOTE_NON_NUMERIC_NUMBERS.n(this.f102245c))) {
            y3("write a number");
            G2(String.valueOf(d10));
            return;
        }
        e3(String.valueOf(d10));
    }

    protected final void T3(com.fasterxml.jackson.core.a aVar, byte[] bArr, int i10, int i11) throws IOException {
        int iL;
        int i12 = i11 - 3;
        int i13 = this.f102602j3 - 6;
        int iR = aVar.r();
        loop0: while (true) {
            int i14 = iR >> 2;
            do {
                if (i10 > i12) {
                    break loop0;
                }
                if (this.f102601i3 > i13) {
                    F3();
                }
                int i15 = i10 + 2;
                int i16 = ((bArr[i10 + 1] & 255) | (bArr[i10] << 8)) << 8;
                i10 += 3;
                iL = aVar.l(i16 | (bArr[i15] & 255), this.f102600h3, this.f102601i3);
                this.f102601i3 = iL;
                i14--;
            } while (i14 > 0);
            byte[] bArr2 = this.f102600h3;
            int i17 = iL + 1;
            this.f102601i3 = i17;
            bArr2[iL] = f102594v3;
            this.f102601i3 = iL + 2;
            bArr2[i17] = 110;
            iR = aVar.r();
        }
        int i18 = i11 - i10;
        if (i18 > 0) {
            if (this.f102601i3 > i13) {
                F3();
            }
            int i19 = i10 + 1;
            int i20 = bArr[i10] << com.google.common.base.c.f116465r;
            if (i18 == 2) {
                i20 |= (bArr[i19] & 255) << 8;
            }
            this.f102601i3 = aVar.o(i20, i18, this.f102600h3, this.f102601i3);
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public final void U2() throws IOException {
        y3("start an array");
        this.f102247e = this.f102247e.t();
        r rVar = this.f102376a;
        if (rVar != null) {
            rVar.f(this);
            return;
        }
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i10 = this.f102601i3;
        this.f102601i3 = i10 + 1;
        bArr[i10] = f102590r3;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void X2() throws IOException {
        y3("start an object");
        this.f102247e = this.f102247e.u();
        r rVar = this.f102376a;
        if (rVar != null) {
            rVar.g(this);
            return;
        }
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i10 = this.f102601i3;
        this.f102601i3 = i10 + 1;
        bArr[i10] = f102592t3;
    }

    @Override // com.fasterxml.jackson.core.h
    public Object Y() {
        return this.f102608p2;
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h
    public void Y2(Object obj) throws IOException {
        y3("start an object");
        e eVarU = this.f102247e.u();
        this.f102247e = eVarU;
        if (obj != null) {
            eVarU.p(obj);
        }
        r rVar = this.f102376a;
        if (rVar != null) {
            rVar.g(this);
            return;
        }
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i10 = this.f102601i3;
        this.f102601i3 = i10 + 1;
        bArr[i10] = f102592t3;
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h
    public final void Z2(s sVar) throws IOException {
        y3("write a string");
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i10 = this.f102601i3;
        int i11 = i10 + 1;
        this.f102601i3 = i11;
        bArr[i10] = this.f102599g3;
        int iE = sVar.e(bArr, i11);
        if (iE < 0) {
            V3(sVar.d());
        } else {
            this.f102601i3 += iE;
        }
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr2 = this.f102600h3;
        int i12 = this.f102601i3;
        this.f102601i3 = i12 + 1;
        bArr2[i12] = this.f102599g3;
    }

    @Override // com.fasterxml.jackson.core.h
    public void a3(Reader reader, int i10) throws IOException {
        int i11;
        y3("write a string");
        if (reader == null) {
            a("null reader");
        }
        int i12 = i10 >= 0 ? i10 : Integer.MAX_VALUE;
        char[] cArr = this.f102604l3;
        if (this.f102601i3 + i10 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i13 = this.f102601i3;
        this.f102601i3 = i13 + 1;
        bArr[i13] = this.f102599g3;
        while (i12 > 0 && (i11 = reader.read(cArr, 0, Math.min(i12, cArr.length))) > 0) {
            if (this.f102601i3 + i10 >= this.f102602j3) {
                F3();
            }
            R4(cArr, 0, i11);
            i12 -= i11;
        }
        if (this.f102601i3 + i10 >= this.f102602j3) {
            F3();
        }
        byte[] bArr2 = this.f102600h3;
        int i14 = this.f102601i3;
        this.f102601i3 = i14 + 1;
        bArr2[i14] = this.f102599g3;
        if (i12 <= 0 || i10 < 0) {
            return;
        }
        a("Didn't read enough from reader");
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h
    public int b1(com.fasterxml.jackson.core.a aVar, InputStream inputStream, int i10) throws IOException {
        y3("write a binary value");
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i11 = this.f102601i3;
        this.f102601i3 = i11 + 1;
        bArr[i11] = this.f102599g3;
        byte[] bArrD = this.f102545w.d();
        try {
            if (i10 < 0) {
                i10 = P3(aVar, inputStream, bArrD);
            } else {
                int iS3 = S3(aVar, inputStream, bArrD, i10);
                if (iS3 > 0) {
                    a("Too few bytes available: missing " + iS3 + " bytes (out of " + i10 + ")");
                }
            }
            this.f102545w.r(bArrD);
            if (this.f102601i3 >= this.f102602j3) {
                F3();
            }
            byte[] bArr2 = this.f102600h3;
            int i12 = this.f102601i3;
            this.f102601i3 = i12 + 1;
            bArr2[i12] = this.f102599g3;
            return i10;
        } catch (Throwable th2) {
            this.f102545w.r(bArrD);
            throw th2;
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public void b2(float f10) throws IOException {
        if (!this.f102246d && ((!Float.isNaN(f10) && !Float.isInfinite(f10)) || !com.fasterxml.jackson.core.h.b.QUOTE_NON_NUMERIC_NUMBERS.n(this.f102245c))) {
            y3("write a number");
            G2(String.valueOf(f10));
            return;
        }
        e3(String.valueOf(f10));
    }

    @Override // com.fasterxml.jackson.core.h
    public void c2(int i10) throws IOException {
        y3("write a number");
        if (this.f102601i3 + 11 >= this.f102602j3) {
            F3();
        }
        if (this.f102246d) {
            o4(i10);
        } else {
            this.f102601i3 = com.fasterxml.jackson.core.io.j.o(i10, this.f102600h3, this.f102601i3);
        }
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.f102600h3 != null && g0(com.fasterxml.jackson.core.h.b.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                m mVarX = X();
                if (!mVarX.k()) {
                    if (!mVarX.l()) {
                        break;
                    } else {
                        u1();
                    }
                } else {
                    s1();
                }
            }
        }
        F3();
        this.f102601i3 = 0;
        if (this.f102608p2 != null) {
            if (this.f102545w.q() || g0(com.fasterxml.jackson.core.h.b.AUTO_CLOSE_TARGET)) {
                this.f102608p2.close();
            } else if (g0(com.fasterxml.jackson.core.h.b.FLUSH_PASSED_TO_STREAM)) {
                this.f102608p2.flush();
            }
        }
        x3();
    }

    @Override // com.fasterxml.jackson.core.h
    public void d2(long j10) throws IOException {
        y3("write a number");
        if (this.f102246d) {
            r4(j10);
            return;
        }
        if (this.f102601i3 + 21 >= this.f102602j3) {
            F3();
        }
        this.f102601i3 = com.fasterxml.jackson.core.io.j.q(j10, this.f102600h3, this.f102601i3);
    }

    @Override // com.fasterxml.jackson.core.h
    public void e1(com.fasterxml.jackson.core.a aVar, byte[] bArr, int i10, int i11) throws IOException {
        y3("write a binary value");
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr2 = this.f102600h3;
        int i12 = this.f102601i3;
        this.f102601i3 = i12 + 1;
        bArr2[i12] = this.f102599g3;
        T3(aVar, bArr, i10, i11 + i10);
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr3 = this.f102600h3;
        int i13 = this.f102601i3;
        this.f102601i3 = i13 + 1;
        bArr3[i13] = this.f102599g3;
    }

    @Override // com.fasterxml.jackson.core.h
    public void e2(String str) throws IOException {
        y3("write a number");
        if (this.f102246d) {
            s4(str);
        } else {
            G2(str);
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public void e3(String str) throws IOException {
        y3("write a string");
        if (str == null) {
            j4();
            return;
        }
        int length = str.length();
        if (length > this.f102603k3) {
            Q4(str, true);
            return;
        }
        if (this.f102601i3 + length >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i10 = this.f102601i3;
        this.f102601i3 = i10 + 1;
        bArr[i10] = this.f102599g3;
        D4(str, 0, length);
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr2 = this.f102600h3;
        int i11 = this.f102601i3;
        this.f102601i3 = i11 + 1;
        bArr2[i11] = this.f102599g3;
    }

    @Override // com.fasterxml.jackson.core.h
    public void f2(BigDecimal bigDecimal) throws IOException {
        y3("write a number");
        if (bigDecimal == null) {
            j4();
        } else if (this.f102246d) {
            s4(s3(bigDecimal));
        } else {
            G2(s3(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public void f3(char[] cArr, int i10, int i11) throws IOException {
        y3("write a string");
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i12 = this.f102601i3;
        int i13 = i12 + 1;
        this.f102601i3 = i13;
        bArr[i12] = this.f102599g3;
        if (i11 <= this.f102603k3) {
            if (i13 + i11 > this.f102602j3) {
                F3();
            }
            E4(cArr, i10, i11);
        } else {
            R4(cArr, i10, i11);
        }
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr2 = this.f102600h3;
        int i14 = this.f102601i3;
        this.f102601i3 = i14 + 1;
        bArr2[i14] = this.f102599g3;
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h, java.io.Flushable
    public void flush() throws IOException {
        F3();
        if (this.f102608p2 == null || !g0(com.fasterxml.jackson.core.h.b.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.f102608p2.flush();
    }

    @Override // com.fasterxml.jackson.core.h
    public void i2(BigInteger bigInteger) throws IOException {
        y3("write a number");
        if (bigInteger == null) {
            j4();
        } else if (this.f102246d) {
            s4(bigInteger.toString());
        } else {
            G2(bigInteger.toString());
        }
    }

    protected final void k4(s sVar) throws IOException {
        int iB = this.f102247e.B(sVar.getValue());
        if (iB == 4) {
            a("Can not write a field name, expecting a value");
        }
        if (iB == 1) {
            this.f102376a.i(this);
        } else {
            this.f102376a.c(this);
        }
        boolean z10 = this.f102544p1;
        if (!z10) {
            if (this.f102601i3 >= this.f102602j3) {
                F3();
            }
            byte[] bArr = this.f102600h3;
            int i10 = this.f102601i3;
            this.f102601i3 = i10 + 1;
            bArr[i10] = this.f102599g3;
        }
        V3(sVar.d());
        if (z10) {
            return;
        }
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr2 = this.f102600h3;
        int i11 = this.f102601i3;
        this.f102601i3 = i11 + 1;
        bArr2[i11] = this.f102599g3;
    }

    @Override // com.fasterxml.jackson.core.h
    public void l1(boolean z10) throws IOException {
        y3("write a boolean value");
        if (this.f102601i3 + 5 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = z10 ? B3 : C3;
        int length = bArr.length;
        int i10 = 4 >> 0;
        System.arraycopy(bArr, 0, this.f102600h3, this.f102601i3, length);
        this.f102601i3 += length;
    }

    @Override // com.fasterxml.jackson.core.h
    public void n2(short s10) throws IOException {
        y3("write a number");
        if (this.f102601i3 + 6 >= this.f102602j3) {
            F3();
        }
        if (this.f102246d) {
            t4(s10);
        } else {
            this.f102601i3 = com.fasterxml.jackson.core.io.j.o(s10, this.f102600h3, this.f102601i3);
        }
    }

    protected final void n4(String str) throws IOException {
        int iB = this.f102247e.B(str);
        if (iB == 4) {
            a("Can not write a field name, expecting a value");
        }
        if (iB == 1) {
            this.f102376a.i(this);
        } else {
            this.f102376a.c(this);
        }
        if (this.f102544p1) {
            Q4(str, false);
            return;
        }
        int length = str.length();
        if (length > this.f102605m3) {
            Q4(str, true);
            return;
        }
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i10 = this.f102601i3;
        this.f102601i3 = i10 + 1;
        bArr[i10] = this.f102599g3;
        str.getChars(0, length, this.f102604l3, 0);
        if (length <= this.f102603k3) {
            if (this.f102601i3 + length > this.f102602j3) {
                F3();
            }
            E4(this.f102604l3, 0, length);
        } else {
            R4(this.f102604l3, 0, length);
        }
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr2 = this.f102600h3;
        int i11 = this.f102601i3;
        this.f102601i3 = i11 + 1;
        bArr2[i11] = this.f102599g3;
    }

    @Override // com.fasterxml.jackson.core.h
    public void r3(byte[] bArr, int i10, int i11) throws IOException {
        y3("write a string");
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr2 = this.f102600h3;
        int i12 = this.f102601i3;
        this.f102601i3 = i12 + 1;
        bArr2[i12] = this.f102599g3;
        if (i11 <= this.f102603k3) {
            T4(bArr, i10, i11);
        } else {
            W4(bArr, i10, i11);
        }
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr3 = this.f102600h3;
        int i13 = this.f102601i3;
        this.f102601i3 = i13 + 1;
        bArr3[i13] = this.f102599g3;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void s1() throws IOException {
        if (!this.f102247e.k()) {
            a("Current context not Array but " + this.f102247e.q());
        }
        r rVar = this.f102376a;
        if (rVar != null) {
            rVar.d(this, this.f102247e.d());
        } else {
            if (this.f102601i3 >= this.f102602j3) {
                F3();
            }
            byte[] bArr = this.f102600h3;
            int i10 = this.f102601i3;
            this.f102601i3 = i10 + 1;
            bArr[i10] = f102591s3;
        }
        this.f102247e = this.f102247e.s();
    }

    @Override // com.fasterxml.jackson.core.h
    public final void u1() throws IOException {
        if (!this.f102247e.l()) {
            a("Current context not Object but " + this.f102247e.q());
        }
        r rVar = this.f102376a;
        if (rVar != null) {
            rVar.k(this, this.f102247e.d());
        } else {
            if (this.f102601i3 >= this.f102602j3) {
                F3();
            }
            byte[] bArr = this.f102600h3;
            int i10 = this.f102601i3;
            this.f102601i3 = i10 + 1;
            bArr[i10] = f102593u3;
        }
        this.f102247e = this.f102247e.s();
    }

    @Override // com.fasterxml.jackson.core.base.a
    protected void x3() {
        byte[] bArr = this.f102600h3;
        if (bArr != null && this.f102607o3) {
            this.f102600h3 = null;
            this.f102545w.w(bArr);
        }
        char[] cArr = this.f102604l3;
        if (cArr != null) {
            this.f102604l3 = null;
            this.f102545w.s(cArr);
        }
    }

    @Override // com.fasterxml.jackson.core.base.a
    protected final void y3(String str) throws IOException {
        byte b10;
        int iC = this.f102247e.C();
        if (this.f102376a != null) {
            D3(str, iC);
            return;
        }
        if (iC == 1) {
            b10 = f102595w3;
        } else {
            if (iC != 2) {
                if (iC != 3) {
                    if (iC != 5) {
                        return;
                    }
                    C3(str);
                    return;
                }
                s sVar = this.f102543p0;
                if (sVar != null) {
                    byte[] bArrL = sVar.l();
                    if (bArrL.length > 0) {
                        V3(bArrL);
                        return;
                    }
                    return;
                }
                return;
            }
            b10 = f102596x3;
        }
        if (this.f102601i3 >= this.f102602j3) {
            F3();
        }
        byte[] bArr = this.f102600h3;
        int i10 = this.f102601i3;
        this.f102601i3 = i10 + 1;
        bArr[i10] = b10;
    }

    public i(com.fasterxml.jackson.core.io.d dVar, int i10, q qVar, OutputStream outputStream, byte[] bArr, int i11, boolean z10) {
        super(dVar, i10, qVar);
        this.f102599g3 = (byte) 34;
        this.f102608p2 = outputStream;
        this.f102607o3 = z10;
        this.f102601i3 = i11;
        this.f102600h3 = bArr;
        int length = bArr.length;
        this.f102602j3 = length;
        this.f102603k3 = length >> 3;
        char[] cArrF = dVar.f();
        this.f102604l3 = cArrF;
        this.f102605m3 = cArrF.length;
    }
}
