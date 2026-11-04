package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@oj.g
@m2(markerClass = {u.class})
@e1(version = "1.5")
public final class y1 implements Comparable<y1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f313456b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f313457c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f313458d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f313459e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f313460f = 64;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f313461a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.internal.g
    @a1
    private /* synthetic */ y1(long j10) {
        this.f313461a = j10;
    }

    @kotlin.internal.f
    private static final long A0(long j10, long j11) {
        return n(j10 ^ j11);
    }

    @kotlin.internal.f
    private static final long D(long j10, short s10) {
        return Long.divideUnsigned(j10, n(((long) s10) & okhttp3.internal.ws.g.f334653t));
    }

    @a1
    public static /* synthetic */ void E() {
    }

    public static int H(long j10) {
        return Long.hashCode(j10);
    }

    @kotlin.internal.f
    private static final long I(long j10) {
        return n(j10 + 1);
    }

    @kotlin.internal.f
    private static final long L(long j10) {
        return n(~j10);
    }

    @kotlin.internal.f
    private static final long M(long j10, byte b10) {
        return n(j10 - n(((long) b10) & 255));
    }

    @kotlin.internal.f
    private static final long N(long j10, long j11) {
        return n(j10 - j11);
    }

    @kotlin.internal.f
    private static final long O(long j10, int i10) {
        return n(j10 - n(((long) i10) & com.rabbitmq.client.k0.f265952a));
    }

    @kotlin.internal.f
    private static final long R(long j10, short s10) {
        return n(j10 - n(((long) s10) & okhttp3.internal.ws.g.f334653t));
    }

    @kotlin.internal.f
    private static final byte S(long j10, byte b10) {
        return q1.n((byte) Long.remainderUnsigned(j10, n(((long) b10) & 255)));
    }

    @kotlin.internal.f
    private static final long T(long j10, long j11) {
        return Long.remainderUnsigned(j10, j11);
    }

    @kotlin.internal.f
    private static final int U(long j10, int i10) {
        return u1.n((int) Long.remainderUnsigned(j10, n(((long) i10) & com.rabbitmq.client.k0.f265952a)));
    }

    @kotlin.internal.f
    private static final short V(long j10, short s10) {
        return e2.n((short) Long.remainderUnsigned(j10, n(((long) s10) & okhttp3.internal.ws.g.f334653t)));
    }

    @kotlin.internal.f
    private static final long W(long j10, long j11) {
        return n(j10 | j11);
    }

    @kotlin.internal.f
    private static final long X(long j10, byte b10) {
        return n(j10 + n(((long) b10) & 255));
    }

    @kotlin.internal.f
    private static final long Y(long j10, long j11) {
        return n(j10 + j11);
    }

    @kotlin.internal.f
    private static final long Z(long j10, int i10) {
        return n(j10 + n(((long) i10) & com.rabbitmq.client.k0.f265952a));
    }

    @kotlin.internal.f
    private static final long a0(long j10, short s10) {
        return n(j10 + n(((long) s10) & okhttp3.internal.ws.g.f334653t));
    }

    @kotlin.internal.f
    private static final long b(long j10, long j11) {
        return n(j10 & j11);
    }

    public static final /* synthetic */ y1 c(long j10) {
        return new y1(j10);
    }

    @kotlin.internal.f
    private static final kotlin.ranges.z c0(long j10, long j11) {
        return new kotlin.ranges.z(j10, j11, null);
    }

    @kotlin.internal.f
    private static final int d(long j10, byte b10) {
        return Long.compareUnsigned(j10, n(((long) b10) & 255));
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.9")
    @kotlin.internal.f
    private static final kotlin.ranges.z d0(long j10, long j11) {
        return kotlin.ranges.a0.X(j10, j11);
    }

    @kotlin.internal.f
    private int e(long j10) {
        return l2.n(z0(), j10);
    }

    @kotlin.internal.f
    private static final long e0(long j10, byte b10) {
        return Long.remainderUnsigned(j10, n(((long) b10) & 255));
    }

    @kotlin.internal.f
    private static int f(long j10, long j11) {
        return l2.n(j10, j11);
    }

    @kotlin.internal.f
    private static final long f0(long j10, long j11) {
        return l2.p(j10, j11);
    }

    @kotlin.internal.f
    private static final long g0(long j10, int i10) {
        return Long.remainderUnsigned(j10, n(((long) i10) & com.rabbitmq.client.k0.f265952a));
    }

    @kotlin.internal.f
    private static final long h0(long j10, short s10) {
        return Long.remainderUnsigned(j10, n(((long) s10) & okhttp3.internal.ws.g.f334653t));
    }

    @kotlin.internal.f
    private static final long i0(long j10, int i10) {
        return n(j10 << i10);
    }

    @kotlin.internal.f
    private static final long j0(long j10, int i10) {
        return n(j10 >>> i10);
    }

    @kotlin.internal.f
    private static final int k(long j10, int i10) {
        return Long.compareUnsigned(j10, n(((long) i10) & com.rabbitmq.client.k0.f265952a));
    }

    @kotlin.internal.f
    private static final long k0(long j10, byte b10) {
        return n(j10 * n(((long) b10) & 255));
    }

    @kotlin.internal.f
    private static final int l(long j10, short s10) {
        return Long.compareUnsigned(j10, n(((long) s10) & okhttp3.internal.ws.g.f334653t));
    }

    @kotlin.internal.f
    private static final long l0(long j10, long j11) {
        return n(j10 * j11);
    }

    @kotlin.internal.f
    private static final long m0(long j10, int i10) {
        return n(j10 * n(((long) i10) & com.rabbitmq.client.k0.f265952a));
    }

    @kotlin.internal.g
    @a1
    public static long n(long j10) {
        return j10;
    }

    @kotlin.internal.f
    private static final long n0(long j10, short s10) {
        return n(j10 * n(((long) s10) & okhttp3.internal.ws.g.f334653t));
    }

    @kotlin.internal.f
    private static final long o(long j10) {
        return n(j10 - 1);
    }

    @kotlin.internal.f
    private static final byte o0(long j10) {
        return (byte) j10;
    }

    @kotlin.internal.f
    private static final long p(long j10, byte b10) {
        return Long.divideUnsigned(j10, n(((long) b10) & 255));
    }

    @kotlin.internal.f
    private static final double p0(long j10) {
        return l2.q(j10);
    }

    @kotlin.internal.f
    private static final long q(long j10, long j11) {
        return l2.o(j10, j11);
    }

    @kotlin.internal.f
    private static final float q0(long j10) {
        return (float) l2.q(j10);
    }

    @kotlin.internal.f
    private static final long r(long j10, int i10) {
        return Long.divideUnsigned(j10, n(((long) i10) & com.rabbitmq.client.k0.f265952a));
    }

    @kotlin.internal.f
    private static final int r0(long j10) {
        return (int) j10;
    }

    @kotlin.internal.f
    private static final long s(long j10, short s10) {
        return Long.divideUnsigned(j10, n(((long) s10) & okhttp3.internal.ws.g.f334653t));
    }

    @kotlin.internal.f
    private static final long s0(long j10) {
        return j10;
    }

    public static boolean t(long j10, Object obj) {
        return (obj instanceof y1) && j10 == ((y1) obj).z0();
    }

    @kotlin.internal.f
    private static final short t0(long j10) {
        return (short) j10;
    }

    @NotNull
    public static String u0(long j10) {
        return l2.t(j10, 10);
    }

    public static final boolean v(long j10, long j11) {
        return j10 == j11;
    }

    @kotlin.internal.f
    private static final byte v0(long j10) {
        return q1.n((byte) j10);
    }

    @kotlin.internal.f
    private static final long w(long j10, byte b10) {
        return Long.divideUnsigned(j10, n(((long) b10) & 255));
    }

    @kotlin.internal.f
    private static final int w0(long j10) {
        return u1.n((int) j10);
    }

    @kotlin.internal.f
    private static final long x(long j10, long j11) {
        return Long.divideUnsigned(j10, j11);
    }

    @kotlin.internal.f
    private static final long x0(long j10) {
        return j10;
    }

    @kotlin.internal.f
    private static final short y0(long j10) {
        return e2.n((short) j10);
    }

    @kotlin.internal.f
    private static final long z(long j10, int i10) {
        return Long.divideUnsigned(j10, n(((long) i10) & com.rabbitmq.client.k0.f265952a));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(y1 y1Var) {
        return l2.n(z0(), y1Var.z0());
    }

    public boolean equals(Object obj) {
        return t(this.f313461a, obj);
    }

    public int hashCode() {
        return H(this.f313461a);
    }

    @NotNull
    public String toString() {
        return u0(this.f313461a);
    }

    public final /* synthetic */ long z0() {
        return this.f313461a;
    }
}
