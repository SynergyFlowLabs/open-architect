package androidx.compose.foundation.text.contextmenu.modifier;

import android.content.Context;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class AddTextContextMenuDataComponentsWithContextElement extends e1<c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<a0.a, Context, Unit> f18973c;

    /* JADX WARN: Multi-variable type inference failed */
    public AddTextContextMenuDataComponentsWithContextElement(@NotNull Function2<? super a0.a, ? super Context, Unit> function2) {
        this.f18973c = function2;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddTextContextMenuDataComponentsWithContextElement) && this.f18973c == ((AddTextContextMenuDataComponentsWithContextElement) obj).f18973c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f18973c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("addTextContextMenuDataComponentsWithResources");
        t2Var.b().c("builder", this.f18973c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this.f18973c);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull c cVar) {
        cVar.J9(this.f18973c);
    }
}
