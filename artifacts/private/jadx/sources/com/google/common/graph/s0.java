package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.a
@g0
abstract class s0 {
    s0() {
    }

    public static <N> Set<N> a(m0<N> graph, N node) {
        return q0.p(graph, node);
    }

    public static <N> m0<N> b(m0<N> graph) {
        return q0.r(graph);
    }
}
