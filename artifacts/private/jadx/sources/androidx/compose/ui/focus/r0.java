package androidx.compose.ui.focus;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface r0 extends androidx.compose.ui.node.j {
    static /* synthetic */ boolean B1(r0 r0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
        }
        if ((i11 & 1) != 0) {
            i10 = f.f37408b.b();
        }
        return r0Var.K4(i10);
    }

    void A2(int i10);

    boolean K4(int i10);

    int X2();

    @NotNull
    p0 c5();

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use the version accepting FocusDirection", replaceWith = @kotlin.b1(expression = "this.requestFocus()", imports = {}))
    /* synthetic */ boolean k3();
}
