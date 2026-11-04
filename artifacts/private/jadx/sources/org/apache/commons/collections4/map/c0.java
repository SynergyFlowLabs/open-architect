package org.apache.commons.collections4.map;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.collections4.k0;
import org.apache.commons.collections4.p0;

/* JADX INFO: loaded from: classes14.dex */
public class c0<K, V> implements org.apache.commons.collections4.j0<K, V>, org.apache.commons.collections4.g<K, V>, org.apache.commons.collections4.x<K, V>, Serializable, Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336007c = -8931271118676803261L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f336008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V f336009b;

    static class a<K, V> implements k0<K, V>, p0<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0<K, V> f336010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f336011b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f336012c = false;

        a(c0<K, V> c0Var) {
            this.f336010a = c0Var;
        }

        @Override // org.apache.commons.collections4.a0
        public K getKey() {
            if (this.f336012c) {
                return this.f336010a.getKey();
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0
        public V getValue() {
            if (this.f336012c) {
                return this.f336010a.getValue();
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public boolean hasNext() {
            return this.f336011b;
        }

        @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
        public boolean hasPrevious() {
            return !this.f336011b;
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public K next() {
            if (!this.f336011b) {
                throw new NoSuchElementException("No next() entry in the iteration");
            }
            this.f336011b = false;
            this.f336012c = true;
            return this.f336010a.getKey();
        }

        @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
        public K previous() {
            if (this.f336011b) {
                throw new NoSuchElementException("No previous() entry in the iteration");
            }
            this.f336011b = true;
            return this.f336010a.getKey();
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // org.apache.commons.collections4.p0
        public void reset() {
            this.f336011b = true;
        }

        @Override // org.apache.commons.collections4.a0
        public V setValue(V v10) {
            if (this.f336012c) {
                return this.f336010a.d(v10);
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }

        public String toString() {
            if (this.f336011b) {
                return "Iterator[]";
            }
            return "Iterator[" + getKey() + "=" + getValue() + "]";
        }
    }

    static class b<V> extends AbstractSet<V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f336013b = -3689524741863047872L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0<?, V> f336014a;

        b(c0<?, V> c0Var) {
            this.f336014a = c0Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f336014a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new org.apache.commons.collections4.iterators.j0(this.f336014a.getValue(), false);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1;
        }
    }

    public c0() {
        this.f336008a = null;
    }

    @Override // org.apache.commons.collections4.j0
    public K C3(K k10) {
        return null;
    }

    @Override // org.apache.commons.collections4.j0
    public K E2(K k10) {
        return null;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c0<K, V> clone() {
        try {
            return (c0) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    protected boolean b(Object obj) {
        K key = getKey();
        if (obj == null) {
            return key == null;
        }
        return obj.equals(key);
    }

    protected boolean c(Object obj) {
        V value = getValue();
        if (obj == null) {
            return value == null;
        }
        return obj.equals(value);
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsKey(Object obj) {
        return b(obj);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsValue(Object obj) {
        return c(obj);
    }

    public V d(V v10) {
        V v11 = this.f336009b;
        this.f336009b = v10;
        return v11;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        return Collections.singleton(new org.apache.commons.collections4.keyvalue.g(this, getKey()));
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != 1) {
            return false;
        }
        Map.Entry<K, V> next = map.entrySet().iterator().next();
        return b(next.getKey()) && c(next.getValue());
    }

    @Override // org.apache.commons.collections4.j0
    public K firstKey() {
        return getKey();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public V get(Object obj) {
        if (b(obj)) {
            return this.f336009b;
        }
        return null;
    }

    @Override // org.apache.commons.collections4.x
    public K getKey() {
        return this.f336008a;
    }

    @Override // org.apache.commons.collections4.x
    public V getValue() {
        return this.f336009b;
    }

    @Override // java.util.Map
    public int hashCode() {
        return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean isEmpty() {
        return false;
    }

    @Override // org.apache.commons.collections4.g
    public boolean isFull() {
        return true;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        return Collections.singleton(this.f336008a);
    }

    @Override // org.apache.commons.collections4.j0
    public K lastKey() {
        return getKey();
    }

    @Override // org.apache.commons.collections4.g
    public int o0() {
        return 1;
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        if (b(k10)) {
            return d(v10);
        }
        throw new IllegalArgumentException("Cannot put new key/value pair - Map is fixed size singleton");
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                throw new IllegalArgumentException("The map size must be 0 or 1");
            }
            Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
            put(next.getKey(), next.getValue());
        }
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public int size() {
        return 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        sb2.append(getKey() == this ? "(this Map)" : getKey());
        sb2.append('=');
        sb2.append(getValue() != this ? getValue() : "(this Map)");
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Collection<V> values() {
        return new b(this);
    }

    @Override // org.apache.commons.collections4.s
    public k0<K, V> T() {
        return new a(this);
    }

    public c0(K k10, V v10) {
        this.f336008a = k10;
        this.f336009b = v10;
    }

    public c0(org.apache.commons.collections4.x<K, V> xVar) {
        this.f336008a = xVar.getKey();
        this.f336009b = xVar.getValue();
    }

    public c0(Map.Entry<? extends K, ? extends V> entry) {
        this.f336008a = entry.getKey();
        this.f336009b = entry.getValue();
    }

    public c0(Map<? extends K, ? extends V> map) {
        if (map.size() == 1) {
            Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
            this.f336008a = next.getKey();
            this.f336009b = next.getValue();
            return;
        }
        throw new IllegalArgumentException("The map size must be 1");
    }
}
