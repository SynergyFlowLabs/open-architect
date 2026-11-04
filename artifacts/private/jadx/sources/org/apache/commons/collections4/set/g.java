package org.apache.commons.collections4.set;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class g<E, V> implements Set<E>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336294c = 6723912213766056587L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<E, ? super V> f336295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V f336296b;

    private g(Map<E, ? super V> map, V v10) {
        if (map == null) {
            throw new NullPointerException("The map must not be null");
        }
        this.f336295a = map;
        this.f336296b = v10;
    }

    public static <E, V> g<E, V> c(Map<E, ? super V> map) {
        return d(map, null);
    }

    public static <E, V> g<E, V> d(Map<E, ? super V> map, V v10) {
        return new g<>(map, v10);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e10) {
        int size = this.f336295a.size();
        this.f336295a.put(e10, this.f336296b);
        return this.f336295a.size() != size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        int size = this.f336295a.size();
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            this.f336295a.put(it.next(), this.f336296b);
        }
        return this.f336295a.size() != size;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f336295a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f336295a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f336295a.keySet().containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        return this.f336295a.keySet().equals(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f336295a.keySet().hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f336295a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f336295a.keySet().iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int size = this.f336295a.size();
        this.f336295a.remove(obj);
        return this.f336295a.size() != size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f336295a.keySet().removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f336295a.keySet().retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f336295a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f336295a.keySet().toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f336295a.keySet().toArray(tArr);
    }
}
