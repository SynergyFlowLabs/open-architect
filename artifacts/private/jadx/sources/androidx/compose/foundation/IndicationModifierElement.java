package androidx.compose.foundation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class IndicationModifierElement extends androidx.compose.ui.node.e1<y2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.h f13872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final z2 f13873d;

    public IndicationModifierElement(@NotNull androidx.compose.foundation.interaction.h hVar, @NotNull z2 z2Var) {
        this.f13872c = hVar;
        this.f13873d = z2Var;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return Intrinsics.areEqual(this.f13872c, indicationModifierElement.f13872c) && Intrinsics.areEqual(this.f13873d, indicationModifierElement.f13873d);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (this.f13872c.hashCode() * 31) + this.f13873d.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("indication");
        t2Var.b().c("interactionSource", this.f13872c);
        t2Var.b().c("indication", this.f13873d);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public y2 a() {
        return new y2(this.f13873d.a(this.f13872c));
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull y2 y2Var) {
        y2Var.G9(this.f13873d.a(this.f13872c));
    }
}
