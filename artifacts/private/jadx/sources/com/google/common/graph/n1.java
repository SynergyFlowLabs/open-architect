package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@g0
final class n1<N> extends j0<N> implements f1<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h1<N, p0.a> f118649a;

    n1(k<? super N> builder) {
        this.f118649a = new p1(builder);
    }

    @Override // com.google.common.graph.f1
    public boolean E(h0<N> endpoints) {
        V(endpoints);
        return J(endpoints.l(), endpoints.m());
    }

    @Override // com.google.common.graph.f1
    public boolean J(N nodeU, N nodeV) {
        return this.f118649a.x(nodeU, nodeV, p0.a.EDGE_EXISTS) == null;
    }

    @Override // com.google.common.graph.j0
    x<N> W() {
        return this.f118649a;
    }

    @Override // com.google.common.graph.f1
    public boolean o(N node) {
        return this.f118649a.o(node);
    }

    @Override // com.google.common.graph.f1
    public boolean p(N node) {
        return this.f118649a.p(node);
    }

    @Override // com.google.common.graph.f1
    public boolean r(N nodeU, N nodeV) {
        return this.f118649a.r(nodeU, nodeV) != null;
    }

    @Override // com.google.common.graph.f1
    public boolean s(h0<N> endpoints) {
        V(endpoints);
        return r(endpoints.l(), endpoints.m());
    }
}
