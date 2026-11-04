package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.i;
import com.fasterxml.jackson.core.io.d;
import com.fasterxml.jackson.core.j;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.util.c;
import com.planner5d.library.engine.input.f;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends com.fasterxml.jackson.core.base.b {
    protected static final int B4 = 0;
    protected static final int C4 = 1;
    protected static final int D4 = 2;
    protected static final int E4 = 3;
    protected static final int F4 = 4;
    protected static final int G4 = 5;
    protected static final int H4 = 6;
    protected static final int I4 = 7;
    protected static final int J4 = 1;
    protected static final int K4 = 2;
    protected static final int L4 = 3;
    protected static final int M4 = 4;
    protected static final int N4 = 5;
    protected static final int O4 = 7;
    protected static final int P4 = 8;
    protected static final int Q4 = 9;
    protected static final int R4 = 10;
    protected static final int S4 = 12;
    protected static final int T4 = 13;
    protected static final int U4 = 14;
    protected static final int V4 = 15;
    protected static final int W4 = 16;
    protected static final int X4 = 17;
    protected static final int Y4 = 18;
    protected static final int Z4 = 19;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    protected static final int f102499a5 = 23;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    protected static final int f102500b5 = 24;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    protected static final int f102501c5 = 25;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    protected static final int f102502d5 = 26;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    protected static final int f102503e5 = 30;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    protected static final int f102504f5 = 31;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    protected static final int f102505g5 = 32;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    protected static final int f102506h5 = 40;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    protected static final int f102507i5 = 41;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    protected static final int f102508j5 = 42;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    protected static final int f102509k5 = 43;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    protected static final int f102510l5 = 44;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    protected static final int f102511m5 = 45;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    protected static final int f102512n5 = 50;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    protected static final int f102513o5 = 51;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    protected static final int f102514p5 = 52;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    protected static final int f102515q5 = 53;

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    protected static final int f102516r5 = 54;

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    protected static final int f102517s5 = 55;

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    protected static final int f102518t5 = 0;

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    protected static final int f102519u5 = 1;

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    protected static final int f102520v5 = 2;

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    protected static final int f102521w5 = 3;

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    protected static final String[] f102522x5 = {"NaN", "Infinity", "+Infinity", "-Infinity"};

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    protected static final double[] f102523y5 = {Double.NaN, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
    protected int A4;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    protected final com.fasterxml.jackson.core.sym.a f102524l4;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    protected int[] f102525m4;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    protected int f102526n4;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    protected int f102527o4;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    protected int f102528p4;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    protected int f102529q4;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    protected int f102530r4;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    protected int f102531s4;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    protected int f102532t4;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    protected int f102533u4;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    protected int f102534v4;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    protected int f102535w4;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    protected boolean f102536x4;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    protected int f102537y4;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    protected int f102538z4;

    public b(d dVar, int i10, com.fasterxml.jackson.core.sym.a aVar) {
        super(dVar, i10);
        this.f102525m4 = new int[8];
        this.f102536x4 = false;
        this.f102538z4 = 0;
        this.A4 = 1;
        this.f102524l4 = aVar;
        this.f102294g = null;
        this.f102532t4 = 0;
        this.f102533u4 = 1;
    }

    protected static final int T5(int i10, int i11) {
        return i11 == 4 ? i10 : i10 | ((-1) << (i11 << 3));
    }

    protected final n A5() throws IOException {
        int i10;
        if (!this.U3.l()) {
            R4(125, AbstractJsonLexerKt.END_LIST);
        }
        com.fasterxml.jackson.core.json.d dVarE = this.U3.e();
        this.U3 = dVarE;
        if (dVarE.l()) {
            i10 = 3;
        } else {
            i10 = dVarE.k() ? 6 : 1;
        }
        this.f102532t4 = i10;
        this.f102533u4 = i10;
        n nVar = n.END_OBJECT;
        this.f102294g = nVar;
        return nVar;
    }

    protected final n F5() throws IOException {
        this.f102532t4 = 7;
        if (!this.U3.m()) {
            y3();
        }
        close();
        this.f102294g = null;
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object H0() {
        return null;
    }

    protected final n K5(String str) throws IOException {
        this.f102532t4 = 4;
        this.U3.B(str);
        n nVar = n.FIELD_NAME;
        this.f102294g = nVar;
        return nVar;
    }

    protected final String L5(int i10, int i11) throws j {
        int iT5 = T5(i10, i11);
        String strG = this.f102524l4.G(iT5);
        if (strG != null) {
            return strG;
        }
        int[] iArr = this.f102525m4;
        iArr[0] = iT5;
        return y5(iArr, 1, i11);
    }

    protected final String N5(int i10, int i11, int i12) throws j {
        int iT5 = T5(i11, i12);
        String strH = this.f102524l4.H(i10, iT5);
        if (strH != null) {
            return strH;
        }
        int[] iArr = this.f102525m4;
        iArr[0] = i10;
        iArr[1] = iT5;
        return y5(iArr, 2, i12);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int O2(com.fasterxml.jackson.core.a aVar, OutputStream outputStream) throws IOException {
        byte[] bArrR = R(aVar);
        outputStream.write(bArrR);
        return bArrR.length;
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected void Q4() throws IOException {
        super.Q4();
        this.f102524l4.R();
    }

    protected final String Q5(int i10, int i11, int i12, int i13) throws j {
        int iT5 = T5(i12, i13);
        String strI = this.f102524l4.I(i10, i11, iT5);
        if (strI != null) {
            return strI;
        }
        int[] iArr = this.f102525m4;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = T5(iT5, i13);
        return y5(iArr, 3, i13);
    }

    @Override // com.fasterxml.jackson.core.base.b, com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public byte[] R(com.fasterxml.jackson.core.a aVar) throws IOException {
        n nVar = this.f102294g;
        if (nVar != n.VALUE_STRING) {
            G3("Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary", nVar);
        }
        if (this.f102249a4 == null) {
            c cVarE4 = E4();
            w3(j1(), cVarE4, aVar);
            this.f102249a4 = cVarE4.q();
        }
        return this.f102249a4;
    }

    protected final String R5(n nVar) {
        int iO;
        if (nVar == null || (iO = nVar.o()) == -1) {
            return null;
        }
        if (iO == 5) {
            return this.U3.b();
        }
        int i10 = 2 >> 6;
        return (iO == 6 || iO == 7 || iO == 8) ? this.W3.l() : nVar.n();
    }

    protected final String S5(int i10) {
        return f102522x5[i10];
    }

    protected void W5(int i10) throws j {
        if (i10 < 32) {
            b4(i10);
        }
        X5(i10);
    }

    protected void X5(int i10) throws j {
        F3("Invalid UTF-8 start byte 0x" + Integer.toHexString(i10));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public q Y() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract int Y2(OutputStream outputStream) throws IOException;

    protected void Z5(int i10) throws j {
        F3("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i10));
    }

    protected void b6(int i10, int i11) throws j {
        this.M3 = i11;
        Z5(i10);
    }

    protected final n c6() throws IOException {
        this.U3 = this.U3.t(-1, -1);
        this.f102532t4 = 5;
        int i10 = 3 << 6;
        this.f102533u4 = 6;
        n nVar = n.START_ARRAY;
        this.f102294g = nVar;
        return nVar;
    }

    @Override // com.fasterxml.jackson.core.base.b, com.fasterxml.jackson.core.JsonParser
    public i d0() {
        int i10 = (this.M3 - this.Q3) + 1;
        return new i(H4(), this.O3 + ((long) (this.M3 - this.f102538z4)), -1L, Math.max(this.P3, this.A4), i10);
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public String d2() throws IOException {
        n nVar = this.f102294g;
        if (nVar == n.VALUE_STRING) {
            return this.W3.l();
        }
        return nVar == n.FIELD_NAME ? f0() : super.e2(null);
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public String e2(String str) throws IOException {
        n nVar = this.f102294g;
        if (nVar == n.VALUE_STRING) {
            return this.W3.l();
        }
        return nVar == n.FIELD_NAME ? f0() : super.e2(str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void e3(q qVar) {
        throw new UnsupportedOperationException("Can not use ObjectMapper with non-blocking parser");
    }

    protected final n e6() throws IOException {
        this.U3 = this.U3.u(-1, -1);
        this.f102532t4 = 2;
        this.f102533u4 = 3;
        n nVar = n.START_OBJECT;
        this.f102294g = nVar;
        return nVar;
    }

    protected final void g6() {
        this.S3 = Math.max(this.P3, this.A4);
        int i10 = this.M3;
        this.T3 = i10 - this.Q3;
        this.R3 = this.O3 + ((long) (i10 - this.f102538z4));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean h() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int h1(Writer writer) throws IOException {
        n nVar = this.f102294g;
        if (nVar == n.VALUE_STRING) {
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
        if (nVar == n.NOT_AVAILABLE) {
            F3("Current token not available: can not call this method");
        }
        char[] cArrL = nVar.l();
        writer.write(cArrL);
        return cArrL.length;
    }

    @Override // com.fasterxml.jackson.core.base.b, com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public boolean i2() {
        n nVar = this.f102294g;
        if (nVar == n.VALUE_STRING) {
            return this.W3.y();
        }
        if (nVar == n.FIELD_NAME) {
            return this.Y3;
        }
        return false;
    }

    protected final n i6(n nVar) throws IOException {
        this.f102532t4 = this.f102533u4;
        this.f102294g = nVar;
        return nVar;
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public String j1() throws IOException {
        n nVar = this.f102294g;
        return nVar == n.VALUE_STRING ? this.W3.l() : R5(nVar);
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public char[] l1() throws IOException {
        n nVar = this.f102294g;
        if (nVar == null) {
            return null;
        }
        int iO = nVar.o();
        if (iO != 5) {
            return (iO == 6 || iO == 7 || iO == 8) ? this.W3.w() : this.f102294g.l();
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
        if (iO != 5) {
            return (iO == 6 || iO == 7 || iO == 8) ? this.W3.J() : this.f102294g.l().length;
        }
        return this.U3.b().length();
    }

    protected final n o6(int i10, String str) throws IOException {
        this.W3.F(str);
        this.f102257i4 = str.length();
        this.f102250b4 = 1;
        this.f102251c4 = i10;
        this.f102532t4 = this.f102533u4;
        n nVar = n.VALUE_NUMBER_INT;
        this.f102294g = nVar;
        return nVar;
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public int p1() throws IOException {
        int iO;
        n nVar = this.f102294g;
        if (nVar == null || !((iO = nVar.o()) == 6 || iO == 7 || iO == 8)) {
            return 0;
        }
        return this.W3.x();
    }

    protected final n q6(int i10) throws IOException {
        String str = f102522x5[i10];
        this.W3.F(str);
        if (!p2(JsonParser.a.ALLOW_NON_NUMERIC_NUMBERS)) {
            G3("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        this.f102257i4 = 0;
        this.f102250b4 = 8;
        this.f102253e4 = f102523y5[i10];
        this.f102532t4 = this.f102533u4;
        n nVar = n.VALUE_NUMBER_FLOAT;
        this.f102294g = nVar;
        return nVar;
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected void r4() throws IOException {
        this.f102538z4 = 0;
        this.N3 = 0;
    }

    protected com.fasterxml.jackson.core.sym.a r6() {
        return this.f102524l4;
    }

    @Override // com.fasterxml.jackson.core.base.b, com.fasterxml.jackson.core.JsonParser
    public i s1() {
        return new i(H4(), this.R3, -1L, this.S3, this.T3);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object w0() throws IOException {
        if (this.f102294g == n.VALUE_EMBEDDED_OBJECT) {
            return this.f102249a4;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    protected final String y5(int[] iArr, int i10, int i11) throws j {
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
                } else if ((i22 & f.b.R1) == 240) {
                    i14 = i22 & 7;
                    i15 = i13;
                } else {
                    X5(i23);
                    i14 = 1;
                    i15 = 1;
                }
                if (i24 + i15 > i17) {
                    N3(" in field name", n.FIELD_NAME);
                }
                int i25 = iArr[i24 >> 2] >> ((3 - (i24 & 3)) << 3);
                i24 = i20 + 2;
                if ((i25 & 192) != 128) {
                    Z5(i25);
                }
                int i26 = (i14 << 6) | (i25 & 63);
                if (i15 > 1) {
                    int i27 = iArr[i24 >> 2] >> ((3 - (i24 & 3)) << 3);
                    i24 = i20 + 3;
                    if ((i27 & 192) != 128) {
                        Z5(i27);
                    }
                    int i28 = (i27 & 63) | (i26 << 6);
                    i16 = 2;
                    if (i15 > 2) {
                        int i29 = iArr[i24 >> 2] >> ((3 - (i24 & 3)) << 3);
                        i24 = i20 + 4;
                        if ((i29 & 192) != 128) {
                            Z5(i29 & 255);
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
        return this.f102524l4.y(str, iArr, i10);
    }

    protected final n z5() throws IOException {
        int i10;
        if (!this.U3.k()) {
            R4(93, AbstractJsonLexerKt.END_OBJ);
        }
        com.fasterxml.jackson.core.json.d dVarE = this.U3.e();
        this.U3 = dVarE;
        if (dVarE.l()) {
            i10 = 3;
        } else {
            i10 = dVarE.k() ? 6 : 1;
        }
        this.f102532t4 = i10;
        this.f102533u4 = i10;
        n nVar = n.END_ARRAY;
        this.f102294g = nVar;
        return nVar;
    }
}
