package com.google.common.graph;

import com.google.common.collect.b8;
import com.google.common.collect.n6;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
@com.google.common.annotations.a
@z7.j(containerOf = {"N", androidx.exifinterface.media.a.Y4})
public final class z0<N, V> extends r1<N, V> {

    public static class a<N, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h1<N, V> f118746a;

        a(z1<N, V> graphBuilder) {
            this.f118746a = graphBuilder.d().i(f0.g()).b();
        }

        @z7.a
        public a<N, V> a(N node) {
            this.f118746a.p(node);
            return this;
        }

        public z0<N, V> b() {
            return z0.g0(this.f118746a);
        }

        @z7.a
        public a<N, V> c(h0<N> endpoints, V value) {
            this.f118746a.F(endpoints, value);
            return this;
        }

        @z7.a
        public a<N, V> d(N nodeU, N nodeV, V value) {
            this.f118746a.x(nodeU, nodeV, value);
            return this;
        }
    }

    private z0(y1<N, V> graph) {
        super(z1.g(graph), h0(graph), graph.g().size());
    }

    public static /* synthetic */ Object c0(y1 y1Var, Object obj, Object obj2) {
        Object objC = y1Var.C(obj, obj2, null);
        Objects.requireNonNull(objC);
        return objC;
    }

    private static <N, V> o0<N, V> e0(final y1<N, V> graph, final N node) {
        com.google.common.base.t tVar = new com.google.common.base.t() { // from class: com.google.common.graph.y0
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return z0.c0(graph, node, obj);
            }
        };
        return graph.c() ? b0.v(node, graph.n(node), tVar) : v1.l(b8.j(graph.d(node), tVar));
    }

    @Deprecated
    public static <N, V> z0<N, V> f0(z0<N, V> graph) {
        return (z0) com.google.common.base.j0.E(graph);
    }

    public static <N, V> z0<N, V> g0(y1<N, V> graph) {
        return graph instanceof z0 ? (z0) graph : new z0<>(graph);
    }

    private static <N, V> n6<N, o0<N, V>> h0(y1<N, V> graph) {
        n6.b bVarB = n6.b();
        for (N n10 : graph.e()) {
            bVarB.i(n10, e0(graph, n10));
        }
        return bVarB.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.r1, com.google.common.graph.y1
    @fj.a
    public /* bridge */ /* synthetic */ Object C(Object nodeU, Object nodeV, @fj.a Object defaultValue) {
        return super.C(nodeU, nodeV, defaultValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.r1, com.google.common.graph.x, com.google.common.graph.s1
    public /* bridge */ /* synthetic */ Set a(Object node) {
        return super.a(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.r1, com.google.common.graph.x, com.google.common.graph.m1
    public /* bridge */ /* synthetic */ Set b(Object node) {
        return super.b(node);
    }

    @Override // com.google.common.graph.r1, com.google.common.graph.x, com.google.common.graph.m0
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.r1, com.google.common.graph.x, com.google.common.graph.m0
    public /* bridge */ /* synthetic */ Set d(Object node) {
        return super.d(node);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.y1
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public t0<N> t() {
        return new t0<>(this);
    }

    @Override // com.google.common.graph.r1, com.google.common.graph.x, com.google.common.graph.m0
    public /* bridge */ /* synthetic */ Set e() {
        return super.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.r1, com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ boolean h(Object nodeU, Object nodeV) {
        return super.h(nodeU, nodeV);
    }

    @Override // com.google.common.graph.r1, com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ boolean i(h0 endpoints) {
        return super.i(endpoints);
    }

    @Override // com.google.common.graph.r1, com.google.common.graph.x, com.google.common.graph.m0
    public /* bridge */ /* synthetic */ f0 k() {
        return super.k();
    }

    @Override // com.google.common.graph.r1, com.google.common.graph.x, com.google.common.graph.m0
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.r1, com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ Set n(Object node) {
        return super.n(node);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
    public f0<N> q() {
        return f0.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.r1, com.google.common.graph.y1
    @fj.a
    public /* bridge */ /* synthetic */ Object y(h0 endpoints, @fj.a Object defaultValue) {
        return super.y(endpoints, defaultValue);
    }
}
