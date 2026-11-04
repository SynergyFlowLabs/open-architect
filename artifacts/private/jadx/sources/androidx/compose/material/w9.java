package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMaterialTextSelectionColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,244:1\n646#2:245\n635#2:246\n75#3:247\n1282#4,6:248\n*S KotlinDebug\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n*L\n45#1:245\n45#1:246\n45#1:247\n47#1:248,6\n*E\n"})
public final class w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f25368a = 0.4f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f25369b = 0.2f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f25370c = 4.5f;

    private static final float a(long j10, long j11, long j12) {
        int i10 = 0;
        float f10 = 0.2f;
        float f11 = 0.4f;
        float f12 = 0.4f;
        while (i10 < 7) {
            long j13 = j10;
            long j14 = j11;
            long j15 = j12;
            float fC = (c(j13, f11, j14, j15) / f25370c) - 1.0f;
            if (0.0f <= fC && fC <= 0.01f) {
                return f11;
            }
            if (fC < 0.0f) {
                f12 = f11;
            } else {
                f10 = f11;
            }
            f11 = (f12 + f10) / 2.0f;
            i10++;
            j10 = j13;
            j11 = j14;
            j12 = j15;
        }
        return f11;
    }

    public static final float b(long j10, long j11) {
        float fR = androidx.compose.ui.graphics.s0.r(j10) + 0.05f;
        float fR2 = androidx.compose.ui.graphics.s0.r(j11) + 0.05f;
        return Math.max(fR, fR2) / Math.min(fR, fR2);
    }

    private static final float c(long j10, float f10, long j11, long j12) {
        long j13 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(j10, f10, 0.0f, 0.0f, 0.0f, 14, null), j12);
        return b(androidx.compose.ui.graphics.s0.j(j11, j13), j13);
    }

    public static final long d(long j10, long j11, long j12) {
        float fA;
        float fC = c(j10, 0.4f, j11, j12);
        float fC2 = c(j10, 0.2f, j11, j12);
        if (fC >= f25370c) {
            fA = 0.4f;
        } else {
            fA = fC2 < f25370c ? 0.2f : a(j10, j11, j12);
        }
        return androidx.compose.ui.graphics.q0.w(j10, fA, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.foundation.text.selection.w4 e(@NotNull l4 l4Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-721696685, i10, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long j10 = l4Var.j();
        long jC = l4Var.c();
        c0Var.E(-2060761573);
        long jC2 = n4.c(l4Var, jC);
        if (jC2 == 16) {
            jC2 = ((androidx.compose.ui.graphics.q0) c0Var.W(x4.a())).M();
        }
        long j11 = jC2;
        c0Var.A();
        long jW = androidx.compose.ui.graphics.q0.w(j11, u4.f25148a.d(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null);
        boolean zL = c0Var.L(j10) | c0Var.L(jC) | c0Var.L(jW);
        Object objI0 = c0Var.i0();
        if (zL || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            androidx.compose.foundation.text.selection.w4 w4Var = new androidx.compose.foundation.text.selection.w4(l4Var.j(), d(j10, jW, jC), null);
            c0Var.Y(w4Var);
            objI0 = w4Var;
        }
        androidx.compose.foundation.text.selection.w4 w4Var2 = (androidx.compose.foundation.text.selection.w4) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return w4Var2;
    }
}
