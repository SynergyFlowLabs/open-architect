package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class c<K, V> extends b<K, V> implements Map.Entry<K, V>, qj.g.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final i<K, V> f35616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private V f35617e;

    public c(@NotNull i<K, V> iVar, K k10, V v10) {
        super(k10, v10);
        this.f35616d = iVar;
        this.f35617e = v10;
    }

    public void a(V v10) {
        this.f35617e = v10;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public V getValue() {
        return this.f35617e;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public V setValue(V v10) {
        V value = getValue();
        a(v10);
        this.f35616d.c(getKey(), v10);
        return value;
    }
}
