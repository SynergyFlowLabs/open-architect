package androidx.compose.foundation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class HoverableElement extends androidx.compose.ui.node.e1<o2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.j f13871c;

    public HoverableElement(@NotNull androidx.compose.foundation.interaction.j jVar) {
        this.f13871c = jVar;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && Intrinsics.areEqual(((HoverableElement) obj).f13871c, this.f13871c);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f13871c.hashCode() * 31;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("hoverable");
        t2Var.b().c("interactionSource", this.f13871c);
        t2Var.b().c("enabled", Boolean.TRUE);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public o2 a() {
        return new o2(this.f13871c);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull o2 o2Var) {
        o2Var.A9(this.f13871c);
    }
}
