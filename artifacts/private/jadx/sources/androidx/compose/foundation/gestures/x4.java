package androidx.compose.foundation.gestures;

import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScrollableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,221:1\n1282#2,6:222\n*S KotlinDebug\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n*L\n162#1:222,6\n*E\n"})
public final class x4 {
    @NotNull
    public static final v4 b(@NotNull Function1<? super Float, Float> function1) {
        return new z0(function1);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final v4 c(@NotNull Function1<? super Float, Float> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-180460798, i10, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:159)");
        }
        final n7 n7VarW = w6.w(function1, c0Var, i10 & 14);
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = b(new Function1() { // from class: androidx.compose.foundation.gestures.w4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Float.valueOf(x4.d(n7VarW, ((Float) obj).floatValue()));
                }
            });
            c0Var.Y(objI0);
        }
        v4 v4Var = (v4) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(n7 n7Var, float f10) {
        return ((Number) ((Function1) n7Var.getValue()).invoke(Float.valueOf(f10))).floatValue();
    }
}
