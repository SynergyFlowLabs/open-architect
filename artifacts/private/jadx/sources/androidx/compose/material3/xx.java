package androidx.compose.material3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class xx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final xx f34590a = new xx();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f34591b = 0;

    private xx() {
    }

    public final int a() {
        return wx.f34310b.b();
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getContainerColor")
    public final long b(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-159508825, i10, -1, "androidx.compose.material3.ShortNavigationBarDefaults.<get-containerColor> (ShortNavigationBar.kt:262)");
        }
        long jR = o6.r(d0.k1.f268357a.a(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getContentColor")
    public final long c(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(133067559, i10, -1, "androidx.compose.material3.ShortNavigationBarDefaults.<get-contentColor> (ShortNavigationBar.kt:266)");
        }
        long jG = o6.g(b(c0Var, i10 & 14), c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jG;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getWindowInsets")
    @NotNull
    public final androidx.compose.foundation.layout.v6 d(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-424843026, i10, -1, "androidx.compose.material3.ShortNavigationBarDefaults.<get-windowInsets> (ShortNavigationBar.kt:276)");
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
