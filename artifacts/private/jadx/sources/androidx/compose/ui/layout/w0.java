package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface w0 {
    static /* synthetic */ long Z(w0 w0Var, g0 g0Var, g0 g0Var2, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-au-aQtc");
        }
        if ((i10 & 2) != 0) {
            j10 = n0.g.f332700b.e();
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return w0Var.b0(g0Var, g0Var2, j11, z10);
    }

    @NotNull
    g0 K(@NotNull g0 g0Var);

    @NotNull
    g0 N(@NotNull i2.a aVar);

    default long b0(@NotNull g0 g0Var, @NotNull g0 g0Var2, long j10, boolean z10) {
        return y0.e(this, g0Var, g0Var2, j10, z10);
    }
}
