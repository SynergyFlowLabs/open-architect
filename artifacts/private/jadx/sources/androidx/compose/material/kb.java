package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,447:1\n113#2:448\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailDefaults\n*L\n257#1:448\n*E\n"})
public final class kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final kb f23505a = new kb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f23506b = androidx.compose.ui.unit.h.r(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f23507c = 0;

    private kb() {
    }

    public final float a() {
        return f23506b;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getWindowInsets")
    @NotNull
    public final androidx.compose.foundation.layout.v6 b(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(840451581, i10, -1, "androidx.compose.material.NavigationRailDefaults.<get-windowInsets> (NavigationRail.kt:262)");
        }
        androidx.compose.foundation.layout.v6 v6VarA = li.a(androidx.compose.foundation.layout.v6.f16495a, c0Var, 6);
        androidx.compose.foundation.layout.v7.a aVar = androidx.compose.foundation.layout.v7.f16497b;
        androidx.compose.foundation.layout.v6 v6VarK = androidx.compose.foundation.layout.b7.k(v6VarA, androidx.compose.foundation.layout.v7.s(aVar.l(), aVar.j()));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v6VarK;
    }
}
