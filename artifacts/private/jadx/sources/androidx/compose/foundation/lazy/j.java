package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.runtime.e6;
import androidx.compose.runtime.l3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class j implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17162c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private l3 f17163a = e6.b(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private l3 f17164b = e6.b(Integer.MAX_VALUE);

    @Override // androidx.compose.foundation.lazy.i
    @NotNull
    public androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.animation.core.y0<Float> y0Var, @Nullable androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var2, @Nullable androidx.compose.animation.core.y0<Float> y0Var3) {
        return (y0Var == null && y0Var2 == null && y0Var3 == null) ? a0Var : a0Var.B2(new LazyLayoutAnimateItemElement(y0Var, y0Var2, y0Var3));
    }

    @Override // androidx.compose.foundation.lazy.i
    @NotNull
    public androidx.compose.ui.a0 f(@NotNull androidx.compose.ui.a0 a0Var, float f10) {
        int i10 = (7 >> 2) & 0 & 0;
        return a0Var.B2(new ParentSizeElement(f10, null, this.f17164b, "fillParentMaxHeight", 2, null));
    }

    @Override // androidx.compose.foundation.lazy.i
    @NotNull
    public androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, float f10) {
        return a0Var.B2(new ParentSizeElement(f10, this.f17163a, null, "fillParentMaxWidth", 4, null));
    }

    @Override // androidx.compose.foundation.lazy.i
    @NotNull
    public androidx.compose.ui.a0 i(@NotNull androidx.compose.ui.a0 a0Var, float f10) {
        return a0Var.B2(new ParentSizeElement(f10, this.f17163a, this.f17164b, "fillParentMaxSize"));
    }

    public final void j(int i10, int i11) {
        this.f17163a.j(i10);
        this.f17164b.j(i11);
    }
}
