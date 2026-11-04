package com.fasterxml.jackson.core.json.async;

import com.facebook.internal.z0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.base.c;
import com.fasterxml.jackson.core.io.d;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.util.p;
import com.planner5d.library.engine.input.f;
import java.io.IOException;
import java.io.OutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.l;

/* JADX INFO: loaded from: classes4.dex */
public class a extends b implements w5.a {
    private static final int[] B5 = com.fasterxml.jackson.core.io.a.i();
    protected static final int[] C5 = com.fasterxml.jackson.core.io.a.g();
    protected int A5;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    protected byte[] f102498z5;

    public a(d dVar, int i10, com.fasterxml.jackson.core.sym.a aVar) {
        super(dVar, i10, aVar);
        this.f102498z5 = c.f102271m3;
    }

    private final boolean A6(int i10, int i11, int i12) throws IOException {
        if (i11 == 1) {
            if ((i12 & 192) != 128) {
                b6(i12 & 255, this.M3);
            }
            i10 = (i10 << 6) | (i12 & 63);
            int i13 = this.M3;
            if (i13 >= this.N3) {
                this.f102534v4 = 44;
                this.f102528p4 = i10;
                this.f102529q4 = 2;
                return false;
            }
            byte[] bArr = this.f102498z5;
            this.M3 = i13 + 1;
            i12 = bArr[i13];
            i11 = 2;
        }
        if (i11 == 2) {
            if ((i12 & 192) != 128) {
                b6(i12 & 255, this.M3);
            }
            i10 = (i10 << 6) | (i12 & 63);
            int i14 = this.M3;
            if (i14 >= this.N3) {
                this.f102534v4 = 44;
                this.f102528p4 = i10;
                this.f102529q4 = 3;
                return false;
            }
            byte[] bArr2 = this.f102498z5;
            this.M3 = i14 + 1;
            i12 = bArr2[i14];
        }
        if ((i12 & 192) != 128) {
            b6(i12 & 255, this.M3);
        }
        int i15 = ((i10 << 6) | (i12 & 63)) - 65536;
        this.W3.a((char) ((i15 >> 10) | com.fasterxml.jackson.core.base.a.f102232g));
        this.W3.a((char) ((i15 & 1023) | 56320));
        return true;
    }

    private final String B7(int i10, int i11, int i12) throws IOException {
        byte[] bArr = this.f102498z5;
        int[] iArr = C5;
        int i13 = i10 + 1;
        int i14 = bArr[i10] & 255;
        if (iArr[i14] != 0) {
            if (i14 != 34) {
                return null;
            }
            this.M3 = i13;
            return Q5(this.f102527o4, i12, i11, 1);
        }
        int i15 = (i11 << 8) | i14;
        int i16 = i10 + 2;
        int i17 = bArr[i13] & 255;
        if (iArr[i17] != 0) {
            if (i17 != 34) {
                return null;
            }
            this.M3 = i16;
            return Q5(this.f102527o4, i12, i15, 2);
        }
        int i18 = (i15 << 8) | i17;
        int i19 = i10 + 3;
        int i20 = bArr[i16] & 255;
        if (iArr[i20] != 0) {
            if (i20 != 34) {
                return null;
            }
            this.M3 = i19;
            return Q5(this.f102527o4, i12, i18, 3);
        }
        int i21 = (i18 << 8) | i20;
        int i22 = i10 + 4;
        if ((bArr[i19] & 255) != 34) {
            return null;
        }
        this.M3 = i22;
        return Q5(this.f102527o4, i12, i21, 4);
    }

    private final int D6(int i10, int i11) throws IOException {
        if ((i11 & 192) != 128) {
            b6(i11 & 255, this.M3);
        }
        return ((i10 & 31) << 6) | (i11 & 63);
    }

    private final int E6(int i10, int i11, int i12) throws IOException {
        int i13 = i10 & 15;
        if ((i11 & 192) != 128) {
            b6(i11 & 255, this.M3);
        }
        int i14 = (i13 << 6) | (i11 & 63);
        if ((i12 & 192) != 128) {
            b6(i12 & 255, this.M3);
        }
        return (i14 << 6) | (i12 & 63);
    }

    private final int F6(int i10, int i11, int i12, int i13) throws IOException {
        if ((i11 & 192) != 128) {
            b6(i11 & 255, this.M3);
        }
        int i14 = ((i10 & 7) << 6) | (i11 & 63);
        if ((i12 & 192) != 128) {
            b6(i12 & 255, this.M3);
        }
        int i15 = (i14 << 6) | (i12 & 63);
        if ((i13 & 192) != 128) {
            b6(i13 & 255, this.M3);
        }
        return ((i15 << 6) | (i13 & 63)) - 65536;
    }

    private final String H6() throws IOException {
        byte[] bArr = this.f102498z5;
        int[] iArr = C5;
        int i10 = this.M3;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        if (iArr[i12] != 0) {
            if (i12 != 34) {
                return null;
            }
            this.M3 = i11;
            return "";
        }
        int i13 = i10 + 2;
        int i14 = bArr[i11] & 255;
        if (iArr[i14] != 0) {
            if (i14 != 34) {
                return null;
            }
            this.M3 = i13;
            return L5(i12, 1);
        }
        int i15 = i14 | (i12 << 8);
        int i16 = i10 + 3;
        int i17 = bArr[i13] & 255;
        if (iArr[i17] != 0) {
            if (i17 != 34) {
                return null;
            }
            this.M3 = i16;
            return L5(i15, 2);
        }
        int i18 = (i15 << 8) | i17;
        int i19 = i10 + 4;
        int i20 = bArr[i16] & 255;
        if (iArr[i20] != 0) {
            if (i20 != 34) {
                return null;
            }
            this.M3 = i19;
            return L5(i18, 3);
        }
        int i21 = (i18 << 8) | i20;
        int i22 = i10 + 5;
        int i23 = bArr[i19] & 255;
        if (iArr[i23] == 0) {
            this.f102527o4 = i21;
            return z7(i22, i23);
        }
        if (i23 != 34) {
            return null;
        }
        this.M3 = i22;
        return L5(i21, 4);
    }

    private n I6(int i10, int i11, int i12) throws IOException {
        int[] iArrK5 = this.f102525m4;
        int[] iArr = C5;
        while (true) {
            int i13 = this.M3;
            if (i13 >= this.N3) {
                this.f102526n4 = i10;
                this.f102528p4 = i11;
                this.f102529q4 = i12;
                this.f102534v4 = 9;
                n nVar = n.NOT_AVAILABLE;
                this.f102294g = nVar;
                return nVar;
            }
            byte[] bArr = this.f102498z5;
            this.M3 = i13 + 1;
            int iS6 = bArr[i13] & 255;
            if (iS6 == 39) {
                if (i12 > 0) {
                    if (i10 >= iArrK5.length) {
                        iArrK5 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                        this.f102525m4 = iArrK5;
                    }
                    iArrK5[i10] = b.T5(i11, i12);
                    i10++;
                } else if (i10 == 0) {
                    return K5("");
                }
                String strJ = this.f102524l4.J(iArrK5, i10);
                if (strJ == null) {
                    strJ = y5(iArrK5, i10, i12);
                }
                return K5(strJ);
            }
            if (iS6 != 34 && iArr[iS6] != 0) {
                if (iS6 != 92) {
                    f4(iS6, "name");
                } else {
                    iS6 = s6();
                    if (iS6 < 0) {
                        this.f102534v4 = 8;
                        this.f102535w4 = 9;
                        this.f102526n4 = i10;
                        this.f102528p4 = i11;
                        this.f102529q4 = i12;
                        n nVar2 = n.NOT_AVAILABLE;
                        this.f102294g = nVar2;
                        return nVar2;
                    }
                }
                if (iS6 > 127) {
                    int i14 = 0;
                    if (i12 >= 4) {
                        if (i10 >= iArrK5.length) {
                            iArrK5 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                            this.f102525m4 = iArrK5;
                        }
                        iArrK5[i10] = i11;
                        i10++;
                        i11 = 0;
                        i12 = 0;
                    }
                    if (iS6 < 2048) {
                        i11 = (i11 << 8) | (iS6 >> 6) | 192;
                        i12++;
                    } else {
                        int i15 = (i11 << 8) | (iS6 >> 12) | 224;
                        int i16 = i12 + 1;
                        if (i16 >= 4) {
                            if (i10 >= iArrK5.length) {
                                iArrK5 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                                this.f102525m4 = iArrK5;
                            }
                            iArrK5[i10] = i15;
                            i10++;
                            i16 = 0;
                        } else {
                            i14 = i15;
                        }
                        i11 = (i14 << 8) | ((iS6 >> 6) & 63) | 128;
                        i12 = i16 + 1;
                    }
                    iS6 = (iS6 & 63) | 128;
                }
            }
            if (i12 < 4) {
                i12++;
                i11 = (i11 << 8) | iS6;
            } else {
                if (i10 >= iArrK5.length) {
                    iArrK5 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                    this.f102525m4 = iArrK5;
                }
                iArrK5[i10] = i11;
                i10++;
                i11 = iS6;
                i12 = 1;
            }
        }
    }

    private final int I7(int i10) throws IOException {
        do {
            if (i10 != 32) {
                if (i10 == 10) {
                    this.P3++;
                    this.Q3 = this.M3;
                } else if (i10 == 13) {
                    this.A4++;
                    this.Q3 = this.M3;
                } else if (i10 != 9) {
                    b4(i10);
                }
            }
            int i11 = this.M3;
            if (i11 >= this.N3) {
                this.f102294g = n.NOT_AVAILABLE;
                return 0;
            }
            byte[] bArr = this.f102498z5;
            this.M3 = i11 + 1;
            i10 = bArr[i11] & 255;
        } while (i10 <= 32);
        return i10;
    }

