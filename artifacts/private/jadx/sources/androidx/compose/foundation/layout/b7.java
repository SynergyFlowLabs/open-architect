package androidx.compose.foundation.layout;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n75#2:716\n113#3:717\n113#3:718\n113#3:719\n113#3:720\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n*L\n221#1:716\n255#1:717\n256#1:718\n257#1:719\n258#1:720\n*E\n"})
public final class b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final z1 f15936a = new z1(0, 0, 0, 0);

    @NotNull
    public static final v6 a() {
        return f15936a;
    }

    @NotNull
    public static final v6 b(int i10, int i11, int i12, int i13) {
        return new z1(i10, i11, i12, i13);
    }

    public static /* synthetic */ v6 c(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return b(i10, i11, i12, i13);
    }

    @NotNull
    public static final v6 d(float f10, float f11, float f12, float f13) {
        return new y1(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ v6 e(float f10, float f11, float f12, float f13, int i10, Object obj) {
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
        return d(f10, f11, f12, f13);
    }

    @NotNull
    public static final v6 f(@NotNull v6 v6Var, @NotNull v6 v6Var2) {
        return new a(v6Var, v6Var2);
    }

    @NotNull
    public static final v6 g(@NotNull g5 g5Var) {
        return new j5(g5Var);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    @NotNull
    public static final g5 h(@NotNull v6 v6Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1485016250, i10, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:220)");
        }
        z3 z3Var = new z3(v6Var, (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m()));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return z3Var;
    }

    @NotNull
    public static final g5 i(@NotNull v6 v6Var, @NotNull androidx.compose.ui.unit.d dVar) {
        return new z3(v6Var, dVar);
    }

    @NotNull
    public static final v6 j(@NotNull v6 v6Var, @NotNull v6 v6Var2) {
        return new t1(v6Var, v6Var2);
    }

    @NotNull
    public static final v6 k(@NotNull v6 v6Var, int i10) {
        return new m4(v6Var, i10, null);
    }

    @NotNull
    public static final v6 l(@NotNull v6 v6Var, @NotNull v6 v6Var2) {
        return new p6(v6Var, v6Var2);
    }
}
