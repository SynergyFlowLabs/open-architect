package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public final class y5<K, V> extends AbstractMap<K, V> implements w<K, V>, Serializable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f118328t = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f118329v = -2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    transient K[] f118330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient V[] f118331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient int f118332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient int f118333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int[] f118334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int[] f118335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient int[] f118336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient int[] f118337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient int f118338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient int f118339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient int[] f118340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private transient int[] f118341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @a8.b
    private transient Set<K> f118342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @a8.b
    private transient Set<V> f118343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @a8.b
    private transient Set<Map.Entry<K, V>> f118344o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @a8.b
    @r9.j
    @fj.a
    private transient w<V, K> f118345s;

    final class a extends com.google.common.collect.g<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        final K f118346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f118347b;

        a(int i10) {
            this.f118346a = (K) u8.a(y5.this.f118330a[i10]);
            this.f118347b = i10;
        }

        void a() {
            int i10 = this.f118347b;
            if (i10 != -1) {
                y5 y5Var = y5.this;
                if (i10 <= y5Var.f118332c && com.google.common.base.d0.a(y5Var.f118330a[i10], this.f118346a)) {
                    return;
                }
            }
            this.f118347b = y5.this.p(this.f118346a);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public K getKey() {
            return this.f118346a;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public V getValue() {
            a();
            int i10 = this.f118347b;
            return i10 == -1 ? (V) u8.b() : (V) u8.a(y5.this.f118331b[i10]);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public V setValue(@b9 V v10) {
            a();
            int i10 = this.f118347b;
            if (i10 == -1) {
                y5.this.put(this.f118346a, v10);
                return (V) u8.b();
            }
            V v11 = (V) u8.a(y5.this.f118331b[i10]);
            if (com.google.common.base.d0.a(v11, v10)) {
                return v10;
            }
            y5.this.H(this.f118347b, v10, false);
            return v11;
        }
    }

    static final class b<K, V> extends com.google.common.collect.g<V, K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final y5<K, V> f118349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @b9
        final V f118350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f118351c;

        b(y5<K, V> y5Var, int i10) {
            this.f118349a = y5Var;
            this.f118350b = (V) u8.a(y5Var.f118331b[i10]);
            this.f118351c = i10;
        }

        private void a() {
            int i10 = this.f118351c;
            if (i10 != -1) {
                y5<K, V> y5Var = this.f118349a;
                if (i10 <= y5Var.f118332c && com.google.common.base.d0.a(this.f118350b, y5Var.f118331b[i10])) {
                    return;
                }
            }
            this.f118351c = this.f118349a.s(this.f118350b);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public V getKey() {
            return this.f118350b;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public K getValue() {
            a();
            int i10 = this.f118351c;
            return i10 == -1 ? (K) u8.b() : (K) u8.a(this.f118349a.f118330a[i10]);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public K setValue(@b9 K k10) {
            a();
            int i10 = this.f118351c;
            if (i10 == -1) {
                this.f118349a.A(this.f118350b, k10, false);
                return (K) u8.b();
            }
            K k11 = (K) u8.a(this.f118349a.f118330a[i10]);
            if (com.google.common.base.d0.a(k11, k10)) {
                return k10;
            }
            this.f118349a.G(this.f118351c, k10, false);
            return k11;
        }
    }

    final class c extends h<K, V, Map.Entry<K, V>> {
        c() {
            super(y5.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            if (o10 instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) o10;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iP = y5.this.p(key);
                if (iP != -1 && com.google.common.base.d0.a(value, y5.this.f118331b[iP])) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.y5.h
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> c(int entry) {
            return new a(entry);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @z7.a
        public boolean remove(@fj.a Object o10) {
            if (o10 instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) o10;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iD = c6.d(key);
                int iQ = y5.this.q(key, iD);
                if (iQ != -1 && com.google.common.base.d0.a(value, y5.this.f118331b[iQ])) {
                    y5.this.D(iQ, iD);
                    return true;
                }
            }
            return false;
        }
    }

    static class d<K, V> extends AbstractMap<V, K> implements w<V, K>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y5<K, V> f118353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient Set<Map.Entry<V, K>> f118354b;

        d(y5<K, V> forward) {
            this.f118353a = forward;
        }

        @com.google.common.annotations.c("serialization")
        private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
            in.defaultReadObject();
            ((y5) this.f118353a).f118345s = this;
        }

        @Override // com.google.common.collect.w
        @z7.a
        @fj.a
        public K L2(@b9 V value, @b9 K key) {
            return this.f118353a.A(value, key, true);
        }

        @Override // com.google.common.collect.w
        public w<K, V> Y2() {
            return this.f118353a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f118353a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return this.f118353a.containsValue(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@fj.a Object value) {
            return this.f118353a.containsKey(value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f118354b;
            if (set != null) {
                return set;
            }
            e eVar = new e(this.f118353a);
            this.f118354b = eVar;
            return eVar;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public K get(@fj.a Object key) {
            return this.f118353a.u(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.f118353a.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.w
        @z7.a
        @fj.a
        public K put(@b9 V value, @b9 K key) {
            return this.f118353a.A(value, key, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @z7.a
        @fj.a
        public K remove(@fj.a Object value) {
            return this.f118353a.F(value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f118353a.f118332c;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.w
        public Set<K> values() {
            return this.f118353a.keySet();
        }
    }

    static class e<K, V> extends h<K, V, Map.Entry<V, K>> {
        e(y5<K, V> biMap) {
            super(biMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            if (o10 instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) o10;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iS = this.f118357a.s(key);
                if (iS != -1 && com.google.common.base.d0.a(this.f118357a.f118330a[iS], value)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.y5.h
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> c(int entry) {
            return new b(this.f118357a, entry);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object o10) {
            if (o10 instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) o10;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iD = c6.d(key);
                int iT = this.f118357a.t(key, iD);
                if (iT != -1 && com.google.common.base.d0.a(this.f118357a.f118330a[iT], value)) {
                    this.f118357a.E(iT, iD);
                    return true;
                }
            }
            return false;
        }
    }

    final class f extends h<K, V, K> {
        f() {
            super(y5.this);
        }

        @Override // com.google.common.collect.y5.h
        @b9
        K c(int i10) {
            return (K) u8.a(y5.this.f118330a[i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            return y5.this.containsKey(o10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object o10) {
            int iD = c6.d(o10);
            int iQ = y5.this.q(o10, iD);
            if (iQ == -1) {
                return false;
            }
            y5.this.D(iQ, iD);
            return true;
        }
    }

    final class g extends h<K, V, V> {
        g() {
            super(y5.this);
        }

        @Override // com.google.common.collect.y5.h
        @b9
        V c(int i10) {
            return (V) u8.a(y5.this.f118331b[i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            return y5.this.containsValue(o10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object o10) {
            int iD = c6.d(o10);
            int iT = y5.this.t(o10, iD);
            if (iT == -1) {
                return false;
            }
            y5.this.E(iT, iD);
            return true;
        }
    }

    static abstract class h<K, V, T> extends AbstractSet<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final y5<K, V> f118357a;

        class a implements Iterator<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f118358a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f118359b = -1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f118360c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f118361d;

            a() {
                this.f118358a = ((y5) h.this.f118357a).f118338i;
                y5<K, V> y5Var = h.this.f118357a;
                this.f118360c = y5Var.f118333d;
                this.f118361d = y5Var.f118332c;
            }

            private void b() {
                if (h.this.f118357a.f118333d != this.f118360c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f118358a != -2 && this.f118361d > 0;
            }

            @Override // java.util.Iterator
            @b9
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T t10 = (T) h.this.c(this.f118358a);
                this.f118359b = this.f118358a;
                this.f118358a = ((y5) h.this.f118357a).f118341l[this.f118358a];
                this.f118361d--;
                return t10;
            }

            @Override // java.util.Iterator
            public void remove() {
                b();
                a3.e(this.f118359b != -1);
                h.this.f118357a.B(this.f118359b);
                int i10 = this.f118358a;
                y5<K, V> y5Var = h.this.f118357a;
                if (i10 == y5Var.f118332c) {
                    this.f118358a = this.f118359b;
                }
                this.f118359b = -1;
                this.f118360c = y5Var.f118333d;
            }
        }

        h(y5<K, V> biMap) {
            this.f118357a = biMap;
        }

        @b9
        abstract T c(int entry);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f118357a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f118357a.f118332c;
        }
    }

    private y5(int expectedSize) {
        v(expectedSize);
    }

    private void C(int entry, int keyHash, int valueHash) {
        com.google.common.base.j0.d(entry != -1);
        k(entry, keyHash);
        l(entry, valueHash);
        I(this.f118340k[entry], this.f118341l[entry]);
        y(this.f118332c - 1, entry);
        K[] kArr = this.f118330a;
        int i10 = this.f118332c;
        kArr[i10 - 1] = null;
        this.f118331b[i10 - 1] = null;
        this.f118332c = i10 - 1;
        this.f118333d++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(int entry, @b9 K newKey, boolean force) {
        int i10;
        com.google.common.base.j0.d(entry != -1);
        int iD = c6.d(newKey);
        int iQ = q(newKey, iD);
        int i11 = this.f118339j;
        if (iQ == -1) {
            i10 = -2;
        } else {
            if (!force) {
                throw new IllegalArgumentException("Key already present in map: " + newKey);
            }
            i11 = this.f118340k[iQ];
            i10 = this.f118341l[iQ];
            D(iQ, iD);
            if (entry == this.f118332c) {
                entry = iQ;
            }
        }
        if (i11 == entry) {
            i11 = this.f118340k[entry];
        } else if (i11 == this.f118332c) {
            i11 = iQ;
        }
        if (i10 == entry) {
            iQ = this.f118341l[entry];
        } else if (i10 != this.f118332c) {
            iQ = i10;
        }
        I(this.f118340k[entry], this.f118341l[entry]);
        k(entry, c6.d(this.f118330a[entry]));
        this.f118330a[entry] = newKey;
        w(entry, c6.d(newKey));
        I(i11, entry);
        I(entry, iQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(int entry, @b9 V newValue, boolean force) {
        com.google.common.base.j0.d(entry != -1);
        int iD = c6.d(newValue);
        int iT = t(newValue, iD);
        if (iT != -1) {
            if (!force) {
                throw new IllegalArgumentException("Value already present in map: " + newValue);
            }
            E(iT, iD);
            if (entry == this.f118332c) {
                entry = iT;
            }
        }
        l(entry, c6.d(this.f118331b[entry]));
        this.f118331b[entry] = newValue;
        x(entry, iD);
    }

    private void I(int prev, int next) {
        if (prev == -2) {
            this.f118338i = next;
        } else {
            this.f118341l[prev] = next;
        }
        if (next == -2) {
            this.f118339j = prev;
        } else {
            this.f118340k[next] = prev;
        }
    }

    private int f(int hash) {
        return (this.f118334e.length - 1) & hash;
    }

    public static <K, V> y5<K, V> g() {
        return h(16);
    }

    public static <K, V> y5<K, V> h(int expectedSize) {
        return new y5<>(expectedSize);
    }

    public static <K, V> y5<K, V> i(Map<? extends K, ? extends V> map) {
        y5<K, V> y5VarH = h(map.size());
        y5VarH.putAll(map);
        return y5VarH;
    }

    private static int[] j(int size) {
        int[] iArr = new int[size];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void k(int entry, int keyHash) {
        com.google.common.base.j0.d(entry != -1);
        int iF = f(keyHash);
        int[] iArr = this.f118334e;
        int i10 = iArr[iF];
        if (i10 == entry) {
            int[] iArr2 = this.f118336g;
            iArr[iF] = iArr2[entry];
            iArr2[entry] = -1;
            return;
        }
        int i11 = this.f118336g[i10];
        while (true) {
            int i12 = i10;
            i10 = i11;
            if (i10 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.f118330a[entry]);
            }
            if (i10 == entry) {
                int[] iArr3 = this.f118336g;
                iArr3[i12] = iArr3[entry];
                iArr3[entry] = -1;
                return;
            }
            i11 = this.f118336g[i10];
        }
    }

    private void l(int entry, int valueHash) {
        com.google.common.base.j0.d(entry != -1);
        int iF = f(valueHash);
        int[] iArr = this.f118335f;
        int i10 = iArr[iF];
        if (i10 == entry) {
            int[] iArr2 = this.f118337h;
            iArr[iF] = iArr2[entry];
            iArr2[entry] = -1;
            return;
        }
        int i11 = this.f118337h[i10];
        while (true) {
            int i12 = i10;
            i10 = i11;
            if (i10 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.f118331b[entry]);
            }
            if (i10 == entry) {
                int[] iArr3 = this.f118337h;
                iArr3[i12] = iArr3[entry];
                iArr3[entry] = -1;
                return;
            }
            i11 = this.f118337h[i10];
        }
    }

    private void m(int i10) {
        int[] iArr = this.f118336g;
        if (iArr.length < i10) {
            int iF = h6.b.f(iArr.length, i10);
            this.f118330a = (K[]) Arrays.copyOf(this.f118330a, iF);
            this.f118331b = (V[]) Arrays.copyOf(this.f118331b, iF);
            this.f118336g = n(this.f118336g, iF);
            this.f118337h = n(this.f118337h, iF);
            this.f118340k = n(this.f118340k, iF);
            this.f118341l = n(this.f118341l, iF);
        }
        if (this.f118334e.length < i10) {
            int iA = c6.a(i10, 1.0d);
            this.f118334e = j(iA);
            this.f118335f = j(iA);
            for (int i11 = 0; i11 < this.f118332c; i11++) {
                int iF2 = f(c6.d(this.f118330a[i11]));
                int[] iArr2 = this.f118336g;
                int[] iArr3 = this.f118334e;
                iArr2[i11] = iArr3[iF2];
                iArr3[iF2] = i11;
                int iF3 = f(c6.d(this.f118331b[i11]));
                int[] iArr4 = this.f118337h;
                int[] iArr5 = this.f118335f;
                iArr4[i11] = iArr5[iF3];
                iArr5[iF3] = i11;
            }
        }
    }

    private static int[] n(int[] array, int newSize) {
        int length = array.length;
        int[] iArrCopyOf = Arrays.copyOf(array, newSize);
        Arrays.fill(iArrCopyOf, length, newSize, -1);
        return iArrCopyOf;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int iH = x9.h(stream);
        v(16);
        x9.c(this, stream, iH);
    }

    private void w(int entry, int keyHash) {
        com.google.common.base.j0.d(entry != -1);
        int iF = f(keyHash);
        int[] iArr = this.f118336g;
        int[] iArr2 = this.f118334e;
        iArr[entry] = iArr2[iF];
        iArr2[iF] = entry;
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        x9.i(this, stream);
    }

    private void x(int entry, int valueHash) {
        com.google.common.base.j0.d(entry != -1);
        int iF = f(valueHash);
        int[] iArr = this.f118337h;
        int[] iArr2 = this.f118335f;
        iArr[entry] = iArr2[iF];
        iArr2[iF] = entry;
    }

    private void y(int src, int dest) {
        int i10;
        int i11;
        if (src == dest) {
            return;
        }
        int i12 = this.f118340k[src];
        int i13 = this.f118341l[src];
        I(i12, dest);
        I(dest, i13);
        K[] kArr = this.f118330a;
        K k10 = kArr[src];
        V[] vArr = this.f118331b;
        V v10 = vArr[src];
        kArr[dest] = k10;
        vArr[dest] = v10;
        int iF = f(c6.d(k10));
        int[] iArr = this.f118334e;
        int i14 = iArr[iF];
        if (i14 == src) {
            iArr[iF] = dest;
        } else {
            int i15 = this.f118336g[i14];
            while (true) {
                i10 = i14;
                i14 = i15;
                if (i14 == src) {
                    break;
                } else {
                    i15 = this.f118336g[i14];
                }
            }
            this.f118336g[i10] = dest;
        }
        int[] iArr2 = this.f118336g;
        iArr2[dest] = iArr2[src];
        iArr2[src] = -1;
        int iF2 = f(c6.d(v10));
        int[] iArr3 = this.f118335f;
        int i16 = iArr3[iF2];
        if (i16 == src) {
            iArr3[iF2] = dest;
        } else {
            int i17 = this.f118337h[i16];
            while (true) {
                i11 = i16;
                i16 = i17;
                if (i16 == src) {
                    break;
                } else {
                    i17 = this.f118337h[i16];
                }
            }
            this.f118337h[i11] = dest;
        }
        int[] iArr4 = this.f118337h;
        iArr4[dest] = iArr4[src];
        iArr4[src] = -1;
    }

    @z7.a
    @fj.a
    K A(@b9 V value, @b9 K key, boolean force) {
        int iD = c6.d(value);
        int iT = t(value, iD);
        if (iT != -1) {
            K k10 = this.f118330a[iT];
            if (com.google.common.base.d0.a(k10, key)) {
                return key;
            }
            G(iT, key, force);
            return k10;
        }
        int i10 = this.f118339j;
        int iD2 = c6.d(key);
        int iQ = q(key, iD2);
        if (!force) {
            com.google.common.base.j0.u(iQ == -1, "Key already present: %s", key);
        } else if (iQ != -1) {
            i10 = this.f118340k[iQ];
            D(iQ, iD2);
        }
        m(this.f118332c + 1);
        K[] kArr = this.f118330a;
        int i11 = this.f118332c;
        kArr[i11] = key;
        this.f118331b[i11] = value;
        w(i11, iD2);
        x(this.f118332c, iD);
        int i12 = i10 == -2 ? this.f118338i : this.f118341l[i10];
        I(i10, this.f118332c);
        I(this.f118332c, i12);
        this.f118332c++;
        this.f118333d++;
        return null;
    }

    void B(int entry) {
        D(entry, c6.d(this.f118330a[entry]));
    }

    void D(int entry, int keyHash) {
        C(entry, keyHash, c6.d(this.f118331b[entry]));
    }

    void E(int entry, int valueHash) {
        C(entry, c6.d(this.f118330a[entry]), valueHash);
    }

    @fj.a
    K F(@fj.a Object value) {
        int iD = c6.d(value);
        int iT = t(value, iD);
        if (iT == -1) {
            return null;
        }
        K k10 = this.f118330a[iT];
        E(iT, iD);
        return k10;
    }

    @Override // com.google.common.collect.w
    @z7.a
    @fj.a
    public V L2(@b9 K key, @b9 V value) {
        return z(key, value, true);
    }

    @Override // com.google.common.collect.w
    public w<V, K> Y2() {
        w<V, K> wVar = this.f118345s;
        if (wVar != null) {
            return wVar;
        }
        d dVar = new d(this);
        this.f118345s = dVar;
        return dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f118330a, 0, this.f118332c, (Object) null);
        Arrays.fill(this.f118331b, 0, this.f118332c, (Object) null);
        Arrays.fill(this.f118334e, -1);
        Arrays.fill(this.f118335f, -1);
        Arrays.fill(this.f118336g, 0, this.f118332c, -1);
        Arrays.fill(this.f118337h, 0, this.f118332c, -1);
        Arrays.fill(this.f118340k, 0, this.f118332c, -1);
        Arrays.fill(this.f118341l, 0, this.f118332c, -1);
        this.f118332c = 0;
        this.f118338i = -2;
        this.f118339j = -2;
        this.f118333d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@fj.a Object key) {
        return p(key) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@fj.a Object value) {
        return s(value) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f118344o;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.f118344o = cVar;
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @fj.a
    public V get(@fj.a Object key) {
        int iP = p(key);
        if (iP == -1) {
            return null;
        }
        return this.f118331b[iP];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> fVar = this.f118342m;
        if (fVar == null) {
            fVar = new f();
            this.f118342m = fVar;
        }
        return fVar;
    }

    int o(@fj.a Object o10, int oHash, int[] hashTable, int[] nextInBucket, Object[] array) {
        int i10 = hashTable[f(oHash)];
        while (i10 != -1) {
            if (com.google.common.base.d0.a(array[i10], o10)) {
                return i10;
            }
            i10 = nextInBucket[i10];
        }
        return -1;
    }

    int p(@fj.a Object key) {
        return q(key, c6.d(key));
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.w
    @z7.a
    @fj.a
    public V put(@b9 K key, @b9 V value) {
        return z(key, value, false);
    }

    int q(@fj.a Object key, int keyHash) {
        return o(key, keyHash, this.f118334e, this.f118336g, this.f118330a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @z7.a
    @fj.a
    public V remove(@fj.a Object key) {
        int iD = c6.d(key);
        int iQ = q(key, iD);
        if (iQ == -1) {
            return null;
        }
        V v10 = this.f118331b[iQ];
        D(iQ, iD);
        return v10;
    }

    int s(@fj.a Object value) {
        return t(value, c6.d(value));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f118332c;
    }

    int t(@fj.a Object value, int valueHash) {
        return o(value, valueHash, this.f118335f, this.f118337h, this.f118331b);
    }

    @fj.a
    K u(@fj.a Object value) {
        int iS = s(value);
        if (iS == -1) {
            return null;
        }
        return this.f118330a[iS];
    }

    void v(int i10) {
        a3.b(i10, "expectedSize");
        int iA = c6.a(i10, 1.0d);
        this.f118332c = 0;
        this.f118330a = (K[]) new Object[i10];
        this.f118331b = (V[]) new Object[i10];
        this.f118334e = j(iA);
        this.f118335f = j(iA);
        this.f118336g = j(i10);
        this.f118337h = j(i10);
        this.f118338i = -2;
        this.f118339j = -2;
        this.f118340k = j(i10);
        this.f118341l = j(i10);
    }

    @fj.a
    V z(@b9 K key, @b9 V value, boolean force) {
        int iD = c6.d(key);
        int iQ = q(key, iD);
        if (iQ != -1) {
            V v10 = this.f118331b[iQ];
            if (com.google.common.base.d0.a(v10, value)) {
                return value;
            }
            H(iQ, value, force);
            return v10;
        }
        int iD2 = c6.d(value);
        int iT = t(value, iD2);
        if (!force) {
            com.google.common.base.j0.u(iT == -1, "Value already present: %s", value);
        } else if (iT != -1) {
            E(iT, iD2);
        }
        m(this.f118332c + 1);
        K[] kArr = this.f118330a;
        int i10 = this.f118332c;
        kArr[i10] = key;
        this.f118331b[i10] = value;
        w(i10, iD);
        x(this.f118332c, iD2);
        I(this.f118339j, this.f118332c);
        I(this.f118332c, -2);
        this.f118332c++;
        this.f118333d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.w
    public Set<V> values() {
        Set<V> gVar = this.f118343n;
        if (gVar == null) {
            gVar = new g();
            this.f118343n = gVar;
        }
        return gVar;
    }
}
