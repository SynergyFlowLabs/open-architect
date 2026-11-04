package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@oj.g
@m2(markerClass = {u.class})
@e1(version = "1.5")
public final class u1 implements Comparable<u1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f313438b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f313439c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f313440d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f313441e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f313442f = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f313443a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.internal.g
    @a1
    private /* synthetic */ u1(int i10) {
        this.f313443a = i10;
    }

    @kotlin.internal.f
    private static final int A0(int i10, int i11) {
        return n(i10 ^ i11);
    }

    @kotlin.internal.f
    private static final int D(int i10, short s10) {
        return Integer.divideUnsigned(i10, n(s10 & e2.f312492d));
    }

    @a1
    public static /* synthetic */ void E() {
    }

    public static int H(int i10) {
        return Integer.hashCode(i10);
    }

    @kotlin.internal.f
    private static final int I(int i10) {
        return n(i10 + 1);
    }

    @kotlin.internal.f
    private static final int L(int i10) {
        return n(~i10);
    }

    @kotlin.internal.f
    private static final int M(int i10, byte b10) {
        return n(i10 - n(b10 & 255));
    }

    @kotlin.internal.f
    private static final long N(int i10, long j10) {
        return y1.n(y1.n(((long) i10) & com.rabbitmq.client.k0.f265952a) - j10);
    }

    @kotlin.internal.f
    private static final int O(int i10, int i11) {
        return n(i10 - i11);
    }

    @kotlin.internal.f
    private static final int R(int i10, short s10) {
        return n(i10 - n(s10 & e2.f312492d));
    }

    @kotlin.internal.f
    private static final byte S(int i10, byte b10) {
        return q1.n((byte) Integer.remainderUnsigned(i10, n(b10 & 255)));
    }

    @kotlin.internal.f
    private static final long T(int i10, long j10) {
        return Long.remainderUnsigned(y1.n(((long) i10) & com.rabbitmq.client.k0.f265952a), j10);
    }

    @kotlin.internal.f
    private static final int U(int i10, int i11) {
        return Integer.remainderUnsigned(i10, i11);
    }

    @kotlin.internal.f
    private static final short V(int i10, short s10) {
        return e2.n((short) Integer.remainderUnsigned(i10, n(s10 & e2.f312492d)));
    }

    @kotlin.internal.f
    private static final int W(int i10, int i11) {
        return n(i10 | i11);
    }

    @kotlin.internal.f
    private static final int X(int i10, byte b10) {
        return n(i10 + n(b10 & 255));
    }

    @kotlin.internal.f
    private static final long Y(int i10, long j10) {
        return y1.n(y1.n(((long) i10) & com.rabbitmq.client.k0.f265952a) + j10);
    }

    @kotlin.internal.f
    private static final int Z(int i10, int i11) {
        return n(i10 + i11);
    }

    @kotlin.internal.f
    private static final int a0(int i10, short s10) {
        return n(i10 + n(s10 & e2.f312492d));
    }

    @kotlin.internal.f
    private static final int b(int i10, int i11) {
        return n(i10 & i11);
    }

    public static final /* synthetic */ u1 c(int i10) {
        return new u1(i10);
    }

    @kotlin.internal.f
    private static final kotlin.ranges.w c0(int i10, int i11) {
        return new kotlin.ranges.w(i10, i11, null);
    }

    @kotlin.internal.f
    private static final int d(int i10, byte b10) {
        return Integer.compareUnsigned(i10, n(b10 & 255));
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.9")
    @kotlin.internal.f
    private static final kotlin.ranges.w d0(int i10, int i11) {
        return kotlin.ranges.a0.V(i10, i11);
    }

    @kotlin.internal.f
    private static final int e(int i10, long j10) {
        return Long.compareUnsigned(y1.n(((long) i10) & com.rabbitmq.client.k0.f265952a), j10);
    }

    @kotlin.internal.f
    private static final int e0(int i10, byte b10) {
        return Integer.remainderUnsigned(i10, n(b10 & 255));
    }

    @kotlin.internal.f
    private int f(int i10) {
        return l2.e(z0(), i10);
    }

    @kotlin.internal.f
    private static final long f0(int i10, long j10) {
        return Long.remainderUnsigned(y1.n(((long) i10) & com.rabbitmq.client.k0.f265952a), j10);
    }

    @kotlin.internal.f
    private static final int g0(int i10, int i11) {
        return l2.g(i10, i11);
    }

    @kotlin.internal.f
    private static final int h0(int i10, short s10) {
        return Integer.remainderUnsigned(i10, n(s10 & e2.f312492d));
    }

    @kotlin.internal.f
    private static final int i0(int i10, int i11) {
        return n(i10 << i11);
    }

    @kotlin.internal.f
    private static final int j0(int i10, int i11) {
        return n(i10 >>> i11);
    }

    @kotlin.internal.f
    private static int k(int i10, int i11) {
        return l2.e(i10, i11);
    }

    @kotlin.internal.f
    private static final int k0(int i10, byte b10) {
        return n(i10 * n(b10 & 255));
    }

    @kotlin.internal.f
    private static final int l(int i10, short s10) {
        return Integer.compareUnsigned(i10, n(s10 & e2.f312492d));
    }

    @kotlin.internal.f
    private static final long l0(int i10, long j10) {
        return y1.n(y1.n(((long) i10) & com.rabbitmq.client.k0.f265952a) * j10);
    }

    @kotlin.internal.f
    private static final int m0(int i10, int i11) {
        return n(i10 * i11);
    }

    @kotlin.internal.g
    @a1
    public static int n(int i10) {
        return i10;
    }

    @kotlin.internal.f
    private static final int n0(int i10, short s10) {
        return n(i10 * n(s10 & e2.f312492d));
    }

    @kotlin.internal.f
    private static final int o(int i10) {
        return n(i10 - 1);
    }

    @kotlin.internal.f
    private static final byte o0(int i10) {
        return (byte) i10;
    }

    @kotlin.internal.f
    private static final int p(int i10, byte b10) {
        return Integer.divideUnsigned(i10, n(b10 & 255));
    }

    @kotlin.internal.f
    private static final double p0(int i10) {
        return l2.h(i10);
    }

    @kotlin.internal.f
    private static final long q(int i10, long j10) {
        return Long.divideUnsigned(y1.n(((long) i10) & com.rabbitmq.client.k0.f265952a), j10);
    }

    @kotlin.internal.f
    private static final float q0(int i10) {
        return (float) l2.h(i10);
    }

    @kotlin.internal.f
    private static final int r(int i10, int i11) {
        return l2.f(i10, i11);
    }

    @kotlin.internal.f
    private static final int r0(int i10) {
        return i10;
    }

    @kotlin.internal.f
    private static final int s(int i10, short s10) {
        return Integer.divideUnsigned(i10, n(s10 & e2.f312492d));
    }

    @kotlin.internal.f
    private static final long s0(int i10) {
        return ((long) i10) & com.rabbitmq.client.k0.f265952a;
    }

    public static boolean t(int i10, Object obj) {
        return (obj instanceof u1) && i10 == ((u1) obj).z0();
    }

    @kotlin.internal.f
    private static final short t0(int i10) {
        return (short) i10;
    }

    @NotNull
    public static String u0(int i10) {
        return String.valueOf(((long) i10) & com.rabbitmq.client.k0.f265952a);
    }

    public static final boolean v(int i10, int i11) {
        return i10 == i11;
    }

    @kotlin.internal.f
    private static final byte v0(int i10) {
        return q1.n((byte) i10);
    }

    @kotlin.internal.f
    private static final int w(int i10, byte b10) {
        return Integer.divideUnsigned(i10, n(b10 & 255));
    }

    @kotlin.internal.f
    private static final int w0(int i10) {
        return i10;
    }

    @kotlin.internal.f
    private static final long x(int i10, long j10) {
        return Long.divideUnsigned(y1.n(((long) i10) & com.rabbitmq.client.k0.f265952a), j10);
    }

    @kotlin.internal.f
    private static final long x0(int i10) {
        return y1.n(((long) i10) & com.rabbitmq.client.k0.f265952a);
    }

    @kotlin.internal.f
    private static final short y0(int i10) {
        return e2.n((short) i10);
    }

    @kotlin.internal.f
    private static final int z(int i10, int i11) {
        return Integer.divideUnsigned(i10, i11);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(u1 u1Var) {
        return l2.e(z0(), u1Var.z0());
    }

    public boolean equals(Object obj) {
        return t(this.f313443a, obj);
    }

    public int hashCode() {
        return H(this.f313443a);
    }

    @NotNull
    public String toString() {
        return u0(this.f313443a);
    }

    public final /* synthetic */ int z0() {
        return this.f313443a;
    }
}
