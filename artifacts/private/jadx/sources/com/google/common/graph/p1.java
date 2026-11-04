package com.google.common.graph;

import com.google.common.collect.l6;
import com.google.common.collect.nb;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@g0
final class p1<N, V> extends r1<N, V> implements h1<N, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f0<N> f118673f;

    p1(k<? super N> kVar) {
        super(kVar);
        this.f118673f = (f0<N>) kVar.f118641d.a();
    }

    @z7.a
    private o0<N, V> c0(N node) {
        o0<N, V> o0VarD0 = d0();
        com.google.common.base.j0.g0(this.f118696d.i(node, o0VarD0) == null);
        return o0VarD0;
    }

    private o0<N, V> d0() {
        return c() ? b0.u(this.f118673f) : v1.k(this.f118673f);
    }

    @Override // com.google.common.graph.h1
    @z7.a
    @fj.a
    public V F(h0<N> endpoints, V value) {
        V(endpoints);
        return x(endpoints.l(), endpoints.m(), value);
    }

    @Override // com.google.common.graph.h1
    @z7.a
    public boolean o(N n10) {
        com.google.common.base.j0.F(n10, "node");
        o0 o0Var = (o0<N, V>) this.f118696d.f(n10);
        if (o0Var == null) {
            return false;
        }
        if (m() && o0Var.f(n10) != null) {
            o0Var.g(n10);
            this.f118697e--;
        }
        nb it = l6.w(o0Var.b()).iterator();
        while (it.hasNext()) {
            E next = it.next();
            o0<N, V> o0VarH = this.f118696d.h(next);
            Objects.requireNonNull(o0VarH);
            o0VarH.g(n10);
            Objects.requireNonNull(o0Var.f(next));
            this.f118697e--;
        }
        if (c()) {
            nb it2 = l6.w(o0Var.c()).iterator();
            while (it2.hasNext()) {
                E next2 = it2.next();
                o0<N, V> o0VarH2 = this.f118696d.h(next2);
                Objects.requireNonNull(o0VarH2);
                com.google.common.base.j0.g0(o0VarH2.f(n10) != null);
                o0Var.g(next2);
                this.f118697e--;
            }
        }
        this.f118696d.j(n10);
        q0.e(this.f118697e);
        return true;
    }

    @Override // com.google.common.graph.h1
    @z7.a
    public boolean p(N node) {
        com.google.common.base.j0.F(node, "node");
        if (Z(node)) {
            return false;
        }
        c0(node);
        return true;
    }

    @Override // com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
    public f0<N> q() {
        return this.f118673f;
    }

    @Override // com.google.common.graph.h1
    @z7.a
    @fj.a
    public V r(N nodeU, N nodeV) {
        com.google.common.base.j0.F(nodeU, "nodeU");
        com.google.common.base.j0.F(nodeV, "nodeV");
        o0<N, V> o0VarF = this.f118696d.f(nodeU);
        o0<N, V> o0VarF2 = this.f118696d.f(nodeV);
        if (o0VarF == null || o0VarF2 == null) {
            return null;
        }
        V vF = o0VarF.f(nodeV);
        if (vF != null) {
            o0VarF2.g(nodeU);
            long j10 = this.f118697e - 1;
            this.f118697e = j10;
            q0.e(j10);
        }
        return vF;
    }

    @Override // com.google.common.graph.h1
    @z7.a
    @fj.a
    public V s(h0<N> endpoints) {
        V(endpoints);
        return r(endpoints.l(), endpoints.m());
    }

    @Override // com.google.common.graph.h1
    @z7.a
    @fj.a
    public V x(N nodeU, N nodeV, V value) {
        com.google.common.base.j0.F(nodeU, "nodeU");
        com.google.common.base.j0.F(nodeV, "nodeV");
        com.google.common.base.j0.F(value, "value");
        if (!m()) {
            com.google.common.base.j0.u(!nodeU.equals(nodeV), "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", nodeU);
        }
        o0<N, V> o0VarF = this.f118696d.f(nodeU);
        if (o0VarF == null) {
            o0VarF = c0(nodeU);
        }
        V vI = o0VarF.i(nodeV, value);
        o0<N, V> o0VarF2 = this.f118696d.f(nodeV);
        if (o0VarF2 == null) {
            o0VarF2 = c0(nodeV);
        }
        o0VarF2.d(nodeU, value);
        if (vI == null) {
            long j10 = this.f118697e + 1;
            this.f118697e = j10;
            q0.g(j10);
        }
        return vI;
    }
}
