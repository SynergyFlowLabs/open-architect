package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,644:1\n1282#2,6:645\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt\n*L\n79#1:645,6\n*E\n"})
public final class c1 {
    @androidx.compose.runtime.o
    @NotNull
    public static final a1 b(final int i10, final int i11, @Nullable androidx.compose.runtime.c0 c0Var, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(161145796, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:78)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<a1, Object> c0VarA = a1.f17713y.a();
        boolean z10 = true;
        boolean z11 = (((i12 & 14) ^ 6) > 4 && c0Var.K(i10)) || (i12 & 6) == 4;
        if ((((i12 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.K(i11)) && (i12 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI0 = c0Var.i0();
        if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.foundation.lazy.staggeredgrid.b1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c1.c(i10, i11);
                }
            };
            c0Var.Y(objI0);
        }
        a1 a1Var = (a1) androidx.compose.runtime.saveable.i.j(objArr, c0VarA, (Function0) objI0, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a1 c(int i10, int i11) {
        return new a1(i10, i11);
    }
}
