package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class b<K, V> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b<K, V> implements Map.Entry<K, V>, qj.g.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<K, a<V>> f35720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private a<V> f35721e;

    public b(@NotNull Map<K, a<V>> map, K k10, @NotNull a<V> aVar) {
        super(k10, aVar.e());
        this.f35720d = map;
        this.f35721e = aVar;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public V getValue() {
        return this.f35721e.e();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public V setValue(V v10) {
        V vE = this.f35721e.e();
        this.f35721e = this.f35721e.h(v10);
        this.f35720d.put(getKey(), this.f35721e);
        return vE;
    }
}
