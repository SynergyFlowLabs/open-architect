package com.google.common.graph;

import com.google.common.collect.z6;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
@g0
class q1<N, E> extends t<N, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f118684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f118685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f118686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0<N> f118687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f0<E> f118688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final c1<N, k1<N, E>> f118689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final c1<E, N> f118690g;

    q1(j1<? super N, ? super E> builder) {
        this(builder, builder.f118640c.c(builder.f118642e.i(10).intValue()), builder.f118636g.c(builder.f118637h.i(20).intValue()));
    }

    @Override // com.google.common.graph.i1
    public boolean B() {
        return this.f118685b;
    }

    @Override // com.google.common.graph.i1
    public h0<N> I(E edge) {
        N nB0 = b0(edge);
        k1<N, E> k1VarF = this.f118689f.f(nB0);
        Objects.requireNonNull(k1VarF);
        return h0.p(this, nB0, k1VarF.d(edge));
    }

    final k1<N, E> a0(N node) {
        k1<N, E> k1VarF = this.f118689f.f(node);
        if (k1VarF != null) {
            return k1VarF;
        }
        com.google.common.base.j0.E(node);
        throw new IllegalArgumentException(String.format("Node %s is not an element of this graph.", node));
    }

    final N b0(E edge) {
        N nF = this.f118690g.f(edge);
        if (nF != null) {
            return nF;
        }
        com.google.common.base.j0.E(edge);
        throw new IllegalArgumentException(String.format("Edge %s is not an element of this graph.", edge));
    }

    @Override // com.google.common.graph.i1
    public boolean c() {
        return this.f118684a;
    }

    final boolean c0(E edge) {
        return this.f118690g.e(edge);
    }

    @Override // com.google.common.graph.i1
    public Set<N> d(N n10) {
        return (Set<N>) X(a0(n10).a(), n10);
    }

    final boolean d0(N node) {
        return this.f118689f.e(node);
    }

    @Override // com.google.common.graph.i1
    public Set<N> e() {
        return this.f118689f.k();
    }

    @Override // com.google.common.graph.i1
    public Set<E> g() {
        return this.f118690g.k();
    }

    @Override // com.google.common.graph.i1
    public f0<N> k() {
        return this.f118687d;
    }

    @Override // com.google.common.graph.i1
    public boolean m() {
        return this.f118686c;
    }

    @Override // com.google.common.graph.i1
    public Set<E> n(N n10) {
        return (Set<E>) X(a0(n10).k(), n10);
    }

    @Override // com.google.common.graph.t, com.google.common.graph.i1
    public Set<E> u(N n10, N n11) {
        k1<N, E> k1VarA0 = a0(n10);
        if (!this.f118686c && n10 == n11) {
            return z6.G();
        }
        com.google.common.base.j0.u(d0(n11), "Node %s is not an element of this graph.", n11);
        return (Set<E>) Y(k1VarA0.l(n11), n10, n11);
    }

    @Override // com.google.common.graph.i1
    public f0<E> v() {
        return this.f118688e;
    }

    @Override // com.google.common.graph.i1
    public Set<E> w(N n10) {
        return (Set<E>) X(a0(n10).e(), n10);
    }

    @Override // com.google.common.graph.i1
    public Set<E> z(N n10) {
        return (Set<E>) X(a0(n10).g(), n10);
    }

    @Override // com.google.common.graph.i1, com.google.common.graph.s1
    public Set<N> a(N n10) {
        return (Set<N>) X(a0(n10).b(), n10);
    }

    @Override // com.google.common.graph.i1, com.google.common.graph.m1
    public Set<N> b(N n10) {
        return (Set<N>) X(a0(n10).c(), n10);
    }

    q1(j1<? super N, ? super E> j1Var, Map<N, k1<N, E>> map, Map<E, N> map2) {
        c1<N, k1<N, E>> c1Var;
        this.f118684a = j1Var.f118638a;
        this.f118685b = j1Var.f118635f;
        this.f118686c = j1Var.f118639b;
        this.f118687d = (f0<N>) j1Var.f118640c.a();
        this.f118688e = (f0<E>) j1Var.f118636g.a();
        if (map instanceof TreeMap) {
            c1Var = new d1<>(map);
        } else {
            c1Var = new c1<>(map);
        }
        this.f118689f = c1Var;
        this.f118690g = new c1<>(map2);
    }
}
