package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
abstract class k0<N, E> extends t<N, E> {
    k0() {
    }

    @Override // com.google.common.graph.t, com.google.common.graph.i1
    public Set<E> A(E edge) {
        return a0().A(edge);
    }

    @Override // com.google.common.graph.i1
    public boolean B() {
        return a0().B();
    }

    @Override // com.google.common.graph.t, com.google.common.graph.i1
    public Set<E> G(h0<N> endpoints) {
        return a0().G(endpoints);
    }

    @Override // com.google.common.graph.t, com.google.common.graph.i1
    @fj.a
    public E H(N nodeU, N nodeV) {
        return a0().H(nodeU, nodeV);
    }

    @Override // com.google.common.graph.i1
    public h0<N> I(E edge) {
        return a0().I(edge);
    }

    @Override // com.google.common.graph.t, com.google.common.graph.i1
    @fj.a
    public E K(h0<N> endpoints) {
        return a0().K(endpoints);
    }

    abstract i1<N, E> a0();

    @Override // com.google.common.graph.i1
    public boolean c() {
        return a0().c();
    }

    @Override // com.google.common.graph.i1
    public Set<N> d(N node) {
        return a0().d(node);
    }

    @Override // com.google.common.graph.i1
    public Set<N> e() {
        return a0().e();
    }

    @Override // com.google.common.graph.t, com.google.common.graph.i1
    public int f(N node) {
        return a0().f(node);
    }

    @Override // com.google.common.graph.i1
    public Set<E> g() {
        return a0().g();
    }

    @Override // com.google.common.graph.t, com.google.common.graph.i1
    public boolean h(N nodeU, N nodeV) {
        return a0().h(nodeU, nodeV);
    }

    @Override // com.google.common.graph.t, com.google.common.graph.i1
    public boolean i(h0<N> endpoints) {
        return a0().i(endpoints);
    }

    @Override // com.google.common.graph.t, com.google.common.graph.i1
    public int j(N node) {
        return a0().j(node);
    }

    @Override // com.google.common.graph.i1
    public f0<N> k() {
        return a0().k();
    }

    @Override // com.google.common.graph.t, com.google.common.graph.i1
    public int l(N node) {
        return a0().l(node);
    }

    @Override // com.google.common.graph.i1
    public boolean m() {
        return a0().m();
    }

    @Override // com.google.common.graph.i1
    public Set<E> n(N node) {
        return a0().n(node);
    }

    @Override // com.google.common.graph.t, com.google.common.graph.i1
    public Set<E> u(N nodeU, N nodeV) {
        return a0().u(nodeU, nodeV);
    }

    @Override // com.google.common.graph.i1
    public f0<E> v() {
        return a0().v();
    }

    @Override // com.google.common.graph.i1
    public Set<E> w(N node) {
        return a0().w(node);
    }

    @Override // com.google.common.graph.i1
    public Set<E> z(N node) {
        return a0().z(node);
    }

    @Override // com.google.common.graph.i1, com.google.common.graph.s1
    public Set<N> a(N node) {
        return a0().a((Object) node);
    }

    @Override // com.google.common.graph.i1, com.google.common.graph.m1
    public Set<N> b(N node) {
        return a0().b((Object) node);
    }
}
