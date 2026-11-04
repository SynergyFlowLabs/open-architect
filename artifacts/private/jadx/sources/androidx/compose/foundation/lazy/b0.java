package androidx.compose.foundation.lazy;

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
@SourceDebugExtension({"SMAP\nLazyListItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,108:1\n1282#2,6:109\n*S KotlinDebug\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n*L\n44#1:109,6\n*E\n"})
public final class b0 {
    @androidx.compose.runtime.o
    @NotNull
    public static final Function0<w> c(@NotNull final j1 j1Var, @NotNull Function1<? super w0, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-343736148, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:41)");
        }
        final n7 n7VarW = w6.w(function1, c0Var, (i10 >> 3) & 14);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && c0Var.D(j1Var)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            final j jVar = new j();
            final n7 n7VarD = w6.d(w6.v(), new Function0() { // from class: androidx.compose.foundation.lazy.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b0.d(n7VarW);
                }
            });
            objI0 = new kotlin.jvm.internal.c1(w6.d(w6.v(), new Function0() { // from class: androidx.compose.foundation.lazy.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b0.e(n7VarD, j1Var, jVar);
                }
            })) { // from class: androidx.compose.foundation.lazy.b0.a
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
    public static final u d(n7 n7Var) {
        return new u((Function1) n7Var.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y e(n7 n7Var, j1 j1Var, j jVar) {
        u uVar = (u) n7Var.getValue();
        return new y(j1Var, uVar, jVar, new l2(j1Var.M(), uVar));
    }
}
