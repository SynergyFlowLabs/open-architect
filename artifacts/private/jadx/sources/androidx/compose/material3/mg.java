package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,815:1\n113#2:816\n113#2:817\n113#2:818\n113#2:819\n113#2:820\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonDefaults\n*L\n592#1:816\n593#1:817\n594#1:818\n595#1:819\n510#1:820\n*E\n"})
public final class mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final mg f30614a = new mg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f30615b = androidx.compose.ui.unit.h.r(36);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f30616c = 0;

    private mg() {
    }

    public static /* synthetic */ ng b(mg mgVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 4) != 0) {
            f12 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 8) != 0) {
            f13 = androidx.compose.ui.unit.h.r(0);
        }
        return mgVar.a(f10, f11, f12, f13);
    }

    @NotNull
    public final ng a(float f10, float f11, float f12, float f13) {
        return new ng(f10, f11, f12, f13, null);
    }

    @androidx.compose.runtime.o
    @NotNull
    public final ng c(float f10, float f11, float f12, float f13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = d0.o0.f268575a.b();
        }
        if ((i11 & 2) != 0) {
            f11 = d0.o0.f268575a.h();
        }
        if ((i11 & 4) != 0) {
            f12 = d0.o0.f268575a.c();
        }
        float f14 = f12;
        if ((i11 & 8) != 0) {
            f13 = d0.o0.f268575a.e();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-241106249, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:549)");
        }
        float f15 = f10;
        ng ngVar = new ng(f15, f11, f14, f13, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return ngVar;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getContainerColor")
    public final long d(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1855656391, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:529)");
        }
        long jR = o6.r(d0.o0.f268575a.a(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getExtendedFabShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 e(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-536021915, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:525)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.i0.f268209a.d(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    public final float f() {
        return f30615b;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getLargeShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 g(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1835912187, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:521)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.l0.f268412a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 h(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-53247565, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:513)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.k0.f268351a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getSmallShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 i(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(394933381, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallShape> (FloatingActionButton.kt:517)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.q0.f268692a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final ng j(float f10, float f11, float f12, float f13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = d0.e0.f267938a.b();
        }
        if ((i11 & 2) != 0) {
            f11 = d0.e0.f267938a.b();
        }
        if ((i11 & 4) != 0) {
            f12 = d0.e0.f267938a.b();
        }
        float f14 = f12;
        if ((i11 & 8) != 0) {
            f13 = d0.e0.f267938a.c();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-285065125, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation (FloatingActionButton.kt:573)");
        }
        float f15 = f10;
        ng ngVar = new ng(f15, f11, f14, f13, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return ngVar;
    }
}
