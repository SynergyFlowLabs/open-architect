package org.apache.commons.collections4.bidimap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.a0;
import org.apache.commons.collections4.p0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b<K, V> implements org.apache.commons.collections4.e<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    transient Map<K, V> f335520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient Map<V, K> f335521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient org.apache.commons.collections4.e<V, K> f335522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Set<K> f335523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    transient Set<V> f335524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    transient Set<Map.Entry<K, V>> f335525f;

    protected static class a<K, V> implements a0<K, V>, p0<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final b<K, V> f335526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected Iterator<Map.Entry<K, V>> f335527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected Map.Entry<K, V> f335528c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected boolean f335529d = false;

        protected a(b<K, V> bVar) {
            this.f335526a = bVar;
            this.f335527b = bVar.f335520a.entrySet().iterator();
        }

        @Override // org.apache.commons.collections4.a0
        public K getKey() {
            Map.Entry<K, V> entry = this.f335528c;
            if (entry != null) {
                return entry.getKey();
            }
            throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0
        public V getValue() {
            Map.Entry<K, V> entry = this.f335528c;
            if (entry != null) {
                return entry.getValue();
            }
            throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public boolean hasNext() {
            return this.f335527b.hasNext();
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public K next() {
            Map.Entry<K, V> next = this.f335527b.next();
            this.f335528c = next;
            this.f335529d = true;
            return next.getKey();
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public void remove() {
            if (!this.f335529d) {
                throw new IllegalStateException("Iterator remove() can only be called once after next()");
            }
            V value = this.f335528c.getValue();
            this.f335527b.remove();
            this.f335526a.f335521b.remove(value);
            this.f335528c = null;
            this.f335529d = false;
        }

        @Override // org.apache.commons.collections4.p0
        public void reset() {
            this.f335527b = this.f335526a.f335520a.entrySet().iterator();
            this.f335528c = null;
            this.f335529d = false;
        }

        @Override // org.apache.commons.collections4.a0
        public V setValue(V v10) {
            if (this.f335528c == null) {
                throw new IllegalStateException("Iterator setValue() can only be called after next() and before remove()");
            }
            if (!this.f335526a.f335521b.containsKey(v10) || this.f335526a.f335521b.get(v10) == this.f335528c.getKey()) {
                return (V) this.f335526a.put(this.f335528c.getKey(), v10);
            }
            throw new IllegalArgumentException("Cannot use setValue() when the object being set is already in the map");
        }

        public String toString() {
            if (this.f335528c == null) {
                return "MapIterator[]";
            }
            return "MapIterator[" + getKey() + "=" + getValue() + "]";
        }
    }

    /* JADX INFO: renamed from: org.apache.commons.collections4.bidimap.b$b, reason: collision with other inner class name */
    protected static class C2384b<K, V> extends i<K, V, Map.Entry<K, V>> implements Set<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f335530e = 4040410962603292348L;

        protected C2384b(b<K, V> bVar) {
            super(bVar.f335520a.entrySet(), bVar);
        }

        @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.c
        public Iterator<Map.Entry<K, V>> iterator() {
            return this.f335544c.b(super.iterator());
        }

        @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            if (this.f335544c.containsKey(key)) {
                V v10 = this.f335544c.f335520a.get(key);
                Object value = entry.getValue();
                if (v10 != null ? v10.equals(value) : value == null) {
                    this.f335544c.f335520a.remove(key);
                    this.f335544c.f335521b.remove(v10);
                    return true;
                }
            }
            return false;
        }
    }

    protected static class c<K, V> extends org.apache.commons.collections4.iterators.c<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final b<K, V> f335531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected Map.Entry<K, V> f335532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected boolean f335533d;

        protected c(Iterator<Map.Entry<K, V>> it, b<K, V> bVar) {
            super(it);
            this.f335532c = null;
            this.f335533d = false;
            this.f335531b = bVar;
        }

        @Override // org.apache.commons.collections4.iterators.c, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            f fVar = new f((Map.Entry) super.next(), this.f335531b);
            this.f335532c = fVar;
            this.f335533d = true;
            return fVar;
        }

        @Override // org.apache.commons.collections4.iterators.g, java.util.Iterator
        public void remove() {
            if (!this.f335533d) {
                throw new IllegalStateException("Iterator remove() can only be called once after next()");
            }
            V value = this.f335532c.getValue();
            super.remove();
            this.f335531b.f335521b.remove(value);
            this.f335532c = null;
            this.f335533d = false;
        }
    }

    protected static class d<K> extends i<K, Object, K> implements Set<K> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f335534e = -7107935777385040694L;

        protected d(b<K, ?> bVar) {
            super(bVar.f335520a.keySet(), bVar);
        }

        @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f335544c.f335520a.containsKey(obj);
        }

        @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.c
        public Iterator<K> iterator() {
            return this.f335544c.c(super.iterator());
        }

        @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
        public boolean remove(Object obj) {
            if (!this.f335544c.f335520a.containsKey(obj)) {
                return false;
            }
            this.f335544c.f335521b.remove(this.f335544c.f335520a.remove(obj));
            return true;
        }
    }

    protected static class e<K> extends org.apache.commons.collections4.iterators.c<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final b<K, ?> f335535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected K f335536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected boolean f335537d;

        protected e(Iterator<K> it, b<K, ?> bVar) {
            super(it);
            this.f335536c = null;
            this.f335537d = false;
            this.f335535b = bVar;
        }

        @Override // org.apache.commons.collections4.iterators.c, java.util.Iterator
        public K next() {
            K k10 = (K) super.next();
            this.f335536c = k10;
            this.f335537d = true;
            return k10;
        }

        @Override // org.apache.commons.collections4.iterators.g, java.util.Iterator
        public void remove() {
            if (!this.f335537d) {
                throw new IllegalStateException("Iterator remove() can only be called once after next()");
            }
            Object obj = this.f335535b.f335520a.get(this.f335536c);
            super.remove();
            this.f335535b.f335521b.remove(obj);
            this.f335536c = null;
            this.f335537d = false;
        }
    }

    protected static class f<K, V> extends org.apache.commons.collections4.keyvalue.c<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final b<K, V> f335538b;

        protected f(Map.Entry<K, V> entry, b<K, V> bVar) {
            super(entry);
            this.f335538b = bVar;
        }

        @Override // org.apache.commons.collections4.keyvalue.c, java.util.Map.Entry
        public V setValue(V v10) {
            K key = getKey();
            if (this.f335538b.f335521b.containsKey(v10) && this.f335538b.f335521b.get(v10) != key) {
                throw new IllegalArgumentException("Cannot use setValue() when the object being set is already in the map");
            }
            this.f335538b.put(key, v10);
            return (V) super.setValue(v10);
        }
    }

    protected static class g<V> extends i<Object, V, V> implements Set<V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f335539e = 4023777119829639864L;

        protected g(b<?, V> bVar) {
            super(bVar.f335520a.values(), bVar);
        }

        @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f335544c.f335521b.containsKey(obj);
        }

        @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.c
        public Iterator<V> iterator() {
            return this.f335544c.d(super.iterator());
        }

        @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
        public boolean remove(Object obj) {
            if (!this.f335544c.f335521b.containsKey(obj)) {
                return false;
            }
            this.f335544c.f335520a.remove(this.f335544c.f335521b.remove(obj));
            return true;
        }
    }

    protected static class h<V> extends org.apache.commons.collections4.iterators.c<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final b<Object, V> f335540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected V f335541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected boolean f335542d;

        protected h(Iterator<V> it, b<?, V> bVar) {
            super(it);
            this.f335541c = null;
            this.f335542d = false;
            this.f335540b = bVar;
        }

        @Override // org.apache.commons.collections4.iterators.c, java.util.Iterator
        public V next() {
            V v10 = (V) super.next();
            this.f335541c = v10;
            this.f335542d = true;
            return v10;
        }

        @Override // org.apache.commons.collections4.iterators.g, java.util.Iterator
        public void remove() {
            if (!this.f335542d) {
                throw new IllegalStateException("Iterator remove() can only be called once after next()");
            }
            super.remove();
            this.f335540b.f335521b.remove(this.f335541c);
            this.f335541c = null;
            this.f335542d = false;
        }
    }

    protected static abstract class i<K, V, E> extends org.apache.commons.collections4.collection.a<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f335543d = 4621510560119690639L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final b<K, V> f335544c;

        protected i(Collection<E> collection, b<K, V> bVar) {
            super(collection);
            this.f335544c = bVar;
        }

        @Override // org.apache.commons.collections4.collection.a, java.util.Collection
        public void clear() {
            this.f335544c.clear();
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj != this && !c().equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Collection
        public int hashCode() {
            return c().hashCode();
        }

        @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
        public boolean removeAll(Collection<?> collection) {
            boolean zRemove = false;
            if (!this.f335544c.isEmpty() && !collection.isEmpty()) {
                Iterator<?> it = collection.iterator();
                while (it.hasNext()) {
                    zRemove |= remove(it.next());
                }
            }
            return zRemove;
        }

        @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
        public boolean retainAll(Collection<?> collection) {
            boolean z10 = false;
            if (this.f335544c.isEmpty()) {
                return false;
            }
            if (collection.isEmpty()) {
                this.f335544c.clear();
                return true;
            }
            Iterator<E> it = iterator();
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
    }

    protected b() {
        this.f335522c = null;
        this.f335523d = null;
        this.f335524e = null;
        this.f335525f = null;
    }

    @Override // org.apache.commons.collections4.e
    public org.apache.commons.collections4.e<V, K> N() {
        if (this.f335522c == null) {
            this.f335522c = a(this.f335521b, this.f335520a, this);
        }
        return this.f335522c;
    }

    @Override // org.apache.commons.collections4.e
    public K N2(Object obj) {
        if (!this.f335521b.containsKey(obj)) {
            return null;
        }
        K kRemove = this.f335521b.remove(obj);
        this.f335520a.remove(kRemove);
        return kRemove;
    }

    @Override // org.apache.commons.collections4.s
    public a0<K, V> T() {
        return new a(this);
    }

    protected abstract org.apache.commons.collections4.e<V, K> a(Map<V, K> map, Map<K, V> map2, org.apache.commons.collections4.e<K, V> eVar);

    protected Iterator<Map.Entry<K, V>> b(Iterator<Map.Entry<K, V>> it) {
        return new c(it, this);
    }

    protected Iterator<K> c(Iterator<K> it) {
        return new e(it, this);
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        this.f335520a.clear();
        this.f335521b.clear();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsKey(Object obj) {
        return this.f335520a.containsKey(obj);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsValue(Object obj) {
        return this.f335521b.containsKey(obj);
    }

    protected Iterator<V> d(Iterator<V> it) {
        return new h(it, this);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f335525f == null) {
            this.f335525f = new C2384b(this);
        }
        return this.f335525f;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.f335520a.equals(obj);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public V get(Object obj) {
        return this.f335520a.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f335520a.hashCode();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean isEmpty() {
        return this.f335520a.isEmpty();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        if (this.f335523d == null) {
            this.f335523d = new d(this);
        }
        return this.f335523d;
    }

    @Override // org.apache.commons.collections4.e, java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        if (this.f335520a.containsKey(k10)) {
            this.f335521b.remove(this.f335520a.get(k10));
        }
        if (this.f335521b.containsKey(v10)) {
            this.f335520a.remove(this.f335521b.get(v10));
        }
        V vPut = this.f335520a.put(k10, v10);
        this.f335521b.put(v10, k10);
        return vPut;
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        if (!this.f335520a.containsKey(obj)) {
            return null;
        }
        V vRemove = this.f335520a.remove(obj);
        this.f335521b.remove(vRemove);
        return vRemove;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public int size() {
        return this.f335520a.size();
    }

    public String toString() {
        return this.f335520a.toString();
    }

    @Override // org.apache.commons.collections4.e
    public K w2(Object obj) {
        return this.f335521b.get(obj);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<V> values() {
        if (this.f335524e == null) {
            this.f335524e = new g(this);
        }
        return this.f335524e;
    }

    protected b(Map<K, V> map, Map<V, K> map2) {
        this.f335522c = null;
        this.f335523d = null;
        this.f335524e = null;
        this.f335525f = null;
        this.f335520a = map;
        this.f335521b = map2;
    }

    protected b(Map<K, V> map, Map<V, K> map2, org.apache.commons.collections4.e<V, K> eVar) {
        this.f335523d = null;
        this.f335524e = null;
        this.f335525f = null;
        this.f335520a = map;
        this.f335521b = map2;
        this.f335522c = eVar;
    }
}
