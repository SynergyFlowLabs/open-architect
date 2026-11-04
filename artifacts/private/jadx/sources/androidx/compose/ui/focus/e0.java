package androidx.compose.ui.focus;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class e0 extends androidx.compose.ui.a0.d implements c0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private f0 f37407s;

    public e0(@NotNull f0 f0Var) {
        this.f37407s = f0Var;
    }

    @Override // androidx.compose.ui.focus.c0
    public void Z6(@NotNull z zVar) {
        this.f37407s.a(zVar);
    }

    @NotNull
    public final f0 v9() {
        return this.f37407s;
    }

    public final void w9(@NotNull f0 f0Var) {
        this.f37407s = f0Var;
    }
}
