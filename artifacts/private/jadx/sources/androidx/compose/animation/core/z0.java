package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface z0 extends o<Float> {

    public static final class a {
        @Deprecated
        public static float a(@NotNull z0 z0Var, float f10, float f11, float f12) {
            return z0.super.f(f10, f11, f12);
        }

        @Deprecated
        @NotNull
        public static <V extends w> z4<V> b(@NotNull z0 z0Var, @NotNull z3<Float, V> z3Var) {
            return z0.super.a((z3) z3Var);
        }
    }

    float b(long j10, float f10, float f11, float f12);

    long c(float f10, float f11, float f12);

    default float f(float f10, float f11, float f12) {
        return b(c(f10, f11, f12), f10, f11, f12);
    }

    float g(long j10, float f10, float f11, float f12);

    @Override // androidx.compose.animation.core.o
    @NotNull
    default <V extends w> z4<V> a(@NotNull z3<Float, V> z3Var) {
        return new z4<>(this);
    }
}
