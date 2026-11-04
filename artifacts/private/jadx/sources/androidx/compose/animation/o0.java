package androidx.compose.animation;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public abstract class o0 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f13688s = androidx.compose.ui.a0.d.f36940o;

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.L0(i10);
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.M0(i10);
    }

    @Override // androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.p0(i10);
    }

    @Override // androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.D0(i10);
    }
}
