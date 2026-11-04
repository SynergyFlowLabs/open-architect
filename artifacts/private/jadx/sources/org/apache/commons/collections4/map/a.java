package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class a<K, V> extends AbstractMap<K, V> implements org.apache.commons.collections4.t<K, V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final String f335967i = "No next() entry in the iteration";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final String f335968j = "No previous() entry in the iteration";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final String f335969k = "remove() can only be called once after next()";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final String f335970l = "getKey() can only be called after next() and before remove()";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final String f335971m = "getValue() can only be called after next() and before remove()";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final String f335972n = "setValue() can only be called after next() and before remove()";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static final int f335973o = 16;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final int f335974s = 12;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final float f335975t = 0.75f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected static final int f335976v = 1073741824;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final Object f335977w = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    transient float f335978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int f335979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient c<K, V>[] f335980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient int f335981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    transient int f335982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    transient C2387a<K, V> f335983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    transient f<K> f335984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    transient h<V> f335985h;

    /* JADX INFO: renamed from: org.apache.commons.collections4.map.a$a, reason: collision with other inner class name */
    protected static class C2387a<K, V> extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<K, V> f335986a;

        protected C2387a(a<K, V> aVar) {
            this.f335986a = aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f335986a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                c<K, V> cVarW = this.f335986a.w(entry.getKey());
                if (cVarW != null && cVarW.equals(entry)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return this.f335986a.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry) || !contains(obj)) {
                return false;
            }
            this.f335986a.remove(((Map.Entry) obj).getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f335986a.size();
        }
    }

    protected static class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>> {
        protected b(a<K, V> aVar) {
            super(aVar);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return super.c();
        }
    }

    protected static class c<K, V> implements Map.Entry<K, V>, org.apache.commons.collections4.x<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected c<K, V> f335987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f335988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected Object f335989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected Object f335990d;

        protected c(c<K, V> cVar, int i10, Object obj, V v10) {
            this.f335987a = cVar;
            this.f335988b = i10;
            this.f335989c = obj;
            this.f335990d = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
                if (getValue() != null ? getValue().equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry, org.apache.commons.collections4.x
        public K getKey() {
            K k10 = (K) this.f335989c;
            if (k10 == a.f335977w) {
                return null;
            }
            return k10;
        }

        @Override // java.util.Map.Entry, org.apache.commons.collections4.x
        public V getValue() {
            return (V) this.f335990d;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode = 0;
            int iHashCode2 = getKey() == null ? 0 : getKey().hashCode();
            if (getValue() != null) {
                iHashCode = getValue().hashCode();
            }
            return iHashCode2 ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) this.f335990d;
            this.f335990d = v10;
            return v11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    protected static abstract class d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<K, V> f335991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f335992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c<K, V> f335993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c<K, V> f335994d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f335995e;

        protected d(a<K, V> aVar) {
            this.f335991a = aVar;
            c<K, V>[] cVarArr = aVar.f335980c;
            int length = cVarArr.length;
            c<K, V> cVar = null;
            while (length > 0 && cVar == null) {
                length--;
                cVar = cVarArr[length];
            }
            this.f335994d = cVar;
            this.f335992b = length;
            this.f335995e = aVar.f335982e;
        }

        protected c<K, V> b() {
            return this.f335993c;
        }

        protected c<K, V> c() {
            a<K, V> aVar = this.f335991a;
            if (aVar.f335982e != this.f335995e) {
                throw new ConcurrentModificationException();
            }
            c<K, V> cVar = this.f335994d;
            if (cVar == null) {
                throw new NoSuchElementException(a.f335967i);
            }
            c<K, V>[] cVarArr = aVar.f335980c;
            int i10 = this.f335992b;
            c<K, V> cVar2 = cVar.f335987a;
            while (cVar2 == null && i10 > 0) {
                i10--;
                cVar2 = cVarArr[i10];
            }
            this.f335994d = cVar2;
            this.f335992b = i10;
            this.f335993c = cVar;
            return cVar;
        }

        public boolean hasNext() {
            return this.f335994d != null;
        }

        public void remove() {
            c<K, V> cVar = this.f335993c;
            if (cVar == null) {
                throw new IllegalStateException(a.f335969k);
            }
            a<K, V> aVar = this.f335991a;
            if (aVar.f335982e != this.f335995e) {
                throw new ConcurrentModificationException();
            }
            aVar.remove(cVar.getKey());
            this.f335993c = null;
            this.f335995e = this.f335991a.f335982e;
        }

        public String toString() {
            if (this.f335993c == null) {
                return "Iterator[]";
            }
            return "Iterator[" + this.f335993c.getKey() + "=" + this.f335993c.getValue() + "]";
        }
    }

    protected static class e<K, V> extends d<K, V> implements org.apache.commons.collections4.a0<K, V> {
        protected e(a<K, V> aVar) {
            super(aVar);
        }

        @Override // org.apache.commons.collections4.a0
        public K getKey() {
            c<K, V> cVarB = b();
            if (cVarB != null) {
                return cVarB.getKey();
            }
            throw new IllegalStateException(a.f335970l);
        }

        @Override // org.apache.commons.collections4.a0
        public V getValue() {
            c<K, V> cVarB = b();
            if (cVarB != null) {
                return cVarB.getValue();
            }
            throw new IllegalStateException(a.f335971m);
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public K next() {
            return super.c().getKey();
        }

        @Override // org.apache.commons.collections4.a0
        public V setValue(V v10) {
            c<K, V> cVarB = b();
            if (cVarB != null) {
                return cVarB.setValue(v10);
            }
            throw new IllegalStateException(a.f335972n);
        }
    }

    protected static class f<K> extends AbstractSet<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<K, ?> f335996a;

        protected f(a<K, ?> aVar) {
            this.f335996a = aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f335996a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f335996a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return this.f335996a.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean zContainsKey = this.f335996a.containsKey(obj);
            this.f335996a.remove(obj);
            return zContainsKey;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f335996a.size();
        }
    }

    protected static class g<K> extends d<K, Object> implements Iterator<K> {
        protected g(a<K, ?> aVar) {
            super(aVar);
        }

        @Override // java.util.Iterator
        public K next() {
            return super.c().getKey();
        }
    }

    protected static class h<V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<?, V> f335997a;

        protected h(a<?, V> aVar) {
            this.f335997a = aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f335997a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f335997a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return this.f335997a.l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f335997a.size();
        }
    }

    protected static class i<V> extends d<Object, V> implements Iterator<V> {
        protected i(a<?, V> aVar) {
            super(aVar);
        }

        @Override // java.util.Iterator
        public V next() {
            return super.c().getValue();
        }
    }

    protected a() {
    }

    private void a(Map<? extends K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return;
        }
        q(d((int) (((this.f335979b + size) / this.f335978a) + 1.0f)));
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    protected void A() {
    }

    protected boolean B(Object obj, Object obj2) {
        return obj == obj2 || obj.equals(obj2);
    }

    protected boolean C(Object obj, Object obj2) {
        return obj == obj2 || obj.equals(obj2);
    }

    protected void D(c<K, V> cVar, int i10, c<K, V> cVar2) {
        if (cVar2 == null) {
            this.f335980c[i10] = cVar.f335987a;
        } else {
            cVar2.f335987a = cVar.f335987a;
        }
    }

    protected void E(c<K, V> cVar, int i10, c<K, V> cVar2) {
        this.f335982e++;
        D(cVar, i10, cVar2);
        this.f335979b--;
        n(cVar);
    }

    protected void F(c<K, V> cVar, int i10, int i11, K k10, V v10) {
        cVar.f335987a = this.f335980c[i10];
        cVar.f335988b = i11;
        cVar.f335989c = k10;
        cVar.f335990d = v10;
    }

    protected void G(c<K, V> cVar, V v10) {
        cVar.setValue(v10);
    }

    @Override // org.apache.commons.collections4.s
    public org.apache.commons.collections4.a0<K, V> T() {
        return this.f335979b == 0 ? org.apache.commons.collections4.iterators.n.b() : new e(this);
    }

    protected void b(c<K, V> cVar, int i10) {
        this.f335980c[i10] = cVar;
    }

    protected void c(int i10, int i11, K k10, V v10) {
        this.f335982e++;
        b(i(this.f335980c[i10], i11, k10, v10), i10);
        this.f335979b++;
        f();
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        this.f335982e++;
        c<K, V>[] cVarArr = this.f335980c;
        for (int length = cVarArr.length - 1; length >= 0; length--) {
            cVarArr[length] = null;
        }
        this.f335979b = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public boolean containsKey(Object obj) {
        Object objH = h(obj);
        int iX = x(objH);
        c<K, V>[] cVarArr = this.f335980c;
        for (c<K, V> cVar = cVarArr[z(iX, cVarArr.length)]; cVar != null; cVar = cVar.f335987a) {
            if (cVar.f335988b == iX && B(objH, cVar.f335989c)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public boolean containsValue(Object obj) {
        if (obj == null) {
            for (c<K, V> cVar : this.f335980c) {
                for (; cVar != null; cVar = cVar.f335987a) {
                    if (cVar.getValue() == null) {
                        return true;
                    }
                }
            }
        } else {
            for (c<K, V> cVar2 : this.f335980c) {
                for (; cVar2 != null; cVar2 = cVar2.f335987a) {
                    if (C(obj, cVar2.getValue())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    protected int d(int i10) {
        if (i10 > 1073741824) {
            return 1073741824;
        }
        int i11 = 1;
        while (i11 < i10) {
            i11 <<= 1;
        }
        if (i11 > 1073741824) {
            return 1073741824;
        }
        return i11;
    }

    protected int e(int i10, float f10) {
        return (int) (i10 * f10);
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f335983f == null) {
            this.f335983f = new C2387a<>(this);
        }
        return this.f335983f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != size()) {
            return false;
        }
        org.apache.commons.collections4.a0<K, V> a0VarT = T();
        while (a0VarT.hasNext()) {
            try {
                K next = a0VarT.next();
                V value = a0VarT.getValue();
                if (value == null) {
                    if (map.get(next) != null || !map.containsKey(next)) {
                        return false;
                    }
                } else if (!value.equals(map.get(next))) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return true;
    }

    protected void f() {
        int length;
        if (this.f335979b < this.f335981d || (length = this.f335980c.length * 2) > 1073741824) {
            return;
        }
        q(length);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.AbstractMap
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a<K, V> clone() {
        try {
            a<K, V> aVar = (a) super.clone();
            aVar.f335980c = new c[this.f335980c.length];
            aVar.f335983f = null;
            aVar.f335984g = null;
            aVar.f335985h = null;
            aVar.f335982e = 0;
            aVar.f335979b = 0;
            aVar.A();
            aVar.putAll(this);
            return aVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public V get(Object obj) {
        Object objH = h(obj);
        int iX = x(objH);
        c<K, V>[] cVarArr = this.f335980c;
        for (c<K, V> cVar = cVarArr[z(iX, cVarArr.length)]; cVar != null; cVar = cVar.f335987a) {
            if (cVar.f335988b == iX && B(objH, cVar.f335989c)) {
                return cVar.getValue();
            }
        }
        return null;
    }

    protected Object h(Object obj) {
        return obj == null ? f335977w : obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        Iterator<Map.Entry<K, V>> itJ = j();
        int iHashCode = 0;
        while (itJ.hasNext()) {
            iHashCode += itJ.next().hashCode();
        }
        return iHashCode;
    }

    protected c<K, V> i(c<K, V> cVar, int i10, K k10, V v10) {
        return new c<>(cVar, i10, h(k10), v10);
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public boolean isEmpty() {
        return this.f335979b == 0;
    }

    protected Iterator<Map.Entry<K, V>> j() {
        return size() == 0 ? org.apache.commons.collections4.iterators.l.b() : new b(this);
    }

    protected Iterator<K> k() {
        return size() == 0 ? org.apache.commons.collections4.iterators.l.b() : new g(this);
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        if (this.f335984g == null) {
            this.f335984g = new f<>(this);
        }
        return this.f335984g;
    }

    protected Iterator<V> l() {
        return size() == 0 ? org.apache.commons.collections4.iterators.l.b() : new i(this);
    }

    protected void n(c<K, V> cVar) {
        cVar.f335987a = null;
        cVar.f335989c = null;
        cVar.f335990d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void o(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f335978a = objectInputStream.readFloat();
        int i10 = objectInputStream.readInt();
        int i11 = objectInputStream.readInt();
        A();
        this.f335981d = e(i10, this.f335978a);
        this.f335980c = new c[i10];
        for (int i12 = 0; i12 < i11; i12++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    protected void p(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeFloat(this.f335978a);
        objectOutputStream.writeInt(this.f335980c.length);
        objectOutputStream.writeInt(this.f335979b);
        org.apache.commons.collections4.a0<K, V> a0VarT = T();
        while (a0VarT.hasNext()) {
            objectOutputStream.writeObject(a0VarT.next());
            objectOutputStream.writeObject(a0VarT.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        Object objH = h(k10);
        int iX = x(objH);
        int iZ = z(iX, this.f335980c.length);
        for (c<K, V> cVar = this.f335980c[iZ]; cVar != null; cVar = cVar.f335987a) {
            if (cVar.f335988b == iX && B(objH, cVar.f335989c)) {
                V value = cVar.getValue();
                G(cVar, v10);
                return value;
            }
        }
        c(iZ, iX, k10, v10);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        a(map);
    }

    protected void q(int i10) {
        c<K, V>[] cVarArr = this.f335980c;
        int length = cVarArr.length;
        if (i10 <= length) {
            return;
        }
        if (this.f335979b == 0) {
            this.f335981d = e(i10, this.f335978a);
            this.f335980c = new c[i10];
            return;
        }
        c<K, V>[] cVarArr2 = new c[i10];
        this.f335982e++;
        for (int i11 = length - 1; i11 >= 0; i11--) {
            c<K, V> cVar = cVarArr[i11];
            if (cVar != null) {
                cVarArr[i11] = null;
                while (true) {
                    c<K, V> cVar2 = cVar.f335987a;
                    int iZ = z(cVar.f335988b, i10);
                    cVar.f335987a = cVarArr2[iZ];
                    cVarArr2[iZ] = cVar;
                    if (cVar2 == null) {
                        break;
                    } else {
                        cVar = cVar2;
                    }
                }
            }
        }
        this.f335981d = e(i10, this.f335978a);
        this.f335980c = cVarArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        Object objH = h(obj);
        int iX = x(objH);
        int iZ = z(iX, this.f335980c.length);
        c<K, V> cVar = null;
        for (c<K, V> cVar2 = this.f335980c[iZ]; cVar2 != null; cVar2 = cVar2.f335987a) {
            if (cVar2.f335988b == iX && B(objH, cVar2.f335989c)) {
                V value = cVar2.getValue();
                E(cVar2, iZ, cVar);
                return value;
            }
            cVar = cVar2;
        }
        return null;
    }

    protected int s(c<K, V> cVar) {
        return cVar.f335988b;
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public int size() {
        return this.f335979b;
    }

    protected K t(c<K, V> cVar) {
        return cVar.getKey();
    }

    @Override // java.util.AbstractMap
    public String toString() {
        if (size() == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(size() * 32);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        org.apache.commons.collections4.a0<K, V> a0VarT = T();
        boolean zHasNext = a0VarT.hasNext();
        while (zHasNext) {
            Object next = a0VarT.next();
            Object value = a0VarT.getValue();
            if (next == this) {
                next = "(this Map)";
            }
            sb2.append(next);
            sb2.append('=');
            if (value == this) {
                value = "(this Map)";
            }
            sb2.append(value);
            zHasNext = a0VarT.hasNext();
            if (zHasNext) {
                sb2.append(AbstractJsonLexerKt.COMMA);
                sb2.append(' ');
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    protected c<K, V> u(c<K, V> cVar) {
        return cVar.f335987a;
    }

    protected V v(c<K, V> cVar) {
        return cVar.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public Collection<V> values() {
        if (this.f335985h == null) {
            this.f335985h = new h<>(this);
        }
        return this.f335985h;
    }

    protected c<K, V> w(Object obj) {
        Object objH = h(obj);
        int iX = x(objH);
        c<K, V>[] cVarArr = this.f335980c;
        for (c<K, V> cVar = cVarArr[z(iX, cVarArr.length)]; cVar != null; cVar = cVar.f335987a) {
            if (cVar.f335988b == iX && B(objH, cVar.f335989c)) {
                return cVar;
            }
        }
        return null;
    }

    protected int x(Object obj) {
        int iHashCode = obj.hashCode();
        int i10 = iHashCode + (~(iHashCode << 9));
        int i11 = i10 ^ (i10 >>> 14);
        int i12 = i11 + (i11 << 4);
        return i12 ^ (i12 >>> 10);
    }

    protected int z(int i10, int i11) {
        return i10 & (i11 - 1);
    }

    protected a(int i10, float f10, int i11) {
        this.f335978a = f10;
        this.f335980c = new c[i10];
        this.f335981d = i11;
        A();
    }

    protected a(int i10) {
        this(i10, 0.75f);
    }

    protected a(int i10, float f10) {
        if (i10 >= 0) {
            if (f10 > 0.0f && !Float.isNaN(f10)) {
                this.f335978a = f10;
                int iD = d(i10);
                this.f335981d = e(iD, f10);
                this.f335980c = new c[iD];
                A();
                return;
            }
            throw new IllegalArgumentException("Load factor must be greater than 0");
        }
        throw new IllegalArgumentException("Initial capacity must be a non negative number");
    }

    protected a(Map<? extends K, ? extends V> map) {
        this(Math.max(map.size() * 2, 16), 0.75f);
        a(map);
    }
}
