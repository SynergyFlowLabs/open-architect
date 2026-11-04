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
final class w1<N, E> extends u<N, E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Reference<q8<N>> f118738b;

    class a extends e1<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f118739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w1 f118740d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(final w1 this$0, Map outEdgeToNode, Object targetNode, final Object val$node) {
            super(outEdgeToNode, targetNode);
            this.f118739c = val$node;
            this.f118740d = this$0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f118740d.n().P3(this.f118739c);
        }
    }

    private w1(Map<E, N> incidentEdges) {
        super(incidentEdges);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q8<N> n() {
        q8<N> q8Var = (q8) o(this.f118738b);
        if (q8Var != null) {
            return q8Var;
        }
        b6 b6VarT = b6.t(this.f118728a.values());
        this.f118738b = new SoftReference(b6VarT);
        return b6VarT;
    }

    @fj.a
    private static <T> T o(@fj.a Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    static <N, E> w1<N, E> p() {
        return new w1<>(new HashMap(2, 1.0f));
    }

    static <N, E> w1<N, E> q(Map<E, N> incidentEdges) {
        return new w1<>(n6.g(incidentEdges));
    }

    @Override // com.google.common.graph.k1
    public Set<N> a() {
        return Collections.unmodifiableSet(n().o());
    }

    @Override // com.google.common.graph.u, com.google.common.graph.k1
    public N f(E e10) {
        N n10 = (N) super.f(e10);
        q8 q8Var = (q8) o(this.f118738b);
        if (q8Var != null) {
            com.google.common.base.j0.g0(q8Var.remove(n10));
        }
        return n10;
    }

    @Override // com.google.common.graph.u, com.google.common.graph.k1
    @fj.a
    public N h(E edge, boolean isSelfLoop) {
        if (isSelfLoop) {
            return null;
        }
        return f(edge);
    }

    @Override // com.google.common.graph.u, com.google.common.graph.k1
    public void i(E edge, N node) {
        super.i(edge, node);
        q8 q8Var = (q8) o(this.f118738b);
        if (q8Var != null) {
            com.google.common.base.j0.g0(q8Var.add(node));
        }
    }

    @Override // com.google.common.graph.u, com.google.common.graph.k1
    public void j(E edge, N node, boolean isSelfLoop) {
        if (isSelfLoop) {
            return;
        }
        i(edge, node);
    }

    @Override // com.google.common.graph.k1
    public Set<E> l(N node) {
        return new a(this, this.f118728a, node, node);
    }
}
