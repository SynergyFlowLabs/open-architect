package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class u6 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.a2 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f16477t = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.e.c f16478s;

    public u6(@NotNull androidx.compose.ui.e.c cVar) {
        this.f16478s = cVar;
    }

    @NotNull
    public final androidx.compose.ui.e.c v9() {
        return this.f16478s;
    }

    @Override // androidx.compose.ui.node.a2
    @NotNull
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public t5 V(@NotNull androidx.compose.ui.unit.d dVar, @Nullable Object obj) {
        t5 t5Var = obj instanceof t5 ? (t5) obj : null;
        if (t5Var == null) {
            t5Var = new t5(0.0f, false, null, null, 15, null);
        }
        t5Var.k(k1.f16162a.j(this.f16478s));
        return t5Var;
    }

    public final void x9(@NotNull androidx.compose.ui.e.c cVar) {
        this.f16478s = cVar;
    }
}
