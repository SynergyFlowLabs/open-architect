package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class DragAndDropSourceWithDefaultShadowElement extends e1<s> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private Function2<? super n, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> f14142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Function1<? super n0.g, androidx.compose.ui.draganddrop.k> f14143d;

    public DragAndDropSourceWithDefaultShadowElement(@NotNull Function2<? super n, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull Function1<? super n0.g, androidx.compose.ui.draganddrop.k> function1) {
        this.f14142c = function2;
        this.f14143d = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceWithDefaultShadowElement)) {
            return false;
        }
        DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement = (DragAndDropSourceWithDefaultShadowElement) obj;
        return this.f14142c == dragAndDropSourceWithDefaultShadowElement.f14142c && this.f14143d == dragAndDropSourceWithDefaultShadowElement.f14143d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (this.f14142c.hashCode() * 31) + this.f14143d.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("dragSourceWithDefaultPainter");
        t2Var.b().c("detectDragStart", this.f14142c);
        t2Var.b().c("transferData", this.f14143d);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public s a() {
        return new s(this.f14142c, this.f14143d);
    }

    @NotNull
    public final Function2<n, kotlin.coroutines.d<? super Unit>, Object> m() {
        return this.f14142c;
    }

    @NotNull
    public final Function1<n0.g, androidx.compose.ui.draganddrop.k> n() {
        return this.f14143d;
    }

    public final void o(@NotNull Function2<? super n, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f14142c = function2;
    }

    public final void p(@NotNull Function1<? super n0.g, androidx.compose.ui.draganddrop.k> function1) {
        this.f14143d = function1;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull s sVar) {
        sVar.M9(this.f14142c);
        sVar.N9(this.f14143d);
    }
}
