package kotlin.collections;

import java.util.Iterator;
import java.util.Map;
import qj.a;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: loaded from: classes11.dex */
public final class AbstractMap$values$1$iterator$1<V> implements Iterator<V>, a {
    final /* synthetic */ Iterator<Map.Entry<K, V>> $entryIterator;

    /* JADX WARN: Multi-variable type inference failed */
    AbstractMap$values$1$iterator$1(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.$entryIterator = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$entryIterator.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return (V) ((Map.Entry) this.$entryIterator.next()).getValue();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
