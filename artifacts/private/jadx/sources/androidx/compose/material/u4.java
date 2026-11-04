package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nContentAlpha.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,134:1\n75#2:135\n*S KotlinDebug\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n*L\n79#1:135\n*E\n"})
public final class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u4 f25148a = new u4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f25149b = 0;

    private u4() {
    }

    @androidx.compose.runtime.o
    private final float a(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f11, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1528360391, i10, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:77)");
        }
        long jM = ((androidx.compose.ui.graphics.q0) c0Var.W(x4.a())).M();
        if (!x9.f25488a.a(c0Var, 6).o() ? androidx.compose.ui.graphics.s0.r(jM) >= 0.5d : androidx.compose.ui.graphics.s0.r(jM) <= 0.5d) {
            f10 = f11;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return f10;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getDisabled")
    public final float b(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(621183615, i10, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:60)");
        }
        float fA = a(0.38f, 0.38f, c0Var, ((i10 << 6) & 896) | 54);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return fA;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getHigh")
    public final float c(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(629162431, i10, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:36)");
        }
        float fA = a(1.0f, 0.87f, c0Var, ((i10 << 6) & 896) | 54);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return fA;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getMedium")
    public final float d(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1999054879, i10, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:48)");
        }
        float fA = a(0.74f, 0.6f, c0Var, ((i10 << 6) & 896) | 54);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return fA;
    }
}
