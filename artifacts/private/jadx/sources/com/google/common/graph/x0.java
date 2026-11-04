package com.google.common.graph;

import com.google.common.collect.b8;
import com.google.common.collect.n6;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
@com.google.common.annotations.a
@z7.j(containerOf = {"N", androidx.exifinterface.media.a.T4})
public final class x0<N, E> extends q1<N, E> {

    public static class a<N, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g1<N, E> f118741a;

        a(j1<N, E> j1Var) {
            this.f118741a = (g1<N, E>) j1Var.c();
        }

        @z7.a
        public a<N, E> a(h0<N> endpoints, E edge) {
            this.f118741a.D(endpoints, edge);
            return this;
        }

        @z7.a
        public a<N, E> b(N nodeU, N nodeV, E edge) {
            this.f118741a.M(nodeU, nodeV, edge);
            return this;
        }

        @z7.a
        public a<N, E> c(N node) {
            this.f118741a.p(node);
            return this;
        }

        public x0<N, E> d() {
            return x0.l0(this.f118741a);
        }
    }

    private x0(i1<N, E> network) {
        super(j1.i(network), n0(network), m0(network));
    }

    private static <N, E> com.google.common.base.t<E, N> h0(final i1<N, E> network, final N node) {
        return new com.google.common.base.t() { // from class: com.google.common.graph.v0
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return network.I(obj).c(node);
            }
        };
    }

    private static <N, E> k1<N, E> j0(i1<N, E> network, N node) {
        if (!network.c()) {
            Map mapJ = b8.j(network.n(node), h0(network, node));
            return network.B() ? w1.q(mapJ) : x1.n(mapJ);
        }
        Map mapJ2 = b8.j(network.w(node), o0(network));
        Map mapJ3 = b8.j(network.z(node), p0(network));
        int size = network.u(node, node).size();
        return network.B() ? c0.q(mapJ2, mapJ3, size) : d0.o(mapJ2, mapJ3, size);
    }

    @Deprecated
    public static <N, E> x0<N, E> k0(x0<N, E> network) {
        return (x0) com.google.common.base.j0.E(network);
    }

    public static <N, E> x0<N, E> l0(i1<N, E> network) {
        return network instanceof x0 ? (x0) network : new x0<>(network);
    }

    private static <N, E> Map<E, N> m0(i1<N, E> network) {
        n6.b bVarB = n6.b();
        for (E e10 : network.g()) {
            bVarB.i(e10, network.I(e10).l());
        }
        return bVarB.d();
    }

    private static <N, E> Map<N, k1<N, E>> n0(i1<N, E> network) {
        n6.b bVarB = n6.b();
        for (N n10 : network.e()) {
            bVarB.i(n10, j0(network, n10));
        }
        return bVarB.d();
    }

    private static <N, E> com.google.common.base.t<E, N> o0(final i1<N, E> network) {
        return new com.google.common.base.t() { // from class: com.google.common.graph.u0
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return network.I(obj).s();
            }
        };
    }

    private static <N, E> com.google.common.base.t<E, N> p0(final i1<N, E> network) {
        return new com.google.common.base.t() { // from class: com.google.common.graph.w0
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return network.I(obj).t();
            }
        };
    }

    @Override // com.google.common.graph.q1, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ boolean B() {
        return super.B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.q1, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ h0 I(Object edge) {
        return super.I(edge);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.q1, com.google.common.graph.i1, com.google.common.graph.s1
    public /* bridge */ /* synthetic */ Set a(Object node) {
        return super.a(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.q1, com.google.common.graph.i1, com.google.common.graph.m1
    public /* bridge */ /* synthetic */ Set b(Object node) {
        return super.b(node);
    }

    @Override // com.google.common.graph.q1, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.q1, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ Set d(Object node) {
        return super.d(node);
    }

    @Override // com.google.common.graph.q1, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ Set e() {
        return super.e();
    }

    @Override // com.google.common.graph.q1, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ Set g() {
        return super.g();
    }

    @Override // com.google.common.graph.t, com.google.common.graph.i1
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public t0<N> t() {
        return new t0<>(super.t());
    }

    @Override // com.google.common.graph.q1, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ f0 k() {
        return super.k();
    }

    @Override // com.google.common.graph.q1, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.q1, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ Set n(Object node) {
        return super.n(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.q1, com.google.common.graph.t, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ Set u(Object nodeU, Object nodeV) {
        return super.u(nodeU, nodeV);
    }

    @Override // com.google.common.graph.q1, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ f0 v() {
        return super.v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.q1, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ Set w(Object node) {
        return super.w(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.q1, com.google.common.graph.i1
    public /* bridge */ /* synthetic */ Set z(Object node) {
        return super.z(node);
    }
}
