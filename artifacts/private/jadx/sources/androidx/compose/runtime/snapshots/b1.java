package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class b1<K, V> extends z0<K, V> implements Iterator<V>, qj.d {
    public b1(@NotNull l0<K, V> l0Var, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(l0Var, it);
    }

    @Override // java.util.Iterator
    public V next() {
        Map.Entry<K, V> entryI = i();
        if (entryI == null) {
            throw new IllegalStateException();
        }
        d();
        return entryI.getValue();
    }
}
