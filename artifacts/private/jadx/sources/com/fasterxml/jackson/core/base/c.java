package com.fasterxml.jackson.core.base;

import com.facebook.internal.z0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.f;
import com.fasterxml.jackson.core.io.i;
import com.fasterxml.jackson.core.j;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.util.p;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends JsonParser {
    protected static final BigDecimal A3;
    protected static final BigDecimal B3;
    protected static final BigDecimal C3;
    protected static final long D3 = -2147483648L;
    protected static final long E3 = 2147483647L;
    protected static final double F3 = -9.223372036854776E18d;
    protected static final double G3 = 9.223372036854776E18d;
    protected static final int H1 = 48;
    protected static final double H3 = -2.147483648E9d;
    protected static final double I3 = 2.147483647E9d;
    protected static final int J3 = 256;
    protected static final int X = 47;
    protected static final int Y = 42;
    protected static final int Z = 58;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    protected static final int f102260g3 = 45;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    protected static final int f102261h3 = 43;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final int f102262i = 9;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    protected static final int f102263i3 = 46;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final int f102264j = 10;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    protected static final int f102265j3 = 101;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final int f102266k = 13;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    protected static final int f102267k3 = 69;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final int f102268l = 32;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    protected static final char f102269l3 = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final int f102270m = 91;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final int f102272n = 93;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static final int f102274o = 123;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    protected static final int f102275o3 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    protected static final int f102276p0 = 44;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    protected static final int f102277p1 = 35;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    protected static final int f102278p2 = 57;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    protected static final int f102279p3 = 1;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    protected static final int f102280q3 = 2;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    protected static final int f102281r3 = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final int f102282s = 125;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    protected static final int f102283s3 = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final int f102284t = 34;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    protected static final int f102285t3 = 16;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    protected static final int f102286u3 = 32;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected static final int f102287v = 39;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    protected static final BigInteger f102288v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final int f102289w = 92;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    protected static final BigInteger f102290w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    protected static final BigInteger f102291x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    protected static final BigInteger f102292y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    protected static final BigDecimal f102293z3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected n f102294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected n f102295h;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    protected static final byte[] f102271m3 = new byte[0];

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    protected static final int[] f102273n3 = new int[0];

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        f102288v3 = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        f102290w3 = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        f102291x3 = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        f102292y3 = bigIntegerValueOf4;
        f102293z3 = new BigDecimal(bigIntegerValueOf3);
        A3 = new BigDecimal(bigIntegerValueOf4);
        B3 = new BigDecimal(bigIntegerValueOf);
        C3 = new BigDecimal(bigIntegerValueOf2);
    }

    protected c() {
    }

    protected static String s3(byte[] bArr) {
        try {
            return new String(bArr, "US-ASCII");
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    protected static byte[] t3(String str) {
        byte[] bArr = new byte[str.length()];
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    protected static final String x3(int i10) {
        char c10 = (char) i10;
        if (Character.isISOControl(c10)) {
            return "(CTRL-CHAR, code " + i10 + ")";
        }
        if (i10 <= 255) {
            return "'" + c10 + "' (code " + i10 + ")";
        }
        return "'" + c10 + "' (code " + i10 + " / 0x" + Integer.toHexString(i10) + ")";
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean B1(boolean z10) throws IOException {
        n nVar = this.f102294g;
        if (nVar != null) {
            switch (nVar.o()) {
                case 6:
                    String strTrim = j1().trim();
                    if (z0.P.equals(strTrim)) {
                        return true;
                    }
                    if ("false".equals(strTrim) || D3(strTrim)) {
                        return false;
                    }
                    break;
                case 7:
                    return M0() != 0;
                case 8:
                default:
                    break;
                case 9:
                    return true;
                case 10:
                case 11:
                    return false;
                case 12:
                    Object objW0 = w0();
                    if (objW0 instanceof Boolean) {
                        return ((Boolean) objW0).booleanValue();
                    }
                    break;
            }
        }
        return z10;
    }

    protected char C3(char c10) throws l {
        if (p2(JsonParser.a.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER) || (c10 == '\'' && p2(JsonParser.a.ALLOW_SINGLE_QUOTES))) {
            return c10;
        }
        F3("Unrecognized character escape " + x3(c10));
        return c10;
    }

    protected boolean D3(String str) {
        return AbstractJsonLexerKt.NULL.equals(str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract n E2() throws IOException;

    protected final void F3(String str) throws j {
        throw f(str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public n G2() throws IOException {
        n nVarE2 = E2();
        return nVarE2 == n.FIELD_NAME ? E2() : nVarE2;
    }

    protected final void G3(String str, Object obj) throws j {
        throw f(String.format(str, obj));
    }

    protected final void H3(String str, Object obj, Object obj2) throws j {
        throw f(String.format(str, obj, obj2));
    }

    protected void I3() throws j {
        N3(" in " + this.f102294g, this.f102294g);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double J1(double d10) throws IOException {
        n nVar = this.f102294g;
        if (nVar != null) {
            switch (nVar.o()) {
                case 6:
                    String strJ1 = j1();
                    if (D3(strJ1)) {
                        return 0.0d;
                    }
                    return i.d(strJ1, d10);
                case 7:
                case 8:
                    return r0();
                case 9:
                    return 1.0d;
                case 10:
                case 11:
                    return 0.0d;
                case 12:
                    Object objW0 = w0();
                    if (objW0 instanceof Number) {
                        return ((Number) objW0).doubleValue();
                    }
                default:
                    return d10;
            }
        }
        return d10;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract void J2(String str);

    @Deprecated
    protected void M3(String str) throws j {
        throw new f(this, null, "Unexpected end-of-input" + str);
    }

    protected void N3(String str, n nVar) throws j {
        throw new f(this, nVar, "Unexpected end-of-input" + str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public n O0() {
        return this.f102295h;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int O1() throws IOException {
        n nVar = this.f102294g;
        return (nVar == n.VALUE_NUMBER_INT || nVar == n.VALUE_NUMBER_FLOAT) ? M0() : T1(0);
    }

    @Deprecated
    protected void P3() throws j {
        M3(" in a value");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract byte[] R(com.fasterxml.jackson.core.a aVar) throws IOException;

    protected void S3(n nVar) throws j {
        String str;
        if (nVar == n.VALUE_STRING) {
            str = " in a String value";
        } else {
            str = (nVar == n.VALUE_NUMBER_INT || nVar == n.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value";
        }
        N3(str, nVar);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int T1(int i10) throws IOException {
        n nVar = this.f102294g;
        if (nVar == n.VALUE_NUMBER_INT || nVar == n.VALUE_NUMBER_FLOAT) {
            return M0();
        }
        if (nVar != null) {
            int iO = nVar.o();
            int i11 = 6 >> 6;
            if (iO == 6) {
                String strJ1 = j1();
                if (D3(strJ1)) {
                    return 0;
                }
                return i.e(strJ1, i10);
            }
            switch (iO) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object objW0 = w0();
                    if (objW0 instanceof Number) {
                        return ((Number) objW0).intValue();
                    }
                default:
                    return i10;
            }
        }
        return i10;
    }

    protected void T3(int i10) throws j {
        V3(i10, "Expected space separating root-level values");
    }

    protected void V3(int i10, String str) throws j {
        if (i10 < 0) {
            I3();
        }
        String str2 = String.format("Unexpected character (%s)", x3(i10));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        F3(str2);
    }

    protected final void a4() {
        p.f();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long b2() throws IOException {
        n nVar = this.f102294g;
        return (nVar == n.VALUE_NUMBER_INT || nVar == n.VALUE_NUMBER_FLOAT) ? Q0() : c2(0L);
    }

    protected void b4(int i10) throws j {
        F3("Illegal character (" + x3((char) i10) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long c2(long j10) throws IOException {
        n nVar = this.f102294g;
        if (nVar == n.VALUE_NUMBER_INT || nVar == n.VALUE_NUMBER_FLOAT) {
            return Q0();
        }
        if (nVar != null) {
            int iO = nVar.o();
            if (iO == 6) {
                String strJ1 = j1();
                if (D3(strJ1)) {
                    return 0L;
                }
                return i.f(strJ1, j10);
            }
            switch (iO) {
                case 9:
                    return 1L;
                case 10:
                case 11:
                    return 0L;
                case 12:
                    Object objW0 = w0();
                    if (objW0 instanceof Number) {
                        return ((Number) objW0).longValue();
                    }
                    break;
                default:
                    break;
            }
        }
        return j10;
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract m d1();

    @Override // com.fasterxml.jackson.core.JsonParser
    public String d2() throws IOException {
        n nVar = this.f102294g;
        if (nVar == n.VALUE_STRING) {
            return j1();
        }
        return nVar == n.FIELD_NAME ? f0() : e2(null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String e2(String str) throws IOException {
        n nVar = this.f102294g;
        if (nVar == n.VALUE_STRING) {
            return j1();
        }
        if (nVar == n.FIELD_NAME) {
            return f0();
        }
        return (nVar == null || nVar == n.VALUE_NULL || !nVar.r()) ? str : j1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String f0() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean f2() {
        return this.f102294g != null;
    }

    protected void f4(int i10, String str) throws j {
        if (!p2(JsonParser.a.ALLOW_UNQUOTED_CONTROL_CHARS) || i10 > 32) {
            F3("Illegal unquoted character (" + x3((char) i10) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public n g0() {
        return this.f102294g;
    }

    protected final void g4(String str, Throwable th2) throws j {
        throw v3(str, th2);
    }

    protected void h4(String str) throws j {
        F3("Invalid numeric value: " + str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract boolean i2();

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract boolean isClosed();

    @Override // com.fasterxml.jackson.core.JsonParser
    public int j0() {
        n nVar = this.f102294g;
        if (nVar == null) {
            return 0;
        }
        return nVar.o();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String j1() throws IOException;

    protected void j4() throws IOException {
        F3(String.format("Numeric value (%s) out of range of int (%d - %s)", j1(), Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    protected void k4() throws IOException {
        F3(String.format("Numeric value (%s) out of range of long (%d - %s)", j1(), Long.MIN_VALUE, Long.MAX_VALUE));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract char[] l1() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean n2(n nVar) {
        return this.f102294g == nVar;
    }

    protected void n4(int i10, String str) throws j {
        String str2 = String.format("Unexpected character (%s) in numeric value", x3(i10));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        F3(str2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void o() {
        n nVar = this.f102294g;
        if (nVar != null) {
            this.f102295h = nVar;
            this.f102294g = null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract int o1() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean o2(int i10) {
        n nVar = this.f102294g;
        if (nVar == null) {
            return i10 == 0;
        }
        return nVar.o() == i10;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract int p1() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean q2() {
        return this.f102294g == n.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser r3() throws IOException {
        n nVar = this.f102294g;
        if (nVar == n.START_OBJECT || nVar == n.START_ARRAY) {
            int i10 = 1;
            while (true) {
                n nVarE2 = E2();
                if (nVarE2 == null) {
                    y3();
                    return this;
                }
                if (nVarE2.t()) {
                    i10++;
                } else if (nVarE2.s()) {
                    i10--;
                    if (i10 == 0) {
                    }
                } else if (nVarE2 == n.NOT_AVAILABLE) {
                    G3("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
                }
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean s2() {
        return this.f102294g == n.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public n t() {
        return this.f102294g;
    }

    protected final j v3(String str, Throwable th2) {
        return new j(this, str, th2);
    }

    protected void w3(String str, com.fasterxml.jackson.core.util.c cVar, com.fasterxml.jackson.core.a aVar) throws IOException {
        try {
            aVar.c(str, cVar);
        } catch (IllegalArgumentException e10) {
            F3(e10.getMessage());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int x() {
        n nVar = this.f102294g;
        if (nVar == null) {
            return 0;
        }
        return nVar.o();
    }

    protected abstract void y3() throws j;

    protected c(int i10) {
        super(i10);
    }
}
