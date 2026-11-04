package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@z7.f("Use ImmutableTable, HashBasedTable, or another implementation")
@a4
@com.google.common.annotations.b
public interface oa<R, C, V> {

    public interface a<R, C, V> {
        @b9
        C a();

        @b9
        R b();

        boolean equals(@fj.a Object obj);

        @b9
        V getValue();

        int hashCode();
    }

    void A0(oa<? extends R, ? extends C, ? extends V> table);

    Set<a<R, C, V>> D0();

    Set<C> E0();

    boolean F0(@fj.a @z7.c("R") Object rowKey);

    Map<C, V> J0(@b9 R rowKey);

    boolean M(@fj.a @z7.c("C") Object columnKey);

    Map<C, Map<R, V>> a0();

    Map<R, V> c0(@b9 C columnKey);

    void clear();

    boolean containsValue(@fj.a @z7.c(androidx.exifinterface.media.a.Y4) Object value);

    @z7.a
    @fj.a
    V e0(@b9 R rowKey, @b9 C columnKey, @b9 V value);

    boolean equals(@fj.a Object obj);

    int hashCode();

    boolean isEmpty();

    boolean n0(@fj.a @z7.c("R") Object rowKey, @fj.a @z7.c("C") Object columnKey);

    @z7.a
    @fj.a
    V remove(@fj.a @z7.c("R") Object rowKey, @fj.a @z7.c("C") Object columnKey);

    Map<R, Map<C, V>> s();

    int size();

    Set<R> t();

    Collection<V> values();

    @fj.a
    V w(@fj.a @z7.c("R") Object rowKey, @fj.a @z7.c("C") Object columnKey);
}
