package io.ably.lib.types;

import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public interface i0<K, V> {
    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Iterable<Map.Entry<K, V>> entrySet();

    V get(Object obj);

    boolean isEmpty();

    Iterable<K> keySet();

    int size();

    Iterable<V> values();
}
