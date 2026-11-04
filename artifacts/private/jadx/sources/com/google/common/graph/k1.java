package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
interface k1<N, E> {
    Set<N> a();

    Set<N> b();

    Set<N> c();

    N d(E edge);

    Set<E> e();

    @z7.a
    N f(E edge);

    Set<E> g();

    @z7.a
    @fj.a
    N h(E edge, boolean isSelfLoop);

    void i(E edge, N node);

    void j(E edge, N node, boolean isSelfLoop);

    Set<E> k();

    Set<E> l(N node);
}
