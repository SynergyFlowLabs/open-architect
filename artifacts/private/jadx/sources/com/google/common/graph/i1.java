package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.a
@z7.f("Use NetworkBuilder to create a real instance")
@g0
public interface i1<N, E> extends s1<N>, m1<N> {
    Set<E> A(E edge);

    boolean B();

    Set<E> G(h0<N> endpoints);

    @fj.a
    E H(N nodeU, N nodeV);

    h0<N> I(E edge);

    @fj.a
    E K(h0<N> endpoints);

    @Override // com.google.common.graph.s1
    Set<N> a(N node);

    @Override // com.google.common.graph.m1
    Set<N> b(N node);

    boolean c();

    Set<N> d(N node);

    Set<N> e();

    boolean equals(@fj.a Object object);

    int f(N node);

    Set<E> g();

    boolean h(N nodeU, N nodeV);

    int hashCode();

    boolean i(h0<N> endpoints);

    int j(N node);

    f0<N> k();

    int l(N node);

    boolean m();

    Set<E> n(N node);

    m0<N> t();

    Set<E> u(N nodeU, N nodeV);

    f0<E> v();

    Set<E> w(N node);

    Set<E> z(N node);
}
