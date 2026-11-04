package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class g0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g0 f16802a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16803b = 0;

    private g0() {
    }

    @Override // androidx.compose.foundation.lazy.grid.f0
    @NotNull
    public androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.animation.core.y0<Float> y0Var, @Nullable androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var2, @Nullable androidx.compose.animation.core.y0<Float> y0Var3) {
        return (y0Var == null && y0Var2 == null && y0Var3 == null) ? a0Var : a0Var.B2(new LazyLayoutAnimateItemElement(y0Var, y0Var2, y0Var3));
    }
}
