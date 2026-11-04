package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@oj.g
@m2(markerClass = {u.class})
@e1(version = "1.5")
public final class q1 implements Comparable<q1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f312878b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte f312879c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte f312880d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f312881e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f312882f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f312883a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        boolean z10 = true & false;
    }

    @kotlin.internal.g
    @a1
    private /* synthetic */ q1(byte b10) {
        this.f312883a = b10;
    }

    @kotlin.internal.f
    private static final int D(byte b10, short s10) {
        return Integer.divideUnsigned(u1.n(b10 & 255), u1.n(s10 & e2.f312492d));
    }

    @a1
    public static /* synthetic */ void E() {
    }

    public static int H(byte b10) {
        return Byte.hashCode(b10);
    }

    @kotlin.internal.f
    private static final byte I(byte b10) {
        return n((byte) (b10 + 1));
    }

    @kotlin.internal.f
    private static final byte L(byte b10) {
        return n((byte) (~b10));
    }

    @kotlin.internal.f
    private static final int M(byte b10, byte b11) {
        return u1.n(u1.n(b10 & 255) - u1.n(b11 & 255));
    }

    @kotlin.internal.f
    private static final long N(byte b10, long j10) {
        return y1.n(y1.n(((long) b10) & 255) - j10);
    }

    @kotlin.internal.f
    private static final int O(byte b10, int i10) {
        return u1.n(u1.n(b10 & 255) - i10);
    }

    @kotlin.internal.f
    private static final int R(byte b10, short s10) {
        return u1.n(u1.n(b10 & 255) - u1.n(s10 & e2.f312492d));
    }

    @kotlin.internal.f
    private static final byte S(byte b10, byte b11) {
        return n((byte) Integer.remainderUnsigned(u1.n(b10 & 255), u1.n(b11 & 255)));
    }

    @kotlin.internal.f
    private static final long T(byte b10, long j10) {
        return Long.remainderUnsigned(y1.n(((long) b10) & 255), j10);
    }

    @kotlin.internal.f
    private static final int U(byte b10, int i10) {
        return Integer.remainderUnsigned(u1.n(b10 & 255), i10);
    }

    @kotlin.internal.f
    private static final short V(byte b10, short s10) {
        return e2.n((short) Integer.remainderUnsigned(u1.n(b10 & 255), u1.n(s10 & e2.f312492d)));
    }

    @kotlin.internal.f
    private static final byte W(byte b10, byte b11) {
        return n((byte) (b10 | b11));
    }

    @kotlin.internal.f
    private static final int X(byte b10, byte b11) {
        return u1.n(u1.n(b10 & 255) + u1.n(b11 & 255));
    }

    @kotlin.internal.f
    private static final long Y(byte b10, long j10) {
        return y1.n(y1.n(((long) b10) & 255) + j10);
    }

    @kotlin.internal.f
    private static final int Z(byte b10, int i10) {
        return u1.n(u1.n(b10 & 255) + i10);
    }

    @kotlin.internal.f
    private static final int a0(byte b10, short s10) {
        return u1.n(u1.n(b10 & 255) + u1.n(s10 & e2.f312492d));
    }

    @kotlin.internal.f
    private static final byte b(byte b10, byte b11) {
        return n((byte) (b10 & b11));
    }

    public static final /* synthetic */ q1 c(byte b10) {
        return new q1(b10);
    }

    @kotlin.internal.f
    private static final kotlin.ranges.w c0(byte b10, byte b11) {
        return new kotlin.ranges.w(u1.n(b10 & 255), u1.n(b11 & 255), null);
    }

    @kotlin.internal.f
    private int d(byte b10) {
        return Intrinsics.compare(x0() & 255, b10 & 255);
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.9")
    @kotlin.internal.f
    private static final kotlin.ranges.w d0(byte b10, byte b11) {
        return kotlin.ranges.a0.V(u1.n(b10 & 255), u1.n(b11 & 255));
    }

    @kotlin.internal.f
    private static int e(byte b10, byte b11) {
        return Intrinsics.compare(b10 & 255, b11 & 255);
    }

    @kotlin.internal.f
    private static final int e0(byte b10, byte b11) {
        return Integer.remainderUnsigned(u1.n(b10 & 255), u1.n(b11 & 255));
    }

    @kotlin.internal.f
    private static final int f(byte b10, long j10) {
        return Long.compareUnsigned(y1.n(((long) b10) & 255), j10);
    }

    @kotlin.internal.f
    private static final long f0(byte b10, long j10) {
        return Long.remainderUnsigned(y1.n(((long) b10) & 255), j10);
    }

    @kotlin.internal.f
    private static final int g0(byte b10, int i10) {
        return Integer.remainderUnsigned(u1.n(b10 & 255), i10);
    }

    @kotlin.internal.f
    private static final int h0(byte b10, short s10) {
        return Integer.remainderUnsigned(u1.n(b10 & 255), u1.n(s10 & e2.f312492d));
    }

    @kotlin.internal.f
    private static final int i0(byte b10, byte b11) {
        return u1.n(u1.n(b10 & 255) * u1.n(b11 & 255));
    }

    @kotlin.internal.f
    private static final long j0(byte b10, long j10) {
        return y1.n(y1.n(((long) b10) & 255) * j10);
    }

    @kotlin.internal.f
    private static final int k(byte b10, int i10) {
        return Integer.compareUnsigned(u1.n(b10 & 255), i10);
    }

    @kotlin.internal.f
    private static final int k0(byte b10, int i10) {
        return u1.n(u1.n(b10 & 255) * i10);
    }

    @kotlin.internal.f
    private static final int l(byte b10, short s10) {
        return Intrinsics.compare(b10 & 255, s10 & e2.f312492d);
    }

    @kotlin.internal.f
    private static final int l0(byte b10, short s10) {
        return u1.n(u1.n(b10 & 255) * u1.n(s10 & e2.f312492d));
    }

    @kotlin.internal.f
    private static final byte m0(byte b10) {
        return b10;
    }

    @kotlin.internal.g
    @a1
    public static byte n(byte b10) {
        return b10;
    }

    @kotlin.internal.f
    private static final double n0(byte b10) {
        return l2.h(b10 & 255);
    }

    @kotlin.internal.f
    private static final byte o(byte b10) {
        return n((byte) (b10 - 1));
    }

    @kotlin.internal.f
    private static final float o0(byte b10) {
        return (float) l2.h(b10 & 255);
    }

    @kotlin.internal.f
    private static final int p(byte b10, byte b11) {
        return Integer.divideUnsigned(u1.n(b10 & 255), u1.n(b11 & 255));
    }

    @kotlin.internal.f
    private static final int p0(byte b10) {
        return b10 & 255;
    }

    @kotlin.internal.f
    private static final long q(byte b10, long j10) {
        return Long.divideUnsigned(y1.n(((long) b10) & 255), j10);
    }

    @kotlin.internal.f
    private static final long q0(byte b10) {
        return ((long) b10) & 255;
    }

    @kotlin.internal.f
    private static final int r(byte b10, int i10) {
        return Integer.divideUnsigned(u1.n(b10 & 255), i10);
    }

    @kotlin.internal.f
    private static final short r0(byte b10) {
        return (short) (b10 & 255);
    }

    @kotlin.internal.f
    private static final int s(byte b10, short s10) {
        return Integer.divideUnsigned(u1.n(b10 & 255), u1.n(s10 & e2.f312492d));
    }

    @NotNull
    public static String s0(byte b10) {
        return String.valueOf(b10 & 255);
    }

    public static boolean t(byte b10, Object obj) {
        return (obj instanceof q1) && b10 == ((q1) obj).x0();
    }

    @kotlin.internal.f
    private static final byte t0(byte b10) {
        return b10;
    }

    @kotlin.internal.f
    private static final int u0(byte b10) {
        return u1.n(b10 & 255);
    }

    public static final boolean v(byte b10, byte b11) {
        return b10 == b11;
    }

    @kotlin.internal.f
    private static final long v0(byte b10) {
        return y1.n(((long) b10) & 255);
    }

    @kotlin.internal.f
    private static final int w(byte b10, byte b11) {
        return Integer.divideUnsigned(u1.n(b10 & 255), u1.n(b11 & 255));
    }

    @kotlin.internal.f
    private static final short w0(byte b10) {
        return e2.n((short) (b10 & 255));
    }

    @kotlin.internal.f
    private static final long x(byte b10, long j10) {
        return Long.divideUnsigned(y1.n(((long) b10) & 255), j10);
    }

    @kotlin.internal.f
    private static final byte y0(byte b10, byte b11) {
        return n((byte) (b10 ^ b11));
    }

    @kotlin.internal.f
    private static final int z(byte b10, int i10) {
        return Integer.divideUnsigned(u1.n(b10 & 255), i10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(q1 q1Var) {
        return Intrinsics.compare(x0() & 255, q1Var.x0() & 255);
    }

    public boolean equals(Object obj) {
        return t(this.f312883a, obj);
    }

    public int hashCode() {
        return H(this.f312883a);
    }

    @NotNull
    public String toString() {
        return s0(this.f312883a);
    }

    public final /* synthetic */ byte x0() {
        return this.f312883a;
    }
}
