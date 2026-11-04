package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class AddTextContextMenuDataComponentsElement extends e1<a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<a0.a, Unit> f18972c;

    /* JADX WARN: Multi-variable type inference failed */
    public AddTextContextMenuDataComponentsElement(@NotNull Function1<? super a0.a, Unit> function1) {
        this.f18972c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddTextContextMenuDataComponentsElement) && this.f18972c == ((AddTextContextMenuDataComponentsElement) obj).f18972c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f18972c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("addTextContextMenuDataComponents");
        t2Var.b().c("builder", this.f18972c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a a() {
        return new a(this.f18972c);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull a aVar) {
        aVar.w9(this.f18972c);
    }
}
