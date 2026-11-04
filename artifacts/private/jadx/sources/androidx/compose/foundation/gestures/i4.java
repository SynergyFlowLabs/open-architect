package androidx.compose.foundation.gestures;

import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScrollable2DState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable2DState.kt\nandroidx/compose/foundation/gestures/Scrollable2DStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,165:1\n1282#2,6:166\n*S KotlinDebug\n*F\n+ 1 Scrollable2DState.kt\nandroidx/compose/foundation/gestures/Scrollable2DStateKt\n*L\n125#1:166,6\n*E\n"})
public final class i4 {
    @NotNull
    public static final g4 b(@NotNull Function1<? super n0.g, n0.g> function1) {
        return new y0(function1);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final g4 c(@NotNull Function1<? super n0.g, n0.g> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1315827064, i10, -1, "androidx.compose.foundation.gestures.rememberScrollable2DState (Scrollable2DState.kt:122)");
        }
        final n7 n7VarW = w6.w(function1, c0Var, i10 & 14);
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = b(new Function1() { // from class: androidx.compose.foundation.gestures.h4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i4.d(n7VarW, (n0.g) obj);
                }
            });
            c0Var.Y(objI0);
        }
        g4 g4Var = (g4) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return g4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.g d(n7 n7Var, n0.g gVar) {
        return (n0.g) ((Function1) n7Var.getValue()).invoke(gVar);
    }
}
