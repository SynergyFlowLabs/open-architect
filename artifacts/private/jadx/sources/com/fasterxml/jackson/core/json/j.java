package com.fasterxml.jackson.core.json;

import com.facebook.internal.z0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.l;

/* JADX INFO: loaded from: classes4.dex */
public class j extends com.fasterxml.jackson.core.base.b {

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    static final byte f102609w4 = 10;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private static final int[] f102610x4 = com.fasterxml.jackson.core.io.a.i();

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    protected static final int[] f102611y4 = com.fasterxml.jackson.core.io.a.g();

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    protected static final int f102612z4 = JsonParser.a.ALLOW_TRAILING_COMMA.o();

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    protected q f102613l4;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    protected final com.fasterxml.jackson.core.sym.a f102614m4;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    protected int[] f102615n4;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    protected boolean f102616o4;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private int f102617p4;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    protected int f102618q4;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    protected int f102619r4;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    protected int f102620s4;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    protected InputStream f102621t4;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    protected byte[] f102622u4;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    protected boolean f102623v4;

    public j(com.fasterxml.jackson.core.io.d dVar, int i10, InputStream inputStream, q qVar, com.fasterxml.jackson.core.sym.a aVar, byte[] bArr, int i11, int i12, boolean z10) {
        super(dVar, i10);
        this.f102615n4 = new int[16];
        this.f102621t4 = inputStream;
        this.f102613l4 = qVar;
        this.f102614m4 = aVar;
        this.f102622u4 = bArr;
        this.M3 = i11;
        this.N3 = i12;
        this.Q3 = i11;
        this.O3 = -i11;
        this.f102623v4 = z10;
    }

    private final void A5() throws com.fasterxml.jackson.core.j {
        H7();
        if (!this.U3.l()) {
            R4(125, AbstractJsonLexerKt.END_LIST);
        }
        this.U3 = this.U3.s();
    }

