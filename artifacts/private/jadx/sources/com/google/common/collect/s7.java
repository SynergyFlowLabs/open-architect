package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public final class s7<K, V> extends t7<K, V> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f118088l = 16;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f118089m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @com.google.common.annotations.e
    static final double f118090n = 1.0d;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final long f118091o = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.google.common.annotations.e
    transient int f118092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient b<K, V> f118093k;

    class a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        b<K, V> f118094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        b<K, V> f118095b;

        a() {
            this.f118094a = s7.this.f118093k.b();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            b<K, V> bVar = this.f118094a;
            this.f118095b = bVar;
            this.f118094a = bVar.b();
            return bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f118094a != s7.this.f118093k;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.j0.h0(this.f118095b != null, "no calls to next() since the last call to remove()");
            s7.this.remove(this.f118095b.getKey(), this.f118095b.getValue());
            this.f118095b = null;
        }
    }

    @com.google.common.annotations.e
    static final class b<K, V> extends i6<K, V> implements d<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f118097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.a
        b<K, V> f118098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @fj.a
        private d<K, V> f118099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @fj.a
        private d<K, V> f118100g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @fj.a
        private b<K, V> f118101h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @fj.a
        private b<K, V> f118102i;

        b(@b9 K key, @b9 V value, int smearedValueHash, @fj.a b<K, V> nextInValueBucket) {
            super(key, value);
            this.f118097d = smearedValueHash;
            this.f118098e = nextInValueBucket;
        }

        static <K, V> b<K, V> f() {
            return new b<>(null, null, 0, null);
        }

        public b<K, V> a() {
            b<K, V> bVar = this.f118101h;
            Objects.requireNonNull(bVar);
            return bVar;
        }

        public b<K, V> b() {
            b<K, V> bVar = this.f118102i;
            Objects.requireNonNull(bVar);
            return bVar;
        }

        @Override // com.google.common.collect.s7.d
        public d<K, V> c() {
            d<K, V> dVar = this.f118099f;
            Objects.requireNonNull(dVar);
            return dVar;
        }

        @Override // com.google.common.collect.s7.d
        public void d(d<K, V> entry) {
            this.f118100g = entry;
        }

        boolean e(@fj.a Object v10, int smearedVHash) {
            return this.f118097d == smearedVHash && com.google.common.base.d0.a(getValue(), v10);
        }

        public void g(b<K, V> multimapPredecessor) {
            this.f118101h = multimapPredecessor;
        }

        public void h(b<K, V> multimapSuccessor) {
            this.f118102i = multimapSuccessor;
        }

        @Override // com.google.common.collect.s7.d
        public void i(d<K, V> entry) {
            this.f118099f = entry;
        }

        @Override // com.google.common.collect.s7.d
        public d<K, V> k() {
            d<K, V> dVar = this.f118100g;
            Objects.requireNonNull(dVar);
            return dVar;
        }
    }

    @com.google.common.annotations.e
    final class c extends z9.k<V> implements d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        private final K f118103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @com.google.common.annotations.e
        b<K, V>[] f118104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f118105c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f118106d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d<K, V> f118107e = this;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d<K, V> f118108f = this;

        class a implements Iterator<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            d<K, V> f118110a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @fj.a
            b<K, V> f118111b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f118112c;

            a() {
                this.f118110a = c.this.f118107e;
                this.f118112c = c.this.f118106d;
            }

            private void b() {
                if (c.this.f118106d != this.f118112c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f118110a != c.this;
            }

            @Override // java.util.Iterator
            @b9
            public V next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                b<K, V> bVar = (b) this.f118110a;
                V value = bVar.getValue();
                this.f118111b = bVar;
                this.f118110a = bVar.k();
                return value;
            }

            @Override // java.util.Iterator
            public void remove() {
                b();
                com.google.common.base.j0.h0(this.f118111b != null, "no calls to next() since the last call to remove()");
                c.this.remove(this.f118111b.getValue());
                this.f118112c = c.this.f118106d;
                this.f118111b = null;
            }
        }

        c(K key, int expectedValues) {
            this.f118103a = key;
            this.f118104b = new b[c6.a(expectedValues, 1.0d)];
        }

        private int n() {
            return this.f118104b.length - 1;
        }

        private void p() {
            if (c6.b(this.f118105c, this.f118104b.length, 1.0d)) {
                int length = this.f118104b.length * 2;
                b<K, V>[] bVarArr = new b[length];
                this.f118104b = bVarArr;
                int i10 = length - 1;
                for (d<K, V> dVarK = this.f118107e; dVarK != this; dVarK = dVarK.k()) {
                    b<K, V> bVar = (b) dVarK;
                    int i11 = bVar.f118097d & i10;
                    bVar.f118098e = bVarArr[i11];
                    bVarArr[i11] = bVar;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(@b9 V value) {
            int iD = c6.d(value);
            int iN = n() & iD;
            b<K, V> bVar = this.f118104b[iN];
            for (b<K, V> bVar2 = bVar; bVar2 != null; bVar2 = bVar2.f118098e) {
                if (bVar2.e(value, iD)) {
                    return false;
                }
            }
            b<K, V> bVar3 = new b<>(this.f118103a, value, iD, bVar);
            s7.V(this.f118108f, bVar3);
            s7.V(bVar3, this);
            s7.U(s7.this.f118093k.a(), bVar3);
            s7.U(bVar3, s7.this.f118093k);
            this.f118104b[iN] = bVar3;
            this.f118105c++;
            this.f118106d++;
            p();
            return true;
        }

        @Override // com.google.common.collect.s7.d
        public d<K, V> c() {
            return this.f118108f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f118104b, (Object) null);
            this.f118105c = 0;
            for (d<K, V> dVarK = this.f118107e; dVarK != this; dVarK = dVarK.k()) {
                s7.S((b) dVarK);
            }
            s7.V(this, this);
            this.f118106d++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            int iD = c6.d(o10);
            for (b<K, V> bVar = this.f118104b[n() & iD]; bVar != null; bVar = bVar.f118098e) {
                if (bVar.e(o10, iD)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.s7.d
        public void d(d<K, V> entry) {
            this.f118107e = entry;
        }

        @Override // com.google.common.collect.s7.d
        public void i(d<K, V> entry) {
            this.f118108f = entry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new a();
        }

        @Override // com.google.common.collect.s7.d
        public d<K, V> k() {
            return this.f118107e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @z7.a
        public boolean remove(@fj.a Object o10) {
            int iD = c6.d(o10);
            int iN = n() & iD;
            b<K, V> bVar = null;
            for (b<K, V> bVar2 = this.f118104b[iN]; bVar2 != null; bVar2 = bVar2.f118098e) {
                if (bVar2.e(o10, iD)) {
                    if (bVar == null) {
                        this.f118104b[iN] = bVar2.f118098e;
                    } else {
                        bVar.f118098e = bVar2.f118098e;
                    }
                    s7.T(bVar2);
                    s7.S(bVar2);
                    this.f118105c--;
                    this.f118106d++;
                    return true;
                }
                bVar = bVar2;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f118105c;
        }
    }

    private interface d<K, V> {
        d<K, V> c();

        void d(d<K, V> entry);

        void i(d<K, V> entry);

        d<K, V> k();
    }

    private s7(int keyCapacity, int valueSetCapacity) {
        super(d9.f(keyCapacity));
        this.f118092j = 2;
        a3.b(valueSetCapacity, "expectedValuesPerKey");
        this.f118092j = valueSetCapacity;
        b<K, V> bVarF = b.f();
        this.f118093k = bVarF;
        U(bVarF, bVarF);
    }

    public static <K, V> s7<K, V> O() {
        return new s7<>(16, 2);
    }

    public static <K, V> s7<K, V> P(int expectedKeys, int expectedValuesPerKey) {
        return new s7<>(b8.o(expectedKeys), b8.o(expectedValuesPerKey));
    }

    public static <K, V> s7<K, V> Q(k8<? extends K, ? extends V> multimap) {
        s7<K, V> s7VarP = P(multimap.keySet().size(), 2);
        s7VarP.R(multimap);
        return s7VarP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void S(b<K, V> entry) {
        U(entry.a(), entry.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void T(d<K, V> entry) {
        V(entry.c(), entry.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void U(b<K, V> pred, b<K, V> succ) {
        pred.h(succ);
        succ.g(pred);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void V(d<K, V> pred, d<K, V> succ) {
        pred.d(succ);
        succ.i(pred);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        b<K, V> bVarF = b.f();
        this.f118093k = bVarF;
        U(bVarF, bVarF);
        this.f118092j = 2;
        int i10 = stream.readInt();
        Map mapF = d9.f(12);
        for (int i11 = 0; i11 < i10; i11++) {
            Object object = stream.readObject();
            mapF.put(object, w(object));
        }
        int i12 = stream.readInt();
        for (int i13 = 0; i13 < i12; i13++) {
            Object object2 = stream.readObject();
            Object object3 = stream.readObject();
            Collection collection = (Collection) mapF.get(object2);
            Objects.requireNonNull(collection);
            collection.add(object3);
        }
        D(mapF);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(keySet().size());
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            stream.writeObject(it.next());
        }
        stream.writeInt(size());
        for (Map.Entry<K, V> entry : u()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.m, com.google.common.collect.e
    /* JADX INFO: renamed from: H */
    public Set<V> u() {
        return d9.g(this.f118092j);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean I0(@fj.a Object key, @fj.a Object value) {
        return super.I0(key, value);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean R(k8 multimap) {
        return super.R(multimap);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public /* bridge */ /* synthetic */ Set c(@fj.a Object key) {
        return super.c(key);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.k8
    public void clear() {
        super.clear();
        b<K, V> bVar = this.f118093k;
        U(bVar, bVar);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean containsKey(@fj.a Object key) {
        return super.containsKey(key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean containsValue(@fj.a Object value) {
        return super.containsValue(value);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    public /* bridge */ /* synthetic */ boolean equals(@fj.a Object object) {
        return super.equals(object);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: get */
    public /* bridge */ /* synthetic */ Set x(@b9 Object key) {
        return super.x(key);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h
    Iterator<Map.Entry<K, V>> h() {
        return new a();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h
    Iterator<V> i() {
        return b8.R0(h());
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public Set<K> keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ q8 keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    public /* bridge */ /* synthetic */ Map l() {
        return super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean put(@b9 Object key, @b9 Object value) {
        return super.put(key, value);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean remove(@fj.a Object key, @fj.a Object value) {
        return super.remove(key, value);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public /* bridge */ /* synthetic */ boolean v(@b9 Object key, Iterable values) {
        return super.v(key, values);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.e
    Collection<V> w(@b9 K key) {
        return new c(key, this.f118092j);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public Set<V> d(@b9 K key, Iterable<? extends V> values) {
        return super.d((Object) key, (Iterable) values);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: k */
    public Set<Map.Entry<K, V>> u() {
        return super.u();
    }
}
