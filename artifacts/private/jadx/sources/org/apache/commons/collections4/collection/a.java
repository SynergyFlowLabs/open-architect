package org.apache.commons.collections4.collection;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a<E> implements Collection<E>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f335597b = 6249888059822088500L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Collection<E> f335598a;

    protected a() {
    }

    @Override // java.util.Collection, org.apache.commons.collections4.c
    public boolean add(E e10) {
        return c().add(e10);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return c().addAll(collection);
    }

    protected Collection<E> c() {
        return this.f335598a;
    }

    @Override // java.util.Collection
    public void clear() {
        c().clear();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return c().contains(obj);
    }

    @Override // java.util.Collection, org.apache.commons.collections4.c
    public boolean containsAll(Collection<?> collection) {
        return c().containsAll(collection);
    }

    protected void d(Collection<E> collection) {
        this.f335598a = collection;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return c().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.c
    public Iterator<E> iterator() {
        return c().iterator();
    }

    @Override // java.util.Collection, org.apache.commons.collections4.c
    public boolean remove(Object obj) {
        return c().remove(obj);
    }

    @Override // java.util.Collection, org.apache.commons.collections4.c
    public boolean removeAll(Collection<?> collection) {
        return c().removeAll(collection);
    }

    @Override // java.util.Collection, org.apache.commons.collections4.c
    public boolean retainAll(Collection<?> collection) {
        return c().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return c().size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return c().toArray();
    }

    public String toString() {
        return c().toString();
    }

    protected a(Collection<E> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.f335598a = collection;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) c().toArray(tArr);
    }
}
