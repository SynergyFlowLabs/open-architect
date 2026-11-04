package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface g4 {
    static /* synthetic */ Object d(g4 g4Var, androidx.compose.foundation.q3 q3Var, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i10 & 1) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return g4Var.c(q3Var, function2, dVar);
    }

    boolean a();

    @Nullable
    Object c(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function2<? super t3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    boolean e(long j10);

    long f(long j10);
}
