package org.apache.commons.collections4.bag;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public final class d<E> extends a<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f335506d = -2560033712679053143L;

    public d(org.apache.commons.collections4.c<E> cVar) {
        super(cVar);
    }

    public static <E> org.apache.commons.collections4.c<E> k(org.apache.commons.collections4.c<E> cVar) {
        return new d(cVar);
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
        c().H(e10, i10);
        return true;
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean add(E e10) {
        return H(e10, 1);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                boolean zH = H(it.next(), 1);
                if (z10 || zH) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean remove(Object obj) {
        return f0(obj, 1);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean removeAll(Collection<?> collection) {
        if (collection == null) {
            return c().removeAll(null);
        }
        while (true) {
            boolean z10 = false;
            for (Object obj : collection) {
                boolean zF0 = f0(obj, U0(obj));
                if (z10 || zF0) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean retainAll(Collection<?> collection) {
        if (collection == null) {
            return c().retainAll(null);
        }
        Iterator<E> it = iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }
}
