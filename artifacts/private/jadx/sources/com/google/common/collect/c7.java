package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public final class c7<K, V> extends n6<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Comparator<?> f117244j = a9.z();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final c7<Comparable<?>, Object> f117245k = new c7<>(j7.m0(a9.z()), l6.F());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f117246l = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient r9<K> f117247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient l6<V> f117248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @fj.a
    private transient c7<K, V> f117249i;

    class a extends o6<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.c7$a$a, reason: collision with other inner class name */
        class C1056a extends l6<Map.Entry<K, V>> {
            C1056a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int index) {
                return new AbstractMap.SimpleImmutableEntry(c7.this.f117247g.c().get(index), c7.this.f117248h.get(index));
            }

            @Override // com.google.common.collect.h6
            boolean m() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return c7.this.size();
            }

            @Override // com.google.common.collect.l6, com.google.common.collect.h6
            @com.google.common.annotations.c
            @com.google.common.annotations.d
            Object writeReplace() {
                return super.writeReplace();
            }
        }

        a() {
        }

        @Override // com.google.common.collect.z6
        l6<Map.Entry<K, V>> D() {
            return new C1056a();
        }

        @Override // com.google.common.collect.o6
        n6<K, V> R() {
            return c7.this;
        }

        @Override // com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: n */
        public nb<Map.Entry<K, V>> iterator() {
            return c().iterator();
        }

        @Override // com.google.common.collect.o6, com.google.common.collect.z6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static class b<K, V> extends n6.b<K, V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private transient Object[] f117252f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private transient Object[] f117253g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Comparator<? super K> f117254h;

        public b(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        private void f(int minCapacity) {
            Object[] objArr = this.f117252f;
            if (minCapacity > objArr.length) {
                int iF = h6.b.f(objArr.length, minCapacity);
                this.f117252f = Arrays.copyOf(this.f117252f, iF);
                this.f117253g = Arrays.copyOf(this.f117253g, iF);
            }
        }

        @Override // com.google.common.collect.n6.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public c7<K, V> a() {
            return d();
        }

        @Override // com.google.common.collect.n6.b
        @z7.e
        @Deprecated
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final c7<K, V> c() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }

        @Override // com.google.common.collect.n6.b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public c7<K, V> d() {
            int i10 = this.f117758c;
            if (i10 == 0) {
                return c7.W(this.f117254h);
            }
            if (i10 == 1) {
                Comparator<? super K> comparator = this.f117254h;
                Object obj = this.f117252f[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.f117253g[0];
                Objects.requireNonNull(obj2);
                return c7.D0(comparator, obj, obj2);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f117252f, i10);
            Arrays.sort(objArrCopyOf, this.f117254h);
            Object[] objArr = new Object[this.f117758c];
            for (int i11 = 0; i11 < this.f117758c; i11++) {
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    if (this.f117254h.compare(objArrCopyOf[i12], objArrCopyOf[i11]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i12] + " and " + objArrCopyOf[i11]);
                    }
                }
                Object obj3 = this.f117252f[i11];
                Objects.requireNonNull(obj3);
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, this.f117254h);
                Object obj4 = this.f117253g[i11];
                Objects.requireNonNull(obj4);
                objArr[iBinarySearch] = obj4;
            }
            return new c7<>(new r9(l6.p(objArrCopyOf), this.f117254h), l6.p(objArr));
        }

        @z7.a
        b<K, V> q(b<K, V> other) {
            f(this.f117758c + other.f117758c);
            System.arraycopy(other.f117252f, 0, this.f117252f, this.f117758c, other.f117758c);
            System.arraycopy(other.f117253g, 0, this.f117253g, this.f117758c, other.f117758c);
            this.f117758c += other.f117758c;
            return this;
        }

        @Override // com.google.common.collect.n6.b
        @z7.a
        @Deprecated
        @z7.e("Always throws UnsupportedOperationException")
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final b<K, V> h(Comparator<? super V> valueComparator) {
            throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        }

        @Override // com.google.common.collect.n6.b
        @z7.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b<K, V> i(K key, V value) {
            f(this.f117758c + 1);
            a3.a(key, value);
            Object[] objArr = this.f117252f;
            int i10 = this.f117758c;
            objArr[i10] = key;
            this.f117253g[i10] = value;
            this.f117758c = i10 + 1;
            return this;
        }

        @Override // com.google.common.collect.n6.b
        @z7.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            super.j(entry);
            return this;
        }

        @Override // com.google.common.collect.n6.b
        @z7.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            super.k(entries);
            return this;
        }

        @Override // com.google.common.collect.n6.b
        @z7.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b<K, V> l(Map<? extends K, ? extends V> map) {
            super.l(map);
            return this;
        }

        private b(Comparator<? super K> comparator, int initialCapacity) {
            this.f117254h = (Comparator) com.google.common.base.j0.E(comparator);
            this.f117252f = new Object[initialCapacity];
            this.f117253g = new Object[initialCapacity];
        }
    }

    @com.google.common.annotations.d
    private static class c<K, V> extends n6.e<K, V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f117255f = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Comparator<? super K> f117256e;

        c(c7<K, V> sortedMap) {
            super(sortedMap);
            this.f117256e = sortedMap.comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.n6.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b<K, V> b(int size) {
            return new b<>(this.f117256e);
        }
    }

    c7(r9<K> keySet, l6<V> valueList) {
        this(keySet, valueList, null);
    }

    @z7.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> c7<K, V> A0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> c7<K, V> B0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> c7<K, V> C0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        throw new UnsupportedOperationException();
    }

    @d6
    @Deprecated
    @z7.e("Use toImmutableSortedMap")
    public static <T, K, V> Collector<T, ?, n6<K, V>> D(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> c7<K, V> D0(Comparator<? super K> comparator, K k10, V v10) {
        return new c7<>(new r9(l6.G(k10), (Comparator) com.google.common.base.j0.E(comparator)), l6.G(v10));
    }

    @d6
    @Deprecated
    @z7.e("Use toImmutableSortedMap")
    public static <T, K, V> Collector<T, ?, n6<K, V>> E(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @SafeVarargs
    @z7.e("ImmutableSortedMap.ofEntries not currently available; use ImmutableSortedMap.copyOf")
    public static <K, V> c7<K, V> E0(Map.Entry<? extends K, ? extends V>... entries) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> b<K, V> F0(Comparator<K> comparator) {
        return new b<>(comparator);
    }

    public static /* synthetic */ int G(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        Objects.requireNonNull(entry);
        Objects.requireNonNull(entry2);
        return comparator.compare(entry.getKey(), entry2.getKey());
    }

    public static <K extends Comparable<?>, V> b<K, V> G0() {
        return new b<>(a9.z().E());
    }

    @z7.e("Use naturalOrder")
    @Deprecated
    public static <K, V> b<K, V> K() {
        throw new UnsupportedOperationException();
    }

    @z7.e("Use naturalOrder (which does not accept an expected size)")
    @Deprecated
    public static <K, V> b<K, V> L(int expectedSize) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> c7<K, V> M(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return O(entries, (a9) f117244j);
    }

    @d6
    public static <T, K, V> Collector<T, ?, c7<K, V>> M0(Comparator<? super K> comparator, Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return y2.U(comparator, keyFunction, valueFunction);
    }

    @d6
    public static <T, K, V> Collector<T, ?, c7<K, V>> N0(Comparator<? super K> comparator, Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        return y2.V(comparator, keyFunction, valueFunction, mergeFunction);
    }

    public static <K, V> c7<K, V> O(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries, Comparator<? super K> comparator) {
        return X((Comparator) com.google.common.base.j0.E(comparator), false, entries);
    }

    public static <K, V> c7<K, V> P(Map<? extends K, ? extends V> map) {
        return R(map, (a9) f117244j);
    }

    public static <K, V> c7<K, V> Q(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return R(map, (Comparator) com.google.common.base.j0.E(comparator));
    }

    private static <K, V> c7<K, V> R(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean zEquals = false;
        if (map instanceof SortedMap) {
            Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                zEquals = comparator.equals(comparator2);
            } else if (comparator == f117244j) {
                zEquals = true;
            }
        }
        if (zEquals && (map instanceof c7)) {
            c7<K, V> c7Var = (c7) map;
            if (!c7Var.n()) {
                return c7Var;
            }
        }
        return X(comparator, zEquals, map.entrySet());
    }

    public static <K, V> c7<K, V> S(SortedMap<K, ? extends V> map) {
        Comparator comparator = map.comparator();
        if (comparator == null) {
            comparator = f117244j;
        }
        if (map instanceof c7) {
            c7<K, V> c7Var = (c7) map;
            if (!c7Var.n()) {
                return c7Var;
            }
        }
        return X(comparator, true, map.entrySet());
    }

    static <K, V> c7<K, V> W(Comparator<? super K> comparator) {
        return a9.z().equals(comparator) ? h0() : new c7<>(j7.m0(comparator), l6.F());
    }

    private static <K, V> c7<K, V> X(Comparator<? super K> comparator, boolean sameComparator, Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        Map.Entry[] entryArr = (Map.Entry[]) o7.R(entries, n6.f117748e);
        return Z(comparator, sameComparator, entryArr, entryArr.length);
    }

    private static <K, V> c7<K, V> Z(final Comparator<? super K> comparator, boolean sameComparator, Map.Entry<K, V>[] entryArray, int size) {
        if (size == 0) {
            return W(comparator);
        }
        if (size == 1) {
            Map.Entry<K, V> entry = entryArray[0];
            Objects.requireNonNull(entry);
            Map.Entry<K, V> entry2 = entry;
            return D0(comparator, entry2.getKey(), entry2.getValue());
        }
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        if (sameComparator) {
            for (int i10 = 0; i10 < size; i10++) {
                Map.Entry<K, V> entry3 = entryArray[i10];
                Objects.requireNonNull(entry3);
                Map.Entry<K, V> entry4 = entry3;
                K key = entry4.getKey();
                V value = entry4.getValue();
                a3.a(key, value);
                objArr[i10] = key;
                objArr2[i10] = value;
            }
        } else {
            Arrays.sort(entryArray, 0, size, new Comparator() { // from class: com.google.common.collect.b7
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return c7.G(comparator, (Map.Entry) obj, (Map.Entry) obj2);
                }
            });
            Map.Entry<K, V> entry5 = entryArray[0];
            Objects.requireNonNull(entry5);
            Map.Entry<K, V> entry6 = entry5;
            Object key2 = entry6.getKey();
            objArr[0] = key2;
            V value2 = entry6.getValue();
            objArr2[0] = value2;
            a3.a(objArr[0], value2);
            int i11 = 1;
            while (i11 < size) {
                Map.Entry<K, V> entry7 = entryArray[i11 - 1];
                Objects.requireNonNull(entry7);
                Map.Entry<K, V> entry8 = entry7;
                Map.Entry<K, V> entry9 = entryArray[i11];
                Objects.requireNonNull(entry9);
                Map.Entry<K, V> entry10 = entry9;
                Object key3 = entry10.getKey();
                V value3 = entry10.getValue();
                a3.a(key3, value3);
                objArr[i11] = key3;
                objArr2[i11] = value3;
                n6.d(comparator.compare(key2, key3) != 0, "key", entry8, entry10);
                i11++;
                key2 = key3;
            }
        }
        return new c7<>(new r9(l6.p(objArr), comparator), l6.p(objArr2));
    }

    private static <K extends Comparable<? super K>, V> c7<K, V> a0(Map.Entry<K, V>... entries) {
        return Z(a9.z(), false, entries, entries.length);
    }

    private c7<K, V> b0(int fromIndex, int toIndex) {
        if (fromIndex == 0 && toIndex == size()) {
            return this;
        }
        return fromIndex == toIndex ? W(comparator()) : new c7<>(this.f117247g.a1(fromIndex, toIndex), this.f117248h.subList(fromIndex, toIndex));
    }

    public static <K extends Comparable<?>, V> b<K, V> f0() {
        return new b<>(a9.z());
    }

    public static <K, V> c7<K, V> h0() {
        return (c7<K, V>) f117245k;
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/c7<TK;TV;>; */
    public static c7 i0(Comparable k10, Object v10) {
        return D0(a9.z(), k10, v10);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/c7<TK;TV;>; */
    public static c7 j0(Comparable k10, Object v10, Comparable k11, Object v11) {
        return a0(n6.k(k10, v10), n6.k(k11, v11));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/c7<TK;TV;>; */
    public static c7 k0(Comparable k10, Object v10, Comparable k11, Object v11, Comparable k12, Object v12) {
        return a0(n6.k(k10, v10), n6.k(k11, v11), n6.k(k12, v12));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/c7<TK;TV;>; */
    public static c7 l0(Comparable k10, Object v10, Comparable k11, Object v11, Comparable k12, Object v12, Comparable k13, Object v13) {
        return a0(n6.k(k10, v10), n6.k(k11, v11), n6.k(k12, v12), n6.k(k13, v13));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/c7<TK;TV;>; */
    public static c7 m0(Comparable k10, Object v10, Comparable k11, Object v11, Comparable k12, Object v12, Comparable k13, Object v13, Comparable k14, Object v14) {
        return a0(n6.k(k10, v10), n6.k(k11, v11), n6.k(k12, v12), n6.k(k13, v13), n6.k(k14, v14));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/c7<TK;TV;>; */
    public static c7 n0(Comparable k10, Object v10, Comparable k11, Object v11, Comparable k12, Object v12, Comparable k13, Object v13, Comparable k14, Object v14, Comparable k15, Object v15) {
        return a0(n6.k(k10, v10), n6.k(k11, v11), n6.k(k12, v12), n6.k(k13, v13), n6.k(k14, v14), n6.k(k15, v15));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/c7<TK;TV;>; */
    public static c7 p0(Comparable k10, Object v10, Comparable k11, Object v11, Comparable k12, Object v12, Comparable k13, Object v13, Comparable k14, Object v14, Comparable k15, Object v15, Comparable k16, Object v16) {
        int i10 = 3 ^ 4;
        return a0(n6.k(k10, v10), n6.k(k11, v11), n6.k(k12, v12), n6.k(k13, v13), n6.k(k14, v14), n6.k(k15, v15), n6.k(k16, v16));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/c7<TK;TV;>; */
    public static c7 q0(Comparable k10, Object v10, Comparable k11, Object v11, Comparable k12, Object v12, Comparable k13, Object v13, Comparable k14, Object v14, Comparable k15, Object v15, Comparable k16, Object v16, Comparable k17, Object v17) {
        return a0(n6.k(k10, v10), n6.k(k11, v11), n6.k(k12, v12), n6.k(k13, v13), n6.k(k14, v14), n6.k(k15, v15), n6.k(k16, v16), n6.k(k17, v17));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/c7<TK;TV;>; */
    public static c7 r0(Comparable k10, Object v10, Comparable k11, Object v11, Comparable k12, Object v12, Comparable k13, Object v13, Comparable k14, Object v14, Comparable k15, Object v15, Comparable k16, Object v16, Comparable k17, Object v17, Comparable k18, Object v18) {
        return a0(n6.k(k10, v10), n6.k(k11, v11), n6.k(k12, v12), n6.k(k13, v13), n6.k(k14, v14), n6.k(k15, v15), n6.k(k16, v16), n6.k(k17, v17), n6.k(k18, v18));
    }

    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/c7<TK;TV;>; */
    public static c7 s0(Comparable k10, Object v10, Comparable k11, Object v11, Comparable k12, Object v12, Comparable k13, Object v13, Comparable k14, Object v14, Comparable k15, Object v15, Comparable k16, Object v16, Comparable k17, Object v17, Comparable k18, Object v18, Comparable k19, Object v19) {
        return a0(n6.k(k10, v10), n6.k(k11, v11), n6.k(k12, v12), n6.k(k13, v13), n6.k(k14, v14), n6.k(k15, v15), n6.k(k16, v16), n6.k(k17, v17), n6.k(k18, v18), n6.k(k19, v19));
    }

    @z7.e("Pass a key of type Comparable")
    @Deprecated
    public static <K, V> c7<K, V> t0(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> c7<K, V> u0(K k10, V v10, K k11, V v11) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> c7<K, V> v0(K k10, V v10, K k11, V v11, K k12, V v12) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> c7<K, V> w0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> c7<K, V> x0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> c7<K, V> y0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> c7<K, V> z0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.n6, java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: F */
    public h6<V> values() {
        return this.f117248h;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public c7<K, V> subMap(K fromKey, K toKey) {
        return subMap(fromKey, true, toKey, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public c7<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
        boolean z10;
        com.google.common.base.j0.E(fromKey);
        com.google.common.base.j0.E(toKey);
        if (comparator().compare(fromKey, toKey) <= 0) {
            z10 = true;
            boolean z11 = false | true;
        } else {
            z10 = false;
        }
        com.google.common.base.j0.y(z10, "expected fromKey <= toKey but %s > %s", fromKey, toKey);
        return headMap(toKey, toInclusive).tailMap(fromKey, fromInclusive);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public c7<K, V> tailMap(K fromKey) {
        return tailMap(fromKey, true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public c7<K, V> tailMap(K k10, boolean z10) {
        return b0(this.f117247g.d1((K) com.google.common.base.j0.E(k10), z10), size());
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public j7<K> descendingKeySet() {
        return this.f117247g.descendingSet();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public c7<K, V> descendingMap() {
        c7<K, V> c7Var = this.f117249i;
        if (c7Var == null) {
            if (isEmpty()) {
                return W(a9.i(comparator()).E());
            }
            c7Var = new c7<>((r9) this.f117247g.descendingSet(), this.f117248h.U(), this);
        }
        return c7Var;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public c7<K, V> headMap(K toKey) {
        return headMap(toKey, false);
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> ceilingEntry(K key) {
        return tailMap(key, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public K ceilingKey(K k10) {
        return (K) b8.T(ceilingEntry(k10));
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public c7<K, V> headMap(K k10, boolean z10) {
        return b0(0, this.f117247g.c1((K) com.google.common.base.j0.E(k10), z10));
    }

    @Override // com.google.common.collect.n6
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public j7<K> keySet() {
        return this.f117247g;
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().c().get(0);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> floorEntry(K key) {
        return headMap(key, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public K floorKey(K k10) {
        return (K) b8.T(floorEntry(k10));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public j7<K> navigableKeySet() {
        return this.f117247g;
    }

    @Override // com.google.common.collect.n6, java.util.Map
    @fj.a
    public V get(@fj.a Object key) {
        int iIndexOf = this.f117247g.indexOf(key);
        int i10 = 7 ^ (-1);
        if (iIndexOf == -1) {
            return null;
        }
        return this.f117248h.get(iIndexOf);
    }

    @Override // com.google.common.collect.n6
    z6<Map.Entry<K, V>> h() {
        return isEmpty() ? z6.G() : new a();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> higherEntry(K key) {
        return tailMap(key, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public K higherKey(K k10) {
        return (K) b8.T(higherEntry(k10));
    }

    @Override // com.google.common.collect.n6
    z6<K> i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.n6
    h6<V> j() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.n6, java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: l */
    public z6<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().c().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return keySet().last();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> lowerEntry(K key) {
        return headMap(key, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public K lowerKey(K k10) {
        return (K) b8.T(lowerEntry(k10));
    }

    @Override // com.google.common.collect.n6
    boolean n() {
        return this.f117247g.m() || this.f117248h.m();
    }

    @Override // java.util.NavigableMap
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.f117248h.size();
    }

    @Override // com.google.common.collect.n6
    @com.google.common.annotations.d
    Object writeReplace() {
        return new c(this);
    }

    c7(r9<K> keySet, l6<V> valueList, @fj.a c7<K, V> descendingMap) {
        this.f117247g = keySet;
        this.f117248h = valueList;
        this.f117249i = descendingMap;
    }
}
