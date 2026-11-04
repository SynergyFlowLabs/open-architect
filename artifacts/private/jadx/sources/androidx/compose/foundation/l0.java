package androidx.compose.foundation;

import androidx.compose.runtime.k7;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@b2
public interface l0 {
    static /* synthetic */ Object e(l0 l0Var, q3 q3Var, kotlin.coroutines.d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i10 & 1) != 0) {
            q3Var = q3.Default;
        }
        return l0Var.c(q3Var, dVar);
    }

    void a();

    @Nullable
    Object c(@NotNull q3 q3Var, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    boolean d();

    void dismiss();

    boolean isVisible();
}
