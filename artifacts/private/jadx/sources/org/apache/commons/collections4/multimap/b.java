package org.apache.commons.collections4.multimap;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.a0;
import org.apache.commons.collections4.e0;
import org.apache.commons.collections4.g0;
import org.apache.commons.collections4.iterators.m0;
import org.apache.commons.collections4.iterators.n;
import org.apache.commons.collections4.iterators.u;
import org.apache.commons.collections4.iterators.x;
import org.apache.commons.collections4.j;
import org.apache.commons.collections4.w;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b<K, V> implements g0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Collection<V> f336154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient b<K, V>.c f336155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient e0<K> f336156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient b<K, V>.C2394b f336157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient Map<K, Collection<V>> f336158e;

    /* JADX INFO: renamed from: org.apache.commons.collections4.multimap.b$b, reason: collision with other inner class name */
    private class C2394b extends AbstractMap<K, Collection<V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final transient Map<K, Collection<V>> f336159a;

        /* JADX INFO: renamed from: org.apache.commons.collections4.multimap.b$b$a */
        class a extends AbstractSet<Map.Entry<K, Collection<V>>> {
            a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                C2394b.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return C2394b.this.f336159a.entrySet().contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                C2394b c2394b = C2394b.this;
                return c2394b.new C2395b(c2394b.f336159a.entrySet().iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (contains(obj)) {
                    b.this.remove(((Map.Entry) obj).getKey());
                    return true;
                }
                boolean z10 = false;
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return C2394b.this.size();
            }
        }

        /* JADX INFO: renamed from: org.apache.commons.collections4.multimap.b$b$b, reason: collision with other inner class name */
        class C2395b extends org.apache.commons.collections4.iterators.c<Map.Entry<K, Collection<V>>> {
            C2395b(Iterator<Map.Entry<K, Collection<V>>> it) {
                super(it);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // org.apache.commons.collections4.iterators.c, java.util.Iterator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Object key = ((Map.Entry) super.next()).getKey();
                return new org.apache.commons.collections4.keyvalue.h(key, b.this.i(key));
            }
        }

        C2394b(Map<K, Collection<V>> map) {
            this.f336159a = map;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            if (this.f336159a.get(obj) == null) {
                return null;
            }
            return b.this.i(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f336159a.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionD = b.this.d();
            collectionD.addAll(collectionRemove);
            collectionRemove.clear();
            return collectionD;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            b.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f336159a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            if (this != obj && !this.f336159a.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f336159a.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return b.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f336159a.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f336159a.toString();
        }
    }

    private class c extends AbstractCollection<Map.Entry<K, V>> {

        class a extends x<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final Collection<K> f336164e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final Iterator<K> f336165f;

            /* JADX INFO: renamed from: org.apache.commons.collections4.multimap.b$c$a$a, reason: collision with other inner class name */
            class C2396a implements w0<V, Map.Entry<K, V>> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Object f336167a;

                C2396a(Object obj) {
                    this.f336167a = obj;
                }

                @Override // org.apache.commons.collections4.w0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> a(V v10) {
                    return new e(this.f336167a, v10);
                }
            }

            a() {
                ArrayList arrayList = new ArrayList(b.this.g().keySet());
                this.f336164e = arrayList;
                this.f336165f = arrayList.iterator();
            }

            @Override // org.apache.commons.collections4.iterators.x
            protected Iterator<? extends Map.Entry<K, V>> b(int i10) {
                if (!this.f336165f.hasNext()) {
                    return null;
                }
                K next = this.f336165f.next();
                return new m0(new h(next), new C2396a(next));
            }
        }

        private c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return b.this.size();
        }
    }

    private class d extends org.apache.commons.collections4.multiset.b<K> {

        private final class a implements w0<Map.Entry<K, Collection<V>>, e0.a<K>> {

            /* JADX INFO: renamed from: org.apache.commons.collections4.multimap.b$d$a$a, reason: collision with other inner class name */
            class C2397a extends org.apache.commons.collections4.multiset.b.AbstractC2399b<K> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Map.Entry f336171a;

                C2397a(Map.Entry entry) {
                    this.f336171a = entry;
                }

                @Override // org.apache.commons.collections4.e0.a
                public K X0() {
                    return (K) this.f336171a.getKey();
                }

                @Override // org.apache.commons.collections4.e0.a
                public int getCount() {
                    return ((Collection) this.f336171a.getValue()).size();
                }
            }

            private a() {
            }

            @Override // org.apache.commons.collections4.w0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e0.a<K> a(Map.Entry<K, Collection<V>> entry) {
                return new C2397a(entry);
            }
        }

        private d() {
        }

        @Override // org.apache.commons.collections4.multiset.b, org.apache.commons.collections4.e0
        public int U0(Object obj) {
            Collection<V> collection = b.this.g().get(obj);
            if (collection != null) {
                return collection.size();
            }
            return 0;
        }

        @Override // org.apache.commons.collections4.multiset.b, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return b.this.g().containsKey(obj);
        }

        @Override // org.apache.commons.collections4.multiset.b
        protected Iterator<e0.a<K>> i() {
            return w.k0(b.this.f336158e.entrySet().iterator(), new a());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return b.this.g().isEmpty();
        }

        @Override // org.apache.commons.collections4.multiset.b
        protected int p() {
            return b.this.g().size();
        }

        @Override // org.apache.commons.collections4.multiset.b, java.util.AbstractCollection, java.util.Collection, org.apache.commons.collections4.e0
        public int size() {
            return b.this.size();
        }
    }

    private class e extends org.apache.commons.collections4.keyvalue.b<K, V> {
        public e(K k10, V v10) {
            super(k10, v10);
        }

        @Override // org.apache.commons.collections4.keyvalue.b, org.apache.commons.collections4.keyvalue.a, java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException();
        }
    }

    private class f implements a0<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<Map.Entry<K, V>> f336174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map.Entry<K, V> f336175b = null;

        public f() {
            this.f336174a = b.this.k().iterator();
        }

        @Override // org.apache.commons.collections4.a0
        public K getKey() {
            Map.Entry<K, V> entry = this.f336175b;
            if (entry != null) {
                return entry.getKey();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.commons.collections4.a0
        public V getValue() {
            Map.Entry<K, V> entry = this.f336175b;
            if (entry != null) {
                return entry.getValue();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public boolean hasNext() {
            return this.f336174a.hasNext();
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public K next() {
            Map.Entry<K, V> next = this.f336174a.next();
            this.f336175b = next;
            return next.getKey();
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public void remove() {
            this.f336174a.remove();
        }

        @Override // org.apache.commons.collections4.a0
        public V setValue(V v10) {
            Map.Entry<K, V> entry = this.f336175b;
            if (entry != null) {
                return entry.setValue(v10);
            }
            throw new IllegalStateException();
        }
    }

    private class g extends AbstractCollection<V> {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            b.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            u uVar = new u();
            Iterator<K> it = b.this.keySet().iterator();
            while (it.hasNext()) {
                uVar.b(new h(it.next()));
            }
            return uVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return b.this.size();
        }
    }

    private class h implements Iterator<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f336178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Collection<V> f336179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Iterator<V> f336180c;

        public h(Object obj) {
            this.f336178a = obj;
            Collection<V> collection = b.this.g().get(obj);
            this.f336179b = collection;
            this.f336180c = collection.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f336180c.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.f336180c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f336180c.remove();
            if (this.f336179b.isEmpty()) {
                b.this.remove(this.f336178a);
            }
        }
    }

    protected b() {
    }

    @Override // org.apache.commons.collections4.g0
    public boolean O0(Object obj, Object obj2) {
        Collection<V> collection = g().get(obj);
        if (collection == null) {
            return false;
        }
        boolean zRemove = collection.remove(obj2);
        if (collection.isEmpty()) {
            g().remove(obj);
        }
        return zRemove;
    }

    @Override // org.apache.commons.collections4.g0
    public a0<K, V> T() {
        return size() == 0 ? n.b() : new f();
    }

    @Override // org.apache.commons.collections4.g0
    public boolean a(Object obj, Object obj2) {
        Collection<V> collection = g().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // org.apache.commons.collections4.g0
    public boolean b(g0<? extends K, ? extends V> g0Var) {
        if (g0Var == null) {
            throw new NullPointerException("Map must not be null.");
        }
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : g0Var.k()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }

    @Override // org.apache.commons.collections4.g0
    public void clear() {
        g().clear();
    }

    @Override // org.apache.commons.collections4.g0
    public boolean containsKey(Object obj) {
        return g().containsKey(obj);
    }

    @Override // org.apache.commons.collections4.g0
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    protected abstract Collection<V> d();

    /* JADX WARN: Multi-variable type inference failed */
    protected void e(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int i10 = objectInputStream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            Collection collection = get(objectInputStream.readObject());
            int i12 = objectInputStream.readInt();
            for (int i13 = 0; i13 < i12; i13++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            return l().equals(((g0) obj).l());
        }
        return false;
    }

    protected void f(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f336158e.size());
        for (Map.Entry<K, Collection<V>> entry : this.f336158e.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    protected Map<K, ? extends Collection<V>> g() {
        return this.f336158e;
    }

    @Override // org.apache.commons.collections4.g0
    public Collection<V> get(K k10) {
        return i(k10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void h(Map<K, ? extends Collection<V>> map) {
        this.f336158e = map;
    }

    public int hashCode() {
        return g().hashCode();
    }

    Collection<V> i(K k10) {
        return new i(k10);
    }

    @Override // org.apache.commons.collections4.g0
    public boolean isEmpty() {
        return g().isEmpty();
    }

    @Override // org.apache.commons.collections4.g0
    public Collection<Map.Entry<K, V>> k() {
        b<K, V>.c cVar = this.f336155b;
        if (cVar != null) {
            return cVar;
        }
        b<K, V>.c cVar2 = new c();
        this.f336155b = cVar2;
        return cVar2;
    }

    @Override // org.apache.commons.collections4.g0
    public Set<K> keySet() {
        return g().keySet();
    }

    @Override // org.apache.commons.collections4.g0
    public e0<K> keys() {
        if (this.f336156c == null) {
            this.f336156c = org.apache.commons.collections4.multiset.g.k(new d());
        }
        return this.f336156c;
    }

    @Override // org.apache.commons.collections4.g0
    public Map<K, Collection<V>> l() {
        b<K, V>.C2394b c2394b = this.f336157d;
        if (c2394b != null) {
            return c2394b;
        }
        b<K, V>.C2394b c2394b2 = new C2394b(this.f336158e);
        this.f336157d = c2394b2;
        return c2394b2;
    }

    @Override // org.apache.commons.collections4.g0
    public boolean put(K k10, V v10) {
        Collection<V> collection = g().get(k10);
        if (collection != null) {
            return collection.add(v10);
        }
        Collection<V> collectionD = d();
        if (!collectionD.add(v10)) {
            return false;
        }
        this.f336158e.put(k10, collectionD);
        boolean z10 = true & true;
        return true;
    }

    @Override // org.apache.commons.collections4.g0
    public boolean putAll(Map<? extends K, ? extends V> map) {
        if (map == null) {
            throw new NullPointerException("Map must not be null.");
        }
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }

    @Override // org.apache.commons.collections4.g0
    public Collection<V> remove(Object obj) {
        return j.v(g().remove(obj));
    }

    @Override // org.apache.commons.collections4.g0
    public int size() {
        Iterator<? extends Collection<V>> it = g().values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public String toString() {
        return g().toString();
    }

    @Override // org.apache.commons.collections4.g0
    public boolean v(K k10, Iterable<? extends V> iterable) {
        if (iterable == null) {
            throw new NullPointerException("Values must not be null.");
        }
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && get(k10).addAll(collection);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && j.c(get(k10), it);
    }

    @Override // org.apache.commons.collections4.g0
    public Collection<V> values() {
        Collection<V> collection = this.f336154a;
        if (collection != null) {
            return collection;
        }
        g gVar = new g();
        this.f336154a = gVar;
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected b(Map<K, ? extends Collection<V>> map) {
        if (map == 0) {
            throw new NullPointerException("Map must not be null.");
        }
        this.f336158e = map;
    }

    class i implements Collection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final K f336182a;

        public i(K k10) {
            this.f336182a = k10;
        }

        @Override // java.util.Collection
        public boolean add(V v10) {
            Collection<V> collectionC = c();
            if (collectionC == null) {
                collectionC = b.this.d();
                b.this.f336158e.put(this.f336182a, collectionC);
            }
            return collectionC.add(v10);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            Collection<V> collectionC = c();
            if (collectionC == null) {
                collectionC = b.this.d();
                b.this.f336158e.put(this.f336182a, collectionC);
            }
            return collectionC.addAll(collection);
        }

        protected Collection<V> c() {
            return b.this.g().get(this.f336182a);
        }

        @Override // java.util.Collection
        public void clear() {
            Collection<V> collectionC = c();
            if (collectionC != null) {
                collectionC.clear();
                b.this.remove(this.f336182a);
            }
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            Collection<V> collectionC = c();
            if (collectionC == null) {
                return false;
            }
            return collectionC.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Collection<V> collectionC = c();
            if (collectionC == null) {
                return false;
            }
            return collectionC.containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            Collection<V> collectionC = c();
            if (collectionC == null) {
                return true;
            }
            return collectionC.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return c() == null ? w.f336409a : new h(this.f336182a);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            Collection<V> collectionC = c();
            if (collectionC == null) {
                return false;
            }
            boolean zRemove = collectionC.remove(obj);
            if (collectionC.isEmpty()) {
                b.this.remove(this.f336182a);
            }
            return zRemove;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Collection<V> collectionC = c();
            if (collectionC == null) {
                return false;
            }
            boolean zRemoveAll = collectionC.removeAll(collection);
            if (collectionC.isEmpty()) {
                b.this.remove(this.f336182a);
            }
            return zRemoveAll;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Collection<V> collectionC = c();
            if (collectionC == null) {
                return false;
            }
            boolean zRetainAll = collectionC.retainAll(collection);
            if (collectionC.isEmpty()) {
                b.this.remove(this.f336182a);
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public int size() {
            Collection<V> collectionC = c();
            if (collectionC == null) {
                return 0;
            }
            return collectionC.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            Collection<V> collectionC = c();
            return collectionC == null ? j.f335887a.toArray() : collectionC.toArray();
        }

        public String toString() {
            Collection<V> collectionC = c();
            return collectionC == null ? j.f335887a.toString() : collectionC.toString();
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            Collection<V> collectionC = c();
            if (collectionC == null) {
                return (T[]) j.f335887a.toArray(tArr);
            }
            return (T[]) collectionC.toArray(tArr);
        }
    }
}
