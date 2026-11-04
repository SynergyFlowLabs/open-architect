package androidx.collection;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class f1<K, V> implements Map.Entry<K, V>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f12217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V f12218b;

    public f1(K k10, V v10) {
        this.f12217a = k10;
        this.f12218b = v10;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f12217a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f12218b;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
