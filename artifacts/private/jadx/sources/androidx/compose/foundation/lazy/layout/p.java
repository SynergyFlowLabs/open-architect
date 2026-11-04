package androidx.compose.foundation.lazy.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class p extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.a2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f17498w = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private androidx.compose.animation.core.y0<Float> f17499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> f17500t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private androidx.compose.animation.core.y0<Float> f17501v;

    public p(@Nullable androidx.compose.animation.core.y0<Float> y0Var, @Nullable androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var2, @Nullable androidx.compose.animation.core.y0<Float> y0Var3) {
        this.f17499s = y0Var;
        this.f17500t = y0Var2;
        this.f17501v = y0Var3;
    }

    public final void A9(@Nullable androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var) {
        this.f17500t = y0Var;
    }

    @Override // androidx.compose.ui.node.a2
    @NotNull
    public Object V(@NotNull androidx.compose.ui.unit.d dVar, @Nullable Object obj) {
        return this;
    }

    @Nullable
    public final androidx.compose.animation.core.y0<Float> v9() {
        return this.f17499s;
    }

    @Nullable
    public final androidx.compose.animation.core.y0<Float> w9() {
        return this.f17501v;
    }

    @Nullable
    public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> x9() {
        return this.f17500t;
    }

    public final void y9(@Nullable androidx.compose.animation.core.y0<Float> y0Var) {
        this.f17499s = y0Var;
    }

    public final void z9(@Nullable androidx.compose.animation.core.y0<Float> y0Var) {
        this.f17501v = y0Var;
    }
}
