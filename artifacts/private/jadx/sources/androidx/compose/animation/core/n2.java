package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,346:1\n345#1:347\n345#1:349\n342#1:351\n345#1:352\n345#1:354\n342#1:356\n150#2:348\n150#2:350\n150#2:353\n150#2:355\n150#2:357\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n172#1:347\n173#1:349\n212#1:351\n246#1:352\n247#1:354\n292#1:356\n172#1:348\n173#1:350\n246#1:353\n247#1:355\n345#1:357\n*E\n"})
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f13215a = 9223372036854L;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final long a(double d10, double d11, double d12, double d13, double d14) {
        double dSqrt = 2.0d * d11 * Math.sqrt(d10);
        double d15 = (dSqrt * dSqrt) - (4.0d * d10);
        double dSqrt2 = d15 < 0.0d ? 0.0d : Math.sqrt(d15);
        double d16 = -dSqrt;
        return e((d16 + dSqrt2) * 0.5d, (d15 < 0.0d ? Math.sqrt(Math.abs(d15)) : 0.0d) * 0.5d, (d16 - dSqrt2) * 0.5d, d11, d12, d13, d14);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final long b(double d10, double d11, double d12, double d13, double d14, double d15) {
        double dSqrt = d11 / (Math.sqrt(d10 * d12) * 2.0d);
        double d16 = (d11 * d11) - ((4.0d * d12) * d10);
        double d17 = 1.0d / (2.0d * d12);
        double dSqrt2 = d16 < 0.0d ? 0.0d : Math.sqrt(d16);
        double d18 = -d11;
        return e((d18 + dSqrt2) * d17, (d16 < 0.0d ? Math.sqrt(Math.abs(d16)) : 0.0d) * d17, (d18 - dSqrt2) * d17, dSqrt, d13, d14, d15);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final long c(float f10, float f11, float f12, float f13, float f14) {
        return f11 == 0.0f ? f13215a : a(f10, f11, f12, f13, f14);
    }

    private static final double d(double d10, double d11, double d12, double d13) {
        double d14 = d13;
        double d15 = d10 * d11;
        double d16 = d12 - d15;
        double dLog = Math.log(Math.abs(d14 / d11)) / d10;
        double dLog2 = Math.log(Math.abs(d14 / d16));
        int i10 = 0;
        double dLog3 = dLog2;
        for (int i11 = 0; i11 < 6; i11++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d10));
        }
        double d17 = dLog3 / d10;
        if (!((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L)) {
            dLog = d17;
        } else if ((Double.doubleToRawLongBits(d17) & Long.MAX_VALUE) < 9218868437227405312L) {
            dLog = Math.max(dLog, d17);
        }
        double d18 = (-(d15 + d16)) / (d10 * d16);
        double d19 = d10 * d18;
        double dExp = (Math.exp(d19) * d11) + (d16 * d18 * Math.exp(d19));
        if (Double.isNaN(d18) || d18 <= 0.0d) {
            d14 = -d14;
        } else if (d18 <= 0.0d || (-dExp) >= d14) {
            dLog = (-(2.0d / d10)) - (d11 / d16);
        } else {
            if (d16 < 0.0d && d11 > 0.0d) {
                dLog = 0.0d;
            }
            d14 = -d14;
        }
        double dAbs = Double.MAX_VALUE;
        while (dAbs > 0.001d && i10 < 100) {
            i10++;
            double d20 = d10 * dLog;
            double d21 = d14;
            double dExp2 = dLog - ((((d11 + (d16 * dLog)) * Math.exp(d20)) + d14) / ((((((double) 1) + d20) * d16) + d15) * Math.exp(d20)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d14 = d21;
        }
        return dLog;
    }

    private static final long e(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        double dH;
        double d17 = d14;
        if (d15 == 0.0d && d17 == 0.0d) {
            return 0L;
        }
        if (d15 < 0.0d) {
            d17 = -d17;
        }
        double d18 = d17;
        double dAbs = Math.abs(d15);
        if (d13 > 1.0d) {
            dH = f(d10, d12, dAbs, d18, d16);
        } else {
            dH = d13 < 1.0d ? h(d10, d11, dAbs, d18, d16) : d(d10, dAbs, d18, d16);
        }
        return (long) (dH * 1000.0d);
    }

    private static final double f(double d10, double d11, double d12, double d13, double d14) {
        double d15 = d14;
        double d16 = d10 - d11;
        double d17 = ((d10 * d12) - d13) / d16;
        double d18 = d12 - d17;
        double dLog = Math.log(Math.abs(d15 / d18)) / d10;
        double dLog2 = Math.log(Math.abs(d15 / d17)) / d11;
        if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L) {
            if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog = Math.max(dLog, dLog2);
            }
        } else {
            dLog = dLog2;
        }
        double d19 = d18 * d10;
        double dLog3 = Math.log(d19 / ((-d17) * d11)) / (d11 - d10);
        if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
            d15 = -d15;
        } else if (dLog3 <= 0.0d || (-g(d18, d10, dLog3, d17, d11)) >= d15) {
            dLog = Math.log((-((d17 * d11) * d11)) / (d19 * d10)) / d16;
        } else {
            if (d17 > 0.0d && d18 < 0.0d) {
                dLog = 0.0d;
            }
            d15 = -d15;
        }
        double d20 = d17 * d11;
        if (Math.abs((Math.exp(d10 * dLog) * d19) + (Math.exp(d11 * dLog) * d20)) < 1.0E-4d) {
            return dLog;
        }
        double dAbs = Double.MAX_VALUE;
        int i10 = 0;
        while (dAbs > 0.001d && i10 < 100) {
            i10++;
            double d21 = d10 * dLog;
            double d22 = d11 * dLog;
            double dExp = dLog - ((((Math.exp(d21) * d18) + (Math.exp(d22) * d17)) + d15) / ((Math.exp(d21) * d19) + (Math.exp(d22) * d20)));
            dAbs = Math.abs(dLog - dExp);
            dLog = dExp;
        }
        return dLog;
    }

    private static final double g(double d10, double d11, double d12, double d13, double d14) {
        return (d10 * Math.exp(d11 * d12)) + (d13 * Math.exp(d14 * d12));
    }

    private static final double h(double d10, double d11, double d12, double d13, double d14) {
        double d15 = (d13 - (d10 * d12)) / d11;
        return Math.log(d14 / Math.sqrt((d12 * d12) + (d15 * d15))) / d10;
    }

    private static final boolean i(double d10) {
        return !((Double.doubleToRawLongBits(d10) & Long.MAX_VALUE) < 9218868437227405312L);
    }

    private static final double j(double d10, Function1<? super Double, Double> function1, Function1<? super Double, Double> function2) {
        return d10 - (function1.invoke(Double.valueOf(d10)).doubleValue() / function2.invoke(Double.valueOf(d10)).doubleValue());
    }
}
