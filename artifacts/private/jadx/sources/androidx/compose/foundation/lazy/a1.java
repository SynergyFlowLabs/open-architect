package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyListSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,32:1\n1282#2,6:33\n*S KotlinDebug\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n*L\n28#1:33,6\n*E\n"})
public final class a1 {
    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.foundation.lazy.layout.q1 a(@NotNull j1 j1Var, boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(596174919, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        boolean z11 = ((((i10 & 14) ^ 6) > 4 && c0Var.D(j1Var)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.G(z10)) || (i10 & 48) == 32);
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = k.a(j1Var, z10);
            c0Var.Y(objI0);
        }
        androidx.compose.foundation.lazy.layout.q1 q1Var = (androidx.compose.foundation.lazy.layout.q1) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q1Var;
    }
}
