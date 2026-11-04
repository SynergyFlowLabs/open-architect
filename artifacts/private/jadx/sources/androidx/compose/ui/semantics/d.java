package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.node.i2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class d extends androidx.compose.ui.a0.d implements i2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f41088w = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f41089s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f41090t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private Function1<? super e0, Unit> f41091v;

    public d(boolean z10, boolean z11, @NotNull Function1<? super e0, Unit> function1) {
        this.f41089s = z10;
        this.f41090t = z11;
        this.f41091v = function1;
    }

    @Override // androidx.compose.ui.node.i2
    public boolean A4() {
        return this.f41089s;
    }

    public final void A9(@NotNull Function1<? super e0, Unit> function1) {
        this.f41091v = function1;
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull e0 e0Var) {
        this.f41091v.invoke(e0Var);
    }

    @Override // androidx.compose.ui.node.i2
    public boolean u5() {
        return this.f41090t;
    }

    public final boolean v9() {
        return this.f41089s;
    }

    @NotNull
    public final Function1<e0, Unit> w9() {
        return this.f41091v;
    }

    public final boolean x9() {
        return this.f41090t;
    }

    public final void y9(boolean z10) {
        this.f41090t = z10;
    }

    public final void z9(boolean z10) {
        this.f41089s = z10;
    }
}
