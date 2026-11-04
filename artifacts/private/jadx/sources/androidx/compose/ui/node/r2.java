package androidx.compose.ui.node;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class r2 extends androidx.compose.runtime.a<l0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f39984e = androidx.compose.runtime.a.f35288d;

    public r2(@NotNull l0 l0Var) {
        super(l0Var);
    }

    @Override // androidx.compose.runtime.i
    public void b(int i10, int i11) {
        a().K1(i10, i11);
    }

    @Override // androidx.compose.runtime.i
    public void c() {
        super.c();
        x1 x1VarI0 = p().I0();
        if (x1VarI0 != null) {
            x1VarI0.x();
        }
    }

    @Override // androidx.compose.runtime.i
    public void e() {
        a().r();
    }

    @Override // androidx.compose.runtime.i
    public void i(int i10, int i11, int i12) {
        a().A1(i10, i11, i12);
    }

    @Override // androidx.compose.runtime.a
    protected void r() {
        p().J1();
    }

    @Override // androidx.compose.runtime.i
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m(int i10, @NotNull l0 l0Var) {
        a().W0(i10, l0Var);
    }

    @Override // androidx.compose.runtime.i
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void l(int i10, @NotNull l0 l0Var) {
    }
}
