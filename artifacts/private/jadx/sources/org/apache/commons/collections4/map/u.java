package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.collections4.k0;
import org.apache.commons.collections4.p0;

/* JADX INFO: loaded from: classes14.dex */
public class u<K, V> extends org.apache.commons.collections4.map.e<K, V> implements org.apache.commons.collections4.j0<K, V>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336107c = 2728177751851003750L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<K> f336108b;

    static class a<K, V> extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u<K, V> f336109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<K> f336110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set<Map.Entry<K, V>> f336111c;

        public a(u<K, V> uVar, List<K> list) {
            this.f336109a = uVar;
            this.f336110b = list;
        }

        private Set<Map.Entry<K, V>> c() {
            if (this.f336111c == null) {
                this.f336111c = this.f336109a.a().entrySet();
            }
            return this.f336111c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f336109a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return c().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return c().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return c().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return c().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f336109a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c(this.f336109a, this.f336110b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry) || !c().contains(obj)) {
                return false;
            }
            this.f336109a.remove(((Map.Entry) obj).getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f336109a.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return c().toString();
        }
    }

    static class b<K> extends AbstractSet<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u<K, Object> f336112a;

        class a extends org.apache.commons.collections4.iterators.g<Map.Entry<K, Object>, K> {
            a(Iterator it) {
                super(it);
            }

            @Override // java.util.Iterator
            public K next() {
                return b().next().getKey();
            }
        }

        b(u<K, ?> uVar) {
            this.f336112a = uVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f336112a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f336112a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this.f336112a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f336112a.size();
        }
    }

    static class c<K, V> extends org.apache.commons.collections4.iterators.g<K, Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u<K, V> f336114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private K f336115c;

        c(u<K, V> uVar, List<K> list) {
            super(list.iterator());
            this.f336115c = null;
            this.f336114b = uVar;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            K next = b().next();
            this.f336115c = next;
            return new d(this.f336114b, next);
        }

        @Override // org.apache.commons.collections4.iterators.g, java.util.Iterator
        public void remove() {
            super.remove();
            this.f336114b.a().remove(this.f336115c);
        }
    }

    static class d<K, V> extends org.apache.commons.collections4.keyvalue.b<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final u<K, V> f336116c;

        d(u<K, V> uVar, K k10) {
            super(k10, null);
            this.f336116c = uVar;
        }

        @Override // org.apache.commons.collections4.keyvalue.a, org.apache.commons.collections4.x
        public V getValue() {
            return this.f336116c.get(getKey());
        }

        @Override // org.apache.commons.collections4.keyvalue.b, org.apache.commons.collections4.keyvalue.a, java.util.Map.Entry
        public V setValue(V v10) {
            return this.f336116c.a().put(getKey(), v10);
        }
    }

    static class e<K, V> implements k0<K, V>, p0<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u<K, V> f336117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListIterator<K> f336118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private K f336119c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f336120d = false;

        e(u<K, V> uVar) {
            this.f336117a = uVar;
            this.f336118b = ((u) uVar).f336108b.listIterator();
        }

        @Override // org.apache.commons.collections4.a0
        public K getKey() {
            if (this.f336120d) {
                return this.f336119c;
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0
        public V getValue() {
            if (this.f336120d) {
                return this.f336117a.get(this.f336119c);
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public boolean hasNext() {
            return this.f336118b.hasNext();
        }

        @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
        public boolean hasPrevious() {
            return this.f336118b.hasPrevious();
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public K next() {
            K next = this.f336118b.next();
            this.f336119c = next;
            this.f336120d = true;
            return next;
        }

        @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
        public K previous() {
            K kPrevious = this.f336118b.previous();
            this.f336119c = kPrevious;
            this.f336120d = true;
            return kPrevious;
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public void remove() {
            if (!this.f336120d) {
                throw new IllegalStateException("remove() can only be called once after next()");
            }
            this.f336118b.remove();
            this.f336117a.f336038a.remove(this.f336119c);
            this.f336120d = false;
        }

        @Override // org.apache.commons.collections4.p0
        public void reset() {
            this.f336118b = ((u) this.f336117a).f336108b.listIterator();
            this.f336119c = null;
            this.f336120d = false;
        }

        @Override // org.apache.commons.collections4.a0
        public V setValue(V v10) {
            if (this.f336120d) {
                return this.f336117a.f336038a.put(this.f336119c, v10);
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }

        public String toString() {
            if (!this.f336120d) {
                return "Iterator[]";
            }
            return "Iterator[" + getKey() + "=" + getValue() + "]";
        }
    }

    static class f<V> extends AbstractList<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u<Object, V> f336121a;

        class a extends org.apache.commons.collections4.iterators.g<Map.Entry<Object, V>, V> {
            a(Iterator it) {
                super(it);
            }

            @Override // java.util.Iterator
            public V next() {
                return b().next().getValue();
            }
        }

        f(u<?, V> uVar) {
            this.f336121a = uVar;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f336121a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f336121a.containsValue(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public V get(int i10) {
            return this.f336121a.e(i10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<V> iterator() {
            return new a(this.f336121a.entrySet().iterator());
        }

        @Override // java.util.AbstractList, java.util.List
        public V remove(int i10) {
            return this.f336121a.k(i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public V set(int i10, V v10) {
            return this.f336121a.l(i10, v10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f336121a.size();
        }
    }

    public u() {
        this(new HashMap());
    }

    public static <K, V> u<K, V> h(Map<K, V> map) {
        return new u<>(map);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f336038a = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f336038a);
    }

    @Override // org.apache.commons.collections4.j0
    public K C3(Object obj) {
        int iIndexOf = this.f336108b.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= size() - 1) {
            return null;
        }
        return this.f336108b.get(iIndexOf + 1);
    }

    @Override // org.apache.commons.collections4.j0
    public K E2(Object obj) {
        int iIndexOf = this.f336108b.indexOf(obj);
        if (iIndexOf > 0) {
            return this.f336108b.get(iIndexOf - 1);
        }
        return null;
    }

    public List<K> c() {
        return g();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        a().clear();
        this.f336108b.clear();
    }

    public K d(int i10) {
        return this.f336108b.get(i10);
    }

    public V e(int i10) {
        return get(this.f336108b.get(i10));
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        return new a(this, this.f336108b);
    }

    public int f(Object obj) {
        return this.f336108b.indexOf(obj);
    }

    @Override // org.apache.commons.collections4.j0
    public K firstKey() {
        if (size() != 0) {
            return this.f336108b.get(0);
        }
        throw new NoSuchElementException("Map is empty");
    }

    public List<K> g() {
        return org.apache.commons.collections4.list.m.k(this.f336108b);
    }

    public V i(int i10, K k10, V v10) {
        if (i10 < 0 || i10 > this.f336108b.size()) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f336108b.size());
        }
        Map<K, V> mapA = a();
        if (!mapA.containsKey(k10)) {
            this.f336108b.add(i10, k10);
            mapA.put(k10, v10);
            return null;
        }
        V vRemove = mapA.remove(k10);
        int iIndexOf = this.f336108b.indexOf(k10);
        this.f336108b.remove(iIndexOf);
        if (iIndexOf < i10) {
            i10--;
        }
        this.f336108b.add(i10, k10);
        mapA.put(k10, v10);
        return vRemove;
    }

    public void j(int i10, Map<? extends K, ? extends V> map) {
        if (i10 < 0 || i10 > this.f336108b.size()) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f336108b.size());
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            boolean zContainsKey = containsKey(entry.getKey());
            i(i10, entry.getKey(), entry.getValue());
            if (zContainsKey) {
                i10 = f(entry.getKey());
            }
            i10++;
        }
    }

    public V k(int i10) {
        return remove(d(i10));
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        return new b(this);
    }

    public V l(int i10, V v10) {
        return put(this.f336108b.get(i10), v10);
    }

    @Override // org.apache.commons.collections4.j0
    public K lastKey() {
        if (size() != 0) {
            return this.f336108b.get(size() - 1);
        }
        throw new NoSuchElementException("Map is empty");
    }

    public List<V> n() {
        return new f(this);
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        if (a().containsKey(k10)) {
            return a().put(k10, v10);
        }
        V vPut = a().put(k10, v10);
        this.f336108b.add(k10);
        return vPut;
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        if (!a().containsKey(obj)) {
            return null;
        }
        V vRemove = a().remove(obj);
        this.f336108b.remove(obj);
        return vRemove;
    }

    @Override // org.apache.commons.collections4.map.e
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z10 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            if (key == this) {
                key = "(this Map)";
            }
            sb2.append(key);
            sb2.append('=');
            if (value == this) {
                value = "(this Map)";
            }
            sb2.append(value);
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Collection<V> values() {
        return new f(this);
    }

    protected u(Map<K, V> map) {
        super(map);
        ArrayList arrayList = new ArrayList();
        this.f336108b = arrayList;
        arrayList.addAll(a().keySet());
    }

    @Override // org.apache.commons.collections4.map.c, org.apache.commons.collections4.s
    public k0<K, V> T() {
        return new e(this);
    }
}
