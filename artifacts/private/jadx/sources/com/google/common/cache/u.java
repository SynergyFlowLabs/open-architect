package com.google.common.cache;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@i
interface u<K, V> {
    void D(u<K, V> next);

    void E(u<K, V> next);

    void H(u<K, V> previous);

    @fj.a
    K getKey();

    @fj.a
    n.a0<K, V> k();

    int l();

    void n(u<K, V> previous);

    u<K, V> o();

    void p(n.a0<K, V> valueReference);

    long q();

    void r(long time);

    void s(long time);

    u<K, V> t();

    u<K, V> v();

    @fj.a
    u<K, V> w();

    u<K, V> x();

    long z();
}
