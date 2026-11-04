package androidx.compose.ui.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class LayoutIdElement extends androidx.compose.ui.node.e1<j0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f39220c;

    public LayoutIdElement(@NotNull Object obj) {
        this.f39220c = obj;
    }

    private final Object l() {
        return this.f39220c;
    }

    public static /* synthetic */ LayoutIdElement n(LayoutIdElement layoutIdElement, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = layoutIdElement.f39220c;
        }
        return layoutIdElement.m(obj);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LayoutIdElement) && Intrinsics.areEqual(this.f39220c, ((LayoutIdElement) obj).f39220c)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f39220c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("layoutId");
        t2Var.e(this.f39220c);
    }

    @NotNull
    public final LayoutIdElement m(@NotNull Object obj) {
        return new LayoutIdElement(obj);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public j0 a() {
        return new j0(this.f39220c);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull j0 j0Var) {
        j0Var.v9(this.f39220c);
    }

    @NotNull
    public String toString() {
        return "LayoutIdElement(layoutId=" + this.f39220c + ')';
    }
}
