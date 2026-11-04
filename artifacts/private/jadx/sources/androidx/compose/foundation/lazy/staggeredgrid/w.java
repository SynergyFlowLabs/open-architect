package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.l2;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyStaggeredGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,100:1\n1282#2,6:101\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n*L\n40#1:101,6\n*E\n"})
public final class w {
    @androidx.compose.runtime.o
    @NotNull
    public static final Function0<r> c(@NotNull final a1 a1Var, @NotNull Function1<? super o0, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(690901732, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProviderLambda (LazyStaggeredGridItemProvider.kt:37)");
        }
        final n7 n7VarW = w6.w(function1, c0Var, (i10 >> 3) & 14);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && c0Var.D(a1Var)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            final n7 n7VarD = w6.d(w6.v(), new Function0() { // from class: androidx.compose.foundation.lazy.staggeredgrid.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.d(n7VarW);
                }
            });
            objI0 = new kotlin.jvm.internal.c1(w6.d(w6.v(), new Function0() { // from class: androidx.compose.foundation.lazy.staggeredgrid.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.e(n7VarD, a1Var);
                }
            })) { // from class: androidx.compose.foundation.lazy.staggeredgrid.w.a
                @Override // kotlin.jvm.internal.c1, kotlin.reflect.p
                public Object get() {
                    return ((n7) this.receiver).getValue();
                }
            };
            c0Var.Y(objI0);
        }
        kotlin.reflect.p pVar = (kotlin.reflect.p) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p d(n7 n7Var) {
        return new p((Function1) n7Var.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t e(n7 n7Var, a1 a1Var) {
        p pVar = (p) n7Var.getValue();
        return new t(a1Var, pVar, new l2(a1Var.P(), pVar));
    }
}
