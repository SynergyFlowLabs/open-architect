package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
class c3<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f117214j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @com.google.common.annotations.e
    static final double f117215k = 0.001d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f117216l = 9;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.a
    private transient Object f117217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    transient int[] f117218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    transient Object[] f117219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    transient Object[] f117220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f117221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f117222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Set<K> f117223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Set<Map.Entry<K, V>> f117224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Collection<V> f117225i;

    class a extends c3<K, V>.e<K> {
        a() {
            super(c3.this, null);
        }

        @Override // com.google.common.collect.c3.e
        @b9
        K c(int i10) {
            return (K) c3.this.I(i10);
        }
    }

    class b extends c3<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(c3.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.c3.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> c(int entry) {
            return new g(entry);
        }
    }

    class c extends c3<K, V>.e<V> {
        c() {
            super(c3.this, null);
        }

        @Override // com.google.common.collect.c3.e
        @b9
        V c(int i10) {
            return (V) c3.this.c0(i10);
        }
    }

    class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            Map<K, V> mapY = c3.this.y();
            if (mapY != null) {
                return mapY.entrySet().contains(o10);
            }
            if (o10 instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) o10;
                int iF = c3.this.F(entry.getKey());
                if (iF != -1 && com.google.common.base.d0.a(c3.this.c0(iF), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return c3.this.A();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object o10) {
            int iD;
            int iF;
            Map<K, V> mapY = c3.this.y();
            if (mapY != null) {
                return mapY.entrySet().remove(o10);
            }
            if (!(o10 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o10;
            if (c3.this.L() || (iF = e3.f(entry.getKey(), entry.getValue(), (iD = c3.this.D()), c3.this.Q(), c3.this.O(), c3.this.P(), c3.this.R())) == -1) {
                return false;
            }
            c3.this.K(iF, iD);
            c3.e(c3.this);
            c3.this.E();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c3.this.size();
        }
    }

    class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            return c3.this.containsKey(o10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return c3.this.J();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object o10) {
            Map<K, V> mapY = c3.this.y();
            if (mapY != null) {
                return mapY.keySet().remove(o10);
            }
            return c3.this.M(o10) != c3.f117214j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c3.this.size();
        }
    }

    final class g extends com.google.common.collect.g<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        private final K f117235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f117236b;

        g(int i10) {
            this.f117235a = (K) c3.this.I(i10);
            this.f117236b = i10;
        }

        private void a() {
            int i10 = this.f117236b;
            if (i10 != -1 && i10 < c3.this.size() && com.google.common.base.d0.a(this.f117235a, c3.this.I(this.f117236b))) {
                return;
            }
            this.f117236b = c3.this.F(this.f117235a);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public K getKey() {
            return this.f117235a;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public V getValue() {
            Map<K, V> mapY = c3.this.y();
            if (mapY != null) {
                return (V) u8.a(mapY.get(this.f117235a));
            }
            a();
            int i10 = this.f117236b;
            return i10 == -1 ? (V) u8.b() : (V) c3.this.c0(i10);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public V setValue(@b9 V v10) {
            Map<K, V> mapY = c3.this.y();
            if (mapY != null) {
                return (V) u8.a(mapY.put(this.f117235a, v10));
            }
            a();
            int i10 = this.f117236b;
            if (i10 == -1) {
                c3.this.put(this.f117235a, v10);
                return (V) u8.b();
            }
            V v11 = (V) c3.this.c0(i10);
            c3.this.a0(this.f117236b, v10);
            return v11;
        }
    }

    class h extends AbstractCollection<V> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return c3.this.d0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c3.this.size();
        }
    }

    c3() {
        G(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int D() {
        return (1 << (this.f117221e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int F(@fj.a Object key) {
        if (L()) {
            return -1;
        }
        int iD = c6.d(key);
        int iD2 = D();
        int iH = e3.h(Q(), iD & iD2);
        if (iH == 0) {
            return -1;
        }
        int iB = e3.b(iD, iD2);
        do {
            int i10 = iH - 1;
            int iZ = z(i10);
            if (e3.b(iZ, iD2) == iB && com.google.common.base.d0.a(key, I(i10))) {
                return i10;
            }
            iH = e3.c(iZ, iD2);
        } while (iH != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K I(int i10) {
        return (K) P()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object M(@fj.a Object key) {
        int iD;
        int iF;
        if (!L() && (iF = e3.f(key, null, (iD = D()), Q(), O(), P(), null)) != -1) {
            V vC0 = c0(iF);
            K(iF, iD);
            this.f117222f--;
            E();
            return vC0;
        }
        return f117214j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] O() {
        int[] iArr = this.f117218b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] P() {
        Object[] objArr = this.f117219c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object Q() {
        Object obj = this.f117217a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] R() {
        Object[] objArr = this.f117220d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void U(int newSize) {
        int iMin;
        int length = O().length;
        if (newSize <= length || (iMin = Math.min(kotlinx.coroutines.internal.h0.f315057j, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        S(iMin);
    }

    @z7.a
    private int V(int oldMask, int newCapacity, int targetHash, int targetEntryIndex) {
        Object objA = e3.a(newCapacity);
        int i10 = newCapacity - 1;
        if (targetEntryIndex != 0) {
            e3.i(objA, targetHash & i10, targetEntryIndex + 1);
        }
        Object objQ = Q();
        int[] iArrO = O();
        for (int i11 = 0; i11 <= oldMask; i11++) {
            int iH = e3.h(objQ, i11);
            while (iH != 0) {
                int i12 = iH - 1;
                int i13 = iArrO[i12];
                int iB = e3.b(i13, oldMask) | i11;
                int i14 = iB & i10;
                int iH2 = e3.h(objA, i14);
                e3.i(objA, i14, iH);
                iArrO[i12] = e3.d(iB, iH2, i10);
                iH = e3.c(i13, oldMask);
            }
        }
        this.f117217a = objA;
        X(i10);
        return i10;
    }

    private void W(int i10, int value) {
        O()[i10] = value;
    }

    private void X(int mask) {
        this.f117221e = e3.d(this.f117221e, 32 - Integer.numberOfLeadingZeros(mask), 31);
    }

    private void Z(int i10, K key) {
        P()[i10] = key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(int i10, V value) {
        R()[i10] = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V c0(int i10) {
        return (V) R()[i10];
    }

    static /* synthetic */ int e(c3 c3Var) {
        int i10 = c3Var.f117222f;
        c3Var.f117222f = i10 - 1;
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int i10 = stream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Invalid size: " + i10);
        }
        G(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            put(stream.readObject(), stream.readObject());
        }
    }

    public static <K, V> c3<K, V> s() {
        return new c3<>();
    }

    @com.google.common.annotations.d
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        Iterator<Map.Entry<K, V>> itA = A();
        while (itA.hasNext()) {
            Map.Entry<K, V> next = itA.next();
            stream.writeObject(next.getKey());
            stream.writeObject(next.getValue());
        }
    }

    public static <K, V> c3<K, V> x(int expectedSize) {
        return new c3<>(expectedSize);
    }

    private int z(int i10) {
        return O()[i10];
    }

    Iterator<Map.Entry<K, V>> A() {
        Map<K, V> mapY = y();
        return mapY != null ? mapY.entrySet().iterator() : new b();
    }

    int B() {
        return isEmpty() ? -1 : 0;
    }

    int C(int entryIndex) {
        int i10 = entryIndex + 1;
        if (i10 < this.f117222f) {
            return i10;
        }
        return -1;
    }

    void E() {
        this.f117221e += 32;
    }

    void G(int expectedSize) {
        com.google.common.base.j0.e(expectedSize >= 0, "Expected size must be >= 0");
        this.f117221e = com.google.common.primitives.l.h(expectedSize, 1, kotlinx.coroutines.internal.h0.f315057j);
    }

    void H(int entryIndex, @b9 K key, @b9 V value, int hash, int mask) {
        W(entryIndex, e3.d(hash, 0, mask));
        Z(entryIndex, key);
        a0(entryIndex, value);
    }

    Iterator<K> J() {
        Map<K, V> mapY = y();
        return mapY != null ? mapY.keySet().iterator() : new a();
    }

    void K(int dstIndex, int mask) {
        Object objQ = Q();
        int[] iArrO = O();
        Object[] objArrP = P();
        Object[] objArrR = R();
        int size = size();
        int i10 = size - 1;
        if (dstIndex >= i10) {
            objArrP[dstIndex] = null;
            objArrR[dstIndex] = null;
            iArrO[dstIndex] = 0;
            return;
        }
        Object obj = objArrP[i10];
        objArrP[dstIndex] = obj;
        objArrR[dstIndex] = objArrR[i10];
        objArrP[i10] = null;
        objArrR[i10] = null;
        iArrO[dstIndex] = iArrO[i10];
        iArrO[i10] = 0;
        int iD = c6.d(obj) & mask;
        int iH = e3.h(objQ, iD);
        if (iH == size) {
            e3.i(objQ, iD, dstIndex + 1);
            return;
        }
        while (true) {
            int i11 = iH - 1;
            int i12 = iArrO[i11];
            int iC = e3.c(i12, mask);
            if (iC == size) {
                iArrO[i11] = e3.d(i12, dstIndex + 1, mask);
                return;
            }
            iH = iC;
        }
    }

    boolean L() {
        if (this.f117217a != null) {
            return false;
        }
        int i10 = 4 | 1;
        return true;
    }

    void S(int newCapacity) {
        this.f117218b = Arrays.copyOf(O(), newCapacity);
        this.f117219c = Arrays.copyOf(P(), newCapacity);
        this.f117220d = Arrays.copyOf(R(), newCapacity);
    }

    public void b0() {
        if (L()) {
            return;
        }
        Map<K, V> mapY = y();
        if (mapY != null) {
            Map<K, V> mapU = u(size());
            mapU.putAll(mapY);
            this.f117217a = mapU;
            return;
        }
        int i10 = this.f117222f;
        if (i10 < O().length) {
            S(i10);
        }
        int iJ = e3.j(i10);
        int iD = D();
        if (iJ < iD) {
            V(iD, iJ, 0, 0);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (L()) {
            return;
        }
        E();
        Map<K, V> mapY = y();
        if (mapY != null) {
            this.f117221e = com.google.common.primitives.l.h(size(), 3, kotlinx.coroutines.internal.h0.f315057j);
            mapY.clear();
            this.f117217a = null;
            this.f117222f = 0;
            return;
        }
        Arrays.fill(P(), 0, this.f117222f, (Object) null);
        Arrays.fill(R(), 0, this.f117222f, (Object) null);
        e3.g(Q());
        Arrays.fill(O(), 0, this.f117222f, 0);
        this.f117222f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@fj.a Object key) {
        Map<K, V> mapY = y();
        if (mapY != null) {
            return mapY.containsKey(key);
        }
        if (F(key) == -1) {
            return false;
        }
        int i10 = 4 & 1;
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@fj.a Object value) {
        Map<K, V> mapY = y();
        if (mapY != null) {
            return mapY.containsValue(value);
        }
        for (int i10 = 0; i10 < this.f117222f; i10++) {
            if (com.google.common.base.d0.a(value, c0(i10))) {
                return true;
            }
        }
        return false;
    }

    Iterator<V> d0() {
        Map<K, V> mapY = y();
        return mapY != null ? mapY.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f117224h;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setT = t();
        this.f117224h = setT;
        return setT;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @fj.a
    public V get(@fj.a Object key) {
        Map<K, V> mapY = y();
        if (mapY != null) {
            return mapY.get(key);
        }
        int iF = F(key);
        if (iF == -1) {
            return null;
        }
        n(iF);
        return c0(iF);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f117223g;
        if (set != null) {
            return set;
        }
        Set<K> setV = v();
        this.f117223g = setV;
        return setV;
    }

    void n(int index) {
    }

    int o(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove - 1;
    }

    @z7.a
    int p() {
        com.google.common.base.j0.h0(L(), "Arrays already allocated");
        int i10 = this.f117221e;
        int iJ = e3.j(i10);
        this.f117217a = e3.a(iJ);
        X(iJ - 1);
        this.f117218b = new int[i10];
        this.f117219c = new Object[i10];
        this.f117220d = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @z7.a
    @fj.a
    public V put(@b9 K k10, @b9 V v10) {
        if (L()) {
            p();
        }
        Map<K, V> mapY = y();
        if (mapY != null) {
            return mapY.put(k10, v10);
        }
        int[] iArrO = O();
        Object[] objArrP = P();
        Object[] objArrR = R();
        int i10 = this.f117222f;
        int i11 = i10 + 1;
        int iD = c6.d(k10);
        int iD2 = D();
        int i12 = iD & iD2;
        int iH = e3.h(Q(), i12);
        if (iH != 0) {
            int iB = e3.b(iD, iD2);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrO[i14];
                if (e3.b(i15, iD2) == iB && com.google.common.base.d0.a(k10, objArrP[i14])) {
                    V v11 = (V) objArrR[i14];
                    objArrR[i14] = v10;
                    n(i14);
                    return v11;
                }
                int iC = e3.c(i15, iD2);
                i13++;
                if (iC == 0) {
                    if (i13 < 9) {
                        if (i11 <= iD2) {
                            iArrO[i14] = e3.d(i15, i11, iD2);
                            break;
                        }
                        iD2 = V(iD2, e3.e(iD2), iD, i10);
                        break;
                    }
                    return q().put(k10, v10);
                }
                iH = iC;
            }
        } else if (i11 > iD2) {
            iD2 = V(iD2, e3.e(iD2), iD, i10);
        } else {
            e3.i(Q(), i12, i11);
        }
        int i16 = iD2;
        U(i11);
        H(i10, k10, v10, iD, i16);
        this.f117222f = i11;
        E();
        return null;
    }

    @z7.a
    Map<K, V> q() {
        Map<K, V> mapU = u(D() + 1);
        int iB = B();
        while (iB >= 0) {
            mapU.put(I(iB), c0(iB));
            iB = C(iB);
        }
        this.f117217a = mapU;
        this.f117218b = null;
        this.f117219c = null;
        this.f117220d = null;
        E();
        return mapU;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @z7.a
    @fj.a
    public V remove(@fj.a Object obj) {
        Map<K, V> mapY = y();
        if (mapY != null) {
            return mapY.remove(obj);
        }
        V v10 = (V) M(obj);
        if (v10 == f117214j) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapY = y();
        return mapY != null ? mapY.size() : this.f117222f;
    }

    Set<Map.Entry<K, V>> t() {
        return new d();
    }

    Map<K, V> u(int tableSize) {
        return new LinkedHashMap(tableSize, 1.0f);
    }

    Set<K> v() {
        return new f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collectionW = this.f117225i;
        if (collectionW == null) {
            collectionW = w();
            this.f117225i = collectionW;
        }
        return collectionW;
    }

    Collection<V> w() {
        return new h();
    }

    @com.google.common.annotations.e
    @fj.a
    Map<K, V> y() {
        Object obj = this.f117217a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    c3(int expectedSize) {
        G(expectedSize);
    }

    private abstract class e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f117230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f117231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f117232c;

        private e() {
            this.f117230a = c3.this.f117221e;
            this.f117231b = c3.this.B();
            this.f117232c = -1;
        }

        private void b() {
            if (c3.this.f117221e != this.f117230a) {
                throw new ConcurrentModificationException();
            }
        }

        @b9
        abstract T c(int entry);

        void d() {
            this.f117230a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f117231b >= 0;
        }

        @Override // java.util.Iterator
        @b9
        public T next() {
            b();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f117231b;
            this.f117232c = i10;
            T tC = c(i10);
            this.f117231b = c3.this.C(this.f117231b);
            return tC;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            a3.e(this.f117232c >= 0);
            d();
            c3 c3Var = c3.this;
            c3Var.remove(c3Var.I(this.f117232c));
            this.f117231b = c3.this.o(this.f117231b, this.f117232c);
            this.f117232c = -1;
        }

        /* synthetic */ e(c3 c3Var, a aVar) {
            this();
        }
    }
}
