package org.apache.commons.lang3.builder;

import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
public class q implements a<String> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile s f336998d = s.Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuffer f336999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f337000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f337001c;

    public q(Object obj) {
        this(obj, null, null);
    }

    public static s Y() {
        return f336998d;
    }

    public static String c0(Object obj) {
        return o.y0(obj);
    }

    public static String d0(Object obj, s sVar) {
        return o.z0(obj, sVar);
    }

    public static String e0(Object obj, s sVar, boolean z10) {
        return o.C0(obj, sVar, z10, false, null);
    }

    public static <T> String f0(T t10, s sVar, boolean z10, Class<? super T> cls) {
        return o.C0(t10, sVar, z10, false, cls);
    }

    public static void g0(s sVar) {
        c0.v(sVar != null, "The style must not be null", new Object[0]);
        f336998d = sVar;
    }

    public q A(String str, int[] iArr, boolean z10) {
        this.f337001c.n(this.f336999a, str, iArr, Boolean.valueOf(z10));
        return this;
    }

    public q B(String str, long[] jArr) {
        this.f337001c.o(this.f336999a, str, jArr, null);
        return this;
    }

    public q C(String str, long[] jArr, boolean z10) {
        this.f337001c.o(this.f336999a, str, jArr, Boolean.valueOf(z10));
        return this;
    }

    public q D(String str, Object[] objArr) {
        this.f337001c.p(this.f336999a, str, objArr, null);
        return this;
    }

    public q E(String str, Object[] objArr, boolean z10) {
        this.f337001c.p(this.f336999a, str, objArr, Boolean.valueOf(z10));
        return this;
    }

    public q F(String str, short[] sArr) {
        this.f337001c.q(this.f336999a, str, sArr, null);
        return this;
    }

    public q G(String str, short[] sArr, boolean z10) {
        this.f337001c.q(this.f336999a, str, sArr, Boolean.valueOf(z10));
        return this;
    }

    public q H(String str, boolean[] zArr) {
        this.f337001c.r(this.f336999a, str, zArr, null);
        return this;
    }

    public q I(String str, boolean[] zArr, boolean z10) {
        this.f337001c.r(this.f336999a, str, zArr, Boolean.valueOf(z10));
        return this;
    }

    public q J(short s10) {
        this.f337001c.h(this.f336999a, null, s10);
        return this;
    }

    public q K(boolean z10) {
        this.f337001c.i(this.f336999a, null, z10);
        return this;
    }

    public q L(byte[] bArr) {
        this.f337001c.j(this.f336999a, null, bArr, null);
        return this;
    }

    public q M(char[] cArr) {
        this.f337001c.k(this.f336999a, null, cArr, null);
        return this;
    }

    public q N(double[] dArr) {
        this.f337001c.l(this.f336999a, null, dArr, null);
        return this;
    }

    public q O(float[] fArr) {
        this.f337001c.m(this.f336999a, null, fArr, null);
        return this;
    }

    public q P(int[] iArr) {
        this.f337001c.n(this.f336999a, null, iArr, null);
        return this;
    }

    public q Q(long[] jArr) {
        this.f337001c.o(this.f336999a, null, jArr, null);
        return this;
    }

    public q R(Object[] objArr) {
        this.f337001c.p(this.f336999a, null, objArr, null);
        return this;
    }

    public q S(short[] sArr) {
        this.f337001c.q(this.f336999a, null, sArr, null);
        return this;
    }

    public q T(boolean[] zArr) {
        this.f337001c.r(this.f336999a, null, zArr, null);
        return this;
    }

    public q U(Object obj) {
        org.apache.commons.lang3.s.y(a0(), obj);
        return this;
    }

    public q V(String str) {
        if (str != null) {
            this.f337001c.j0(this.f336999a, str);
        }
        return this;
    }

    public q W(String str) {
        if (str != null) {
            this.f337001c.k0(this.f336999a, str);
        }
        return this;
    }

    @Override // org.apache.commons.lang3.builder.a
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public String build() {
        return toString();
    }

    public Object Z() {
        return this.f337000b;
    }

    public q a(byte b10) {
        this.f337001c.a(this.f336999a, null, b10);
        return this;
    }

    public StringBuffer a0() {
        return this.f336999a;
    }

    public q b(char c10) {
        this.f337001c.b(this.f336999a, null, c10);
        return this;
    }

    public s b0() {
        return this.f337001c;
    }

    public q c(double d10) {
        this.f337001c.c(this.f336999a, null, d10);
        return this;
    }

    public q d(float f10) {
        this.f337001c.d(this.f336999a, null, f10);
        return this;
    }

    public q e(int i10) {
        this.f337001c.e(this.f336999a, null, i10);
        return this;
    }

    public q f(long j10) {
        this.f337001c.f(this.f336999a, null, j10);
        return this;
    }

    public q g(Object obj) {
        this.f337001c.g(this.f336999a, null, obj, null);
        return this;
    }

    public q h(String str, byte b10) {
        this.f337001c.a(this.f336999a, str, b10);
        return this;
    }

    public q i(String str, char c10) {
        this.f337001c.b(this.f336999a, str, c10);
        return this;
    }

    public q j(String str, double d10) {
        this.f337001c.c(this.f336999a, str, d10);
        return this;
    }

    public q k(String str, float f10) {
        this.f337001c.d(this.f336999a, str, f10);
        return this;
    }

    public q l(String str, int i10) {
        this.f337001c.e(this.f336999a, str, i10);
        return this;
    }

    public q m(String str, long j10) {
        this.f337001c.f(this.f336999a, str, j10);
        return this;
    }

    public q n(String str, Object obj) {
        int i10 = 3 | 0;
        this.f337001c.g(this.f336999a, str, obj, null);
        return this;
    }

    public q o(String str, Object obj, boolean z10) {
        this.f337001c.g(this.f336999a, str, obj, Boolean.valueOf(z10));
        return this;
    }

    public q p(String str, short s10) {
        this.f337001c.h(this.f336999a, str, s10);
        return this;
    }

    public q q(String str, boolean z10) {
        this.f337001c.i(this.f336999a, str, z10);
        return this;
    }

    public q r(String str, byte[] bArr) {
        this.f337001c.j(this.f336999a, str, bArr, null);
        return this;
    }

    public q s(String str, byte[] bArr, boolean z10) {
        this.f337001c.j(this.f336999a, str, bArr, Boolean.valueOf(z10));
        return this;
    }

    public q t(String str, char[] cArr) {
        this.f337001c.k(this.f336999a, str, cArr, null);
        return this;
    }

    public String toString() {
        if (Z() == null) {
            a0().append(b0().s0());
        } else {
            this.f337001c.Q(a0(), Z());
        }
        return a0().toString();
    }

    public q u(String str, char[] cArr, boolean z10) {
        this.f337001c.k(this.f336999a, str, cArr, Boolean.valueOf(z10));
        return this;
    }

    public q v(String str, double[] dArr) {
        this.f337001c.l(this.f336999a, str, dArr, null);
        return this;
    }

    public q w(String str, double[] dArr, boolean z10) {
        this.f337001c.l(this.f336999a, str, dArr, Boolean.valueOf(z10));
        return this;
    }

    public q x(String str, float[] fArr) {
        this.f337001c.m(this.f336999a, str, fArr, null);
        return this;
    }

    public q y(String str, float[] fArr, boolean z10) {
        this.f337001c.m(this.f336999a, str, fArr, Boolean.valueOf(z10));
        return this;
    }

    public q z(String str, int[] iArr) {
        this.f337001c.n(this.f336999a, str, iArr, null);
        return this;
    }

    public q(Object obj, s sVar) {
        this(obj, sVar, null);
    }

    public q(Object obj, s sVar, StringBuffer stringBuffer) {
        sVar = sVar == null ? Y() : sVar;
        stringBuffer = stringBuffer == null ? new StringBuffer(512) : stringBuffer;
        this.f336999a = stringBuffer;
        this.f337001c = sVar;
        this.f337000b = obj;
        sVar.X(stringBuffer, obj);
    }
}
