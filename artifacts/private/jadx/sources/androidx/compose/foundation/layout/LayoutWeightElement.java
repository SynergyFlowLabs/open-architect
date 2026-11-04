package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class LayoutWeightElement extends androidx.compose.ui.node.e1<k4> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15798e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f15799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15800d;

    public LayoutWeightElement(float f10, boolean z10) {
        this.f15799c = f10;
        this.f15800d = z10;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f15799c == layoutWeightElement.f15799c && this.f15800d == layoutWeightElement.f15800d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (Float.hashCode(this.f15799c) * 31) + Boolean.hashCode(this.f15800d);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("weight");
        t2Var.e(Float.valueOf(this.f15799c));
        t2Var.b().c("weight", Float.valueOf(this.f15799c));
        t2Var.b().c("fill", Boolean.valueOf(this.f15800d));
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public k4 a() {
        return new k4(this.f15799c, this.f15800d);
    }

    public final boolean m() {
        return this.f15800d;
    }

    public final float n() {
        return this.f15799c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull k4 k4Var) {
        k4Var.z9(this.f15799c);
        k4Var.y9(this.f15800d);
    }
}
