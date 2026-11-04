package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.j5;
import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@p0
public interface x {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ androidx.compose.ui.a0 b(x xVar, androidx.compose.ui.a0 a0Var, androidx.compose.animation.core.y0 y0Var, androidx.compose.animation.core.y0 y0Var2, androidx.compose.animation.core.y0 y0Var3, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItem");
        }
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            y0Var2 = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.q.c(j5.d(androidx.compose.ui.unit.q.f42709b)), 1, null);
        }
        if ((i10 & 4) != 0) {
            y0Var3 = androidx.compose.animation.core.p.r(0.0f, 400.0f, null, 5, null);
        }
        return xVar.a(a0Var, y0Var, y0Var2, y0Var3);
    }

    @NotNull
    androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.animation.core.y0<Float> y0Var, @Nullable androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var2, @Nullable androidx.compose.animation.core.y0<Float> y0Var3);
}
