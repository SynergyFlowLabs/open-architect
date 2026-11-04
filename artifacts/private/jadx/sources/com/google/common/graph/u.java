package com.google.common.graph;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
abstract class u<N, E> implements k1<N, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<E, N> f118728a;

    u(Map<E, N> incidentEdgeMap) {
        this.f118728a = (Map) com.google.common.base.j0.E(incidentEdgeMap);
    }

    @Override // com.google.common.graph.k1
    public Set<N> b() {
        return a();
    }

    @Override // com.google.common.graph.k1
    public Set<N> c() {
        return a();
    }

    @Override // com.google.common.graph.k1
    public N d(E edge) {
        N n10 = this.f118728a.get(edge);
        Objects.requireNonNull(n10);
        return n10;
    }

    @Override // com.google.common.graph.k1
    public Set<E> e() {
        return k();
    }

    @Override // com.google.common.graph.k1
    public N f(E edge) {
        N nRemove = this.f118728a.remove(edge);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    @Override // com.google.common.graph.k1
    public Set<E> g() {
        return k();
    }

    @Override // com.google.common.graph.k1
    @fj.a
    public N h(E edge, boolean isSelfLoop) {
        if (isSelfLoop) {
            return null;
        }
        return f(edge);
    }

    @Override // com.google.common.graph.k1
    public void i(E edge, N node) {
        com.google.common.base.j0.g0(this.f118728a.put(edge, node) == null);
    }

    @Override // com.google.common.graph.k1
    public void j(E edge, N node, boolean isSelfLoop) {
        if (isSelfLoop) {
            return;
        }
        i(edge, node);
    }

    @Override // com.google.common.graph.k1
    public Set<E> k() {
        return Collections.unmodifiableSet(this.f118728a.keySet());
    }
}
