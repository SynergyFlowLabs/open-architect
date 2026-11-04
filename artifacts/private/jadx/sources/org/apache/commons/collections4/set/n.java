package org.apache.commons.collections4.set;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import org.apache.commons.collections4.a1;
import org.apache.commons.collections4.iterators.o0;

/* JADX INFO: loaded from: classes14.dex */
public final class n<E> extends a<E> implements a1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f336303f = 20150528;

    private n(NavigableSet<E> navigableSet) {
        super(navigableSet);
    }

    public static <E> NavigableSet<E> m(NavigableSet<E> navigableSet) {
        return navigableSet instanceof a1 ? navigableSet : new n(navigableSet);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        d((Collection) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(c());
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.set.a, java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return o0.b(c().descendingIterator());
    }

    @Override // org.apache.commons.collections4.set.a, java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return m(c().descendingSet());
    }

    @Override // org.apache.commons.collections4.set.d, java.util.SortedSet
    public SortedSet<E> headSet(E e10) {
        return p.l(c().headSet(e10));
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.c
    public Iterator<E> iterator() {
        return o0.b(c().iterator());
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.set.d, java.util.SortedSet
    public SortedSet<E> subSet(E e10, E e11) {
        return p.l(c().subSet(e10, e11));
    }

    @Override // org.apache.commons.collections4.set.d, java.util.SortedSet
    public SortedSet<E> tailSet(E e10) {
        return p.l(c().tailSet(e10));
    }

    @Override // org.apache.commons.collections4.set.a, java.util.NavigableSet
    public NavigableSet<E> headSet(E e10, boolean z10) {
        return m(c().headSet(e10, z10));
    }

    @Override // org.apache.commons.collections4.set.a, java.util.NavigableSet
    public NavigableSet<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        return m(c().subSet(e10, z10, e11, z11));
    }

    @Override // org.apache.commons.collections4.set.a, java.util.NavigableSet
    public NavigableSet<E> tailSet(E e10, boolean z10) {
        return m(c().tailSet(e10, z10));
    }
}
