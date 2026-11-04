package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyGridBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/grid/LazyGridBeyondBoundsModifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,52:1\n1282#2,6:53\n*S KotlinDebug\n*F\n+ 1 LazyGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/grid/LazyGridBeyondBoundsModifierKt\n*L\n26#1:53,6\n*E\n"})
public final class e {
    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.foundation.lazy.layout.u a(@NotNull x1 x1Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2004349821, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:24)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && c0Var.D(x1Var)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new f(x1Var);
            c0Var.Y(objI0);
        }
        f fVar = (f) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return fVar;
    }
}
