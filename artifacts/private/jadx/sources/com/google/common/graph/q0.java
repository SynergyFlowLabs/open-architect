package com.google.common.graph;

import com.google.common.collect.b8;
import com.google.common.collect.nb;
import com.google.common.collect.o7;
import com.google.common.collect.p7;
import com.google.common.collect.z6;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.a
@g0
public final class q0 extends s0 {

    private static final class a<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final N f118675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        Queue<N> f118676b;

        a(N node) {
            this.f118675a = node;
        }
    }

    private enum b {
        PENDING,
        COMPLETE
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c<N> extends j0<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m0<N> f118680a;

        class a extends a1<N> {
            a(x graph, Object node) {
                super(graph, node);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<h0<N>> iterator() {
                return p7.b0(c.this.W().n(this.f118558a).iterator(), new com.google.common.base.t() { // from class: com.google.common.graph.r0
                    @Override // com.google.common.base.t
                    public final Object apply(Object obj) {
                        h0 h0Var = (h0) obj;
                        return h0.n(q0.c.this.W(), h0Var.m(), h0Var.l());
                    }
                });
            }
        }

        c(m0<N> graph) {
            this.f118680a = graph;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.graph.j0
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public m0<N> W() {
            return this.f118680a;
        }

        @Override // com.google.common.graph.j0, com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
        public int f(N node) {
            return W().l(node);
        }

        @Override // com.google.common.graph.j0, com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
        public boolean h(N nodeU, N nodeV) {
            return W().h(nodeV, nodeU);
        }

        @Override // com.google.common.graph.j0, com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
        public boolean i(h0<N> endpoints) {
            return W().i(q0.s(endpoints));
        }

        @Override // com.google.common.graph.j0, com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
        public int l(N node) {
            return W().f(node);
        }

        @Override // com.google.common.graph.j0, com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
        public Set<h0<N>> n(N node) {
            return new a(this, node);
        }

        @Override // com.google.common.graph.j0, com.google.common.graph.x, com.google.common.graph.s1
        public Set<N> a(N node) {
            return W().b((Object) node);
        }

        @Override // com.google.common.graph.j0, com.google.common.graph.x, com.google.common.graph.m1
        public Set<N> b(N node) {
            return W().a((Object) node);
        }
    }

    private static class d<N, E> extends k0<N, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i1<N, E> f118682a;

        d(i1<N, E> network) {
            this.f118682a = network;
        }

        @Override // com.google.common.graph.k0, com.google.common.graph.t, com.google.common.graph.i1
        public Set<E> G(h0<N> endpoints) {
            return a0().G(q0.s(endpoints));
        }

        @Override // com.google.common.graph.k0, com.google.common.graph.t, com.google.common.graph.i1
        @fj.a
        public E H(N nodeU, N nodeV) {
            return a0().H(nodeV, nodeU);
        }

        @Override // com.google.common.graph.k0, com.google.common.graph.i1
        public h0<N> I(E edge) {
            h0<N> h0VarI = a0().I(edge);
            return h0.p(this.f118682a, h0VarI.m(), h0VarI.l());
        }

        @Override // com.google.common.graph.k0, com.google.common.graph.t, com.google.common.graph.i1
        @fj.a
        public E K(h0<N> endpoints) {
            return a0().K(q0.s(endpoints));
        }

        @Override // com.google.common.graph.k0
        i1<N, E> a0() {
            return this.f118682a;
        }

        @Override // com.google.common.graph.k0, com.google.common.graph.t, com.google.common.graph.i1
        public int f(N node) {
            return a0().l(node);
        }

        @Override // com.google.common.graph.k0, com.google.common.graph.t, com.google.common.graph.i1
        public boolean h(N nodeU, N nodeV) {
            return a0().h(nodeV, nodeU);
        }

        @Override // com.google.common.graph.k0, com.google.common.graph.t, com.google.common.graph.i1
        public boolean i(h0<N> endpoints) {
            return a0().i(q0.s(endpoints));
        }

        @Override // com.google.common.graph.k0, com.google.common.graph.t, com.google.common.graph.i1
        public int l(N node) {
            return a0().f(node);
        }

        @Override // com.google.common.graph.k0, com.google.common.graph.t, com.google.common.graph.i1
        public Set<E> u(N nodeU, N nodeV) {
            return a0().u(nodeV, nodeU);
        }

        @Override // com.google.common.graph.k0, com.google.common.graph.i1
        public Set<E> w(N node) {
            return a0().z(node);
        }

        @Override // com.google.common.graph.k0, com.google.common.graph.i1
        public Set<E> z(N node) {
            return a0().w(node);
        }

        @Override // com.google.common.graph.k0, com.google.common.graph.i1, com.google.common.graph.s1
        public Set<N> a(N node) {
            return a0().b((Object) node);
        }

        @Override // com.google.common.graph.k0, com.google.common.graph.i1, com.google.common.graph.m1
        public Set<N> b(N node) {
            return a0().a((Object) node);
        }
    }

    private static class e<N, V> extends l0<N, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y1<N, V> f118683a;

        e(y1<N, V> graph) {
            this.f118683a = graph;
        }

        @Override // com.google.common.graph.l0, com.google.common.graph.y1
        @fj.a
        public V C(N nodeU, N nodeV, @fj.a V defaultValue) {
            return Y().C(nodeV, nodeU, defaultValue);
        }

        @Override // com.google.common.graph.l0
        y1<N, V> Y() {
            return this.f118683a;
        }

        @Override // com.google.common.graph.l0, com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
        public int f(N node) {
            return Y().l(node);
        }

        @Override // com.google.common.graph.l0, com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
        public boolean h(N nodeU, N nodeV) {
            return Y().h(nodeV, nodeU);
        }

        @Override // com.google.common.graph.l0, com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
        public boolean i(h0<N> endpoints) {
            return Y().i(q0.s(endpoints));
        }

        @Override // com.google.common.graph.l0, com.google.common.graph.w, com.google.common.graph.e, com.google.common.graph.x
        public int l(N node) {
            return Y().f(node);
        }

        @Override // com.google.common.graph.l0, com.google.common.graph.y1
        @fj.a
        public V y(h0<N> endpoints, @fj.a V defaultValue) {
            return Y().y(q0.s(endpoints), defaultValue);
        }

        @Override // com.google.common.graph.l0, com.google.common.graph.x, com.google.common.graph.s1
        public Set<N> a(N node) {
            return Y().b((Object) node);
        }

        @Override // com.google.common.graph.l0, com.google.common.graph.x, com.google.common.graph.m1
        public Set<N> b(N node) {
            return Y().a((Object) node);
        }
    }

    private q0() {
    }

    private static boolean c(m0<?> graph, Object nextNode, @fj.a Object previousNode) {
        if (!graph.c() && com.google.common.base.d0.a(previousNode, nextNode)) {
            return false;
        }
        return true;
    }

    @z7.a
    static int d(int value) {
        com.google.common.base.j0.k(value >= 0, "Not true that %s is non-negative.", value);
        return value;
    }

    @z7.a
    static long e(long value) {
        boolean z10;
        if (value >= 0) {
            z10 = true;
            boolean z11 = true | true;
        } else {
            z10 = false;
        }
        com.google.common.base.j0.p(z10, "Not true that %s is non-negative.", value);
        return value;
    }

    @z7.a
    static int f(int value) {
        com.google.common.base.j0.k(value > 0, "Not true that %s is positive.", value);
        return value;
    }

    @z7.a
    static long g(long value) {
        com.google.common.base.j0.p(value > 0, "Not true that %s is positive.", value);
        return value;
    }

    public static <N> f1<N> h(m0<N> m0Var) {
        f1<N> f1Var = (f1<N>) n0.g(m0Var).f(m0Var.e().size()).b();
        Iterator<N> it = m0Var.e().iterator();
        while (it.hasNext()) {
            f1Var.p(it.next());
        }
        for (h0<N> h0Var : m0Var.g()) {
            f1Var.J(h0Var.l(), h0Var.m());
        }
        return f1Var;
    }

    public static <N, E> g1<N, E> i(i1<N, E> i1Var) {
        g1<N, E> g1Var = (g1<N, E>) j1.i(i1Var).h(i1Var.e().size()).g(i1Var.g().size()).c();
        Iterator<N> it = i1Var.e().iterator();
        while (it.hasNext()) {
            g1Var.p(it.next());
        }
        for (E e10 : i1Var.g()) {
            h0<N> h0VarI = i1Var.I(e10);
            g1Var.M(h0VarI.l(), h0VarI.m(), e10);
        }
        return g1Var;
    }

    public static <N, V> h1<N, V> j(y1<N, V> y1Var) {
        h1<N, V> h1Var = (h1<N, V>) z1.g(y1Var).f(y1Var.e().size()).b();
        Iterator<N> it = y1Var.e().iterator();
        while (it.hasNext()) {
            h1Var.p(it.next());
        }
        for (h0<N> h0Var : y1Var.g()) {
            N nL = h0Var.l();
            N nM = h0Var.m();
            V vC = y1Var.C(h0Var.l(), h0Var.m(), null);
            Objects.requireNonNull(vC);
            h1Var.x(nL, nM, vC);
        }
        return h1Var;
    }

    public static <N> boolean k(m0<N> graph) {
        int size = graph.g().size();
        if (size == 0) {
            return false;
        }
        if (!graph.c() && size >= graph.e().size()) {
            return true;
        }
        HashMap mapA0 = b8.a0(graph.e().size());
        Iterator<N> it = graph.e().iterator();
        while (it.hasNext()) {
            if (q(graph, mapA0, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(i1<?, ?> network) {
        if (network.c() || !network.B() || network.g().size() <= network.t().g().size()) {
            return k(network.t());
        }
        return true;
    }

    public static <N> f1<N> m(m0<N> m0Var, Iterable<? extends N> iterable) {
        n1 n1Var = iterable instanceof Collection ? (f1<N>) n0.g(m0Var).f(((Collection) iterable).size()).b() : (f1<N>) n0.g(m0Var).b();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            n1Var.p(it.next());
        }
        for (N n10 : n1Var.e()) {
            for (N n11 : m0Var.a((Object) n10)) {
                if (n1Var.e().contains(n11)) {
                    n1Var.J(n10, n11);
                }
            }
        }
        return n1Var;
    }

    public static <N, E> g1<N, E> n(i1<N, E> i1Var, Iterable<? extends N> iterable) {
        o1 o1Var = iterable instanceof Collection ? (g1<N, E>) j1.i(i1Var).h(((Collection) iterable).size()).c() : (g1<N, E>) j1.i(i1Var).c();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            o1Var.p(it.next());
        }
        for (E e10 : o1Var.e()) {
            for (E e11 : i1Var.z(e10)) {
                N nC = i1Var.I(e11).c(e10);
                if (o1Var.e().contains(nC)) {
                    o1Var.M(e10, nC, e11);
                }
            }
        }
        return o1Var;
    }

    public static <N, V> h1<N, V> o(y1<N, V> y1Var, Iterable<? extends N> iterable) {
        p1 p1Var = iterable instanceof Collection ? (h1<N, V>) z1.g(y1Var).f(((Collection) iterable).size()).b() : (h1<N, V>) z1.g(y1Var).b();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            p1Var.p(it.next());
        }
        for (N n10 : p1Var.e()) {
            for (N n11 : y1Var.a((Object) n10)) {
                if (p1Var.e().contains(n11)) {
                    V vC = y1Var.C(n10, n11, null);
                    Objects.requireNonNull(vC);
                    p1Var.x(n10, n11, vC);
                }
            }
        }
        return p1Var;
    }

    public static <N> z6<N> p(m0<N> graph, N node) {
        com.google.common.base.j0.u(graph.e().contains(node), "Node %s is not an element of this graph.", node);
        return z6.w(t1.g(graph).b(node));
    }

    private static <N> boolean q(m0<N> graph, Map<Object, b> visitedNodes, N startNode) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(new a(startNode));
        while (!arrayDeque.isEmpty()) {
            a aVar = (a) arrayDeque.removeLast();
            a aVar2 = (a) arrayDeque.peekLast();
            arrayDeque.addLast(aVar);
            N n10 = aVar.f118675a;
            N n11 = aVar2 == null ? null : aVar2.f118675a;
            if (aVar.f118676b == null) {
                b bVar = visitedNodes.get(n10);
                if (bVar == b.COMPLETE) {
                    arrayDeque.removeLast();
                } else {
                    b bVar2 = b.PENDING;
                    if (bVar == bVar2) {
                        return true;
                    }
                    visitedNodes.put(n10, bVar2);
                    aVar.f118676b = new ArrayDeque(graph.a((Object) n10));
                }
            }
            if (!aVar.f118676b.isEmpty()) {
                N nRemove = aVar.f118676b.remove();
                if (c(graph, nRemove, n11)) {
                    arrayDeque.addLast(new a(nRemove));
                }
            }
            arrayDeque.removeLast();
            visitedNodes.put(n10, b.COMPLETE);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N> t0<N> r(m0<N> graph) {
        t0.a<N1> aVarH = n0.g(graph).a(true).h();
        if (graph.c()) {
            for (N n10 : graph.e()) {
                nb it = p(graph, n10).iterator();
                while (it.hasNext()) {
                    aVarH.d(n10, it.next());
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            for (N n11 : graph.e()) {
                if (!hashSet.contains(n11)) {
                    z6 z6VarP = p(graph, n11);
                    hashSet.addAll(z6VarP);
                    int i10 = 1;
                    for (Object obj : z6VarP) {
                        int i11 = i10 + 1;
                        Iterator it2 = o7.D(z6VarP, i10).iterator();
                        while (it2.hasNext()) {
                            aVarH.d(obj, it2.next());
                        }
                        i10 = i11;
                    }
                }
            }
        }
        return aVarH.b();
    }

    static <N> h0<N> s(h0<N> endpoints) {
        return endpoints.i() ? h0.r(endpoints.t(), endpoints.s()) : endpoints;
    }

    public static <N> m0<N> t(m0<N> graph) {
        if (graph.c()) {
            return graph instanceof c ? ((c) graph).f118680a : new c(graph);
        }
        return graph;
    }

    public static <N, E> i1<N, E> u(i1<N, E> network) {
        if (network.c()) {
            return network instanceof d ? ((d) network).f118682a : new d(network);
        }
        return network;
    }

    public static <N, V> y1<N, V> v(y1<N, V> graph) {
        if (graph.c()) {
            return graph instanceof e ? ((e) graph).f118683a : new e(graph);
        }
        return graph;
    }
}
