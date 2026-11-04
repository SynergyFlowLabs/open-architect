package kotlin;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
class q0 extends p0 {
    @e1(version = "1.2")
    @kotlin.internal.f
    private static final float A0(kotlin.jvm.internal.z zVar, int i10) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return Float.intBitsToFloat(i10);
    }

    @kotlin.internal.f
    private static final boolean B0(double d10) {
        return (Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true;
    }

    @kotlin.internal.f
    private static final boolean C0(float f10) {
        return (Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true;
    }

    @kotlin.internal.f
    private static final boolean D0(double d10) {
        return Double.isInfinite(d10);
    }

    @kotlin.internal.f
    private static final boolean E0(float f10) {
        return Float.isInfinite(f10);
    }

    @kotlin.internal.f
    private static final boolean F0(double d10) {
        return Double.isNaN(d10);
    }

    @kotlin.internal.f
    private static final boolean G0(float f10) {
        return Float.isNaN(f10);
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final int H0(int i10, int i11) {
        return Integer.rotateLeft(i10, i11);
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final long I0(long j10, int i10) {
        return Long.rotateLeft(j10, i10);
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final int J0(int i10, int i11) {
        return Integer.rotateRight(i10, i11);
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final long K0(long j10, int i10) {
        return Long.rotateRight(j10, i10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final int L0(int i10) {
        return Integer.highestOneBit(i10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final long M0(long j10) {
        return Long.highestOneBit(j10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final int N0(int i10) {
        return Integer.lowestOneBit(i10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final long O0(long j10) {
        return Long.lowestOneBit(j10);
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final int P0(float f10) {
        return Float.floatToIntBits(f10);
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final long Q0(double d10) {
        return Double.doubleToLongBits(d10);
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final int R0(float f10) {
        return Float.floatToRawIntBits(f10);
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final long S0(double d10) {
        return Double.doubleToRawLongBits(d10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final int t0(int i10) {
        return Integer.numberOfLeadingZeros(i10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final int u0(long j10) {
        return Long.numberOfLeadingZeros(j10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final int v0(int i10) {
        return Integer.bitCount(i10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final int w0(long j10) {
        return Long.bitCount(j10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final int x0(int i10) {
        return Integer.numberOfTrailingZeros(i10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final int y0(long j10) {
        return Long.numberOfTrailingZeros(j10);
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final double z0(kotlin.jvm.internal.w wVar, long j10) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return Double.longBitsToDouble(j10);
    }
}
