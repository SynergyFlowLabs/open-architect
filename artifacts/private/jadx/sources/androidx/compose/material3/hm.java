package androidx.compose.material3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class hm {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28220a;

        static {
            int[] iArr = new int[d0.h1.values().length];
            try {
                iArr[d0.h1.DefaultSpatial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d0.h1.FastSpatial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d0.h1.SlowSpatial.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d0.h1.DefaultEffects.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d0.h1.FastEffects.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d0.h1.SlowEffects.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f28220a = iArr;
        }
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final <T> androidx.compose.animation.core.y0<T> a(@NotNull gm gmVar, @NotNull d0.h1 h1Var) {
        switch (a.f28220a[h1Var.ordinal()]) {
            case 1:
                return gmVar.e();
            case 2:
                return gmVar.a();
            case 3:
                return gmVar.b();
            case 4:
                return gmVar.f();
            case 5:
                return gmVar.d();
            case 6:
                return gmVar.c();
            default:
                throw new kotlin.k0();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    @NotNull
    public static final <T> androidx.compose.animation.core.y0<T> b(@NotNull d0.h1 h1Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-19828261, i10, -1, "androidx.compose.material3.value (MotionScheme.kt:288)");
        }
        androidx.compose.animation.core.y0<T> y0VarA = a(pj.f31758a.c(c0Var, 6), h1Var);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return y0VarA;
    }
}
