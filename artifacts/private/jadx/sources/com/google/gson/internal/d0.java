package com.google.gson.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public class d0<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<E> f125484a;

    public d0(ArrayList<E> arrayList) {
        Objects.requireNonNull(arrayList);
        this.f125484a = arrayList;
    }

    private E c(E e10) {
        if (e10 != null) {
            return e10;
        }
        throw new NullPointerException("Element must be non-null");
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        this.f125484a.add(i10, c(e10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f125484a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f125484a.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return this.f125484a.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        return this.f125484a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return this.f125484a.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        return this.f125484a.indexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        return this.f125484a.lastIndexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        return this.f125484a.remove(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        return this.f125484a.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        return this.f125484a.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        return this.f125484a.set(i10, c(e10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f125484a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return this.f125484a.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        return this.f125484a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f125484a.toArray(tArr);
    }
}
