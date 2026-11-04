package androidx.compose.animation.core;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulation\n+ 2 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulationKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,152:1\n38#2:153\n53#3,3:154\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulation\n*L\n149#1:153\n149#1:154,3\n*E\n"})
public final class o2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13217d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f13218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f13219b = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f13220c = 1.0f;

    public o2(float f10) {
        this.f13218a = f10;
    }

    public final float a(float f10, float f11) {
        float f12 = f10 - this.f13218a;
        double d10 = this.f13219b;
        return (float) (((-(d10 * d10)) * ((double) f12)) - (((d10 * 2.0d) * ((double) this.f13220c)) * ((double) f11)));
    }

    public final float b() {
        return this.f13220c;
    }

    public final float c() {
        return this.f13218a;
    }

    public final float d() {
        double d10 = this.f13219b;
        return (float) (d10 * d10);
    }

    public final void e(float f10) {
        if (f10 < 0.0f) {
            c2.d("Damping ratio must be non-negative");
        }
        this.f13220c = f10;
    }

    public final void f(float f10) {
        this.f13218a = f10;
    }

    public final void g(float f10) {
        if (d() <= 0.0f) {
            c2.d("Spring stiffness constant must be positive.");
        }
        this.f13219b = Math.sqrt(f10);
    }

    public final long h(float f10, float f11, long j10) {
        double dExp;
        double dExp2;
        float f12 = f10 - this.f13218a;
        double d10 = j10 / 1000.0d;
        float f13 = this.f13220c;
        double d11 = ((double) f13) * ((double) f13);
        double d12 = this.f13219b;
        double d13 = ((double) (-f13)) * d12;
        if (f13 > 1.0f) {
            double dSqrt = d12 * Math.sqrt(d11 - ((double) 1));
            double d14 = d13 + dSqrt;
            double d15 = d13 - dSqrt;
            double d16 = f12;
            double d17 = ((d15 * d16) - ((double) f11)) / (d15 - d14);
            double d18 = d16 - d17;
            double d19 = d15 * d10;
            double d20 = d10 * d14;
            dExp2 = (Math.exp(d19) * d18) + (Math.exp(d20) * d17);
            dExp = (d18 * d15 * Math.exp(d19)) + (d17 * d14 * Math.exp(d20));
        } else if (f13 == 1.0f) {
            double d21 = f12;
            double d22 = ((double) f11) + (d12 * d21);
            double d23 = (-d12) * d10;
            double d24 = d21 + (d10 * d22);
            dExp2 = d24 * Math.exp(d23);
            dExp = (d24 * Math.exp(d23) * (-this.f13219b)) + (d22 * Math.exp(d23));
        } else {
            double d25 = 1;
            double dSqrt2 = d12 * Math.sqrt(d25 - d11);
            double d26 = f12;
            double d27 = (d25 / dSqrt2) * (((-d13) * d26) + ((double) f11));
            double d28 = dSqrt2 * d10;
            double d29 = d10 * d13;
            double dExp3 = Math.exp(d29) * ((Math.cos(d28) * d26) + (Math.sin(d28) * d27));
            dExp = (d13 * dExp3) + (Math.exp(d29) * (((-dSqrt2) * d26 * Math.sin(d28)) + (dSqrt2 * d27 * Math.cos(d28))));
            dExp2 = dExp3;
        }
        return v1.b((((long) Float.floatToRawIntBits((float) dExp)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits((float) (dExp2 + ((double) this.f13218a))) << 32));
    }
}
