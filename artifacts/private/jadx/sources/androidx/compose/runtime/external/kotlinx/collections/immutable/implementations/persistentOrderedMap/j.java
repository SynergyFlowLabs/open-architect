package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractMutableCollection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class j<K, V> extends AbstractMutableCollection<V> implements Collection<V>, qj.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35748b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d<K, V> f35749a;

    public j(@NotNull d<K, V> dVar) {
        this.f35749a = dVar;
    }

    @Override // kotlin.collections.AbstractMutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f35749a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f35749a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractMutableCollection
    public int getSize() {
        return this.f35749a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        return new k(this.f35749a);
    }
}
