package androidx.compose.ui.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class OnSizeChangedModifier extends androidx.compose.ui.node.e1<z1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.unit.u, Unit> f39230c;

    /* JADX WARN: Multi-variable type inference failed */
    public OnSizeChangedModifier(@NotNull Function1<? super androidx.compose.ui.unit.u, Unit> function1) {
        this.f39230c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnSizeChangedModifier) && this.f39230c == ((OnSizeChangedModifier) obj).f39230c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f39230c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("onSizeChanged");
        t2Var.b().c("onSizeChanged", this.f39230c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public z1 a() {
        return new z1(this.f39230c);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull z1 z1Var) {
        z1Var.v9(this.f39230c);
    }
}
