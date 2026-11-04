package com.google.common.graph;

import com.google.common.collect.b8;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.a
@g0
public abstract class w<N, V> extends e<N> implements y1<N, V> {

    class a extends j<N> {
        a() {
        }

        @Override // com.google.common.graph.x, com.google.common.graph.m0
        public boolean c() {
            return w.this.c();
        }

        @Override // com.google.common.graph.x, com.google.common.graph.m0
        public Set<N> d(N node) {
            return w.this.d(node);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.m0
        public Set<N> e() {
            return w.this.e();
        }

        @Override // com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
        public int f(N node) {
            return w.this.f(node);
        }

        @Override // com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
        public Set<h0<N>> g() {
            return w.this.g();
        }

        @Override // com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
        public int j(N node) {
            return w.this.j(node);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.m0
        public f0<N> k() {
            return w.this.k();
        }

        @Override // com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
        public int l(N node) {
            return w.this.l(node);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.m0
        public boolean m() {
            return w.this.m();
        }

        @Override // com.google.common.graph.j, com.google.common.graph.e, com.google.common.graph.x
        public f0<N> q() {
            return w.this.q();
        }

        @Override // com.google.common.graph.x, com.google.common.graph.s1
        public Set<N> a(N node) {
            return w.this.a((Object) node);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.m1
        public Set<N> b(N node) {
            return w.this.b((Object) node);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object W(y1 y1Var, h0 h0Var) {
        Object objC = y1Var.C(h0Var.l(), h0Var.m(), null);
        Objects.requireNonNull(objC);
        return objC;
    }

    private static <N, V> Map<h0<N>, V> X(final y1<N, V> graph) {
        return b8.j(graph.g(), new com.google.common.base.t() { // from class: com.google.common.graph.v
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return w.W(graph, (h0) obj);
            }
        });
    }

    @Override // com.google.common.graph.y1
    public final boolean equals(@fj.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return c() == y1Var.c() && e().equals(y1Var.e()) && X(this).equals(X(y1Var));
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

    @Override // com.google.common.graph.y1
    public final int hashCode() {
        return X(this).hashCode();
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

    @Override // com.google.common.graph.y1
    public m0<N> t() {
        return new a();
    }

    public String toString() {
        return "isDirected: " + c() + ", allowsSelfLoops: " + m() + ", nodes: " + e() + ", edges: " + X(this);
    }
}
