package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes4.dex */
public class k extends c {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    protected static final int f102624o3 = 32;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    protected static final char[] f102625p3 = com.fasterxml.jackson.core.io.a.d();

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    protected char f102626g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    protected char[] f102627h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    protected int f102628i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    protected int f102629j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    protected int f102630k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    protected char[] f102631l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    protected s f102632m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    protected char[] f102633n3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    protected final Writer f102634p2;

    public k(com.fasterxml.jackson.core.io.d dVar, int i10, q qVar, Writer writer) {
        super(dVar, i10, qVar);
        this.f102626g3 = '\"';
        this.f102634p2 = writer;
        char[] cArrF = dVar.f();
        this.f102627h3 = cArrF;
        this.f102630k3 = cArrF.length;
    }

    private void C4(String str) throws IOException {
        int length = str.length();
        int i10 = this.f102630k3;
        if (length > i10) {
            f4(str);
            return;
        }
        if (this.f102629j3 + length > i10) {
            I3();
        }
        str.getChars(0, length, this.f102627h3, this.f102629j3);
        if (this.Z != null) {
            J4(length);
            return;
        }
        int i11 = this.Y;
        if (i11 != 0) {
            H4(length, i11);
        } else {
            E4(length);
        }
    }

    private void D4(char[] cArr, int i10, int i11) throws IOException {
        if (this.Z != null) {
            N4(cArr, i10, i11);
            return;
        }
        int i12 = this.Y;
        if (i12 != 0) {
            I4(cArr, i10, i11, i12);
            return;
        }
        int i13 = i11 + i10;
        int[] iArr = this.X;
        int length = iArr.length;
        while (i10 < i13) {
            int i14 = i10;
            do {
                char c10 = cArr[i14];
                if (c10 < length && iArr[c10] != 0) {
                    break;
                } else {
                    i14++;
                }
            } while (i14 < i13);
            int i15 = i14 - i10;
            if (i15 < 32) {
                if (this.f102629j3 + i15 > this.f102630k3) {
                    I3();
                }
                if (i15 > 0) {
                    System.arraycopy(cArr, i10, this.f102627h3, this.f102629j3, i15);
                    this.f102629j3 += i15;
                }
            } else {
                I3();
                this.f102634p2.write(cArr, i10, i15);
            }
            if (i14 >= i13) {
                break;
            }
            i10 = i14 + 1;
            char c11 = cArr[i14];
            H3(c11, iArr[c11]);
        }
    }

    private void E4(int i10) throws IOException {
        int i11;
        int i12 = this.f102629j3 + i10;
        int[] iArr = this.X;
        int length = iArr.length;
        while (this.f102629j3 < i12) {
            do {
                char[] cArr = this.f102627h3;
                int i13 = this.f102629j3;
                char c10 = cArr[i13];
                if (c10 >= length || iArr[c10] == 0) {
                    i11 = i13 + 1;
                    this.f102629j3 = i11;
                } else {
                    int i14 = this.f102628i3;
                    int i15 = i13 - i14;
                    if (i15 > 0) {
                        this.f102634p2.write(cArr, i14, i15);
                    }
                    char[] cArr2 = this.f102627h3;
                    int i16 = this.f102629j3;
                    this.f102629j3 = i16 + 1;
                    char c11 = cArr2[i16];
                    N3(c11, iArr[c11]);
                }
            } while (i11 < i12);
            return;
        }
    }

    private char[] F3() {
        if (this.f102633n3 == null) {
            this.f102633n3 = this.f102545w.g(2000);
        }
        return this.f102633n3;
    }

    private char[] G3() {
        char[] cArr = {'\\', 0, '\\', AbstractJsonLexerKt.UNICODE_ESC, l.f338160j, l.f338160j, 0, 0, '\\', AbstractJsonLexerKt.UNICODE_ESC, 0, 0, 0, 0};
        this.f102631l3 = cArr;
        return cArr;
    }

