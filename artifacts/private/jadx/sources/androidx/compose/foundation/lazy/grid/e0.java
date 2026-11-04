package androidx.compose.foundation.lazy.grid;

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
@SourceDebugExtension({"SMAP\nLazyGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,106:1\n1282#2,6:107\n*S KotlinDebug\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n*L\n43#1:107,6\n*E\n"})
public final class e0 {
    @androidx.compose.runtime.o
    @NotNull
    public static final Function0<z> c(@NotNull final x1 x1Var, @NotNull Function1<? super f1, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1898306282, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        final n7 n7VarW = w6.w(function1, c0Var, (i10 >> 3) & 14);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && c0Var.D(x1Var)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            final n7 n7VarD = w6.d(w6.v(), new Function0() { // from class: androidx.compose.foundation.lazy.grid.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e0.d(n7VarW);
                }
            });
            objI0 = new kotlin.jvm.internal.c1(w6.d(w6.v(), new Function0() { // from class: androidx.compose.foundation.lazy.grid.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e0.e(n7VarD, x1Var);
                }
            })) { // from class: androidx.compose.foundation.lazy.grid.e0.a
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
    public static final w d(n7 n7Var) {
        return new w((Function1) n7Var.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 e(n7 n7Var, x1 x1Var) {
        w wVar = (w) n7Var.getValue();
        return new b0(x1Var, wVar, new l2(x1Var.N(), wVar));
    }
}
