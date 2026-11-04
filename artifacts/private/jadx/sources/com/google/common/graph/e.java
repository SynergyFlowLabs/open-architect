package com.google.common.graph;

import com.google.common.collect.nb;
import com.google.common.collect.p7;
import com.google.common.collect.z6;
import com.google.common.collect.z9;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
abstract class e<N> implements x<N> {

    class a extends AbstractSet<h0<N>> {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public nb<h0<N>> iterator() {
            return i0.f(e.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object obj) {
            if (!(obj instanceof h0)) {
                return false;
            }
            h0<?> h0Var = (h0) obj;
            return e.this.S(h0Var) && e.this.e().contains(h0Var.l()) && e.this.a(h0Var.l()).contains(h0Var.m());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object o10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.primitives.l.A(e.this.R());
        }
    }

    class b extends a1<N> {
        b(x graph, Object node) {
            super(graph, node);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public nb<h0<N>> iterator() {
            return this.f118559b.c() ? p7.e0(p7.i(p7.b0(this.f118559b.b((Object) this.f118558a).iterator(), new com.google.common.base.t() { // from class: com.google.common.graph.f
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return h0.r(obj, this.f118614a.f118558a);
                }
            }), p7.b0(z9.f(this.f118559b.a((Object) this.f118558a), z6.J(this.f118558a)).iterator(), new com.google.common.base.t() { // from class: com.google.common.graph.g
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return h0.r(this.f118622a.f118558a, obj);
                }
            }))) : p7.e0(p7.b0(this.f118559b.d(this.f118558a).iterator(), new com.google.common.base.t() { // from class: com.google.common.graph.h
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return h0.u(this.f118623a.f118558a, obj);
                }
            }));
        }
    }

    e() {
    }

    protected long R() {
        Iterator<N> it = e().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += (long) j(it.next());
        }
        com.google.common.base.j0.g0((1 & j10) == 0);
        return j10 >>> 1;
    }

    protected final boolean S(h0<?> endpoints) {
        return endpoints.i() == c();
    }

    protected final <T> Set<T> T(Set<T> set, final N node) {
        return b1.n1(set, new com.google.common.base.s0() { // from class: com.google.common.graph.c
            @Override // com.google.common.base.s0
            public final Object get() {
                return Boolean.valueOf(this.f118590a.e().contains(node));
            }
        }, new com.google.common.base.s0() { // from class: com.google.common.graph.d
            @Override // com.google.common.base.s0
            public final Object get() {
                return String.format("Node %s that was used to generate this set is no longer in the graph.", node);
            }
        });
    }

    protected final <T> Set<T> U(Set<T> set, final N nodeU, final N nodeV) {
        return b1.n1(set, new com.google.common.base.s0() { // from class: com.google.common.graph.a
            @Override // com.google.common.base.s0
            public final Object get() {
                e eVar = this.f118554a;
                return Boolean.valueOf(eVar.e().contains(nodeU) && eVar.e().contains(nodeV));
            }
        }, new com.google.common.base.s0() { // from class: com.google.common.graph.b
            @Override // com.google.common.base.s0
            public final Object get() {
                return String.format("Node %s or node %s that were used to generate this set are no longer in the graph.", nodeU, nodeV);
            }
        });
    }

    protected final void V(h0<?> endpoints) {
        com.google.common.base.j0.E(endpoints);
        com.google.common.base.j0.e(S(endpoints), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    @Override // com.google.common.graph.x
    public int f(N node) {
        return c() ? b((Object) node).size() : j(node);
    }

    @Override // com.google.common.graph.x
    public Set<h0<N>> g() {
        return new a();
    }

    @Override // com.google.common.graph.x
    public boolean h(N nodeU, N nodeV) {
        com.google.common.base.j0.E(nodeU);
        com.google.common.base.j0.E(nodeV);
        return e().contains(nodeU) && a((Object) nodeU).contains(nodeV);
    }

    @Override // com.google.common.graph.x
    public boolean i(h0<N> endpoints) {
        com.google.common.base.j0.E(endpoints);
        if (!S(endpoints)) {
            return false;
        }
        N nL = endpoints.l();
        return e().contains(nL) && a((Object) nL).contains(endpoints.m());
    }

    @Override // com.google.common.graph.x
    public int j(N node) {
        if (c()) {
            return com.google.common.math.f.t(b((Object) node).size(), a((Object) node).size());
        }
        Set<N> setD = d(node);
        return com.google.common.math.f.t(setD.size(), (m() && setD.contains(node)) ? 1 : 0);
    }

    @Override // com.google.common.graph.x
    public int l(N node) {
        return c() ? a((Object) node).size() : j(node);
    }

    @Override // com.google.common.graph.x
    public Set<h0<N>> n(N n10) {
        com.google.common.base.j0.E(n10);
        com.google.common.base.j0.u(e().contains(n10), "Node %s is not an element of this graph.", n10);
        return (Set<h0<N>>) T(new b(this, n10), n10);
    }

    @Override // com.google.common.graph.x
    public f0<N> q() {
        return f0.i();
    }
}
