package io.ably.lib.util;

import io.ably.lib.types.i0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h<K, V> implements i0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ConcurrentMap<K, V> f288234a = new ConcurrentHashMap();

    @Override // io.ably.lib.types.i0
    public final boolean containsKey(Object obj) {
        return this.f288234a.containsKey(obj);
    }

    @Override // io.ably.lib.types.i0
    public final boolean containsValue(Object obj) {
        return this.f288234a.containsValue(obj);
    }

    @Override // io.ably.lib.types.i0
    public final Iterable<Map.Entry<K, V>> entrySet() {
        return this.f288234a.entrySet();
    }

    @Override // io.ably.lib.types.i0
    public final V get(Object obj) {
        return this.f288234a.get(obj);
    }

    @Override // io.ably.lib.types.i0
    public final boolean isEmpty() {
        return this.f288234a.isEmpty();
    }

    @Override // io.ably.lib.types.i0
    public final Iterable<K> keySet() {
        return this.f288234a.keySet();
    }

    @Override // io.ably.lib.types.i0
    public final int size() {
        return this.f288234a.size();
    }

    @Override // io.ably.lib.types.i0
    public final Iterable<V> values() {
        return this.f288234a.values();
    }
}
