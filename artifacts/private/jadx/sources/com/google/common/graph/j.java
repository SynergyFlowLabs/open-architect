package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.a
@g0
public abstract class j<N> extends e<N> implements m0<N> {
    @Override // com.google.common.graph.m0
    public final boolean equals(@fj.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return c() == m0Var.c() && e().equals(m0Var.e()) && g().equals(m0Var.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ int f(Object node) {
        return super.f(node);
    }

    @Override // com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ Set g() {
        return super.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ boolean h(Object nodeU, Object nodeV) {
        return super.h(nodeU, nodeV);
    }

    @Override // com.google.common.graph.m0
    public final int hashCode() {
        return g().hashCode();
    }

    @Override // com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ boolean i(h0 endpoints) {
        return super.i(endpoints);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ int j(Object node) {
        return super.j(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ int l(Object node) {
        return super.l(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ Set n(Object node) {
        return super.n(node);
    }

    @Override // com.google.common.graph.e, com.google.common.graph.x
    public /* bridge */ /* synthetic */ f0 q() {
        return super.q();
    }

    public String toString() {
        return "isDirected: " + c() + ", allowsSelfLoops: " + m() + ", nodes: " + e() + ", edges: " + g();
    }
}
