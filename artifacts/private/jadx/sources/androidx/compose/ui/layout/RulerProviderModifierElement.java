package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"ModifierNodeInspectableProperties"})
final class RulerProviderModifierElement extends androidx.compose.ui.node.e1<u2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final x f39235c;

    public RulerProviderModifierElement(@NotNull x xVar) {
        this.f39235c = xVar;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.f39235c : null) == this.f39235c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f39235c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public u2 a() {
        return new u2(this.f39235c);
    }

    @NotNull
    public final x m() {
        return this.f39235c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull u2 u2Var) {
        u2Var.C9(this.f39235c);
    }
}
