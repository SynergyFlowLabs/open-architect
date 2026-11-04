package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class DropTargetElement extends e1<q> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.draganddrop.b, Boolean> f14144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.draganddrop.i f14145d;

    /* JADX WARN: Multi-variable type inference failed */
    public DropTargetElement(@NotNull Function1<? super androidx.compose.ui.draganddrop.b, Boolean> function1, @NotNull androidx.compose.ui.draganddrop.i iVar) {
        this.f14144c = function1;
        this.f14145d = iVar;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropTargetElement)) {
            return false;
        }
        DropTargetElement dropTargetElement = (DropTargetElement) obj;
        return Intrinsics.areEqual(this.f14145d, dropTargetElement.f14145d) && this.f14144c == dropTargetElement.f14144c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (this.f14145d.hashCode() * 31) + this.f14144c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("dropTarget");
        t2Var.b().c(androidx.constraintlayout.core.motion.utils.v.a.M, this.f14145d);
        t2Var.b().c("shouldStartDragAndDrop", this.f14144c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public q a() {
        return new q(this.f14144c, this.f14145d);
    }

    @NotNull
    public final Function1<androidx.compose.ui.draganddrop.b, Boolean> m() {
        return this.f14144c;
    }

    @NotNull
    public final androidx.compose.ui.draganddrop.i n() {
        return this.f14145d;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull q qVar) {
        qVar.J9(this.f14144c, this.f14145d);
    }
}