    private void H3(char c10, int i10) throws IOException {
        String value;
        int i11;
        if (i10 >= 0) {
            if (this.f102629j3 + 2 > this.f102630k3) {
                I3();
            }
            char[] cArr = this.f102627h3;
            int i12 = this.f102629j3;
            int i13 = i12 + 1;
            this.f102629j3 = i13;
            cArr[i12] = '\\';
            this.f102629j3 = i12 + 2;
            cArr[i13] = (char) i10;
            return;
        }
        if (i10 == -2) {
            s sVar = this.f102632m3;
            if (sVar == null) {
                value = this.Z.b(c10).getValue();
            } else {
                value = sVar.getValue();
                this.f102632m3 = null;
            }
            int length = value.length();
            if (this.f102629j3 + length > this.f102630k3) {
                I3();
                if (length > this.f102630k3) {
                    this.f102634p2.write(value);
                    return;
                }
            }
            value.getChars(0, length, this.f102627h3, this.f102629j3);
            this.f102629j3 += length;
            return;
        }
        if (this.f102629j3 + 5 >= this.f102630k3) {
            I3();
        }
        int i14 = this.f102629j3;
        char[] cArr2 = this.f102627h3;
        cArr2[i14] = '\\';
        int i15 = i14 + 2;
        cArr2[i14 + 1] = AbstractJsonLexerKt.UNICODE_ESC;
        if (c10 > 255) {
            int i16 = c10 >> '\b';
            int i17 = i14 + 3;
            char[] cArr3 = f102625p3;
            cArr2[i15] = cArr3[(i16 & 255) >> 4];
            i11 = i14 + 4;
            cArr2[i17] = cArr3[i16 & 15];
            c10 = (char) (c10 & 255);
        } else {
            int i18 = i14 + 3;
            cArr2[i15] = l.f338160j;
            i11 = i14 + 4;
            cArr2[i18] = l.f338160j;
        }
        char[] cArr4 = f102625p3;
        cArr2[i11] = cArr4[c10 >> 4];
        cArr2[i11 + 1] = cArr4[c10 & 15];
        this.f102629j3 = i11 + 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[EDGE_INSN: B:22:0x0047->B:19:0x0047 BREAK  A[LOOP:0: B:3:0x000f->B:16:0x0035, LOOP_LABEL: LOOP:0: B:3:0x000f->B:16:0x0035], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:? A[LOOP:1: B:5:0x0014->B:27:?, LOOP_END, SYNTHETIC] */
    private void H4(int i10, int i11) throws IOException {
        char[] cArr;
        int i12;
        char c10;
        int i13;
        int i14;
        int i15 = this.f102629j3 + i10;
        int[] iArr = this.X;
        int iMin = Math.min(iArr.length, i11 + 1);
        loop0: while (this.f102629j3 < i15) {
            while (true) {
                cArr = this.f102627h3;
                i12 = this.f102629j3;
                c10 = cArr[i12];
                if (c10 < iMin) {
                    i13 = iArr[c10];
                    if (i13 != 0) {
                        break;
                    }
                    i14 = i12 + 1;
                    this.f102629j3 = i14;
                    if (i14 >= i15) {
                        break loop0;
                    }
                } else {
                    if (c10 > i11) {
                        i13 = -1;
                        break;
                    }
                    i14 = i12 + 1;
                    this.f102629j3 = i14;
                    if (i14 >= i15) {
                        break loop0;
                        break loop0;
                    }
                }
            }
            int i16 = this.f102628i3;
            int i17 = i12 - i16;
            if (i17 > 0) {
                this.f102634p2.write(cArr, i16, i17);
            }
            this.f102629j3++;
            N3(c10, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e A[PHI: r2
      0x001e: PHI (r2v6 int) = (r2v3 int), (r2v7 int) binds: [B:10:0x001a, B:8:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    private void I4(char[] cArr, int i10, int i11, int i12) throws IOException {
        char c10;
        int i13 = i11 + i10;
        int[] iArr = this.X;
        int iMin = Math.min(iArr.length, i12 + 1);
        int i14 = 0;
        while (i10 < i13) {
            int i15 = i10;
            do {
                c10 = cArr[i15];
                if (c10 < iMin) {
                    i14 = iArr[c10];
                    if (i14 != 0) {
                        break;
                    } else {
                        i15++;
                    }
                } else {
                    if (c10 > i12) {
                        i14 = -1;
                        break;
                    }
                    i15++;
                }
            } while (i15 < i13);
            int i16 = i15 - i10;
            if (i16 < 32) {
                if (this.f102629j3 + i16 > this.f102630k3) {
                    I3();
                }
                if (i16 > 0) {
                    System.arraycopy(cArr, i10, this.f102627h3, this.f102629j3, i16);
                    this.f102629j3 += i16;
                }
            } else {
                I3();
                this.f102634p2.write(cArr, i10, i16);
            }
            if (i15 >= i13) {
                break;
            }
            i10 = i15 + 1;
            H3(c10, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049 A[SYNTHETIC] */
    private void J4(int i10) throws IOException {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f102629j3 + i10;
        int[] iArr = this.X;
        int i16 = this.Y;
        if (i16 < 1) {
            i16 = 65535;
        }
        int iMin = Math.min(iArr.length, i16 + 1);
        com.fasterxml.jackson.core.io.b bVar = this.Z;
        while (this.f102629j3 < i15) {
            do {
                char c10 = this.f102627h3[this.f102629j3];
                if (c10 < iMin) {
                    i11 = iArr[c10];
                    if (i11 != 0) {
                        int i17 = this.f102629j3;
                        i12 = this.f102628i3;
                        i13 = i17 - i12;
                        if (i13 > 0) {
                            this.f102634p2.write(this.f102627h3, i12, i13);
                        }
                        this.f102629j3++;
                        N3(c10, i11);
                    }
                    i14 = this.f102629j3 + 1;
                    this.f102629j3 = i14;
                } else {
                    if (c10 > i16) {
                        i11 = -1;
                    } else {
                        s sVarB = bVar.b(c10);
                        this.f102632m3 = sVarB;
                        if (sVarB != null) {
                            i11 = -2;
                        }
                        i14 = this.f102629j3 + 1;
                        this.f102629j3 = i14;
                    }
                    int i18 = this.f102629j3;
                    i12 = this.f102628i3;
                    i13 = i18 - i12;
                    if (i13 > 0) {
                        this.f102634p2.write(this.f102627h3, i12, i13);
                    }
                    this.f102629j3++;
                    N3(c10, i11);
                }
            } while (i14 < i15);
            return;
        }
    }

    private int M3(char[] cArr, int i10, int i11, char c10, int i12) throws IOException {
        String value;
        int i13;
        if (i12 >= 0) {
            if (i10 > 1 && i10 < i11) {
                int i14 = i10 - 2;
                cArr[i14] = '\\';
                cArr[i10 - 1] = (char) i12;
                return i14;
            }
            char[] cArrG3 = this.f102631l3;
            if (cArrG3 == null) {
                cArrG3 = G3();
            }
            cArrG3[1] = (char) i12;
            this.f102634p2.write(cArrG3, 0, 2);
            return i10;
        }
        if (i12 == -2) {
            s sVar = this.f102632m3;
            if (sVar == null) {
                value = this.Z.b(c10).getValue();
            } else {
                value = sVar.getValue();
                this.f102632m3 = null;
            }
            int length = value.length();
            if (i10 < length || i10 >= i11) {
                this.f102634p2.write(value);
                return i10;
            }
            int i15 = i10 - length;
            value.getChars(0, length, cArr, i15);
            return i15;
        }
        if (i10 <= 5 || i10 >= i11) {
            char[] cArrG4 = this.f102631l3;
            if (cArrG4 == null) {
                cArrG4 = G3();
            }
            this.f102628i3 = this.f102629j3;
            if (c10 <= 255) {
                char[] cArr2 = f102625p3;
                cArrG4[6] = cArr2[c10 >> 4];
                cArrG4[7] = cArr2[c10 & 15];
                this.f102634p2.write(cArrG4, 2, 6);
                return i10;
            }
            int i16 = c10 >> '\b';
            char[] cArr3 = f102625p3;
            cArrG4[10] = cArr3[(i16 & 255) >> 4];
            cArrG4[11] = cArr3[i16 & 15];
            cArrG4[12] = cArr3[(c10 & 255) >> 4];
            cArrG4[13] = cArr3[c10 & 15];
            this.f102634p2.write(cArrG4, 8, 6);
            return i10;
        }
        cArr[i10 - 6] = '\\';
        int i17 = i10 - 4;
        cArr[i10 - 5] = AbstractJsonLexerKt.UNICODE_ESC;
        if (c10 > 255) {
            int i18 = c10 >> '\b';
            int i19 = i10 - 3;
            char[] cArr4 = f102625p3;
            cArr[i17] = cArr4[(i18 & 255) >> 4];
            i13 = i10 - 2;
            cArr[i19] = cArr4[i18 & 15];
            c10 = (char) (c10 & 255);
        } else {
            int i20 = i10 - 3;
            cArr[i17] = l.f338160j;
            i13 = i10 - 2;
            cArr[i20] = l.f338160j;
        }
        char[] cArr5 = f102625p3;
        cArr[i13] = cArr5[c10 >> 4];
        cArr[i13 + 1] = cArr5[c10 & 15];
        return i13 - 4;
    }

    private void N3(char c10, int i10) throws IOException {
        String value;
        int i11;
        if (i10 >= 0) {
            int i12 = this.f102629j3;
            if (i12 >= 2) {
                int i13 = i12 - 2;
                this.f102628i3 = i13;
                char[] cArr = this.f102627h3;
                cArr[i13] = '\\';
                cArr[i12 - 1] = (char) i10;
                return;
            }
            char[] cArrG3 = this.f102631l3;
            if (cArrG3 == null) {
                cArrG3 = G3();
            }
            this.f102628i3 = this.f102629j3;
            cArrG3[1] = (char) i10;
            this.f102634p2.write(cArrG3, 0, 2);
            return;
        }
        if (i10 == -2) {
            s sVar = this.f102632m3;
            if (sVar == null) {
                value = this.Z.b(c10).getValue();
            } else {
                value = sVar.getValue();
                this.f102632m3 = null;
            }
            int length = value.length();
            int i14 = this.f102629j3;
            if (i14 < length) {
                this.f102628i3 = i14;
                this.f102634p2.write(value);
                return;
            } else {
                int i15 = i14 - length;
                this.f102628i3 = i15;
                value.getChars(0, length, this.f102627h3, i15);
                return;
            }
        }
        int i16 = this.f102629j3;
        if (i16 < 6) {
            char[] cArrG4 = this.f102631l3;
            if (cArrG4 == null) {
                cArrG4 = G3();
            }
            this.f102628i3 = this.f102629j3;
            if (c10 <= 255) {
                char[] cArr2 = f102625p3;
                cArrG4[6] = cArr2[c10 >> 4];
                cArrG4[7] = cArr2[c10 & 15];
                this.f102634p2.write(cArrG4, 2, 6);
                return;
            }
            int i17 = c10 >> '\b';
            char[] cArr3 = f102625p3;
            cArrG4[10] = cArr3[(i17 & 255) >> 4];
            cArrG4[11] = cArr3[i17 & 15];
            cArrG4[12] = cArr3[(c10 & 255) >> 4];
            cArrG4[13] = cArr3[c10 & 15];
            this.f102634p2.write(cArrG4, 8, 6);
            return;
        }
        char[] cArr4 = this.f102627h3;
        int i18 = i16 - 6;
        this.f102628i3 = i18;
        cArr4[i18] = '\\';
        cArr4[i16 - 5] = AbstractJsonLexerKt.UNICODE_ESC;
        if (c10 > 255) {
            int i19 = c10 >> '\b';
            char[] cArr5 = f102625p3;
            cArr4[i16 - 4] = cArr5[(i19 & 255) >> 4];
            i11 = i16 - 3;
            cArr4[i11] = cArr5[i19 & 15];
            c10 = (char) (c10 & 255);
        } else {
            cArr4[i16 - 4] = l.f338160j;
            i11 = i16 - 3;
            cArr4[i11] = l.f338160j;
        }
        char[] cArr6 = f102625p3;
        cArr4[i11 + 1] = cArr6[c10 >> 4];
        cArr4[i11 + 2] = cArr6[c10 & 15];
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c A[PHI: r4
      0x003c: PHI (r4v6 int) = (r4v2 int), (r4v7 int) binds: [B:16:0x0037, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    private void N4(char[] cArr, int i10, int i11) throws IOException {
        char c10;
        int i12 = i11 + i10;
        int[] iArr = this.X;
        int i13 = this.Y;
        if (i13 < 1) {
            i13 = 65535;
        }
        int iMin = Math.min(iArr.length, i13 + 1);
        com.fasterxml.jackson.core.io.b bVar = this.Z;
        int i14 = 0;
        while (i10 < i12) {
            int i15 = i10;
            do {
                c10 = cArr[i15];
                if (c10 < iMin) {
                    i14 = iArr[c10];
                    if (i14 != 0) {
                        break;
                    } else {
                        i15++;
                    }
                } else {
                    if (c10 > i13) {
                        i14 = -1;
                        break;
                    }
                    s sVarB = bVar.b(c10);
                    this.f102632m3 = sVarB;
                    if (sVarB != null) {
                        i14 = -2;
                        break;
                    }
                    i15++;
                }
            } while (i15 < i12);
            int i16 = i15 - i10;
            if (i16 < 32) {
                if (this.f102629j3 + i16 > this.f102630k3) {
                    I3();
                }
                if (i16 > 0) {
                    System.arraycopy(cArr, i10, this.f102627h3, this.f102629j3, i16);
                    this.f102629j3 += i16;
                }
            } else {
                I3();
                this.f102634p2.write(cArr, i10, i16);
            }
            if (i15 >= i12) {
                return;
            }
            i10 = i15 + 1;
            H3(c10, i14);
        }
    }

    private void O4(String str) throws IOException {
        int i10 = this.f102630k3;
        int i11 = this.f102629j3;
        int i12 = i10 - i11;
        str.getChars(0, i12, this.f102627h3, i11);
        this.f102629j3 += i12;
        I3();
        int length = str.length() - i12;
        while (true) {
            int i13 = this.f102630k3;
            if (length <= i13) {
                str.getChars(i12, i12 + length, this.f102627h3, 0);
                this.f102628i3 = 0;
                this.f102629j3 = length;
                return;
            } else {
                int i14 = i12 + i13;
                str.getChars(i12, i14, this.f102627h3, 0);
                this.f102628i3 = 0;
                this.f102629j3 = i13;
                I3();
                length -= i13;
                i12 = i14;
            }
        }
    }

    private int P3(InputStream inputStream, byte[] bArr, int i10, int i11, int i12) throws IOException {
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
            if (i15 == 0 || (i13 = inputStream.read(bArr, i14, i15)) < 0) {
                return i14;
            }
            i14 += i13;
        } while (i14 < 3);
        return i14;
    }

    private void f4(String str) throws IOException {
        I3();
        int length = str.length();
        int i10 = 0;
        while (true) {
            int i11 = this.f102630k3;
            if (i10 + i11 > length) {
                i11 = length - i10;
            }
            int i12 = i10 + i11;
            str.getChars(i10, i12, this.f102627h3, 0);
            if (this.Z != null) {
                w4(i11);
            } else {
                int i13 = this.Y;
                if (i13 != 0) {
                    t4(i11, i13);
                } else {
                    s4(i11);
                }
            }
            if (i12 >= length) {
                return;
            } else {
                i10 = i12;
            }
        }
    }

    private final void g4() throws IOException {
        if (this.f102629j3 + 4 >= this.f102630k3) {
            I3();
        }
        int i10 = this.f102629j3;
        char[] cArr = this.f102627h3;
        cArr[i10] = 'n';
        cArr[i10 + 1] = AbstractJsonLexerKt.UNICODE_ESC;
        cArr[i10 + 2] = 'l';
        cArr[i10 + 3] = 'l';
        this.f102629j3 = i10 + 4;
    }

    private void k4(int i10) throws IOException {
        if (this.f102629j3 + 13 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i11 = this.f102629j3;
        int i12 = i11 + 1;
        this.f102629j3 = i12;
        cArr[i11] = this.f102626g3;
        int iP = com.fasterxml.jackson.core.io.j.p(i10, cArr, i12);
        char[] cArr2 = this.f102627h3;
        this.f102629j3 = iP + 1;
        cArr2[iP] = this.f102626g3;
    }

    private void n4(long j10) throws IOException {
        if (this.f102629j3 + 23 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i10 = this.f102629j3;
        int i11 = i10 + 1;
        this.f102629j3 = i11;
        cArr[i10] = this.f102626g3;
        int iR = com.fasterxml.jackson.core.io.j.r(j10, cArr, i11);
        char[] cArr2 = this.f102627h3;
        this.f102629j3 = iR + 1;
        cArr2[iR] = this.f102626g3;
    }

    private void o4(String str) throws IOException {
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i10 = this.f102629j3;
        this.f102629j3 = i10 + 1;
        cArr[i10] = this.f102626g3;
        G2(str);
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr2 = this.f102627h3;
        int i11 = this.f102629j3;
        this.f102629j3 = i11 + 1;
        cArr2[i11] = this.f102626g3;
    }

    private void r4(short s10) throws IOException {
        if (this.f102629j3 + 8 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i10 = this.f102629j3;
        int i11 = i10 + 1;
        this.f102629j3 = i11;
        cArr[i10] = this.f102626g3;
        int iP = com.fasterxml.jackson.core.io.j.p(s10, cArr, i11);
        char[] cArr2 = this.f102627h3;
        this.f102629j3 = iP + 1;
        cArr2[iP] = this.f102626g3;
    }

    private void s4(int i10) throws IOException {
        char[] cArr;
        char c10;
        int[] iArr = this.X;
        int length = iArr.length;
        int i11 = 0;
        int iM3 = 0;
        while (i11 < i10) {
            do {
                cArr = this.f102627h3;
                c10 = cArr[i11];
                if (c10 < length && iArr[c10] != 0) {
                    break;
                } else {
                    i11++;
                }
            } while (i11 < i10);
            int i12 = i11 - iM3;
            if (i12 > 0) {
                this.f102634p2.write(cArr, iM3, i12);
                if (i11 >= i10) {
                    break;
                }
            }
            int i13 = i11 + 1;
            iM3 = M3(this.f102627h3, i13, i10, c10, iArr[c10]);
            i11 = i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[PHI: r4
      0x0024: PHI (r4v7 int) = (r4v2 int), (r4v8 int) binds: [B:9:0x001f, B:7:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    private void t4(int i10, int i11) throws IOException {
        char[] cArr;
        char c10;
        int[] iArr = this.X;
        int iMin = Math.min(iArr.length, i11 + 1);
        int i12 = 0;
        int iM3 = 0;
        int i13 = 0;
        while (i12 < i10) {
            do {
                cArr = this.f102627h3;
                c10 = cArr[i12];
                if (c10 < iMin) {
                    i13 = iArr[c10];
                    if (i13 != 0) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    if (c10 > i11) {
                        i13 = -1;
                        break;
                    }
                    i12++;
                }
            } while (i12 < i10);
            int i14 = i13;
            int i15 = i12 - iM3;
            if (i15 > 0) {
                this.f102634p2.write(cArr, iM3, i15);
                if (i12 >= i10) {
                    return;
                }
            }
            int i16 = i12 + 1;
            iM3 = M3(this.f102627h3, i16, i10, c10, i14);
            i12 = i16;
            i13 = i14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033 A[PHI: r6
      0x0033: PHI (r6v8 int) = (r6v2 int), (r6v9 int) binds: [B:15:0x002f, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    private void w4(int i10) throws IOException {
        char c10;
        int[] iArr = this.X;
        int i11 = this.Y;
        if (i11 < 1) {
            i11 = 65535;
        }
        int iMin = Math.min(iArr.length, i11 + 1);
        com.fasterxml.jackson.core.io.b bVar = this.Z;
        int i12 = 0;
        int iM3 = 0;
        int i13 = 0;
        while (i12 < i10) {
            do {
                c10 = this.f102627h3[i12];
                if (c10 < iMin) {
                    i13 = iArr[c10];
                    if (i13 != 0) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    if (c10 > i11) {
                        i13 = -1;
                        break;
                    }
                    s sVarB = bVar.b(c10);
                    this.f102632m3 = sVarB;
                    if (sVarB != null) {
                        i13 = -2;
                        break;
                    }
                    i12++;
                }
            } while (i12 < i10);
            int i14 = i13;
            int i15 = i12 - iM3;
            if (i15 > 0) {
                this.f102634p2.write(this.f102627h3, iM3, i15);
                if (i12 >= i10) {
                    return;
                }
            }
            int i16 = i12 + 1;
            iM3 = M3(this.f102627h3, i16, i10, c10, i14);
            i12 = i16;
            i13 = i14;
        }
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h
    public void B1(s sVar) throws IOException {
        int iB = this.f102247e.B(sVar.getValue());
        if (iB == 4) {
            a("Can not write a field name, expecting a value");
        }
        a4(sVar, iB == 1);
    }

    @Override // com.fasterxml.jackson.core.h
    public void D2(char c10) throws IOException {
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i10 = this.f102629j3;
        this.f102629j3 = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // com.fasterxml.jackson.core.h
    public void E1(String str) throws IOException {
        int iB = this.f102247e.B(str);
        if (iB == 4) {
            a("Can not write a field name, expecting a value");
        }
        b4(str, iB == 1);
    }

    @Override // com.fasterxml.jackson.core.h
    public void E2(s sVar) throws IOException {
        G2(sVar.getValue());
    }

    @Override // com.fasterxml.jackson.core.h
    public void G2(String str) throws IOException {
        int length = str.length();
        int i10 = this.f102630k3 - this.f102629j3;
        if (i10 == 0) {
            I3();
            i10 = this.f102630k3 - this.f102629j3;
        }
        if (i10 < length) {
            O4(str);
        } else {
            str.getChars(0, length, this.f102627h3, this.f102629j3);
            this.f102629j3 += length;
        }
    }

    protected void I3() throws IOException {
        int i10 = this.f102629j3;
        int i11 = this.f102628i3;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this.f102628i3 = 0;
            this.f102629j3 = 0;
            this.f102634p2.write(this.f102627h3, i11, i12);
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public void J1() throws IOException {
        y3("write a null");
        g4();
    }

    @Override // com.fasterxml.jackson.core.h
    public void J2(String str, int i10, int i11) throws IOException {
        int i12 = this.f102630k3 - this.f102629j3;
        if (i12 < i11) {
            I3();
            i12 = this.f102630k3 - this.f102629j3;
        }
        if (i12 < i11) {
            O4(str.substring(i10, i11 + i10));
        } else {
            str.getChars(i10, i10 + i11, this.f102627h3, this.f102629j3);
            this.f102629j3 += i11;
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public void L2(char[] cArr, int i10, int i11) throws IOException {
        if (i11 >= 32) {
            I3();
            this.f102634p2.write(cArr, i10, i11);
        } else {
            if (i11 > this.f102630k3 - this.f102629j3) {
                I3();
            }
            System.arraycopy(cArr, i10, this.f102627h3, this.f102629j3, i11);
            this.f102629j3 += i11;
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public void N2(byte[] bArr, int i10, int i11) throws IOException {
        b();
    }

    protected final int S3(com.fasterxml.jackson.core.a aVar, InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f102630k3 - 6;
        int i11 = 2;
        int i12 = -3;
        int iR = aVar.r() >> 2;
        int i13 = 0;
        int iP3 = 0;
        int i14 = 0;
        while (true) {
            if (i13 > i12) {
                iP3 = P3(inputStream, bArr, i13, iP3, bArr.length);
                if (iP3 < 3) {
                    break;
                }
                i12 = iP3 - 3;
                i13 = 0;
            }
            if (this.f102629j3 > i10) {
                I3();
            }
            int i15 = i13 + 2;
            int i16 = ((bArr[i13 + 1] & 255) | (bArr[i13] << 8)) << 8;
            i13 += 3;
            i14 += 3;
            int iM = aVar.m(i16 | (bArr[i15] & 255), this.f102627h3, this.f102629j3);
            this.f102629j3 = iM;
            iR--;
            if (iR <= 0) {
                char[] cArr = this.f102627h3;
                int i17 = iM + 1;
                this.f102629j3 = i17;
                cArr[iM] = '\\';
                this.f102629j3 = iM + 2;
                cArr[i17] = 'n';
                iR = aVar.r() >> 2;
            }
        }
        if (iP3 <= 0) {
            return i14;
        }
        if (this.f102629j3 > i10) {
            I3();
        }
        int i18 = bArr[0] << com.google.common.base.c.f116465r;
        if (1 < iP3) {
            i18 |= (bArr[1] & 255) << 8;
        } else {
            i11 = 1;
        }
        int i19 = i14 + i11;
        this.f102629j3 = aVar.p(i18, i11, this.f102627h3, this.f102629j3);
        return i19;
    }

    @Override // com.fasterxml.jackson.core.h
    public int T() {
        return Math.max(0, this.f102629j3 - this.f102628i3);
    }

    @Override // com.fasterxml.jackson.core.h
    public void T1(double d10) throws IOException {
        if (this.f102246d || (g0(com.fasterxml.jackson.core.h.b.QUOTE_NON_NUMERIC_NUMBERS) && (Double.isNaN(d10) || Double.isInfinite(d10)))) {
            e3(String.valueOf(d10));
        } else {
            y3("write a number");
            G2(String.valueOf(d10));
        }
    }

    protected final int T3(com.fasterxml.jackson.core.a aVar, InputStream inputStream, byte[] bArr, int i10) throws IOException {
        k kVar;
        InputStream inputStream2;
        byte[] bArr2;
        int iP3;
        int i11 = this.f102630k3 - 6;
        int i12 = 2;
        int iR = aVar.r() >> 2;
        int i13 = -3;
        int i14 = i10;
        int i15 = 0;
        int iP4 = 0;
        while (true) {
            if (i14 <= 2) {
                kVar = this;
                inputStream2 = inputStream;
                bArr2 = bArr;
                break;
            }
            kVar = this;
            inputStream2 = inputStream;
            bArr2 = bArr;
            if (i15 > i13) {
                iP4 = kVar.P3(inputStream2, bArr2, i15, iP4, i14);
                if (iP4 < 3) {
                    i15 = 0;
                    break;
                }
                i13 = iP4 - 3;
                i15 = 0;
            }
            if (kVar.f102629j3 > i11) {
                kVar.I3();
            }
            int i16 = i15 + 2;
            int i17 = ((bArr2[i15 + 1] & 255) | (bArr2[i15] << 8)) << 8;
            i15 += 3;
            i14 -= 3;
            int iM = aVar.m(i17 | (bArr2[i16] & 255), kVar.f102627h3, kVar.f102629j3);
            kVar.f102629j3 = iM;
            iR--;
            if (iR <= 0) {
                char[] cArr = kVar.f102627h3;
                int i18 = iM + 1;
                kVar.f102629j3 = i18;
                cArr[iM] = '\\';
                kVar.f102629j3 = iM + 2;
                cArr[i18] = 'n';
                iR = aVar.r() >> 2;
            }
            this = kVar;
            inputStream = inputStream2;
            bArr = bArr2;
        }
        if (i14 <= 0 || (iP3 = kVar.P3(inputStream2, bArr2, i15, iP4, i14)) <= 0) {
            return i14;
        }
        if (kVar.f102629j3 > i11) {
            kVar.I3();
        }
        int i19 = bArr2[0] << com.google.common.base.c.f116465r;
        if (1 < iP3) {
            i19 |= (bArr2[1] & 255) << 8;
        } else {
            i12 = 1;
        }
        kVar.f102629j3 = aVar.p(i19, i12, kVar.f102627h3, kVar.f102629j3);
        return i14 - i12;
    }

    @Override // com.fasterxml.jackson.core.h
    public void U2() throws IOException {
        y3("start an array");
        this.f102247e = this.f102247e.t();
        r rVar = this.f102376a;
        if (rVar != null) {
            rVar.f(this);
            return;
        }
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i10 = this.f102629j3;
        this.f102629j3 = i10 + 1;
        cArr[i10] = AbstractJsonLexerKt.BEGIN_LIST;
    }

    protected final void V3(com.fasterxml.jackson.core.a aVar, byte[] bArr, int i10, int i11) throws IOException {
        int iM;
        int i12 = i11 - 3;
        int i13 = this.f102630k3 - 6;
        int iR = aVar.r();
        int i14 = 5 >> 2;
        loop0: while (true) {
            int i15 = iR >> 2;
            do {
                if (i10 > i12) {
                    break loop0;
                }
                if (this.f102629j3 > i13) {
                    I3();
                }
                int i16 = i10 + 2;
                int i17 = ((bArr[i10 + 1] & 255) | (bArr[i10] << 8)) << 8;
                i10 += 3;
                iM = aVar.m(i17 | (bArr[i16] & 255), this.f102627h3, this.f102629j3);
                this.f102629j3 = iM;
                i15--;
            } while (i15 > 0);
            char[] cArr = this.f102627h3;
            int i18 = iM + 1;
            this.f102629j3 = i18;
            cArr[iM] = '\\';
            this.f102629j3 = iM + 2;
            cArr[i18] = 'n';
            iR = aVar.r();
        }
        int i19 = i11 - i10;
        if (i19 > 0) {
            if (this.f102629j3 > i13) {
                I3();
            }
            int i20 = i10 + 1;
            int i21 = bArr[i10] << com.google.common.base.c.f116465r;
            if (i19 == 2) {
                i21 |= (bArr[i20] & 255) << 8;
            }
            this.f102629j3 = aVar.p(i21, i19, this.f102627h3, this.f102629j3);
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public void X2() throws IOException {
        y3("start an object");
        this.f102247e = this.f102247e.u();
        r rVar = this.f102376a;
        if (rVar != null) {
            rVar.g(this);
            return;
        }
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i10 = this.f102629j3;
        this.f102629j3 = i10 + 1;
        cArr[i10] = AbstractJsonLexerKt.BEGIN_OBJ;
    }

    @Override // com.fasterxml.jackson.core.h
    public Object Y() {
        return this.f102634p2;
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
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i10 = this.f102629j3;
        this.f102629j3 = i10 + 1;
        cArr[i10] = AbstractJsonLexerKt.BEGIN_OBJ;
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h
    public void Z2(s sVar) throws IOException {
        y3("write a string");
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i10 = this.f102629j3;
        this.f102629j3 = i10 + 1;
        cArr[i10] = this.f102626g3;
        char[] cArrC = sVar.c();
        int length = cArrC.length;
        if (length < 32) {
            if (length > this.f102630k3 - this.f102629j3) {
                I3();
            }
            System.arraycopy(cArrC, 0, this.f102627h3, this.f102629j3, length);
            this.f102629j3 += length;
        } else {
            I3();
            this.f102634p2.write(cArrC, 0, length);
        }
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr2 = this.f102627h3;
        int i11 = this.f102629j3;
        this.f102629j3 = i11 + 1;
        cArr2[i11] = this.f102626g3;
    }

    @Override // com.fasterxml.jackson.core.h
    public void a3(Reader reader, int i10) throws IOException {
        y3("write a string");
        if (reader == null) {
            a("null reader");
        }
        int i11 = i10 >= 0 ? i10 : Integer.MAX_VALUE;
        char[] cArrF3 = F3();
        if (this.f102629j3 + i10 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i12 = this.f102629j3;
        this.f102629j3 = i12 + 1;
        cArr[i12] = this.f102626g3;
        while (i11 > 0) {
            int i13 = reader.read(cArrF3, 0, Math.min(i11, cArrF3.length));
            if (i13 <= 0) {
                break;
            }
            if (this.f102629j3 + i10 >= this.f102630k3) {
                I3();
            }
            D4(cArrF3, 0, i13);
            i11 -= i13;
        }
        if (this.f102629j3 + i10 >= this.f102630k3) {
            I3();
        }
        char[] cArr2 = this.f102627h3;
        int i14 = this.f102629j3;
        this.f102629j3 = i14 + 1;
        cArr2[i14] = this.f102626g3;
        if (i11 <= 0 || i10 < 0) {
            return;
        }
        a("Didn't read enough from reader");
    }

    protected final void a4(s sVar, boolean z10) throws IOException {
        if (this.f102376a != null) {
            h4(sVar, z10);
            return;
        }
        if (this.f102629j3 + 1 >= this.f102630k3) {
            I3();
        }
        if (z10) {
            char[] cArr = this.f102627h3;
            int i10 = this.f102629j3;
            this.f102629j3 = i10 + 1;
            cArr[i10] = AbstractJsonLexerKt.COMMA;
        }
        char[] cArrC = sVar.c();
        if (this.f102544p1) {
            L2(cArrC, 0, cArrC.length);
            return;
        }
        char[] cArr2 = this.f102627h3;
        int i11 = this.f102629j3;
        int i12 = i11 + 1;
        this.f102629j3 = i12;
        cArr2[i11] = this.f102626g3;
        int length = cArrC.length;
        if (i12 + length + 1 < this.f102630k3) {
            System.arraycopy(cArrC, 0, cArr2, i12, length);
            int i13 = this.f102629j3 + length;
            char[] cArr3 = this.f102627h3;
            this.f102629j3 = i13 + 1;
            cArr3[i13] = this.f102626g3;
            return;
        }
        L2(cArrC, 0, length);
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr4 = this.f102627h3;
        int i14 = this.f102629j3;
        this.f102629j3 = i14 + 1;
        cArr4[i14] = this.f102626g3;
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h
    public int b1(com.fasterxml.jackson.core.a aVar, InputStream inputStream, int i10) throws IOException {
        y3("write a binary value");
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i11 = this.f102629j3;
        this.f102629j3 = i11 + 1;
        cArr[i11] = this.f102626g3;
        byte[] bArrD = this.f102545w.d();
        try {
            if (i10 < 0) {
                i10 = S3(aVar, inputStream, bArrD);
            } else {
                int iT3 = T3(aVar, inputStream, bArrD, i10);
                if (iT3 > 0) {
                    a("Too few bytes available: missing " + iT3 + " bytes (out of " + i10 + ")");
                }
            }
            this.f102545w.r(bArrD);
            if (this.f102629j3 >= this.f102630k3) {
                I3();
            }
            char[] cArr2 = this.f102627h3;
            int i12 = this.f102629j3;
            this.f102629j3 = i12 + 1;
            cArr2[i12] = this.f102626g3;
            return i10;
        } catch (Throwable th2) {
            this.f102545w.r(bArrD);
            throw th2;
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public void b2(float f10) throws IOException {
        if (this.f102246d || (g0(com.fasterxml.jackson.core.h.b.QUOTE_NON_NUMERIC_NUMBERS) && (Float.isNaN(f10) || Float.isInfinite(f10)))) {
            e3(String.valueOf(f10));
        } else {
            y3("write a number");
            G2(String.valueOf(f10));
        }
    }

    protected final void b4(String str, boolean z10) throws IOException {
        if (this.f102376a != null) {
            j4(str, z10);
            return;
        }
        if (this.f102629j3 + 1 >= this.f102630k3) {
            I3();
        }
        if (z10) {
            char[] cArr = this.f102627h3;
            int i10 = this.f102629j3;
            this.f102629j3 = i10 + 1;
            cArr[i10] = AbstractJsonLexerKt.COMMA;
        }
        if (this.f102544p1) {
            C4(str);
            return;
        }
        char[] cArr2 = this.f102627h3;
        int i11 = this.f102629j3;
        this.f102629j3 = i11 + 1;
        cArr2[i11] = this.f102626g3;
        C4(str);
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr3 = this.f102627h3;
        int i12 = this.f102629j3;
        this.f102629j3 = i12 + 1;
        cArr3[i12] = this.f102626g3;
    }

    @Override // com.fasterxml.jackson.core.h
    public void c2(int i10) throws IOException {
        y3("write a number");
        if (this.f102246d) {
            k4(i10);
            return;
        }
        if (this.f102629j3 + 11 >= this.f102630k3) {
            I3();
        }
        this.f102629j3 = com.fasterxml.jackson.core.io.j.p(i10, this.f102627h3, this.f102629j3);
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.f102627h3 != null && g0(com.fasterxml.jackson.core.h.b.AUTO_CLOSE_JSON_CONTENT)) {
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
        I3();
        this.f102628i3 = 0;
        this.f102629j3 = 0;
        if (this.f102634p2 != null) {
            if (this.f102545w.q() || g0(com.fasterxml.jackson.core.h.b.AUTO_CLOSE_TARGET)) {
                this.f102634p2.close();
            } else if (g0(com.fasterxml.jackson.core.h.b.FLUSH_PASSED_TO_STREAM)) {
                this.f102634p2.flush();
            }
        }
        x3();
    }

    @Override // com.fasterxml.jackson.core.h
    public void d2(long j10) throws IOException {
        y3("write a number");
        if (this.f102246d) {
            n4(j10);
            return;
        }
        if (this.f102629j3 + 21 >= this.f102630k3) {
            I3();
        }
        this.f102629j3 = com.fasterxml.jackson.core.io.j.r(j10, this.f102627h3, this.f102629j3);
    }

    @Override // com.fasterxml.jackson.core.h
    public void e1(com.fasterxml.jackson.core.a aVar, byte[] bArr, int i10, int i11) throws IOException {
        y3("write a binary value");
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i12 = this.f102629j3;
        this.f102629j3 = i12 + 1;
        cArr[i12] = this.f102626g3;
        V3(aVar, bArr, i10, i11 + i10);
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr2 = this.f102627h3;
        int i13 = this.f102629j3;
        this.f102629j3 = i13 + 1;
        cArr2[i13] = this.f102626g3;
    }

    @Override // com.fasterxml.jackson.core.h
    public void e2(String str) throws IOException {
        y3("write a number");
        if (this.f102246d) {
            o4(str);
        } else {
            G2(str);
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public void e3(String str) throws IOException {
        y3("write a string");
        if (str == null) {
            g4();
            return;
        }
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i10 = this.f102629j3;
        this.f102629j3 = i10 + 1;
        cArr[i10] = this.f102626g3;
        C4(str);
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr2 = this.f102627h3;
        int i11 = this.f102629j3;
        this.f102629j3 = i11 + 1;
        cArr2[i11] = this.f102626g3;
    }

    @Override // com.fasterxml.jackson.core.h
    public void f2(BigDecimal bigDecimal) throws IOException {
        y3("write a number");
        if (bigDecimal == null) {
            g4();
        } else if (this.f102246d) {
            o4(s3(bigDecimal));
        } else {
            G2(s3(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public void f3(char[] cArr, int i10, int i11) throws IOException {
        y3("write a string");
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr2 = this.f102627h3;
        int i12 = this.f102629j3;
        this.f102629j3 = i12 + 1;
        cArr2[i12] = this.f102626g3;
        D4(cArr, i10, i11);
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr3 = this.f102627h3;
        int i13 = this.f102629j3;
        this.f102629j3 = i13 + 1;
        cArr3[i13] = this.f102626g3;
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h, java.io.Flushable
    public void flush() throws IOException {
        I3();
        if (this.f102634p2 == null || !g0(com.fasterxml.jackson.core.h.b.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.f102634p2.flush();
    }

    protected final void h4(s sVar, boolean z10) throws IOException {
        if (z10) {
            this.f102376a.i(this);
        } else {
            this.f102376a.c(this);
        }
        char[] cArrC = sVar.c();
        if (this.f102544p1) {
            L2(cArrC, 0, cArrC.length);
            return;
        }
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i10 = this.f102629j3;
        this.f102629j3 = i10 + 1;
        cArr[i10] = this.f102626g3;
        L2(cArrC, 0, cArrC.length);
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr2 = this.f102627h3;
        int i11 = this.f102629j3;
        this.f102629j3 = i11 + 1;
        cArr2[i11] = this.f102626g3;
    }

    @Override // com.fasterxml.jackson.core.h
    public void i2(BigInteger bigInteger) throws IOException {
        y3("write a number");
        if (bigInteger == null) {
            g4();
        } else if (this.f102246d) {
            o4(bigInteger.toString());
        } else {
            G2(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public boolean j() {
        return true;
    }

    protected final void j4(String str, boolean z10) throws IOException {
        if (z10) {
            this.f102376a.i(this);
        } else {
            this.f102376a.c(this);
        }
        if (this.f102544p1) {
            C4(str);
            return;
        }
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i10 = this.f102629j3;
        this.f102629j3 = i10 + 1;
        cArr[i10] = this.f102626g3;
        C4(str);
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr2 = this.f102627h3;
        int i11 = this.f102629j3;
        this.f102629j3 = i11 + 1;
        cArr2[i11] = this.f102626g3;
    }

    @Override // com.fasterxml.jackson.core.h
    public void l1(boolean z10) throws IOException {
        int i10;
        y3("write a boolean value");
        if (this.f102629j3 + 5 >= this.f102630k3) {
            I3();
        }
        int i11 = this.f102629j3;
        char[] cArr = this.f102627h3;
        if (z10) {
            cArr[i11] = 't';
            cArr[i11 + 1] = 'r';
            cArr[i11 + 2] = AbstractJsonLexerKt.UNICODE_ESC;
            i10 = i11 + 3;
            cArr[i10] = 'e';
        } else {
            cArr[i11] = 'f';
            cArr[i11 + 1] = 'a';
            cArr[i11 + 2] = 'l';
            cArr[i11 + 3] = ni.f.f333366c;
            i10 = i11 + 4;
            cArr[i10] = 'e';
        }
        this.f102629j3 = i10 + 1;
    }

    @Override // com.fasterxml.jackson.core.h
    public void n2(short s10) throws IOException {
        y3("write a number");
        if (this.f102246d) {
            r4(s10);
            return;
        }
        if (this.f102629j3 + 6 >= this.f102630k3) {
            I3();
        }
        this.f102629j3 = com.fasterxml.jackson.core.io.j.p(s10, this.f102627h3, this.f102629j3);
    }

    @Override // com.fasterxml.jackson.core.h
    public void r3(byte[] bArr, int i10, int i11) throws IOException {
        b();
    }

    @Override // com.fasterxml.jackson.core.h
    public void s1() throws IOException {
        if (!this.f102247e.k()) {
            a("Current context not Array but " + this.f102247e.q());
        }
        r rVar = this.f102376a;
        if (rVar != null) {
            rVar.d(this, this.f102247e.d());
        } else {
            if (this.f102629j3 >= this.f102630k3) {
                I3();
            }
            char[] cArr = this.f102627h3;
            int i10 = this.f102629j3;
            this.f102629j3 = i10 + 1;
            cArr[i10] = AbstractJsonLexerKt.END_LIST;
        }
        this.f102247e = this.f102247e.s();
    }

    @Override // com.fasterxml.jackson.core.h
    public void u1() throws IOException {
        if (!this.f102247e.l()) {
            a("Current context not Object but " + this.f102247e.q());
        }
        r rVar = this.f102376a;
        if (rVar != null) {
            rVar.k(this, this.f102247e.d());
        } else {
            if (this.f102629j3 >= this.f102630k3) {
                I3();
            }
            char[] cArr = this.f102627h3;
            int i10 = this.f102629j3;
            this.f102629j3 = i10 + 1;
            cArr[i10] = AbstractJsonLexerKt.END_OBJ;
        }
        this.f102247e = this.f102247e.s();
    }

    @Override // com.fasterxml.jackson.core.base.a
    protected void x3() {
        char[] cArr = this.f102627h3;
        if (cArr != null) {
            this.f102627h3 = null;
            this.f102545w.s(cArr);
        }
        char[] cArr2 = this.f102633n3;
        if (cArr2 != null) {
            this.f102633n3 = null;
            this.f102545w.t(cArr2);
        }
    }

    @Override // com.fasterxml.jackson.core.base.a
    protected final void y3(String str) throws IOException {
        char c10;
        int iC = this.f102247e.C();
        if (this.f102376a != null) {
            D3(str, iC);
            return;
        }
        if (iC == 1) {
            c10 = AbstractJsonLexerKt.COMMA;
        } else {
            if (iC != 2) {
                if (iC != 3) {
                    if (iC != 5) {
                        return;
                    }
                    C3(str);
                    return;
                } else {
                    s sVar = this.f102543p0;
                    if (sVar != null) {
                        G2(sVar.getValue());
                        return;
                    }
                    return;
                }
            }
            c10 = AbstractJsonLexerKt.COLON;
        }
        if (this.f102629j3 >= this.f102630k3) {
            I3();
        }
        char[] cArr = this.f102627h3;
        int i10 = this.f102629j3;
        this.f102629j3 = i10 + 1;
        cArr[i10] = c10;
    }
}
