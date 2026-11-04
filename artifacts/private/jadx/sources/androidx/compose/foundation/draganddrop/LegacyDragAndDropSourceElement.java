package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.b2;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@b2
final class LegacyDragAndDropSourceElement extends e1<t> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> f14146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<m, kotlin.coroutines.d<? super Unit>, Object> f14147d;

    /* JADX WARN: Multi-variable type inference failed */
    public LegacyDragAndDropSourceElement(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1, @NotNull Function2<? super m, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f14146c = function1;
        this.f14147d = function2;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyDragAndDropSourceElement)) {
            return false;
        }
        LegacyDragAndDropSourceElement legacyDragAndDropSourceElement = (LegacyDragAndDropSourceElement) obj;
        return this.f14146c == legacyDragAndDropSourceElement.f14146c && this.f14147d == legacyDragAndDropSourceElement.f14147d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (this.f14146c.hashCode() * 31) + this.f14147d.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("dragSource");
        t2Var.b().c("drawDragDecoration", this.f14146c);
        t2Var.b().c("dragAndDropSourceHandler", this.f14147d);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public t a() {
        return new t(this.f14146c, this.f14147d);
    }

    @NotNull
    public final Function2<m, kotlin.coroutines.d<? super Unit>, Object> m() {
        return this.f14147d;
    }

    @NotNull
    public final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> n() {
        return this.f14146c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull t tVar) {
        tVar.J9(this.f14146c);
        tVar.I9(this.f14147d);
    }
}
