package androidx.compose.material3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final xd f34462a = new xd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f34463b = d0.e0.f267938a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f34464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f34465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f34466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f34467f = 0;

    static {
        d0.m1 m1Var = d0.m1.f268453a;
        f34464c = m1Var.I();
        f34465d = m1Var.I();
        f34466e = m1Var.p();
    }

    private xd() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Please use standardContainerColor or modalContainerColor instead.", replaceWith = @kotlin.b1(expression = "standardContainerColor", imports = {}))
    public static /* synthetic */ void b() {
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getContainerColor")
    public final long a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1797317261, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-containerColor> (NavigationDrawer.kt:1021)");
        }
        long jR = o6.r(d0.m1.f268453a.H(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    public final float c() {
        return f34465d;
    }

    public final float d() {
        return f34466e;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getModalContainerColor")
    public final long e(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(706424321, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-modalContainerColor> (NavigationDrawer.kt:1031)");
        }
        long jR = o6.r(d0.m1.f268453a.F(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    public final float f() {
        return f34463b;
    }

    public final float g() {
        return f34464c;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getScrimColor")
    public final long h(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1055074989, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-scrimColor> (NavigationDrawer.kt:1012)");
        }
        long jW = androidx.compose.ui.graphics.q0.w(o6.r(d0.f2.f268022a.a(), c0Var, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jW;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 i(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(928378975, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-shape> (NavigationDrawer.kt:1008)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.m1.f268453a.o(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getStandardContainerColor")
    public final long j(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-125949421, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-standardContainerColor> (NavigationDrawer.kt:1027)");
        }
        long jR = o6.r(d0.m1.f268453a.H(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getWindowInsets")
    @NotNull
    public final androidx.compose.foundation.layout.v6 k(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            int i11 = 7 & (-1);
            androidx.compose.runtime.m0.A0(-909973510, i10, -1, "androidx.compose.material3.DrawerDefaults.<get-windowInsets> (NavigationDrawer.kt:1040)");
        }
        androidx.compose.foundation.layout.v6 v6VarA = androidx.compose.material3.internal.o3.a(androidx.compose.foundation.layout.v6.f16495a, c0Var, 6);
        androidx.compose.foundation.layout.v7.a aVar = androidx.compose.foundation.layout.v7.f16497b;
        androidx.compose.foundation.layout.v6 v6VarK = androidx.compose.foundation.layout.b7.k(v6VarA, androidx.compose.foundation.layout.v7.s(aVar.l(), aVar.j()));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v6VarK;
    }
}