    private final n K7(int i10) throws IOException {
        int i11 = this.M3;
        if (i11 >= this.N3) {
            this.f102534v4 = i10;
            n nVar = n.NOT_AVAILABLE;
            this.f102294g = nVar;
            return nVar;
        }
        byte[] bArr = this.f102498z5;
        this.M3 = i11 + 1;
        int i12 = bArr[i11] & 255;
        if (i10 == 4) {
            return W7(i12);
        }
        int i13 = 2 | 5;
        if (i10 == 5) {
            return Y7(i12);
        }
        switch (i10) {
            case 12:
                return q8(i12);
            case 13:
                return v8(i12);
            case 14:
                return s8(i12);
            case 15:
                return r8(i12);
            default:
                p.f();
                return null;
        }
    }

    private final n L6() throws IOException {
        int[] iArr = B5;
        byte[] bArr = this.f102498z5;
        char[] cArrT = this.W3.t();
        int iV = this.W3.v();
        int i10 = this.M3;
        int i11 = this.N3 - 5;
        while (i10 < this.N3) {
            int i12 = 0;
            if (iV >= cArrT.length) {
                cArrT = this.W3.s();
                iV = 0;
            }
            int iMin = Math.min(this.N3, (cArrT.length - iV) + i10);
            while (i10 < iMin) {
                int i13 = i10 + 1;
                int iV6 = bArr[i10] & 255;
                int i14 = iArr[iV6];
                if (i14 != 0 && iV6 != 34) {
                    if (i13 < i11) {
                        if (i14 == 1) {
                            this.M3 = i13;
                            iV6 = v6();
                            i10 = this.M3;
                        } else if (i14 == 2) {
                            i10 += 2;
                            iV6 = D6(iV6, this.f102498z5[i13]);
                        } else if (i14 == 3) {
                            byte[] bArr2 = this.f102498z5;
                            int i15 = i10 + 2;
                            i10 += 3;
                            iV6 = E6(iV6, bArr2[i13], bArr2[i15]);
                        } else if (i14 != 4) {
                            if (iV6 < 32) {
                                f4(iV6, "string value");
                            } else {
                                W5(iV6);
                            }
                            i10 = i13;
                        } else {
                            byte[] bArr3 = this.f102498z5;
                            byte b10 = bArr3[i13];
                            int i16 = i10 + 3;
                            byte b11 = bArr3[i10 + 2];
                            i10 += 4;
                            int iF6 = F6(iV6, b10, b11, bArr3[i16]);
                            int i17 = iV + 1;
                            cArrT[iV] = (char) ((iF6 >> 10) | com.fasterxml.jackson.core.base.a.f102232g);
                            if (i17 >= cArrT.length) {
                                cArrT = this.W3.s();
                                iV = 0;
                            } else {
                                iV = i17;
                            }
                            iV6 = (iF6 & 1023) | 56320;
                        }
                        if (iV >= cArrT.length) {
                            cArrT = this.W3.s();
                        } else {
                            i12 = iV;
                        }
                        iV = i12 + 1;
                        cArrT[i12] = (char) iV6;
                        break;
                    }
                    this.M3 = i13;
                    this.W3.I(iV);
                    if (x6(iV6, iArr[iV6], i13 < this.N3)) {
                        cArrT = this.W3.t();
                        iV = this.W3.v();
                        i10 = this.M3;
                        break;
                    }
                    this.f102535w4 = 45;
                    n nVar = n.NOT_AVAILABLE;
                    this.f102294g = nVar;
                    return nVar;
                }
                if (iV6 == 39) {
                    this.M3 = i13;
                    this.W3.I(iV);
                    return i6(n.VALUE_STRING);
                }
                cArrT[iV] = (char) iV6;
                iV++;
                i10 = i13;
            }
        }
        this.M3 = i10;
        this.f102534v4 = 45;
        this.W3.I(iV);
        n nVar2 = n.NOT_AVAILABLE;
        this.f102294g = nVar2;
        return nVar2;
    }

    private final n M6(int i10) throws IOException {
        while (true) {
            int i11 = this.M3;
            if (i11 >= this.N3) {
                this.f102528p4 = i10;
                this.f102534v4 = 1;
                n nVar = n.NOT_AVAILABLE;
                this.f102294g = nVar;
                return nVar;
            }
            byte[] bArr = this.f102498z5;
            this.M3 = i11 + 1;
            int i12 = bArr[i11] & 255;
            if (i10 != 1) {
                if (i10 != 2) {
                    int i13 = 0 << 3;
                    if (i10 == 3) {
                        this.O3 -= 3;
                        return N7(i12);
                    }
                } else if (i12 != 191) {
                    G3("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", Integer.valueOf(i12));
                }
            } else if (i12 != 187) {
                G3("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", Integer.valueOf(i12));
            }
            i10++;
        }
    }

    private final n N6(int i10, boolean z10) throws IOException {
        while (true) {
            int i11 = this.M3;
            if (i11 >= this.N3) {
                this.f102534v4 = z10 ? 52 : 53;
                this.f102528p4 = i10;
                n nVar = n.NOT_AVAILABLE;
                this.f102294g = nVar;
                return nVar;
            }
            byte[] bArr = this.f102498z5;
            int i12 = i11 + 1;
            this.M3 = i12;
            int i13 = bArr[i11] & 255;
            if (i13 < 32) {
                if (i13 == 10) {
                    this.P3++;
                    this.Q3 = i12;
                } else if (i13 == 13) {
                    this.A4++;
                    this.Q3 = i12;
                } else if (i13 != 9) {
                    b4(i13);
                }
            } else if (i13 == 42) {
                z10 = true;
            } else if (i13 == 47 && z10) {
                return K7(i10);
            }
            z10 = false;
        }
    }

    private final n N7(int i10) throws IOException {
        int i11 = i10 & 255;
        if (i11 == 239 && this.f102534v4 != 1) {
            return M6(1);
        }
        while (i11 <= 32) {
            if (i11 != 32) {
                if (i11 == 10) {
                    this.P3++;
                    this.Q3 = this.M3;
                } else if (i11 == 13) {
                    this.A4++;
                    this.Q3 = this.M3;
                } else if (i11 != 9) {
                    b4(i11);
                }
            }
            int i12 = this.M3;
            if (i12 >= this.N3) {
                this.f102534v4 = 3;
                if (this.L3) {
                    return null;
                }
                return this.f102536x4 ? F5() : n.NOT_AVAILABLE;
            }
            byte[] bArr = this.f102498z5;
            this.M3 = i12 + 1;
            i11 = bArr[i12] & 255;
        }
        return q8(i11);
    }

    private final n P6(int i10) throws IOException {
        while (true) {
            int i11 = this.M3;
            if (i11 >= this.N3) {
                this.f102534v4 = 54;
                this.f102528p4 = i10;
                n nVar = n.NOT_AVAILABLE;
                this.f102294g = nVar;
                return nVar;
            }
            byte[] bArr = this.f102498z5;
            int i12 = i11 + 1;
            this.M3 = i12;
            int i13 = bArr[i11] & 255;
            if (i13 < 32) {
                if (i13 == 10) {
                    this.P3++;
                    this.Q3 = i12;
                } else if (i13 == 13) {
                    this.A4++;
                    this.Q3 = i12;
                } else if (i13 != 9) {
                    b4(i13);
                }
                return K7(i10);
            }
        }
    }

    private final n W7(int i10) throws IOException {
        String strH6;
        if (i10 <= 32 && (i10 = I7(i10)) <= 0) {
            this.f102534v4 = 4;
            return this.f102294g;
        }
        g6();
        if (i10 != 34) {
            return i10 == 125 ? A5() : x7(i10);
        }
        return (this.M3 + 13 > this.N3 || (strH6 = H6()) == null) ? y7(0, 0, 0) : K5(strH6);
    }

