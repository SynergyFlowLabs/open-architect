package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.b2;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@b2
final class LegacyDragAndDropSourceWithDefaultShadowElement extends e1<v> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<m, kotlin.coroutines.d<? super Unit>, Object> f14148c;

    /* JADX WARN: Multi-variable type inference failed */
    public LegacyDragAndDropSourceWithDefaultShadowElement(@NotNull Function2<? super m, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f14148c = function2;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegacyDragAndDropSourceWithDefaultShadowElement) {
            return Intrinsics.areEqual(this.f14148c, ((LegacyDragAndDropSourceWithDefaultShadowElement) obj).f14148c);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f14148c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("dragSourceWithDefaultPainter");
        t2Var.b().c("dragAndDropSourceHandler", this.f14148c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public v a() {
        return new v(this.f14148c);
    }

    @NotNull
    public final Function2<m, kotlin.coroutines.d<? super Unit>, Object> m() {
        return this.f14148c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull v vVar) {
        vVar.J9(this.f14148c);
    }
}
