package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class p0 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f39471t = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private pj.n<? super c1, ? super z0, ? super androidx.compose.ui.unit.b, ? extends b1> f39472s;

    public p0(@NotNull pj.n<? super c1, ? super z0, ? super androidx.compose.ui.unit.b, ? extends b1> nVar) {
        this.f39472s = nVar;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public b1 c(@NotNull c1 c1Var, @NotNull z0 z0Var, long j10) {
        return this.f39472s.invoke(c1Var, z0Var, androidx.compose.ui.unit.b.a(j10));
    }

    @NotNull
    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f39472s + ')';
    }

    @NotNull
    public final pj.n<c1, z0, androidx.compose.ui.unit.b, b1> v9() {
        return this.f39472s;
    }

    public final void w9(@NotNull pj.n<? super c1, ? super z0, ? super androidx.compose.ui.unit.b, ? extends b1> nVar) {
        this.f39472s = nVar;
    }
}
