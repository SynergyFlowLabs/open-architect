package com.google.common.graph;

import com.google.common.collect.nb;
import com.google.common.collect.o7;
import com.google.common.collect.p7;
import com.google.common.collect.z9;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
abstract class i<N, E> implements k1<N, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<E, N> f118626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map<E, N> f118627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f118628c;

    class a extends AbstractSet<E> {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public nb<E> iterator() {
            return p7.e0((i.this.f118628c == 0 ? o7.f(i.this.f118626a.keySet(), i.this.f118627b.keySet()) : z9.O(i.this.f118626a.keySet(), i.this.f118627b.keySet())).iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object obj) {
            if (!i.this.f118626a.containsKey(obj) && !i.this.f118627b.containsKey(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.math.f.t(i.this.f118626a.size(), i.this.f118627b.size() - i.this.f118628c);
        }
    }

    i(Map<E, N> inEdgeMap, Map<E, N> outEdgeMap, int selfLoopCount) {
        this.f118626a = (Map) com.google.common.base.j0.E(inEdgeMap);
        this.f118627b = (Map) com.google.common.base.j0.E(outEdgeMap);
        this.f118628c = q0.d(selfLoopCount);
        com.google.common.base.j0.g0(selfLoopCount <= inEdgeMap.size() && selfLoopCount <= outEdgeMap.size());
    }

    @Override // com.google.common.graph.k1
    public Set<N> a() {
        return z9.O(c(), b());
    }

    @Override // com.google.common.graph.k1
    public N d(E edge) {
        N n10 = this.f118627b.get(edge);
        Objects.requireNonNull(n10);
        return n10;
    }

    @Override // com.google.common.graph.k1
    public Set<E> e() {
        return Collections.unmodifiableSet(this.f118626a.keySet());
    }

    @Override // com.google.common.graph.k1
    public N f(E edge) {
        N nRemove = this.f118627b.remove(edge);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    @Override // com.google.common.graph.k1
    public Set<E> g() {
        return Collections.unmodifiableSet(this.f118627b.keySet());
    }

    @Override // com.google.common.graph.k1
    public N h(E edge, boolean isSelfLoop) {
        if (isSelfLoop) {
            int i10 = this.f118628c - 1;
            this.f118628c = i10;
            q0.d(i10);
        }
        N nRemove = this.f118626a.remove(edge);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    @Override // com.google.common.graph.k1
    public void i(E edge, N node) {
        com.google.common.base.j0.E(edge);
        com.google.common.base.j0.E(node);
        com.google.common.base.j0.g0(this.f118627b.put(edge, node) == null);
    }

    @Override // com.google.common.graph.k1
    public void j(E edge, N node, boolean isSelfLoop) {
        com.google.common.base.j0.E(edge);
        com.google.common.base.j0.E(node);
        if (isSelfLoop) {
            int i10 = this.f118628c + 1;
            this.f118628c = i10;
            q0.f(i10);
        }
        com.google.common.base.j0.g0(this.f118626a.put(edge, node) == null);
    }

    @Override // com.google.common.graph.k1
    public Set<E> k() {
        return new a();
    }
}
