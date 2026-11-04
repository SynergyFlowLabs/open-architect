package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class y<T> extends AtomicInteger implements List<T>, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f303515b = 3972397474470203923L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList<T> f303516a;

    public y() {
        this.f303516a = new ArrayList<>();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        boolean zAdd = this.f303516a.add(t10);
        lazySet(this.f303516a.size());
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        boolean zAddAll = this.f303516a.addAll(collection);
        lazySet(this.f303516a.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f303516a.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f303516a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f303516a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return obj instanceof y ? this.f303516a.equals(((y) obj).f303516a) : this.f303516a.equals(obj);
    }

    @Override // java.util.List
    public T get(int i10) {
        return this.f303516a.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f303516a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f303516a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f303516a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f303516a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return this.f303516a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean zRemove = this.f303516a.remove(obj);
        lazySet(this.f303516a.size());
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll = this.f303516a.removeAll(collection);
        lazySet(this.f303516a.size());
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll = this.f303516a.retainAll(collection);
        lazySet(this.f303516a.size());
        return zRetainAll;
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        return this.f303516a.set(i10, t10);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return get();
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        return this.f303516a.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f303516a.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.f303516a.toString();
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        return this.f303516a.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        return (E[]) this.f303516a.toArray(eArr);
    }

    public y(int i10) {
        this.f303516a = new ArrayList<>(i10);
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        this.f303516a.add(i10, t10);
        lazySet(this.f303516a.size());
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        boolean zAddAll = this.f303516a.addAll(i10, collection);
        lazySet(this.f303516a.size());
        return zAddAll;
    }

    @Override // java.util.List
    public T remove(int i10) {
        T tRemove = this.f303516a.remove(i10);
        lazySet(this.f303516a.size());
        return tRemove;
    }
}
