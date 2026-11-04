package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
abstract class l0<N, V> extends w<N, V> {
    l0() {
    }

    @Override // com.google.common.graph.y1
    @fj.a
    public V C(N nodeU, N nodeV, @fj.a V defaultValue) {
        return Y().C(nodeU, nodeV, defaultValue);
    }

    @Override // com.google.common.graph.e
    protected long R() {
        return Y().g().size();
    }

    abstract y1<N, V> Y();

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public boolean c() {
        return Y().c();
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public Set<N> d(N node) {
        return Y().d(node);
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public Set<N> e() {
        return Y().e();
    }

    @Override // com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
    public int f(N node) {
        return Y().f(node);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
    public boolean h(N nodeU, N nodeV) {
        return Y().h(nodeU, nodeV);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
    public boolean i(h0<N> endpoints) {
        return Y().i(endpoints);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
    public int j(N node) {
        return Y().j(node);
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public f0<N> k() {
        return Y().k();
    }

    @Override // com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
    public int l(N node) {
        return Y().l(node);
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public boolean m() {
        return Y().m();
    }

    @Override // com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
    public f0<N> q() {
        return Y().q();
    }

    @Override // com.google.common.graph.y1
    @fj.a
    public V y(h0<N> endpoints, @fj.a V defaultValue) {
        return Y().y(endpoints, defaultValue);
    }

    @Override // com.google.common.graph.x, com.google.common.graph.s1
    public Set<N> a(N node) {
        return Y().a((Object) node);
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m1
    public Set<N> b(N node) {
        return Y().b((Object) node);
    }
}
