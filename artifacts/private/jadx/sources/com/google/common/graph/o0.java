package com.google.common.graph;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
interface o0<N, V> {
    Set<N> a();

    Set<N> b();

    Set<N> c();

    void d(N node, V value);

    @fj.a
    V e(N node);

    @z7.a
    @fj.a
    V f(N node);

    void g(N node);

    Iterator<h0<N>> h(N thisNode);

    @z7.a
    @fj.a
    V i(N node, V value);
}
