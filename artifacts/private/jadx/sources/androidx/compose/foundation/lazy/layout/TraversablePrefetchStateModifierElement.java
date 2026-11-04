package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.b2
final class TraversablePrefetchStateModifierElement extends androidx.compose.ui.node.e1<a3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final i1 f17265c;

    public TraversablePrefetchStateModifierElement(@NotNull i1 i1Var) {
        this.f17265c = i1Var;
    }

    private final i1 l() {
        return this.f17265c;
    }

    public static /* synthetic */ TraversablePrefetchStateModifierElement n(TraversablePrefetchStateModifierElement traversablePrefetchStateModifierElement, i1 i1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i1Var = traversablePrefetchStateModifierElement.f17265c;
        }
        return traversablePrefetchStateModifierElement.m(i1Var);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && Intrinsics.areEqual(this.f17265c, ((TraversablePrefetchStateModifierElement) obj).f17265c);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f17265c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("traversablePrefetchState");
        t2Var.e(this.f17265c);
    }

    @NotNull
    public final TraversablePrefetchStateModifierElement m(@NotNull i1 i1Var) {
        return new TraversablePrefetchStateModifierElement(i1Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a3 a() {
        return new a3(this.f17265c);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull a3 a3Var) {
        a3Var.x9(this.f17265c);
    }

    @NotNull
    public String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f17265c + ')';
    }
}
