package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class y implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y f18024a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18025b = 0;

    private y() {
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.x
    @NotNull
    public androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.animation.core.y0<Float> y0Var, @Nullable androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var2, @Nullable androidx.compose.animation.core.y0<Float> y0Var3) {
        return (y0Var == null && y0Var2 == null && y0Var3 == null) ? a0Var : a0Var.B2(new LazyLayoutAnimateItemElement(y0Var, y0Var2, y0Var3));
    }
}
