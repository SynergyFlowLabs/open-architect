package org.apache.commons.collections4.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections4.l0;

/* JADX INFO: loaded from: classes14.dex */
public class i<E> extends org.apache.commons.collections4.collection.d<E> implements List<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f335941e = -5722039223898659102L;

    protected class a extends org.apache.commons.collections4.iterators.d<E> {
        protected a(ListIterator<E> listIterator) {
            super(listIterator);
        }

        @Override // org.apache.commons.collections4.iterators.d, java.util.ListIterator
        public void add(E e10) {
            i.this.m(e10);
            b().add(e10);
        }

        @Override // org.apache.commons.collections4.iterators.d, java.util.ListIterator
        public void set(E e10) {
            i.this.m(e10);
            b().set(e10);
        }
    }

    protected i(List<E> list, l0<? super E> l0Var) {
        super(list, l0Var);
    }

    public static <T> i<T> s(List<T> list, l0<? super T> l0Var) {
        return new i<>(list, l0Var);
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        m(e10);
        c().add(i10, e10);
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            m(it.next());
        }
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
        return listIterator(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.collection.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public List<E> c() {
        return (List) super.c();
    }

    @Override // java.util.List
    public E remove(int i10) {
        return c().remove(i10);
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        m(e10);
        return c().set(i10, e10);
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return new i(c().subList(i10, i11), this.f335607c);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new a(c().listIterator(i10));
    }
}
