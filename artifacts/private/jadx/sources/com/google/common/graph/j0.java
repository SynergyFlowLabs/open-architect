package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
abstract class j0<N> extends j<N> {
    j0() {
    }

    @Override // com.google.common.graph.e
    protected long R() {
        return W().g().size();
    }

    abstract x<N> W();

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public boolean c() {
        return W().c();
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public Set<N> d(N node) {
        return W().d(node);
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public Set<N> e() {
        return W().e();
    }

    @Override // com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
    public int f(N node) {
        return W().f(node);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
    public boolean h(N nodeU, N nodeV) {
        return W().h(nodeU, nodeV);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
    public boolean i(h0<N> endpoints) {
        return W().i(endpoints);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
    public int j(N node) {
        return W().j(node);
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public f0<N> k() {
        return W().k();
    }

    @Override // com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
    public int l(N node) {
        return W().l(node);
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public boolean m() {
        return W().m();
    }

    @Override // com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
    public Set<h0<N>> n(N node) {
        return W().n(node);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
    public f0<N> q() {
        return W().q();
    }

    @Override // com.google.common.graph.x, com.google.common.graph.s1
    public Set<N> a(N node) {
        return W().a((Object) node);
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m1
    public Set<N> b(N node) {
        return W().b((Object) node);
    }
}
