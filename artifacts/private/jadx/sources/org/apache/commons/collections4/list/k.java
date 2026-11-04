package org.apache.commons.collections4.list;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class k<E> extends org.apache.commons.collections4.collection.f<E> implements List<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f335949e = 1077193035000013141L;

    protected class a extends org.apache.commons.collections4.iterators.d<E> {
        protected a(ListIterator<E> listIterator) {
            super(listIterator);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.apache.commons.collections4.iterators.d, java.util.ListIterator
        public void add(E e10) {
            b().add(k.this.i(e10));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.apache.commons.collections4.iterators.d, java.util.ListIterator
        public void set(E e10) {
            b().set(k.this.i(e10));
        }
    }

    protected k(List<E> list, w0<? super E, ? extends E> w0Var) {
        super(list, w0Var);
    }

    public static <E> k<E> s(List<E> list, w0<? super E, ? extends E> w0Var) {
        k<E> kVar = new k<>(list, w0Var);
        if (list.size() > 0) {
            Object[] array = list.toArray();
            list.clear();
            for (Object obj : array) {
                kVar.c().add(w0Var.a(obj));
            }
        }
        return kVar;
    }

    public static <E> k<E> t(List<E> list, w0<? super E, ? extends E> w0Var) {
        return new k<>(list, w0Var);
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        r().add(i10, i(e10));
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        return r().addAll(i10, k(collection));
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.List
    public E get(int i10) {
        return r().get(i10);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return c().hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return r().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return r().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    protected List<E> r() {
        return (List) c();
    }

    @Override // java.util.List
    public E remove(int i10) {
        return r().remove(i10);
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        return r().set(i10, i(e10));
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return new k(r().subList(i10, i11), this.f335615c);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new a(r().listIterator(i10));
    }
}
