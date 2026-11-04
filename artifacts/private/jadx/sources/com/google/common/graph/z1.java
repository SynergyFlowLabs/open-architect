package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.a
@g0
public final class z1<N, V> extends k<N> {
    private z1(boolean directed) {
        super(directed);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N, V1 extends V> z1<N1, V1> c() {
        return this;
    }

    public static z1<Object, Object> e() {
        return new z1<>(true);
    }

    public static <N, V> z1<N, V> g(y1<N, V> graph) {
        return new z1(graph.c()).a(graph.m()).j(graph.k()).i(graph.q());
    }

    public static z1<Object, Object> k() {
        return new z1<>(false);
    }

    @z7.a
    public z1<N, V> a(boolean allowsSelfLoops) {
        this.f118639b = allowsSelfLoops;
        return this;
    }

    public <N1 extends N, V1 extends V> h1<N1, V1> b() {
        return new p1(this);
    }

    z1<N, V> d() {
        z1<N, V> z1Var = new z1<>(this.f118638a);
        z1Var.f118639b = this.f118639b;
        z1Var.f118640c = this.f118640c;
        z1Var.f118642e = this.f118642e;
        z1Var.f118641d = this.f118641d;
        return z1Var;
    }

    @z7.a
    public z1<N, V> f(int expectedNodeCount) {
        this.f118642e = com.google.common.base.e0.f(Integer.valueOf(q0.d(expectedNodeCount)));
        return this;
    }

    public <N1 extends N, V1 extends V> z0.a<N1, V1> h() {
        return new z0.a<>(c());
    }

    public <N1 extends N> z1<N1, V> i(f0<N1> f0Var) {
        com.google.common.base.j0.u(f0Var.h() == f0.a.UNORDERED || f0Var.h() == f0.a.STABLE, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", f0Var);
        z1<N1, V> z1Var = (z1<N1, V>) c();
        z1Var.f118641d = (f0) com.google.common.base.j0.E(f0Var);
        return z1Var;
    }

    public <N1 extends N> z1<N1, V> j(f0<N1> f0Var) {
        z1<N1, V> z1Var = (z1<N1, V>) c();
        z1Var.f118640c = (f0) com.google.common.base.j0.E(f0Var);
        return z1Var;
    }
}
