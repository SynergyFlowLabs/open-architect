package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,838:1\n113#2:839\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerDefaults\n*L\n708#1:839\n*E\n"})
public final class a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a6 f21970a = new a6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.y3<Float> f21971b = new androidx.compose.animation.core.y3<>(256, 0, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f21972c = androidx.compose.ui.unit.h.r(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f21973d = 0.32f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21974e = 0;

    private a6() {
    }

    @NotNull
    public final androidx.compose.animation.core.y3<Float> a() {
        return f21971b;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getBackgroundColor")
    public final long b(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-788676020, i10, -1, "androidx.compose.material.DrawerDefaults.<get-backgroundColor> (Drawer.kt:704)");
        }
        long jN = x9.f25488a.a(c0Var, 6).n();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jN;
    }

    public final float c() {
        return f21972c;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getScrimColor")
    public final long d(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(617225966, i10, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:715)");
        }
        long jW = androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jW;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 e(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2041803618, i10, -1, "androidx.compose.material.DrawerDefaults.<get-shape> (Drawer.kt:711)");
        }
        androidx.compose.foundation.shape.e eVarC = x9.f25488a.b(c0Var, 6).c();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return eVarC;
    }
}
