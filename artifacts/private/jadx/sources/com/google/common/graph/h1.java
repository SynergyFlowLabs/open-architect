package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.a
@g0
public interface h1<N, V> extends y1<N, V> {
    @z7.a
    @fj.a
    V F(h0<N> endpoints, V value);

    @z7.a
    boolean o(N node);

    @z7.a
    boolean p(N node);

    @z7.a
    @fj.a
    V r(N nodeU, N nodeV);

    @z7.a
    @fj.a
    V s(h0<N> endpoints);

    @z7.a
    @fj.a
    V x(N nodeU, N nodeV, V value);
}
