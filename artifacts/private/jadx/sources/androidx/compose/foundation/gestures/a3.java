package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface a3 {

    public static final class a {
    }

    static /* synthetic */ Object c(a3 a3Var, androidx.compose.foundation.q3 q3Var, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i10 & 1) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return a3Var.a(q3Var, function2, dVar);
    }

    @Nullable
    Object a(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function2<? super k2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    void b(float f10);
}
