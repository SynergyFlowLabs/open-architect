package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.iterators.m0;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class w<K, V> extends e<K, Object> implements org.apache.commons.collections4.c0<K, V>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f336124d = -2214159910087182007L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.apache.commons.collections4.n<? extends Collection<V>> f336125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Collection<V> f336126c;

    class a extends org.apache.commons.collections4.iterators.x<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Iterator f336127e;

        /* JADX INFO: renamed from: org.apache.commons.collections4.map.w$a$a, reason: collision with other inner class name */
        class C2391a implements w0<V, Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f336129a;

            /* JADX INFO: renamed from: org.apache.commons.collections4.map.w$a$a$a, reason: collision with other inner class name */
            class C2392a implements Map.Entry<K, V> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Object f336131a;

                C2392a(Object obj) {
                    this.f336131a = obj;
                }

                @Override // java.util.Map.Entry
                public K getKey() {
                    return (K) C2391a.this.f336129a;
                }

                @Override // java.util.Map.Entry
                public V getValue() {
                    return (V) this.f336131a;
                }

                @Override // java.util.Map.Entry
                public V setValue(V v10) {
                    throw new UnsupportedOperationException();
                }
            }

            C2391a(Object obj) {
                this.f336129a = obj;
            }

            @Override // org.apache.commons.collections4.w0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a(V v10) {
                return new C2392a(v10);
            }
        }

        a(Iterator it) {
            this.f336127e = it;
        }

        @Override // org.apache.commons.collections4.iterators.x
        protected Iterator<? extends Map.Entry<K, V>> b(int i10) {
            if (!this.f336127e.hasNext()) {
                return null;
            }
            Object next = this.f336127e.next();
            return new m0(new d(next), new C2391a(next));
        }
    }

    private static class b<T extends Collection<?>> implements org.apache.commons.collections4.n<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f336133b = 2986114157496788874L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f336134a;

        public b(Class<T> cls) {
            this.f336134a = cls;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Class<T> cls = this.f336134a;
            if (cls != null && !Collection.class.isAssignableFrom(cls)) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // org.apache.commons.collections4.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public T k() {
            try {
                return this.f336134a.newInstance();
            } catch (Exception e10) {
                throw new org.apache.commons.collections4.q("Cannot instantiate class: " + this.f336134a, e10);
            }
        }
    }

    private class c extends AbstractCollection<V> {
        private c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            w.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            org.apache.commons.collections4.iterators.u uVar = new org.apache.commons.collections4.iterators.u();
            Iterator<K> it = w.this.keySet().iterator();
            while (it.hasNext()) {
                uVar.b(new d(it.next()));
            }
            return uVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return w.this.k();
        }

        /* synthetic */ c(w wVar, a aVar) {
            this();
        }
    }

    private class d implements Iterator<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f336136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Collection<V> f336137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Iterator<V> f336138c;

        public d(Object obj) {
            this.f336136a = obj;
            Collection<V> collectionD = w.this.d(obj);
            this.f336137b = collectionD;
            this.f336138c = collectionD.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f336138c.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.f336138c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f336138c.remove();
            if (this.f336137b.isEmpty()) {
                w.this.remove(this.f336136a);
            }
        }
    }

    public w() {
        this(new HashMap(), new b(ArrayList.class));
    }

    public static <K, V> w<K, V> f(Map<K, ? super Collection<V>> map) {
        return g(map, ArrayList.class);
    }

    public static <K, V, C extends Collection<V>> w<K, V> g(Map<K, ? super C> map, Class<C> cls) {
        return new w<>(map, new b(cls));
    }

    public static <K, V, C extends Collection<V>> w<K, V> h(Map<K, ? super C> map, org.apache.commons.collections4.n<C> nVar) {
        return new w<>(map, nVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f336038a = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f336038a);
    }

    @Override // org.apache.commons.collections4.c0
    public boolean O0(Object obj, Object obj2) {
        Collection<V> collectionD = d(obj);
        if (collectionD == null || !collectionD.remove(obj2)) {
            return false;
        }
        if (collectionD.isEmpty()) {
            remove(obj);
        }
        return true;
    }

    public boolean b(Object obj, Object obj2) {
        Collection<V> collectionD = d(obj);
        if (collectionD == null) {
            return false;
        }
        return collectionD.contains(obj2);
    }

    protected Collection<V> c(int i10) {
        return this.f336125b.k();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        a().clear();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = a().entrySet();
        if (setEntrySet == null) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (((Collection) it.next().getValue()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Collection<V> d(Object obj) {
        return (Collection) a().get(obj);
    }

    public Iterator<V> e(Object obj) {
        return !containsKey(obj) ? org.apache.commons.collections4.iterators.l.b() : new d(obj);
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, Object>> entrySet() {
        return super.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean i(K k10, Collection<V> collection) {
        if (collection == 0 || collection.size() == 0) {
            return false;
        }
        Collection<V> collectionD = d(k10);
        if (collectionD != null) {
            return collectionD.addAll(collection);
        }
        Collection<V> collectionC = c(collection.size());
        collectionC.addAll(collection);
        if (collectionC.size() <= 0) {
            return false;
        }
        a().put(k10, collectionC);
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new a(new ArrayList(keySet()).iterator());
    }

    public int j(Object obj) {
        Collection<V> collectionD = d(obj);
        if (collectionD == null) {
            return 0;
        }
        return collectionD.size();
    }

    public int k() {
        Iterator<V> it = a().values().iterator();
        int iG0 = 0;
        while (it.hasNext()) {
            iG0 += org.apache.commons.collections4.j.g0(it.next());
        }
        return iG0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public Object put(K k10, Object obj) {
        boolean zAdd;
        Collection<V> collectionD = d(k10);
        if (collectionD == null) {
            zAdd = true;
            Collection<V> collectionC = c(1);
            collectionC.add(obj);
            if (collectionC.size() > 0) {
                a().put(k10, collectionC);
            } else {
                zAdd = false;
            }
        } else {
            zAdd = collectionD.add(obj);
        }
        if (zAdd) {
            return obj;
        }
        return null;
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ?> map) {
        if (map instanceof org.apache.commons.collections4.c0) {
            for (Map.Entry<K, Object> entry : ((org.apache.commons.collections4.c0) map).entrySet()) {
                i(entry.getKey(), (Collection) entry.getValue());
            }
        } else {
            for (Map.Entry<? extends K, ?> entry2 : map.entrySet()) {
                put(entry2.getKey(), entry2.getValue());
            }
        }
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Collection<Object> values() {
        Collection<V> collection = this.f336126c;
        if (collection != null) {
            return collection;
        }
        c cVar = new c(this, null);
        this.f336126c = cVar;
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected <C extends Collection<V>> w(Map<K, ? super C> map, org.apache.commons.collections4.n<C> nVar) {
        super(map);
        if (nVar == 0) {
            throw new IllegalArgumentException("The factory must not be null");
        }
        this.f336125b = nVar;
    }
}
