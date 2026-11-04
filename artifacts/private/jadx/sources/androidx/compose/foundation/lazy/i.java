package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.j5;
import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@q1
@k7
public interface i {

    public static final class a {
        @Deprecated
        @NotNull
        public static androidx.compose.ui.a0 a(@NotNull i iVar, @NotNull androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.animation.core.y0<Float> y0Var, @Nullable androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var2, @Nullable androidx.compose.animation.core.y0<Float> y0Var3) {
            return i.super.a(a0Var, y0Var, y0Var2, y0Var3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ androidx.compose.ui.a0 b(i iVar, androidx.compose.ui.a0 a0Var, androidx.compose.animation.core.y0 y0Var, androidx.compose.animation.core.y0 y0Var2, androidx.compose.animation.core.y0 y0Var3, int i10, Object obj) {
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
        return iVar.a(a0Var, y0Var, y0Var2, y0Var3);
    }

    static /* synthetic */ androidx.compose.ui.a0 c(i iVar, androidx.compose.ui.a0 a0Var, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return iVar.f(a0Var, f10);
    }

    static /* synthetic */ androidx.compose.ui.a0 d(i iVar, androidx.compose.ui.a0 a0Var, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return iVar.g(a0Var, f10);
    }

    static /* synthetic */ androidx.compose.ui.a0 e(i iVar, androidx.compose.ui.a0 a0Var, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return iVar.i(a0Var, f10);
    }

    @NotNull
    default androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.animation.core.y0<Float> y0Var, @Nullable androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var2, @Nullable androidx.compose.animation.core.y0<Float> y0Var3) {
        return a0Var;
    }

    @NotNull
    androidx.compose.ui.a0 f(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10);

    @NotNull
    androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10);

    @NotNull
    androidx.compose.ui.a0 i(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10);
}