    private final n A6(int i10) throws IOException {
        if (i10 == 34) {
            this.f102616o4 = true;
            n nVar = n.VALUE_STRING;
            this.f102294g = nVar;
            return nVar;
        }
        if (i10 == 45) {
            n nVarI6 = I6();
            this.f102294g = nVarI6;
            return nVarI6;
        }
        if (i10 == 91) {
            this.U3 = this.U3.t(this.S3, this.T3);
            n nVar2 = n.START_ARRAY;
            this.f102294g = nVar2;
            return nVar2;
        }
        if (i10 == 102) {
            r6();
            n nVar3 = n.VALUE_FALSE;
            this.f102294g = nVar3;
            return nVar3;
        }
        if (i10 == 110) {
            s6();
            n nVar4 = n.VALUE_NULL;
            this.f102294g = nVar4;
            return nVar4;
        }
        if (i10 == 116) {
            x6();
            n nVar5 = n.VALUE_TRUE;
            this.f102294g = nVar5;
            return nVar5;
        }
        if (i10 == 123) {
            this.U3 = this.U3.u(this.S3, this.T3);
            n nVar6 = n.START_OBJECT;
            this.f102294g = nVar6;
            return nVar6;
        }
        switch (i10) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
            case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                n nVarM6 = M6(i10);
                this.f102294g = nVarM6;
                return nVarM6;
            default:
                n nVarE6 = e6(i10);
                this.f102294g = nVarE6;
                return nVarE6;
        }
    }

    private final boolean B7() throws IOException {
        if (!p2(JsonParser.a.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        m7();
        return true;
    }

    private static final int D6(int i10, int i11) {
        return i11 == 4 ? i10 : i10 | ((-1) << (i11 << 3));
    }

    private final n F5(int i10) throws com.fasterxml.jackson.core.j {
        if (i10 == 125) {
            A5();
            n nVar = n.END_OBJECT;
            this.f102294g = nVar;
            return nVar;
        }
        z5();
        n nVar2 = n.END_ARRAY;
        this.f102294g = nVar2;
        return nVar2;
    }

    private final n F6(char[] cArr, int i10, int i11, boolean z10, int i12) throws IOException {
        int i13;
        boolean z11;
        int i14 = 0;
        if (i11 == 46) {
            if (i10 >= cArr.length) {
                cArr = this.W3.s();
                i10 = 0;
            }
            cArr[i10] = (char) i11;
            i10++;
            i13 = 0;
            while (true) {
                if (this.M3 >= this.N3 && !o6()) {
                    z11 = true;
                    break;
                }
                byte[] bArr = this.f102622u4;
                int i15 = this.M3;
                this.M3 = i15 + 1;
                i11 = bArr[i15] & 255;
                if (i11 >= 48 && i11 <= 57) {
                    i13++;
                    if (i10 >= cArr.length) {
                        cArr = this.W3.s();
                        i10 = 0;
                    }
                    cArr[i10] = (char) i11;
                    i10++;
                }
                z11 = false;
                break;
            }
            if (i13 == 0) {
                n4(i11, "Decimal point not followed by a digit");
            }
        } else {
            i13 = 0;
            z11 = false;
        }
        if (i11 == 101 || i11 == 69) {
            if (i10 >= cArr.length) {
                cArr = this.W3.s();
                i10 = 0;
            }
            int i16 = i10 + 1;
            cArr[i10] = (char) i11;
            if (this.M3 >= this.N3) {
                q6();
            }
            byte[] bArr2 = this.f102622u4;
            int i17 = this.M3;
            this.M3 = i17 + 1;
            int i18 = bArr2[i17] & 255;
            if (i18 == 45 || i18 == 43) {
                if (i16 >= cArr.length) {
                    cArr = this.W3.s();
                    i16 = 0;
                }
                int i19 = i16 + 1;
                cArr[i16] = (char) i18;
                if (this.M3 >= this.N3) {
                    q6();
                }
                byte[] bArr3 = this.f102622u4;
                int i20 = this.M3;
                this.M3 = i20 + 1;
                i18 = bArr3[i20] & 255;
                i16 = i19;
            }
            i11 = i18;
            int i21 = 0;
            while (true) {
                if (i11 >= 48 && i11 <= 57) {
                    i21++;
                    if (i16 >= cArr.length) {
                        cArr = this.W3.s();
                        i16 = 0;
                    }
                    int i22 = i16 + 1;
                    cArr[i16] = (char) i11;
                    if (this.M3 >= this.N3 && !o6()) {
                        i14 = i21;
                        z11 = true;
                        i10 = i22;
                        break;
                    }
                    byte[] bArr4 = this.f102622u4;
                    int i23 = this.M3;
                    this.M3 = i23 + 1;
                    i11 = bArr4[i23] & 255;
                    i16 = i22;
                } else {
                    i14 = i21;
                    i10 = i16;
                    break;
                }
            }
            if (i14 == 0) {
                n4(i11, "Exponent indicator not followed by a digit");
            }
        }
        if (!z11) {
            this.M3--;
            if (this.U3.m()) {
                M7(i11);
            }
        }
        this.W3.I(i10);
        return v5(z10, i12, i13, i14);
    }

    private final void H7() {
        this.S3 = this.P3;
        int i10 = this.M3;
        this.R3 = this.O3 + ((long) i10);
        this.T3 = i10 - this.Q3;
    }

    private final void I7() {
        this.f102619r4 = this.P3;
        int i10 = this.M3;
        this.f102618q4 = i10;
        this.f102620s4 = i10 - this.Q3;
    }

    private final int K7() throws IOException {
        if (this.M3 >= this.N3 && !o6()) {
            return 48;
        }
        int i10 = this.f102622u4[this.M3] & 255;
        if (i10 < 48 || i10 > 57) {
            return 48;
        }
        if (!p2(JsonParser.a.ALLOW_NUMERIC_LEADING_ZEROS)) {
            h4("Leading zeroes not allowed");
        }
        this.M3++;
        if (i10 != 48) {
            return i10;
        }
        do {
            if (this.M3 >= this.N3 && !o6()) {
                return i10;
            }
            byte[] bArr = this.f102622u4;
            int i11 = this.M3;
            i10 = bArr[i11] & 255;
            if (i10 < 48 || i10 > 57) {
                return 48;
            }
            this.M3 = i11 + 1;
        } while (i10 == 48);
        return i10;
    }

    private final n L6(char[] cArr, int i10, boolean z10, int i11) throws IOException {
        char[] cArrS = cArr;
        int i12 = i10;
        int i13 = i11;
        while (true) {
            if (this.M3 >= this.N3 && !o6()) {
                this.W3.I(i12);
                return x5(z10, i13);
            }
            byte[] bArr = this.f102622u4;
            int i14 = this.M3;
            this.M3 = i14 + 1;
            int i15 = bArr[i14] & 255;
            if (i15 > 57 || i15 < 48) {
                if (i15 == 46 || i15 == 101 || i15 == 69) {
                    return F6(cArrS, i12, i15, z10, i13);
                }
                this.M3 = i14;
                this.W3.I(i12);
                if (this.U3.m()) {
                    byte[] bArr2 = this.f102622u4;
                    int i16 = this.M3;
                    this.M3 = i16 + 1;
                    M7(bArr2[i16] & 255);
                }
                return x5(z10, i13);
            }
            if (i12 >= cArrS.length) {
                i12 = 0;
                cArrS = this.W3.s();
            }
            cArrS[i12] = (char) i15;
            i13++;
            i12++;
        }
    }

    private final void M7(int i10) throws IOException {
        int i11 = this.M3 + 1;
        this.M3 = i11;
        if (i10 != 9) {
            if (i10 == 10) {
                this.P3++;
                this.Q3 = i11;
            } else if (i10 == 13) {
                Z6();
            } else if (i10 != 32) {
                T3(i10);
            }
        }
    }

    private final int N5(int i10) throws IOException {
        if (this.M3 >= this.N3) {
            q6();
        }
        byte[] bArr = this.f102622u4;
        int i11 = this.M3;
        int i12 = i11 + 1;
        this.M3 = i12;
        byte b10 = bArr[i11];
        if ((b10 & org.msgpack.core.h.a.f339269e) != 128) {
            T6(b10 & 255, i12);
        }
        return ((i10 & 31) << 6) | (b10 & 63);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    private final String N7(int[] iArr, int i10, int i11) throws com.fasterxml.jackson.core.j {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = ((i10 << 2) - 4) + i11;
        int i18 = 3;
        if (i11 < 4) {
            int i19 = i10 - 1;
            i12 = iArr[i19];
            iArr[i19] = i12 << ((4 - i11) << 3);
        } else {
            i12 = 0;
        }
        char[] cArrN = this.W3.n();
        int i20 = 0;
        int i21 = 0;
        while (i20 < i17) {
            int i22 = iArr[i20 >> 2] >> ((3 - (i20 & 3)) << i18);
            int i23 = i22 & 255;
            int i24 = i20 + 1;
            if (i23 > 127) {
                i13 = i18;
                if ((i22 & 224) == 192) {
                    i14 = i22 & 31;
                    i15 = 1;
                } else if ((i22 & 240) == 224) {
                    i14 = i22 & 15;
                    i15 = 2;
                } else if ((i22 & com.planner5d.library.engine.input.f.b.R1) == 240) {
                    i14 = i22 & 7;
                    i15 = i13;
                } else {
                    R6(i23);
                    i14 = 1;
                    i15 = 1;
                }
                if (i24 + i15 > i17) {
                    N3(" in field name", n.FIELD_NAME);
                }
                int i25 = iArr[i24 >> 2] >> ((3 - (i24 & 3)) << 3);
                i24 = i20 + 2;
                if ((i25 & 192) != 128) {
                    S6(i25);
                }
                int i26 = (i14 << 6) | (i25 & 63);
                if (i15 > 1) {
                    int i27 = iArr[i24 >> 2] >> ((3 - (i24 & 3)) << 3);
                    i24 = i20 + 3;
                    if ((i27 & 192) != 128) {
                        S6(i27);
                    }
                    int i28 = (i27 & 63) | (i26 << 6);
                    i16 = 2;
                    if (i15 > 2) {
                        int i29 = iArr[i24 >> 2] >> ((3 - (i24 & 3)) << 3);
                        i24 = i20 + 4;
                        if ((i29 & 192) != 128) {
                            S6(i29 & 255);
                        }
                        i23 = (i28 << 6) | (i29 & 63);
                    } else {
                        i23 = i28;
                    }
                    if (i15 > i16) {
                        int i30 = i23 - 65536;
                        if (i21 >= cArrN.length) {
                            cArrN = this.W3.q();
                        }
                        cArrN[i21] = (char) ((i30 >> 10) + com.fasterxml.jackson.core.base.a.f102232g);
                        i23 = (i30 & 1023) | 56320;
                        i21++;
                    }
                } else {
                    i23 = i26;
                }
                i16 = 2;
                if (i15 > i16) {
                    int i31 = i23 - 65536;
                    if (i21 >= cArrN.length) {
                        cArrN = this.W3.q();
                    }
                    cArrN[i21] = (char) ((i31 >> 10) + com.fasterxml.jackson.core.base.a.f102232g);
                    i23 = (i31 & 1023) | 56320;
                    i21++;
                }
            } else {
                i13 = i18;
            }
            i20 = i24;
            if (i21 >= cArrN.length) {
                cArrN = this.W3.q();
            }
            cArrN[i21] = (char) i23;
            i21++;
            i18 = i13;
        }
        String str = new String(cArrN, 0, i21);
        if (i11 < 4) {
            iArr[i10 - 1] = i12;
        }
        return this.f102614m4.y(str, iArr, i10);
    }

    private final int Q5(int i10) throws IOException {
        if (this.M3 >= this.N3) {
            q6();
        }
        int i11 = i10 & 15;
        byte[] bArr = this.f102622u4;
        int i12 = this.M3;
        int i13 = i12 + 1;
        this.M3 = i13;
        byte b10 = bArr[i12];
        if ((b10 & org.msgpack.core.h.a.f339269e) != 128) {
            T6(b10 & 255, i13);
        }
        int i14 = (i11 << 6) | (b10 & 63);
        if (this.M3 >= this.N3) {
            q6();
        }
        byte[] bArr2 = this.f102622u4;
        int i15 = this.M3;
        int i16 = i15 + 1;
        this.M3 = i16;
        byte b11 = bArr2[i15];
        if ((b11 & org.msgpack.core.h.a.f339269e) != 128) {
            T6(b11 & 255, i16);
        }
        return (i14 << 6) | (b11 & 63);
    }

    private final String Q7(int i10, int i11) throws com.fasterxml.jackson.core.j {
        int iD6 = D6(i10, i11);
        String strG = this.f102614m4.G(iD6);
        if (strG != null) {
            return strG;
        }
        int[] iArr = this.f102615n4;
        iArr[0] = iD6;
        return N7(iArr, 1, i11);
    }

    private final int R5(int i10) throws IOException {
        int i11 = i10 & 15;
        byte[] bArr = this.f102622u4;
        int i12 = this.M3;
        int i13 = i12 + 1;
        this.M3 = i13;
        byte b10 = bArr[i12];
        if ((b10 & org.msgpack.core.h.a.f339269e) != 128) {
            T6(b10 & 255, i13);
        }
        int i14 = (i11 << 6) | (b10 & 63);
        byte[] bArr2 = this.f102622u4;
        int i15 = this.M3;
        int i16 = i15 + 1;
        this.M3 = i16;
        byte b11 = bArr2[i15];
        if ((b11 & org.msgpack.core.h.a.f339269e) != 128) {
            T6(b11 & 255, i16);
        }
        return (i14 << 6) | (b11 & 63);
    }

    private final int S5(int i10) throws IOException {
        if (this.M3 >= this.N3) {
            q6();
        }
        byte[] bArr = this.f102622u4;
        int i11 = this.M3;
        int i12 = i11 + 1;
        this.M3 = i12;
        byte b10 = bArr[i11];
        if ((b10 & org.msgpack.core.h.a.f339269e) != 128) {
            T6(b10 & 255, i12);
        }
        int i13 = ((i10 & 7) << 6) | (b10 & 63);
        if (this.M3 >= this.N3) {
            q6();
        }
        byte[] bArr2 = this.f102622u4;
        int i14 = this.M3;
        int i15 = i14 + 1;
        this.M3 = i15;
        byte b11 = bArr2[i14];
        if ((b11 & org.msgpack.core.h.a.f339269e) != 128) {
            T6(b11 & 255, i15);
        }
        int i16 = (i13 << 6) | (b11 & 63);
        if (this.M3 >= this.N3) {
            q6();
        }
        byte[] bArr3 = this.f102622u4;
        int i17 = this.M3;
        int i18 = i17 + 1;
        this.M3 = i18;
        byte b12 = bArr3[i17];
        if ((b12 & org.msgpack.core.h.a.f339269e) != 128) {
            T6(b12 & 255, i18);
        }
        return ((i16 << 6) | (b12 & 63)) - 65536;
    }

    private final void W5(char[] cArr, int i10) throws IOException {
        int[] iArr = f102610x4;
        byte[] bArr = this.f102622u4;
        while (true) {
            int i11 = this.M3;
            if (i11 >= this.N3) {
                q6();
                i11 = this.M3;
            }
            int i12 = 0;
            if (i10 >= cArr.length) {
                cArr = this.W3.s();
                i10 = 0;
            }
            int iMin = Math.min(this.N3, (cArr.length - i10) + i11);
            while (true) {
                if (i11 >= iMin) {
                    this.M3 = i11;
                    break;
                }
                int i13 = i11 + 1;
                int iW4 = bArr[i11] & 255;
                int i14 = iArr[iW4];
                if (i14 != 0) {
                    this.M3 = i13;
                    if (iW4 != 34) {
                        if (i14 == 1) {
                            iW4 = w4();
                        } else if (i14 == 2) {
                            iW4 = N5(iW4);
                        } else if (i14 == 3) {
                            iW4 = this.N3 - i13 >= 2 ? R5(iW4) : Q5(iW4);
                        } else if (i14 == 4) {
                            int iS5 = S5(iW4);
                            int i15 = i10 + 1;
                            cArr[i10] = (char) ((iS5 >> 10) | com.fasterxml.jackson.core.base.a.f102232g);
                            if (i15 >= cArr.length) {
                                cArr = this.W3.s();
                                i10 = 0;
                            } else {
                                i10 = i15;
                            }
                            iW4 = (iS5 & 1023) | 56320;
                        } else if (iW4 < 32) {
                            f4(iW4, "string value");
                        } else {
                            P6(iW4);
                        }
                        if (i10 >= cArr.length) {
                            cArr = this.W3.s();
                        } else {
                            i12 = i10;
                        }
                        i10 = i12 + 1;
                        cArr[i12] = (char) iW4;
                        break;
                    }
                    this.W3.I(i10);
                    return;
                }
                cArr[i10] = (char) iW4;
                i11 = i13;
                i10++;
            }
        }
    }

    private final String W7(int i10, int i11, int i12) throws com.fasterxml.jackson.core.j {
        int iD6 = D6(i11, i12);
        String strH = this.f102614m4.H(i10, iD6);
        if (strH != null) {
            return strH;
        }
        int[] iArr = this.f102615n4;
        iArr[0] = i10;
        iArr[1] = iD6;
        return N7(iArr, 2, i12);
    }

    private final void Y6() throws IOException {
        int[] iArrF = com.fasterxml.jackson.core.io.a.f();
        while (true) {
            if (this.M3 >= this.N3 && !o6()) {
                break;
            }
            byte[] bArr = this.f102622u4;
            int i10 = this.M3;
            int i11 = i10 + 1;
            this.M3 = i11;
            int i12 = bArr[i10] & 255;
            int i13 = iArrF[i12];
            if (i13 != 0) {
                if (i13 == 2) {
                    s7();
                } else if (i13 == 3) {
                    t7();
                } else if (i13 == 4) {
                    v7(i12);
                } else if (i13 == 10) {
                    this.P3++;
                    this.Q3 = i11;
                } else if (i13 == 13) {
                    Z6();
                } else if (i13 == 42) {
                    if (i11 >= this.N3 && !o6()) {
                        break;
                    }
                    byte[] bArr2 = this.f102622u4;
                    int i14 = this.M3;
                    if (bArr2[i14] == 47) {
                        this.M3 = i14 + 1;
                        return;
                    }
                } else {
                    P6(i12);
                }
            }
        }
        N3(" in a comment", null);
    }

    private final String Y7(int i10, int i11, int i12, int i13) throws com.fasterxml.jackson.core.j {
        int iD6 = D6(i12, i13);
        String strI = this.f102614m4.I(i10, i11, iD6);
        if (strI != null) {
            return strI;
        }
        int[] iArr = this.f102615n4;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = D6(iD6, i13);
        return N7(iArr, 3, i13);
    }

    private final String Z7(int[] iArr, int i10, int i11, int i12) throws com.fasterxml.jackson.core.j {
        if (i10 >= iArr.length) {
            iArr = com.fasterxml.jackson.core.base.b.k5(iArr, iArr.length);
            this.f102615n4 = iArr;
        }
        int i13 = i10 + 1;
        iArr[i10] = D6(i11, i12);
        String strJ = this.f102614m4.J(iArr, i13);
        return strJ == null ? N7(iArr, i13, i12) : strJ;
    }

    private final int c7() throws IOException {
        int i10 = this.M3;
        if (i10 + 4 >= this.N3) {
            return d7(false);
        }
        byte[] bArr = this.f102622u4;
        byte b10 = bArr[i10];
        if (b10 == 58) {
            int i11 = i10 + 1;
            this.M3 = i11;
            byte b11 = bArr[i11];
            if (b11 > 32) {
                if (b11 != 47 && b11 != 35) {
                    this.M3 = i10 + 2;
                    return b11;
                }
                return d7(true);
            }
            if (b11 == 32 || b11 == 9) {
                int i12 = i10 + 2;
                this.M3 = i12;
                byte b12 = bArr[i12];
                if (b12 > 32) {
                    if (b12 == 47 || b12 == 35) {
                        return d7(true);
                    }
                    this.M3 = i10 + 3;
                    return b12;
                }
            }
            return d7(true);
        }
        if (b10 == 32 || b10 == 9) {
            int i13 = i10 + 1;
            this.M3 = i13;
            b10 = bArr[i13];
        }
        if (b10 != 58) {
            return d7(false);
        }
        int i14 = this.M3;
        int i15 = i14 + 1;
        this.M3 = i15;
        byte b13 = bArr[i15];
        if (b13 > 32) {
            if (b13 != 47 && b13 != 35) {
                this.M3 = i14 + 2;
                return b13;
            }
            return d7(true);
        }
        if (b13 == 32 || b13 == 9) {
            int i16 = i14 + 2;
            this.M3 = i16;
            byte b14 = bArr[i16];
            if (b14 > 32) {
                if (b14 == 47 || b14 == 35) {
                    return d7(true);
                }
                this.M3 = i14 + 3;
                return b14;
            }
        }
        return d7(true);
    }

    private final int d7(boolean z10) throws IOException {
        while (true) {
            if (this.M3 >= this.N3 && !o6()) {
                N3(" within/between " + this.U3.q() + " entries", null);
                return -1;
            }
            byte[] bArr = this.f102622u4;
            int i10 = this.M3;
            int i11 = i10 + 1;
            this.M3 = i11;
            int i12 = bArr[i10] & 255;
            if (i12 > 32) {
                if (i12 == 47) {
                    l7();
                } else if (i12 != 35 || !B7()) {
                    if (z10) {
                        return i12;
                    }
                    if (i12 != 58) {
                        V3(i12, "was expecting a colon to separate field name and value");
                    }
                    z10 = true;
                }
            } else if (i12 != 32) {
                if (i12 == 10) {
                    this.P3++;
                    this.Q3 = i11;
                } else if (i12 == 13) {
                    Z6();
                } else if (i12 != 9) {
                    b4(i12);
                }
            }
        }
    }

    private int d8() throws IOException {
        if (this.M3 >= this.N3) {
            q6();
        }
        byte[] bArr = this.f102622u4;
        int i10 = this.M3;
        this.M3 = i10 + 1;
        return bArr[i10] & 255;
    }

    private final boolean g6(int i10, s sVar) throws IOException {
        n nVarI6;
        String strH6 = H6(i10);
        this.U3.B(strH6);
        boolean zEquals = strH6.equals(sVar.getValue());
        this.f102294g = n.FIELD_NAME;
        int iC7 = c7();
        H7();
        if (iC7 == 34) {
            int i11 = 1 << 1;
            this.f102616o4 = true;
            this.V3 = n.VALUE_STRING;
            return zEquals;
        }
        if (iC7 == 45) {
            nVarI6 = I6();
        } else if (iC7 == 91) {
            nVarI6 = n.START_ARRAY;
        } else if (iC7 == 102) {
            r6();
            nVarI6 = n.VALUE_FALSE;
        } else if (iC7 == 110) {
            s6();
            nVarI6 = n.VALUE_NULL;
        } else if (iC7 == 116) {
            x6();
            nVarI6 = n.VALUE_TRUE;
        } else if (iC7 != 123) {
            switch (iC7) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    nVarI6 = M6(iC7);
                    break;
                default:
                    nVarI6 = e6(iC7);
                    break;
            }
        } else {
            nVarI6 = n.START_OBJECT;
        }
        this.V3 = nVarI6;
        return zEquals;
    }

    private final void i6(int i10) throws IOException {
        this.f102294g = n.FIELD_NAME;
        H7();
        if (i10 == 34) {
            this.f102616o4 = true;
            this.V3 = n.VALUE_STRING;
            return;
        }
        if (i10 == 45) {
            this.V3 = I6();
            return;
        }
        if (i10 == 91) {
            this.V3 = n.START_ARRAY;
            return;
        }
        if (i10 == 102) {
            r6();
            this.V3 = n.VALUE_FALSE;
            return;
        }
        if (i10 == 110) {
            s6();
            this.V3 = n.VALUE_NULL;
            return;
        }
        if (i10 == 116) {
            x6();
            this.V3 = n.VALUE_TRUE;
        } else {
            if (i10 == 123) {
                this.V3 = n.START_OBJECT;
                return;
            }
            switch (i10) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    this.V3 = M6(i10);
                    break;
                default:
                    this.V3 = e6(i10);
                    break;
            }
        }
    }

    private final int i7(int i10) throws IOException {
        byte[] bArr = this.f102622u4;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 == 58) {
            int i12 = i10 + 2;
            byte b11 = bArr[i11];
            if (b11 > 32) {
                if (b11 != 47 && b11 != 35) {
                    this.M3 = i12;
                    return b11;
                }
            } else if (b11 == 32 || b11 == 9) {
                int i13 = i10 + 3;
                byte b12 = bArr[i12];
                if (b12 > 32 && b12 != 47 && b12 != 35) {
                    this.M3 = i13;
                    return b12;
                }
                i12 = i13;
            }
            this.M3 = i12 - 1;
            return d7(true);
        }
        if (b10 == 32 || b10 == 9) {
            b10 = bArr[i11];
            i11 = i10 + 2;
        }
        if (b10 != 58) {
            this.M3 = i11 - 1;
            return d7(false);
        }
        int i14 = i11 + 1;
        byte b13 = bArr[i11];
        if (b13 > 32) {
            if (b13 != 47 && b13 != 35) {
                this.M3 = i14;
                return b13;
            }
        } else if (b13 == 32 || b13 == 9) {
            int i15 = i11 + 2;
            byte b14 = bArr[i14];
            if (b14 > 32 && b14 != 47 && b14 != 35) {
                this.M3 = i15;
                return b14;
            }
            i14 = i15;
        }
        this.M3 = i14 - 1;
        return d7(true);
    }

    private final String k8(int i10, int i11, int i12) throws IOException {
        return e8(this.f102615n4, 0, i10, i11, i12);
    }

    private final void l7() throws IOException {
        if (!p2(JsonParser.a.ALLOW_COMMENTS)) {
            V3(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.M3 >= this.N3 && !o6()) {
            N3(" in a comment", null);
        }
        byte[] bArr = this.f102622u4;
        int i10 = this.M3;
        this.M3 = i10 + 1;
        int i11 = bArr[i10] & 255;
        if (i11 == 47) {
            m7();
        } else if (i11 == 42) {
            Y6();
        } else {
            V3(i11, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void m7() throws IOException {
        int[] iArrF = com.fasterxml.jackson.core.io.a.f();
        while (true) {
            if (this.M3 >= this.N3 && !o6()) {
                return;
            }
            byte[] bArr = this.f102622u4;
            int i10 = this.M3;
            int i11 = i10 + 1;
            this.M3 = i11;
            int i12 = bArr[i10] & 255;
            int i13 = iArrF[i12];
            if (i13 != 0) {
                if (i13 == 2) {
                    s7();
                } else if (i13 == 3) {
                    t7();
                } else if (i13 == 4) {
                    v7(i12);
                } else if (i13 == 10) {
                    this.P3++;
                    this.Q3 = i11;
                    return;
                } else if (i13 == 13) {
                    Z6();
                    return;
                } else if (i13 != 42 && i13 < 0) {
                    P6(i12);
                }
            }
        }
    }

    private final String m8(int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = this.f102615n4;
        iArr[0] = i10;
        return e8(iArr, 1, i11, i12, i13);
    }

    private final String n8(int i10, int i11, int i12, int i13, int i14) throws IOException {
        int[] iArr = this.f102615n4;
        iArr[0] = i10;
        iArr[1] = i11;
        return e8(iArr, 2, i12, i13, i14);
    }

    private final void s7() throws IOException {
        if (this.M3 >= this.N3) {
            q6();
        }
        byte[] bArr = this.f102622u4;
        int i10 = this.M3;
        int i11 = i10 + 1;
        this.M3 = i11;
        byte b10 = bArr[i10];
        if ((b10 & org.msgpack.core.h.a.f339269e) != 128) {
            T6(b10 & 255, i11);
        }
    }

    private final void t7() throws IOException {
        if (this.M3 >= this.N3) {
            q6();
        }
        byte[] bArr = this.f102622u4;
        int i10 = this.M3;
        int i11 = i10 + 1;
        this.M3 = i11;
        byte b10 = bArr[i10];
        if ((b10 & org.msgpack.core.h.a.f339269e) != 128) {
            T6(b10 & 255, i11);
        }
        if (this.M3 >= this.N3) {
            q6();
        }
        byte[] bArr2 = this.f102622u4;
        int i12 = this.M3;
        int i13 = i12 + 1;
        this.M3 = i13;
        byte b11 = bArr2[i12];
        if ((b11 & org.msgpack.core.h.a.f339269e) != 128) {
            T6(b11 & 255, i13);
        }
    }

    private final void v7(int i10) throws IOException {
        if (this.M3 >= this.N3) {
            q6();
        }
        byte[] bArr = this.f102622u4;
        int i11 = this.M3;
        int i12 = i11 + 1;
        this.M3 = i12;
        byte b10 = bArr[i11];
        if ((b10 & org.msgpack.core.h.a.f339269e) != 128) {
            T6(b10 & 255, i12);
        }
        if (this.M3 >= this.N3) {
            q6();
        }
        byte[] bArr2 = this.f102622u4;
        int i13 = this.M3;
        int i14 = i13 + 1;
        this.M3 = i14;
        byte b11 = bArr2[i13];
        if ((b11 & org.msgpack.core.h.a.f339269e) != 128) {
            T6(b11 & 255, i14);
        }
        if (this.M3 >= this.N3) {
            q6();
        }
        byte[] bArr3 = this.f102622u4;
        int i15 = this.M3;
        int i16 = i15 + 1;
        this.M3 = i16;
        byte b12 = bArr3[i15];
        if ((b12 & org.msgpack.core.h.a.f339269e) != 128) {
            T6(b12 & 255, i16);
        }
    }

    private final void w6(String str, int i10) throws IOException {
        int i11;
        int i12;
        int length = str.length();
        do {
            if ((this.M3 >= this.N3 && !o6()) || this.f102622u4[this.M3] != str.charAt(i10)) {
                V6(str.substring(0, i10));
            }
            i11 = this.M3 + 1;
            this.M3 = i11;
            i10++;
        } while (i10 < length);
        if ((i11 < this.N3 || o6()) && (i12 = this.f102622u4[this.M3] & 255) >= 48 && i12 != 93 && i12 != 125) {
            y5(str, i10, i12);
        }
    }

    private final int w7() throws IOException {
        while (true) {
            int i10 = this.M3;
            if (i10 >= this.N3) {
                return x7();
            }
            byte[] bArr = this.f102622u4;
            int i11 = i10 + 1;
            this.M3 = i11;
            int i12 = bArr[i10] & 255;
            if (i12 > 32) {
                if (i12 != 47 && i12 != 35) {
                    return i12;
                }
                this.M3 = i10;
                return x7();
            }
            if (i12 != 32) {
                if (i12 == 10) {
                    this.P3++;
                    this.Q3 = i11;
                } else if (i12 == 13) {
                    Z6();
                } else if (i12 != 9) {
                    b4(i12);
                }
            }
        }
    }

    private final int x7() throws IOException {
        while (true) {
            if (this.M3 >= this.N3 && !o6()) {
                throw f("Unexpected end-of-input within/between " + this.U3.q() + " entries");
            }
            byte[] bArr = this.f102622u4;
            int i10 = this.M3;
            int i11 = i10 + 1;
            this.M3 = i11;
            int i12 = bArr[i10] & 255;
            if (i12 > 32) {
                if (i12 == 47) {
                    l7();
                } else if (i12 != 35 || !B7()) {
                    return i12;
                }
            } else if (i12 != 32) {
                if (i12 == 10) {
                    this.P3++;
                    this.Q3 = i11;
                } else if (i12 == 13) {
                    Z6();
                } else if (i12 != 9) {
                    b4(i12);
                }
            }
        }
    }

    private final void y5(String str, int i10, int i11) throws IOException {
        if (Character.isJavaIdentifierPart((char) L5(i11))) {
            V6(str.substring(0, i10));
        }
    }

    private final n y6() {
        this.Y3 = false;
        n nVar = this.V3;
        this.V3 = null;
        if (nVar == n.START_ARRAY) {
            this.U3 = this.U3.t(this.S3, this.T3);
        } else if (nVar == n.START_OBJECT) {
            this.U3 = this.U3.u(this.S3, this.T3);
        }
        this.f102294g = nVar;
        return nVar;
    }

    private final int y7() throws IOException {
        if (this.M3 >= this.N3 && !o6()) {
            return C4();
        }
        byte[] bArr = this.f102622u4;
        int i10 = this.M3;
        int i11 = i10 + 1;
        this.M3 = i11;
        int i12 = bArr[i10] & 255;
        if (i12 > 32) {
            if (i12 != 47 && i12 != 35) {
                return i12;
            }
            this.M3 = i10;
            return z7();
        }
        if (i12 != 32) {
            if (i12 == 10) {
                this.P3++;
                this.Q3 = i11;
            } else if (i12 == 13) {
                Z6();
            } else if (i12 != 9) {
                b4(i12);
            }
        }
        while (true) {
            int i13 = this.M3;
            if (i13 >= this.N3) {
                return z7();
            }
            byte[] bArr2 = this.f102622u4;
            int i14 = i13 + 1;
            this.M3 = i14;
            int i15 = bArr2[i13] & 255;
            if (i15 > 32) {
                if (i15 != 47 && i15 != 35) {
                    return i15;
                }
                this.M3 = i13;
                return z7();
            }
            if (i15 != 32) {
                if (i15 == 10) {
                    this.P3++;
                    this.Q3 = i14;
                } else if (i15 == 13) {
                    Z6();
                } else if (i15 != 9) {
                    b4(i15);
                }
            }
        }
    }

    private final void z5() throws com.fasterxml.jackson.core.j {
        H7();
        if (!this.U3.k()) {
            R4(93, AbstractJsonLexerKt.END_OBJ);
        }
        this.U3 = this.U3.s();
    }

    private final int z7() throws IOException {
        while (true) {
            if (this.M3 >= this.N3 && !o6()) {
                return C4();
            }
            byte[] bArr = this.f102622u4;
            int i10 = this.M3;
            int i11 = i10 + 1;
            this.M3 = i11;
            int i12 = bArr[i10] & 255;
            if (i12 > 32) {
                if (i12 == 47) {
                    l7();
                } else if (i12 != 35 || !B7()) {
                    return i12;
                }
            } else if (i12 != 32) {
                if (i12 == 10) {
                    this.P3++;
                    this.Q3 = i11;
                } else if (i12 == 13) {
                    Z6();
                } else if (i12 != 9) {
                    b4(i12);
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long B2(long j10) throws IOException {
        if (this.f102294g == n.FIELD_NAME) {
            this.Y3 = false;
            n nVar = this.V3;
            this.V3 = null;
            this.f102294g = nVar;
            if (nVar == n.VALUE_NUMBER_INT) {
                return Q0();
            }
            if (nVar == n.START_ARRAY) {
                this.U3 = this.U3.t(this.S3, this.T3);
                return j10;
            }
            if (nVar == n.START_OBJECT) {
                this.U3 = this.U3.u(this.S3, this.T3);
                return j10;
            }
        } else if (E2() == n.VALUE_NUMBER_INT) {
            return Q0();
        }
        return j10;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String D2() throws IOException {
        if (this.f102294g != n.FIELD_NAME) {
            if (E2() == n.VALUE_STRING) {
                return j1();
            }
            return null;
        }
        this.Y3 = false;
        n nVar = this.V3;
        this.V3 = null;
        this.f102294g = nVar;
        if (nVar == n.VALUE_STRING) {
            if (!this.f102616o4) {
                return this.W3.l();
            }
            this.f102616o4 = false;
            return T5();
        }
        if (nVar == n.START_ARRAY) {
            this.U3 = this.U3.t(this.S3, this.T3);
        } else if (nVar == n.START_OBJECT) {
            this.U3 = this.U3.u(this.S3, this.T3);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected void D4() throws IOException {
        int i10 = this.M3;
        if (i10 >= this.N3) {
            q6();
            i10 = this.M3;
        }
        char[] cArrN = this.W3.n();
        int[] iArr = f102610x4;
        int iMin = Math.min(this.N3, cArrN.length + i10);
        byte[] bArr = this.f102622u4;
        int i11 = 0;
        while (i10 < iMin) {
            int i12 = bArr[i10] & 255;
            if (iArr[i12] != 0) {
                if (i12 != 34) {
                    break;
                }
                this.M3 = i10 + 1;
                this.W3.I(i11);
                return;
            }
            i10++;
            cArrN[i11] = (char) i12;
            i11++;
        }
        this.M3 = i10;
        W5(cArrN, i11);
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public n E2() throws IOException {
        n nVarI6;
        n nVar = this.f102294g;
        n nVar2 = n.FIELD_NAME;
        if (nVar == nVar2) {
            return y6();
        }
        this.f102250b4 = 0;
        if (this.f102616o4) {
            o7();
        }
        int iY7 = y7();
        if (iY7 < 0) {
            close();
            this.f102294g = null;
            return null;
        }
        this.f102249a4 = null;
        if (iY7 == 93) {
            z5();
            n nVar3 = n.END_ARRAY;
            this.f102294g = nVar3;
            return nVar3;
        }
        if (iY7 == 125) {
            A5();
            n nVar4 = n.END_OBJECT;
            this.f102294g = nVar4;
            return nVar4;
        }
        if (this.U3.x()) {
            if (iY7 != 44) {
                V3(iY7, "was expecting comma to separate " + this.U3.q() + " entries");
            }
            iY7 = w7();
            if ((this.f102189a & f102612z4) != 0 && (iY7 == 93 || iY7 == 125)) {
                return F5(iY7);
            }
        }
        if (!this.U3.l()) {
            H7();
            return A6(iY7);
        }
        I7();
        this.U3.B(H6(iY7));
        this.f102294g = nVar2;
        int iC7 = c7();
        H7();
        if (iC7 == 34) {
            this.f102616o4 = true;
            this.V3 = n.VALUE_STRING;
            return this.f102294g;
        }
        if (iC7 == 45) {
            nVarI6 = I6();
        } else if (iC7 == 91) {
            nVarI6 = n.START_ARRAY;
        } else if (iC7 == 102) {
            r6();
            nVarI6 = n.VALUE_FALSE;
        } else if (iC7 == 110) {
            s6();
            nVarI6 = n.VALUE_NULL;
        } else if (iC7 == 116) {
            x6();
            nVarI6 = n.VALUE_TRUE;
        } else if (iC7 != 123) {
            switch (iC7) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    nVarI6 = M6(iC7);
                    break;
                default:
                    nVarI6 = e6(iC7);
                    break;
            }
        } else {
            nVarI6 = n.START_OBJECT;
        }
        this.V3 = nVarI6;
        return this.f102294g;
    }

    protected String E6() throws IOException {
        if (this.M3 >= this.N3 && !o6()) {
            N3(": was expecting closing ''' for field name", n.FIELD_NAME);
        }
        byte[] bArr = this.f102622u4;
        int i10 = this.M3;
        this.M3 = i10 + 1;
        int iW4 = bArr[i10] & 255;
        if (iW4 == 39) {
            return "";
        }
        int[] iArrK5 = this.f102615n4;
        int[] iArr = f102611y4;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (iW4 != 39) {
            if (iArr[iW4] != 0 && iW4 != 34) {
                if (iW4 != 92) {
                    f4(iW4, "name");
                } else {
                    iW4 = w4();
                }
                if (iW4 > 127) {
                    if (i11 >= 4) {
                        if (i12 >= iArrK5.length) {
                            iArrK5 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                            this.f102615n4 = iArrK5;
                        }
                        iArrK5[i12] = i13;
                        i13 = 0;
                        i12++;
                        i11 = 0;
                    }
                    if (iW4 < 2048) {
                        i13 = (i13 << 8) | (iW4 >> 6) | 192;
                        i11++;
                    } else {
                        int i14 = (i13 << 8) | (iW4 >> 12) | 224;
                        int i15 = i11 + 1;
                        if (i15 >= 4) {
                            if (i12 >= iArrK5.length) {
                                iArrK5 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                                this.f102615n4 = iArrK5;
                            }
                            iArrK5[i12] = i14;
                            i14 = 0;
                            i12++;
                            i15 = 0;
                        }
                        i13 = (i14 << 8) | ((iW4 >> 6) & 63) | 128;
                        i11 = i15 + 1;
                    }
                    iW4 = (iW4 & 63) | 128;
                }
            }
            if (i11 < 4) {
                i11++;
                iW4 |= i13 << 8;
            } else {
                if (i12 >= iArrK5.length) {
                    iArrK5 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                    this.f102615n4 = iArrK5;
                }
                iArrK5[i12] = i13;
                i12++;
                i11 = 1;
            }
            i13 = iW4;
            if (this.M3 >= this.N3 && !o6()) {
                N3(" in field name", n.FIELD_NAME);
            }
            byte[] bArr2 = this.f102622u4;
            int i16 = this.M3;
            this.M3 = i16 + 1;
            iW4 = bArr2[i16] & 255;
        }
        if (i11 > 0) {
            if (i12 >= iArrK5.length) {
                iArrK5 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                this.f102615n4 = iArrK5;
            }
            iArrK5[i12] = D6(i13, i11);
            i12++;
        }
        String strJ = this.f102614m4.J(iArrK5, i12);
        return strJ == null ? N7(iArrK5, i12, i11) : strJ;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void H() throws IOException {
        if (this.f102616o4) {
            this.f102616o4 = false;
            D4();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object H0() {
        return this.f102621t4;
    }

    protected final String H6(int i10) throws IOException {
        if (i10 != 34) {
            return c6(i10);
        }
        int i11 = this.M3;
        if (i11 + 13 > this.N3) {
            return q8();
        }
        byte[] bArr = this.f102622u4;
        int[] iArr = f102611y4;
        int i12 = i11 + 1;
        this.M3 = i12;
        int i13 = bArr[i11] & 255;
        if (iArr[i13] != 0) {
            return i13 == 34 ? "" : k8(0, i13, 0);
        }
        int i14 = i11 + 2;
        this.M3 = i14;
        int i15 = bArr[i12] & 255;
        if (iArr[i15] != 0) {
            return i15 == 34 ? Q7(i13, 1) : k8(i13, i15, 1);
        }
        int i16 = i15 | (i13 << 8);
        int i17 = i11 + 3;
        this.M3 = i17;
        int i18 = bArr[i14] & 255;
        if (iArr[i18] != 0) {
            return i18 == 34 ? Q7(i16, 2) : k8(i16, i18, 2);
        }
        int i19 = (i16 << 8) | i18;
        int i20 = i11 + 4;
        this.M3 = i20;
        int i21 = bArr[i17] & 255;
        if (iArr[i21] != 0) {
            return i21 == 34 ? Q7(i19, 3) : k8(i19, i21, 3);
        }
        int i22 = (i19 << 8) | i21;
        this.M3 = i11 + 5;
        int i23 = bArr[i20] & 255;
        if (iArr[i23] != 0) {
            return i23 == 34 ? Q7(i22, 4) : k8(i22, i23, 4);
        }
        this.f102617p4 = i22;
        return i8(i23);
    }

    protected n I6() throws IOException {
        char[] cArrN = this.W3.n();
        cArrN[0] = l.f335457d;
        if (this.M3 >= this.N3) {
            q6();
        }
        byte[] bArr = this.f102622u4;
        int i10 = this.M3;
        this.M3 = i10 + 1;
        int iK7 = bArr[i10] & 255;
        if (iK7 <= 48) {
            if (iK7 != 48) {
                return b6(iK7, true);
            }
            iK7 = K7();
        } else if (iK7 > 57) {
            return b6(iK7, true);
        }
        cArrN[1] = (char) iK7;
        int i11 = 2;
        int iMin = Math.min(this.N3, (this.M3 + cArrN.length) - 2);
        int i12 = 1;
        while (true) {
            int i13 = this.M3;
            if (i13 >= iMin) {
                return L6(cArrN, i11, true, i12);
            }
            byte[] bArr2 = this.f102622u4;
            this.M3 = i13 + 1;
            int i14 = bArr2[i13] & 255;
            if (i14 >= 48 && i14 <= 57) {
                i12++;
                cArrN[i11] = (char) i14;
                i11++;
            }
            if (i14 == 46 || i14 == 101 || i14 == 69) {
                return F6(cArrN, i11, i14, true, i12);
            }
            this.M3 = i13;
            this.W3.I(i11);
            if (this.U3.m()) {
                M7(i14);
            }
            return x5(true, i12);
        }
    }

    protected final byte[] K5(com.fasterxml.jackson.core.a aVar) throws IOException {
        com.fasterxml.jackson.core.util.c cVarE4 = E4();
        while (true) {
            if (this.M3 >= this.N3) {
                q6();
            }
            byte[] bArr = this.f102622u4;
            int i10 = this.M3;
            this.M3 = i10 + 1;
            int i11 = bArr[i10] & 255;
            if (i11 > 32) {
                int iG = aVar.g(i11);
                if (iG < 0) {
                    if (i11 == 34) {
                        return cVarE4.q();
                    }
                    iG = t4(aVar, i11, 0);
                    if (iG < 0) {
                    }
                }
                if (this.M3 >= this.N3) {
                    q6();
                }
                byte[] bArr2 = this.f102622u4;
                int i12 = this.M3;
                this.M3 = i12 + 1;
                int i13 = bArr2[i12] & 255;
                int iG2 = aVar.g(i13);
                if (iG2 < 0) {
                    iG2 = t4(aVar, i13, 1);
                }
                int i14 = (iG << 6) | iG2;
                if (this.M3 >= this.N3) {
                    q6();
                }
                byte[] bArr3 = this.f102622u4;
                int i15 = this.M3;
                this.M3 = i15 + 1;
                int i16 = bArr3[i15] & 255;
                int iG3 = aVar.g(i16);
                if (iG3 < 0) {
                    if (iG3 != -2) {
                        if (i16 == 34 && !aVar.u()) {
                            cVarE4.b(i14 >> 4);
                            return cVarE4.q();
                        }
                        iG3 = t4(aVar, i16, 2);
                    }
                    if (iG3 == -2) {
                        if (this.M3 >= this.N3) {
                            q6();
                        }
                        byte[] bArr4 = this.f102622u4;
                        int i17 = this.M3;
                        this.M3 = i17 + 1;
                        int i18 = bArr4[i17] & 255;
                        if (!aVar.w(i18)) {
                            throw r5(aVar, i18, 3, "expected padding character '" + aVar.t() + "'");
                        }
                        cVarE4.b(i14 >> 4);
                    }
                }
                int i19 = (i14 << 6) | iG3;
                if (this.M3 >= this.N3) {
                    q6();
                }
                byte[] bArr5 = this.f102622u4;
                int i20 = this.M3;
                this.M3 = i20 + 1;
                int i21 = bArr5[i20] & 255;
                int iG4 = aVar.g(i21);
                if (iG4 < 0) {
                    if (iG4 != -2) {
                        if (i21 == 34 && !aVar.u()) {
                            cVarE4.e(i19 >> 2);
                            return cVarE4.q();
                        }
                        iG4 = t4(aVar, i21, 3);
                    }
                    if (iG4 == -2) {
                        cVarE4.e(i19 >> 2);
                    }
                }
                cVarE4.d((i19 << 6) | iG4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    protected int L5(int i10) throws IOException {
        char c10;
        int iD8;
        int iD9;
        int iD10;
        int i11 = i10 & 255;
        if (i11 > 127) {
            if ((i10 & 224) == 192) {
                i11 = i10 & 31;
            } else {
                if ((i10 & 240) == 224) {
                    i11 = i10 & 15;
                    c10 = 2;
                } else if ((i10 & com.planner5d.library.engine.input.f.b.R1) == 240) {
                    i11 = i10 & 7;
                    c10 = 3;
                } else {
                    R6(i10 & 255);
                }
                iD8 = d8();
                if ((iD8 & 192) != 128) {
                    S6(iD8 & 255);
                }
                i11 = (i11 << 6) | (iD8 & 63);
                if (c10 > 1) {
                    iD9 = d8();
                    if ((iD9 & 192) != 128) {
                        S6(iD9 & 255);
                    }
                    i11 = (i11 << 6) | (iD9 & 63);
                    if (c10 > 2) {
                        iD10 = d8();
                        if ((iD10 & 192) != 128) {
                            S6(iD10 & 255);
                        }
                        return (i11 << 6) | (iD10 & 63);
                    }
                }
            }
            c10 = 1;
            iD8 = d8();
            if ((iD8 & 192) != 128) {
                S6(iD8 & 255);
            }
            i11 = (i11 << 6) | (iD8 & 63);
            if (c10 > 1) {
                iD9 = d8();
                if ((iD9 & 192) != 128) {
                    S6(iD9 & 255);
                }
                i11 = (i11 << 6) | (iD9 & 63);
                if (c10 > 2) {
                    iD10 = d8();
                    if ((iD10 & 192) != 128) {
                        S6(iD10 & 255);
                    }
                    return (i11 << 6) | (iD10 & 63);
                }
            }
        }
        return i11;
    }

    protected n M6(int i10) throws IOException {
        char[] cArrN = this.W3.n();
        if (i10 == 48) {
            i10 = K7();
        }
        cArrN[0] = (char) i10;
        int iMin = Math.min(this.N3, (this.M3 + cArrN.length) - 1);
        int i11 = 1;
        int i12 = 1;
        while (true) {
            int i13 = this.M3;
            if (i13 >= iMin) {
                return L6(cArrN, i11, false, i12);
            }
            byte[] bArr = this.f102622u4;
            this.M3 = i13 + 1;
            int i14 = bArr[i13] & 255;
            if (i14 < 48 || i14 > 57) {
                if (i14 == 46 || i14 == 101 || i14 == 69) {
                    return F6(cArrN, i11, i14, false, i12);
                }
                this.M3 = i13;
                this.W3.I(i11);
                if (this.U3.m()) {
                    M7(i14);
                }
                return x5(false, i12);
            }
            i12++;
            cArrN[i11] = (char) i14;
            i11++;
        }
    }

    protected int N6(com.fasterxml.jackson.core.a aVar, OutputStream outputStream, byte[] bArr) throws IOException {
        int length = bArr.length - 3;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (this.M3 >= this.N3) {
                q6();
            }
            byte[] bArr2 = this.f102622u4;
            int i12 = this.M3;
            this.M3 = i12 + 1;
            int i13 = bArr2[i12] & 255;
            if (i13 > 32) {
                int iG = aVar.g(i13);
                if (iG < 0) {
                    if (i13 == 34) {
                        break;
                    }
                    iG = t4(aVar, i13, 0);
                    if (iG < 0) {
                        continue;
                    }
                }
                if (i10 > length) {
                    i11 += i10;
                    outputStream.write(bArr, 0, i10);
                    i10 = 0;
                }
                if (this.M3 >= this.N3) {
                    q6();
                }
                byte[] bArr3 = this.f102622u4;
                int i14 = this.M3;
                this.M3 = i14 + 1;
                int i15 = bArr3[i14] & 255;
                int iG2 = aVar.g(i15);
                if (iG2 < 0) {
                    iG2 = t4(aVar, i15, 1);
                }
                int i16 = (iG << 6) | iG2;
                if (this.M3 >= this.N3) {
                    q6();
                }
                byte[] bArr4 = this.f102622u4;
                int i17 = this.M3;
                this.M3 = i17 + 1;
                int i18 = bArr4[i17] & 255;
                int iG3 = aVar.g(i18);
                if (iG3 < 0) {
                    if (iG3 != -2) {
                        if (i18 == 34 && !aVar.u()) {
                            bArr[i10] = (byte) (i16 >> 4);
                            i10++;
                            break;
                        }
                        iG3 = t4(aVar, i18, 2);
                    }
                    if (iG3 == -2) {
                        if (this.M3 >= this.N3) {
                            q6();
                        }
                        byte[] bArr5 = this.f102622u4;
                        int i19 = this.M3;
                        this.M3 = i19 + 1;
                        int i20 = bArr5[i19] & 255;
                        if (!aVar.w(i20)) {
                            throw r5(aVar, i20, 3, "expected padding character '" + aVar.t() + "'");
                        }
                        bArr[i10] = (byte) (i16 >> 4);
                        i10++;
                    }
                }
                int i21 = (i16 << 6) | iG3;
                if (this.M3 >= this.N3) {
                    q6();
                }
                byte[] bArr6 = this.f102622u4;
                int i22 = this.M3;
                this.M3 = i22 + 1;
                int i23 = bArr6[i22] & 255;
                int iG4 = aVar.g(i23);
                if (iG4 < 0) {
                    if (iG4 != -2) {
                        if (i23 == 34 && !aVar.u()) {
                            int i24 = i10 + 1;
                            bArr[i10] = (byte) (i21 >> 10);
                            i10 += 2;
                            bArr[i24] = (byte) (i21 >> 2);
                            break;
                        }
                        iG4 = t4(aVar, i23, 3);
                    }
                    if (iG4 == -2) {
                        int i25 = i10 + 1;
                        bArr[i10] = (byte) (i21 >> 10);
                        i10 += 2;
                        bArr[i25] = (byte) (i21 >> 2);
                    }
                }
                int i26 = (i21 << 6) | iG4;
                bArr[i10] = (byte) (i26 >> 16);
                int i27 = i10 + 2;
                bArr[i10 + 1] = (byte) (i26 >> 8);
                i10 += 3;
                bArr[i27] = (byte) i26;
            }
        }
        this.f102616o4 = false;
        if (i10 <= 0) {
            return i11;
        }
        int i28 = i11 + i10;
        outputStream.write(bArr, 0, i10);
        return i28;
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public int O1() throws IOException {
        n nVar = this.f102294g;
        if (nVar != n.VALUE_NUMBER_INT && nVar != n.VALUE_NUMBER_FLOAT) {
            return super.T1(0);
        }
        int i10 = this.f102250b4;
        if ((i10 & 1) == 0) {
            if (i10 == 0) {
                return I4();
            }
            if ((i10 & 1) == 0) {
                X4();
            }
        }
        return this.f102251c4;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int O2(com.fasterxml.jackson.core.a aVar, OutputStream outputStream) throws IOException {
        if (this.f102616o4 && this.f102294g == n.VALUE_STRING) {
            byte[] bArrD = this.K3.d();
            try {
                int iN6 = N6(aVar, outputStream, bArrD);
                this.K3.r(bArrD);
                return iN6;
            } catch (Throwable th2) {
                this.K3.r(bArrD);
                throw th2;
            }
        }
        byte[] bArrR = R(aVar);
        outputStream.write(bArrR);
        return bArrR.length;
    }

    protected void P6(int i10) throws com.fasterxml.jackson.core.j {
        if (i10 < 32) {
            b4(i10);
        }
        R6(i10);
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected void Q4() throws IOException {
        byte[] bArr;
        super.Q4();
        this.f102614m4.R();
        if (!this.f102623v4 || (bArr = this.f102622u4) == null) {
            return;
        }
        this.f102622u4 = com.fasterxml.jackson.core.base.c.f102271m3;
        this.K3.u(bArr);
    }

    @Override // com.fasterxml.jackson.core.base.b, com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public byte[] R(com.fasterxml.jackson.core.a aVar) throws IOException {
        n nVar = this.f102294g;
        if (nVar != n.VALUE_STRING && (nVar != n.VALUE_EMBEDDED_OBJECT || this.f102249a4 == null)) {
            F3("Current token (" + this.f102294g + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f102616o4) {
            try {
                this.f102249a4 = K5(aVar);
                this.f102616o4 = false;
            } catch (IllegalArgumentException e10) {
                throw f("Failed to decode VALUE_STRING as base64 (" + aVar + "): " + e10.getMessage());
            }
        } else if (this.f102249a4 == null) {
            com.fasterxml.jackson.core.util.c cVarE4 = E4();
            w3(j1(), cVarE4, aVar);
            this.f102249a4 = cVarE4.q();
        }
        return this.f102249a4;
    }

    protected void R6(int i10) throws com.fasterxml.jackson.core.j {
        F3("Invalid UTF-8 start byte 0x" + Integer.toHexString(i10));
    }

    protected void S6(int i10) throws com.fasterxml.jackson.core.j {
        F3("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i10));
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public int T1(int i10) throws IOException {
        n nVar = this.f102294g;
        if (nVar != n.VALUE_NUMBER_INT && nVar != n.VALUE_NUMBER_FLOAT) {
            return super.T1(i10);
        }
        int i11 = this.f102250b4;
        if ((i11 & 1) == 0) {
            if (i11 == 0) {
                return I4();
            }
            if ((i11 & 1) == 0) {
                X4();
            }
        }
        return this.f102251c4;
    }

    protected String T5() throws IOException {
        int i10 = this.M3;
        if (i10 >= this.N3) {
            q6();
            i10 = this.M3;
        }
        char[] cArrN = this.W3.n();
        int[] iArr = f102610x4;
        int iMin = Math.min(this.N3, cArrN.length + i10);
        byte[] bArr = this.f102622u4;
        int i11 = 0;
        while (i10 < iMin) {
            int i12 = bArr[i10] & 255;
            if (iArr[i12] != 0) {
                if (i12 != 34) {
                    break;
                }
                this.M3 = i10 + 1;
                return this.W3.H(i11);
            }
            i10++;
            cArrN[i11] = (char) i12;
            i11++;
        }
        this.M3 = i10;
        W5(cArrN, i11);
        return this.W3.l();
    }

    protected void T6(int i10, int i11) throws com.fasterxml.jackson.core.j {
        this.M3 = i11;
        S6(i10);
    }

    protected void V6(String str) throws IOException {
        X6(str, "'null', 'true', 'false' or NaN");
    }

    protected void W6(String str, int i10) throws IOException {
        this.M3 = i10;
        X6(str, "'null', 'true', 'false' or NaN");
    }

    protected final String X5(n nVar) {
        if (nVar == null) {
            return null;
        }
        int iO = nVar.o();
        if (iO != 5) {
            return (iO == 6 || iO == 7 || iO == 8) ? this.W3.l() : nVar.n();
        }
        return this.U3.b();
    }

    protected void X6(String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        do {
            if (this.M3 < this.N3 || o6()) {
                byte[] bArr = this.f102622u4;
                int i10 = this.M3;
                this.M3 = i10 + 1;
                char cL5 = (char) L5(bArr[i10]);
                if (Character.isJavaIdentifierPart(cL5)) {
                    sb2.append(cL5);
                }
            }
            H3("Unrecognized token '%s': was expecting %s", sb2, str2);
        } while (sb2.length() < 256);
        sb2.append("...");
        H3("Unrecognized token '%s': was expecting %s", sb2, str2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public q Y() {
        return this.f102613l4;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int Y2(OutputStream outputStream) throws IOException {
        int i10 = this.N3;
        int i11 = this.M3;
        int i12 = i10 - i11;
        if (i12 < 1) {
            return 0;
        }
        outputStream.write(this.f102622u4, i11, i12);
        return i12;
    }

    protected n Z5() throws IOException {
        char[] cArrN = this.W3.n();
        int[] iArr = f102610x4;
        byte[] bArr = this.f102622u4;
        int i10 = 0;
        while (true) {
            if (this.M3 >= this.N3) {
                q6();
            }
            if (i10 >= cArrN.length) {
                cArrN = this.W3.s();
                i10 = 0;
            }
            int i11 = this.N3;
            int length = this.M3 + (cArrN.length - i10);
            if (length < i11) {
                i11 = length;
            }
            while (true) {
                int i12 = this.M3;
                if (i12 >= i11) {
                    break;
                }
                int i13 = i12 + 1;
                this.M3 = i13;
                int iW4 = bArr[i12] & 255;
                if (iW4 == 39 || iArr[iW4] != 0) {
                    if (iW4 != 39) {
                        int i14 = iArr[iW4];
                        if (i14 == 1) {
                            iW4 = w4();
                        } else if (i14 == 2) {
                            iW4 = N5(iW4);
                        } else if (i14 == 3) {
                            iW4 = this.N3 - i13 >= 2 ? R5(iW4) : Q5(iW4);
                        } else if (i14 != 4) {
                            if (iW4 < 32) {
                                f4(iW4, "string value");
                            }
                            P6(iW4);
                        } else {
                            int iS5 = S5(iW4);
                            int i15 = i10 + 1;
                            cArrN[i10] = (char) ((iS5 >> 10) | com.fasterxml.jackson.core.base.a.f102232g);
                            if (i15 >= cArrN.length) {
                                cArrN = this.W3.s();
                                i10 = 0;
                            } else {
                                i10 = i15;
                            }
                            iW4 = 56320 | (iS5 & 1023);
                        }
                        if (i10 >= cArrN.length) {
                            cArrN = this.W3.s();
                            i10 = 0;
                        }
                        cArrN[i10] = (char) iW4;
                        i10++;
                        break;
                    }
                    this.W3.I(i10);
                    return n.VALUE_STRING;
                }
                cArrN[i10] = (char) iW4;
                i10++;
            }
        }
    }

    protected final void Z6() throws IOException {
        if (this.M3 < this.N3 || o6()) {
            byte[] bArr = this.f102622u4;
            int i10 = this.M3;
            if (bArr[i10] == 10) {
                this.M3 = i10 + 1;
            }
        }
        this.P3++;
        this.Q3 = this.M3;
    }

    protected n b6(int i10, boolean z10) throws IOException {
        String str;
        while (i10 == 73) {
            if (this.M3 >= this.N3 && !o6()) {
                S3(n.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this.f102622u4;
            int i11 = this.M3;
            this.M3 = i11 + 1;
            i10 = bArr[i11];
            if (i10 != 78) {
                if (i10 != 110) {
                    break;
                }
                str = z10 ? "-Infinity" : "+Infinity";
            } else {
                str = z10 ? "-INF" : "+INF";
            }
            v6(str, 3);
            if (p2(JsonParser.a.ALLOW_NON_NUMERIC_NUMBERS)) {
                return t5(str, z10 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            G3("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        n4(i10, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    protected String c6(int i10) throws IOException {
        if (i10 == 39 && p2(JsonParser.a.ALLOW_SINGLE_QUOTES)) {
            return E6();
        }
        if (!p2(JsonParser.a.ALLOW_UNQUOTED_FIELD_NAMES)) {
            V3((char) L5(i10), "was expecting double-quote to start field name");
        }
        int[] iArrJ = com.fasterxml.jackson.core.io.a.j();
        if (iArrJ[i10] != 0) {
            V3(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrK5 = this.f102615n4;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i11 < 4) {
                i11++;
                i10 |= i13 << 8;
            } else {
                if (i12 >= iArrK5.length) {
                    iArrK5 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                    this.f102615n4 = iArrK5;
                }
                iArrK5[i12] = i13;
                i12++;
                i11 = 1;
            }
            i13 = i10;
            if (this.M3 >= this.N3 && !o6()) {
                N3(" in field name", n.FIELD_NAME);
            }
            byte[] bArr = this.f102622u4;
            int i14 = this.M3;
            i10 = bArr[i14] & 255;
            if (iArrJ[i10] != 0) {
                break;
            }
            this.M3 = i14 + 1;
        }
        if (i11 > 0) {
            if (i12 >= iArrK5.length) {
                iArrK5 = com.fasterxml.jackson.core.base.b.k5(iArrK5, iArrK5.length);
                this.f102615n4 = iArrK5;
            }
            iArrK5[i12] = i13;
            i12++;
        }
        String strJ = this.f102614m4.J(iArrK5, i12);
        return strJ == null ? N7(iArrK5, i12, i11) : strJ;
    }

    @Override // com.fasterxml.jackson.core.base.b, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.i d0() {
        return new com.fasterxml.jackson.core.i(H4(), this.O3 + ((long) this.M3), -1L, this.P3, (this.M3 - this.Q3) + 1);
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public String d2() throws IOException {
        n nVar = this.f102294g;
        if (nVar != n.VALUE_STRING) {
            return nVar == n.FIELD_NAME ? f0() : super.e2(null);
        }
        if (!this.f102616o4) {
            return this.W3.l();
        }
        this.f102616o4 = false;
        return T5();
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public String e2(String str) throws IOException {
        n nVar = this.f102294g;
        if (nVar != n.VALUE_STRING) {
            return nVar == n.FIELD_NAME ? f0() : super.e2(str);
        }
        if (!this.f102616o4) {
            return this.W3.l();
        }
        this.f102616o4 = false;
        return T5();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void e3(q qVar) {
        this.f102613l4 = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r4.U3.k() == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.n e6(int r5) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.j.e6(int):com.fasterxml.jackson.core.n");
    }

    protected final String e8(int[] iArr, int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr2 = f102611y4;
        while (true) {
            if (iArr2[i12] != 0) {
                if (i12 == 34) {
                    break;
                }
                if (i12 != 92) {
                    f4(i12, "name");
                } else {
                    i12 = w4();
                }
                if (i12 > 127) {
                    int i14 = 0;
                    if (i13 >= 4) {
                        if (i10 >= iArr.length) {
                            iArr = com.fasterxml.jackson.core.base.b.k5(iArr, iArr.length);
                            this.f102615n4 = iArr;
                        }
                        iArr[i10] = i11;
                        i10++;
                        i11 = 0;
                        i13 = 0;
                    }
                    if (i12 < 2048) {
                        i11 = (i11 << 8) | (i12 >> 6) | 192;
                        i13++;
                    } else {
                        int i15 = (i11 << 8) | (i12 >> 12) | 224;
                        int i16 = i13 + 1;
                        if (i16 >= 4) {
                            if (i10 >= iArr.length) {
                                iArr = com.fasterxml.jackson.core.base.b.k5(iArr, iArr.length);
                                this.f102615n4 = iArr;
                            }
                            iArr[i10] = i15;
                            i10++;
                            i16 = 0;
                        } else {
                            i14 = i15;
                        }
                        i11 = (i14 << 8) | ((i12 >> 6) & 63) | 128;
                        i13 = i16 + 1;
                    }
                    i12 = (i12 & 63) | 128;
                }
            }
            if (i13 < 4) {
                i13++;
                i11 = (i11 << 8) | i12;
            } else {
                if (i10 >= iArr.length) {
                    iArr = com.fasterxml.jackson.core.base.b.k5(iArr, iArr.length);
                    this.f102615n4 = iArr;
                }
                iArr[i10] = i11;
                i11 = i12;
                i10++;
                i13 = 1;
            }
            if (this.M3 >= this.N3 && !o6()) {
                N3(" in field name", n.FIELD_NAME);
            }
            byte[] bArr = this.f102622u4;
            int i17 = this.M3;
            this.M3 = i17 + 1;
            i12 = bArr[i17] & 255;
        }
        if (i13 > 0) {
            if (i10 >= iArr.length) {
                iArr = com.fasterxml.jackson.core.base.b.k5(iArr, iArr.length);
                this.f102615n4 = iArr;
            }
            iArr[i10] = D6(i11, i13);
            i10++;
        }
        String strJ = this.f102614m4.J(iArr, i10);
        return strJ == null ? N7(iArr, i10, i13) : strJ;
    }

    protected final String f8(int i10, int i11, int i12) throws IOException {
        int[] iArr = this.f102615n4;
        iArr[0] = this.f102617p4;
        int i13 = 1;
        iArr[1] = i11;
        iArr[2] = i12;
        byte[] bArr = this.f102622u4;
        int[] iArr2 = f102611y4;
        int i14 = i10;
        int i15 = 3;
        while (true) {
            int i16 = this.M3;
            if (i16 + 4 > this.N3) {
                return e8(this.f102615n4, i15, 0, i14, 0);
            }
            int i17 = i16 + 1;
            this.M3 = i17;
            int i18 = bArr[i16] & 255;
            if (iArr2[i18] != 0) {
                if (i18 == 34) {
                    return Z7(this.f102615n4, i15, i14, i13);
                }
                return e8(this.f102615n4, i15, i14, i18, 1);
            }
            int i19 = i13;
            int i20 = i15;
            int i21 = i14;
            int[] iArr3 = iArr2;
            int i22 = (i21 << 8) | i18;
            int i23 = i16 + 2;
            this.M3 = i23;
            int i24 = bArr[i17] & 255;
            if (iArr3[i24] != 0) {
                return i24 == 34 ? Z7(this.f102615n4, i20, i22, 2) : e8(this.f102615n4, i20, i22, i24, 2);
            }
            int i25 = (i22 << 8) | i24;
            int i26 = i16 + 3;
            this.M3 = i26;
            int i27 = bArr[i23] & 255;
            if (iArr3[i27] != 0) {
                return i27 == 34 ? Z7(this.f102615n4, i20, i25, 3) : e8(this.f102615n4, i20, i25, i27, 3);
            }
            int i28 = (i25 << 8) | i27;
            this.M3 = i16 + 4;
            int i29 = bArr[i26] & 255;
            if (iArr3[i29] != 0) {
                return i29 == 34 ? Z7(this.f102615n4, i20, i28, 4) : e8(this.f102615n4, i20, i28, i29, 4);
            }
            int[] iArr4 = this.f102615n4;
            if (i20 >= iArr4.length) {
                this.f102615n4 = com.fasterxml.jackson.core.base.b.k5(iArr4, i20);
            }
            this.f102615n4[i20] = i28;
            i14 = i29;
            iArr2 = iArr3;
            i15 = i20 + 1;
            i13 = i19;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int h1(Writer writer) throws IOException {
        n nVar = this.f102294g;
        if (nVar == n.VALUE_STRING) {
            if (this.f102616o4) {
                this.f102616o4 = false;
                D4();
            }
            return this.W3.m(writer);
        }
        if (nVar == n.FIELD_NAME) {
            String strB = this.U3.b();
            writer.write(strB);
            return strB.length();
        }
        if (nVar == null) {
            return 0;
        }
        if (nVar.q()) {
            return this.W3.m(writer);
        }
        char[] cArrL = nVar.l();
        writer.write(cArrL);
        return cArrL.length;
    }

    protected final String i8(int i10) throws IOException {
        byte[] bArr = this.f102622u4;
        int[] iArr = f102611y4;
        int i11 = this.M3;
        int i12 = i11 + 1;
        this.M3 = i12;
        int i13 = bArr[i11] & 255;
        if (iArr[i13] != 0) {
            return i13 == 34 ? W7(this.f102617p4, i10, 1) : m8(this.f102617p4, i10, i13, 1);
        }
        int i14 = (i10 << 8) | i13;
        int i15 = i11 + 2;
        this.M3 = i15;
        int i16 = bArr[i12] & 255;
        if (iArr[i16] != 0) {
            int i17 = 6 << 2;
            return i16 == 34 ? W7(this.f102617p4, i14, 2) : m8(this.f102617p4, i14, i16, 2);
        }
        int i18 = (i14 << 8) | i16;
        int i19 = i11 + 3;
        this.M3 = i19;
        int i20 = bArr[i15] & 255;
        if (iArr[i20] != 0) {
            return i20 == 34 ? W7(this.f102617p4, i18, 3) : m8(this.f102617p4, i18, i20, 3);
        }
        int i21 = (i18 << 8) | i20;
        this.M3 = i11 + 4;
        int i22 = bArr[i19] & 255;
        if (iArr[i22] != 0) {
            return i22 == 34 ? W7(this.f102617p4, i21, 4) : m8(this.f102617p4, i21, i22, 4);
        }
        return j8(i22, i21);
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public String j1() throws IOException {
        n nVar = this.f102294g;
        if (nVar != n.VALUE_STRING) {
            return X5(nVar);
        }
        if (!this.f102616o4) {
            return this.W3.l();
        }
        this.f102616o4 = false;
        return T5();
    }

    protected final String j8(int i10, int i11) throws IOException {
        byte[] bArr = this.f102622u4;
        int[] iArr = f102611y4;
        int i12 = this.M3;
        int i13 = i12 + 1;
        this.M3 = i13;
        int i14 = bArr[i12] & 255;
        if (iArr[i14] != 0) {
            return i14 == 34 ? Y7(this.f102617p4, i11, i10, 1) : n8(this.f102617p4, i11, i10, i14, 1);
        }
        int i15 = (i10 << 8) | i14;
        int i16 = i12 + 2;
        this.M3 = i16;
        int i17 = bArr[i13] & 255;
        if (iArr[i17] != 0) {
            return i17 == 34 ? Y7(this.f102617p4, i11, i15, 2) : n8(this.f102617p4, i11, i15, i17, 2);
        }
        int i18 = (i15 << 8) | i17;
        int i19 = i12 + 3;
        this.M3 = i19;
        int i20 = bArr[i16] & 255;
        if (iArr[i20] != 0) {
            return i20 == 34 ? Y7(this.f102617p4, i11, i18, 3) : n8(this.f102617p4, i11, i18, i20, 3);
        }
        int i21 = (i18 << 8) | i20;
        this.M3 = i12 + 4;
        int i22 = bArr[i19] & 255;
        if (iArr[i22] != 0) {
            return i22 == 34 ? Y7(this.f102617p4, i11, i21, 4) : n8(this.f102617p4, i11, i21, i22, 4);
        }
        return f8(i22, i11, i21);
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public char[] l1() throws IOException {
        n nVar = this.f102294g;
        if (nVar == null) {
            return null;
        }
        int iO = nVar.o();
        if (iO != 5) {
            if (iO != 6) {
                if (iO != 7 && iO != 8) {
                    return this.f102294g.l();
                }
            } else if (this.f102616o4) {
                this.f102616o4 = false;
                D4();
            }
            return this.W3.w();
        }
        if (!this.Y3) {
            String strB = this.U3.b();
            int length = strB.length();
            char[] cArr = this.X3;
            if (cArr == null) {
                this.X3 = this.K3.g(length);
            } else if (cArr.length < length) {
                this.X3 = new char[length];
            }
            strB.getChars(0, length, this.X3, 0);
            this.Y3 = true;
        }
        return this.X3;
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public int o1() throws IOException {
        n nVar = this.f102294g;
        if (nVar == null) {
            return 0;
        }
        int iO = nVar.o();
        if (iO == 5) {
            return this.U3.b().length();
        }
        if (iO != 6) {
            if (iO != 7 && iO != 8) {
                return this.f102294g.l().length;
            }
        } else if (this.f102616o4) {
            this.f102616o4 = false;
            D4();
        }
        return this.W3.J();
    }

    protected final boolean o6() throws IOException {
        int i10 = this.N3;
        this.O3 += (long) i10;
        this.Q3 -= i10;
        this.f102618q4 -= i10;
        InputStream inputStream = this.f102621t4;
        if (inputStream != null) {
            byte[] bArr = this.f102622u4;
            int length = bArr.length;
            if (length == 0) {
                return false;
            }
            int i11 = inputStream.read(bArr, 0, length);
            if (i11 > 0) {
                this.M3 = 0;
                this.N3 = i11;
                return true;
            }
            r4();
            if (i11 == 0) {
                throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.f102622u4.length + " bytes");
            }
        }
        return false;
    }

    protected void o7() throws IOException {
        this.f102616o4 = false;
        int[] iArr = f102610x4;
        byte[] bArr = this.f102622u4;
        while (true) {
            int i10 = this.M3;
            int i11 = this.N3;
            if (i10 >= i11) {
                q6();
                i10 = this.M3;
                i11 = this.N3;
            }
            while (true) {
                if (i10 >= i11) {
                    this.M3 = i10;
                    break;
                }
                int i12 = i10 + 1;
                int i13 = bArr[i10] & 255;
                int i14 = iArr[i13];
                if (i14 != 0) {
                    this.M3 = i12;
                    if (i13 != 34) {
                        if (i14 == 1) {
                            w4();
                            break;
                        }
                        if (i14 == 2) {
                            s7();
                            break;
                        }
                        if (i14 == 3) {
                            t7();
                            break;
                        }
                        if (i14 == 4) {
                            v7(i13);
                            break;
                        } else if (i13 >= 32) {
                            P6(i13);
                            break;
                        } else {
                            f4(i13, "string value");
                            break;
                        }
                    }
                    return;
                }
                i10 = i12;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int p1() throws java.io.IOException {
        /*
            r4 = this;
            com.fasterxml.jackson.core.n r0 = r4.f102294g
            r1 = 0
            if (r0 == 0) goto L29
            int r0 = r0.o()
            r2 = 6
            if (r0 == r2) goto L16
            r3 = 6
            r2 = 7
            if (r0 == r2) goto L21
            r3 = 3
            r2 = 8
            if (r0 == r2) goto L21
            goto L29
        L16:
            boolean r0 = r4.f102616o4
            r3 = 2
            if (r0 == 0) goto L21
            r4.f102616o4 = r1
            r3 = 6
            r4.D4()
        L21:
            com.fasterxml.jackson.core.util.n r4 = r4.W3
            int r4 = r4.x()
            r3 = 5
            return r4
        L29:
            r3 = 5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.j.p1():int");
    }

    protected void q6() throws IOException {
        if (o6()) {
            return;
        }
        I3();
    }

    protected String q8() throws IOException {
        if (this.M3 >= this.N3 && !o6()) {
            N3(": was expecting closing '\"' for name", n.FIELD_NAME);
        }
        byte[] bArr = this.f102622u4;
        int i10 = this.M3;
        this.M3 = i10 + 1;
        int i11 = bArr[i10] & 255;
        return i11 == 34 ? "" : e8(this.f102615n4, 0, 0, i11, 0);
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected void r4() throws IOException {
        if (this.f102621t4 != null) {
            if (this.K3.q() || p2(JsonParser.a.AUTO_CLOSE_SOURCE)) {
                this.f102621t4.close();
            }
            this.f102621t4 = null;
        }
    }

    protected final void r6() throws IOException {
        int i10;
        int i11 = this.M3;
        if (i11 + 4 < this.N3) {
            byte[] bArr = this.f102622u4;
            int i12 = i11 + 1;
            if (bArr[i11] == 97) {
                int i13 = i11 + 2;
                if (bArr[i12] == 108) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 115) {
                        int i15 = i11 + 4;
                        if (bArr[i14] == 101 && ((i10 = bArr[i15] & 255) < 48 || i10 == 93 || i10 == 125)) {
                            this.M3 = i15;
                            return;
                        }
                    }
                }
            }
        }
        w6("false", 1);
    }

    @Override // com.fasterxml.jackson.core.base.b, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.i s1() {
        if (this.f102294g != n.FIELD_NAME) {
            return new com.fasterxml.jackson.core.i(H4(), this.R3 - 1, -1L, this.S3, this.T3);
        }
        return new com.fasterxml.jackson.core.i(H4(), this.O3 + ((long) (this.f102618q4 - 1)), -1L, this.f102619r4, this.f102620s4);
    }

    protected final void s6() throws IOException {
        int i10;
        int i11 = this.M3;
        if (i11 + 3 < this.N3) {
            byte[] bArr = this.f102622u4;
            int i12 = i11 + 1;
            if (bArr[i11] == 117) {
                int i13 = i11 + 2;
                if (bArr[i12] == 108) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 108 && ((i10 = bArr[i14] & 255) < 48 || i10 == 93 || i10 == 125)) {
                        this.M3 = i14;
                        return;
                    }
                }
            }
        }
        w6(AbstractJsonLexerKt.NULL, 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Boolean u2() throws IOException {
        if (this.f102294g != n.FIELD_NAME) {
            n nVarE2 = E2();
            if (nVarE2 == n.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (nVarE2 == n.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            return null;
        }
        this.Y3 = false;
        n nVar = this.V3;
        this.V3 = null;
        this.f102294g = nVar;
        if (nVar == n.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (nVar == n.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        if (nVar == n.START_ARRAY) {
            this.U3 = this.U3.t(this.S3, this.T3);
        } else if (nVar == n.START_OBJECT) {
            this.U3 = this.U3.u(this.S3, this.T3);
        }
        return null;
    }

    protected final void v6(String str, int i10) throws IOException {
        int i11;
        int length = str.length();
        if (this.M3 + length >= this.N3) {
            w6(str, i10);
            return;
        }
        do {
            if (this.f102622u4[this.M3] != str.charAt(i10)) {
                V6(str.substring(0, i10));
            }
            i11 = this.M3 + 1;
            this.M3 = i11;
            i10++;
        } while (i10 < length);
        int i12 = this.f102622u4[i11] & 255;
        if (i12 < 48 || i12 == 93 || i12 == 125) {
            return;
        }
        y5(str, i10, i12);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String w2() throws IOException {
        n nVarI6;
        this.f102250b4 = 0;
        n nVar = this.f102294g;
        n nVar2 = n.FIELD_NAME;
        if (nVar == nVar2) {
            y6();
            return null;
        }
        if (this.f102616o4) {
            o7();
        }
        int iY7 = y7();
        if (iY7 < 0) {
            close();
            this.f102294g = null;
            return null;
        }
        this.f102249a4 = null;
        if (iY7 == 93) {
            z5();
            this.f102294g = n.END_ARRAY;
            return null;
        }
        if (iY7 == 125) {
            A5();
            this.f102294g = n.END_OBJECT;
            return null;
        }
        if (this.U3.x()) {
            if (iY7 != 44) {
                V3(iY7, "was expecting comma to separate " + this.U3.q() + " entries");
            }
            iY7 = w7();
            if ((this.f102189a & f102612z4) != 0 && (iY7 == 93 || iY7 == 125)) {
                F5(iY7);
                return null;
            }
        }
        if (!this.U3.l()) {
            H7();
            A6(iY7);
            return null;
        }
        I7();
        String strH6 = H6(iY7);
        this.U3.B(strH6);
        this.f102294g = nVar2;
        int iC7 = c7();
        H7();
        if (iC7 == 34) {
            this.f102616o4 = true;
            this.V3 = n.VALUE_STRING;
            return strH6;
        }
        if (iC7 == 45) {
            nVarI6 = I6();
        } else if (iC7 == 91) {
            nVarI6 = n.START_ARRAY;
        } else if (iC7 == 102) {
            r6();
            nVarI6 = n.VALUE_FALSE;
        } else if (iC7 == 110) {
            s6();
            nVarI6 = n.VALUE_NULL;
        } else if (iC7 == 116) {
            x6();
            nVarI6 = n.VALUE_TRUE;
        } else if (iC7 != 123) {
            switch (iC7) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    nVarI6 = M6(iC7);
                    break;
                default:
                    nVarI6 = e6(iC7);
                    break;
            }
        } else {
            nVarI6 = n.START_OBJECT;
        }
        this.V3 = nVarI6;
        return strH6;
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected char w4() throws IOException {
        if (this.M3 >= this.N3 && !o6()) {
            N3(" in character escape sequence", n.VALUE_STRING);
        }
        byte[] bArr = this.f102622u4;
        int i10 = this.M3;
        this.M3 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 == 34 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return org.apache.commons.lang3.k.f337188d;
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            return C3((char) L5(b10));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            if (this.M3 >= this.N3 && !o6()) {
                N3(" in character escape sequence", n.VALUE_STRING);
            }
            byte[] bArr2 = this.f102622u4;
            int i13 = this.M3;
            this.M3 = i13 + 1;
            byte b11 = bArr2[i13];
            int iB = com.fasterxml.jackson.core.io.a.b(b11);
            if (iB < 0) {
                V3(b11, "expected a hex-digit for character escape sequence");
            }
            i11 = (i11 << 4) | iB;
        }
        return (char) i11;
    }

    protected final void x6() throws IOException {
        int i10;
        int i11 = this.M3;
        if (i11 + 3 < this.N3) {
            byte[] bArr = this.f102622u4;
            int i12 = i11 + 1;
            if (bArr[i11] == 114) {
                int i13 = i11 + 2;
                if (bArr[i12] == 117) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 101 && ((i10 = bArr[i14] & 255) < 48 || i10 == 93 || i10 == 125)) {
                        this.M3 = i14;
                        return;
                    }
                }
            }
        }
        w6(z0.P, 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean y2(s sVar) throws IOException {
        int i10 = 0;
        this.f102250b4 = 0;
        if (this.f102294g == n.FIELD_NAME) {
            y6();
            return false;
        }
        if (this.f102616o4) {
            o7();
        }
        int iY7 = y7();
        if (iY7 < 0) {
            close();
            this.f102294g = null;
            return false;
        }
        this.f102249a4 = null;
        if (iY7 == 93) {
            z5();
            this.f102294g = n.END_ARRAY;
            return false;
        }
        if (iY7 == 125) {
            A5();
            this.f102294g = n.END_OBJECT;
            return false;
        }
        if (this.U3.x()) {
            if (iY7 != 44) {
                V3(iY7, "was expecting comma to separate " + this.U3.q() + " entries");
            }
            iY7 = w7();
            if ((this.f102189a & f102612z4) != 0 && (iY7 == 93 || iY7 == 125)) {
                F5(iY7);
                return false;
            }
        }
        if (!this.U3.l()) {
            H7();
            A6(iY7);
            return false;
        }
        I7();
        if (iY7 == 34) {
            byte[] bArrD = sVar.d();
            int length = bArrD.length;
            int i11 = this.M3;
            if (i11 + length + 4 < this.N3) {
                int i12 = length + i11;
                if (this.f102622u4[i12] == 34) {
                    while (i11 != i12) {
                        if (bArrD[i10] == this.f102622u4[i11]) {
                            i10++;
                            i11++;
                        }
                    }
                    this.U3.B(sVar.getValue());
                    i6(i7(i11 + 1));
                    return true;
                }
            }
        }
        return g6(iY7, sVar);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int z2(int i10) throws IOException {
        if (this.f102294g == n.FIELD_NAME) {
            this.Y3 = false;
            n nVar = this.V3;
            this.V3 = null;
            this.f102294g = nVar;
            if (nVar == n.VALUE_NUMBER_INT) {
                return M0();
            }
            if (nVar == n.START_ARRAY) {
                this.U3 = this.U3.t(this.S3, this.T3);
                return i10;
            }
            if (nVar == n.START_OBJECT) {
                this.U3 = this.U3.u(this.S3, this.T3);
                return i10;
            }
        } else if (E2() == n.VALUE_NUMBER_INT) {
            return M0();
        }
        return i10;
    }
}
