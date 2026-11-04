package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FocusedBoundsObserverElement extends androidx.compose.ui.node.e1<j2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.layout.g0, Unit> f13870c;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusedBoundsObserverElement(@NotNull Function1<? super androidx.compose.ui.layout.g0, Unit> function1) {
        this.f13870c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        FocusedBoundsObserverElement focusedBoundsObserverElement = obj instanceof FocusedBoundsObserverElement ? (FocusedBoundsObserverElement) obj : null;
        return focusedBoundsObserverElement != null && this.f13870c == focusedBoundsObserverElement.f13870c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f13870c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("onFocusedBoundsChanged");
        t2Var.b().c("onPositioned", this.f13870c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public j2 a() {
        return new j2(this.f13870c);
    }

    @NotNull
    public final Function1<androidx.compose.ui.layout.g0, Unit> m() {
        return this.f13870c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull j2 j2Var) {
        j2Var.x9(this.f13870c);
    }
}
