package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.collections4.p0;

/* JADX INFO: loaded from: classes14.dex */
public class o<K, V> implements org.apache.commons.collections4.t<K, V>, Serializable, Cloneable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f336077l = -6701087419741928296L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient int f336078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f336079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f336080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient int f336081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient K f336082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient K f336083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient K f336084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient V f336085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient V f336086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient V f336087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient org.apache.commons.collections4.map.a<K, V> f336088k;

    static abstract class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o<K, V> f336089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f336090b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d<K, V> f336091c = null;

        public a(o<K, V> oVar) {
            this.f336089a = oVar;
        }

        public Map.Entry<K, V> b() {
            if (!hasNext()) {
                throw new NoSuchElementException("No next() entry in the iteration");
            }
            o<K, V> oVar = this.f336089a;
            int i10 = this.f336090b + 1;
            this.f336090b = i10;
            d<K, V> dVar = new d<>(oVar, i10);
            this.f336091c = dVar;
            return dVar;
        }

        public boolean hasNext() {
            return this.f336090b < ((o) this.f336089a).f336078a;
        }

        public void remove() {
            d<K, V> dVar = this.f336091c;
            if (dVar == null) {
                throw new IllegalStateException("remove() can only be called once after next()");
            }
            dVar.a(true);
            this.f336089a.remove(this.f336091c.getKey());
            this.f336090b--;
            this.f336091c = null;
        }
    }

    static class b<K, V> extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o<K, V> f336092a;

        b(o<K, V> oVar) {
            this.f336092a = oVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f336092a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            if (((o) this.f336092a).f336088k != null) {
                return ((o) this.f336092a).f336088k.entrySet().iterator();
            }
            return this.f336092a.size() == 0 ? org.apache.commons.collections4.iterators.l.b() : new c(this.f336092a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Object key = ((Map.Entry) obj).getKey();
            boolean zContainsKey = this.f336092a.containsKey(key);
            this.f336092a.remove(key);
            return zContainsKey;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f336092a.size();
        }
    }

    static class c<K, V> extends a<K, V> implements Iterator<Map.Entry<K, V>> {
        c(o<K, V> oVar) {
            super(oVar);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return b();
        }
    }

    static class d<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o<K, V> f336093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f336094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f336095c = false;

        public d(o<K, V> oVar, int i10) {
            this.f336093a = oVar;
            this.f336094b = i10;
        }

        void a(boolean z10) {
            this.f336095c = z10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f336095c || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K key = getKey();
            V value = getValue();
            if (key != null ? key.equals(entry.getKey()) : entry.getKey() == null) {
                if (value == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (value.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f336095c) {
                throw new IllegalStateException("getKey() can only be called after next() and before remove()");
            }
            int i10 = this.f336094b;
            if (i10 == 1) {
                return (K) ((o) this.f336093a).f336082e;
            }
            if (i10 == 2) {
                return (K) ((o) this.f336093a).f336083f;
            }
            if (i10 == 3) {
                return (K) ((o) this.f336093a).f336084g;
            }
            throw new IllegalStateException("Invalid map index: " + this.f336094b);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f336095c) {
                throw new IllegalStateException("getValue() can only be called after next() and before remove()");
            }
            int i10 = this.f336094b;
            if (i10 == 1) {
                return (V) ((o) this.f336093a).f336085h;
            }
            if (i10 == 2) {
                return (V) ((o) this.f336093a).f336086i;
            }
            if (i10 == 3) {
                return (V) ((o) this.f336093a).f336087j;
            }
            throw new IllegalStateException("Invalid map index: " + this.f336094b);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f336095c) {
                return 0;
            }
            K key = getKey();
            V value = getValue();
            return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (this.f336095c) {
                throw new IllegalStateException("setValue() can only be called after next() and before remove()");
            }
            V value = getValue();
            int i10 = this.f336094b;
            if (i10 == 1) {
                ((o) this.f336093a).f336085h = v10;
                return value;
            }
            if (i10 == 2) {
                ((o) this.f336093a).f336086i = v10;
                return value;
            }
            if (i10 == 3) {
                ((o) this.f336093a).f336087j = v10;
                return value;
            }
            throw new IllegalStateException("Invalid map index: " + this.f336094b);
        }

        public String toString() {
            if (this.f336095c) {
                return "";
            }
            return getKey() + "=" + getValue();
        }
    }

    static class e<K, V> implements org.apache.commons.collections4.a0<K, V>, p0<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o<K, V> f336096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f336097b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f336098c = false;

        e(o<K, V> oVar) {
            this.f336096a = oVar;
        }

        @Override // org.apache.commons.collections4.a0
        public K getKey() {
            if (!this.f336098c) {
                throw new IllegalStateException("getKey() can only be called after next() and before remove()");
            }
            int i10 = this.f336097b;
            if (i10 == 1) {
                return (K) ((o) this.f336096a).f336082e;
            }
            if (i10 == 2) {
                return (K) ((o) this.f336096a).f336083f;
            }
            if (i10 == 3) {
                return (K) ((o) this.f336096a).f336084g;
            }
            throw new IllegalStateException("Invalid map index: " + this.f336097b);
        }

        @Override // org.apache.commons.collections4.a0
        public V getValue() {
            if (!this.f336098c) {
                throw new IllegalStateException("getValue() can only be called after next() and before remove()");
            }
            int i10 = this.f336097b;
            if (i10 == 1) {
                return (V) ((o) this.f336096a).f336085h;
            }
            if (i10 == 2) {
                return (V) ((o) this.f336096a).f336086i;
            }
            if (i10 == 3) {
                return (V) ((o) this.f336096a).f336087j;
            }
            throw new IllegalStateException("Invalid map index: " + this.f336097b);
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public boolean hasNext() {
            return this.f336097b < ((o) this.f336096a).f336078a;
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public K next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No next() entry in the iteration");
            }
            this.f336098c = true;
            this.f336097b++;
            return getKey();
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public void remove() {
            if (!this.f336098c) {
                throw new IllegalStateException("remove() can only be called once after next()");
            }
            this.f336096a.remove(getKey());
            this.f336097b--;
            this.f336098c = false;
        }

        @Override // org.apache.commons.collections4.p0
        public void reset() {
            this.f336097b = 0;
            this.f336098c = false;
        }

        @Override // org.apache.commons.collections4.a0
        public V setValue(V v10) {
            if (!this.f336098c) {
                throw new IllegalStateException("setValue() can only be called after next() and before remove()");
            }
            V value = getValue();
            int i10 = this.f336097b;
            if (i10 == 1) {
                ((o) this.f336096a).f336085h = v10;
                return value;
            }
            int i11 = 4 ^ 2;
            if (i10 == 2) {
                ((o) this.f336096a).f336086i = v10;
                return value;
            }
            if (i10 == 3) {
                ((o) this.f336096a).f336087j = v10;
                return value;
            }
            throw new IllegalStateException("Invalid map index: " + this.f336097b);
        }

        public String toString() {
            if (!this.f336098c) {
                return "Iterator[]";
            }
            return "Iterator[" + getKey() + "=" + getValue() + "]";
        }
    }

    static class f<K> extends AbstractSet<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o<K, ?> f336099a;

        f(o<K, ?> oVar) {
            this.f336099a = oVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f336099a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f336099a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            if (((o) this.f336099a).f336088k != null) {
                return ((o) this.f336099a).f336088k.keySet().iterator();
            }
            return this.f336099a.size() == 0 ? org.apache.commons.collections4.iterators.l.b() : new g(this.f336099a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean zContainsKey = this.f336099a.containsKey(obj);
            this.f336099a.remove(obj);
            return zContainsKey;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f336099a.size();
        }
    }

    static class g<K> extends a<K, Object> implements Iterator<K> {
        g(o<K, ?> oVar) {
            super(oVar);
        }

        @Override // java.util.Iterator
        public K next() {
            return b().getKey();
        }
    }

    static class h<V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o<?, V> f336100a;

        h(o<?, V> oVar) {
            this.f336100a = oVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f336100a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f336100a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            if (((o) this.f336100a).f336088k != null) {
                return ((o) this.f336100a).f336088k.values().iterator();
            }
            return this.f336100a.size() == 0 ? org.apache.commons.collections4.iterators.l.b() : new i(this.f336100a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f336100a.size();
        }
    }

    static class i<V> extends a<Object, V> implements Iterator<V> {
        i(o<?, V> oVar) {
            super(oVar);
        }

        @Override // java.util.Iterator
        public V next() {
            return b().getValue();
        }
    }

    public o() {
    }

    private void n() {
        org.apache.commons.collections4.map.a<K, V> aVarO = o();
        this.f336088k = aVarO;
        int i10 = this.f336078a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("Invalid map index: " + this.f336078a);
                    }
                    aVarO.put(this.f336084g, this.f336087j);
                }
                this.f336088k.put(this.f336083f, this.f336086i);
            }
            this.f336088k.put(this.f336082e, this.f336085h);
        }
        this.f336078a = 0;
        this.f336081d = 0;
        this.f336080c = 0;
        this.f336079b = 0;
        this.f336084g = null;
        this.f336083f = null;
        this.f336082e = null;
        this.f336087j = null;
        this.f336086i = null;
        this.f336085h = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 > 3) {
            this.f336088k = o();
        }
        while (i10 > 0) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
            i10--;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        org.apache.commons.collections4.a0<K, V> a0VarT = T();
        while (a0VarT.hasNext()) {
            objectOutputStream.writeObject(a0VarT.next());
            objectOutputStream.writeObject(a0VarT.getValue());
        }
    }

    @Override // org.apache.commons.collections4.s
    public org.apache.commons.collections4.a0<K, V> T() {
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        if (aVar != null) {
            return aVar.T();
        }
        return this.f336078a == 0 ? org.apache.commons.collections4.iterators.n.b() : new e(this);
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        if (aVar != null) {
            aVar.clear();
            this.f336088k = null;
            return;
        }
        this.f336078a = 0;
        this.f336081d = 0;
        this.f336080c = 0;
        this.f336079b = 0;
        this.f336084g = null;
        this.f336083f = null;
        this.f336082e = null;
        this.f336087j = null;
        this.f336086i = null;
        this.f336085h = null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0029 A[RETURN] */
    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsKey(Object obj) {
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        if (aVar != null) {
            return aVar.containsKey(obj);
        }
        if (obj == null) {
            int i10 = this.f336078a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (this.f336084g == null) {
                            return true;
                        }
                    }
                }
                if (this.f336083f == null) {
                    return true;
                }
                if (this.f336082e == null) {
                    return true;
                }
            } else if (this.f336082e == null) {
                return true;
            }
        } else if (this.f336078a > 0) {
            int iHashCode = obj.hashCode();
            int i11 = this.f336078a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        if (this.f336081d == iHashCode && obj.equals(this.f336084g)) {
                            return true;
                        }
                    }
                }
                if (this.f336080c == iHashCode && obj.equals(this.f336083f)) {
                    return true;
                }
                if (this.f336079b == iHashCode) {
                    return true;
                }
            } else if (this.f336079b == iHashCode && obj.equals(this.f336082e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0053 A[RETURN] */
    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsValue(Object obj) {
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        if (aVar != null) {
            return aVar.containsValue(obj);
        }
        if (obj == null) {
            int i10 = this.f336078a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (this.f336087j == null) {
                            return true;
                        }
                    }
                }
                if (this.f336086i == null) {
                    return true;
                }
                if (this.f336085h == null) {
                    return true;
                }
            } else if (this.f336085h == null) {
                return true;
            }
        } else {
            int i11 = this.f336078a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        if (obj.equals(this.f336087j)) {
                            return true;
                        }
                    }
                }
                if (obj.equals(this.f336086i)) {
                    return true;
                }
                if (obj.equals(this.f336085h)) {
                    return true;
                }
            } else if (obj.equals(this.f336085h)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        return aVar != null ? aVar.entrySet() : new b(this);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    @Override // java.util.Map
    public boolean equals(Object obj) {
        V v10;
        if (obj == this) {
            return true;
        }
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        if (aVar != null) {
            return aVar.equals(obj);
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.f336078a != map.size()) {
            return false;
        }
        int i10 = this.f336078a;
        if (i10 > 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (!map.containsKey(this.f336084g)) {
                            return false;
                        }
                        Object obj2 = map.get(this.f336084g);
                        V v11 = this.f336087j;
                        if (v11 != null ? !v11.equals(obj2) : obj2 != null) {
                            return false;
                        }
                    }
                }
                if (!map.containsKey(this.f336083f)) {
                    return false;
                }
                Object obj3 = map.get(this.f336083f);
                V v12 = this.f336086i;
                if (v12 != null ? !v12.equals(obj3) : obj3 != null) {
                    return false;
                }
                if (!map.containsKey(this.f336082e)) {
                    return false;
                }
                Object obj4 = map.get(this.f336082e);
                v10 = this.f336085h;
                return v10 == null ? false : false;
            }
            if (!map.containsKey(this.f336082e)) {
                return false;
            }
            Object obj5 = map.get(this.f336082e);
            v10 = this.f336085h;
            if (v10 == null ? !v10.equals(obj5) : obj5 != null) {
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002f  */
    @Override // java.util.Map, org.apache.commons.collections4.r
    public V get(Object obj) {
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        if (aVar != null) {
            return aVar.get(obj);
        }
        if (obj == null) {
            int i10 = this.f336078a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (this.f336084g == null) {
                            return this.f336087j;
                        }
                    }
                }
                if (this.f336083f == null) {
                    return this.f336086i;
                }
                if (this.f336082e == null) {
                    return this.f336085h;
                }
            } else if (this.f336082e == null) {
                return this.f336085h;
            }
        } else if (this.f336078a > 0) {
            int iHashCode = obj.hashCode();
            int i11 = this.f336078a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        if (this.f336081d == iHashCode && obj.equals(this.f336084g)) {
                            return this.f336087j;
                        }
                    }
                }
                if (this.f336080c == iHashCode && obj.equals(this.f336083f)) {
                    return this.f336086i;
                }
                if (this.f336079b == iHashCode) {
                    return this.f336085h;
                }
            } else if (this.f336079b == iHashCode && obj.equals(this.f336082e)) {
                return this.f336085h;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        if (aVar != null) {
            return aVar.hashCode();
        }
        int i10 = this.f336078a;
        if (i10 == 0) {
            return 0;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                iHashCode2 = 0;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Invalid map index: " + this.f336078a);
                }
                int i11 = this.f336081d;
                V v10 = this.f336087j;
                iHashCode2 = i11 ^ (v10 == null ? 0 : v10.hashCode());
            }
            int i12 = this.f336080c;
            V v11 = this.f336086i;
            iHashCode = iHashCode2 + (i12 ^ (v11 == null ? 0 : v11.hashCode()));
        } else {
            iHashCode = 0;
        }
        int i13 = this.f336079b;
        V v12 = this.f336085h;
        return iHashCode + (i13 ^ (v12 != null ? v12.hashCode() : 0));
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        return aVar != null ? aVar.keySet() : new f(this);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public o<K, V> clone() {
        try {
            o<K, V> oVar = (o) super.clone();
            org.apache.commons.collections4.map.a<K, V> aVar = oVar.f336088k;
            if (aVar != null) {
                oVar.f336088k = aVar.clone();
            }
            return oVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    protected org.apache.commons.collections4.map.a<K, V> o() {
        return new p();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0034  */
    @Override // java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        if (aVar != null) {
            return aVar.put(k10, v10);
        }
        if (k10 == null) {
            int i10 = this.f336078a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (this.f336084g == null) {
                            V v11 = this.f336087j;
                            this.f336087j = v10;
                            return v11;
                        }
                    }
                }
                if (this.f336083f == null) {
                    V v12 = this.f336086i;
                    this.f336086i = v10;
                    return v12;
                }
                if (this.f336082e == null) {
                    V v13 = this.f336085h;
                    this.f336085h = v10;
                    return v13;
                }
            } else if (this.f336082e == null) {
                V v14 = this.f336085h;
                this.f336085h = v10;
                return v14;
            }
        } else if (this.f336078a > 0) {
            int iHashCode = k10.hashCode();
            int i11 = this.f336078a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        if (this.f336081d == iHashCode && k10.equals(this.f336084g)) {
                            V v15 = this.f336087j;
                            this.f336087j = v10;
                            return v15;
                        }
                    }
                }
                if (this.f336080c == iHashCode && k10.equals(this.f336083f)) {
                    V v16 = this.f336086i;
                    this.f336086i = v10;
                    return v16;
                }
                if (this.f336079b == iHashCode) {
                    V v17 = this.f336085h;
                    this.f336085h = v10;
                    return v17;
                }
            } else if (this.f336079b == iHashCode && k10.equals(this.f336082e)) {
                V v18 = this.f336085h;
                this.f336085h = v10;
                return v18;
            }
        }
        int i12 = this.f336078a;
        int iHashCode2 = 0;
        if (i12 == 0) {
            this.f336079b = k10 != null ? k10.hashCode() : 0;
            this.f336082e = k10;
            this.f336085h = v10;
        } else if (i12 == 1) {
            this.f336080c = k10 != null ? k10.hashCode() : 0;
            this.f336083f = k10;
            this.f336086i = v10;
        } else {
            if (i12 != 2) {
                n();
                this.f336088k.put(k10, v10);
                return null;
            }
            if (k10 != null) {
                iHashCode2 = k10.hashCode();
            }
            this.f336081d = iHashCode2;
            this.f336084g = k10;
            this.f336087j = v10;
        }
        this.f336078a++;
        return null;
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return;
        }
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        if (aVar != null) {
            aVar.putAll(map);
            return;
        }
        if (size >= 4) {
            n();
            this.f336088k.putAll(map);
        } else {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        if (aVar != null) {
            return aVar.remove(obj);
        }
        int i10 = this.f336078a;
        if (i10 == 0) {
            return null;
        }
        if (obj == null) {
            if (i10 != 1) {
                if (i10 == 2) {
                    K k10 = this.f336083f;
                    if (k10 == null) {
                        V v10 = this.f336086i;
                        this.f336080c = 0;
                        this.f336083f = null;
                        this.f336086i = null;
                        this.f336078a = 1;
                        return v10;
                    }
                    if (this.f336082e != null) {
                        return null;
                    }
                    V v11 = this.f336085h;
                    this.f336079b = this.f336080c;
                    this.f336082e = k10;
                    this.f336085h = this.f336086i;
                    this.f336080c = 0;
                    this.f336083f = null;
                    this.f336086i = null;
                    this.f336078a = 1;
                    return v11;
                }
                if (i10 == 3) {
                    K k11 = this.f336084g;
                    if (k11 == null) {
                        V v12 = this.f336087j;
                        this.f336081d = 0;
                        this.f336084g = null;
                        this.f336087j = null;
                        this.f336078a = 2;
                        return v12;
                    }
                    if (this.f336083f == null) {
                        V v13 = this.f336086i;
                        this.f336080c = this.f336081d;
                        this.f336083f = k11;
                        this.f336086i = this.f336087j;
                        this.f336081d = 0;
                        this.f336084g = null;
                        this.f336087j = null;
                        this.f336078a = 2;
                        return v13;
                    }
                    if (this.f336082e != null) {
                        return null;
                    }
                    V v14 = this.f336085h;
                    this.f336079b = this.f336081d;
                    this.f336082e = k11;
                    this.f336085h = this.f336087j;
                    this.f336081d = 0;
                    this.f336084g = null;
                    this.f336087j = null;
                    this.f336078a = 2;
                    return v14;
                }
            } else if (this.f336082e == null) {
                V v15 = this.f336085h;
                this.f336079b = 0;
                this.f336082e = null;
                this.f336085h = null;
                this.f336078a = 0;
                return v15;
            }
        } else if (i10 > 0) {
            int iHashCode = obj.hashCode();
            int i11 = this.f336078a;
            if (i11 != 1) {
                if (i11 == 2) {
                    if (this.f336080c == iHashCode && obj.equals(this.f336083f)) {
                        V v16 = this.f336086i;
                        this.f336080c = 0;
                        this.f336083f = null;
                        this.f336086i = null;
                        this.f336078a = 1;
                        return v16;
                    }
                    if (this.f336079b != iHashCode || !obj.equals(this.f336082e)) {
                        return null;
                    }
                    V v17 = this.f336085h;
                    this.f336079b = this.f336080c;
                    this.f336082e = this.f336083f;
                    this.f336085h = this.f336086i;
                    this.f336080c = 0;
                    this.f336083f = null;
                    this.f336086i = null;
                    this.f336078a = 1;
                    return v17;
                }
                if (i11 == 3) {
                    if (this.f336081d == iHashCode && obj.equals(this.f336084g)) {
                        V v18 = this.f336087j;
                        this.f336081d = 0;
                        this.f336084g = null;
                        this.f336087j = null;
                        this.f336078a = 2;
                        return v18;
                    }
                    if (this.f336080c == iHashCode && obj.equals(this.f336083f)) {
                        V v19 = this.f336086i;
                        this.f336080c = this.f336081d;
                        this.f336083f = this.f336084g;
                        this.f336086i = this.f336087j;
                        this.f336081d = 0;
                        this.f336084g = null;
                        this.f336087j = null;
                        this.f336078a = 2;
                        return v19;
                    }
                    if (this.f336079b != iHashCode || !obj.equals(this.f336082e)) {
                        return null;
                    }
                    V v20 = this.f336085h;
                    this.f336079b = this.f336081d;
                    this.f336082e = this.f336084g;
                    this.f336085h = this.f336087j;
                    this.f336081d = 0;
                    this.f336084g = null;
                    this.f336087j = null;
                    this.f336078a = 2;
                    return v20;
                }
            } else if (this.f336079b == iHashCode && obj.equals(this.f336082e)) {
                V v21 = this.f336085h;
                this.f336079b = 0;
                this.f336082e = null;
                this.f336085h = null;
                this.f336078a = 0;
                return v21;
            }
        }
        return null;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public int size() {
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        return aVar != null ? aVar.size() : this.f336078a;
    }

    public String toString() {
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        if (aVar != null) {
            return aVar.toString();
        }
        if (this.f336078a == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = this.f336078a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("Invalid map index: " + this.f336078a);
                }
                Object obj = this.f336084g;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                Object obj2 = this.f336087j;
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            Object obj3 = this.f336083f;
            if (obj3 == this) {
                obj3 = "(this Map)";
            }
            sb2.append(obj3);
            sb2.append('=');
            Object obj4 = this.f336086i;
            if (obj4 == this) {
                obj4 = "(this Map)";
            }
            sb2.append(obj4);
            sb2.append(AbstractJsonLexerKt.COMMA);
        }
        Object obj5 = this.f336082e;
        if (obj5 == this) {
            obj5 = "(this Map)";
        }
        sb2.append(obj5);
        sb2.append('=');
        V v10 = this.f336085h;
        sb2.append(v10 != this ? v10 : "(this Map)");
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Collection<V> values() {
        org.apache.commons.collections4.map.a<K, V> aVar = this.f336088k;
        return aVar != null ? aVar.values() : new h(this);
    }

    public o(Map<? extends K, ? extends V> map) {
        putAll(map);
    }
}
