package androidx.compose.material3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class km {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final km f30067a = new km();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f30068b = d0.e0.f267938a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f30069c = 0;

    private km() {
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getContainerColor")
    public final long a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1528098623, i10, -1, "androidx.compose.material3.NavigationBarDefaults.<get-containerColor> (NavigationBar.kt:326)");
        }
        long jR = o6.r(d0.k1.f268357a.a(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    public final float b() {
        return f30068b;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getWindowInsets")
    @NotNull
    public final androidx.compose.foundation.layout.v6 c(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1938678202, i10, -1, "androidx.compose.material3.NavigationBarDefaults.<get-windowInsets> (NavigationBar.kt:332)");
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
