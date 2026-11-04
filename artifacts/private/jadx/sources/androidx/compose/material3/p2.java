package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/BottomAppBarDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,3517:1\n1282#2,6:3518\n1282#2,6:3524\n113#3:3530\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/BottomAppBarDefaults\n*L\n2204#1:3518,6\n2209#1:3524,6\n2132#1:3530\n*E\n"})
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p2 f31530a = new p2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f31531b = androidx.compose.ui.unit.h.r(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f31532c = androidx.compose.foundation.layout.d5.j(o1.f31220a, o1.W0(), o1.f31220a, 0.0f, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f31533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f31534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.q.e f31535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.q.e f31536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f31537h = 0;

    static {
        int i10 = (2 >> 0) | 0;
        d0.a0 a0Var = d0.a0.f267544a;
        f31533d = androidx.compose.foundation.layout.d5.j(a0Var.c(), 0.0f, a0Var.g(), 0.0f, 10, null);
        f31534e = a0Var.b();
        androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
        f31535f = qVar.s();
        f31536g = qVar.H(a0Var.d(), androidx.compose.ui.e.f37317a.m());
    }

    private p2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c() {
        return true;
    }

    @androidx.compose.runtime.o
    @af
    @NotNull
    public final q2 b(@Nullable t2 t2Var, @Nullable Function0<Boolean> function0, @Nullable androidx.compose.animation.core.o<Float> oVar, @Nullable androidx.compose.animation.core.g0<Float> g0Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        androidx.compose.runtime.c0 c0Var2;
        if ((i11 & 1) != 0) {
            c0Var2 = c0Var;
            t2Var = o1.c1(0.0f, 0.0f, 0.0f, c0Var2, 0, 7);
        } else {
            c0Var2 = c0Var;
        }
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var2.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.o2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(p2.c());
                    }
                };
                c0Var2.Y(objI0);
            }
            function0 = (Function0) objI0;
        }
        if ((i11 & 4) != 0) {
            oVar = hm.b(d0.h1.FastSpatial, c0Var2, 6);
        }
        if ((i11 & 8) != 0) {
            g0Var = androidx.compose.animation.n1.b(c0Var2, 0);
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(457144034, i10, -1, "androidx.compose.material3.BottomAppBarDefaults.exitAlwaysScrollBehavior (AppBar.kt:2208)");
        }
        boolean zD = ((((i10 & 14) ^ 6) > 4 && c0Var2.D(t2Var)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var2.D(function0)) || (i10 & 48) == 32) | c0Var2.D(oVar) | c0Var2.D(g0Var);
        Object objI1 = c0Var2.i0();
        if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new xe(t2Var, oVar, g0Var, function0);
            c0Var2.Y(objI1);
        }
        xe xeVar = (xe) objI1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return xeVar;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getBottomAppBarFabColor")
    public final long d(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1464561486, i10, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-bottomAppBarFabColor> (AppBar.kt:2155)");
        }
        long jR = o6.r(d0.p0.f268627a.a(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getContainerColor")
    public final long e(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-368340078, i10, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-containerColor> (AppBar.kt:2128)");
        }
        long jR = o6.r(d0.j.f268294a.a(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    public final float f() {
        return f31531b;
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 g() {
        return f31532c;
    }

    public final float h() {
        return f31534e;
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 i() {
        return f31533d;
    }

    @NotNull
    public final androidx.compose.foundation.layout.q.e j() {
        return f31536g;
    }

    @NotNull
    public final androidx.compose.foundation.layout.q.e k() {
        return f31535f;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getWindowInsets")
    @NotNull
    public final androidx.compose.foundation.layout.v6 l(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            int i11 = 7 ^ (-1);
            androidx.compose.runtime.m0.A0(688896409, i10, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-windowInsets> (AppBar.kt:2147)");
        }
        androidx.compose.foundation.layout.v6 v6VarA = androidx.compose.material3.internal.o3.a(androidx.compose.foundation.layout.v6.f16495a, c0Var, 6);
        androidx.compose.foundation.layout.v7.a aVar = androidx.compose.foundation.layout.v7.f16497b;
        androidx.compose.foundation.layout.v6 v6VarK = androidx.compose.foundation.layout.b7.k(v6VarA, androidx.compose.foundation.layout.v7.s(aVar.g(), aVar.e()));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v6VarK;
    }
}
