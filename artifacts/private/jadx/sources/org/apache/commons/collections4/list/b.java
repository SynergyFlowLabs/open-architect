package org.apache.commons.collections4.list;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b<E> extends org.apache.commons.collections4.collection.a<E> implements List<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335923c = 4500739654952315623L;

    protected b() {
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        c().add(i10, e10);
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        return c().addAll(i10, collection);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.List
    public E get(int i10) {
        return c().get(i10);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return c().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.collection.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public List<E> c() {
        return (List) super.c();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return c().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return c().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return c().listIterator();
    }

    @Override // java.util.List
    public E remove(int i10) {
        return c().remove(i10);
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        return c().set(i10, e10);
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return c().subList(i10, i11);
    }

    protected b(List<E> list) {
        super(list);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return c().listIterator(i10);
    }
}
