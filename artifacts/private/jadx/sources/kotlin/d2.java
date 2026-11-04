package kotlin;

/* JADX INFO: loaded from: classes11.dex */
@oj.i(name = "UNumbersKt")
public final class d2 {
    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int A(int i10) {
        return u1.n(Integer.lowestOneBit(i10));
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final short B(short s10) {
        return e2.n((short) Integer.lowestOneBit(s10 & e2.f312492d));
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int a(byte b10) {
        return Integer.numberOfLeadingZeros(b10 & 255) - 24;
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int b(long j10) {
        return Long.numberOfLeadingZeros(j10);
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int c(int i10) {
        return Integer.numberOfLeadingZeros(i10);
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int d(short s10) {
        return Integer.numberOfLeadingZeros(s10 & e2.f312492d) - 16;
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int e(byte b10) {
        return Integer.bitCount(u1.n(b10 & 255));
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int f(long j10) {
        return Long.bitCount(j10);
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int g(int i10) {
        return Integer.bitCount(i10);
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int h(short s10) {
        return Integer.bitCount(u1.n(s10 & e2.f312492d));
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int i(byte b10) {
        return Integer.numberOfTrailingZeros(b10 | 256);
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int j(long j10) {
        return Long.numberOfTrailingZeros(j10);
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int k(int i10) {
        return Integer.numberOfTrailingZeros(i10);
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int l(short s10) {
        return Integer.numberOfTrailingZeros(s10 | 65536);
    }

    @m2(markerClass = {s.class, u.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final long m(long j10, int i10) {
        return y1.n(Long.rotateLeft(j10, i10));
    }

    @m2(markerClass = {s.class, u.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final byte n(byte b10, int i10) {
        return q1.n(r0.Z0(b10, i10));
    }

    @m2(markerClass = {s.class, u.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final int o(int i10, int i11) {
        return u1.n(Integer.rotateLeft(i10, i11));
    }

    @m2(markerClass = {s.class, u.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final short p(short s10, int i10) {
        return e2.n(r0.a1(s10, i10));
    }

    @m2(markerClass = {s.class, u.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final long q(long j10, int i10) {
        return y1.n(Long.rotateRight(j10, i10));
    }

    @m2(markerClass = {s.class, u.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final byte r(byte b10, int i10) {
        return q1.n(r0.b1(b10, i10));
    }

    @m2(markerClass = {s.class, u.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final int s(int i10, int i11) {
        return u1.n(Integer.rotateRight(i10, i11));
    }

    @m2(markerClass = {s.class, u.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final short t(short s10, int i10) {
        return e2.n(r0.c1(s10, i10));
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final byte u(byte b10) {
        return q1.n((byte) Integer.highestOneBit(b10 & 255));
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final long v(long j10) {
        return y1.n(Long.highestOneBit(j10));
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int w(int i10) {
        return u1.n(Integer.highestOneBit(i10));
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final short x(short s10) {
        return e2.n((short) Integer.highestOneBit(s10 & e2.f312492d));
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final byte y(byte b10) {
        return q1.n((byte) Integer.lowestOneBit(b10 & 255));
    }

    @m2(markerClass = {u.class, s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final long z(long j10) {
        return y1.n(Long.lowestOneBit(j10));
    }
}
