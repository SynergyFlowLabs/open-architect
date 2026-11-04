package androidx.compose.ui.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class LayoutBoundsElement extends androidx.compose.ui.node.e1<f0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39217d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final d0 f39218c;

    public LayoutBoundsElement(@NotNull d0 d0Var) {
        this.f39218c = d0Var;
    }

    public static /* synthetic */ LayoutBoundsElement n(LayoutBoundsElement layoutBoundsElement, d0 d0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d0Var = layoutBoundsElement.f39218c;
        }
        return layoutBoundsElement.m(d0Var);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutBoundsElement) && Intrinsics.areEqual(this.f39218c, ((LayoutBoundsElement) obj).f39218c);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f39218c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("layoutBounds");
        t2Var.b().c("holder", this.f39218c);
    }

    @NotNull
    public final d0 l() {
        return this.f39218c;
    }

    @NotNull
    public final LayoutBoundsElement m(@NotNull d0 d0Var) {
        return new LayoutBoundsElement(d0Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public f0 a() {
        return new f0(this.f39218c);
    }

    @NotNull
    public final d0 p() {
        return this.f39218c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull f0 f0Var) {
        f0Var.B9(this.f39218c);
        f0Var.v9();
    }

    @NotNull
    public String toString() {
        return "LayoutBoundsElement(holder=" + this.f39218c + ')';
    }
}
