package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class m<K, V> extends dagger.internal.a<K, V, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ij.c<Map<Object, Object>> f269723b = k.a(Collections.EMPTY_MAP);

    public static final class b<K, V> extends dagger.internal.a.AbstractC1893a<K, V, V> {
        public m<K, V> c() {
            return new m<>(this.f269713a);
        }

        @Override // dagger.internal.a.AbstractC1893a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b<K, V> a(K k10, ij.c<V> cVar) {
            super.a(k10, cVar);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.internal.a.AbstractC1893a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b<K, V> b(ij.c<Map<K, V>> cVar) {
            super.b(cVar);
            return this;
        }

        private b(int i10) {
            super(i10);
        }
    }

    public static <K, V> b<K, V> c(int i10) {
        return new b<>(i10);
    }

    public static <K, V> ij.c<Map<K, V>> d() {
        return (ij.c<Map<K, V>>) f269723b;
    }

    @Override // ij.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Map<K, V> get() {
        LinkedHashMap linkedHashMapD = d.d(b().size());
        for (Map.Entry<K, ij.c<V>> entry : b().entrySet()) {
            linkedHashMapD.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMapD);
    }

    private m(Map<K, ij.c<V>> map) {
        super(map);
    }
}
