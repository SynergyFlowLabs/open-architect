package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@a4
@com.google.common.annotations.b
public abstract class v4<E> extends m5 implements Collection<E> {
    protected v4() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.m5
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public abstract Collection<E> i1();

    protected boolean N0(Collection<? extends E> collection) {
        return p7.a(this, collection.iterator());
    }

    protected void P0() {
        p7.g(iterator());
    }

    protected boolean S0(@fj.a Object object) {
        return p7.p(iterator(), object);
    }

    protected boolean V0(Collection<?> collection) {
        return b3.b(this, collection);
    }

    protected boolean W0() {
        return !iterator().hasNext();
    }

    protected boolean X0(@fj.a Object object) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (com.google.common.base.d0.a(it.next(), object)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    protected boolean Y0(Collection<?> collection) {
        return p7.U(iterator(), collection);
    }

    protected boolean Z0(Collection<?> collection) {
        return p7.W(iterator(), collection);
    }

    protected Object[] a1() {
        return toArray(new Object[size()]);
    }

    @z7.a
    public boolean add(@b9 E element) {
        return i1().add(element);
    }

    @z7.a
    public boolean addAll(Collection<? extends E> collection) {
        return i1().addAll(collection);
    }

    protected <T> T[] c1(T[] tArr) {
        return (T[]) x8.m(this, tArr);
    }

    public void clear() {
        i1().clear();
    }

    public boolean contains(@fj.a Object object) {
        return i1().contains(object);
    }

    public boolean containsAll(Collection<?> collection) {
        return i1().containsAll(collection);
    }

    protected String f1() {
        return b3.l(this);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return i1().isEmpty();
    }

    public Iterator<E> iterator() {
        return i1().iterator();
    }

    @z7.a
    public boolean remove(@fj.a Object object) {
        return i1().remove(object);
    }

    @z7.a
    public boolean removeAll(Collection<?> collection) {
        return i1().removeAll(collection);
    }

    @z7.a
    public boolean retainAll(Collection<?> collection) {
        return i1().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return i1().size();
    }

    public Object[] toArray() {
        return i1().toArray();
    }

    @z7.a
    public <T> T[] toArray(T[] tArr) {
        return (T[]) i1().toArray(tArr);
    }
}
