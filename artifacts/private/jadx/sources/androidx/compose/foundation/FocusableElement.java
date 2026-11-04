package androidx.compose.foundation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FocusableElement extends androidx.compose.ui.node.e1<h2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.interaction.j f13869c;

    public FocusableElement(@Nullable androidx.compose.foundation.interaction.j jVar) {
        this.f13869c = jVar;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusableElement) && Intrinsics.areEqual(this.f13869c, ((FocusableElement) obj).f13869c)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        androidx.compose.foundation.interaction.j jVar = this.f13869c;
        if (jVar != null) {
            return jVar.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("focusable");
        t2Var.b().c("enabled", Boolean.TRUE);
        t2Var.b().c("interactionSource", this.f13869c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public h2 a() {
        int i10 = (3 ^ 0) ^ 0;
        return new h2(this.f13869c, 0, null, 6, null);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull h2 h2Var) {
        h2Var.S9(this.f13869c);
    }
}
