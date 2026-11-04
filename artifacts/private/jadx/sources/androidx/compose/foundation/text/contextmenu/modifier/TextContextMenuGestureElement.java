package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class TextContextMenuGestureElement extends e1<f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> f18975c;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuGestureElement(@Nullable Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1) {
        this.f18975c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextContextMenuGestureElement) && this.f18975c == ((TextContextMenuGestureElement) obj).f18975c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f18975c;
        if (function1 != null) {
            return function1.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("TextContextMenuGestures");
        t2Var.b().c("onPreShowContextMenu", this.f18975c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f a() {
        return new f(this.f18975c);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull f fVar) {
        fVar.M9(this.f18975c);
    }
}
