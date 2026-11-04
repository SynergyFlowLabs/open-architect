package com.fasterxml.jackson.core;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonParser implements Closeable, w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f102185c = -128;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f102186d = 255;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f102187e = -32768;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f102188f = 32767;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f102189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected transient com.fasterxml.jackson.core.util.l f102190b;

    public enum a {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f102206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f102207b = 1 << ordinal();

        a(boolean z10) {
            this.f102206a = z10;
        }

        public static int k() {
            int iO = 0;
            for (a aVar : values()) {
                if (aVar.l()) {
                    iO |= aVar.o();
                }
            }
            return iO;
        }

        public boolean l() {
            return this.f102206a;
        }

        public boolean n(int i10) {
            return (this.f102207b & i10) != 0;
        }

        public int o() {
            return this.f102207b;
        }
    }

    public enum b {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    protected JsonParser() {
    }

    public int B0() {
        return 0;
    }

    public boolean B1(boolean z10) throws IOException {
        return z10;
    }

    public long B2(long j10) throws IOException {
        return E2() == n.VALUE_NUMBER_INT ? Q0() : j10;
    }

    public String D2() throws IOException {
        if (E2() == n.VALUE_STRING) {
            return j1();
        }
        return null;
    }

    public JsonParser E(a aVar) {
        this.f102189a = aVar.o() | this.f102189a;
        return this;
    }

    public double E1() throws IOException {
        return J1(0.0d);
    }

    public abstract n E2() throws IOException;

    public abstract n G2() throws IOException;

    public void H() throws IOException {
    }

    public Object H0() {
        return null;
    }

    public abstract BigInteger I() throws IOException;

    public double J1(double d10) throws IOException {
        return d10;
    }

    public abstract void J2(String str);

    public JsonParser L2(int i10, int i11) {
        throw new IllegalArgumentException("No FormatFeatures defined for parser of type " + getClass().getName());
    }

    public abstract int M0() throws IOException;

    public byte[] N() throws IOException {
        return R(com.fasterxml.jackson.core.b.a());
    }

    public JsonParser N2(int i10, int i11) {
        return h3((i10 & i11) | (this.f102189a & (~i11)));
    }

    public abstract n O0();

    public int O1() throws IOException {
        return T1(0);
    }

    public int O2(com.fasterxml.jackson.core.a aVar, OutputStream outputStream) throws IOException {
        g();
        return 0;
    }

    public abstract long Q0() throws IOException;

    public int Q2(OutputStream outputStream) throws IOException {
        return O2(com.fasterxml.jackson.core.b.a(), outputStream);
    }

    public abstract byte[] R(com.fasterxml.jackson.core.a aVar) throws IOException;

    public w5.c R0() {
        return null;
    }

    public <T> T R2(com.fasterxml.jackson.core.type.b<?> bVar) throws IOException {
        return (T) e().i(this, bVar);
    }

    public boolean T() throws IOException {
        n nVarT = t();
        if (nVarT == n.VALUE_TRUE) {
            return true;
        }
        if (nVarT == n.VALUE_FALSE) {
            return false;
        }
        throw new j(this, String.format("Current token (%s) not of boolean type", nVarT)).j(this.f102190b);
    }

    public abstract b T0() throws IOException;

    public int T1(int i10) throws IOException {
        return i10;
    }

    public <T> T T2(Class<T> cls) throws IOException {
        return (T) e().j(this, cls);
    }

    public abstract Number U0() throws IOException;

    public <T extends u> T U2() throws IOException {
        return (T) e().c(this);
    }

    public <T> Iterator<T> W2(com.fasterxml.jackson.core.type.b<?> bVar) throws IOException {
        return e().l(this, bVar);
    }

    public byte X() throws IOException {
        int iM0 = M0();
        if (iM0 >= f102185c && iM0 <= 255) {
            return (byte) iM0;
        }
        throw f("Numeric value (" + j1() + ") out of range of Java byte");
    }

    public <T> Iterator<T> X2(Class<T> cls) throws IOException {
        return e().m(this, cls);
    }

    public abstract q Y();

    public int Y2(OutputStream outputStream) throws IOException {
        return -1;
    }

    public int Z2(Writer writer) throws IOException {
        return -1;
    }

    public boolean a3() {
        return false;
    }

    public Object b1() throws IOException {
        return null;
    }

    public long b2() throws IOException {
        return c2(0L);
    }

    public long c2(long j10) throws IOException {
        return j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public abstract i d0();

    public abstract m d1();

    public String d2() throws IOException {
        return e2(null);
    }

    protected q e() {
        q qVarY = Y();
        if (qVarY != null) {
            return qVarY;
        }
        throw new IllegalStateException("No ObjectCodec defined for parser, needed for deserialization");
    }

    public d e1() {
        return null;
    }

    public abstract String e2(String str) throws IOException;

    public abstract void e3(q qVar);

    protected j f(String str) {
        return new j(this, str).j(this.f102190b);
    }

    public abstract String f0() throws IOException;

    public abstract boolean f2();

    public void f3(Object obj) {
        m mVarD1 = d1();
        if (mVarD1 != null) {
            mVarD1.p(obj);
        }
    }

    protected void g() {
        throw new UnsupportedOperationException("Operation not supported by parser of type " + getClass().getName());
    }

    public abstract n g0();

    public short g1() throws IOException {
        int iM0 = M0();
        if (iM0 >= f102187e && iM0 <= 32767) {
            return (short) iM0;
        }
        throw f("Numeric value (" + j1() + ") out of range of Java short");
    }

    public boolean h() {
        return false;
    }

    public int h1(Writer writer) throws UnsupportedOperationException, IOException {
        String strJ1 = j1();
        if (strJ1 == null) {
            return 0;
        }
        writer.write(strJ1);
        return strJ1.length();
    }

    @Deprecated
    public JsonParser h3(int i10) {
        this.f102189a = i10;
        return this;
    }

    public abstract boolean i2();

    public abstract boolean isClosed();

    public boolean j() {
        return false;
    }

    public abstract int j0();

    public abstract String j1() throws IOException;

    public Object k0() {
        m mVarD1 = d1();
        if (mVarD1 == null) {
            return null;
        }
        return mVarD1.c();
    }

    public void k3(com.fasterxml.jackson.core.util.l lVar) {
        this.f102190b = lVar;
    }

    public boolean l() {
        return false;
    }

    public abstract char[] l1() throws IOException;

    public void l3(String str) {
        this.f102190b = str == null ? null : new com.fasterxml.jackson.core.util.l(str);
    }

    public boolean m(d dVar) {
        return false;
    }

    public abstract boolean n2(n nVar);

    public void n3(byte[] bArr, String str) {
        this.f102190b = bArr == null ? null : new com.fasterxml.jackson.core.util.l(bArr, str);
    }

    public abstract void o();

    public abstract BigDecimal o0() throws IOException;

    public abstract int o1() throws IOException;

    public abstract boolean o2(int i10);

    public void o3(d dVar) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + dVar.a() + "'");
    }

    public abstract int p1() throws IOException;

    public boolean p2(a aVar) {
        return aVar.n(this.f102189a);
    }

    public JsonParser q(a aVar, boolean z10) {
        if (z10) {
            E(aVar);
            return this;
        }
        y(aVar);
        return this;
    }

    public boolean q2() {
        return t() == n.START_ARRAY;
    }

    public String r() throws IOException {
        return f0();
    }

    public abstract double r0() throws IOException;

    public abstract JsonParser r3() throws IOException;

    public abstract i s1();

    public boolean s2() {
        return t() == n.START_OBJECT;
    }

    public n t() {
        return g0();
    }

    public boolean t2() throws IOException {
        return false;
    }

    public Object u1() throws IOException {
        return null;
    }

    public Boolean u2() throws IOException {
        n nVarE2 = E2();
        if (nVarE2 == n.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (nVarE2 == n.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.w
    public abstract v version();

    public Object w0() throws IOException {
        return null;
    }

    public boolean w1() throws IOException {
        return B1(false);
    }

    public String w2() throws IOException {
        if (E2() == n.FIELD_NAME) {
            return f0();
        }
        return null;
    }

    public int x() {
        return j0();
    }

    public int x0() {
        return this.f102189a;
    }

    public JsonParser y(a aVar) {
        this.f102189a = (~aVar.o()) & this.f102189a;
        return this;
    }

    public abstract float y0() throws IOException;

    public boolean y2(s sVar) throws IOException {
        return E2() == n.FIELD_NAME && sVar.getValue().equals(f0());
    }

    public int z2(int i10) throws IOException {
        return E2() == n.VALUE_NUMBER_INT ? M0() : i10;
    }

    protected JsonParser(int i10) {
        this.f102189a = i10;
    }
}
