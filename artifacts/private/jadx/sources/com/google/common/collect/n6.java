package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@z7.f("Use ImmutableMap.of or another implementation")
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public abstract class n6<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Map.Entry<?, ?>[] f117748e = new Map.Entry[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f117749f = 912559;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a8.b
    @r9.j
    @fj.a
    private transient z6<Map.Entry<K, V>> f117750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.b
    @r9.j
    @fj.a
    private transient z6<K> f117751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a8.b
    @r9.j
    @fj.a
    private transient h6<V> f117752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient a7<K, V> f117753d;

    class a extends nb<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ nb f117754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n6 f117755b;

        a(final n6 this$0, final nb val$entryIterator) {
            this.f117754a = val$entryIterator;
            this.f117755b = this$0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f117754a.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.f117754a.next()).getKey();
        }
    }

    @z7.f
    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        Comparator<? super V> f117756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f117757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f117758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f117759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        a f117760e;

        static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f117761a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f117762b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Object f117763c;

            a(Object key, Object value1, Object value2) {
                this.f117761a = key;
                this.f117762b = value1;
                this.f117763c = value2;
            }

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f117761a + "=" + this.f117762b + " and " + this.f117761a + "=" + this.f117763c);
            }
        }

        public b() {
            this(4);
        }

        private n6<K, V> b(boolean throwIfDuplicateKeys) {
            Object[] objArrG;
            a aVar;
            a aVar2;
            if (throwIfDuplicateKeys && (aVar2 = this.f117760e) != null) {
                throw aVar2.a();
            }
            int length = this.f117758c;
            if (this.f117756a == null) {
                objArrG = this.f117757b;
            } else {
                if (this.f117759d) {
                    this.f117757b = Arrays.copyOf(this.f117757b, length * 2);
                }
                objArrG = this.f117757b;
                if (!throwIfDuplicateKeys) {
                    objArrG = g(objArrG, this.f117758c);
                    if (objArrG.length < this.f117757b.length) {
                        length = objArrG.length >>> 1;
                    }
                }
                m(objArrG, length, this.f117756a);
            }
            this.f117759d = true;
            n9 n9VarH = n9.H(length, objArrG, this);
            if (throwIfDuplicateKeys && (aVar = this.f117760e) != null) {
                throw aVar.a();
            }
            return n9VarH;
        }

        private void f(int minCapacity) {
            int i10 = minCapacity * 2;
            Object[] objArr = this.f117757b;
            if (i10 > objArr.length) {
                this.f117757b = Arrays.copyOf(objArr, h6.b.f(objArr.length, i10));
                this.f117759d = false;
            }
        }

        private Object[] g(Object[] localAlternatingKeysAndValues, int size) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                Object obj = localAlternatingKeysAndValues[i10 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i10);
                }
            }
            if (bitSet.isEmpty()) {
                return localAlternatingKeysAndValues;
            }
            Object[] objArr = new Object[(size - bitSet.cardinality()) * 2];
            int i11 = 0;
            int i12 = 0;
            while (i11 < size * 2) {
                if (bitSet.get(i11 >>> 1)) {
                    i11 += 2;
                } else {
                    int i13 = i12 + 1;
                    int i14 = i11 + 1;
                    Object obj2 = localAlternatingKeysAndValues[i11];
                    Objects.requireNonNull(obj2);
                    objArr[i12] = obj2;
                    i12 += 2;
                    i11 += 2;
                    Object obj3 = localAlternatingKeysAndValues[i14];
                    Objects.requireNonNull(obj3);
                    objArr[i13] = obj3;
                }
            }
            return objArr;
        }

        static <V> void m(Object[] alternatingKeysAndValues, int size, Comparator<? super V> valueComparator) {
            Map.Entry[] entryArr = new Map.Entry[size];
            for (int i10 = 0; i10 < size; i10++) {
                int i11 = i10 * 2;
                Object obj = alternatingKeysAndValues[i11];
                Objects.requireNonNull(obj);
                Object obj2 = alternatingKeysAndValues[i11 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i10] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, size, a9.i(valueComparator).D(b8.Q0()));
            for (int i12 = 0; i12 < size; i12++) {
                int i13 = i12 * 2;
                alternatingKeysAndValues[i13] = entryArr[i12].getKey();
                alternatingKeysAndValues[i13 + 1] = entryArr[i12].getValue();
            }
        }

        public n6<K, V> a() {
            return d();
        }

        public n6<K, V> c() {
            return b(false);
        }

        public n6<K, V> d() {
            return b(true);
        }

        @z7.a
        b<K, V> e(b<K, V> other) {
            com.google.common.base.j0.E(other);
            f(this.f117758c + other.f117758c);
            System.arraycopy(other.f117757b, 0, this.f117757b, this.f117758c * 2, other.f117758c * 2);
            this.f117758c += other.f117758c;
            return this;
        }

        @z7.a
        public b<K, V> h(Comparator<? super V> valueComparator) {
            com.google.common.base.j0.h0(this.f117756a == null, "valueComparator was already set");
            this.f117756a = (Comparator) com.google.common.base.j0.F(valueComparator, "valueComparator");
            return this;
        }

        @z7.a
        public b<K, V> i(K key, V value) {
            f(this.f117758c + 1);
            a3.a(key, value);
            Object[] objArr = this.f117757b;
            int i10 = this.f117758c;
            objArr[i10 * 2] = key;
            objArr[(i10 * 2) + 1] = value;
            this.f117758c = i10 + 1;
            return this;
        }

        @z7.a
        public b<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            return i(entry.getKey(), entry.getValue());
        }

        @z7.a
        public b<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            if (entries instanceof Collection) {
                f(this.f117758c + ((Collection) entries).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = entries.iterator();
            while (it.hasNext()) {
                j(it.next());
            }
            return this;
        }

        @z7.a
        public b<K, V> l(Map<? extends K, ? extends V> map) {
            return k(map.entrySet());
        }

        b(int initialCapacity) {
            this.f117757b = new Object[initialCapacity * 2];
            this.f117758c = 0;
            this.f117759d = false;
        }
    }

    static abstract class c<K, V> extends n6<K, V> {

        class a extends o6<K, V> {
            a() {
            }

            @Override // com.google.common.collect.o6
            n6<K, V> R() {
                return c.this;
            }

            @Override // com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* JADX INFO: renamed from: n */
            public nb<Map.Entry<K, V>> iterator() {
                return c.this.G();
            }

            @Override // com.google.common.collect.o6, com.google.common.collect.z6, com.google.common.collect.h6
            @com.google.common.annotations.c
            @com.google.common.annotations.d
            Object writeReplace() {
                return super.writeReplace();
            }
        }

        c() {
        }

        abstract nb<Map.Entry<K, V>> G();

        @Override // com.google.common.collect.n6, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.n6
        z6<Map.Entry<K, V>> h() {
            return new a();
        }

        @Override // com.google.common.collect.n6
        z6<K> i() {
            return new p6(this);
        }

        @Override // com.google.common.collect.n6
        h6<V> j() {
            return new q6(this);
        }

        @Override // com.google.common.collect.n6, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.n6, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }

        @Override // com.google.common.collect.n6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class d extends c<K, z6<V>> {

        class a extends nb<Map.Entry<K, z6<V>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Iterator f117766a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f117767b;

            /* JADX INFO: renamed from: com.google.common.collect.n6$d$a$a, reason: collision with other inner class name */
            class C1069a extends g<K, z6<V>> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Map.Entry f117768a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f117769b;

                C1069a(final a this$2, final Map.Entry val$backingEntry) {
                    this.f117768a = val$backingEntry;
                    this.f117769b = this$2;
                }

                @Override // com.google.common.collect.g, java.util.Map.Entry
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public z6<V> getValue() {
                    return z6.J(this.f117768a.getValue());
                }

                @Override // com.google.common.collect.g, java.util.Map.Entry
                public K getKey() {
                    return (K) this.f117768a.getKey();
                }
            }

            a(final d this$1, final Iterator val$backingIterator) {
                this.f117766a = val$backingIterator;
                this.f117767b = this$1;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, z6<V>> next() {
                return new C1069a(this, (Map.Entry) this.f117766a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f117766a.hasNext();
            }
        }

        private d() {
        }

        @Override // com.google.common.collect.n6.c
        nb<Map.Entry<K, z6<V>>> G() {
            return new a(this, n6.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.n6, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public z6<V> get(@fj.a Object key) {
            Object obj = n6.this.get(key);
            if (obj == null) {
                return null;
            }
            return z6.J(obj);
        }

        @Override // com.google.common.collect.n6, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return n6.this.containsKey(key);
        }

        @Override // com.google.common.collect.n6, java.util.Map
        public int hashCode() {
            return n6.this.hashCode();
        }

        @Override // com.google.common.collect.n6.c, com.google.common.collect.n6
        z6<K> i() {
            return n6.this.keySet();
        }

        @Override // com.google.common.collect.n6
        boolean m() {
            return n6.this.m();
        }

        @Override // com.google.common.collect.n6
        boolean n() {
            return n6.this.n();
        }

        @Override // java.util.Map
        public int size() {
            return n6.this.size();
        }

        @Override // com.google.common.collect.n6.c, com.google.common.collect.n6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }

        /* synthetic */ d(n6 n6Var, a aVar) {
            this();
        }
    }

    @com.google.common.annotations.d
    static class e<K, V> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final boolean f117770c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f117771d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f117772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f117773b;

        e(n6<K, V> map) {
            Object[] objArr = new Object[map.size()];
            Object[] objArr2 = new Object[map.size()];
            nb<Map.Entry<K, V>> it = map.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i10] = next.getKey();
                objArr2[i10] = next.getValue();
                i10++;
            }
            this.f117772a = objArr;
            this.f117773b = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final Object a() {
            Object[] objArr = (Object[]) this.f117772a;
            Object[] objArr2 = (Object[]) this.f117773b;
            b<K, V> bVarB = b(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                bVarB.i(objArr[i10], objArr2[i10]);
            }
            return bVarB.d();
        }

        b<K, V> b(int size) {
            return new b<>(size);
        }

        final Object readResolve() {
            Object obj = this.f117772a;
            if (!(obj instanceof z6)) {
                return a();
            }
            z6 z6Var = (z6) obj;
            h6 h6Var = (h6) this.f117773b;
            b<K, V> bVarB = b(z6Var.size());
            nb it = z6Var.iterator();
            nb it2 = h6Var.iterator();
            while (it.hasNext()) {
                bVarB.i(it.next(), it2.next());
            }
            return bVarB.d();
        }
    }

    n6() {
    }

    public static <K, V> n6<K, V> A(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        a3.a(k13, v13);
        a3.a(k14, v14);
        a3.a(k15, v15);
        a3.a(k16, v16);
        a3.a(k17, v17);
        a3.a(k18, v18);
        return n9.G(9, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18});
    }

    public static <K, V> n6<K, V> B(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        a3.a(k13, v13);
        a3.a(k14, v14);
        a3.a(k15, v15);
        a3.a(k16, v16);
        a3.a(k17, v17);
        a3.a(k18, v18);
        a3.a(k19, v19);
        return n9.G(10, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19});
    }

    @SafeVarargs
    public static <K, V> n6<K, V> C(Map.Entry<? extends K, ? extends V>... entries) {
        return f(Arrays.asList(entries));
    }

    @d6
    public static <T, K, V> Collector<T, ?, n6<K, V>> D(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return y2.N(keyFunction, valueFunction);
    }

    @d6
    public static <T, K, V> Collector<T, ?, n6<K, V>> E(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        return y2.O(keyFunction, valueFunction, mergeFunction);
    }

    public static <K, V> b<K, V> b() {
        return new b<>();
    }

    public static <K, V> b<K, V> c(int expectedSize) {
        a3.b(expectedSize, "expectedSize");
        return new b<>(expectedSize);
    }

    static void d(boolean safe, String conflictDescription, Object entry1, Object entry2) {
        if (!safe) {
            throw e(conflictDescription, entry1, entry2);
        }
    }

    static IllegalArgumentException e(String conflictDescription, Object entry1, Object entry2) {
        return new IllegalArgumentException("Multiple entries with same " + conflictDescription + ": " + entry1 + " and " + entry2);
    }

    public static <K, V> n6<K, V> f(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        b bVar = new b(entries instanceof Collection ? ((Collection) entries).size() : 4);
        bVar.k(entries);
        return bVar.a();
    }

    public static <K, V> n6<K, V> g(Map<? extends K, ? extends V> map) {
        if ((map instanceof n6) && !(map instanceof SortedMap)) {
            n6<K, V> n6Var = (n6) map;
            if (!n6Var.n()) {
                return n6Var;
            }
        }
        return f(map.entrySet());
    }

    static <K, V> Map.Entry<K, V> k(K key, V value) {
        a3.a(key, value);
        return new AbstractMap.SimpleImmutableEntry(key, value);
    }

    public static <K, V> n6<K, V> q() {
        return (n6<K, V>) n9.f117816o;
    }

    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <K, V> n6<K, V> s(K k10, V v10) {
        a3.a(k10, v10);
        return n9.G(1, new Object[]{k10, v10});
    }

    public static <K, V> n6<K, V> t(K k10, V v10, K k11, V v11) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        return n9.G(2, new Object[]{k10, v10, k11, v11});
    }

    public static <K, V> n6<K, V> u(K k10, V v10, K k11, V v11, K k12, V v12) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        return n9.G(3, new Object[]{k10, v10, k11, v11, k12, v12});
    }

    public static <K, V> n6<K, V> v(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        a3.a(k13, v13);
        int i10 = 1 << 4;
        return n9.G(4, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13});
    }

    public static <K, V> n6<K, V> w(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        a3.a(k13, v13);
        a3.a(k14, v14);
        return n9.G(5, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14});
    }

    public static <K, V> n6<K, V> x(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        a3.a(k13, v13);
        a3.a(k14, v14);
        a3.a(k15, v15);
        return n9.G(6, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15});
    }

    public static <K, V> n6<K, V> y(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        a3.a(k13, v13);
        a3.a(k14, v14);
        a3.a(k15, v15);
        a3.a(k16, v16);
        return n9.G(7, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16});
    }

    public static <K, V> n6<K, V> z(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        a3.a(k13, v13);
        a3.a(k14, v14);
        a3.a(k15, v15);
        a3.a(k16, v16);
        a3.a(k17, v17);
        return n9.G(8, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17});
    }

    @Override // java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public h6<V> values() {
        h6<V> h6Var = this.f117752c;
        if (h6Var != null) {
            return h6Var;
        }
        h6<V> h6VarJ = j();
        this.f117752c = h6VarJ;
        return h6VarJ;
    }

    public a7<K, V> a() {
        if (isEmpty()) {
            return a7.b0();
        }
        a7<K, V> a7Var = this.f117753d;
        if (a7Var != null) {
            return a7Var;
        }
        a7<K, V> a7Var2 = new a7<>(new d(this, null), size(), null);
        this.f117753d = a7Var2;
        return a7Var2;
    }

    @Override // java.util.Map
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@fj.a Object key) {
        return get(key) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@fj.a Object value) {
        return values().contains(value);
    }

    @Override // java.util.Map
    public boolean equals(@fj.a Object object) {
        return b8.w(this, object);
    }

    @Override // java.util.Map
    @fj.a
    public abstract V get(@fj.a Object key);

    @Override // java.util.Map
    @fj.a
    public final V getOrDefault(@fj.a Object key, @fj.a V defaultValue) {
        V v10 = get(key);
        return v10 != null ? v10 : defaultValue;
    }

    abstract z6<Map.Entry<K, V>> h();

    @Override // java.util.Map
    public int hashCode() {
        return z9.k(entrySet());
    }

    abstract z6<K> i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    abstract h6<V> j();

    @Override // java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public z6<Map.Entry<K, V>> entrySet() {
        z6<Map.Entry<K, V>> z6VarH = this.f117750a;
        if (z6VarH == null) {
            z6VarH = h();
            this.f117750a = z6VarH;
        }
        return z6VarH;
    }

    boolean m() {
        return false;
    }

    abstract boolean n();

    nb<K> o() {
        return new a(this, entrySet().iterator());
    }

    @Override // java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public z6<K> keySet() {
        z6<K> z6Var = this.f117751b;
        if (z6Var != null) {
            return z6Var;
        }
        z6<K> z6VarI = i();
        this.f117751b = z6VarI;
        return z6VarI;
    }

    @Override // java.util.Map
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @z7.a
    @Deprecated
    @fj.a
    public final V remove(@fj.a Object o10) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return b8.y0(this);
    }

    @com.google.common.annotations.d
    Object writeReplace() {
        return new e(this);
    }
}
