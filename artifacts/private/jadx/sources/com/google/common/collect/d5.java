package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class d5<E> extends v4<E> implements List<E> {
    protected d5() {
    }

    @Override // java.util.List
    public void add(int index, @b9 E element) {
        i1().add(index, element);
    }

    @Override // java.util.List
    @z7.a
    public boolean addAll(int index, Collection<? extends E> elements) {
        return i1().addAll(index, elements);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@fj.a Object object) {
        return object == this || i1().equals(object);
    }

    @Override // java.util.List
    @b9
    public E get(int index) {
        return i1().get(index);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return i1().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.v4
    public abstract List<E> i1();

    @Override // java.util.List
    public int indexOf(@fj.a Object element) {
        return i1().indexOf(element);
    }

    protected boolean k1(@b9 E element) {
        add(size(), element);
        return true;
    }

    @Override // java.util.List
    public int lastIndexOf(@fj.a Object element) {
        return i1().lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return i1().listIterator();
    }

    protected boolean m1(int index, Iterable<? extends E> elements) {
        return x7.a(this, index, elements);
    }

    protected boolean n1(@fj.a Object object) {
        return x7.j(this, object);
    }

    protected int q1() {
        return x7.k(this);
    }

    protected int r1(@fj.a Object element) {
        return x7.l(this, element);
    }

    @Override // java.util.List
    @z7.a
    @b9
    public E remove(int index) {
        return i1().remove(index);
    }

    @Override // java.util.List
    @z7.a
    @b9
    public E set(int index, @b9 E element) {
        return i1().set(index, element);
    }

    @Override // java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        return i1().subList(fromIndex, toIndex);
    }

    protected Iterator<E> t1() {
        return listIterator();
    }

    protected int v1(@fj.a Object element) {
        return x7.n(this, element);
    }

    protected ListIterator<E> x1() {
        return listIterator(0);
    }

    protected ListIterator<E> y1(int start) {
        return x7.p(this, start);
    }

    protected List<E> z1(int fromIndex, int toIndex) {
        return x7.C(this, fromIndex, toIndex);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int index) {
        return i1().listIterator(index);
    }
}
