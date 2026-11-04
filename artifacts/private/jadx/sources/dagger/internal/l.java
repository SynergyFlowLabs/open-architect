package dagger.internal;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class l<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<K, V> f269722a;

    private l(int i10) {
        this.f269722a = d.d(i10);
    }

    public static <K, V> l<K, V> b(int i10) {
        return new l<>(i10);
    }

    public Map<K, V> a() {
        return this.f269722a.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f269722a);
    }

    public l<K, V> c(K k10, V v10) {
        this.f269722a.put(k10, v10);
        return this;
    }

    public l<K, V> d(Map<K, V> map) {
        this.f269722a.putAll(map);
        return this;
    }
}
