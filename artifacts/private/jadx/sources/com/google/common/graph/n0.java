package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.a
@z7.f
@g0
public final class n0<N> extends k<N> {
    private n0(boolean directed) {
        super(directed);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N> n0<N1> c() {
        return this;
    }

    public static n0<Object> e() {
        return new n0<>(true);
    }

    public static <N> n0<N> g(m0<N> graph) {
        return new n0(graph.c()).a(graph.m()).j(graph.k()).i(graph.q());
    }

    public static n0<Object> k() {
        return new n0<>(false);
    }

    @z7.a
    public n0<N> a(boolean allowsSelfLoops) {
        this.f118639b = allowsSelfLoops;
        return this;
    }

    public <N1 extends N> f1<N1> b() {
        return new n1(this);
    }

    n0<N> d() {
        n0<N> n0Var = new n0<>(this.f118638a);
        n0Var.f118639b = this.f118639b;
        n0Var.f118640c = this.f118640c;
        n0Var.f118642e = this.f118642e;
        n0Var.f118641d = this.f118641d;
        return n0Var;
    }

    @z7.a
    public n0<N> f(int expectedNodeCount) {
        this.f118642e = com.google.common.base.e0.f(Integer.valueOf(q0.d(expectedNodeCount)));
        return this;
    }

    public <N1 extends N> t0.a<N1> h() {
        return new t0.a<>(c());
    }

    public <N1 extends N> n0<N1> i(f0<N1> incidentEdgeOrder) {
        com.google.common.base.j0.u(incidentEdgeOrder.h() == f0.a.UNORDERED || incidentEdgeOrder.h() == f0.a.STABLE, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", incidentEdgeOrder);
        n0<N1> n0VarC = c();
        n0VarC.f118641d = (f0) com.google.common.base.j0.E(incidentEdgeOrder);
        return n0VarC;
    }

    public <N1 extends N> n0<N1> j(f0<N1> nodeOrder) {
        n0<N1> n0VarC = c();
        n0VarC.f118640c = (f0) com.google.common.base.j0.E(nodeOrder);
        return n0VarC;
    }
}
