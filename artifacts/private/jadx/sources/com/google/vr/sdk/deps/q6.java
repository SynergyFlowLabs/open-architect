package com.google.vr.sdk.deps;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t2 f129558a;

    private q6(t2 t2Var) {
        t2 t2Var2 = (t2) k3.f(t2Var, "output");
        this.f129558a = t2Var2;
        t2Var2.f129580a = this;
    }

    public static q6 b(t2 t2Var) {
        q6 q6Var = t2Var.f129580a;
        return q6Var != null ? q6Var : new q6(t2Var);
    }

    private void t(int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f129558a.r(i10, (String) obj);
        } else {
            this.f129558a.o(i10, (k2) obj);
        }
    }

    public void A(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f129558a.m(i10, 2);
            int iH0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iH0 += t2.h0(list.get(i12).longValue());
            }
            this.f129558a.M(iH0);
            while (i11 < list.size()) {
                this.f129558a.t(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f129558a.n(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public void B(int i10, int i11) throws IOException {
        this.f129558a.o0(i10, i11);
    }

    public void C(int i10, long j10) throws IOException {
        this.f129558a.a0(i10, j10);
    }

    public void D(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f129558a.n(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f129558a.m(i10, 2);
        int iN0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN0 += t2.n0(list.get(i12).longValue());
        }
        this.f129558a.M(iN0);
        while (i11 < list.size()) {
            this.f129558a.t(list.get(i11).longValue());
            i11++;
        }
    }

    public void E(int i10, int i11) throws IOException {
        this.f129558a.Z(i10, i11);
    }

    public void F(int i10, long j10) throws IOException {
        this.f129558a.O(i10, j10);
    }

    public void G(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f129558a.m(i10, 2);
            int iT = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                list.get(i12).getClass();
                iT += t2.T();
            }
            this.f129558a.M(iT);
            while (i11 < list.size()) {
                this.f129558a.b0(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f129558a.a0(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public void H(int i10, int i11) throws IOException {
        this.f129558a.j0(i10, i11);
    }

    public void I(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f129558a.m(i10, 2);
            int iK0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                list.get(i12).getClass();
                iK0 += t2.k0();
            }
            this.f129558a.M(iK0);
            while (i11 < list.size()) {
                this.f129558a.i(list.get(i11).floatValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f129558a.l(i10, list.get(i11).floatValue());
                i11++;
            }
        }
    }

    public void J(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f129558a.m(i10, 2);
            int iP0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                list.get(i12).getClass();
                iP0 += t2.p0();
            }
            this.f129558a.M(iP0);
            while (i11 < list.size()) {
                this.f129558a.h(list.get(i11).doubleValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f129558a.k(i10, list.get(i11).doubleValue());
                i11++;
            }
        }
    }

    public void K(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f129558a.N(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f129558a.m(i10, 2);
        int iE0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE0 += t2.E0(list.get(i12).intValue());
        }
        this.f129558a.M(iE0);
        while (i11 < list.size()) {
            this.f129558a.j(list.get(i11).intValue());
            i11++;
        }
    }

    public void L(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f129558a.s(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f129558a.m(i10, 2);
        int iU0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            list.get(i12).getClass();
            iU0 += t2.u0();
        }
        this.f129558a.M(iU0);
        while (i11 < list.size()) {
            this.f129558a.z(list.get(i11).booleanValue());
            i11++;
        }
    }

    public void M(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f129558a.Z(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f129558a.m(i10, 2);
        int iV0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV0 += t2.v0(list.get(i12).intValue());
        }
        this.f129558a.M(iV0);
        while (i11 < list.size()) {
            this.f129558a.M(list.get(i11).intValue());
            i11++;
        }
    }

    public void N(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f129558a.o0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f129558a.m(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            list.get(i12).getClass();
            iA += t2.A();
        }
        this.f129558a.M(iA);
        while (i11 < list.size()) {
            this.f129558a.i0(list.get(i11).intValue());
            i11++;
        }
    }

    public void O(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f129558a.a0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f129558a.m(i10, 2);
        int iD0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            list.get(i12).getClass();
            iD0 += t2.d0();
        }
        this.f129558a.M(iD0);
        while (i11 < list.size()) {
            this.f129558a.b0(list.get(i11).longValue());
            i11++;
        }
    }

    public void P(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f129558a.m(i10, 2);
            int iZ0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZ0 += t2.z0(list.get(i12).intValue());
            }
            this.f129558a.M(iZ0);
            while (i11 < list.size()) {
                this.f129558a.Y(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f129558a.j0(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public void Q(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f129558a.O(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f129558a.m(i10, 2);
        int iT0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iT0 += t2.t0(list.get(i12).longValue());
        }
        this.f129558a.M(iT0);
        while (i11 < list.size()) {
            this.f129558a.R(list.get(i11).longValue());
            i11++;
        }
    }

    public int a() {
        return e5.f129356c;
    }

    @Deprecated
    public void c(int i10) throws IOException {
        this.f129558a.m(i10, 3);
    }

    public void d(int i10, double d10) throws IOException {
        this.f129558a.k(i10, d10);
    }

    public void e(int i10, float f10) throws IOException {
        this.f129558a.l(i10, f10);
    }

    public void f(int i10, int i11) throws IOException {
        this.f129558a.o0(i10, i11);
    }

    public void g(int i10, long j10) throws IOException {
        this.f129558a.n(i10, j10);
    }

    public void h(int i10, k2 k2Var) throws IOException {
        this.f129558a.o(i10, k2Var);
    }

    public <K, V> void i(int i10, n4<K, V> n4Var, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f129558a.m(i10, 2);
            this.f129558a.M(m4.c(n4Var, entry.getKey(), entry.getValue()));
            m4.l(this.f129558a, n4Var, entry.getKey(), entry.getValue());
        }
    }

    public void j(int i10, Object obj) throws IOException {
        if (obj instanceof k2) {
            this.f129558a.P(i10, (k2) obj);
        } else {
            this.f129558a.Q(i10, (t4) obj);
        }
    }

    public void k(int i10, Object obj, k5 k5Var) throws IOException {
        this.f129558a.q(i10, (t4) obj, k5Var);
    }

    public void l(int i10, String str) throws IOException {
        this.f129558a.r(i10, str);
    }

    public void m(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (!(list instanceof d4)) {
            while (i11 < list.size()) {
                this.f129558a.r(i10, list.get(i11));
                i11++;
            }
        } else {
            d4 d4Var = (d4) list;
            while (i11 < list.size()) {
                t(i10, d4Var.V3(i11));
                i11++;
            }
        }
    }

    public void n(int i10, List<?> list, k5 k5Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            k(i10, list.get(i11), k5Var);
        }
    }

    public void o(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f129558a.N(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f129558a.m(i10, 2);
        int iQ0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ0 += t2.q0(list.get(i12).intValue());
        }
        this.f129558a.M(iQ0);
        while (i11 < list.size()) {
            this.f129558a.j(list.get(i11).intValue());
            i11++;
        }
    }

    public void p(int i10, boolean z10) throws IOException {
        this.f129558a.s(i10, z10);
    }

    @Deprecated
    public void q(int i10) throws IOException {
        this.f129558a.m(i10, 4);
    }

    public void r(int i10, int i11) throws IOException {
        this.f129558a.N(i10, i11);
    }

    public void s(int i10, long j10) throws IOException {
        this.f129558a.a0(i10, j10);
    }

    @Deprecated
    public void u(int i10, Object obj, k5 k5Var) throws IOException {
        t2 t2Var = this.f129558a;
        t2Var.m(i10, 3);
        k5Var.f((t4) obj, t2Var.f129580a);
        t2Var.m(i10, 4);
    }

    public void v(int i10, List<k2> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f129558a.o(i10, list.get(i11));
        }
    }

    @Deprecated
    public void w(int i10, List<?> list, k5 k5Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            u(i10, list.get(i11), k5Var);
        }
    }

    public void x(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f129558a.o0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f129558a.m(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            list.get(i12).getClass();
            iB += t2.b();
        }
        this.f129558a.M(iB);
        while (i11 < list.size()) {
            this.f129558a.i0(list.get(i11).intValue());
            i11++;
        }
    }

    public void y(int i10, int i11) throws IOException {
        this.f129558a.N(i10, i11);
    }

    public void z(int i10, long j10) throws IOException {
        this.f129558a.n(i10, j10);
    }
}
