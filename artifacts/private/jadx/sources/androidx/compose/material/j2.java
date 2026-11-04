package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,445:1\n113#2:446\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationDefaults\n*L\n251#1:446\n*E\n"})
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j2 f23258a = new j2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f23259b = androidx.compose.ui.unit.h.r(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f23260c = 0;

    private j2() {
    }

    public final float a() {
        return f23259b;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getWindowInsets")
    @NotNull
    public final androidx.compose.foundation.layout.v6 b(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1427252235, i10, -1, "androidx.compose.material.BottomNavigationDefaults.<get-windowInsets> (BottomNavigation.kt:256)");
        }
        androidx.compose.foundation.layout.v6 v6VarA = li.a(androidx.compose.foundation.layout.v6.f16495a, c0Var, 6);
        androidx.compose.foundation.layout.v7.a aVar = androidx.compose.foundation.layout.v7.f16497b;
        androidx.compose.foundation.layout.v6 v6VarK = androidx.compose.foundation.layout.b7.k(v6VarA, androidx.compose.foundation.layout.v7.s(aVar.g(), aVar.e()));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v6VarK;
    }
}
