package androidx.compose.material3.carousel;

import androidx.compose.animation.n1;
import androidx.compose.foundation.gestures.e5;
import androidx.compose.material3.af;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@af
@SourceDebugExtension({"SMAP\nCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,865:1\n1282#2,6:866\n113#3:872\n113#3:873\n113#3:874\n*S KotlinDebug\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselDefaults\n*L\n847#1:866,6\n857#1:872\n860#1:873\n862#1:874\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f26546a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f26547b = androidx.compose.ui.unit.h.r(40);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f26548c = androidx.compose.ui.unit.h.r(56);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f26549d = androidx.compose.ui.unit.h.r(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f26550e = 0.85f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26551f = 0;

    public static final class a implements androidx.compose.foundation.pager.b1 {
        a() {
        }

        @Override // androidx.compose.foundation.pager.b1
        public int a(int i10, int i11, float f10, int i12, int i13) {
            return i11;
        }
    }

    public static final class b implements androidx.compose.foundation.gestures.snapping.n {
        b() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.n
        public float a(float f10) {
            return 0.0f;
        }
    }

    private c() {
    }

    public final float a() {
        return f26549d;
    }

    public final float b() {
        return f26548c;
    }

    public final float c() {
        return f26547b;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final e5 d(@NotNull j0 j0Var, @Nullable androidx.compose.animation.core.g0<Float> g0Var, @Nullable androidx.compose.animation.core.o<Float> oVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            g0Var = n1.b(c0Var, 0);
        }
        androidx.compose.animation.core.g0<Float> g0Var2 = g0Var;
        if ((i11 & 4) != 0) {
            oVar = androidx.compose.animation.core.p.r(0.0f, 400.0f, null, 5, null);
        }
        androidx.compose.animation.core.o<Float> oVar2 = oVar;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1105043293, i10, -1, "androidx.compose.material3.carousel.CarouselDefaults.multiBrowseFlingBehavior (Carousel.kt:816)");
        }
        e5 e5VarB = androidx.compose.foundation.pager.v.f18478a.b(j0Var.w(), new a(), g0Var2, oVar2, 0.0f, c0Var, ((i10 << 3) & 8064) | (androidx.compose.foundation.pager.v.f18480c << 15), 16);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return e5VarB;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final e5 e(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-418415756, i10, -1, "androidx.compose.material3.carousel.CarouselDefaults.noSnapFlingBehavior (Carousel.kt:845)");
        }
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new b();
            c0Var.Y(objI0);
        }
        e5 e5VarS = androidx.compose.foundation.gestures.snapping.m.s((b) objI0, c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return e5VarS;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final e5 f(@NotNull j0 j0Var, @Nullable androidx.compose.animation.core.o<Float> oVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = androidx.compose.animation.core.p.r(0.0f, 400.0f, null, 5, null);
        }
        androidx.compose.animation.core.o<Float> oVar2 = oVar;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1701587199, i10, -1, "androidx.compose.material3.carousel.CarouselDefaults.singleAdvanceFlingBehavior (Carousel.kt:783)");
        }
        e5 e5VarB = androidx.compose.foundation.pager.v.f18478a.b(j0Var.w(), androidx.compose.foundation.pager.b1.f18186a.a(1), null, oVar2, 0.0f, c0Var, ((i10 << 6) & 7168) | (androidx.compose.foundation.pager.v.f18480c << 15), 20);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return e5VarB;
    }
}
