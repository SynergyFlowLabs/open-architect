package androidx.compose.foundation.pager;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPagerBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerBeyondBoundsModifier.kt\nandroidx/compose/foundation/pager/PagerBeyondBoundsModifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,62:1\n1282#2,6:63\n*S KotlinDebug\n*F\n+ 1 PagerBeyondBoundsModifier.kt\nandroidx/compose/foundation/pager/PagerBeyondBoundsModifierKt\n*L\n27#1:63,6\n*E\n"})
public final class q {
    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.foundation.lazy.layout.u a(@NotNull i1 i1Var, int i10, @Nullable androidx.compose.runtime.c0 c0Var, int i11) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(373558254, i11, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && c0Var.D(i1Var)) || (i11 & 6) == 4) | ((((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.K(i10)) || (i11 & 48) == 32);
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new r(i1Var, i10);
            c0Var.Y(objI0);
        }
        r rVar = (r) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return rVar;
    }
}
