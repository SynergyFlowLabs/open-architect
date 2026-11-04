package org.apache.commons.collections4.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.apache.commons.collections4.k0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class h<K, V> extends e<K, V> implements org.apache.commons.collections4.u<K, V> {

    protected static class a<K, V> extends l<K, V> implements k0<K, V> {
        protected a(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
        public boolean hasPrevious() {
            return ((ListIterator) this.f336073b).hasPrevious();
        }

        @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
        public K previous() {
            this.f336074c = (Map.Entry) ((ListIterator) this.f336073b).previous();
            return getKey();
        }

        @Override // org.apache.commons.collections4.map.l, org.apache.commons.collections4.p0
        public synchronized void reset() {
            try {
                super.reset();
                this.f336073b = new org.apache.commons.collections4.iterators.y(this.f336073b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected h() {
    }

    public K C3(K k10) {
        Iterator<K> it = tailMap(k10).keySet().iterator();
        it.next();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public K E2(K k10) {
        SortedMap<K, V> sortedMapHeadMap = headMap(k10);
        if (sortedMapHeadMap.isEmpty()) {
            return null;
        }
        return sortedMapHeadMap.lastKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.map.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SortedMap<K, V> a() {
        return (SortedMap) super.a();
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedMap, org.apache.commons.collections4.j0
    public K firstKey() {
        return a().firstKey();
    }

    public SortedMap<K, V> headMap(K k10) {
        return a().headMap(k10);
    }

    @Override // java.util.SortedMap, org.apache.commons.collections4.j0
    public K lastKey() {
        return a().lastKey();
    }

    public SortedMap<K, V> subMap(K k10, K k11) {
        return a().subMap(k10, k11);
    }

    public SortedMap<K, V> tailMap(K k10) {
        return a().tailMap(k10);
    }

    public h(SortedMap<K, V> sortedMap) {
        super(sortedMap);
    }

    @Override // org.apache.commons.collections4.map.c, org.apache.commons.collections4.s
    public k0<K, V> T() {
        return new a(entrySet());
    }
}
