package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.k5;
import androidx.compose.foundation.text.selection.d3;
import androidx.compose.foundation.text.selection.i1;
import androidx.compose.foundation.text.selection.k3;
import androidx.compose.foundation.text.selection.n0;
import androidx.compose.ui.layout.g0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    public static final class a implements k5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f20646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f20647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<g0> f20648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d3 f20649d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f20650e;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends g0> function0, d3 d3Var, long j10) {
            this.f20648c = function0;
            this.f20649d = d3Var;
            this.f20650e = j10;
            n0.g.a aVar = n0.g.f332700b;
            this.f20646a = aVar.e();
            this.f20647b = aVar.e();
        }

        @Override // androidx.compose.foundation.text.k5
        public void a() {
            if (k3.d(this.f20649d, this.f20650e)) {
                this.f20649d.d();
            }
        }

        @Override // androidx.compose.foundation.text.k5
        public void b(long j10) {
        }

        @Override // androidx.compose.foundation.text.k5
        public void c(long j10) {
            g0 g0VarInvoke = this.f20648c.invoke();
            if (g0VarInvoke != null) {
                d3 d3Var = this.f20649d;
                long j11 = this.f20650e;
                if (g0VarInvoke.I() && k3.d(d3Var, j11)) {
                    long jW = n0.g.w(this.f20647b, j10);
                    this.f20647b = jW;
                    long jW2 = n0.g.w(this.f20646a, jW);
                    if (d3Var.c(g0VarInvoke, jW2, this.f20646a, false, n0.f21271a.o(), true)) {
                        this.f20646a = jW2;
                        this.f20647b = n0.g.f332700b.e();
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0034  */
        @Override // androidx.compose.foundation.text.k5
        public void d(long j10) {
            g0 g0VarInvoke = this.f20648c.invoke();
            if (g0VarInvoke != null) {
                d3 d3Var = this.f20649d;
                if (g0VarInvoke.I()) {
                    d3Var.i(g0VarInvoke, j10, n0.f21271a.o(), true);
                    this.f20646a = j10;
                    if (k3.d(this.f20649d, this.f20650e)) {
                        this.f20647b = n0.g.f332700b.e();
                    }
                }
            } else if (k3.d(this.f20649d, this.f20650e)) {
                this.f20647b = n0.g.f332700b.e();
            }
        }

        @Override // androidx.compose.foundation.text.k5
        public void e() {
        }

        public final long f() {
            return this.f20647b;
        }

        public final long g() {
            return this.f20646a;
        }

        public final void h(long j10) {
            this.f20647b = j10;
        }

        public final void i(long j10) {
            this.f20646a = j10;
        }

        @Override // androidx.compose.foundation.text.k5
        public void onCancel() {
            if (k3.d(this.f20649d, this.f20650e)) {
                this.f20649d.d();
            }
        }
    }

    public static final class b implements androidx.compose.foundation.text.selection.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f20651a = n0.g.f332700b.e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<g0> f20652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d3 f20653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f20654d;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function0<? extends g0> function0, d3 d3Var, long j10) {
            this.f20652b = function0;
            this.f20653c = d3Var;
            this.f20654d = j10;
        }

        @Override // androidx.compose.foundation.text.selection.r
        public boolean a(long j10, n0 n0Var) {
            g0 g0VarInvoke = this.f20652b.invoke();
            if (g0VarInvoke == null) {
                return true;
            }
            d3 d3Var = this.f20653c;
            long j11 = this.f20654d;
            int i10 = 1 << 0;
            if (!g0VarInvoke.I() || !k3.d(d3Var, j11)) {
                return false;
            }
            if (!d3Var.c(g0VarInvoke, j10, this.f20651a, false, n0Var, false)) {
                return true;
            }
            this.f20651a = j10;
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.r
        public boolean b(long j10, n0 n0Var, int i10) {
            g0 g0VarInvoke = this.f20652b.invoke();
            if (g0VarInvoke == null) {
                return false;
            }
            d3 d3Var = this.f20653c;
            long j11 = this.f20654d;
            if (!g0VarInvoke.I()) {
                return false;
            }
            d3Var.i(g0VarInvoke, j10, n0Var, false);
            this.f20651a = j10;
            return k3.d(d3Var, j11);
        }

        @Override // androidx.compose.foundation.text.selection.r
        public void c() {
            this.f20653c.d();
        }

        @Override // androidx.compose.foundation.text.selection.r
        public boolean d(long j10) {
            g0 g0VarInvoke = this.f20652b.invoke();
            if (g0VarInvoke != null) {
                d3 d3Var = this.f20653c;
                long j11 = this.f20654d;
                if (!g0VarInvoke.I() || !k3.d(d3Var, j11)) {
                    return false;
                }
                if (d3Var.c(g0VarInvoke, j10, this.f20651a, false, n0.f21271a.m(), false)) {
                    this.f20651a = j10;
                }
            }
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.r
        public boolean e(long j10) {
            g0 g0VarInvoke = this.f20652b.invoke();
            if (g0VarInvoke == null) {
                return false;
            }
            d3 d3Var = this.f20653c;
            long j11 = this.f20654d;
            if (!g0VarInvoke.I()) {
                return false;
            }
            if (d3Var.c(g0VarInvoke, j10, this.f20651a, false, n0.f21271a.m(), false)) {
                this.f20651a = j10;
            }
            return k3.d(d3Var, j11);
        }

        public final long f() {
            return this.f20651a;
        }

        public final void g(long j10) {
            this.f20651a = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.a0 b(d3 d3Var, long j10, Function0<? extends g0> function0) {
        a aVar = new a(function0, d3Var, j10);
        return i1.x(androidx.compose.ui.a0.E, new b(function0, d3Var, j10), aVar);
    }
}
