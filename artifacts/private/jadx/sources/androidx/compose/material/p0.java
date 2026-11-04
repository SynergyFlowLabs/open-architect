package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,695:1\n113#2:696\n113#2:697\n113#2:698\n113#2:699\n113#2:700\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldDefaults\n*L\n619#1:696\n620#1:697\n609#1:698\n612#1:699\n624#1:700\n*E\n"})
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p0 f24133a = new p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f24134b = androidx.compose.ui.unit.h.r(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f24135c = androidx.compose.ui.unit.h.r(48);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f24136d = androidx.compose.ui.unit.h.r(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.o<Float> f24137e = androidx.compose.animation.core.p.t(300, 0, androidx.compose.animation.core.u0.d(), 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24138f = 8;

    private p0() {
    }

    @NotNull
    public final androidx.compose.animation.core.o<Float> a() {
        return f24137e;
    }

    public final float b() {
        return f24136d;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getFrontLayerScrimColor")
    public final long c(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1806270648, i10, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerScrimColor> (BackdropScaffold.kt:627)");
        }
        int i11 = 5 ^ 0;
        long jW = androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).n(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jW;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getFrontLayerShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 d(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1580588700, i10, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerShape> (BackdropScaffold.kt:617)");
        }
        float f10 = 16;
        androidx.compose.foundation.shape.e eVarC = androidx.compose.foundation.shape.e.c(x9.f25488a.b(c0Var, 6).c(), androidx.compose.foundation.shape.g.c(androidx.compose.ui.unit.h.r(f10)), androidx.compose.foundation.shape.g.c(androidx.compose.ui.unit.h.r(f10)), null, null, 12, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return eVarC;
    }

    public final float e() {
        return f24135c;
    }

    public final float f() {
        return f24134b;
    }
}
