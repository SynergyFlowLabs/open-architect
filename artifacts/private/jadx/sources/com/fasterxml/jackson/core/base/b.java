package com.fasterxml.jackson.core.base;

import androidx.collection.g3;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.d;
import com.fasterxml.jackson.core.io.i;
import com.fasterxml.jackson.core.j;
import com.fasterxml.jackson.core.json.f;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.v;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends c {
    protected final d K3;
    protected boolean L3;
    protected int M3;
    protected int N3;
    protected long O3;
    protected int P3;
    protected int Q3;
    protected long R3;
    protected int S3;
    protected int T3;
    protected com.fasterxml.jackson.core.json.d U3;
    protected n V3;
    protected final com.fasterxml.jackson.core.util.n W3;
    protected char[] X3;
    protected boolean Y3;
    protected com.fasterxml.jackson.core.util.c Z3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    protected byte[] f102249a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    protected int f102250b4;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    protected int f102251c4;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    protected long f102252d4;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    protected double f102253e4;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    protected BigInteger f102254f4;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    protected BigDecimal f102255g4;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    protected boolean f102256h4;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    protected int f102257i4;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    protected int f102258j4;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    protected int f102259k4;

    protected b(d dVar, int i10) {
        super(i10);
        this.P3 = 1;
        this.S3 = 1;
        this.f102250b4 = 0;
        this.K3 = dVar;
        this.W3 = dVar.n();
        this.U3 = com.fasterxml.jackson.core.json.d.w(JsonParser.a.STRICT_DUPLICATE_DETECTION.n(i10) ? com.fasterxml.jackson.core.json.b.g(this) : null);
    }

    private void N4(int i10) throws IOException {
        try {
            if (i10 == 16) {
                this.f102255g4 = this.W3.h();
                this.f102250b4 = 16;
            } else {
                this.f102253e4 = this.W3.i();
                this.f102250b4 = 8;
            }
        } catch (NumberFormatException e10) {
            g4("Malformed numeric value '" + this.W3.l() + "'", e10);
        }
    }

    private void O4(int i10) throws IOException {
        String strL = this.W3.l();
        try {
            int i11 = this.f102257i4;
            char[] cArrW = this.W3.w();
            int iX = this.W3.x();
            boolean z10 = this.f102256h4;
            if (z10) {
                iX++;
            }
            if (i.c(cArrW, iX, i11, z10)) {
                this.f102252d4 = Long.parseLong(strL);
                this.f102250b4 = 2;
            } else {
                this.f102254f4 = new BigInteger(strL);
                this.f102250b4 = 4;
            }
        } catch (NumberFormatException e10) {
            g4("Malformed numeric value '" + strL + "'", e10);
        }
    }

    protected static int[] k5(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : Arrays.copyOf(iArr, iArr.length + i10);
    }

    protected final int C4() throws j {
        y3();
        return -1;
    }

    protected void D4() throws IOException {
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser E(JsonParser.a aVar) {
        this.f102189a |= aVar.o();
        if (aVar == JsonParser.a.STRICT_DUPLICATE_DETECTION && this.U3.y() == null) {
            this.U3 = this.U3.C(com.fasterxml.jackson.core.json.b.g(this));
        }
        return this;
    }

    public com.fasterxml.jackson.core.util.c E4() {
        com.fasterxml.jackson.core.util.c cVar = this.Z3;
        if (cVar == null) {
            this.Z3 = new com.fasterxml.jackson.core.util.c();
        } else {
            cVar.reset();
        }
        return this.Z3;
    }

    protected Object H4() {
        if (JsonParser.a.INCLUDE_SOURCE_IN_LOCATION.n(this.f102189a)) {
            return this.K3.p();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger I() throws IOException {
        int i10 = this.f102250b4;
        if ((i10 & 4) == 0) {
            if (i10 == 0) {
                J4(4);
            }
            if ((this.f102250b4 & 4) == 0) {
                V4();
            }
        }
        return this.f102254f4;
    }

    protected int I4() throws IOException {
        if (this.f102294g != n.VALUE_NUMBER_INT || this.f102257i4 > 9) {
            J4(1);
            if ((this.f102250b4 & 1) == 0) {
                X4();
            }
            return this.f102251c4;
        }
        int iJ = this.W3.j(this.f102256h4);
        this.f102251c4 = iJ;
        this.f102250b4 = 1;
        return iJ;
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public void J2(String str) {
        com.fasterxml.jackson.core.json.d dVarE = this.U3;
        n nVar = this.f102294g;
        if (nVar == n.START_OBJECT || nVar == n.START_ARRAY) {
            dVarE = dVarE.e();
        }
        try {
            dVarE.B(str);
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    protected void J4(int i10) throws IOException {
        n nVar = this.f102294g;
        if (nVar != n.VALUE_NUMBER_INT) {
            if (nVar == n.VALUE_NUMBER_FLOAT) {
                N4(i10);
                return;
            } else {
                G3("Current token (%s) not numeric, can not use numeric value accessors", nVar);
                return;
            }
        }
        int i11 = this.f102257i4;
        if (i11 <= 9) {
            this.f102251c4 = this.W3.j(this.f102256h4);
            this.f102250b4 = 1;
            return;
        }
        if (i11 > 18) {
            O4(i10);
            return;
        }
        long jK = this.W3.k(this.f102256h4);
        if (i11 == 10) {
            if (this.f102256h4) {
                if (jK >= g3.f12261h) {
                    this.f102251c4 = (int) jK;
                    this.f102250b4 = 1;
                    return;
                }
            } else if (jK <= g3.f12256c) {
                this.f102251c4 = (int) jK;
                this.f102250b4 = 1;
                return;
            }
        }
        this.f102252d4 = jK;
        this.f102250b4 = 2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int M0() throws IOException {
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
    public JsonParser N2(int i10, int i11) {
        int i12 = this.f102189a;
        int i13 = (i10 & i11) | ((~i11) & i12);
        int i14 = i12 ^ i13;
        if (i14 != 0) {
            this.f102189a = i13;
            o4(i13, i14);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long Q0() throws IOException {
        int i10 = this.f102250b4;
        if ((i10 & 2) == 0) {
            if (i10 == 0) {
                J4(2);
            }
            if ((this.f102250b4 & 2) == 0) {
                Y4();
            }
        }
        return this.f102252d4;
    }

    protected void Q4() throws IOException {
        this.W3.z();
        char[] cArr = this.X3;
        if (cArr != null) {
            this.X3 = null;
            this.K3.t(cArr);
        }
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public byte[] R(com.fasterxml.jackson.core.a aVar) throws IOException {
        if (this.f102249a4 == null) {
            if (this.f102294g != n.VALUE_STRING) {
                F3("Current token (" + this.f102294g + ") not VALUE_STRING, can not access as binary");
            }
            com.fasterxml.jackson.core.util.c cVarE4 = E4();
            w3(j1(), cVarE4, aVar);
            this.f102249a4 = cVarE4.q();
        }
        return this.f102249a4;
    }

    protected void R4(int i10, char c10) throws j {
        com.fasterxml.jackson.core.json.d dVarD1 = d1();
        F3(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i10), Character.valueOf(c10), dVarD1.q(), dVarD1.f(H4())));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.b T0() throws IOException {
        if (this.f102250b4 == 0) {
            J4(0);
        }
        if (this.f102294g != n.VALUE_NUMBER_INT) {
            return (this.f102250b4 & 16) != 0 ? JsonParser.b.BIG_DECIMAL : JsonParser.b.DOUBLE;
        }
        int i10 = this.f102250b4;
        if ((i10 & 1) != 0) {
            return JsonParser.b.INT;
        }
        return (i10 & 2) != 0 ? JsonParser.b.LONG : JsonParser.b.BIG_INTEGER;
    }

    protected void T4() throws IOException {
        int i10 = this.f102250b4;
        if ((i10 & 8) != 0) {
            this.f102255g4 = i.g(j1());
        } else if ((i10 & 4) != 0) {
            this.f102255g4 = new BigDecimal(this.f102254f4);
        } else if ((i10 & 2) != 0) {
            this.f102255g4 = BigDecimal.valueOf(this.f102252d4);
        } else if ((i10 & 1) != 0) {
            this.f102255g4 = BigDecimal.valueOf(this.f102251c4);
        } else {
            a4();
        }
        this.f102250b4 |= 16;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number U0() throws IOException {
        if (this.f102250b4 == 0) {
            J4(0);
        }
        if (this.f102294g == n.VALUE_NUMBER_INT) {
            int i10 = this.f102250b4;
            if ((i10 & 1) != 0) {
                return Integer.valueOf(this.f102251c4);
            }
            if ((i10 & 2) != 0) {
                return Long.valueOf(this.f102252d4);
            }
            return (i10 & 4) != 0 ? this.f102254f4 : this.f102255g4;
        }
        int i11 = this.f102250b4;
        if ((i11 & 16) != 0) {
            return this.f102255g4;
        }
        if ((i11 & 8) == 0) {
            a4();
        }
        return Double.valueOf(this.f102253e4);
    }

    protected void V4() throws IOException {
        int i10 = this.f102250b4;
        if ((i10 & 16) != 0) {
            this.f102254f4 = this.f102255g4.toBigInteger();
        } else if ((i10 & 2) != 0) {
            this.f102254f4 = BigInteger.valueOf(this.f102252d4);
        } else if ((i10 & 1) != 0) {
            this.f102254f4 = BigInteger.valueOf(this.f102251c4);
        } else if ((i10 & 8) != 0) {
            this.f102254f4 = BigDecimal.valueOf(this.f102253e4).toBigInteger();
        } else {
            a4();
        }
        this.f102250b4 |= 4;
    }

    protected void W4() throws IOException {
        int i10 = this.f102250b4;
        if ((i10 & 16) != 0) {
            this.f102253e4 = this.f102255g4.doubleValue();
        } else if ((i10 & 4) != 0) {
            this.f102253e4 = this.f102254f4.doubleValue();
        } else if ((i10 & 2) != 0) {
            this.f102253e4 = this.f102252d4;
        } else if ((i10 & 1) != 0) {
            this.f102253e4 = this.f102251c4;
        } else {
            a4();
        }
        this.f102250b4 |= 8;
    }

    protected void X4() throws IOException {
        int i10 = this.f102250b4;
        if ((i10 & 2) != 0) {
            long j10 = this.f102252d4;
            int i11 = (int) j10;
            if (i11 != j10) {
                F3("Numeric value (" + j1() + ") out of range of int");
            }
            this.f102251c4 = i11;
        } else if ((i10 & 4) != 0) {
            if (c.f102288v3.compareTo(this.f102254f4) > 0 || c.f102290w3.compareTo(this.f102254f4) < 0) {
                j4();
            }
            this.f102251c4 = this.f102254f4.intValue();
        } else if ((i10 & 8) != 0) {
            double d10 = this.f102253e4;
            if (d10 < -2.147483648E9d || d10 > 2.147483647E9d) {
                j4();
            }
            this.f102251c4 = (int) this.f102253e4;
        } else if ((i10 & 16) != 0) {
            if (c.B3.compareTo(this.f102255g4) > 0 || c.C3.compareTo(this.f102255g4) < 0) {
                j4();
            }
            this.f102251c4 = this.f102255g4.intValue();
        } else {
            a4();
        }
        this.f102250b4 |= 1;
    }

    protected void Y4() throws IOException {
        int i10 = this.f102250b4;
        if ((i10 & 1) != 0) {
            this.f102252d4 = this.f102251c4;
        } else if ((i10 & 4) != 0) {
            if (c.f102291x3.compareTo(this.f102254f4) > 0 || c.f102292y3.compareTo(this.f102254f4) < 0) {
                k4();
            }
            this.f102252d4 = this.f102254f4.longValue();
        } else if ((i10 & 8) != 0) {
            double d10 = this.f102253e4;
            if (d10 < -9.223372036854776E18d || d10 > 9.223372036854776E18d) {
                k4();
            }
            this.f102252d4 = (long) this.f102253e4;
        } else if ((i10 & 16) != 0) {
            if (c.f102293z3.compareTo(this.f102255g4) > 0 || c.A3.compareTo(this.f102255g4) < 0) {
                k4();
            }
            this.f102252d4 = this.f102255g4.longValue();
        } else {
            a4();
        }
        this.f102250b4 |= 2;
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Z4, reason: merged with bridge method [inline-methods] */
    public com.fasterxml.jackson.core.json.d d1() {
        return this.U3;
    }

    public long a5() {
        return this.R3;
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.L3) {
            return;
        }
        this.M3 = Math.max(this.M3, this.N3);
        this.L3 = true;
        try {
            r4();
            Q4();
        } catch (Throwable th2) {
            Q4();
            throw th2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.i d0() {
        int i10 = (this.M3 - this.Q3) + 1;
        return new com.fasterxml.jackson.core.i(H4(), -1L, ((long) this.M3) + this.O3, this.P3, i10);
    }

    public int e5() {
        int i10 = this.T3;
        return i10 < 0 ? i10 : i10 + 1;
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public String f0() throws IOException {
        com.fasterxml.jackson.core.json.d dVarE;
        n nVar = this.f102294g;
        return ((nVar == n.START_OBJECT || nVar == n.START_ARRAY) && (dVarE = this.U3.e()) != null) ? dVarE.b() : this.U3.b();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void f3(Object obj) {
        this.U3.p(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser h3(int i10) {
        int i11 = this.f102189a ^ i10;
        if (i11 != 0) {
            this.f102189a = i10;
            o4(i10, i11);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public boolean i2() {
        n nVar = this.f102294g;
        if (nVar == n.VALUE_STRING) {
            return true;
        }
        if (nVar == n.FIELD_NAME) {
            return this.Y3;
        }
        return false;
    }

    public int i5() {
        return this.S3;
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public boolean isClosed() {
        return this.L3;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object k0() {
        return this.U3.c();
    }

    @Deprecated
    protected boolean m5() throws IOException {
        return false;
    }

    @Deprecated
    protected void n5() throws IOException {
        if (!m5()) {
            I3();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal o0() throws IOException {
        int i10 = this.f102250b4;
        if ((i10 & 16) == 0) {
            if (i10 == 0) {
                J4(16);
            }
            if ((this.f102250b4 & 16) == 0) {
                T4();
            }
        }
        return this.f102255g4;
    }

    protected void o4(int i10, int i11) {
        int iO = JsonParser.a.STRICT_DUPLICATE_DETECTION.o();
        if ((i11 & iO) == 0 || (i10 & iO) == 0) {
            return;
        }
        if (this.U3.y() == null) {
            this.U3 = this.U3.C(com.fasterxml.jackson.core.json.b.g(this));
        } else {
            this.U3 = this.U3.C(null);
        }
    }

    protected IllegalArgumentException p5(com.fasterxml.jackson.core.a aVar, int i10, int i11) throws IllegalArgumentException {
        return r5(aVar, i10, i11, null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double r0() throws IOException {
        int i10 = this.f102250b4;
        if ((i10 & 8) == 0) {
            if (i10 == 0) {
                J4(8);
            }
            if ((this.f102250b4 & 8) == 0) {
                W4();
            }
        }
        return this.f102253e4;
    }

    protected abstract void r4() throws IOException;

    protected IllegalArgumentException r5(com.fasterxml.jackson.core.a aVar, int i10, int i11, String str) throws IllegalArgumentException {
        String str2;
        if (i10 <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i10), Integer.valueOf(i11 + 1));
        } else if (aVar.w(i10)) {
            str2 = "Unexpected padding character ('" + aVar.t() + "') as character #" + (i11 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i10) || Character.isISOControl(i10)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i10) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i10) + "' (code 0x" + Integer.toHexString(i10) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.i s1() {
        return new com.fasterxml.jackson.core.i(H4(), -1L, a5(), i5(), e5());
    }

    protected final int s4(com.fasterxml.jackson.core.a aVar, char c10, int i10) throws IOException {
        if (c10 != '\\') {
            throw p5(aVar, c10, i10);
        }
        char cW4 = w4();
        if (cW4 <= ' ' && i10 == 0) {
            return -1;
        }
        int iF = aVar.f(cW4);
        if (iF >= 0) {
            return iF;
        }
        throw p5(aVar, cW4, i10);
    }

    protected final n s5(boolean z10, int i10, int i11, int i12) {
        return (i11 >= 1 || i12 >= 1) ? v5(z10, i10, i11, i12) : x5(z10, i10);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean t2() {
        if (this.f102294g != n.VALUE_NUMBER_FLOAT || (this.f102250b4 & 8) == 0) {
            return false;
        }
        double d10 = this.f102253e4;
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return false;
        }
        return true;
    }

    protected final int t4(com.fasterxml.jackson.core.a aVar, int i10, int i11) throws IOException {
        if (i10 != 92) {
            throw p5(aVar, i10, i11);
        }
        char cW4 = w4();
        if (cW4 <= ' ' && i11 == 0) {
            return -1;
        }
        int iG = aVar.g(cW4);
        if (iG >= 0) {
            return iG;
        }
        throw p5(aVar, cW4, i11);
    }

    protected final n t5(String str, double d10) {
        this.W3.F(str);
        this.f102253e4 = d10;
        this.f102250b4 = 8;
        return n.VALUE_NUMBER_FLOAT;
    }

    protected final n v5(boolean z10, int i10, int i11, int i12) {
        this.f102256h4 = z10;
        this.f102257i4 = i10;
        this.f102258j4 = i11;
        this.f102259k4 = i12;
        this.f102250b4 = 0;
        return n.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.core.w
    public v version() {
        return f.f102565a;
    }

    protected char w4() throws IOException {
        throw new UnsupportedOperationException();
    }

    protected final n x5(boolean z10, int i10) {
        this.f102256h4 = z10;
        this.f102257i4 = i10;
        this.f102258j4 = 0;
        this.f102259k4 = 0;
        this.f102250b4 = 0;
        return n.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser y(JsonParser.a aVar) {
        this.f102189a &= ~aVar.o();
        if (aVar == JsonParser.a.STRICT_DUPLICATE_DETECTION) {
            this.U3 = this.U3.C(null);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float y0() throws IOException {
        return (float) r0();
    }

    @Override // com.fasterxml.jackson.core.base.c
    protected void y3() throws j {
        if (this.U3.m()) {
            return;
        }
        N3(String.format(": expected close marker for %s (start marker at %s)", this.U3.k() ? "Array" : "Object", this.U3.f(H4())), null);
    }
}
