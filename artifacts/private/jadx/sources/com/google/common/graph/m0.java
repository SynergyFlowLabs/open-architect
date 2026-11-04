package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.a
@z7.f("Use GraphBuilder to create a real instance")
@g0
public interface m0<N> extends x<N> {
    @Override // com.google.common.graph.x, com.google.common.graph.s1
    Set<N> a(N node);

    @Override // com.google.common.graph.x, com.google.common.graph.m1
    Set<N> b(N node);

    boolean c();

    Set<N> d(N node);

    Set<N> e();

    boolean equals(@fj.a Object object);

    @Override // com.google.common.graph.x
    int f(N node);

    @Override // com.google.common.graph.x
    Set<h0<N>> g();

    @Override // com.google.common.graph.x
    boolean h(N nodeU, N nodeV);

    int hashCode();

    @Override // com.google.common.graph.x
    boolean i(h0<N> endpoints);

    @Override // com.google.common.graph.x
    int j(N node);

    f0<N> k();

    @Override // com.google.common.graph.x
    int l(N node);

    boolean m();

    @Override // com.google.common.graph.x
    Set<h0<N>> n(N node);

    @Override // com.google.common.graph.x
    f0<N> q();
}
