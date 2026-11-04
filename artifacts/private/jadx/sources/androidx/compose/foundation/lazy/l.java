package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyListBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,61:1\n1282#2,6:62\n*S KotlinDebug\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n*L\n29#1:62,6\n*E\n"})
public final class l {
    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.foundation.lazy.layout.u a(@NotNull j1 j1Var, int i10, @Nullable androidx.compose.runtime.c0 c0Var, int i11) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1877443446, i11, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:27)");
        }
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && c0Var.D(j1Var)) || (i11 & 6) == 4) | ((((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.K(i10)) || (i11 & 48) == 32);
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new m(j1Var, i10);
            c0Var.Y(objI0);
        }
        m mVar = (m) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return mVar;
    }
}
