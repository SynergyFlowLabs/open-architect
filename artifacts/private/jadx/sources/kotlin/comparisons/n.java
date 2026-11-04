package kotlin.comparisons;

import kotlin.e1;
import kotlin.e2;
import kotlin.f2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.m2;
import kotlin.r1;
import kotlin.u;
import kotlin.v1;
import kotlin.z1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class n {
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static final short a(short s10, short s11) {
        return Intrinsics.compare(s10 & e2.f312492d, 65535 & s11) >= 0 ? s10 : s11;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static int b(int i10, int i11) {
        return Integer.compareUnsigned(i10, i11) >= 0 ? i10 : i11;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static final byte c(byte b10, byte b11) {
        return Intrinsics.compare(b10 & 255, b11 & 255) >= 0 ? b10 : b11;
    }

    @e1(version = "1.4")
    @u
    public static final int d(int i10, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iV = v1.v(other);
        for (int i11 = 0; i11 < iV; i11++) {
            i10 = b(i10, v1.t(other, i11));
        }
        return i10;
    }

    @e1(version = "1.4")
    @u
    public static final long e(long j10, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iV = z1.v(other);
        for (int i10 = 0; i10 < iV; i10++) {
            j10 = j(j10, z1.t(other, i10));
        }
        return j10;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final short f(short s10, short s11, short s12) {
        return a(s10, a(s11, s12));
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int g(int i10, int i11, int i12) {
        return b(i10, b(i11, i12));
    }

    @e1(version = "1.4")
    @u
    public static final byte h(byte b10, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iV = r1.v(other);
        for (int i10 = 0; i10 < iV; i10++) {
            b10 = c(b10, r1.t(other, i10));
        }
        return b10;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final byte i(byte b10, byte b11, byte b12) {
        return c(b10, c(b11, b12));
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static long j(long j10, long j11) {
        return Long.compareUnsigned(j10, j11) >= 0 ? j10 : j11;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final long k(long j10, long j11, long j12) {
        return j(j10, j(j11, j12));
    }

    @e1(version = "1.4")
    @u
    public static final short l(short s10, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iV = f2.v(other);
        for (int i10 = 0; i10 < iV; i10++) {
            s10 = a(s10, f2.t(other, i10));
        }
        return s10;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static final short m(short s10, short s11) {
        return Intrinsics.compare(s10 & e2.f312492d, 65535 & s11) <= 0 ? s10 : s11;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static int n(int i10, int i11) {
        return Integer.compareUnsigned(i10, i11) <= 0 ? i10 : i11;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static final byte o(byte b10, byte b11) {
        return Intrinsics.compare(b10 & 255, b11 & 255) <= 0 ? b10 : b11;
    }

    @e1(version = "1.4")
    @u
    public static final int p(int i10, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iV = v1.v(other);
        for (int i11 = 0; i11 < iV; i11++) {
            i10 = n(i10, v1.t(other, i11));
        }
        return i10;
    }

    @e1(version = "1.4")
    @u
    public static final long q(long j10, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iV = z1.v(other);
        for (int i10 = 0; i10 < iV; i10++) {
            j10 = v(j10, z1.t(other, i10));
        }
        return j10;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final short r(short s10, short s11, short s12) {
        return m(s10, m(s11, s12));
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int s(int i10, int i11, int i12) {
        return n(i10, n(i11, i12));
    }

    @e1(version = "1.4")
    @u
    public static final byte t(byte b10, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iV = r1.v(other);
        for (int i10 = 0; i10 < iV; i10++) {
            b10 = o(b10, r1.t(other, i10));
        }
        return b10;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final byte u(byte b10, byte b11, byte b12) {
        return o(b10, o(b11, b12));
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    public static long v(long j10, long j11) {
        return Long.compareUnsigned(j10, j11) <= 0 ? j10 : j11;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final long w(long j10, long j11, long j12) {
        return v(j10, v(j11, j12));
    }

    @e1(version = "1.4")
    @u
    public static final short x(short s10, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iV = f2.v(other);
        for (int i10 = 0; i10 < iV; i10++) {
            s10 = m(s10, f2.t(other, i10));
        }
        return s10;
    }
}
