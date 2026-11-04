package com.google.common.graph;

import com.google.common.collect.l6;
import com.google.common.collect.nb;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@g0
final class o1<N, E> extends q1<N, E> implements g1<N, E> {
    o1(j1<? super N, ? super E> builder) {
        super(builder);
    }

    @z7.a
    private k1<N, E> e0(N node) {
        boolean z10;
        k1<N, E> k1VarF0 = f0();
        if (this.f118689f.i(node, k1VarF0) == null) {
            z10 = true;
            int i10 = 2 << 1;
        } else {
            z10 = false;
        }
        com.google.common.base.j0.g0(z10);
        return k1VarF0;
    }

    private k1<N, E> f0() {
        if (c()) {
            return B() ? c0.p() : d0.n();
        }
        return B() ? w1.p() : x1.m();
    }

    @Override // com.google.common.graph.g1
    @z7.a
    public boolean D(h0<N> endpoints, E edge) {
        Z(endpoints);
        return M(endpoints.l(), endpoints.m(), edge);
    }

    @Override // com.google.common.graph.g1
    @z7.a
    public boolean L(E edge) {
        com.google.common.base.j0.F(edge, "edge");
        N nF = this.f118690g.f(edge);
        boolean z10 = false;
        if (nF == null) {
            return false;
        }
        k1<N, E> k1VarF = this.f118689f.f(nF);
        Objects.requireNonNull(k1VarF);
        k1<N, E> k1Var = k1VarF;
        N nD = k1Var.d(edge);
        k1<N, E> k1VarF2 = this.f118689f.f(nD);
        Objects.requireNonNull(k1VarF2);
        k1<N, E> k1Var2 = k1VarF2;
        k1Var.f(edge);
        if (m() && nF.equals(nD)) {
            z10 = true;
        }
        k1Var2.h(edge, z10);
        this.f118690g.j(edge);
        return true;
    }

    @Override // com.google.common.graph.g1
    @z7.a
    public boolean M(N nodeU, N nodeV, E edge) {
        com.google.common.base.j0.F(nodeU, "nodeU");
        com.google.common.base.j0.F(nodeV, "nodeV");
        com.google.common.base.j0.F(edge, "edge");
        if (c0(edge)) {
            h0<N> h0VarI = I(edge);
            h0 h0VarP = h0.p(this, nodeU, nodeV);
            com.google.common.base.j0.z(h0VarI.equals(h0VarP), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", edge, h0VarI, h0VarP);
            return false;
        }
        k1<N, E> k1VarF = this.f118689f.f(nodeU);
        if (!B()) {
            com.google.common.base.j0.y(k1VarF == null || !k1VarF.b().contains(nodeV), "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", nodeU, nodeV);
        }
        boolean zEquals = nodeU.equals(nodeV);
        if (!m()) {
            com.google.common.base.j0.u(!zEquals, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", nodeU);
        }
        if (k1VarF == null) {
            k1VarF = e0(nodeU);
        }
        k1VarF.i(edge, nodeV);
        k1<N, E> k1VarF2 = this.f118689f.f(nodeV);
        if (k1VarF2 == null) {
            k1VarF2 = e0(nodeV);
        }
        k1VarF2.j(edge, nodeU, zEquals);
        this.f118690g.i(edge, nodeU);
        return true;
    }

    @Override // com.google.common.graph.g1
    @z7.a
    public boolean o(N node) {
        com.google.common.base.j0.F(node, "node");
        k1<N, E> k1VarF = this.f118689f.f(node);
        if (k1VarF == null) {
            return false;
        }
        nb<E> it = l6.w(k1VarF.k()).iterator();
        while (it.hasNext()) {
            L(it.next());
        }
        this.f118689f.j(node);
        return true;
    }

    @Override // com.google.common.graph.g1
    @z7.a
    public boolean p(N node) {
        com.google.common.base.j0.F(node, "node");
        if (d0(node)) {
            return false;
        }
        e0(node);
        return true;
    }
}
