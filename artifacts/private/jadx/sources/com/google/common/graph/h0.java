package com.google.common.graph;

import com.google.common.collect.nb;
import com.google.common.collect.p7;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@g0
@com.google.common.annotations.a
@z7.j(containerOf = {"N"})
public abstract class h0<N> implements Iterable<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N f118624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N f118625b;

    private static final class b<N> extends h0<N> {
        @Override // com.google.common.graph.h0
        public boolean equals(@fj.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h0)) {
                return false;
            }
            h0 h0Var = (h0) obj;
            return i() == h0Var.i() && s().equals(h0Var.s()) && t().equals(h0Var.t());
        }

        @Override // com.google.common.graph.h0
        public int hashCode() {
            return com.google.common.base.d0.b(s(), t());
        }

        @Override // com.google.common.graph.h0
        public boolean i() {
            return true;
        }

        @Override // com.google.common.graph.h0, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.graph.h0
        public N s() {
            return l();
        }

        @Override // com.google.common.graph.h0
        public N t() {
            return m();
        }

        public String toString() {
            return "<" + s() + " -> " + t() + ">";
        }

        private b(N source, N target) {
            super(source, target);
        }
    }

    private static final class c<N> extends h0<N> {
        @Override // com.google.common.graph.h0
        public boolean equals(@fj.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h0)) {
                return false;
            }
            h0 h0Var = (h0) obj;
            if (i() != h0Var.i()) {
                return false;
            }
            if (l().equals(h0Var.l())) {
                return m().equals(h0Var.m());
            }
            return l().equals(h0Var.m()) && m().equals(h0Var.l());
        }

        @Override // com.google.common.graph.h0
        public int hashCode() {
            return l().hashCode() + m().hashCode();
        }

        @Override // com.google.common.graph.h0
        public boolean i() {
            return false;
        }

        @Override // com.google.common.graph.h0, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.graph.h0
        public N s() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.h0
        public N t() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public String toString() {
            return "[" + l() + ", " + m() + "]";
        }

        private c(N nodeU, N nodeV) {
            super(nodeU, nodeV);
        }
    }

    static <N> h0<N> n(m0<?> graph, N nodeU, N nodeV) {
        return graph.c() ? r(nodeU, nodeV) : u(nodeU, nodeV);
    }

    static <N> h0<N> p(i1<?, ?> network, N nodeU, N nodeV) {
        return network.c() ? r(nodeU, nodeV) : u(nodeU, nodeV);
    }

    public static <N> h0<N> r(N source, N target) {
        return new b(source, target);
    }

    public static <N> h0<N> u(N nodeU, N nodeV) {
        return new c(nodeV, nodeU);
    }

    public final N c(N node) {
        if (node.equals(this.f118624a)) {
            return this.f118625b;
        }
        if (node.equals(this.f118625b)) {
            return this.f118624a;
        }
        throw new IllegalArgumentException("EndpointPair " + this + " does not contain node " + node);
    }

    public abstract boolean equals(@fj.a Object obj);

    public abstract int hashCode();

    public abstract boolean i();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final nb<N> iterator() {
        return p7.A(this.f118624a, this.f118625b);
    }

    public final N l() {
        return this.f118624a;
    }

    public final N m() {
        return this.f118625b;
    }

    public abstract N s();

    public abstract N t();

    private h0(N n10, N n11) {
        this.f118624a = (N) com.google.common.base.j0.E(n10);
        this.f118625b = (N) com.google.common.base.j0.E(n11);
    }
}