    private final n X6(int i10) throws IOException {
        if (!JsonParser.a.ALLOW_YAML_COMMENTS.n(this.f102189a)) {
            V3(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (true) {
            int i11 = this.M3;
            if (i11 >= this.N3) {
                this.f102534v4 = 55;
                this.f102528p4 = i10;
                n nVar = n.NOT_AVAILABLE;
                this.f102294g = nVar;
                return nVar;
            }
            byte[] bArr = this.f102498z5;
            int i12 = i11 + 1;
            this.M3 = i12;
            int i13 = bArr[i11] & 255;
            if (i13 < 32) {
                if (i13 == 10) {
                    this.P3++;
                    this.Q3 = i12;
                } else if (i13 == 13) {
                    this.A4++;
                    this.Q3 = i12;
                } else if (i13 != 9) {
                    b4(i13);
                }
                return K7(i10);
            }
        }
    }

    private final n Y7(int i10) throws IOException {
        String strH6;
        if (i10 <= 32 && (i10 = I7(i10)) <= 0) {
            this.f102534v4 = 5;
            return this.f102294g;
        }
        if (i10 != 44) {
            if (i10 == 125) {
                return A5();
            }
            if (i10 == 35) {
                return X6(5);
            }
            if (i10 == 47) {
                return j8(5);
            }
            V3(i10, "was expecting comma to separate " + this.U3.q() + " entries");
        }
        int i11 = this.M3;
        if (i11 >= this.N3) {
            this.f102534v4 = 4;
            n nVar = n.NOT_AVAILABLE;
            this.f102294g = nVar;
            return nVar;
        }
        int iI7 = this.f102498z5[i11];
        this.M3 = i11 + 1;
        if (iI7 <= 32 && (iI7 = I7(iI7)) <= 0) {
            this.f102534v4 = 4;
            return this.f102294g;
        }
        g6();
        if (iI7 != 34) {
            return (iI7 == 125 && JsonParser.a.ALLOW_TRAILING_COMMA.n(this.f102189a)) ? A5() : x7(iI7);
        }
        return (this.M3 + 13 > this.N3 || (strH6 = H6()) == null) ? y7(0, 0, 0) : K5(strH6);
    }

    private final n j8(int i10) throws IOException {
        if (!JsonParser.a.ALLOW_COMMENTS.n(this.f102189a)) {
            V3(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int i11 = this.M3;
        if (i11 >= this.N3) {
            this.f102528p4 = i10;
            this.f102534v4 = 51;
            n nVar = n.NOT_AVAILABLE;
            this.f102294g = nVar;
            return nVar;
        }
        byte[] bArr = this.f102498z5;
        this.M3 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 == 42) {
            return N6(i10, false);
        }
        if (b10 == 47) {
            return P6(i10);
        }
        V3(b10 & 255, "was expecting either '*' or '/' for a comment");
        return null;
    }

    private final n q8(int i10) throws IOException {
        if (i10 <= 32 && (i10 = I7(i10)) <= 0) {
            this.f102534v4 = 12;
            return this.f102294g;
        }
        g6();
        if (i10 == 34) {
            return k8();
        }
        if (i10 == 35) {
            return X6(12);
        }
        if (i10 == 45) {
            return d8();
        }
        if (i10 == 91) {
            return c6();
        }
        if (i10 == 93) {
            return z5();
        }
        if (i10 == 102) {
            return Q7();
        }
        if (i10 == 110) {
            return e8();
        }
        if (i10 == 116) {
            return m8();
        }
        if (i10 == 123) {
            return e6();
        }
        if (i10 == 125) {
            return A5();
        }
        switch (i10) {
            case 47:
                return j8(12);
            case 48:
                return f8();
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case f.b.f160729t0 /* 56 */:
            case f.b.f160707m /* 57 */:
                return i8(i10);
            default:
                int i11 = 1 >> 0;
                return n8(false, i10);
        }
    }

    private final n r8(int i10) throws IOException {
        if (i10 <= 32 && (i10 = I7(i10)) <= 0) {
            this.f102534v4 = 15;
            return this.f102294g;
        }
        g6();
        if (i10 == 34) {
            return k8();
        }
        if (i10 == 35) {
            return X6(15);
        }
        if (i10 == 45) {
            return d8();
        }
        if (i10 == 91) {
            return c6();
        }
        if (i10 != 93) {
            if (i10 == 102) {
                return Q7();
            }
            if (i10 == 110) {
                return e8();
            }
            if (i10 == 116) {
                return m8();
            }
            if (i10 == 123) {
                return e6();
            }
            if (i10 != 125) {
                switch (i10) {
                    case 47:
                        return j8(15);
                    case 48:
                        return f8();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case f.b.f160729t0 /* 56 */:
                    case f.b.f160707m /* 57 */:
                        return i8(i10);
                }
            }
            if (p2(JsonParser.a.ALLOW_TRAILING_COMMA)) {
                return A5();
            }
        } else if (p2(JsonParser.a.ALLOW_TRAILING_COMMA)) {
            return z5();
        }
        return n8(true, i10);
    }

    private final int s6() throws IOException {
        return this.N3 - this.M3 < 5 ? w6(0, -1) : v6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final n s7() throws IOException {
        int[] iArr = B5;
        byte[] bArr = this.f102498z5;
        char[] cArrT = this.W3.t();
        int iV = this.W3.v();
        int i10 = this.M3;
        int i11 = this.N3 - 5;
        while (i10 < this.N3) {
            int i12 = 0;
            if (iV >= cArrT.length) {
                cArrT = this.W3.s();
                iV = 0;
            }
            int iMin = Math.min(this.N3, (cArrT.length - iV) + i10);
            while (i10 < iMin) {
                int i13 = i10 + 1;
                int iV6 = bArr[i10] & 255;
                int i14 = iArr[iV6];
                if (i14 != 0) {
                    if (iV6 != 34) {
                        if (i13 < i11) {
                            if (i14 == 1) {
                                this.M3 = i13;
                                iV6 = v6();
                                i10 = this.M3;
                            } else if (i14 != 2) {
                                boolean z10 = 2 & 3;
                                if (i14 == 3) {
                                    byte[] bArr2 = this.f102498z5;
                                    int i15 = i10 + 2;
                                    i10 += 3;
                                    iV6 = E6(iV6, bArr2[i13], bArr2[i15]);
                                } else if (i14 != 4) {
                                    if (iV6 < 32) {
                                        f4(iV6, "string value");
                                    } else {
                                        W5(iV6);
                                    }
                                    i10 = i13;
                                } else {
                                    byte[] bArr3 = this.f102498z5;
                                    byte b10 = bArr3[i13];
                                    int i16 = i10 + 3;
                                    byte b11 = bArr3[i10 + 2];
                                    i10 += 4;
                                    int iF6 = F6(iV6, b10, b11, bArr3[i16]);
                                    int i17 = iV + 1;
                                    cArrT[iV] = (char) ((iF6 >> 10) | com.fasterxml.jackson.core.base.a.f102232g);
                                    if (i17 >= cArrT.length) {
                                        cArrT = this.W3.s();
                                        iV = 0;
                                    } else {
                                        iV = i17;
                                    }
                                    iV6 = (iF6 & 1023) | 56320;
                                }
                            } else {
                                i10 += 2;
                                iV6 = D6(iV6, this.f102498z5[i13]);
                            }
                            if (iV >= cArrT.length) {
                                cArrT = this.W3.s();
                            } else {
                                i12 = iV;
                            }
                            iV = i12 + 1;
                            cArrT[i12] = (char) iV6;
                            break;
                        }
                        this.M3 = i13;
                        this.W3.I(iV);
                        if (x6(iV6, iArr[iV6], i13 < this.N3)) {
                            cArrT = this.W3.t();
                            iV = this.W3.v();
                            i10 = this.M3;
                            break;
                        }
                        this.f102535w4 = 40;
                        n nVar = n.NOT_AVAILABLE;
                        this.f102294g = nVar;
                        return nVar;
                    }
                    this.M3 = i13;
                    this.W3.I(iV);
                    return i6(n.VALUE_STRING);
                }
                cArrT[iV] = (char) iV6;
                iV++;
                i10 = i13;
            }
        }
        this.M3 = i10;
        this.f102534v4 = 40;
        this.W3.I(iV);
        n nVar2 = n.NOT_AVAILABLE;
        this.f102294g = nVar2;
        return nVar2;
    }

    private final n s8(int i10) throws IOException {
        if (i10 <= 32 && (i10 = I7(i10)) <= 0) {
            this.f102534v4 = 14;
            return this.f102294g;
        }
        if (i10 != 58) {
            if (i10 == 47) {
                return j8(14);
            }
            if (i10 == 35) {
                return X6(14);
            }
            V3(i10, "was expecting a colon to separate field name and value");
        }
        int i11 = this.M3;
        if (i11 >= this.N3) {
            this.f102534v4 = 12;
            n nVar = n.NOT_AVAILABLE;
            this.f102294g = nVar;
            return nVar;
        }
        int iI7 = this.f102498z5[i11];
        this.M3 = i11 + 1;
        if (iI7 <= 32 && (iI7 = I7(iI7)) <= 0) {
            this.f102534v4 = 12;
            return this.f102294g;
        }
        g6();
        if (iI7 == 34) {
            return k8();
        }
        if (iI7 == 35) {
            return X6(12);
        }
        if (iI7 == 45) {
            return d8();
        }
        if (iI7 == 91) {
            return c6();
        }
        if (iI7 == 102) {
            return Q7();
        }
        if (iI7 == 110) {
            return e8();
        }
        if (iI7 == 116) {
            return m8();
        }
        if (iI7 == 123) {
            return e6();
        }
        switch (iI7) {
            case 47:
                return j8(12);
            case 48:
                return f8();
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case f.b.f160729t0 /* 56 */:
            case f.b.f160707m /* 57 */:
                return i8(iI7);
            default:
                return n8(false, iI7);
        }
    }

    private final int v6() throws IOException {
        byte[] bArr = this.f102498z5;
        int i10 = this.M3;
        int i11 = i10 + 1;
        this.M3 = i11;
        byte b10 = bArr[i10];
        if (b10 == 34 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return 8;
        }
        if (b10 == 102) {
            return 12;
        }
        if (b10 == 110) {
            return 10;
        }
        if (b10 == 114) {
            return 13;
        }
        if (b10 == 116) {
            return 9;
        }
        if (b10 != 117) {
            return C3((char) b10);
        }
        this.M3 = i10 + 2;
        byte b11 = bArr[i11];
        int iB = com.fasterxml.jackson.core.io.a.b(b11);
        if (iB >= 0) {
            byte[] bArr2 = this.f102498z5;
            int i12 = this.M3;
            this.M3 = i12 + 1;
            b11 = bArr2[i12];
            int iB2 = com.fasterxml.jackson.core.io.a.b(b11);
            if (iB2 >= 0) {
                int i13 = (iB << 4) | iB2;
                byte[] bArr3 = this.f102498z5;
                int i14 = this.M3;
                this.M3 = i14 + 1;
                byte b12 = bArr3[i14];
                int iB3 = com.fasterxml.jackson.core.io.a.b(b12);
                if (iB3 >= 0) {
                    int i15 = (i13 << 4) | iB3;
                    byte[] bArr4 = this.f102498z5;
                    int i16 = this.M3;
                    this.M3 = i16 + 1;
                    b12 = bArr4[i16];
                    int iB4 = com.fasterxml.jackson.core.io.a.b(b12);
                    if (iB4 >= 0) {
                        return (i15 << 4) | iB4;
                    }
                }
                b11 = b12;
            }
        }
        V3(b11 & 255, "expected a hex-digit for character escape sequence");
        return -1;
    }

    private final n v8(int i10) throws IOException {
        if (i10 <= 32 && (i10 = I7(i10)) <= 0) {
            this.f102534v4 = 13;
            return this.f102294g;
        }
        if (i10 != 44) {
            if (i10 == 93) {
                return z5();
            }
            if (i10 == 125) {
                return A5();
            }
            if (i10 == 47) {
                return j8(13);
            }
            if (i10 == 35) {
                return X6(13);
            }
            V3(i10, "was expecting comma to separate " + this.U3.q() + " entries");
        }
        int i11 = this.M3;
        if (i11 >= this.N3) {
            this.f102534v4 = 15;
            n nVar = n.NOT_AVAILABLE;
            this.f102294g = nVar;
            return nVar;
        }
        int iI7 = this.f102498z5[i11];
        this.M3 = i11 + 1;
        if (iI7 <= 32 && (iI7 = I7(iI7)) <= 0) {
            this.f102534v4 = 15;
            return this.f102294g;
        }
        g6();
        if (iI7 == 34) {
            return k8();
        }
        if (iI7 == 35) {
            return X6(15);
        }
        if (iI7 == 45) {
            return d8();
        }
        if (iI7 == 91) {
            return c6();
        }
        if (iI7 != 93) {
            if (iI7 == 102) {
                return Q7();
            }
            if (iI7 == 110) {
                return e8();
            }
            if (iI7 == 116) {
                return m8();
            }
            if (iI7 == 123) {
                return e6();
            }
            if (iI7 != 125) {
                switch (iI7) {
                    case 47:
                        return j8(15);
                    case 48:
                        return f8();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case f.b.f160729t0 /* 56 */:
                    case f.b.f160707m /* 57 */:
                        return i8(iI7);
                }
            }
            if (p2(JsonParser.a.ALLOW_TRAILING_COMMA)) {
                return A5();
            }
        } else if (p2(JsonParser.a.ALLOW_TRAILING_COMMA)) {
            return z5();
        }
        return n8(true, iI7);
    }

    private int w6(int i10, int i11) throws IOException {
        int i12 = this.M3;
        int i13 = this.N3;
        if (i12 >= i13) {
            this.f102530r4 = i10;
            this.f102531s4 = i11;
            return -1;
        }
        byte[] bArr = this.f102498z5;
        int i14 = i12 + 1;
        this.M3 = i14;
        byte b10 = bArr[i12];
        if (i11 == -1) {
            if (b10 == 34 || b10 == 47 || b10 == 92) {
                return b10;
            }
            if (b10 == 98) {
                return 8;
            }
            if (b10 == 102) {
                return 12;
            }
            if (b10 == 110) {
                return 10;
            }
            if (b10 == 114) {
                return 13;
            }
            if (b10 == 116) {
                return 9;
            }
            if (b10 != 117) {
                return C3((char) b10);
            }
            i11 = 0;
            if (i14 >= i13) {
                this.f102531s4 = 0;
                this.f102530r4 = 0;
                return -1;
            }
            this.M3 = i12 + 2;
            b10 = bArr[i14];
        }
        int i15 = b10 & 255;
        while (true) {
            int iB = com.fasterxml.jackson.core.io.a.b(i15);
            if (iB < 0) {
                V3(i15, "expected a hex-digit for character escape sequence");
            }
            i10 = (i10 << 4) | iB;
            i11++;
            if (i11 == 4) {
                return i10;
            }
            int i16 = this.M3;
            if (i16 >= this.N3) {
                this.f102531s4 = i11;
                this.f102530r4 = i10;
                return -1;
            }
            byte[] bArr2 = this.f102498z5;
            this.M3 = i16 + 1;
            i15 = bArr2[i16] & 255;
        }
    }

    private n w7(int i10, int i11, int i12) throws IOException {
        int[] iArrK5 = this.f102525m4;
        int[] iArrJ = com.fasterxml.jackson.core.io.a.j();
        while (true) {
            int i13 = this.M3;
            if (i13 >= this.N3) {
                this.f102526n4 = i10;
                this.f102528p4 = i11;
                this.f102529q4 = i12;
                this.f102534v4 = 10;
                n nVar = n.NOT_AVAILABLE;
                this.f102294g = nVar;
                return nVar;
            }
            int i14 = this.f102498z5[i13] & 255;
            if (iArrJ[i14] != 0) {
                if (i12 > 0) {
                    if (i10 >= iArrK5.length) {
                        iArrK5 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                        this.f102525m4 = iArrK5;
                    }
                    iArrK5[i10] = i11;
                    i10++;
                }
                String strJ = this.f102524l4.J(iArrK5, i10);
                if (strJ == null) {
                    strJ = y5(iArrK5, i10, i12);
                }
                return K5(strJ);
            }
            this.M3 = i13 + 1;
            if (i12 < 4) {
                i12++;
                i11 = (i11 << 8) | i14;
            } else {
                if (i10 >= iArrK5.length) {
                    iArrK5 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                    this.f102525m4 = iArrK5;
                }
                iArrK5[i10] = i11;
                i12 = 1;
                i10++;
                i11 = i14;
            }
        }
    }

    private final boolean x6(int i10, int i11, boolean z10) throws IOException {
        if (i11 == 1) {
            int iW6 = w6(0, -1);
            if (iW6 < 0) {
                this.f102534v4 = 41;
                return false;
            }
            this.W3.a((char) iW6);
            return true;
        }
        if (i11 == 2) {
            if (!z10) {
                this.f102534v4 = 42;
                this.f102528p4 = i10;
                return false;
            }
            byte[] bArr = this.f102498z5;
            int i12 = this.M3;
            this.M3 = i12 + 1;
            this.W3.a((char) D6(i10, bArr[i12]));
            return true;
        }
        int i13 = 1 ^ 3;
        if (i11 == 3) {
            int i14 = i10 & 15;
            if (z10) {
                byte[] bArr2 = this.f102498z5;
                int i15 = this.M3;
                this.M3 = i15 + 1;
                return y6(i14, 1, bArr2[i15]);
            }
            this.f102534v4 = 43;
            this.f102528p4 = i14;
            this.f102529q4 = 1;
            return false;
        }
        if (i11 != 4) {
            if (i10 < 32) {
                f4(i10, "string value");
            } else {
                W5(i10);
            }
            this.W3.a((char) i10);
            return true;
        }
        int i16 = i10 & 7;
        if (z10) {
            byte[] bArr3 = this.f102498z5;
            int i17 = this.M3;
            this.M3 = i17 + 1;
            return A6(i16, 1, bArr3[i17]);
        }
        this.f102528p4 = i16;
        this.f102529q4 = 1;
        this.f102534v4 = 44;
        return false;
    }

    private n x7(int i10) throws IOException {
        if (i10 != 35) {
            if (i10 != 39) {
                if (i10 == 47) {
                    return j8(4);
                }
                if (i10 == 93) {
                    return z5();
                }
            } else if (p2(JsonParser.a.ALLOW_SINGLE_QUOTES)) {
                return I6(0, 0, 0);
            }
        } else if (JsonParser.a.ALLOW_YAML_COMMENTS.n(this.f102189a)) {
            return X6(4);
        }
        if (!p2(JsonParser.a.ALLOW_UNQUOTED_FIELD_NAMES)) {
            V3((char) i10, "was expecting double-quote to start field name");
        }
        if (com.fasterxml.jackson.core.io.a.j()[i10] != 0) {
            V3(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return w7(0, i10, 1);
    }

    private final boolean y6(int i10, int i11, int i12) throws IOException {
        if (i11 == 1) {
            if ((i12 & 192) != 128) {
                b6(i12 & 255, this.M3);
            }
            i10 = (i10 << 6) | (i12 & 63);
            int i13 = this.M3;
            if (i13 >= this.N3) {
                this.f102534v4 = 43;
                this.f102528p4 = i10;
                this.f102529q4 = 2;
                return false;
            }
            byte[] bArr = this.f102498z5;
            this.M3 = i13 + 1;
            i12 = bArr[i13];
        }
        if ((i12 & 192) != 128) {
            b6(i12 & 255, this.M3);
        }
        this.W3.a((char) ((i10 << 6) | (i12 & 63)));
        return true;
    }

    private final n y7(int i10, int i11, int i12) throws IOException {
        int i13;
        int[] iArrK5 = this.f102525m4;
        int[] iArr = C5;
        while (true) {
            int i14 = this.M3;
            if (i14 >= this.N3) {
                this.f102526n4 = i10;
                this.f102528p4 = i11;
                this.f102529q4 = i12;
                this.f102534v4 = 7;
                n nVar = n.NOT_AVAILABLE;
                this.f102294g = nVar;
                return nVar;
            }
            byte[] bArr = this.f102498z5;
            this.M3 = i14 + 1;
            int iS6 = bArr[i14] & 255;
            if (iArr[iS6] == 0) {
                if (i12 < 4) {
                    i12++;
                    i11 = (i11 << 8) | iS6;
                } else {
                    if (i10 >= iArrK5.length) {
                        int[] iArrK6 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                        this.f102525m4 = iArrK6;
                        iArrK5 = iArrK6;
                    }
                    i13 = i10 + 1;
                    iArrK5[i10] = i11;
                    i10 = i13;
                    i11 = iS6;
                    i12 = 1;
                }
            } else {
                if (iS6 == 34) {
                    if (i12 > 0) {
                        if (i10 >= iArrK5.length) {
                            iArrK5 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                            this.f102525m4 = iArrK5;
                        }
                        iArrK5[i10] = b.T5(i11, i12);
                        i10++;
                    } else if (i10 == 0) {
                        return K5("");
                    }
                    String strJ = this.f102524l4.J(iArrK5, i10);
                    if (strJ == null) {
                        strJ = y5(iArrK5, i10, i12);
                    }
                    return K5(strJ);
                }
                if (iS6 != 92) {
                    f4(iS6, "name");
                } else {
                    iS6 = s6();
                    if (iS6 < 0) {
                        this.f102534v4 = 8;
                        this.f102535w4 = 7;
                        this.f102526n4 = i10;
                        this.f102528p4 = i11;
                        this.f102529q4 = i12;
                        n nVar2 = n.NOT_AVAILABLE;
                        this.f102294g = nVar2;
                        return nVar2;
                    }
                }
                if (i10 >= iArrK5.length) {
                    iArrK5 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                    this.f102525m4 = iArrK5;
                }
                if (iS6 > 127) {
                    int i15 = 0;
                    if (i12 >= 4) {
                        iArrK5[i10] = i11;
                        i10++;
                        i11 = 0;
                        i12 = 0;
                    }
                    if (iS6 < 2048) {
                        i11 = (i11 << 8) | (iS6 >> 6) | 192;
                        i12++;
                    } else {
                        int i16 = (i11 << 8) | (iS6 >> 12) | 224;
                        int i17 = i12 + 1;
                        if (i17 >= 4) {
                            iArrK5[i10] = i16;
                            i10++;
                            i17 = 0;
                        } else {
                            i15 = i16;
                        }
                        i11 = (i15 << 8) | ((iS6 >> 6) & 63) | 128;
                        i12 = i17 + 1;
                    }
                    iS6 = (iS6 & 63) | 128;
                }
                if (i12 < 4) {
                    i12++;
                    i11 = (i11 << 8) | iS6;
                } else {
                    i13 = i10 + 1;
                    iArrK5[i10] = i11;
                    i10 = i13;
                    i11 = iS6;
                    i12 = 1;
                }
            }
        }
    }

    private final String z7(int i10, int i11) throws IOException {
        byte[] bArr = this.f102498z5;
        int[] iArr = C5;
        int i12 = i10 + 1;
        int i13 = bArr[i10] & 255;
        if (iArr[i13] != 0) {
            if (i13 != 34) {
                return null;
            }
            this.M3 = i12;
            return N5(this.f102527o4, i11, 1);
        }
        int i14 = (i11 << 8) | i13;
        int i15 = i10 + 2;
        int i16 = bArr[i12] & 255;
        if (iArr[i16] != 0) {
            if (i16 != 34) {
                return null;
            }
            this.M3 = i15;
            return N5(this.f102527o4, i14, 2);
        }
        int i17 = (i14 << 8) | i16;
        int i18 = i10 + 3;
        int i19 = bArr[i15] & 255;
        if (iArr[i19] != 0) {
            if (i19 != 34) {
                return null;
            }
            this.M3 = i18;
            return N5(this.f102527o4, i17, 3);
        }
        int i20 = (i17 << 8) | i19;
        int i21 = i10 + 4;
        int i22 = bArr[i18] & 255;
        if (iArr[i22] == 0) {
            return B7(i21, i22, i20);
        }
        if (i22 != 34) {
            return null;
        }
        this.M3 = i21;
        return N5(this.f102527o4, i20, 4);
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public n E2() throws IOException {
        int i10 = this.M3;
        if (i10 >= this.N3) {
            if (this.L3) {
                return null;
            }
            if (this.f102536x4) {
                return this.f102294g == n.NOT_AVAILABLE ? v7() : F5();
            }
            return n.NOT_AVAILABLE;
        }
        if (this.f102294g == n.NOT_AVAILABLE) {
            return t7();
        }
        this.f102250b4 = 0;
        this.R3 = this.O3 + ((long) i10);
        this.f102249a4 = null;
        byte[] bArr = this.f102498z5;
        this.M3 = i10 + 1;
        int i11 = bArr[i10] & 255;
        switch (this.f102532t4) {
            case 0:
                return N7(i11);
            case 1:
                return q8(i11);
            case 2:
                return W7(i11);
            case 3:
                return Y7(i11);
            case 4:
                return s8(i11);
            case 5:
                return q8(i11);
            case 6:
                return v8(i11);
            default:
                p.f();
                return null;
        }
    }

    protected n H7(String str) throws IOException {
        H3("Unrecognized token '%s': was expecting %s", this.W3.l(), "'null', 'true' or 'false'");
        return n.NOT_AVAILABLE;
    }

    protected n M7() throws IOException {
        int i10 = this.M3;
        char[] cArrN = this.W3.n();
        int[] iArr = B5;
        int iMin = Math.min(this.N3, cArrN.length + i10);
        byte[] bArr = this.f102498z5;
        int i11 = 0;
        while (i10 < iMin) {
            int i12 = bArr[i10] & 255;
            if (i12 == 39) {
                this.M3 = i10 + 1;
                this.W3.I(i11);
                return i6(n.VALUE_STRING);
            }
            if (iArr[i12] != 0) {
                break;
            }
            i10++;
            cArrN[i11] = (char) i12;
            i11++;
        }
        this.W3.I(i11);
        this.M3 = i10;
        return L6();
    }

    protected n Q7() throws IOException {
        int i10;
        int i11 = this.M3;
        if (i11 + 4 < this.N3) {
            byte[] bArr = this.f102498z5;
            int i12 = i11 + 1;
            if (bArr[i11] == 97) {
                int i13 = i11 + 2;
                if (bArr[i12] == 108) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 115) {
                        int i15 = i11 + 4;
                        if (bArr[i14] == 101 && ((i10 = bArr[i15] & 255) < 48 || i10 == 93 || i10 == 125)) {
                            this.M3 = i15;
                            return i6(n.VALUE_FALSE);
                        }
                    }
                }
            }
        }
        this.f102534v4 = 18;
        return Y6("false", 1, n.VALUE_FALSE);
    }

    protected n R6() throws IOException {
        do {
            int i10 = this.M3;
            if (i10 >= this.N3) {
                n nVar = n.NOT_AVAILABLE;
                this.f102294g = nVar;
                return nVar;
            }
            byte[] bArr = this.f102498z5;
            this.M3 = i10 + 1;
            char c10 = (char) bArr[i10];
            if (!Character.isJavaIdentifierPart(c10)) {
                break;
            }
            this.W3.a(c10);
        } while (this.W3.J() < 256);
        return H7(this.W3.l());
    }

    protected n S6() throws IOException {
        return H7(this.W3.l());
    }

    protected final n T6() throws IOException {
        int i10;
        int i11;
        int iW6 = w6(this.f102530r4, this.f102531s4);
        if (iW6 < 0) {
            this.f102534v4 = 8;
            return n.NOT_AVAILABLE;
        }
        int i12 = this.f102526n4;
        int[] iArr = this.f102525m4;
        if (i12 >= iArr.length) {
            this.f102525m4 = com.fasterxml.jackson.core.base.b.k5(iArr, 32);
        }
        int i13 = this.f102528p4;
        int i14 = this.f102529q4;
        int i15 = 1;
        if (iW6 > 127) {
            int i16 = 0;
            if (i14 >= 4) {
                int[] iArr2 = this.f102525m4;
                int i17 = this.f102526n4;
                this.f102526n4 = i17 + 1;
                iArr2[i17] = i13;
                i13 = 0;
                i14 = 0;
            }
            if (iW6 < 2048) {
                i10 = i13 << 8;
                i11 = (iW6 >> 6) | 192;
            } else {
                int i18 = (i13 << 8) | (iW6 >> 12) | 224;
                i14++;
                if (i14 >= 4) {
                    int[] iArr3 = this.f102525m4;
                    int i19 = this.f102526n4;
                    this.f102526n4 = i19 + 1;
                    iArr3[i19] = i18;
                    i14 = 0;
                } else {
                    i16 = i18;
                }
                i10 = i16 << 8;
                i11 = ((iW6 >> 6) & 63) | 128;
            }
            i13 = i10 | i11;
            i14++;
            iW6 = (iW6 & 63) | 128;
        }
        if (i14 < 4) {
            i15 = 1 + i14;
            iW6 |= i13 << 8;
        } else {
            int[] iArr4 = this.f102525m4;
            int i20 = this.f102526n4;
            this.f102526n4 = i20 + 1;
            iArr4[i20] = i13;
        }
        return this.f102535w4 == 9 ? I6(this.f102526n4, iW6, i15) : y7(this.f102526n4, iW6, i15);
    }

    protected n V6(boolean z10, int i10) throws IOException {
        if (z10) {
            this.f102534v4 = 32;
            if (i10 == 45 || i10 == 43) {
                this.W3.a((char) i10);
                int i11 = this.M3;
                if (i11 >= this.N3) {
                    this.f102534v4 = 32;
                    this.f102259k4 = 0;
                    return n.NOT_AVAILABLE;
                }
                byte[] bArr = this.f102498z5;
                this.M3 = i11 + 1;
                i10 = bArr[i11];
            }
        }
        char[] cArrT = this.W3.t();
        int iV = this.W3.v();
        int i12 = this.f102259k4;
        while (i10 >= 48 && i10 <= 57) {
            i12++;
            if (iV >= cArrT.length) {
                cArrT = this.W3.q();
            }
            int i13 = iV + 1;
            cArrT[iV] = (char) i10;
            int i14 = this.M3;
            if (i14 >= this.N3) {
                this.W3.I(i13);
                this.f102259k4 = i12;
                return n.NOT_AVAILABLE;
            }
            byte[] bArr2 = this.f102498z5;
            this.M3 = i14 + 1;
            i10 = bArr2[i14];
            iV = i13;
        }
        int i15 = i10 & 255;
        if (i12 == 0) {
            n4(i15, "Exponent indicator not followed by a digit");
        }
        this.M3--;
        this.W3.I(iV);
        this.f102259k4 = i12;
        return i6(n.VALUE_NUMBER_FLOAT);
    }

    protected n W6() throws IOException {
        byte b10;
        int i10 = this.f102258j4;
        char[] cArrT = this.W3.t();
        int iV = this.W3.v();
        while (true) {
            byte[] bArr = this.f102498z5;
            int i11 = this.M3;
            this.M3 = i11 + 1;
            b10 = bArr[i11];
            if (b10 < 48 || b10 > 57) {
                break;
            }
            i10++;
            if (iV >= cArrT.length) {
                cArrT = this.W3.q();
            }
            int i12 = iV + 1;
            cArrT[iV] = (char) b10;
            if (this.M3 >= this.N3) {
                this.W3.I(i12);
                this.f102258j4 = i10;
                return n.NOT_AVAILABLE;
            }
            iV = i12;
        }
        if (i10 == 0) {
            n4(b10, "Decimal point not followed by a digit");
        }
        this.f102258j4 = i10;
        this.W3.I(iV);
        if (b10 != 101 && b10 != 69) {
            this.M3--;
            this.W3.I(iV);
            this.f102259k4 = 0;
            return i6(n.VALUE_NUMBER_FLOAT);
        }
        this.W3.a((char) b10);
        this.f102259k4 = 0;
        int i13 = this.M3;
        if (i13 >= this.N3) {
            this.f102534v4 = 31;
            return n.NOT_AVAILABLE;
        }
        this.f102534v4 = 32;
        byte[] bArr2 = this.f102498z5;
        this.M3 = i13 + 1;
        return V6(true, bArr2[i13] & 255);
    }

    @Override // com.fasterxml.jackson.core.json.async.b, com.fasterxml.jackson.core.JsonParser
    public int Y2(OutputStream outputStream) throws IOException {
        int i10 = this.N3;
        int i11 = this.M3;
        int i12 = i10 - i11;
        if (i12 > 0) {
            outputStream.write(this.f102498z5, i11, i12);
        }
        return i12;
    }

    protected n Y6(String str, int i10, n nVar) throws IOException {
        int length = str.length();
        while (true) {
            int i11 = this.M3;
            if (i11 >= this.N3) {
                this.f102528p4 = i10;
                n nVar2 = n.NOT_AVAILABLE;
                this.f102294g = nVar2;
                return nVar2;
            }
            byte b10 = this.f102498z5[i11];
            if (i10 == length) {
                if (b10 >= 48 && b10 != 93 && b10 != 125) {
                    break;
                }
                return i6(nVar);
            }
            if (b10 != str.charAt(i10)) {
                break;
            }
            i10++;
            this.M3++;
        }
        this.f102534v4 = 50;
        this.W3.B(str, 0, i10);
        return R6();
    }

    protected n Z6(String str, int i10, n nVar) throws IOException {
        if (i10 == str.length()) {
            this.f102294g = nVar;
            return nVar;
        }
        this.W3.B(str, 0, i10);
        return S6();
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0111 -> B:40:0x00af). Please report as a decompilation issue!!! */
    protected n Z7(char[] cArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        int i14;
        byte b10;
        int i15 = 0;
        if (i11 == 46) {
            if (i10 >= cArr.length) {
                cArr = this.W3.q();
            }
            cArr[i10] = '.';
            i10++;
            i13 = 0;
            while (true) {
                int i16 = this.M3;
                if (i16 >= this.N3) {
                    this.W3.I(i10);
                    this.f102534v4 = 30;
                    this.f102258j4 = i13;
                    n nVar = n.NOT_AVAILABLE;
                    this.f102294g = nVar;
                    return nVar;
                }
                byte[] bArr = this.f102498z5;
                this.M3 = i16 + 1;
                b10 = bArr[i16];
                if (b10 < 48 || b10 > 57) {
                    break;
                }
                if (i10 >= cArr.length) {
                    cArr = this.W3.q();
                }
                cArr[i10] = (char) b10;
                i13++;
                i10++;
            }
            i12 = b10 & 255;
            if (i13 == 0) {
                n4(i12, "Decimal point not followed by a digit");
            }
        } else {
            i12 = i11;
            i13 = 0;
        }
        this.f102258j4 = i13;
        if (i12 == 101 || i12 == 69) {
            if (i10 >= cArr.length) {
                cArr = this.W3.q();
            }
            int i17 = i10 + 1;
            cArr[i10] = (char) i12;
            int i18 = this.M3;
            if (i18 >= this.N3) {
                this.W3.I(i17);
                this.f102534v4 = 31;
                this.f102259k4 = 0;
                n nVar2 = n.NOT_AVAILABLE;
                this.f102294g = nVar2;
                return nVar2;
            }
            byte[] bArr2 = this.f102498z5;
            this.M3 = i18 + 1;
            byte b11 = bArr2[i18];
            if (b11 == 45 || b11 == 43) {
                if (i17 >= cArr.length) {
                    cArr = this.W3.q();
                }
                i10 += 2;
                cArr[i17] = (char) b11;
                int i19 = this.M3;
                if (i19 >= this.N3) {
                    this.W3.I(i10);
                    this.f102534v4 = 32;
                    this.f102259k4 = 0;
                    n nVar3 = n.NOT_AVAILABLE;
                    this.f102294g = nVar3;
                    return nVar3;
                }
                byte[] bArr3 = this.f102498z5;
                this.M3 = i19 + 1;
                b11 = bArr3[i19];
            } else {
                i10 = i17;
            }
            if (b11 >= 48 || b11 > 57) {
                i14 = b11 & 255;
                if (i15 == 0) {
                    n4(i14, "Exponent indicator not followed by a digit");
                }
            } else {
                i15++;
                if (i10 >= cArr.length) {
                    cArr = this.W3.q();
                }
                i17 = i10 + 1;
                cArr[i10] = (char) b11;
                int i20 = this.M3;
                if (i20 >= this.N3) {
                    this.W3.I(i17);
                    this.f102534v4 = 32;
                    this.f102259k4 = i15;
                    n nVar4 = n.NOT_AVAILABLE;
                    this.f102294g = nVar4;
                    return nVar4;
                }
                byte[] bArr4 = this.f102498z5;
                this.M3 = i20 + 1;
                b11 = bArr4[i20];
                i10 = i17;
                if (b11 >= 48) {
                }
                i14 = b11 & 255;
                if (i15 == 0) {
                    n4(i14, "Exponent indicator not followed by a digit");
                }
            }
        }
        this.M3--;
        this.W3.I(i10);
        this.f102259k4 = i15;
        return i6(n.VALUE_NUMBER_FLOAT);
    }

    @Override // w5.c
    public final boolean a() {
        return this.M3 >= this.N3 && !this.f102536x4;
    }

    @Override // w5.a
    public void c(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.M3;
        int i13 = this.N3;
        if (i12 < i13) {
            G3("Still have %d undecoded bytes, should not call 'feedInput'", Integer.valueOf(i13 - i12));
        }
        if (i11 < i10) {
            H3("Input end (%d) may not be before start (%d)", Integer.valueOf(i11), Integer.valueOf(i10));
        }
        if (this.f102536x4) {
            F3("Already closed, can not feed more input");
        }
        this.O3 += (long) this.A5;
        this.Q3 = i10 - (this.N3 - this.Q3);
        this.f102498z5 = bArr;
        this.M3 = i10;
        this.N3 = i11;
        this.A5 = i11 - i10;
    }

    protected n c7(int i10, int i11) throws IOException {
        String strS5 = S5(i10);
        int length = strS5.length();
        while (true) {
            int i12 = this.M3;
            if (i12 >= this.N3) {
                this.f102537y4 = i10;
                this.f102528p4 = i11;
                this.f102534v4 = 19;
                n nVar = n.NOT_AVAILABLE;
                this.f102294g = nVar;
                return nVar;
            }
            byte b10 = this.f102498z5[i12];
            if (i11 == length) {
                if (b10 >= 48 && b10 != 93 && b10 != 125) {
                    break;
                }
                return q6(i10);
            }
            if (b10 != strS5.charAt(i11)) {
                break;
            }
            i11++;
            this.M3++;
        }
        this.f102534v4 = 50;
        this.W3.B(strS5, 0, i11);
        return R6();
    }

    @Override // w5.c
    public void d() {
        this.f102536x4 = true;
    }

    protected n d7(int i10, int i11) throws IOException {
        String strS5 = S5(i10);
        if (i11 == strS5.length()) {
            return q6(i10);
        }
        this.W3.B(strS5, 0, i11);
        return S6();
    }

    protected n d8() throws IOException {
        this.f102256h4 = true;
        int i10 = this.M3;
        if (i10 >= this.N3) {
            this.f102534v4 = 23;
            n nVar = n.NOT_AVAILABLE;
            this.f102294g = nVar;
            return nVar;
        }
        byte[] bArr = this.f102498z5;
        this.M3 = i10 + 1;
        int i11 = bArr[i10] & 255;
        int i12 = 2;
        if (i11 <= 48) {
            if (i11 == 48) {
                return l7();
            }
            n4(i11, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i11 > 57) {
            if (i11 == 73) {
                return c7(3, 2);
            }
            n4(i11, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] cArrN = this.W3.n();
        cArrN[0] = l.f335457d;
        cArrN[1] = (char) i11;
        int i13 = this.M3;
        if (i13 >= this.N3) {
            this.f102534v4 = 26;
            this.W3.I(2);
            this.f102257i4 = 1;
            n nVar2 = n.NOT_AVAILABLE;
            this.f102294g = nVar2;
            return nVar2;
        }
        int i14 = this.f102498z5[i13];
        while (i14 >= 48) {
            if (i14 > 57) {
                if (i14 == 101 || i14 == 69) {
                    this.f102257i4 = i12 - 1;
                    this.M3++;
                    return Z7(cArrN, i12, i14);
                }
                this.f102257i4 = i12 - 1;
                this.W3.I(i12);
                return i6(n.VALUE_NUMBER_INT);
            }
            if (i12 >= cArrN.length) {
                cArrN = this.W3.q();
            }
            int i15 = i12 + 1;
            cArrN[i12] = (char) i14;
            int i16 = this.M3 + 1;
            this.M3 = i16;
            if (i16 >= this.N3) {
                this.f102534v4 = 26;
                this.W3.I(i15);
                n nVar3 = n.NOT_AVAILABLE;
                this.f102294g = nVar3;
                return nVar3;
            }
            i14 = this.f102498z5[i16] & 255;
            i12 = i15;
        }
        if (i14 == 46) {
            this.f102257i4 = i12 - 1;
            this.M3++;
            return Z7(cArrN, i12, i14);
        }
        this.f102257i4 = i12 - 1;
        this.W3.I(i12);
        return i6(n.VALUE_NUMBER_INT);
    }

    protected n e8() throws IOException {
        int i10;
        int i11 = this.M3;
        if (i11 + 3 < this.N3) {
            byte[] bArr = this.f102498z5;
            int i12 = i11 + 1;
            if (bArr[i11] == 117) {
                int i13 = i11 + 2;
                if (bArr[i12] == 108) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 108 && ((i10 = bArr[i14] & 255) < 48 || i10 == 93 || i10 == 125)) {
                        this.M3 = i14;
                        return i6(n.VALUE_NULL);
                    }
                }
            }
        }
        this.f102534v4 = 16;
        int i15 = 7 << 1;
        return Y6(AbstractJsonLexerKt.NULL, 1, n.VALUE_NULL);
    }

    protected n f8() throws IOException {
        int i10 = this.M3;
        if (i10 >= this.N3) {
            this.f102534v4 = 24;
            n nVar = n.NOT_AVAILABLE;
            this.f102294g = nVar;
            return nVar;
        }
        int i11 = i10 + 1;
        int i12 = this.f102498z5[i10] & 255;
        if (i12 < 48) {
            if (i12 == 46) {
                this.M3 = i11;
                this.f102257i4 = 1;
                char[] cArrN = this.W3.n();
                cArrN[0] = org.locationtech.jts.geom.l.f338160j;
                return Z7(cArrN, 1, i12);
            }
        } else {
            if (i12 <= 57) {
                return m7();
            }
            if (i12 == 101 || i12 == 69) {
                this.M3 = i11;
                this.f102257i4 = 1;
                char[] cArrN2 = this.W3.n();
                cArrN2[0] = org.locationtech.jts.geom.l.f338160j;
                return Z7(cArrN2, 1, i12);
            }
            if (i12 != 93 && i12 != 125) {
                n4(i12, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
        }
        return o6(0, com.facebook.appevents.p.f99189d0);
    }

    protected n i7(char[] cArr, int i10) throws IOException {
        int i11 = this.f102256h4 ? -1 : 0;
        while (true) {
            int i12 = this.M3;
            if (i12 >= this.N3) {
                this.f102534v4 = 26;
                this.W3.I(i10);
                n nVar = n.NOT_AVAILABLE;
                this.f102294g = nVar;
                return nVar;
            }
            int i13 = this.f102498z5[i12] & 255;
            if (i13 < 48) {
                if (i13 != 46) {
                    break;
                }
                this.f102257i4 = i11 + i10;
                this.M3 = i12 + 1;
                return Z7(cArr, i10, i13);
            }
            if (i13 > 57) {
                if (i13 != 101 && i13 != 69) {
                    break;
                }
                this.f102257i4 = i11 + i10;
                this.M3 = i12 + 1;
                return Z7(cArr, i10, i13);
            }
            this.M3 = i12 + 1;
            if (i10 >= cArr.length) {
                cArr = this.W3.q();
            }
            cArr[i10] = (char) i13;
            i10++;
        }
        this.f102257i4 = i11 + i10;
        this.W3.I(i10);
        return i6(n.VALUE_NUMBER_INT);
    }

    protected n i8(int i10) throws IOException {
        this.f102256h4 = false;
        char[] cArrN = this.W3.n();
        cArrN[0] = (char) i10;
        int i11 = this.M3;
        if (i11 >= this.N3) {
            this.f102534v4 = 26;
            this.W3.I(1);
            n nVar = n.NOT_AVAILABLE;
            this.f102294g = nVar;
            return nVar;
        }
        int i12 = this.f102498z5[i11] & 255;
        int i13 = 1;
        while (i12 >= 48) {
            if (i12 > 57) {
                if (i12 == 101 || i12 == 69) {
                    this.f102257i4 = i13;
                    this.M3++;
                    return Z7(cArrN, i13, i12);
                }
                this.f102257i4 = i13;
                this.W3.I(i13);
                return i6(n.VALUE_NUMBER_INT);
            }
            if (i13 >= cArrN.length) {
                cArrN = this.W3.q();
            }
            int i14 = i13 + 1;
            cArrN[i13] = (char) i12;
            int i15 = this.M3 + 1;
            this.M3 = i15;
            if (i15 >= this.N3) {
                this.f102534v4 = 26;
                this.W3.I(i14);
                n nVar2 = n.NOT_AVAILABLE;
                this.f102294g = nVar2;
                return nVar2;
            }
            i12 = this.f102498z5[i15] & 255;
            i13 = i14;
        }
        if (i12 == 46) {
            this.f102257i4 = i13;
            this.M3++;
            return Z7(cArrN, i13, i12);
        }
        this.f102257i4 = i13;
        this.W3.I(i13);
        return i6(n.VALUE_NUMBER_INT);
    }

    protected n k8() throws IOException {
        int i10 = this.M3;
        char[] cArrN = this.W3.n();
        int[] iArr = B5;
        int iMin = Math.min(this.N3, cArrN.length + i10);
        byte[] bArr = this.f102498z5;
        int i11 = 0;
        while (i10 < iMin) {
            int i12 = bArr[i10] & 255;
            if (iArr[i12] != 0) {
                if (i12 != 34) {
                    break;
                }
                this.M3 = i10 + 1;
                this.W3.I(i11);
                return i6(n.VALUE_STRING);
            }
            i10++;
            cArrN[i11] = (char) i12;
            i11++;
        }
        this.W3.I(i11);
        this.M3 = i10;
        return s7();
    }

    protected n l7() throws IOException {
        int i10;
        do {
            int i11 = this.M3;
            if (i11 >= this.N3) {
                this.f102534v4 = 25;
                n nVar = n.NOT_AVAILABLE;
                this.f102294g = nVar;
                return nVar;
            }
            byte[] bArr = this.f102498z5;
            this.M3 = i11 + 1;
            i10 = bArr[i11] & 255;
            if (i10 < 48) {
                if (i10 == 46) {
                    char[] cArrN = this.W3.n();
                    cArrN[0] = l.f335457d;
                    cArrN[1] = org.locationtech.jts.geom.l.f338160j;
                    this.f102257i4 = 1;
                    return Z7(cArrN, 2, i10);
                }
            } else {
                if (i10 > 57) {
                    if (i10 != 101 && i10 != 69) {
                        if (i10 != 93 && i10 != 125) {
                            n4(i10, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                        }
                    }
                    char[] cArrN2 = this.W3.n();
                    cArrN2[0] = l.f335457d;
                    cArrN2[1] = org.locationtech.jts.geom.l.f338160j;
                    this.f102257i4 = 1;
                    return Z7(cArrN2, 2, i10);
                }
                if (!p2(JsonParser.a.ALLOW_NUMERIC_LEADING_ZEROS)) {
                    h4("Leading zeroes not allowed");
                }
            }
            this.M3--;
            return o6(0, com.facebook.appevents.p.f99189d0);
        } while (i10 == 48);
        char[] cArrN3 = this.W3.n();
        cArrN3[0] = l.f335457d;
        cArrN3[1] = (char) i10;
        this.f102257i4 = 1;
        return i7(cArrN3, 2);
    }

    protected n m7() throws IOException {
        int i10;
        do {
            int i11 = this.M3;
            if (i11 >= this.N3) {
                this.f102534v4 = 24;
                n nVar = n.NOT_AVAILABLE;
                this.f102294g = nVar;
                return nVar;
            }
            byte[] bArr = this.f102498z5;
            this.M3 = i11 + 1;
            i10 = bArr[i11] & 255;
            if (i10 < 48) {
                if (i10 == 46) {
                    char[] cArrN = this.W3.n();
                    cArrN[0] = org.locationtech.jts.geom.l.f338160j;
                    this.f102257i4 = 1;
                    return Z7(cArrN, 1, i10);
                }
            } else if (i10 > 57) {
                if (i10 == 101 || i10 == 69) {
                    char[] cArrN2 = this.W3.n();
                    cArrN2[0] = org.locationtech.jts.geom.l.f338160j;
                    this.f102257i4 = 1;
                    return Z7(cArrN2, 1, i10);
                }
                if (i10 != 93 && i10 != 125) {
                    n4(i10, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if (!p2(JsonParser.a.ALLOW_NUMERIC_LEADING_ZEROS)) {
                h4("Leading zeroes not allowed");
            }
            this.M3--;
            return o6(0, com.facebook.appevents.p.f99189d0);
        } while (i10 == 48);
        char[] cArrN3 = this.W3.n();
        cArrN3[0] = (char) i10;
        this.f102257i4 = 1;
        return i7(cArrN3, 1);
    }

    protected n m8() throws IOException {
        int i10;
        int i11 = this.M3;
        if (i11 + 3 < this.N3) {
            byte[] bArr = this.f102498z5;
            int i12 = i11 + 1;
            if (bArr[i11] == 114) {
                int i13 = i11 + 2;
                if (bArr[i12] == 117) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 101 && ((i10 = bArr[i14] & 255) < 48 || i10 == 93 || i10 == 125)) {
                        this.M3 = i14;
                        return i6(n.VALUE_TRUE);
                    }
                }
            }
        }
        this.f102534v4 = 17;
        return Y6(z0.P, 1, n.VALUE_TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    protected n n8(boolean z10, int i10) throws IOException {
        if (i10 != 39) {
            if (i10 == 73) {
                return c7(1, 1);
            }
            if (i10 == 78) {
                return c7(0, 1);
            }
            if (i10 != 93) {
                if (i10 != 125) {
                    if (i10 == 43) {
                        return c7(2, 1);
                    }
                    if (i10 == 44) {
                        if (p2(JsonParser.a.ALLOW_MISSING_VALUES)) {
                            this.M3--;
                            return i6(n.VALUE_NULL);
                        }
                    }
                }
            } else if (this.U3.k()) {
                if (p2(JsonParser.a.ALLOW_MISSING_VALUES)) {
                    this.M3--;
                    return i6(n.VALUE_NULL);
                }
            }
        } else if (p2(JsonParser.a.ALLOW_SINGLE_QUOTES)) {
            return M7();
        }
        V3(i10, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }

    protected n o7(int i10) throws IOException {
        if (i10 <= 48) {
            if (i10 == 48) {
                return l7();
            }
            n4(i10, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i10 > 57) {
            if (i10 == 73) {
                return c7(3, 2);
            }
            n4(i10, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] cArrN = this.W3.n();
        cArrN[0] = l.f335457d;
        cArrN[1] = (char) i10;
        this.f102257i4 = 1;
        return i7(cArrN, 2);
    }

    protected final n t7() throws IOException {
        int i10 = this.f102534v4;
        if (i10 == 1) {
            return M6(this.f102528p4);
        }
        if (i10 == 4) {
            byte[] bArr = this.f102498z5;
            int i11 = this.M3;
            this.M3 = i11 + 1;
            return W7(bArr[i11] & 255);
        }
        if (i10 == 5) {
            byte[] bArr2 = this.f102498z5;
            int i12 = this.M3;
            this.M3 = i12 + 1;
            return Y7(bArr2[i12] & 255);
        }
        switch (i10) {
            case 7:
                return y7(this.f102526n4, this.f102528p4, this.f102529q4);
            case 8:
                return T6();
            case 9:
                return I6(this.f102526n4, this.f102528p4, this.f102529q4);
            case 10:
                return w7(this.f102526n4, this.f102528p4, this.f102529q4);
            default:
                switch (i10) {
                    case 12:
                        byte[] bArr3 = this.f102498z5;
                        int i13 = this.M3;
                        this.M3 = i13 + 1;
                        return q8(bArr3[i13] & 255);
                    case 13:
                        byte[] bArr4 = this.f102498z5;
                        int i14 = this.M3;
                        this.M3 = i14 + 1;
                        return v8(bArr4[i14] & 255);
                    case 14:
                        byte[] bArr5 = this.f102498z5;
                        int i15 = this.M3;
                        this.M3 = i15 + 1;
                        return s8(bArr5[i15] & 255);
                    case 15:
                        byte[] bArr6 = this.f102498z5;
                        int i16 = this.M3;
                        this.M3 = i16 + 1;
                        return r8(bArr6[i16] & 255);
                    case 16:
                        return Y6(AbstractJsonLexerKt.NULL, this.f102528p4, n.VALUE_NULL);
                    case 17:
                        return Y6(z0.P, this.f102528p4, n.VALUE_TRUE);
                    case 18:
                        return Y6("false", this.f102528p4, n.VALUE_FALSE);
                    case 19:
                        return c7(this.f102537y4, this.f102528p4);
                    default:
                        switch (i10) {
                            case 23:
                                byte[] bArr7 = this.f102498z5;
                                int i17 = this.M3;
                                this.M3 = i17 + 1;
                                return o7(bArr7[i17] & 255);
                            case 24:
                                return m7();
                            case 25:
                                return l7();
                            case 26:
                                return i7(this.W3.t(), this.W3.v());
                            default:
                                switch (i10) {
                                    case 30:
                                        return W6();
                                    case 31:
                                        byte[] bArr8 = this.f102498z5;
                                        int i18 = this.M3;
                                        this.M3 = i18 + 1;
                                        return V6(true, bArr8[i18] & 255);
                                    case 32:
                                        byte[] bArr9 = this.f102498z5;
                                        int i19 = this.M3;
                                        this.M3 = i19 + 1;
                                        return V6(false, bArr9[i19] & 255);
                                    default:
                                        switch (i10) {
                                            case 40:
                                                return s7();
                                            case 41:
                                                int iW6 = w6(this.f102530r4, this.f102531s4);
                                                if (iW6 < 0) {
                                                    return n.NOT_AVAILABLE;
                                                }
                                                this.W3.a((char) iW6);
                                                return this.f102535w4 == 45 ? L6() : s7();
                                            case 42:
                                                com.fasterxml.jackson.core.util.n nVar = this.W3;
                                                int i20 = this.f102528p4;
                                                byte[] bArr10 = this.f102498z5;
                                                int i21 = this.M3;
                                                this.M3 = i21 + 1;
                                                nVar.a((char) D6(i20, bArr10[i21]));
                                                return this.f102535w4 == 45 ? L6() : s7();
                                            case 43:
                                                int i22 = this.f102528p4;
                                                int i23 = this.f102529q4;
                                                byte[] bArr11 = this.f102498z5;
                                                int i24 = this.M3;
                                                this.M3 = i24 + 1;
                                                if (y6(i22, i23, bArr11[i24])) {
                                                    return this.f102535w4 == 45 ? L6() : s7();
                                                }
                                                return n.NOT_AVAILABLE;
                                            case 44:
                                                int i25 = this.f102528p4;
                                                int i26 = this.f102529q4;
                                                byte[] bArr12 = this.f102498z5;
                                                int i27 = this.M3;
                                                this.M3 = i27 + 1;
                                                if (A6(i25, i26, bArr12[i27])) {
                                                    return this.f102535w4 == 45 ? L6() : s7();
                                                }
                                                return n.NOT_AVAILABLE;
                                            case 45:
                                                return L6();
                                            default:
                                                switch (i10) {
                                                    case 50:
                                                        return R6();
                                                    case 51:
                                                        return j8(this.f102528p4);
                                                    case 52:
                                                        return N6(this.f102528p4, true);
                                                    case 53:
                                                        return N6(this.f102528p4, false);
                                                    case 54:
                                                        return P6(this.f102528p4);
                                                    case 55:
                                                        return X6(this.f102528p4);
                                                    default:
                                                        p.f();
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected final n v7() throws IOException {
        n nVar = this.f102294g;
        int i10 = this.f102534v4;
        if (i10 != 3 && i10 != 12) {
            if (i10 == 50) {
                return S6();
            }
            switch (i10) {
                case 16:
                    return Z6(AbstractJsonLexerKt.NULL, this.f102528p4, n.VALUE_NULL);
                case 17:
                    return Z6(z0.P, this.f102528p4, n.VALUE_TRUE);
                case 18:
                    return Z6("false", this.f102528p4, n.VALUE_FALSE);
                case 19:
                    return d7(this.f102537y4, this.f102528p4);
                default:
                    switch (i10) {
                        case 24:
                        case 25:
                            return o6(0, com.facebook.appevents.p.f99189d0);
                        case 26:
                            int iV = this.W3.v();
                            if (this.f102256h4) {
                                iV--;
                            }
                            this.f102257i4 = iV;
                            return i6(n.VALUE_NUMBER_INT);
                        default:
                            switch (i10) {
                                case 30:
                                    this.f102259k4 = 0;
                                    return i6(n.VALUE_NUMBER_FLOAT);
                                case 31:
                                    N3(": was expecting fraction after exponent marker", n.VALUE_NUMBER_FLOAT);
                                    N3(": was expecting closing '*/' for comment", n.NOT_AVAILABLE);
                                    return F5();
                                case 32:
                                    return i6(n.VALUE_NUMBER_FLOAT);
                                default:
                                    switch (i10) {
                                        case 52:
                                        case 53:
                                            N3(": was expecting closing '*/' for comment", n.NOT_AVAILABLE);
                                            break;
                                        case 54:
                                        case 55:
                                            break;
                                        default:
                                            N3(": was expecting rest of token (internal state: " + this.f102534v4 + ")", this.f102294g);
                                            return nVar;
                                    }
                                    return F5();
                            }
                    }
            }
        }
        return F5();
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected char w4() throws IOException {
        p.f();
        return ' ';
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: w8, reason: merged with bridge method [inline-methods] */
    public w5.a R0() {
        return this;
    }
}
