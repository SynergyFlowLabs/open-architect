package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,736:1\n113#2:737\n113#2:738\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n*L\n431#1:737\n434#1:738\n*E\n"})
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f0 f22689a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f22690b = androidx.compose.ui.unit.h.r(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f22691c = androidx.compose.ui.unit.h.r(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f22692d = androidx.compose.foundation.layout.d5.j(n0.f23830b, 0.0f, n0.f23830b, 0.0f, 10, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22693e = 0;

    private f0() {
    }

    public final float a() {
        return f22691c;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getBottomAppBarWindowInsets")
    @NotNull
    public final androidx.compose.foundation.layout.v6 b(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1469837023, i10, -1, "androidx.compose.material.AppBarDefaults.<get-bottomAppBarWindowInsets> (AppBar.kt:450)");
        }
        androidx.compose.foundation.layout.v6 v6VarA = li.a(androidx.compose.foundation.layout.v6.f16495a, c0Var, 6);
        androidx.compose.foundation.layout.v7.a aVar = androidx.compose.foundation.layout.v7.f16497b;
        androidx.compose.foundation.layout.v6 v6VarK = androidx.compose.foundation.layout.b7.k(v6VarA, androidx.compose.foundation.layout.v7.s(aVar.g(), aVar.e()));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v6VarK;
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 c() {
        return f22692d;
    }

    public final float d() {
        return f22690b;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getTopAppBarWindowInsets")
    @NotNull
    public final androidx.compose.foundation.layout.v6 e(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-427176825, i10, -1, "androidx.compose.material.AppBarDefaults.<get-topAppBarWindowInsets> (AppBar.kt:443)");
        }
        androidx.compose.foundation.layout.v6 v6VarA = li.a(androidx.compose.foundation.layout.v6.f16495a, c0Var, 6);
        androidx.compose.foundation.layout.v7.a aVar = androidx.compose.foundation.layout.v7.f16497b;
        androidx.compose.foundation.layout.v6 v6VarK = androidx.compose.foundation.layout.b7.k(v6VarA, androidx.compose.foundation.layout.v7.s(aVar.g(), aVar.k()));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v6VarK;
    }
}
