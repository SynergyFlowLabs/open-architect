package org.apache.commons.collections4.map;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.a1;

/* JADX INFO: loaded from: classes14.dex */
public final class g0<K, V> extends org.apache.commons.collections4.set.c<Map.Entry<K, V>> implements a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f336061d = 1678353579659253473L;

    private class a extends org.apache.commons.collections4.keyvalue.c<K, V> {
        protected a(Map.Entry<K, V> entry) {
            super(entry);
        }

        @Override // org.apache.commons.collections4.keyvalue.c, java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException();
        }
    }

    private class b extends org.apache.commons.collections4.iterators.c<Map.Entry<K, V>> {
        protected b(Iterator<Map.Entry<K, V>> it) {
            super(it);
        }

        @Override // org.apache.commons.collections4.iterators.c, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return new a(b().next());
        }

        @Override // org.apache.commons.collections4.iterators.g, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private g0(Set<Map.Entry<K, V>> set) {
        super(set);
    }

    public static <K, V> Set<Map.Entry<K, V>> l(Set<Map.Entry<K, V>> set) {
        return set instanceof a1 ? set : new g0(set);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.c
    public Iterator<Map.Entry<K, V>> iterator() {
        return new b(c().iterator());
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
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

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public Object[] toArray() {
        Object[] array = c().toArray();
        for (int i10 = 0; i10 < array.length; i10++) {
            array[i10] = new a((Map.Entry) array[i10]);
        }
        return array;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        T[] tArr2 = (T[]) c().toArray(tArr.length > 0 ? (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 0) : tArr);
        for (int i10 = 0; i10 < tArr2.length; i10++) {
            tArr2[i10] = new a((Map.Entry) tArr2[i10]);
        }
        if (tArr2.length > tArr.length) {
            return tArr2;
        }
        System.arraycopy(tArr2, 0, tArr, 0, tArr2.length);
        if (tArr.length > tArr2.length) {
            tArr[tArr2.length] = null;
        }
        return tArr;
    }
}
