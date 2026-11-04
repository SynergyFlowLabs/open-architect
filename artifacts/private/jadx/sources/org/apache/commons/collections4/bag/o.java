package org.apache.commons.collections4.bag;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.collections4.a1;
import org.apache.commons.collections4.iterators.o0;
import org.apache.commons.collections4.t0;

/* JADX INFO: loaded from: classes14.dex */
public final class o<E> extends c<E> implements a1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f335519e = -3190437252665717841L;

    private o(t0<E> t0Var) {
        super(t0Var);
    }

    public static <E> t0<E> l(t0<E> t0Var) {
        return t0Var instanceof a1 ? t0Var : new o(t0Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        d((Collection) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(c());
    }

    @Override // org.apache.commons.collections4.bag.a, org.apache.commons.collections4.c
    public boolean H(E e10, int i10) {
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

    @Override // org.apache.commons.collections4.bag.a, org.apache.commons.collections4.c
    public boolean f0(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.c
    public Iterator<E> iterator() {
        return o0.b(c().iterator());
    }

    @Override // org.apache.commons.collections4.bag.a, org.apache.commons.collections4.c
    public Set<E> r0() {
        return org.apache.commons.collections4.set.o.k(c().r0());
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
