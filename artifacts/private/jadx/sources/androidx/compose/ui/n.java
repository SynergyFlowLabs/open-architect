package androidx.compose.ui;

import androidx.compose.runtime.b1;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class n extends a0.d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f39641t = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private b1 f39642s;

    public n(@NotNull b1 b1Var) {
        this.f39642s = b1Var;
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        androidx.compose.ui.node.k.u(this).l(this.f39642s);
    }

    @NotNull
    public final b1 v9() {
        return this.f39642s;
    }

    public final void w9(@NotNull b1 b1Var) {
        this.f39642s = b1Var;
        androidx.compose.ui.node.k.u(this).l(b1Var);
    }
}
