package androidx.compose.foundation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,485:1\n1282#2,6:486\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n70#1:486,6\n*E\n"})
public final class q4 {
    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull b5 b5Var, @Nullable x3 x3Var, boolean z10, @Nullable androidx.compose.foundation.gestures.c3 c3Var, boolean z11) {
        return h(a0Var, b5Var, z11, c3Var, z10, false, false, x3Var);
    }

    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @NotNull b5 b5Var, boolean z10, @Nullable androidx.compose.foundation.gestures.c3 c3Var, boolean z11) {
        return i(a0Var, b5Var, z11, c3Var, z10, false, true, null, 64, null);
    }

    public static /* synthetic */ androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, b5 b5Var, x3 x3Var, boolean z10, androidx.compose.foundation.gestures.c3 c3Var, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            c3Var = null;
        }
        androidx.compose.foundation.gestures.c3 c3Var2 = c3Var;
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        return b(a0Var, b5Var, x3Var, z12, c3Var2, z11);
    }

    public static /* synthetic */ androidx.compose.ui.a0 e(androidx.compose.ui.a0 a0Var, b5 b5Var, boolean z10, androidx.compose.foundation.gestures.c3 c3Var, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            c3Var = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return c(a0Var, b5Var, z10, c3Var, z11);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final b5 f(final int i10, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1464256199, i11, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:68)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<b5, ?> c0VarA = b5.f13918i.a();
        if ((((i11 & 14) ^ 6) <= 4 || !c0Var.K(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.foundation.p4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return q4.g(i10);
                }
            };
            c0Var.Y(objI0);
        }
        b5 b5Var = (b5) androidx.compose.runtime.saveable.i.j(objArr, c0VarA, (Function0) objI0, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return b5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b5 g(int i10) {
        return new b5(i10);
    }

    private static final androidx.compose.ui.a0 h(androidx.compose.ui.a0 a0Var, b5 b5Var, boolean z10, androidx.compose.foundation.gestures.c3 c3Var, boolean z11, boolean z12, boolean z13, x3 x3Var) {
        return c5.a(a0Var, b5Var, z12 ? androidx.compose.foundation.gestures.q3.Vertical : androidx.compose.foundation.gestures.q3.Horizontal, z11, z10, c3Var, b5Var.z(), z13, x3Var, (256 & 256) != 0 ? null : null).B2(new ScrollingLayoutElement(b5Var, z10, z12));
    }

    static /* synthetic */ androidx.compose.ui.a0 i(androidx.compose.ui.a0 a0Var, b5 b5Var, boolean z10, androidx.compose.foundation.gestures.c3 c3Var, boolean z11, boolean z12, boolean z13, x3 x3Var, int i10, Object obj) {
        return h(a0Var, b5Var, z10, c3Var, z11, z12, z13, (i10 & 64) != 0 ? null : x3Var);
    }

    @NotNull
    public static final androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var, @NotNull b5 b5Var, @Nullable x3 x3Var, boolean z10, @Nullable androidx.compose.foundation.gestures.c3 c3Var, boolean z11) {
        return h(a0Var, b5Var, z11, c3Var, z10, true, false, x3Var);
    }

    @NotNull
    public static final androidx.compose.ui.a0 k(@NotNull androidx.compose.ui.a0 a0Var, @NotNull b5 b5Var, boolean z10, @Nullable androidx.compose.foundation.gestures.c3 c3Var, boolean z11) {
        return i(a0Var, b5Var, z11, c3Var, z10, true, true, null, 64, null);
    }

    public static /* synthetic */ androidx.compose.ui.a0 l(androidx.compose.ui.a0 a0Var, b5 b5Var, x3 x3Var, boolean z10, androidx.compose.foundation.gestures.c3 c3Var, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            c3Var = null;
        }
        androidx.compose.foundation.gestures.c3 c3Var2 = c3Var;
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        return j(a0Var, b5Var, x3Var, z12, c3Var2, z11);
    }

    public static /* synthetic */ androidx.compose.ui.a0 m(androidx.compose.ui.a0 a0Var, b5 b5Var, boolean z10, androidx.compose.foundation.gestures.c3 c3Var, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            c3Var = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return k(a0Var, b5Var, z10, c3Var, z11);
    }
}
