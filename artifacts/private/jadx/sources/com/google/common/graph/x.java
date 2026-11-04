package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
interface x<N> extends s1<N>, m1<N> {
    @Override // com.google.common.graph.s1
    Set<N> a(N node);

    @Override // com.google.common.graph.m1
    Set<N> b(N node);

    boolean c();

    Set<N> d(N node);

    Set<N> e();

    int f(N node);

    Set<h0<N>> g();

    boolean h(N nodeU, N nodeV);

    boolean i(h0<N> endpoints);

    int j(N node);

    f0<N> k();

    int l(N node);

    boolean m();

    Set<h0<N>> n(N node);

    f0<N> q();
}
