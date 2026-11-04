package androidx.compose.ui.node;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class m0 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f39910k = 8;

    public m0(@NotNull b bVar) {
        super(bVar, null);
    }

    @Override // androidx.compose.ui.node.a
    protected long d(@NotNull k1 k1Var, long j10) {
        return k1.k7(k1Var, j10, false, 2, null);
    }

    @Override // androidx.compose.ui.node.a
    @NotNull
    protected Map<androidx.compose.ui.layout.a, Integer> e(@NotNull k1 k1Var) {
        return k1Var.l2().x();
    }

    @Override // androidx.compose.ui.node.a
    protected int i(@NotNull k1 k1Var, @NotNull androidx.compose.ui.layout.a aVar) {
        return k1Var.M(aVar);
    }
}
