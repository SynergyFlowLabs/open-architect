package androidx.compose.ui.util;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nMathHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,339:1\n69#1,6:341\n87#1,6:347\n105#1,6:353\n123#1,6:359\n306#1,4:366\n28#2:340\n22#2:365\n*S KotlinDebug\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n65#1:341,6\n83#1:347,6\n101#1:353,6\n119#1:359,6\n338#1:366,4\n31#1:340\n271#1:365\n*E\n"})
public final class e {
    public static final float a(float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f10)) & 8589934591L) / ((long) 3))) + 709952852);
        float f11 = fIntBitsToFloat - ((fIntBitsToFloat - (f10 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    public static final double b(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static final float c(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static final int d(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static final long e(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static final double f(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static final float g(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static final int h(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static final long i(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static final double j(double d10, double d11, double d12) {
        if (d10 < d11) {
            d10 = d11;
        }
        return d10 > d12 ? d12 : d10;
    }

    public static final float k(float f10, float f11, float f12) {
        if (f10 < f11) {
            f10 = f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    public static final int l(int i10, int i11, int i12) {
        if (i10 < i11) {
            i10 = i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public static final long m(long j10, long j11, long j12) {
        if (j10 < j11) {
            j10 = j11;
        }
        return j10 > j12 ? j12 : j10;
    }

    public static final boolean n(double d10) {
        return (Double.doubleToRawLongBits(d10) & Long.MAX_VALUE) < 9218868437227405312L;
    }

    public static final boolean o(float f10) {
        return (Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final float p(float f10, float f11, float f12, float f13) {
        return Math.max(f10, Math.max(f11, Math.max(f12, f13)));
    }

    public static final float q(float f10, float f11, float f12, float f13) {
        return Math.min(f10, Math.min(f11, Math.min(f12, f13)));
    }

    public static final float r(float f10, float f11, float f12) {
        return ((1 - f12) * f10) + (f12 * f11);
    }

    public static final int s(int i10, int i11, float f10) {
        return i10 + ((int) Math.round(((double) (i11 - i10)) * ((double) f10)));
    }

    public static final long t(long j10, long j11, float f10) {
        return j10 + kotlin.math.b.M0((j11 - j10) * ((double) f10));
    }

    public static final float u(float f10) {
        float f11 = f10 + 0.25f;
        float fFloor = f11 - ((float) Math.floor(0.5f + f11));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f12 = 1.0f - fAbs;
        return ((fFloor * 8.0f) * f12) / (1.25f - (fAbs * f12));
    }

    public static final float v(float f10) {
        float fFloor = f10 - ((float) Math.floor(0.5f + f10));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f11 = 1.0f - fAbs;
        return ((fFloor * 8.0f) * f11) / (1.25f - (fAbs * f11));
    }
}
