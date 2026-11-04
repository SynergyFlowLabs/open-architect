package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FilterTextContextMenuDataComponentsElement extends e1<d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<b0.b, Boolean> f18974c;

    /* JADX WARN: Multi-variable type inference failed */
    public FilterTextContextMenuDataComponentsElement(@NotNull Function1<? super b0.b, Boolean> function1) {
        this.f18974c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FilterTextContextMenuDataComponentsElement) && this.f18974c == ((FilterTextContextMenuDataComponentsElement) obj).f18974c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f18974c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("filterTextContextMenuDataComponents");
        t2Var.b().c("filter", this.f18974c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a() {
        return new d(this.f18974c);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull d dVar) {
        dVar.w9(this.f18974c);
    }
}
