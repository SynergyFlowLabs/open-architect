package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public static final float a(@NotNull g0<Float> g0Var, float f10, float f11) {
        return ((s) g0Var.a(t4.P(kotlin.jvm.internal.z.f312833a)).d(x.a(f10), x.a(f11))).f();
    }

    public static final <T, V extends w> T b(@NotNull g0<T> g0Var, @NotNull z3<T, V> z3Var, T t10, T t11) {
        return (T) z3Var.b().invoke(g0Var.a(z3Var).d(z3Var.a().invoke(t10), z3Var.a().invoke(t11)));
    }

    @NotNull
    public static final <T> g0<T> c(@androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f11) {
        return e(new c1(f10, f11));
    }

    public static /* synthetic */ g0 d(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.1f;
        }
        return c(f10, f11);
    }

    @NotNull
    public static final <T> g0<T> e(@NotNull a1 a1Var) {
        return new h0(a1Var);
    }
}
