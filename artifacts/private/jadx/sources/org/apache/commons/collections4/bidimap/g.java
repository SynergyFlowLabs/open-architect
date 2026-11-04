package org.apache.commons.collections4.bidimap;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.h0;
import org.apache.commons.collections4.j0;
import org.apache.commons.collections4.k0;
import org.apache.commons.collections4.p0;
import org.apache.commons.collections4.u0;

/* JADX INFO: loaded from: classes14.dex */
public class g<K, V> extends org.apache.commons.collections4.bidimap.b<K, V> implements u0<K, V>, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f335547i = 721969328361809L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Comparator<? super K> f335548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Comparator<? super V> f335549h;

    protected static class a<K, V> implements k0<K, V>, p0<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final org.apache.commons.collections4.bidimap.b<K, V> f335550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListIterator<Map.Entry<K, V>> f335551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map.Entry<K, V> f335552c = null;

        protected a(org.apache.commons.collections4.bidimap.b<K, V> bVar) {
            this.f335550a = bVar;
            this.f335551b = new ArrayList(bVar.entrySet()).listIterator();
        }

        @Override // org.apache.commons.collections4.a0
        public K getKey() {
            Map.Entry<K, V> entry = this.f335552c;
            if (entry != null) {
                return entry.getKey();
            }
            throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0
        public V getValue() {
            Map.Entry<K, V> entry = this.f335552c;
            if (entry != null) {
                return entry.getValue();
            }
            throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public boolean hasNext() {
            return this.f335551b.hasNext();
        }

        @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
        public boolean hasPrevious() {
            return this.f335551b.hasPrevious();
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public K next() {
            Map.Entry<K, V> next = this.f335551b.next();
            this.f335552c = next;
            return next.getKey();
        }

        @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
        public K previous() {
            Map.Entry<K, V> entryPrevious = this.f335551b.previous();
            this.f335552c = entryPrevious;
            return entryPrevious.getKey();
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public void remove() {
            this.f335551b.remove();
            this.f335550a.remove(this.f335552c.getKey());
            this.f335552c = null;
        }

        @Override // org.apache.commons.collections4.p0
        public void reset() {
            this.f335551b = new ArrayList(this.f335550a.entrySet()).listIterator();
            this.f335552c = null;
        }

        @Override // org.apache.commons.collections4.a0
        public V setValue(V v10) {
            if (this.f335552c == null) {
                throw new IllegalStateException("Iterator setValue() can only be called after next() and before remove()");
            }
            if (this.f335550a.f335521b.containsKey(v10) && this.f335550a.f335521b.get(v10) != this.f335552c.getKey()) {
                throw new IllegalArgumentException("Cannot use setValue() when the object being set is already in the map");
            }
            V v11 = (V) this.f335550a.put(this.f335552c.getKey(), v10);
            this.f335552c.setValue(v10);
            return v11;
        }

        public String toString() {
            if (this.f335552c == null) {
                return "MapIterator[]";
            }
            return "MapIterator[" + getKey() + "=" + getValue() + "]";
        }
    }

    protected static class b<K, V> extends org.apache.commons.collections4.map.h<K, V> {
        protected b(g<K, V> gVar, SortedMap<K, V> sortedMap) {
            super(new g(sortedMap, gVar.f335521b, gVar.f335522c));
        }

        @Override // org.apache.commons.collections4.map.h, org.apache.commons.collections4.j0
        public K C3(K k10) {
            return a().C3(k10);
        }

        @Override // org.apache.commons.collections4.map.h, org.apache.commons.collections4.j0
        public K E2(K k10) {
            return a().E2(k10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.apache.commons.collections4.map.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g<K, V> a() {
            return (g) super.a();
        }

        @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
        public void clear() {
            Iterator<K> it = keySet().iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }

        @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
        public boolean containsValue(Object obj) {
            return a().f335520a.containsValue(obj);
        }

        @Override // org.apache.commons.collections4.map.h, java.util.SortedMap
        public SortedMap<K, V> headMap(K k10) {
            return new b(a(), super.headMap(k10));
        }

        @Override // org.apache.commons.collections4.map.h, java.util.SortedMap
        public SortedMap<K, V> subMap(K k10, K k11) {
            return new b(a(), super.subMap(k10, k11));
        }

        @Override // org.apache.commons.collections4.map.h, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k10) {
            return new b(a(), super.tailMap(k10));
        }
    }

    public g() {
        super(new TreeMap(), new TreeMap());
        this.f335548g = null;
        this.f335549h = null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f335520a = new TreeMap(this.f335548g);
        this.f335521b = new TreeMap(this.f335549h);
        putAll((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f335520a);
    }

    @Override // org.apache.commons.collections4.j0
    public K C3(K k10) {
        if (isEmpty()) {
            return null;
        }
        Map<K, V> map = this.f335520a;
        if (map instanceof j0) {
            return (K) ((j0) map).C3(k10);
        }
        Iterator<K> it = ((SortedMap) map).tailMap(k10).keySet().iterator();
        it.next();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @Override // org.apache.commons.collections4.j0
    public K E2(K k10) {
        if (isEmpty()) {
            return null;
        }
        Map<K, V> map = this.f335520a;
        if (map instanceof j0) {
            return (K) ((j0) map).E2(k10);
        }
        SortedMap<K, V> sortedMapHeadMap = ((SortedMap) map).headMap(k10);
        if (sortedMapHeadMap.isEmpty()) {
            return null;
        }
        return sortedMapHeadMap.lastKey();
    }

    @Override // org.apache.commons.collections4.u0
    public Comparator<? super V> Y() {
        return ((SortedMap) this.f335521b).comparator();
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return ((SortedMap) this.f335520a).comparator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.bidimap.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g<V, K> a(Map<V, K> map, Map<K, V> map2, org.apache.commons.collections4.e<K, V> eVar) {
        return new g<>(map, map2, eVar);
    }

    public h0<V, K> f() {
        return N();
    }

    @Override // org.apache.commons.collections4.j0
    public K firstKey() {
        return (K) ((SortedMap) this.f335520a).firstKey();
    }

    public u0<V, K> g() {
        return N();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k10) {
        return new b(this, ((SortedMap) this.f335520a).headMap(k10));
    }

    @Override // org.apache.commons.collections4.j0
    public K lastKey() {
        return (K) ((SortedMap) this.f335520a).lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k10, K k11) {
        return new b(this, ((SortedMap) this.f335520a).subMap(k10, k11));
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k10) {
        return new b(this, ((SortedMap) this.f335520a).tailMap(k10));
    }

    @Override // org.apache.commons.collections4.bidimap.b, org.apache.commons.collections4.s
    public k0<K, V> T() {
        return new a(this);
    }

    @Override // org.apache.commons.collections4.bidimap.b, org.apache.commons.collections4.e
    public u0<V, K> N() {
        return (u0) super.N();
    }

    public g(Map<? extends K, ? extends V> map) {
        super(new TreeMap(), new TreeMap());
        putAll(map);
        this.f335548g = null;
        this.f335549h = null;
    }

    public g(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        super(new TreeMap(comparator), new TreeMap(comparator2));
        this.f335548g = comparator;
        this.f335549h = comparator2;
    }

    protected g(Map<K, V> map, Map<V, K> map2, org.apache.commons.collections4.e<V, K> eVar) {
        super(map, map2, eVar);
        this.f335548g = ((SortedMap) map).comparator();
        this.f335549h = ((SortedMap) map2).comparator();
    }
}
