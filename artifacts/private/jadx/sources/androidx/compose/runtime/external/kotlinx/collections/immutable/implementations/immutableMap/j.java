package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractMutableSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class j<K, V> extends AbstractMutableSet<K> implements Set<K>, qj.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35643b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f<K, V> f35644a;

    public j(@NotNull f<K, V> fVar) {
        this.f35644a = fVar;
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f35644a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f35644a.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.f35644a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<K> iterator() {
        return new k(this.f35644a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f35644a.containsKey(obj)) {
            return false;
        }
        this.f35644a.remove(obj);
        return true;
    }
}
