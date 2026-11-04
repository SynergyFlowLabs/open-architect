package com.google.common.graph;

import com.google.common.collect.b6;
import com.google.common.collect.n6;
import com.google.common.collect.q8;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
final class c0<N, E> extends i<N, E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Reference<q8<N>> f118592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Reference<q8<N>> f118593e;

    class a extends e1<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f118594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0 f118595d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(final c0 this$0, Map outEdgeToNode, Object targetNode, final Object val$node) {
            super(outEdgeToNode, targetNode);
            this.f118594c = val$node;
            this.f118595d = this$0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f118595d.s().P3(this.f118594c);
        }
    }

    private c0(Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
        super(inEdges, outEdges, selfLoopCount);
    }

    @fj.a
    private static <T> T o(@fj.a Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    static <N, E> c0<N, E> p() {
        return new c0<>(new HashMap(2, 1.0f), new HashMap(2, 1.0f), 0);
    }

    static <N, E> c0<N, E> q(Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
        return new c0<>(n6.g(inEdges), n6.g(outEdges), selfLoopCount);
    }

    private q8<N> r() {
        q8<N> q8VarT = (q8) o(this.f118592d);
        if (q8VarT == null) {
            q8VarT = b6.t(this.f118626a.values());
            this.f118592d = new SoftReference(q8VarT);
        }
        return q8VarT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q8<N> s() {
        q8<N> q8Var = (q8) o(this.f118593e);
        if (q8Var != null) {
            return q8Var;
        }
        b6 b6VarT = b6.t(this.f118627b.values());
        this.f118593e = new SoftReference(b6VarT);
        return b6VarT;
    }

    @Override // com.google.common.graph.k1
    public Set<N> b() {
        return Collections.unmodifiableSet(s().o());
    }

    @Override // com.google.common.graph.k1
    public Set<N> c() {
        return Collections.unmodifiableSet(r().o());
    }

    @Override // com.google.common.graph.i, com.google.common.graph.k1
    public N f(E e10) {
        N n10 = (N) super.f(e10);
        q8 q8Var = (q8) o(this.f118593e);
        if (q8Var != null) {
            com.google.common.base.j0.g0(q8Var.remove(n10));
        }
        return n10;
    }

    @Override // com.google.common.graph.i, com.google.common.graph.k1
    public N h(E e10, boolean z10) {
        N n10 = (N) super.h(e10, z10);
        q8 q8Var = (q8) o(this.f118592d);
        if (q8Var != null) {
            com.google.common.base.j0.g0(q8Var.remove(n10));
        }
        return n10;
    }

    @Override // com.google.common.graph.i, com.google.common.graph.k1
    public void i(E edge, N node) {
        super.i(edge, node);
        q8 q8Var = (q8) o(this.f118593e);
        if (q8Var != null) {
            com.google.common.base.j0.g0(q8Var.add(node));
        }
    }

    @Override // com.google.common.graph.i, com.google.common.graph.k1
    public void j(E edge, N node, boolean isSelfLoop) {
        super.j(edge, node, isSelfLoop);
        q8 q8Var = (q8) o(this.f118592d);
        if (q8Var != null) {
            com.google.common.base.j0.g0(q8Var.add(node));
        }
    }

    @Override // com.google.common.graph.k1
    public Set<E> l(N node) {
        return new a(this, this.f118627b, node, node);
    }
}
