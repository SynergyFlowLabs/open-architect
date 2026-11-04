package com.fasterxml.jackson.core;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements Closeable, Flushable, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected r f102376a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f102377a;

        static {
            int[] iArr = new int[com.fasterxml.jackson.core.type.c.a.values().length];
            f102377a = iArr;
            try {
                iArr[com.fasterxml.jackson.core.type.c.a.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102377a[com.fasterxml.jackson.core.type.c.a.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102377a[com.fasterxml.jackson.core.type.c.a.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f102377a[com.fasterxml.jackson.core.type.c.a.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f102377a[com.fasterxml.jackson.core.type.c.a.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        ESCAPE_NON_ASCII(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f102389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f102390b = 1 << ordinal();

        b(boolean z10) {
            this.f102389a = z10;
        }

        public static int k() {
            int iO = 0;
            for (b bVar : values()) {
                if (bVar.l()) {
                    iO |= bVar.o();
                }
            }
            return iO;
        }

        public boolean l() {
            return this.f102389a;
        }

        public boolean n(int i10) {
            return (this.f102390b & i10) != 0;
        }

        public int o() {
            return this.f102390b;
        }
    }

    protected h() {
    }

    public h B0(r rVar) {
        this.f102376a = rVar;
        return this;
    }

    public abstract void B1(s sVar) throws IOException;

    public void B2(String str) throws IOException {
    }

    public abstract void D2(char c10) throws IOException;

    public abstract q E();

    public abstract void E1(String str) throws IOException;

    public void E2(s sVar) throws IOException {
        G2(sVar.getValue());
    }

    public abstract void G2(String str) throws IOException;

    public Object H() {
        m mVarX = X();
        if (mVarX == null) {
            return null;
        }
        return mVarX.c();
    }

    public h H0(s sVar) {
        throw new UnsupportedOperationException();
    }

    public abstract int I();

    public abstract void J1() throws IOException;

    public abstract void J2(String str, int i10, int i11) throws IOException;

    public abstract void L2(char[] cArr, int i10, int i11) throws IOException;

    public void M0(d dVar) {
        throw new UnsupportedOperationException("Generator of type " + getClass().getName() + " does not support schema of type '" + dVar.a() + "'");
    }

    public int N() {
        return 0;
    }

    public abstract void N2(byte[] bArr, int i10, int i11) throws IOException;

    public abstract h O0();

    public final void O1(String str) throws IOException {
        E1(str);
        J1();
    }

    public void O2(s sVar) throws IOException {
        Q2(sVar.getValue());
    }

    public void Q0(double[] dArr, int i10, int i11) throws IOException {
        if (dArr == null) {
            throw new IllegalArgumentException("null array");
        }
        d(dArr.length, i10, i11);
        U2();
        int i12 = i11 + i10;
        while (i10 < i12) {
            T1(dArr[i10]);
            i10++;
        }
        s1();
    }

    public abstract void Q2(String str) throws IOException;

    public int R() {
        return 0;
    }

    public void R0(int[] iArr, int i10, int i11) throws IOException {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        d(iArr.length, i10, i11);
        U2();
        int i12 = i11 + i10;
        while (i10 < i12) {
            c2(iArr[i10]);
            i10++;
        }
        s1();
    }

    public abstract void R2(String str, int i10, int i11) throws IOException;

    public int T() {
        return -1;
    }

    public void T0(long[] jArr, int i10, int i11) throws IOException {
        if (jArr == null) {
            throw new IllegalArgumentException("null array");
        }
        d(jArr.length, i10, i11);
        U2();
        int i12 = i11 + i10;
        while (i10 < i12) {
            d2(jArr[i10]);
            i10++;
        }
        s1();
    }

    public abstract void T1(double d10) throws IOException;

    public abstract void T2(char[] cArr, int i10, int i11) throws IOException;

    public final void U0(String str) throws IOException {
        E1(str);
        U2();
    }

    public abstract void U2() throws IOException;

    public void W2(int i10) throws IOException {
        U2();
    }

    public abstract m X();

    public abstract void X2() throws IOException;

    public Object Y() {
        return null;
    }

    public void Y2(Object obj) throws IOException {
        X2();
        w0(obj);
    }

    public abstract void Z2(s sVar) throws IOException;

    protected void a(String str) throws g {
        throw new g(str, this);
    }

    public void a3(Reader reader, int i10) throws IOException {
        b();
    }

    protected void b() {
        throw new UnsupportedOperationException("Operation not supported by generator of type " + getClass().getName());
    }

    public abstract int b1(com.fasterxml.jackson.core.a aVar, InputStream inputStream, int i10) throws IOException;

    public abstract void b2(float f10) throws IOException;

    protected final void c() {
        com.fasterxml.jackson.core.util.p.f();
    }

    public abstract void c2(int i10) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    protected final void d(int i10, int i11, int i12) {
        if (i11 < 0 || i11 + i12 > i10) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i10)));
        }
    }

    public r d0() {
        return this.f102376a;
    }

    public int d1(InputStream inputStream, int i10) throws IOException {
        return b1(com.fasterxml.jackson.core.b.a(), inputStream, i10);
    }

    public abstract void d2(long j10) throws IOException;

    protected void e(Object obj) throws IOException {
        if (obj == null) {
            J1();
            return;
        }
        if (obj instanceof String) {
            e3((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                c2(number.intValue());
                return;
            }
            if (number instanceof Long) {
                d2(number.longValue());
                return;
            }
            if (number instanceof Double) {
                T1(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                b2(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                n2(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                n2(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                i2((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                f2((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                c2(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                d2(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            g1((byte[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            l1(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            l1(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }

    public abstract void e1(com.fasterxml.jackson.core.a aVar, byte[] bArr, int i10, int i11) throws IOException;

    public abstract void e2(String str) throws IOException;

    public abstract void e3(String str) throws IOException;

    public boolean f() {
        return true;
    }

    public d f0() {
        return null;
    }

    public abstract void f2(BigDecimal bigDecimal) throws IOException;

    public abstract void f3(char[] cArr, int i10, int i11) throws IOException;

    public abstract void flush() throws IOException;

    public boolean g(d dVar) {
        return false;
    }

    public abstract boolean g0(b bVar);

    public void g1(byte[] bArr) throws IOException {
        e1(com.fasterxml.jackson.core.b.a(), bArr, 0, bArr.length);
    }

    public boolean h() {
        return false;
    }

    public void h1(byte[] bArr, int i10, int i11) throws IOException {
        e1(com.fasterxml.jackson.core.b.a(), bArr, i10, i11);
    }

    public void h3(String str, String str2) throws IOException {
        E1(str);
        e3(str2);
    }

    public abstract void i2(BigInteger bigInteger) throws IOException;

    public abstract boolean isClosed();

    public boolean j() {
        return false;
    }

    public h j0(int i10, int i11) {
        throw new IllegalArgumentException("No FormatFeatures defined for generator of type " + getClass().getName());
    }

    public final void j1(String str, byte[] bArr) throws IOException {
        E1(str);
        g1(bArr);
    }

    public h k0(int i10, int i11) {
        return x0((i10 & i11) | (I() & (~i11)));
    }

    public abstract void k3(u uVar) throws IOException;

    public boolean l() {
        return false;
    }

    public abstract void l1(boolean z10) throws IOException;

    public void l3(Object obj) throws IOException {
        throw new g("No native support for writing Type Ids", this);
    }

    public boolean m() {
        return false;
    }

    public void n2(short s10) throws IOException {
        c2(s10);
    }

    public com.fasterxml.jackson.core.type.c n3(com.fasterxml.jackson.core.type.c cVar) throws IOException {
        Object obj = cVar.f102761c;
        n nVar = cVar.f102764f;
        if (m()) {
            cVar.f102765g = false;
            l3(obj);
        } else {
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            cVar.f102765g = true;
            com.fasterxml.jackson.core.type.c.a aVar = cVar.f102763e;
            if (nVar != n.START_OBJECT && aVar.k()) {
                aVar = com.fasterxml.jackson.core.type.c.a.WRAPPER_ARRAY;
                cVar.f102763e = aVar;
            }
            int i10 = a.f102377a[aVar.ordinal()];
            if (i10 != 1 && i10 != 2) {
                int i11 = 2 & 3;
                if (i10 == 3) {
                    Y2(cVar.f102759a);
                    h3(cVar.f102762d, strValueOf);
                    return cVar;
                }
                if (i10 != 4) {
                    U2();
                    e3(strValueOf);
                } else {
                    X2();
                    E1(strValueOf);
                }
            }
        }
        if (nVar == n.START_OBJECT) {
            Y2(cVar.f102759a);
            return cVar;
        }
        if (nVar == n.START_ARRAY) {
            U2();
        }
        return cVar;
    }

    public final h o(b bVar, boolean z10) {
        if (z10) {
            x(bVar);
            return this;
        }
        t(bVar);
        return this;
    }

    public h o0(com.fasterxml.jackson.core.io.b bVar) {
        return this;
    }

    public final void o1(String str, boolean z10) throws IOException {
        E1(str);
        l1(z10);
    }

    public final void o2(String str, double d10) throws IOException {
        E1(str);
        T1(d10);
    }

    public com.fasterxml.jackson.core.type.c o3(com.fasterxml.jackson.core.type.c cVar) throws IOException {
        n nVar = cVar.f102764f;
        if (nVar == n.START_OBJECT) {
            u1();
        } else if (nVar == n.START_ARRAY) {
            s1();
        }
        if (cVar.f102765g) {
            int i10 = a.f102377a[cVar.f102763e.ordinal()];
            if (i10 == 1) {
                Object obj = cVar.f102761c;
                h3(cVar.f102762d, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (i10 != 2 && i10 != 3) {
                if (i10 != 5) {
                    u1();
                    return cVar;
                }
                s1();
                return cVar;
            }
        }
        return cVar;
    }

    public void p1(Object obj) throws IOException {
        if (obj == null) {
            J1();
        } else {
            if (obj instanceof byte[]) {
                g1((byte[]) obj);
                return;
            }
            throw new g("No native support for writing embedded objects of type " + obj.getClass().getName(), this);
        }
    }

    public final void p2(String str, float f10) throws IOException {
        E1(str);
        b2(f10);
    }

    public void q(JsonParser jsonParser) throws IOException {
        n nVarT = jsonParser.t();
        if (nVarT == null) {
            a("No current event to copy");
        }
        switch (nVarT.o()) {
            case -1:
                a("No current event to copy");
                break;
            case 0:
            default:
                c();
                break;
            case 1:
                X2();
                break;
            case 2:
                u1();
                break;
            case 3:
                U2();
                break;
            case 4:
                s1();
                break;
            case 5:
                E1(jsonParser.f0());
                break;
            case 6:
                if (!jsonParser.i2()) {
                    e3(jsonParser.j1());
                } else {
                    f3(jsonParser.l1(), jsonParser.p1(), jsonParser.o1());
                }
                break;
            case 7:
                JsonParser.b bVarT0 = jsonParser.T0();
                if (bVarT0 == JsonParser.b.INT) {
                    c2(jsonParser.M0());
                } else if (bVarT0 != JsonParser.b.BIG_INTEGER) {
                    d2(jsonParser.Q0());
                } else {
                    i2(jsonParser.I());
                }
                break;
            case 8:
                JsonParser.b bVarT1 = jsonParser.T0();
                if (bVarT1 == JsonParser.b.BIG_DECIMAL) {
                    f2(jsonParser.o0());
                } else if (bVarT1 != JsonParser.b.FLOAT) {
                    T1(jsonParser.r0());
                } else {
                    b2(jsonParser.y0());
                }
                break;
            case 9:
                l1(true);
                break;
            case 10:
                l1(false);
                break;
            case 11:
                J1();
                break;
            case 12:
                writeObject(jsonParser.w0());
                break;
        }
    }

    public final void q2(String str, int i10) throws IOException {
        E1(str);
        c2(i10);
    }

    public void r(JsonParser jsonParser) throws IOException {
        n nVarT = jsonParser.t();
        if (nVarT == null) {
            a("No current event to copy");
        }
        int iO = nVarT.o();
        if (iO == 5) {
            E1(jsonParser.f0());
            iO = jsonParser.E2().o();
        }
        if (iO == 1) {
            X2();
            while (jsonParser.E2() != n.END_OBJECT) {
                r(jsonParser);
            }
            u1();
            return;
        }
        if (iO != 3) {
            q(jsonParser);
            return;
        }
        U2();
        while (jsonParser.E2() != n.END_ARRAY) {
            r(jsonParser);
        }
        s1();
    }

    public abstract h r0(q qVar);

    public abstract void r3(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void s1() throws IOException;

    public final void s2(String str, long j10) throws IOException {
        E1(str);
        d2(j10);
    }

    public abstract h t(b bVar);

    public final void t2(String str, BigDecimal bigDecimal) throws IOException {
        E1(str);
        f2(bigDecimal);
    }

    public abstract void u1() throws IOException;

    public final void u2(String str, Object obj) throws IOException {
        E1(str);
        writeObject(obj);
    }

    public abstract v version();

    public void w0(Object obj) {
        m mVarX = X();
        if (mVarX != null) {
            mVarX.p(obj);
        }
    }

    public void w1(long j10) throws IOException {
        E1(Long.toString(j10));
    }

    public final void w2(String str) throws IOException {
        E1(str);
        X2();
    }

    public abstract void writeObject(Object obj) throws IOException;

    public abstract h x(b bVar);

    @Deprecated
    public abstract h x0(int i10);

    public com.fasterxml.jackson.core.io.b y() {
        return null;
    }

    public h y0(int i10) {
        return this;
    }

    public void y2(Object obj) throws IOException {
        throw new g("No native support for writing Object Ids", this);
    }

    public void z2(Object obj) throws IOException {
        throw new g("No native support for writing Object Ids", this);
    }
}
