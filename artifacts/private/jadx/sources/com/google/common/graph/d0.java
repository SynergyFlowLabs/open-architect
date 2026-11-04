package com.google.common.graph;

import com.google.common.collect.f6;
import com.google.common.collect.y5;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
final class d0<N, E> extends i<N, E> {
    d0(Map<E, N> inEdgeMap, Map<E, N> outEdgeMap, int selfLoopCount) {
        super(inEdgeMap, outEdgeMap, selfLoopCount);
    }

    static <N, E> d0<N, E> n() {
        return new d0<>(y5.h(2), y5.h(2), 0);
    }

    static <N, E> d0<N, E> o(Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
        return new d0<>(f6.J(inEdges), f6.J(outEdges), selfLoopCount);
    }

    @Override // com.google.common.graph.k1
    public Set<N> b() {
        return Collections.unmodifiableSet(((com.google.common.collect.w) this.f118627b).values());
    }

    @Override // com.google.common.graph.k1
    public Set<N> c() {
        return Collections.unmodifiableSet(((com.google.common.collect.w) this.f118626a).values());
    }

    @Override // com.google.common.graph.k1
    public Set<E> l(N node) {
        return new e0(((com.google.common.collect.w) this.f118627b).Y2(), node);
    }
}
