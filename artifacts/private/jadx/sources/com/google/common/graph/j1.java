package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.a
@g0
public final class j1<N, E> extends k<N> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f118635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    f0<? super E> f118636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    com.google.common.base.e0<Integer> f118637h;

    private j1(boolean directed) {
        super(directed);
        this.f118635f = false;
        this.f118636g = f0.d();
        this.f118637h = com.google.common.base.e0.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N, E1 extends E> j1<N1, E1> d() {
        return this;
    }

    public static j1<Object, Object> e() {
        return new j1<>(true);
    }

    public static <N, E> j1<N, E> i(i1<N, E> network) {
        return new j1(network.c()).a(network.B()).b(network.m()).k(network.k()).f(network.v());
    }

    public static j1<Object, Object> l() {
        return new j1<>(false);
    }

    @z7.a
    public j1<N, E> a(boolean allowsParallelEdges) {
        this.f118635f = allowsParallelEdges;
        return this;
    }

    @z7.a
    public j1<N, E> b(boolean allowsSelfLoops) {
        this.f118639b = allowsSelfLoops;
        return this;
    }

    public <N1 extends N, E1 extends E> g1<N1, E1> c() {
        return new o1(this);
    }

    public <E1 extends E> j1<N, E1> f(f0<E1> f0Var) {
        j1<N, E1> j1Var = (j1<N, E1>) d();
        j1Var.f118636g = (f0) com.google.common.base.j0.E(f0Var);
        return j1Var;
    }

    @z7.a
    public j1<N, E> g(int expectedEdgeCount) {
        this.f118637h = com.google.common.base.e0.f(Integer.valueOf(q0.d(expectedEdgeCount)));
        return this;
    }

    @z7.a
    public j1<N, E> h(int expectedNodeCount) {
        this.f118642e = com.google.common.base.e0.f(Integer.valueOf(q0.d(expectedNodeCount)));
        return this;
    }

    public <N1 extends N, E1 extends E> x0.a<N1, E1> j() {
        return new x0.a<>(d());
    }

    public <N1 extends N> j1<N1, E> k(f0<N1> f0Var) {
        j1<N1, E> j1Var = (j1<N1, E>) d();
        j1Var.f118640c = (f0) com.google.common.base.j0.E(f0Var);
        return j1Var;
    }
}
