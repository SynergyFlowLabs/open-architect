package androidx.compose.foundation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class OverscrollModifierElement extends androidx.compose.ui.node.e1<b4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final x3 f13891c;

    public OverscrollModifierElement(@Nullable x3 x3Var) {
        this.f13891c = x3Var;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverscrollModifierElement) && Intrinsics.areEqual(this.f13891c, ((OverscrollModifierElement) obj).f13891c);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        x3 x3Var = this.f13891c;
        if (x3Var != null) {
            return x3Var.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("overscroll");
        t2Var.b().c("overscrollEffect", this.f13891c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b4 a() {
        x3 x3Var = this.f13891c;
        return new b4(x3Var != null ? x3Var.w() : null);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull b4 b4Var) {
        x3 x3Var = this.f13891c;
        b4Var.H9(x3Var != null ? x3Var.w() : null);
    }
}
