package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.a
@g0
public interface y1<N, V> extends x<N> {
    @fj.a
    V C(N nodeU, N nodeV, @fj.a V defaultValue);

    @Override // com.google.common.graph.x, com.google.common.graph.s1
    Set<N> a(N node);

    @Override // com.google.common.graph.x, com.google.common.graph.m1
    Set<N> b(N node);

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    boolean c();

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    Set<N> d(N node);

    @Override // com.google.common.graph.x, com.google.common.graph.m0
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

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    f0<N> k();

    @Override // com.google.common.graph.x
    int l(N node);

    @Override // com.google.common.graph.x, com.google.common.graph.m0
    boolean m();

    @Override // com.google.common.graph.x
    Set<h0<N>> n(N node);

    @Override // com.google.common.graph.x
    f0<N> q();

    m0<N> t();

    @fj.a
    V y(h0<N> endpoints, @fj.a V defaultValue);
}
