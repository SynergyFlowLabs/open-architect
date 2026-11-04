package com.google.vr.sdk.deps;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
class a6<T, B> {
    a6() {
    }

    static b6 F(Object obj) {
        return ((i3) obj).f129430c;
    }

    static b6 a(b6 b6Var) {
        b6Var.i();
        return b6Var;
    }

    static b6 b(b6 b6Var, b6 b6Var2) {
        return b6Var2.equals(b6.a()) ? b6Var : b6.b(b6Var, b6Var2);
    }

    static void d(b6 b6Var, int i10, int i11) {
        b6Var.c((i10 << 3) | 5, Integer.valueOf(i11));
    }

    static void e(b6 b6Var, int i10, long j10) {
        b6Var.c(i10 << 3, Long.valueOf(j10));
    }

    static void f(b6 b6Var, int i10, k2 k2Var) {
        b6Var.c((i10 << 3) | 2, k2Var);
    }

    static void g(b6 b6Var, int i10, b6 b6Var2) {
        b6Var.c((i10 << 3) | 3, b6Var2);
    }

    static void l(Object obj, b6 b6Var) {
        ((i3) obj).f129430c = b6Var;
    }

    static int q(b6 b6Var) {
        return b6Var.k();
    }

    static void t(b6 b6Var, int i10, long j10) {
        b6Var.c((i10 << 3) | 1, Long.valueOf(j10));
    }

    static int y(b6 b6Var) {
        return b6Var.j();
    }

    static b6 z() {
        return b6.g();
    }

    /* synthetic */ B A(Object obj) {
        return (B) G(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ T B(T t10, T t11) {
        return (T) b((b6) t10, (b6) t11);
    }

    void C(Object obj) {
        F(obj).i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ int D(T t10) {
        return y((b6) t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ int E(T t10) {
        return q((b6) t10);
    }

    b6 G(Object obj) {
        b6 b6VarF = F(obj);
        if (b6VarF != b6.a()) {
            return b6VarF;
        }
        b6 b6VarG = b6.g();
        l(obj, b6VarG);
        return b6VarG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ T c(B b10) {
        return (T) a((b6) b10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ void h(B b10, int i10, int i11) {
        d((b6) b10, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ void i(B b10, int i10, long j10) {
        e((b6) b10, i10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ void j(B b10, int i10, k2 k2Var) {
        f((b6) b10, i10, k2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ void k(B b10, int i10, T t10) {
        g((b6) b10, i10, (b6) t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ void m(T t10, q6 q6Var) throws IOException {
        ((b6) t10).h(q6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ void n(Object obj, T t10) {
        l(obj, (b6) t10);
    }

    boolean o() {
        return false;
    }

    final boolean p(B b10, j5 j5Var) throws IOException {
        int iB = j5Var.b();
        int i10 = iB >>> 3;
        int i11 = iB & 7;
        if (i11 == 0) {
            i(b10, i10, j5Var.J());
            return true;
        }
        if (i11 == 1) {
            u(b10, i10, j5Var.i());
            return true;
        }
        if (i11 == 2) {
            j(b10, i10, j5Var.n());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw v3.e();
            }
            h(b10, i10, j5Var.a());
            return true;
        }
        B bR = r();
        int i12 = 4 | (i10 << 3);
        while (j5Var.y() != Integer.MAX_VALUE && p(bR, j5Var)) {
        }
        if (i12 != j5Var.b()) {
            throw v3.d();
        }
        k(b10, i10, c(bR));
        return true;
    }

    /* synthetic */ B r() {
        return (B) z();
    }

    /* synthetic */ T s(Object obj) {
        return (T) F(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ void u(B b10, int i10, long j10) {
        t((b6) b10, i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void x(Object obj, b6 b6Var) {
        l(obj, b6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ void w(T t10, q6 q6Var) throws IOException {
        ((b6) t10).e(q6Var);
    }

    a6(byte b10) {
        this();
    }
}
