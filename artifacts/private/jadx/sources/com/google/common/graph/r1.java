package com.google.common.graph;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
@g0
class r1<N, V> extends w<N, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f118693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f118694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0<N> f118695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final c1<N, o0<N, V>> f118696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f118697e;

    class a extends a1<N> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o0 f118698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r1 f118699d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(final r1 this$0, x graph, Object node, final o0 val$connections) {
            super(graph, node);
            this.f118698c = val$connections;
            this.f118699d = this$0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<h0<N>> iterator() {
            return this.f118698c.h(this.f118558a);
        }
    }

    r1(k<? super N> builder) {
        this(builder, builder.f118640c.c(builder.f118642e.i(10).intValue()), 0L);
    }

    private final o0<N, V> Y(N node) {
        o0<N, V> o0VarF = this.f118696d.f(node);
        if (o0VarF != null) {
            return o0VarF;
        }
        com.google.common.base.j0.E(node);
        throw new IllegalArgumentException("Node " + node + " is not an element of this graph.");
    }

    @fj.a
    private final V a0(N nodeU, N nodeV, @fj.a V defaultValue) {
        o0<N, V> o0VarF = this.f118696d.f(nodeU);
        V vE = o0VarF == null ? null : o0VarF.e(nodeV);
        return vE == null ? defaultValue : vE;
    }

    private final boolean b0(N nodeU, N nodeV) {
        o0<N, V> o0VarF = this.f118696d.f(nodeU);
        if (o0VarF == null || !o0VarF.b().contains(nodeV)) {
            return false;
        }
        int i10 = 3 ^ 1;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.y1
    @fj.a
    public V C(N n10, N n11, @fj.a V v10) {
        return (V) a0(com.google.common.base.j0.E(n10), com.google.common.base.j0.E(n11), v10);
    }

    @Override // com.google.common.graph.e
    protected long R() {
        return this.f118697e;
    }

    final boolean Z(@fj.a N node) {
        return this.f118696d.e(node);
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public boolean c() {
        return this.f118693a;
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public Set<N> d(N n10) {
        return (Set<N>) T(Y(n10).a(), n10);
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public Set<N> e() {
        return this.f118696d.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
    public boolean h(N nodeU, N nodeV) {
        return b0(com.google.common.base.j0.E(nodeU), com.google.common.base.j0.E(nodeV));
    }

    @Override // com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
    public boolean i(h0<N> endpoints) {
        com.google.common.base.j0.E(endpoints);
        return S(endpoints) && b0(endpoints.l(), endpoints.m());
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public f0<N> k() {
        return this.f118695c;
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    public boolean m() {
        return this.f118694b;
    }

    @Override // com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
    public Set<h0<N>> n(N n10) {
        return (Set<h0<N>>) T(new a(this, this, n10, Y(n10)), n10);
    }

    @Override // com.google.common.graph.y1
    @fj.a
    public V y(h0<N> endpoints, @fj.a V defaultValue) {
        V(endpoints);
        return a0(endpoints.l(), endpoints.m(), defaultValue);
    }

    @Override // com.google.common.graph.x, com.google.common.graph.s1
    public Set<N> a(N n10) {
        return (Set<N>) T(Y(n10).b(), n10);
    }

    @Override // com.google.common.graph.x, com.google.common.graph.m1
    public Set<N> b(N n10) {
        return (Set<N>) T(Y(n10).c(), n10);
    }

    r1(k<? super N> kVar, Map<N, o0<N, V>> map, long j10) {
        this.f118693a = kVar.f118638a;
        this.f118694b = kVar.f118639b;
        this.f118695c = (f0<N>) kVar.f118640c.a();
        this.f118696d = map instanceof TreeMap ? new d1<>(map) : new c1<>(map);
        this.f118697e = q0.e(j10);
    }
}
