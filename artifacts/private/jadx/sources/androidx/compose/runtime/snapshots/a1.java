package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class a1<K, V> extends z0<K, V> implements Iterator<K>, qj.d {
    public a1(@NotNull l0<K, V> l0Var, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(l0Var, it);
    }

    @Override // java.util.Iterator
    public K next() {
        Map.Entry<K, V> entryI = i();
        if (entryI == null) {
            throw new IllegalStateException();
        }
        d();
        return entryI.getKey();
    }
}
