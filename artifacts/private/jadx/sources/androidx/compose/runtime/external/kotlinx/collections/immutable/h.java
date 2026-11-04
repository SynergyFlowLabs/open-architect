package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface h<K, V> extends d<K, V> {

    public interface a<K, V> extends Map<K, V>, qj.g {
        @NotNull
        h<K, V> build();
    }

    @NotNull
    a<K, V> builder();

    @Override // java.util.Map
    @NotNull
    h<K, V> clear();

    @Override // java.util.Map
    @NotNull
    h<K, V> put(K k10, V v10);

    @Override // java.util.Map
    @NotNull
    h<K, V> putAll(@NotNull Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    @NotNull
    h<K, V> remove(K k10);

    @Override // java.util.Map
    @NotNull
    h<K, V> remove(K k10, V v10);
}
