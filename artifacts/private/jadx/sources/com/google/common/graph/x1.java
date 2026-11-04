package com.google.common.graph;

import com.google.common.collect.f6;
import com.google.common.collect.y5;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
final class x1<N, E> extends u<N, E> {
    x1(Map<E, N> incidentEdgeMap) {
        super(incidentEdgeMap);
    }

    static <N, E> x1<N, E> m() {
        return new x1<>(y5.h(2));
    }

    static <N, E> x1<N, E> n(Map<E, N> incidentEdges) {
        return new x1<>(f6.J(incidentEdges));
    }

    @Override // com.google.common.graph.k1
    public Set<N> a() {
        return Collections.unmodifiableSet(((com.google.common.collect.w) this.f118728a).values());
    }

    @Override // com.google.common.graph.k1
    public Set<E> l(N node) {
        return new e0(((com.google.common.collect.w) this.f118728a).Y2(), node);
    }
}
