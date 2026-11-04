package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@oj.g
@m2(markerClass = {u.class})
@e1(version = "1.5")
public final class e2 implements Comparable<e2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f312490b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final short f312491c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final short f312492d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f312493e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f312494f = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f312495a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.internal.g
    @a1
    private /* synthetic */ e2(short s10) {
        this.f312495a = s10;
    }

    @kotlin.internal.f
    private static final int D(short s10, short s11) {
        return Integer.divideUnsigned(u1.n(s10 & f312492d), u1.n(s11 & f312492d));
    }

    @a1
    public static /* synthetic */ void E() {
    }

    public static int H(short s10) {
        return Short.hashCode(s10);
    }

    @kotlin.internal.f
    private static final short I(short s10) {
        return n((short) (s10 + 1));
    }

    @kotlin.internal.f
    private static final short L(short s10) {
        return n((short) (~s10));
    }

    @kotlin.internal.f
    private static final int M(short s10, byte b10) {
        return u1.n(u1.n(s10 & f312492d) - u1.n(b10 & 255));
    }

    @kotlin.internal.f
    private static final long N(short s10, long j10) {
        return y1.n(y1.n(((long) s10) & okhttp3.internal.ws.g.f334653t) - j10);
    }

    @kotlin.internal.f
    private static final int O(short s10, int i10) {
        return u1.n(u1.n(s10 & f312492d) - i10);
    }

    @kotlin.internal.f
    private static final int R(short s10, short s11) {
        return u1.n(u1.n(s10 & f312492d) - u1.n(s11 & f312492d));
    }

    @kotlin.internal.f
    private static final byte S(short s10, byte b10) {
        return q1.n((byte) Integer.remainderUnsigned(u1.n(s10 & f312492d), u1.n(b10 & 255)));
    }

    @kotlin.internal.f
    private static final long T(short s10, long j10) {
        return Long.remainderUnsigned(y1.n(((long) s10) & okhttp3.internal.ws.g.f334653t), j10);
    }

    @kotlin.internal.f
    private static final int U(short s10, int i10) {
        return Integer.remainderUnsigned(u1.n(s10 & f312492d), i10);
    }

    @kotlin.internal.f
    private static final short V(short s10, short s11) {
        return n((short) Integer.remainderUnsigned(u1.n(s10 & f312492d), u1.n(s11 & f312492d)));
    }

    @kotlin.internal.f
    private static final short W(short s10, short s11) {
        return n((short) (s10 | s11));
    }

    @kotlin.internal.f
    private static final int X(short s10, byte b10) {
        return u1.n(u1.n(s10 & f312492d) + u1.n(b10 & 255));
    }

    @kotlin.internal.f
    private static final long Y(short s10, long j10) {
        return y1.n(y1.n(((long) s10) & okhttp3.internal.ws.g.f334653t) + j10);
    }

    @kotlin.internal.f
    private static final int Z(short s10, int i10) {
        return u1.n(u1.n(s10 & f312492d) + i10);
    }

    @kotlin.internal.f
    private static final int a0(short s10, short s11) {
        return u1.n(u1.n(s10 & f312492d) + u1.n(s11 & f312492d));
    }

    @kotlin.internal.f
    private static final short b(short s10, short s11) {
        return n((short) (s10 & s11));
    }

    public static final /* synthetic */ e2 c(short s10) {
        return new e2(s10);
    }

    @kotlin.internal.f
    private static final kotlin.ranges.w c0(short s10, short s11) {
        return new kotlin.ranges.w(u1.n(s10 & f312492d), u1.n(s11 & f312492d), null);
    }

    @kotlin.internal.f
    private static final int d(short s10, byte b10) {
        return Intrinsics.compare(s10 & f312492d, b10 & 255);
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.9")
    @kotlin.internal.f
    private static final kotlin.ranges.w d0(short s10, short s11) {
        return kotlin.ranges.a0.V(u1.n(s10 & f312492d), u1.n(s11 & f312492d));
    }

    @kotlin.internal.f
    private static final int e(short s10, long j10) {
        return Long.compareUnsigned(y1.n(((long) s10) & okhttp3.internal.ws.g.f334653t), j10);
    }

    @kotlin.internal.f
    private static final int e0(short s10, byte b10) {
        return Integer.remainderUnsigned(u1.n(s10 & f312492d), u1.n(b10 & 255));
    }

    @kotlin.internal.f
    private static final int f(short s10, int i10) {
        return Integer.compareUnsigned(u1.n(s10 & f312492d), i10);
    }

    @kotlin.internal.f
    private static final long f0(short s10, long j10) {
        return Long.remainderUnsigned(y1.n(((long) s10) & okhttp3.internal.ws.g.f334653t), j10);
    }

    @kotlin.internal.f
    private static final int g0(short s10, int i10) {
        return Integer.remainderUnsigned(u1.n(s10 & f312492d), i10);
    }

    @kotlin.internal.f
    private static final int h0(short s10, short s11) {
        return Integer.remainderUnsigned(u1.n(s10 & f312492d), u1.n(s11 & f312492d));
    }

    @kotlin.internal.f
    private static final int i0(short s10, byte b10) {
        return u1.n(u1.n(s10 & f312492d) * u1.n(b10 & 255));
    }

    @kotlin.internal.f
    private static final long j0(short s10, long j10) {
        return y1.n(y1.n(((long) s10) & okhttp3.internal.ws.g.f334653t) * j10);
    }

    @kotlin.internal.f
    private int k(short s10) {
        return Intrinsics.compare(x0() & f312492d, s10 & f312492d);
    }

    @kotlin.internal.f
    private static final int k0(short s10, int i10) {
        return u1.n(u1.n(s10 & f312492d) * i10);
    }

    @kotlin.internal.f
    private static int l(short s10, short s11) {
        return Intrinsics.compare(s10 & f312492d, s11 & f312492d);
    }

    @kotlin.internal.f
    private static final int l0(short s10, short s11) {
        return u1.n(u1.n(s10 & f312492d) * u1.n(s11 & f312492d));
    }

    @kotlin.internal.f
    private static final byte m0(short s10) {
        return (byte) s10;
    }

    @kotlin.internal.g
    @a1
    public static short n(short s10) {
        return s10;
    }

    @kotlin.internal.f
    private static final double n0(short s10) {
        return l2.h(s10 & f312492d);
    }

    @kotlin.internal.f
    private static final short o(short s10) {
        return n((short) (s10 - 1));
    }

    @kotlin.internal.f
    private static final float o0(short s10) {
        return (float) l2.h(s10 & f312492d);
    }

    @kotlin.internal.f
    private static final int p(short s10, byte b10) {
        return Integer.divideUnsigned(u1.n(s10 & f312492d), u1.n(b10 & 255));
    }

    @kotlin.internal.f
    private static final int p0(short s10) {
        return s10 & f312492d;
    }

    @kotlin.internal.f
    private static final long q(short s10, long j10) {
        return Long.divideUnsigned(y1.n(((long) s10) & okhttp3.internal.ws.g.f334653t), j10);
    }

    @kotlin.internal.f
    private static final long q0(short s10) {
        return ((long) s10) & okhttp3.internal.ws.g.f334653t;
    }

    @kotlin.internal.f
    private static final int r(short s10, int i10) {
        return Integer.divideUnsigned(u1.n(s10 & f312492d), i10);
    }

    @kotlin.internal.f
    private static final short r0(short s10) {
        return s10;
    }

    @kotlin.internal.f
    private static final int s(short s10, short s11) {
        return Integer.divideUnsigned(u1.n(s10 & f312492d), u1.n(s11 & f312492d));
    }

    @NotNull
    public static String s0(short s10) {
        return String.valueOf(s10 & f312492d);
    }

    public static boolean t(short s10, Object obj) {
        return (obj instanceof e2) && s10 == ((e2) obj).x0();
    }

    @kotlin.internal.f
    private static final byte t0(short s10) {
        return q1.n((byte) s10);
    }

    @kotlin.internal.f
    private static final int u0(short s10) {
        return u1.n(s10 & f312492d);
    }

    public static final boolean v(short s10, short s11) {
        return s10 == s11;
    }

    @kotlin.internal.f
    private static final long v0(short s10) {
        return y1.n(((long) s10) & okhttp3.internal.ws.g.f334653t);
    }

    @kotlin.internal.f
    private static final int w(short s10, byte b10) {
        return Integer.divideUnsigned(u1.n(s10 & f312492d), u1.n(b10 & 255));
    }

    @kotlin.internal.f
    private static final short w0(short s10) {
        return s10;
    }

    @kotlin.internal.f
    private static final long x(short s10, long j10) {
        return Long.divideUnsigned(y1.n(((long) s10) & okhttp3.internal.ws.g.f334653t), j10);
    }

    @kotlin.internal.f
    private static final short y0(short s10, short s11) {
        return n((short) (s10 ^ s11));
    }

    @kotlin.internal.f
    private static final int z(short s10, int i10) {
        return Integer.divideUnsigned(u1.n(s10 & f312492d), i10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(e2 e2Var) {
        return Intrinsics.compare(x0() & f312492d, e2Var.x0() & f312492d);
    }

    public boolean equals(Object obj) {
        return t(this.f312495a, obj);
    }

    public int hashCode() {
        return H(this.f312495a);
    }

    @NotNull
    public String toString() {
        return s0(this.f312495a);
    }

    public final /* synthetic */ short x0() {
        return this.f312495a;
    }
}
