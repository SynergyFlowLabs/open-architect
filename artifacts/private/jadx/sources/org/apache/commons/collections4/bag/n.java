package org.apache.commons.collections4.bag;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.collections4.a1;
import org.apache.commons.collections4.iterators.o0;

/* JADX INFO: loaded from: classes14.dex */
public final class n<E> extends a<E> implements a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f335518d = -1873799975157099624L;

    private n(org.apache.commons.collections4.c<? extends E> cVar) {
        super(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> org.apache.commons.collections4.c<E> k(org.apache.commons.collections4.c<? extends E> cVar) {
        return cVar instanceof a1 ? cVar : new n(cVar);
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
