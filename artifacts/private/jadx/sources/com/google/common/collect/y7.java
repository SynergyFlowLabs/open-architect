package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@z7.f("Use Maps.difference")
@a4
@com.google.common.annotations.b
public interface y7<K, V> {

    @z7.f("Use Maps.difference")
    public interface a<V> {
        @b9
        V a();

        @b9
        V b();

        boolean equals(@fj.a Object other);

        int hashCode();
    }

    Map<K, a<V>> a();

    Map<K, V> b();

    Map<K, V> c();

    Map<K, V> d();

    boolean e();

    boolean equals(@fj.a Object object);

    int hashCode();
}
