package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.apache.commons.collections4.iterators.o0;
import org.apache.commons.collections4.iterators.p0;

/* JADX INFO: loaded from: classes14.dex */
public class t<K, V> extends d<K, V> implements Serializable, Cloneable {
    private static final long Y = 9077234323521161066L;

    static class a<K> extends AbstractList<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t<K, ?> f336106a;

        a(t<K, ?> tVar) {
            this.f336106a = tVar;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f336106a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean containsAll(Collection<?> collection) {
            return this.f336106a.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractList, java.util.List
        public K get(int i10) {
            return this.f336106a.P(i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            return this.f336106a.S(obj);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<K> iterator() {
            return o0.b(this.f336106a.keySet().iterator());
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            return this.f336106a.S(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<K> listIterator() {
            return p0.b(super.listIterator());
        }

        @Override // java.util.AbstractList, java.util.List
        public K remove(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f336106a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<K> subList(int i10, int i11) {
            return org.apache.commons.collections4.list.m.k(super.subList(i10, i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            return this.f336106a.keySet().toArray();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<K> listIterator(int i10) {
            return p0.b(super.listIterator(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.f336106a.keySet().toArray(tArr);
        }
    }

    public t() {
        super(16, 0.75f, 12);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        o(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        p(objectOutputStream);
    }

    public List<K> M() {
        return new a(this);
    }

    @Override // org.apache.commons.collections4.map.a
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public t<K, V> clone() {
        return (t) super.clone();
    }

    public K P(int i10) {
        return K(i10).getKey();
    }

    public V Q(int i10) {
        return K(i10).getValue();
    }

    public int S(Object obj) {
        Object objH = h(obj);
        d.c<K, V> cVar = this.X.f336016f;
        int i10 = 0;
        while (cVar != this.X) {
            if (B(objH, cVar.f335989c)) {
                return i10;
            }
            cVar = cVar.f336016f;
            i10++;
        }
        return -1;
    }

    public V U(int i10) {
        return remove(P(i10));
    }

    public t(int i10) {
        super(i10);
    }

    public t(int i10, float f10) {
        super(i10, f10);
    }

    public t(Map<? extends K, ? extends V> map) {
        super(map);
    }
}
