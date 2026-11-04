package com.google.common.graph;

import com.google.common.collect.b8;
import com.google.common.collect.p7;
import com.google.common.collect.z6;
import com.google.common.collect.z9;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.a
@g0
public abstract class t<N, E> implements i1<N, E> {

    class a extends j<N> {

        /* JADX INFO: renamed from: com.google.common.graph.t$a$a, reason: collision with other inner class name */
        class C1084a extends AbstractSet<h0<N>> {
            C1084a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@fj.a Object obj) {
                if (!(obj instanceof h0)) {
                    return false;
                }
                h0<?> h0Var = (h0) obj;
                return a.this.S(h0Var) && a.this.e().contains(h0Var.l()) && a.this.a(h0Var.l()).contains(h0Var.m());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<h0<N>> iterator() {
                return p7.b0(t.this.g().iterator(), new com.google.common.base.t() { // from class: com.google.common.graph.s
                    @Override // com.google.common.base.t
                    public final Object apply(Object obj) {
                        return t.this.I(obj);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return t.this.g().size();
            }
        }

        a() {
        }

        @Override // com.google.common.graph.x, com.google.common.graph.m0
        public boolean c() {
            return t.this.c();
        }

        @Override // com.google.common.graph.x, com.google.common.graph.m0
        public Set<N> d(N node) {
            return t.this.d(node);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.m0
        public Set<N> e() {
            return t.this.e();
        }

        @Override // com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
        public Set<h0<N>> g() {
            return t.this.B() ? super.g() : new C1084a();
        }

        @Override // com.google.common.graph.x, com.google.common.graph.m0
        public f0<N> k() {
            return t.this.k();
        }

        @Override // com.google.common.graph.x, com.google.common.graph.m0
        public boolean m() {
            return t.this.m();
        }

        @Override // com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
        public f0<N> q() {
            return f0.i();
        }

        @Override // com.google.common.graph.x, com.google.common.graph.s1
        public Set<N> a(N node) {
            return t.this.a((Object) node);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.m1
        public Set<N> b(N node) {
            return t.this.b((Object) node);
        }
    }

    class b implements com.google.common.base.k0<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f118703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f118704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f118705c;

        b(final t this$0, final Object val$nodePresent, final Object val$nodeToCheck) {
            this.f118703a = val$nodePresent;
            this.f118704b = val$nodeToCheck;
            this.f118705c = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.base.k0
        public boolean apply(E e10) {
            return this.f118705c.I(e10).c(this.f118703a).equals(this.f118704b);
        }
    }

    private com.google.common.base.k0<E> T(final N nodePresent, final N nodeToCheck) {
        return new b(this, nodePresent, nodeToCheck);
    }

    private static <N, E> Map<E, h0<N>> U(final i1<N, E> network) {
        return b8.j(network.g(), new com.google.common.base.t() { // from class: com.google.common.graph.r
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return network.I(obj);
            }
        });
    }

    @Override // com.google.common.graph.i1
    public Set<E> A(E e10) {
        h0<N> h0VarI = I(e10);
        return (Set<E>) V(z9.f(z9.O(n(h0VarI.l()), n(h0VarI.m())), z6.J(e10)), e10);
    }

    @Override // com.google.common.graph.i1
    public Set<E> G(h0<N> endpoints) {
        Z(endpoints);
        return u(endpoints.l(), endpoints.m());
    }

    @Override // com.google.common.graph.i1
    @fj.a
    public E H(N nodeU, N nodeV) {
        Set<E> setU = u(nodeU, nodeV);
        int size = setU.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return setU.iterator().next();
        }
        throw new IllegalArgumentException(String.format("Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.", nodeU, nodeV));
    }

    @Override // com.google.common.graph.i1
    @fj.a
    public E K(h0<N> endpoints) {
        Z(endpoints);
        return H(endpoints.l(), endpoints.m());
    }

    protected final <T> Set<T> V(Set<T> set, final E edge) {
        return b1.n1(set, new com.google.common.base.s0() { // from class: com.google.common.graph.p
            @Override // com.google.common.base.s0
            public final Object get() {
                return Boolean.valueOf(this.f118652a.g().contains(edge));
            }
        }, new com.google.common.base.s0() { // from class: com.google.common.graph.q
            @Override // com.google.common.base.s0
            public final Object get() {
                return String.format("Edge %s that was used to generate this set is no longer in the graph.", edge);
            }
        });
    }

    protected final boolean W(h0<?> endpoints) {
        return endpoints.i() == c();
    }

    protected final <T> Set<T> X(Set<T> set, final N node) {
        return b1.n1(set, new com.google.common.base.s0() { // from class: com.google.common.graph.l
            @Override // com.google.common.base.s0
            public final Object get() {
                return Boolean.valueOf(this.f118643a.e().contains(node));
            }
        }, new com.google.common.base.s0() { // from class: com.google.common.graph.m
            @Override // com.google.common.base.s0
            public final Object get() {
                return String.format("Node %s that was used to generate this set is no longer in the graph.", node);
            }
        });
    }

    protected final <T> Set<T> Y(Set<T> set, final N nodeU, final N nodeV) {
        return b1.n1(set, new com.google.common.base.s0() { // from class: com.google.common.graph.n
            @Override // com.google.common.base.s0
            public final Object get() {
                t tVar = this.f118646a;
                return Boolean.valueOf(tVar.e().contains(nodeU) && tVar.e().contains(nodeV));
            }
        }, new com.google.common.base.s0() { // from class: com.google.common.graph.o
            @Override // com.google.common.base.s0
            public final Object get() {
                return String.format("Node %s or node %s that were used to generate this set are no longer in the graph.", nodeU, nodeV);
            }
        });
    }

    protected final void Z(h0<?> endpoints) {
        com.google.common.base.j0.E(endpoints);
        com.google.common.base.j0.e(W(endpoints), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    @Override // com.google.common.graph.i1
    public final boolean equals(@fj.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return c() == i1Var.c() && e().equals(i1Var.e()) && U(this).equals(U(i1Var));
    }

    @Override // com.google.common.graph.i1
    public int f(N node) {
        return c() ? w(node).size() : j(node);
    }

    @Override // com.google.common.graph.i1
    public boolean h(N nodeU, N nodeV) {
        com.google.common.base.j0.E(nodeU);
        com.google.common.base.j0.E(nodeV);
        return e().contains(nodeU) && a((Object) nodeU).contains(nodeV);
    }

    @Override // com.google.common.graph.i1
    public final int hashCode() {
        return U(this).hashCode();
    }

    @Override // com.google.common.graph.i1
    public boolean i(h0<N> endpoints) {
        com.google.common.base.j0.E(endpoints);
        if (W(endpoints)) {
            return h(endpoints.l(), endpoints.m());
        }
        return false;
    }

    @Override // com.google.common.graph.i1
    public int j(N node) {
        return c() ? com.google.common.math.f.t(w(node).size(), z(node).size()) : com.google.common.math.f.t(n(node).size(), u(node, node).size());
    }

    @Override // com.google.common.graph.i1
    public int l(N node) {
        return c() ? z(node).size() : j(node);
    }

    @Override // com.google.common.graph.i1
    public m0<N> t() {
        return new a();
    }

    public String toString() {
        return "isDirected: " + c() + ", allowsParallelEdges: " + B() + ", allowsSelfLoops: " + m() + ", nodes: " + e() + ", edges: " + U(this);
    }

    @Override // com.google.common.graph.i1
    public Set<E> u(N n10, N n11) {
        Set<E> setZ = z(n10);
        Set<E> setW = w(n11);
        return (Set<E>) Y(setZ.size() <= setW.size() ? Collections.unmodifiableSet(z9.i(setZ, T(n10, n11))) : Collections.unmodifiableSet(z9.i(setW, T(n11, n10))), n10, n11);
    }
}
