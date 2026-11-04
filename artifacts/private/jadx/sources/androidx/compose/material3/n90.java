package androidx.compose.material3;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@af
public interface n90 {
    static /* synthetic */ Object e(n90 n90Var, androidx.compose.foundation.q3 q3Var, kotlin.coroutines.d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i10 & 1) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return n90Var.c(q3Var, dVar);
    }

    void a();

    @NotNull
    androidx.compose.animation.core.w1<Boolean> b();

    @Nullable
    Object c(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    boolean d();

    void dismiss();

    boolean isVisible();
}
