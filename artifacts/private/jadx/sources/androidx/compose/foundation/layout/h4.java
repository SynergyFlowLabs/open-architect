package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class h4 extends g4 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private e4 f16076s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f16077t;

    public h4(@NotNull e4 e4Var, boolean z10) {
        this.f16076s = e4Var;
        this.f16077t = z10;
    }

    public void A9(boolean z10) {
        this.f16077t = z10;
    }

    public final void B9(@NotNull e4 e4Var) {
        this.f16076s = e4Var;
    }

    @Override // androidx.compose.foundation.layout.g4, androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return this.f16076s == e4.Min ? yVar.L0(i10) : yVar.M0(i10);
    }

    @Override // androidx.compose.foundation.layout.g4, androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return this.f16076s == e4.Min ? yVar.L0(i10) : yVar.M0(i10);
    }

    @Override // androidx.compose.foundation.layout.g4
    public long w9(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        int iL0 = this.f16076s == e4.Min ? z0Var.L0(androidx.compose.ui.unit.b.o(j10)) : z0Var.M0(androidx.compose.ui.unit.b.o(j10));
        if (iL0 < 0) {
            iL0 = 0;
        }
        return androidx.compose.ui.unit.b.f42658b.e(iL0);
    }

    @Override // androidx.compose.foundation.layout.g4
    public boolean x9() {
        return this.f16077t;
    }

    @NotNull
    public final e4 z9() {
        return this.f16076s;
    }
}
