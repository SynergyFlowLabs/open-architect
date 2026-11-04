package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class b4 extends g4 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private e4 f15928s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f15929t;

    public b4(@NotNull e4 e4Var, boolean z10) {
        this.f15928s = e4Var;
        this.f15929t = z10;
    }

    public void A9(boolean z10) {
        this.f15929t = z10;
    }

    public final void B9(@NotNull e4 e4Var) {
        this.f15928s = e4Var;
    }

    @Override // androidx.compose.foundation.layout.g4, androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return this.f15928s == e4.Min ? yVar.D0(i10) : yVar.p0(i10);
    }

    @Override // androidx.compose.foundation.layout.g4, androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return this.f15928s == e4.Min ? yVar.D0(i10) : yVar.p0(i10);
    }

    @Override // androidx.compose.foundation.layout.g4
    public long w9(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        int iD0 = this.f15928s == e4.Min ? z0Var.D0(androidx.compose.ui.unit.b.p(j10)) : z0Var.p0(androidx.compose.ui.unit.b.p(j10));
        if (iD0 < 0) {
            iD0 = 0;
        }
        return androidx.compose.ui.unit.b.f42658b.d(iD0);
    }

    @Override // androidx.compose.foundation.layout.g4
    public boolean x9() {
        return this.f15929t;
    }

    @NotNull
    public final e4 z9() {
        return this.f15928s;
    }
}
