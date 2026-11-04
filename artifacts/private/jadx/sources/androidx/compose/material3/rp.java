package androidx.compose.material3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class rp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final rp f32583a = new rp();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f32584b = 0;

    private rp() {
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getContainerColor")
    public final long a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1949394041, i10, -1, "androidx.compose.material3.NavigationRailDefaults.<get-ContainerColor> (NavigationRail.kt:329)");
        }
        int i11 = 0 | 6;
        long jR = o6.r(d0.o1.f268586a.a(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getWindowInsets")
    @NotNull
    public final androidx.compose.foundation.layout.v6 b(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1546379058, i10, -1, "androidx.compose.material3.NavigationRailDefaults.<get-windowInsets> (NavigationRail.kt:335)");
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
