package androidx.compose.material3.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class c3 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.p2, androidx.compose.ui.node.i2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f28741w = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.semantics.e0, Unit> f28742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f28743t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final Object f28744v = d3.f28797a;

    public c3(@NotNull Function1<? super androidx.compose.ui.semantics.e0, Unit> function1) {
        this.f28742s = function1;
    }

    @Override // androidx.compose.ui.node.i2
    public boolean A4() {
        return true;
    }

    @Override // androidx.compose.ui.node.p2
    @NotNull
    public Object R4() {
        return this.f28744v;
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        if (!this.f28743t) {
            this.f28742s.invoke(e0Var);
        }
    }

    @NotNull
    public final Function1<androidx.compose.ui.semantics.e0, Unit> v9() {
        return this.f28742s;
    }

    public final void w9(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        this.f28743t = true;
        this.f28742s.invoke(e0Var);
        androidx.compose.ui.node.j2.b(this);
    }

    public final void x9() {
        this.f28743t = false;
        androidx.compose.ui.node.j2.b(this);
    }

    public final void y9(@NotNull Function1<? super androidx.compose.ui.semantics.e0, Unit> function1) {
        this.f28742s = function1;
    }
}
