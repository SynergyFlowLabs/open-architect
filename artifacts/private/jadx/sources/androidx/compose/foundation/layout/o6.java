package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class o6 implements androidx.compose.animation.core.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f16265a;

    public o6(@NotNull androidx.compose.ui.unit.d dVar) {
        this.f16265a = dVar.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    private final double g(float f10) {
        return g.f16024a.a(f10, y6.f16580b * this.f16265a);
    }

    @Override // androidx.compose.animation.core.a1
    public float a() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.a1
    public float b(long j10, float f10, float f11) {
        long jC = c(0.0f, f11);
        return ((g.a.f(g.f16024a.b(jC > 0 ? j10 / jC : 1.0f)) * f(f11)) / jC) * 1.0E9f;
    }

    @Override // androidx.compose.animation.core.a1
    public long c(float f10, float f11) {
        return (long) (Math.exp(g(f11) / y6.f16584f) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.a1
    public float d(float f10, float f11) {
        return f10 + f(f11);
    }

    @Override // androidx.compose.animation.core.a1
    public float e(long j10, float f10, float f11) {
        long jC = c(0.0f, f11);
        return f10 + (f(f11) * g.a.e(g.f16024a.b(jC > 0 ? j10 / jC : 1.0f)));
    }

    public final float f(float f10) {
        return ((float) (((double) (y6.f16580b * this.f16265a)) * Math.exp((y6.f16583e / y6.f16584f) * g(f10)))) * Math.signum(f10);
    }
}
