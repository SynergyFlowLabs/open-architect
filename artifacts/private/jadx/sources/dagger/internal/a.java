package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
abstract class a<K, V, V2> implements h<Map<K, V2>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<K, ij.c<V>> f269712a;

    /* JADX INFO: renamed from: dagger.internal.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1893a<K, V, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final LinkedHashMap<K, ij.c<V>> f269713a;

        AbstractC1893a(int i10) {
            this.f269713a = d.d(i10);
        }

        AbstractC1893a<K, V, V2> a(K k10, ij.c<V> cVar) {
            this.f269713a.put((K) p.c(k10, "key"), (ij.c<V>) p.c(cVar, "provider"));
            return this;
        }

        AbstractC1893a<K, V, V2> b(ij.c<Map<K, V2>> cVar) {
            if (cVar instanceof f) {
                return b(((f) cVar).a());
            }
            this.f269713a.putAll(((a) cVar).f269712a);
            return this;
        }
    }

    a(Map<K, ij.c<V>> map) {
        this.f269712a = Collections.unmodifiableMap(map);
    }

    final Map<K, ij.c<V>> b() {
        return this.f269712a;
    }
}
