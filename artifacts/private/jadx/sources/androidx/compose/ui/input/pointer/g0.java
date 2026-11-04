package androidx.compose.ui.input.pointer;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f39036f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.l0 f39037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f39038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final d0 f39039c = new d0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.w f39040d = new androidx.compose.ui.node.w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f39041e;

    public g0(@NotNull androidx.compose.ui.node.l0 l0Var) {
        this.f39037a = l0Var;
        this.f39038b = new g(l0Var.n());
    }

    public static /* synthetic */ int d(g0 g0Var, e0 e0Var, s0 s0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return g0Var.c(e0Var, s0Var, z10);
    }

    public final void a() {
        this.f39038b.d();
    }

    @NotNull
    public final androidx.compose.ui.node.l0 b() {
        return this.f39037a;
    }

    public final int c(@NotNull e0 e0Var, @NotNull s0 s0Var, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        if (this.f39041e) {
            return h0.a(false, false, false);
        }
        boolean z13 = true;
        try {
            this.f39041e = true;
            i iVarB = this.f39039c.b(e0Var, s0Var);
            int size = iVarB.b().size();
            while (true) {
                if (i10 >= size) {
                    z11 = true;
                    break;
                }
                c0 c0VarW = iVarB.b().w(i10);
                i10 = (c0VarW.w() || c0VarW.z()) ? 0 : i10 + 1;
                z11 = false;
                break;
            }
            int size2 = iVarB.b().size();
            for (int i11 = 0; i11 < size2; i11++) {
                c0 c0VarW2 = iVarB.b().w(i11);
                if (z11 || r.c(c0VarW2)) {
                    androidx.compose.ui.node.l0.S0(this.f39037a, c0VarW2.u(), this.f39040d, c0VarW2.C(), false, 8, null);
                    if (!this.f39040d.isEmpty()) {
                        this.f39038b.b(c0VarW2.s(), this.f39040d, r.c(c0VarW2));
                        this.f39040d.clear();
                    }
                }
            }
            boolean zE = this.f39038b.e(iVarB, z10);
            if (iVarB.e()) {
                z12 = false;
                break;
            }
            int size3 = iVarB.b().size();
            int i12 = 0;
            while (true) {
                if (i12 >= size3) {
                    z12 = false;
                    break;
                }
                c0 c0VarW3 = iVarB.b().w(i12);
                if (r.q(c0VarW3) && c0VarW3.F()) {
                    z12 = true;
                    break;
                }
                i12++;
            }
            int size4 = iVarB.b().size();
            int i13 = 0;
            while (true) {
                if (i13 >= size4) {
                    z13 = false;
                    break;
                }
                if (iVarB.b().w(i13).F()) {
                    break;
                }
                i13++;
            }
            return h0.a(zE, z12, z13);
        } finally {
            this.f39041e = false;
        }
    }

    public final void e() {
        if (this.f39041e) {
            return;
        }
        this.f39039c.a();
        this.f39038b.h();
    }
}
