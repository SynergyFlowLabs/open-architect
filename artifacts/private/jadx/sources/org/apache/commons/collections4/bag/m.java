package org.apache.commons.collections4.bag;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.t0;

/* JADX INFO: loaded from: classes14.dex */
public class m<E> extends b<E> implements t0<E>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f335517e = -7740146511091606676L;

    public m() {
        super(new TreeMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        super.l(new TreeMap((Comparator) objectInputStream.readObject()), objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(comparator());
        super.m(objectOutputStream);
    }

    @Override // org.apache.commons.collections4.bag.b, org.apache.commons.collections4.c, java.util.Collection
    public boolean add(E e10) {
        if (comparator() == null && !(e10 instanceof Comparable)) {
            e10.getClass();
            throw new IllegalArgumentException("Objects of type " + e10.getClass() + " cannot be added to a naturally ordered TreeBag as it does not implement Comparable");
        }
        return super.add(e10);
    }

    @Override // org.apache.commons.collections4.t0
    public Comparator<? super E> comparator() {
        return n().comparator();
    }

    @Override // org.apache.commons.collections4.t0
    public E first() {
        return n().firstKey();
    }

    @Override // org.apache.commons.collections4.t0
    public E last() {
        return n().lastKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.bag.b
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public SortedMap<E, b.C2383b> n() {
        return (SortedMap) super.n();
    }

    public m(Comparator<? super E> comparator) {
        super(new TreeMap(comparator));
    }

    public m(Collection<? extends E> collection) {
        this();
        addAll(collection);
    }
}
