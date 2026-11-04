package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3517:1\n1#2:3518\n1282#3,6:3519\n1282#3,6:3525\n1282#3,6:3531\n1282#3,6:3537\n1282#3,6:3543\n1282#3,6:3549\n1282#3,6:3555\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarDefaults\n*L\n1694#1:3519,6\n1696#1:3525,6\n1720#1:3531,6\n1757#1:3537,6\n1763#1:3543,6\n1797#1:3549,6\n1802#1:3555,6\n*E\n"})
public final class z90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z90 f34997a = new z90();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f34998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f34999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f35000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f35001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f35002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f35003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f35004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f35005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f35006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f35007k = 0;

    static {
        d0.e eVar = d0.e.f267933a;
        f34998b = eVar.a();
        f34999c = eVar.a();
        f35000d = d0.d.f267788a.a();
        d0.c cVar = d0.c.f267710a;
        f35001e = cVar.a();
        f35002f = cVar.b();
        f35003g = eVar.a();
        f35004h = d0.b.f267617a.a();
        d0.a aVar = d0.a.f267538a;
        f35005i = aVar.a();
        f35006j = aVar.b();
    }

    private z90() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l() {
        return true;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Use topAppBarColors instead", replaceWith = @kotlin.b1(expression = "topAppBarColors(containerColor, scrolledContainerColor, navigationIconContentColor, titleContentColor, actionIconContentColor)", imports = {}))
    @NotNull
    public final u90 A(long j10, long j11, long j12, long j13, long j14, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-582474442, i10, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:1620)");
        }
        u90 u90VarC = u90.c(m(pj.f31758a.a(c0Var, 6)), jU, jU2, jU3, jU4, jU5, 0L, 32, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return u90VarC;
    }

    @androidx.compose.runtime.o
    @af
    @NotNull
    public final ca0 B(@Nullable fa0 fa0Var, @Nullable Function0<Boolean> function0, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        androidx.compose.runtime.c0 c0Var2;
        if ((i11 & 1) != 0) {
            c0Var2 = c0Var;
            fa0Var = o1.e1(0.0f, 0.0f, 0.0f, c0Var2, 0, 7);
        } else {
            c0Var2 = c0Var;
        }
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var2.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.x90
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(z90.C());
                    }
                };
                c0Var2.Y(objI0);
            }
            function0 = (Function0) objI0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(286497075, i10, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:1695)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && c0Var2.D(fa0Var)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var2.D(function0)) || (i10 & 48) == 32);
        Object objI1 = c0Var2.i0();
        if (z10 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new hr(fa0Var, function0);
            c0Var2.Y(objI1);
        }
        hr hrVar = (hr) objI1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return hrVar;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final u90 D(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1388520854, i10, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:1444)");
        }
        u90 u90VarM = m(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return u90VarM;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final u90 E(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1325733438, i10, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:1467)");
        }
        u90 u90VarB = m(pj.f31758a.a(c0Var, 6)).b(jU, jU2, jU3, jU4, jU5, jU6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return u90VarB;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility in favor of topAppBarColors with subtitleContentColor")
    public final /* synthetic */ u90 F(long j10, long j11, long j12, long j13, long j14, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2142919275, i10, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:1499)");
        }
        u90 u90VarE = E(jU, jU2, jU3, jU4, jU5, jU4, c0Var, (65534 & i10) | ((i10 << 6) & 458752) | ((i10 << 3) & 3670016), 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return u90VarE;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Use topAppBarColors instead", replaceWith = @kotlin.b1(expression = "topAppBarColors()", imports = {}))
    @NotNull
    public final u90 e(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(513940029, i10, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1540)");
        }
        u90 u90VarM = m(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return u90VarM;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Use topAppBarColors instead", replaceWith = @kotlin.b1(expression = "topAppBarColors(containerColor, scrolledContainerColor, navigationIconContentColor, titleContentColor, actionIconContentColor)", imports = {}))
    @NotNull
    public final u90 f(long j10, long j11, long j12, long j13, long j14, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1896017784, i10, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1570)");
        }
        u90 u90VarC = u90.c(m(pj.f31758a.a(c0Var, 6)), jU, jU2, jU3, jU4, jU5, 0L, 32, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return u90VarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    @af
    public final /* synthetic */ ca0 g(fa0 fa0Var, Function0 function0, androidx.compose.animation.core.o oVar, androidx.compose.animation.core.g0 g0Var, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            fa0Var = o1.e1(0.0f, 0.0f, 0.0f, c0Var, 0, 7);
        }
        fa0 fa0Var2 = fa0Var;
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.y90
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(z90.i());
                    }
                };
                c0Var.Y(objI0);
            }
            function0 = (Function0) objI0;
        }
        Function0 function1 = function0;
        if ((i11 & 4) != 0) {
            oVar = hm.b(d0.h1.DefaultEffects, c0Var, 6);
        }
        androidx.compose.animation.core.o oVar2 = oVar;
        if ((i11 & 8) != 0) {
            g0Var = androidx.compose.animation.n1.b(c0Var, 0);
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(959086674, i10, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:1723)");
        }
        ca0 ca0VarH = h(fa0Var2, function1, oVar2, g0Var, false, c0Var, (i10 & 14) | 24576 | (i10 & com.planner5d.library.engine.input.f.b.B) | (i10 & 896) | (i10 & 7168) | ((i10 << 3) & 458752), 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return ca0VarH;
    }

    @androidx.compose.runtime.o
    @af
    @NotNull
    public final ca0 h(@Nullable fa0 fa0Var, @Nullable Function0<Boolean> function0, @Nullable androidx.compose.animation.core.o<Float> oVar, @Nullable androidx.compose.animation.core.g0<Float> g0Var, boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        androidx.compose.runtime.c0 c0Var2;
        if ((i11 & 1) != 0) {
            c0Var2 = c0Var;
            fa0Var = o1.e1(0.0f, 0.0f, 0.0f, c0Var2, 0, 7);
        } else {
            c0Var2 = c0Var;
        }
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var2.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.w90
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(z90.j());
                    }
                };
                c0Var2.Y(objI0);
            }
            function0 = (Function0) objI0;
        }
        Function0<Boolean> function1 = function0;
        if ((i11 & 4) != 0) {
            oVar = hm.b(d0.h1.DefaultEffects, c0Var2, 6);
        }
        if ((i11 & 8) != 0) {
            g0Var = androidx.compose.animation.n1.b(c0Var2, 0);
        }
        if ((i11 & 16) != 0) {
            z10 = false;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(53729710, i10, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:1762)");
        }
        boolean zD = ((((i10 & 14) ^ 6) > 4 && c0Var2.D(fa0Var)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var2.D(function1)) || (i10 & 48) == 32) | c0Var2.D(oVar) | c0Var2.D(g0Var) | ((((57344 & i10) ^ 24576) > 16384 && c0Var2.G(z10)) || (i10 & 24576) == 16384);
        Object objI1 = c0Var2.i0();
        if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new je(fa0Var, oVar, g0Var, function1, z10);
            c0Var2.Y(objI1);
        }
        je jeVar = (je) objI1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jeVar;
    }

    @androidx.compose.runtime.o
    @af
    @NotNull
    public final ca0 k(@Nullable fa0 fa0Var, @Nullable Function0<Boolean> function0, @Nullable androidx.compose.animation.core.o<Float> oVar, @Nullable androidx.compose.animation.core.g0<Float> g0Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        androidx.compose.runtime.c0 c0Var2;
        if ((i11 & 1) != 0) {
            c0Var2 = c0Var;
            fa0Var = o1.e1(0.0f, 0.0f, 0.0f, c0Var2, 0, 7);
        } else {
            c0Var2 = c0Var;
        }
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var2.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.v90
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(z90.l());
                    }
                };
                c0Var2.Y(objI0);
            }
            function0 = (Function0) objI0;
        }
        if ((i11 & 4) != 0) {
            oVar = hm.b(d0.h1.DefaultEffects, c0Var2, 6);
        }
        if ((i11 & 8) != 0) {
            g0Var = androidx.compose.animation.n1.b(c0Var2, 0);
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1757023234, i10, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:1801)");
        }
        boolean zD = ((((i10 & 14) ^ 6) > 4 && c0Var2.D(fa0Var)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var2.D(function0)) || (i10 & 48) == 32) | c0Var2.D(oVar) | c0Var2.D(g0Var);
        Object objI1 = c0Var2.i0();
        if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new ze(fa0Var, oVar, g0Var, function0);
            c0Var2.Y(objI1);
        }
        ze zeVar = (ze) objI1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return zeVar;
    }

    @NotNull
    public final u90 m(@NotNull l6 l6Var) {
        u90 u90VarA0 = l6Var.a0();
        if (u90VarA0 != null) {
            return u90VarA0;
        }
        d0.f fVar = d0.f.f267976a;
        u90 u90Var = new u90(o6.o(l6Var, fVar.b()), o6.o(l6Var, fVar.i()), o6.o(l6Var, fVar.g()), o6.o(l6Var, fVar.l()), o6.o(l6Var, fVar.m()), o6.o(l6Var, fVar.k()), null);
        l6Var.Q1(u90Var);
        return u90Var;
    }

    public final float n() {
        return f35003g;
    }

    public final float o() {
        return f35004h;
    }

    public final float p() {
        return f35006j;
    }

    public final float q() {
        return f35005i;
    }

    public final float r() {
        return f34999c;
    }

    public final float s() {
        return f35000d;
    }

    public final float t() {
        return f35002f;
    }

    public final float u() {
        return f35001e;
    }

    public final float v() {
        return f34998b;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getWindowInsets")
    @NotNull
    public final androidx.compose.foundation.layout.v6 w(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2143182847, i10, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1526)");
        }
        androidx.compose.foundation.layout.v6 v6VarA = androidx.compose.material3.internal.o3.a(androidx.compose.foundation.layout.v6.f16495a, c0Var, 6);
        androidx.compose.foundation.layout.v7.a aVar = androidx.compose.foundation.layout.v7.f16497b;
        androidx.compose.foundation.layout.v6 v6VarK = androidx.compose.foundation.layout.b7.k(v6VarA, androidx.compose.foundation.layout.v7.s(aVar.g(), aVar.k()));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v6VarK;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Use topAppBarColors instead", replaceWith = @kotlin.b1(expression = "topAppBarColors()", imports = {}))
    @NotNull
    public final u90 x(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1744932393, i10, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1639)");
        }
        u90 u90VarM = m(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return u90VarM;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Use topAppBarColors instead", replaceWith = @kotlin.b1(expression = "topAppBarColors(containerColor, scrolledContainerColor, navigationIconContentColor, titleContentColor, actionIconContentColor)", imports = {}))
    @NotNull
    public final u90 y(long j10, long j11, long j12, long j13, long j14, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1471507700, i10, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1670)");
        }
        u90 u90VarC = u90.c(m(pj.f31758a.a(c0Var, 6)), jU, jU2, jU3, jU4, jU5, 0L, 32, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return u90VarC;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Use topAppBarColors instead", replaceWith = @kotlin.b1(expression = "topAppBarColors()", imports = {}))
    @NotNull
    public final u90 z(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1268886463, i10, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:1589)");
        }
        u90 u90VarM = m(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return u90VarM;
    }
}
