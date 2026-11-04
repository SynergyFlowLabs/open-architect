package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class DragAndDropSourceElement extends e1<l> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> f14139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<n, kotlin.coroutines.d<? super Unit>, Object> f14140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<n0.g, androidx.compose.ui.draganddrop.k> f14141e;

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropSourceElement(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1, @NotNull Function2<? super n, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull Function1<? super n0.g, androidx.compose.ui.draganddrop.k> function3) {
        this.f14139c = function1;
        this.f14140d = function2;
        this.f14141e = function3;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceElement)) {
            return false;
        }
        DragAndDropSourceElement dragAndDropSourceElement = (DragAndDropSourceElement) obj;
        return this.f14139c == dragAndDropSourceElement.f14139c && this.f14140d == dragAndDropSourceElement.f14140d && this.f14141e == dragAndDropSourceElement.f14141e;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((this.f14139c.hashCode() * 31) + this.f14140d.hashCode()) * 31) + this.f14141e.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("dragSource");
        t2Var.b().c("drawDragDecoration", this.f14139c);
        t2Var.b().c("detectDragStart", this.f14140d);
        t2Var.b().c("transferData", this.f14141e);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public l a() {
        return new l(this.f14139c, this.f14140d, this.f14141e);
    }

    @NotNull
    public final Function2<n, kotlin.coroutines.d<? super Unit>, Object> m() {
        return this.f14140d;
    }

    @NotNull
    public final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> n() {
        return this.f14139c;
    }

    @NotNull
    public final Function1<n0.g, androidx.compose.ui.draganddrop.k> o() {
        return this.f14141e;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull l lVar) {
        lVar.N9(this.f14139c);
        lVar.M9(this.f14140d);
        lVar.O9(this.f14141e);
    }
}
