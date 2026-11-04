package androidx.compose.foundation.lazy.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.b2
final class a3 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.p2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private i1 f17316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final String f17317t = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";

    public a3(@NotNull i1 i1Var) {
        this.f17316s = i1Var;
    }

    @NotNull
    public final i1 v9() {
        return this.f17316s;
    }

    @Override // androidx.compose.ui.node.p2
    @NotNull
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public String R4() {
        return this.f17317t;
    }

    public final void x9(@NotNull i1 i1Var) {
        this.f17316s = i1Var;
    }
}
