package org.apache.commons.collections4.multiset;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.collections4.a1;
import org.apache.commons.collections4.e0;
import org.apache.commons.collections4.iterators.o0;
import org.apache.commons.collections4.set.o;

/* JADX INFO: loaded from: classes14.dex */
public final class g<E> extends c<E> implements a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f336232d = 20150611;

    private g(e0<? extends E> e0Var) {
        super(e0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> e0<E> k(e0<? extends E> e0Var) {
        return e0Var instanceof a1 ? e0Var : new g(e0Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        d((Collection) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(c());
    }

    @Override // org.apache.commons.collections4.multiset.c, org.apache.commons.collections4.e0
    public int H(E e10, int i10) {
        throw new UnsupportedOperationException();
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

    @Override // org.apache.commons.collections4.multiset.c, org.apache.commons.collections4.e0
    public Set<e0.a<E>> entrySet() {
        return o.k(c().entrySet());
    }

    @Override // org.apache.commons.collections4.multiset.c, org.apache.commons.collections4.e0
    public int f0(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.multiset.c, org.apache.commons.collections4.e0
    public int g1(E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.c
    public Iterator<E> iterator() {
        return o0.b(c().iterator());
    }

    @Override // org.apache.commons.collections4.multiset.c, org.apache.commons.collections4.e0
    public Set<E> r0() {
        return o.k(c().r0());
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
}
