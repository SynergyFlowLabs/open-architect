package com.google.common.graph;

import com.google.common.collect.b8;
import com.google.common.collect.n6;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
@com.google.common.annotations.a
@z7.j(containerOf = {"N"})
public class t0<N> extends j0<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x<N> f118706a;

    public static class a<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f1<N> f118707a;

        a(n0<N> graphBuilder) {
            this.f118707a = graphBuilder.d().i(f0.g()).b();
        }

        @z7.a
        public a<N> a(N node) {
            this.f118707a.p(node);
            return this;
        }

        public t0<N> b() {
            return t0.Y(this.f118707a);
        }

        @z7.a
        public a<N> c(h0<N> endpoints) {
            this.f118707a.E(endpoints);
            return this;
        }

        @z7.a
        public a<N> d(N nodeU, N nodeV) {
            this.f118707a.J(nodeU, nodeV);
            return this;
        }
    }

    t0(x<N> backingGraph) {
        this.f118706a = backingGraph;
    }

    private static <N> o0<N, p0.a> X(m0<N> graph, N node) {
        com.google.common.base.t tVarB = com.google.common.base.v.b(p0.a.EDGE_EXISTS);
        return graph.c() ? b0.v(node, graph.n(node), tVarB) : v1.l(b8.j(graph.d(node), tVarB));
    }

    public static <N> t0<N> Y(m0<N> graph) {
        return graph instanceof t0 ? (t0) graph : new t0<>(new r1(n0.g(graph), a0(graph), graph.g().size()));
    }

    @Deprecated
    public static <N> t0<N> Z(t0<N> graph) {
        return (t0) com.google.common.base.j0.E(graph);
    }

    private static <N> n6<N, o0<N, p0.a>> a0(m0<N> graph) {
        n6.b bVarB = n6.b();
        for (N n10 : graph.e()) {
            bVarB.i(n10, X(graph, n10));
        }
        return bVarB.d();
    }

    @Override // com.google.common.graph.j0
    x<N> W() {
        return this.f118706a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.j0, com.google.common.graph.x, com.google.common.graph.s1
    public /* bridge */ /* synthetic */ Set a(Object node) {
        return super.a(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.j0, com.google.common.graph.x, com.google.common.graph.m1
    public /* bridge */ /* synthetic */ Set b(Object node) {
        return super.b(node);
    }

    @Override // com.google.common.graph.j0, com.google.common.graph.x, com.google.common.graph.m0
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.j0, com.google.common.graph.x, com.google.common.graph.m0
    public /* bridge */ /* synthetic */ Set d(Object node) {
        return super.d(node);
    }

    @Override // com.google.common.graph.j0, com.google.common.graph.x, com.google.common.graph.m0
    public /* bridge */ /* synthetic */ Set e() {
        return super.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.j0, com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ int f(Object node) {
        return super.f(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.j0, com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ boolean h(Object nodeU, Object nodeV) {
        return super.h(nodeU, nodeV);
    }

    @Override // com.google.common.graph.j0, com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ boolean i(h0 endpoints) {
        return super.i(endpoints);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.j0, com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ int j(Object node) {
        return super.j(node);
    }

    @Override // com.google.common.graph.j0, com.google.common.graph.x, com.google.common.graph.m0
    public /* bridge */ /* synthetic */ f0 k() {
        return super.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.j0, com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ int l(Object node) {
        return super.l(node);
    }

    @Override // com.google.common.graph.j0, com.google.common.graph.x, com.google.common.graph.m0
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.j0, com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ Set n(Object node) {
        return super.n(node);
    }

    @Override // com.google.common.graph.j0, com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
    public f0<N> q() {
        return f0.g();
    }
}
