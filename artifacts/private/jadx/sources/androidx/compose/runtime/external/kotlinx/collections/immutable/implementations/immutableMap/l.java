package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractMutableCollection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class l<K, V> extends AbstractMutableCollection<V> implements Collection<V>, qj.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35646b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f<K, V> f35647a;

    public l(@NotNull f<K, V> fVar) {
        this.f35647a = fVar;
    }

    @Override // kotlin.collections.AbstractMutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f35647a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f35647a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractMutableCollection
    public int getSize() {
        return this.f35647a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        return new m(this.f35647a);
    }
}
