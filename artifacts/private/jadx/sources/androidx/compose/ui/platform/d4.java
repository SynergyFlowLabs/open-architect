package androidx.compose.ui.platform;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class d4 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.i2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private String f40411s;

    public d4(@NotNull String str) {
        this.f40411s = str;
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.S1(e0Var, this.f40411s);
    }

    @NotNull
    public final String v9() {
        return this.f40411s;
    }

    public final void w9(@NotNull String str) {
        this.f40411s = str;
    }
}
