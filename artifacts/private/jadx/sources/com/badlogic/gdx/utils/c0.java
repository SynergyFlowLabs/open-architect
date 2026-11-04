package com.badlogic.gdx.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class c0 implements Iterable<c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f95229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f95231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f95232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f95233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c0 f95234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c0 f95235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c0 f95236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f95237i;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f95238a;

        static {
            int[] iArr = new int[d.values().length];
            f95238a = iArr;
            try {
                iArr[d.stringValue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95238a[d.doubleValue.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95238a[d.longValue.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95238a[d.booleanValue.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f95238a[d.nullValue.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public class b implements Iterator<c0>, Iterable<c0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c0 f95239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c0 f95240b;

        public b() {
            this.f95239a = c0.this.f95234f;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c0 next() {
            c0 c0Var = this.f95239a;
            this.f95240b = c0Var;
            if (c0Var == null) {
                throw new NoSuchElementException();
            }
            this.f95239a = c0Var.f95235g;
            return c0Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f95239a != null;
        }

        @Override // java.lang.Iterable
        public Iterator<c0> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            c0 c0Var = this.f95240b;
            c0 c0Var2 = c0Var.f95236h;
            if (c0Var2 == null) {
                c0 c0Var3 = c0.this;
                c0 c0Var4 = c0Var.f95235g;
                c0Var3.f95234f = c0Var4;
                if (c0Var4 != null) {
                    c0Var4.f95236h = null;
                }
            } else {
                c0Var2.f95235g = c0Var.f95235g;
                c0 c0Var5 = c0Var.f95235g;
                if (c0Var5 != null) {
                    c0Var5.f95236h = c0Var2;
                }
            }
            c0.this.f95237i--;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d0.c f95242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f95243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f95244c;
    }

    public enum d {
        object,
        array,
        stringValue,
        doubleValue,
        longValue,
        booleanValue,
        nullValue
    }

    public c0(d dVar) {
        this.f95229a = dVar;
    }

    private static boolean E0(c0 c0Var) {
        for (c0 c0Var2 = c0Var.f95234f; c0Var2 != null; c0Var2 = c0Var2.f95235g) {
            if (!c0Var2.D0()) {
                return false;
            }
        }
        return true;
    }

    private void O0(c0 c0Var, f1 f1Var, int i10, c cVar) {
        d0.c cVar2 = cVar.f95242a;
        if (c0Var.F0()) {
            if (c0Var.f95234f == null) {
                f1Var.o("{}");
                return;
            }
            boolean z10 = !z0(c0Var);
            int length = f1Var.length();
            loop0: while (true) {
                f1Var.o(z10 ? "{\n" : "{ ");
                c0 c0Var2 = c0Var.f95234f;
                while (true) {
                    if (c0Var2 == null) {
                        break loop0;
                    }
                    if (z10) {
                        s0(i10, f1Var);
                    }
                    f1Var.o(cVar2.l(c0Var2.f95233e));
                    f1Var.o(": ");
                    O0(c0Var2, f1Var, i10 + 1, cVar);
                    if ((!z10 || cVar2 != d0.c.minimal) && c0Var2.f95235g != null) {
                        f1Var.append(AbstractJsonLexerKt.COMMA);
                    }
                    f1Var.append(z10 ? '\n' : ' ');
                    if (z10 || f1Var.length() - length <= cVar.f95243b) {
                        c0Var2 = c0Var2.f95235g;
                    }
                }
                f1Var.o0(length);
                z10 = true;
            }
            if (z10) {
                s0(i10 - 1, f1Var);
            }
            f1Var.append(AbstractJsonLexerKt.END_OBJ);
            return;
        }
        if (!c0Var.t0()) {
            if (c0Var.G0()) {
                f1Var.o(cVar2.n(c0Var.D()));
                return;
            }
            if (c0Var.v0()) {
                double dP = c0Var.p();
                double dW = c0Var.w();
                if (dP == dW) {
                    dP = dW;
                }
                f1Var.b(dP);
                return;
            }
            if (c0Var.A0()) {
                f1Var.g(c0Var.w());
                return;
            }
            if (c0Var.u0()) {
                f1Var.p(c0Var.c());
                return;
            } else {
                if (c0Var.C0()) {
                    f1Var.o(AbstractJsonLexerKt.NULL);
                    return;
                }
                throw new y0("Unknown object type: " + c0Var);
            }
        }
        if (c0Var.f95234f == null) {
            f1Var.o(okhttp3.v.f334777p);
            return;
        }
        boolean z11 = !z0(c0Var);
        boolean z12 = cVar.f95244c || !E0(c0Var);
        int length2 = f1Var.length();
        loop2: while (true) {
            f1Var.o(z11 ? "[\n" : "[ ");
            c0 c0Var3 = c0Var.f95234f;
            while (true) {
                if (c0Var3 == null) {
                    break loop2;
                }
                if (z11) {
                    s0(i10, f1Var);
                }
                O0(c0Var3, f1Var, i10 + 1, cVar);
                if ((!z11 || cVar2 != d0.c.minimal) && c0Var3.f95235g != null) {
                    f1Var.append(AbstractJsonLexerKt.COMMA);
                }
                f1Var.append(z11 ? '\n' : ' ');
                if (!z12 || z11 || f1Var.length() - length2 <= cVar.f95243b) {
                    c0Var3 = c0Var3.f95235g;
                }
            }
            f1Var.o0(length2);
            z11 = true;
        }
        if (z11) {
            s0(i10 - 1, f1Var);
        }
        f1Var.append(AbstractJsonLexerKt.END_LIST);
    }

    private static void s0(int i10, f1 f1Var) {
        for (int i11 = 0; i11 < i10; i11++) {
            f1Var.append('\t');
        }
    }

    private static boolean z0(c0 c0Var) {
        for (c0 c0Var2 = c0Var.f95234f; c0Var2 != null; c0Var2 = c0Var2.f95235g) {
            if (c0Var2.F0() || c0Var2.t0()) {
                return false;
            }
        }
        return true;
    }

    public long[] A() {
        long j10;
        if (this.f95229a != d.array) {
            throw new IllegalStateException("Value is not an array: " + this.f95229a);
        }
        long[] jArr = new long[this.f95237i];
        c0 c0Var = this.f95234f;
        int i10 = 0;
        while (c0Var != null) {
            int i11 = a.f95238a[c0Var.f95229a.ordinal()];
            if (i11 == 1) {
                j10 = Long.parseLong(c0Var.f95230b);
            } else if (i11 == 2) {
                j10 = (long) c0Var.f95231c;
            } else if (i11 == 3) {
                j10 = c0Var.f95232d;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("Value cannot be converted to long: " + c0Var.f95229a);
                }
                j10 = 0;
                if (c0Var.f95232d != 0) {
                    j10 = 1;
                }
            }
            jArr[i10] = j10;
            c0Var = c0Var.f95235g;
            i10++;
        }
        return jArr;
    }

    public boolean A0() {
        return this.f95229a == d.longValue;
    }

    public short B() {
        int i10 = a.f95238a[this.f95229a.ordinal()];
        if (i10 == 1) {
            return Short.parseShort(this.f95230b);
        }
        if (i10 == 2) {
            return (short) this.f95231c;
        }
        if (i10 == 3) {
            return (short) this.f95232d;
        }
        if (i10 == 4) {
            return this.f95232d != 0 ? (short) 1 : (short) 0;
        }
        throw new IllegalStateException("Value cannot be converted to short: " + this.f95229a);
    }

    public short[] C() {
        short s10;
        int i10;
        if (this.f95229a != d.array) {
            throw new IllegalStateException("Value is not an array: " + this.f95229a);
        }
        short[] sArr = new short[this.f95237i];
        c0 c0Var = this.f95234f;
        int i11 = 0;
        while (c0Var != null) {
            int i12 = a.f95238a[c0Var.f95229a.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    i10 = (int) c0Var.f95231c;
                } else if (i12 == 3) {
                    i10 = (int) c0Var.f95232d;
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException("Value cannot be converted to short: " + c0Var.f95229a);
                    }
                    s10 = c0Var.f95232d != 0 ? (short) 1 : (short) 0;
                }
                s10 = (short) i10;
            } else {
                s10 = Short.parseShort(c0Var.f95230b);
            }
            sArr[i11] = s10;
            c0Var = c0Var.f95235g;
            i11++;
        }
        return sArr;
    }

    public boolean C0() {
        return this.f95229a == d.nullValue;
    }

    public String D() {
        int i10 = a.f95238a[this.f95229a.ordinal()];
        if (i10 == 1) {
            return this.f95230b;
        }
        if (i10 == 2) {
            String str = this.f95230b;
            return str != null ? str : Double.toString(this.f95231c);
        }
        if (i10 == 3) {
            String str2 = this.f95230b;
            return str2 != null ? str2 : Long.toString(this.f95232d);
        }
        if (i10 == 4) {
            return this.f95232d != 0 ? com.facebook.internal.z0.P : "false";
        }
        if (i10 == 5) {
            return null;
        }
        throw new IllegalStateException("Value cannot be converted to string: " + this.f95229a);
    }

    public boolean D0() {
        d dVar = this.f95229a;
        return dVar == d.doubleValue || dVar == d.longValue;
    }

    public String[] F() {
        String string;
        if (this.f95229a != d.array) {
            throw new IllegalStateException("Value is not an array: " + this.f95229a);
        }
        String[] strArr = new String[this.f95237i];
        c0 c0Var = this.f95234f;
        int i10 = 0;
        while (c0Var != null) {
            int i11 = a.f95238a[c0Var.f95229a.ordinal()];
            if (i11 == 1) {
                string = c0Var.f95230b;
            } else if (i11 == 2) {
                string = this.f95230b;
                if (string == null) {
                    string = Double.toString(c0Var.f95231c);
                }
            } else if (i11 == 3) {
                string = this.f95230b;
                if (string == null) {
                    string = Long.toString(c0Var.f95232d);
                }
            } else if (i11 != 4) {
                int i12 = 7 << 5;
                if (i11 != 5) {
                    throw new IllegalStateException("Value cannot be converted to string: " + c0Var.f95229a);
                }
                string = null;
            } else {
                string = c0Var.f95232d != 0 ? com.facebook.internal.z0.P : "false";
            }
            strArr[i10] = string;
            c0Var = c0Var.f95235g;
            i10++;
        }
        return strArr;
    }

    public boolean F0() {
        return this.f95229a == d.object;
    }

    public c0 G() {
        return this.f95234f;
    }

    public boolean G0() {
        return this.f95229a == d.stringValue;
    }

    public boolean H0() {
        int i10 = a.f95238a[this.f95229a.ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public b iterator() {
        return new b();
    }

    public c0 J(int i10) {
        c0 c0Var = this.f95234f;
        while (c0Var != null && i10 > 0) {
            i10--;
            c0Var = c0Var.f95235g;
        }
        return c0Var;
    }

    public String J0() {
        return this.f95233e;
    }

    public c0 K(String str) {
        c0 c0Var = this.f95234f;
        while (c0Var != null && !c0Var.f95233e.equalsIgnoreCase(str)) {
            c0Var = c0Var.f95235g;
        }
        return c0Var;
    }

    public c0 K0() {
        return this.f95235g;
    }

    public boolean L(String str) {
        c0 c0VarK = K(str);
        if (c0VarK != null) {
            return c0VarK.c();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public String L0(c cVar) {
        f1 f1Var = new f1(512);
        O0(this, f1Var, 0, cVar);
        return f1Var.toString();
    }

    public boolean M(String str, boolean z10) {
        c0 c0VarK = K(str);
        if (c0VarK != null && c0VarK.H0()) {
            return c0VarK.c();
        }
        return z10;
    }

    public byte N(int i10) {
        c0 c0VarJ = J(i10);
        if (c0VarJ != null) {
            return c0VarJ.k();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f95233e);
    }

    public String N0(d0.c cVar, int i10) {
        c cVar2 = new c();
        cVar2.f95242a = cVar;
        cVar2.f95243b = i10;
        return L0(cVar2);
    }

    public byte O(String str) {
        c0 c0VarK = K(str);
        if (c0VarK != null) {
            return c0VarK.k();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public byte P(String str, byte b10) {
        c0 c0VarK = K(str);
        return (c0VarK == null || !c0VarK.H0()) ? b10 : c0VarK.k();
    }

    public c0 P0() {
        return this.f95236h;
    }

    public char Q(int i10) {
        c0 c0VarJ = J(i10);
        if (c0VarJ != null) {
            return c0VarJ.m();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f95233e);
    }

    public char R(String str) {
        c0 c0VarK = K(str);
        if (c0VarK != null) {
            return c0VarK.m();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public char S(String str, char c10) {
        c0 c0VarK = K(str);
        return (c0VarK == null || !c0VarK.H0()) ? c10 : c0VarK.m();
    }

    public c0 S0(int i10) {
        c0 c0VarJ = J(i10);
        if (c0VarJ == null) {
            return null;
        }
        c0 c0Var = c0VarJ.f95236h;
        if (c0Var == null) {
            c0 c0Var2 = c0VarJ.f95235g;
            this.f95234f = c0Var2;
            if (c0Var2 != null) {
                c0Var2.f95236h = null;
            }
        } else {
            c0Var.f95235g = c0VarJ.f95235g;
            c0 c0Var3 = c0VarJ.f95235g;
            if (c0Var3 != null) {
                c0Var3.f95236h = c0Var;
            }
        }
        this.f95237i--;
        return c0VarJ;
    }

    public c0 T(String str) {
        c0 c0VarK = K(str);
        if (c0VarK == null) {
            return null;
        }
        return c0VarK.f95234f;
    }

    public double U(String str) {
        c0 c0VarK = K(str);
        if (c0VarK != null) {
            return c0VarK.p();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public double V(String str, double d10) {
        c0 c0VarK = K(str);
        if (c0VarK != null && c0VarK.H0()) {
            return c0VarK.p();
        }
        return d10;
    }

    public c0 V0(String str) {
        c0 c0VarK = K(str);
        if (c0VarK == null) {
            return null;
        }
        c0 c0Var = c0VarK.f95236h;
        if (c0Var == null) {
            c0 c0Var2 = c0VarK.f95235g;
            this.f95234f = c0Var2;
            if (c0Var2 != null) {
                c0Var2.f95236h = null;
            }
        } else {
            c0Var.f95235g = c0VarK.f95235g;
            c0 c0Var3 = c0VarK.f95235g;
            if (c0Var3 != null) {
                c0Var3.f95236h = c0Var;
            }
        }
        this.f95237i--;
        return c0VarK;
    }

    public float W(String str) {
        c0 c0VarK = K(str);
        if (c0VarK != null) {
            return c0VarK.s();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public c0 W0(int i10) {
        c0 c0Var = this.f95234f;
        while (c0Var != null && i10 > 0) {
            i10--;
            c0Var = c0Var.f95235g;
        }
        if (c0Var != null) {
            return c0Var;
        }
        throw new IllegalArgumentException("Child not found with index: " + i10);
    }

    public c0 X0(String str) {
        c0 c0Var = this.f95234f;
        while (c0Var != null && !c0Var.f95233e.equalsIgnoreCase(str)) {
            c0Var = c0Var.f95235g;
        }
        if (c0Var != null) {
            return c0Var;
        }
        throw new IllegalArgumentException("Child not found with name: " + str);
    }

    public float Y(String str, float f10) {
        c0 c0VarK = K(str);
        if (c0VarK != null && c0VarK.H0()) {
            return c0VarK.s();
        }
        return f10;
    }

    public void Y0(double d10, String str) {
        this.f95231c = d10;
        this.f95232d = (long) d10;
        this.f95230b = str;
        this.f95229a = d.doubleValue;
    }

    public int Z(String str) {
        c0 c0VarK = K(str);
        if (c0VarK != null) {
            return c0VarK.u();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public void Z0(long j10, String str) {
        this.f95232d = j10;
        this.f95231c = j10;
        this.f95230b = str;
        this.f95229a = d.longValue;
    }

    public int a0(String str, int i10) {
        c0 c0VarK = K(str);
        return (c0VarK == null || !c0VarK.H0()) ? i10 : c0VarK.u();
    }

    public void a1(String str) {
        this.f95230b = str;
        this.f95229a = str == null ? d.nullValue : d.stringValue;
    }

    public long b0(String str) {
        c0 c0VarK = K(str);
        if (c0VarK != null) {
            return c0VarK.w();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public boolean c() {
        int i10 = a.f95238a[this.f95229a.ordinal()];
        if (i10 == 1) {
            return this.f95230b.equalsIgnoreCase(com.facebook.internal.z0.P);
        }
        if (i10 == 2) {
            return this.f95231c != 0.0d;
        }
        if (i10 == 3) {
            return this.f95232d != 0;
        }
        if (i10 == 4) {
            return this.f95232d != 0;
        }
        throw new IllegalStateException("Value cannot be converted to boolean: " + this.f95229a);
    }

    public long c0(String str, long j10) {
        c0 c0VarK = K(str);
        return (c0VarK == null || !c0VarK.H0()) ? j10 : c0VarK.w();
    }

    public void c1(boolean z10) {
        this.f95232d = z10 ? 1L : 0L;
        this.f95229a = d.booleanValue;
    }

    public void d1(String str) {
        this.f95233e = str;
    }

    public short e0(int i10) {
        c0 c0VarJ = J(i10);
        if (c0VarJ != null) {
            return c0VarJ.B();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f95233e);
    }

    public void f1(c0 c0Var) {
        this.f95235g = c0Var;
    }

    public double getDouble(int i10) {
        c0 c0VarJ = J(i10);
        if (c0VarJ != null) {
            return c0VarJ.p();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f95233e);
    }

    public float getFloat(int i10) {
        c0 c0VarJ = J(i10);
        if (c0VarJ != null) {
            return c0VarJ.s();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f95233e);
    }

    public int getInt(int i10) {
        c0 c0VarJ = J(i10);
        if (c0VarJ != null) {
            return c0VarJ.u();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f95233e);
    }

    public long getLong(int i10) {
        c0 c0VarJ = J(i10);
        if (c0VarJ != null) {
            return c0VarJ.w();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f95233e);
    }

    public short h0(String str) {
        c0 c0VarK = K(str);
        if (c0VarK != null) {
            return c0VarK.B();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public boolean[] i() {
        boolean z10;
        if (this.f95229a != d.array) {
            throw new IllegalStateException("Value is not an array: " + this.f95229a);
        }
        boolean[] zArr = new boolean[this.f95237i];
        c0 c0Var = this.f95234f;
        int i10 = 0;
        while (c0Var != null) {
            int i11 = a.f95238a[c0Var.f95229a.ordinal()];
            if (i11 == 1) {
                z10 = Boolean.parseBoolean(c0Var.f95230b);
            } else if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("Value cannot be converted to boolean: " + c0Var.f95229a);
                    }
                    if (c0Var.f95232d != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (c0Var.f95232d == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (c0Var.f95231c == 0.0d) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[i10] = z10;
            c0Var = c0Var.f95235g;
            i10++;
        }
        return zArr;
    }

    public short i0(String str, short s10) {
        c0 c0VarK = K(str);
        return (c0VarK == null || !c0VarK.H0()) ? s10 : c0VarK.B();
    }

    public void i1(c0 c0Var) {
        this.f95236h = c0Var;
    }

    public boolean j0(int i10) {
        c0 c0VarJ = J(i10);
        if (c0VarJ != null) {
            return c0VarJ.c();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f95233e);
    }

    public byte k() {
        int i10 = a.f95238a[this.f95229a.ordinal()];
        if (i10 == 1) {
            return Byte.parseByte(this.f95230b);
        }
        if (i10 == 2) {
            return (byte) this.f95231c;
        }
        if (i10 == 3) {
            return (byte) this.f95232d;
        }
        if (i10 == 4) {
            return this.f95232d != 0 ? (byte) 1 : (byte) 0;
        }
        throw new IllegalStateException("Value cannot be converted to byte: " + this.f95229a);
    }

    public void k1(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        this.f95229a = dVar;
    }

    public byte[] l() {
        byte b10;
        int i10;
        if (this.f95229a != d.array) {
            throw new IllegalStateException("Value is not an array: " + this.f95229a);
        }
        byte[] bArr = new byte[this.f95237i];
        c0 c0Var = this.f95234f;
        int i11 = 0;
        while (c0Var != null) {
            int i12 = a.f95238a[c0Var.f95229a.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    i10 = (int) c0Var.f95231c;
                } else if (i12 == 3) {
                    i10 = (int) c0Var.f95232d;
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException("Value cannot be converted to byte: " + c0Var.f95229a);
                    }
                    b10 = c0Var.f95232d != 0 ? (byte) 1 : (byte) 0;
                }
                b10 = (byte) i10;
            } else {
                b10 = Byte.parseByte(c0Var.f95230b);
            }
            bArr[i11] = b10;
            c0Var = c0Var.f95235g;
            i11++;
        }
        return bArr;
    }

    public String l0(int i10) {
        c0 c0VarJ = J(i10);
        if (c0VarJ != null) {
            return c0VarJ.D();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f95233e);
    }

    public char m() {
        int i10 = a.f95238a[this.f95229a.ordinal()];
        if (i10 == 1) {
            if (this.f95230b.length() == 0) {
                return (char) 0;
            }
            return this.f95230b.charAt(0);
        }
        if (i10 == 2) {
            return (char) this.f95231c;
        }
        if (i10 == 3) {
            return (char) this.f95232d;
        }
        if (i10 == 4) {
            return this.f95232d != 0 ? (char) 1 : (char) 0;
        }
        throw new IllegalStateException("Value cannot be converted to char: " + this.f95229a);
    }

    public String m0(String str) {
        c0 c0VarK = K(str);
        if (c0VarK != null) {
            return c0VarK.D();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public d m1() {
        return this.f95229a;
    }

    public char[] n() {
        char cCharAt;
        int i10;
        if (this.f95229a != d.array) {
            throw new IllegalStateException("Value is not an array: " + this.f95229a);
        }
        char[] cArr = new char[this.f95237i];
        c0 c0Var = this.f95234f;
        int i11 = 0;
        while (c0Var != null) {
            int i12 = a.f95238a[c0Var.f95229a.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    i10 = (int) c0Var.f95231c;
                } else if (i12 == 3) {
                    i10 = (int) c0Var.f95232d;
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException("Value cannot be converted to char: " + c0Var.f95229a);
                    }
                    cCharAt = c0Var.f95232d != 0 ? (char) 1 : (char) 0;
                }
                cCharAt = (char) i10;
            } else if (c0Var.f95230b.length() != 0) {
                cCharAt = c0Var.f95230b.charAt(0);
            }
            cArr[i11] = cCharAt;
            c0Var = c0Var.f95235g;
            i11++;
        }
        return cArr;
    }

    public String n0(String str, String str2) {
        c0 c0VarK = K(str);
        return (c0VarK == null || !c0VarK.H0() || c0VarK.C0()) ? str2 : c0VarK.D();
    }

    public double p() {
        int i10 = a.f95238a[this.f95229a.ordinal()];
        if (i10 == 1) {
            return Double.parseDouble(this.f95230b);
        }
        if (i10 == 2) {
            return this.f95231c;
        }
        if (i10 == 3) {
            return this.f95232d;
        }
        if (i10 == 4) {
            return this.f95232d != 0 ? 1.0d : 0.0d;
        }
        throw new IllegalStateException("Value cannot be converted to double: " + this.f95229a);
    }

    public boolean p0(String str) {
        if (K(str) == null) {
            return false;
        }
        int i10 = 6 ^ 1;
        return true;
    }

    public boolean q0(String str) {
        return T(str) != null;
    }

    public double[] r() {
        double d10;
        if (this.f95229a != d.array) {
            throw new IllegalStateException("Value is not an array: " + this.f95229a);
        }
        double[] dArr = new double[this.f95237i];
        c0 c0Var = this.f95234f;
        int i10 = 0;
        while (c0Var != null) {
            int i11 = a.f95238a[c0Var.f95229a.ordinal()];
            if (i11 == 1) {
                d10 = Double.parseDouble(c0Var.f95230b);
            } else if (i11 == 2) {
                d10 = c0Var.f95231c;
            } else if (i11 == 3) {
                d10 = c0Var.f95232d;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("Value cannot be converted to double: " + c0Var.f95229a);
                }
                d10 = c0Var.f95232d != 0 ? 1.0d : 0.0d;
            }
            dArr[i10] = d10;
            c0Var = c0Var.f95235g;
            i10++;
        }
        return dArr;
    }

    public float s() {
        int i10 = a.f95238a[this.f95229a.ordinal()];
        if (i10 == 1) {
            return Float.parseFloat(this.f95230b);
        }
        if (i10 == 2) {
            return (float) this.f95231c;
        }
        if (i10 == 3) {
            return this.f95232d;
        }
        if (i10 == 4) {
            return this.f95232d != 0 ? 1.0f : 0.0f;
        }
        throw new IllegalStateException("Value cannot be converted to float: " + this.f95229a);
    }

    @Deprecated
    public int size() {
        return this.f95237i;
    }

    public float[] t() {
        float f10;
        if (this.f95229a != d.array) {
            throw new IllegalStateException("Value is not an array: " + this.f95229a);
        }
        float[] fArr = new float[this.f95237i];
        c0 c0Var = this.f95234f;
        int i10 = 0;
        while (c0Var != null) {
            int i11 = a.f95238a[c0Var.f95229a.ordinal()];
            if (i11 == 1) {
                f10 = Float.parseFloat(c0Var.f95230b);
            } else if (i11 == 2) {
                f10 = (float) c0Var.f95231c;
            } else if (i11 == 3) {
                f10 = c0Var.f95232d;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("Value cannot be converted to float: " + c0Var.f95229a);
                }
                f10 = c0Var.f95232d != 0 ? 1.0f : 0.0f;
            }
            fArr[i10] = f10;
            c0Var = c0Var.f95235g;
            i10++;
        }
        return fArr;
    }

    public boolean t0() {
        return this.f95229a == d.array;
    }

    public String toString() {
        String str;
        if (H0()) {
            if (this.f95233e == null) {
                return D();
            }
            return this.f95233e + ": " + D();
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f95233e == null) {
            str = "";
        } else {
            str = this.f95233e + ": ";
        }
        sb2.append(str);
        sb2.append(N0(d0.c.minimal, 0));
        return sb2.toString();
    }

    public int u() {
        int i10 = a.f95238a[this.f95229a.ordinal()];
        if (i10 == 1) {
            return Integer.parseInt(this.f95230b);
        }
        if (i10 == 2) {
            return (int) this.f95231c;
        }
        if (i10 == 3) {
            return (int) this.f95232d;
        }
        if (i10 == 4) {
            return this.f95232d != 0 ? 1 : 0;
        }
        throw new IllegalStateException("Value cannot be converted to int: " + this.f95229a);
    }

    public boolean u0() {
        return this.f95229a == d.booleanValue;
    }

    public int[] v() {
        int i10;
        if (this.f95229a != d.array) {
            throw new IllegalStateException("Value is not an array: " + this.f95229a);
        }
        int[] iArr = new int[this.f95237i];
        c0 c0Var = this.f95234f;
        int i11 = 0;
        while (c0Var != null) {
            int i12 = a.f95238a[c0Var.f95229a.ordinal()];
            if (i12 == 1) {
                i10 = Integer.parseInt(c0Var.f95230b);
            } else if (i12 == 2) {
                i10 = (int) c0Var.f95231c;
            } else if (i12 == 3) {
                i10 = (int) c0Var.f95232d;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("Value cannot be converted to int: " + c0Var.f95229a);
                }
                i10 = c0Var.f95232d != 0 ? 1 : 0;
            }
            iArr[i11] = i10;
            c0Var = c0Var.f95235g;
            i11++;
        }
        return iArr;
    }

    public boolean v0() {
        return this.f95229a == d.doubleValue;
    }

    public long w() {
        int i10 = a.f95238a[this.f95229a.ordinal()];
        if (i10 == 1) {
            return Long.parseLong(this.f95230b);
        }
        if (i10 == 2) {
            return (long) this.f95231c;
        }
        if (i10 == 3) {
            return this.f95232d;
        }
        if (i10 == 4) {
            return this.f95232d != 0 ? 1L : 0L;
        }
        throw new IllegalStateException("Value cannot be converted to long: " + this.f95229a);
    }

    public c0(String str) {
        a1(str);
    }

    public c0(double d10) {
        Y0(d10, null);
    }

    public c0(long j10) {
        Z0(j10, null);
    }

    public c0(double d10, String str) {
        Y0(d10, str);
    }

    public c0(long j10, String str) {
        Z0(j10, str);
    }

    public c0(boolean z10) {
        c1(z10);
    }
}
