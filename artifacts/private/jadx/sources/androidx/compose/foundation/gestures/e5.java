package androidx.compose.foundation.gestures;

import androidx.compose.runtime.k7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface e5 extends c3 {
    static /* synthetic */ Object c(e5 e5Var, z3 z3Var, float f10, kotlin.coroutines.d<? super Float> dVar) {
        return e5Var.b(z3Var, f10, g5.f14599a, dVar);
    }

    @Override // androidx.compose.foundation.gestures.c3
    @Nullable
    default Object a(@NotNull z3 z3Var, float f10, @NotNull kotlin.coroutines.d<? super Float> dVar) {
        return c(this, z3Var, f10, dVar);
    }

    @Nullable
    Object b(@NotNull z3 z3Var, float f10, @NotNull Function1<? super Float, Unit> function1, @NotNull kotlin.coroutines.d<? super Float> dVar);
}
