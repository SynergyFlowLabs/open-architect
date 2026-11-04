package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public class a7<K, V> extends r6<K, V> implements y9<K, V> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final long f117005l = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient z6<V> f117006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @a8.b
    @r9.j
    @fj.a
    private transient a7<V, K> f117007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @a8.b
    @r9.j
    @fj.a
    private transient z6<Map.Entry<K, V>> f117008k;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class a<K, V> extends r6.c<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.r6.c
        int d(int defaultExpectedValues, Iterable<?> values) {
            return values instanceof Set ? Math.max(defaultExpectedValues, ((Set) values).size()) : defaultExpectedValues;
        }

        @Override // com.google.common.collect.r6.c
        h6.b<V> f(int expectedSize) {
            Comparator<? super V> comparator = this.f118022c;
            return comparator == null ? z6.t(expectedSize) : new j7.a(comparator, expectedSize);
        }

        @Override // com.google.common.collect.r6.c
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a7<K, V> a() {
            Map<K, h6.b<V>> map = this.f118020a;
            if (map == null) {
                return a7.b0();
            }
            Collection collectionEntrySet = map.entrySet();
            Comparator<? super K> comparator = this.f118021b;
            if (comparator != null) {
                collectionEntrySet = a9.i(comparator).C().l(collectionEntrySet);
            }
            return a7.V(collectionEntrySet, this.f118022c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.c
        @z7.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<K, V> b(r6.c<K, V> other) {
            super.b(other);
            return this;
        }

        @Override // com.google.common.collect.r6.c
        @z7.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<K, V> e(int expectedValuesPerKey) {
            super.e(expectedValuesPerKey);
            return this;
        }

        @Override // com.google.common.collect.r6.c
        @z7.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<K, V> g(Comparator<? super K> keyComparator) {
            super.g(keyComparator);
            return this;
        }

        @Override // com.google.common.collect.r6.c
        @z7.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<K, V> h(Comparator<? super V> valueComparator) {
            super.h(valueComparator);
            return this;
        }

        @Override // com.google.common.collect.r6.c
        @z7.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public a<K, V> i(K key, V value) {
            super.i(key, value);
            return this;
        }

        @Override // com.google.common.collect.r6.c
        @z7.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public a<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            super.j(entry);
            return this;
        }

        @Override // com.google.common.collect.r6.c
        @z7.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public a<K, V> k(k8<? extends K, ? extends V> multimap) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : multimap.l().entrySet()) {
                m(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @Override // com.google.common.collect.r6.c
        @z7.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public a<K, V> l(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            super.l(entries);
            return this;
        }

        @Override // com.google.common.collect.r6.c
        @z7.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public a<K, V> m(K key, Iterable<? extends V> values) {
            super.m(key, values);
            return this;
        }

        @Override // com.google.common.collect.r6.c
        @z7.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public a<K, V> n(K key, V... values) {
            return m(key, Arrays.asList(values));
        }

        a(int expectedKeys) {
            super(expectedKeys);
        }
    }

    private static final class b<K, V> extends z6<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @r9.m
        private final transient a7<K, V> f117009i;

        b(a7<K, V> multimap) {
            this.f117009i = multimap;
        }

        @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) object;
            return this.f117009i.I0(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return false;
        }

        @Override // com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: n */
        public nb<Map.Entry<K, V>> iterator() {
            return this.f117009i.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f117009i.size();
        }

        @Override // com.google.common.collect.z6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final x9.b<? super a7<?, ?>> f117010a = x9.a(a7.class, "emptySet");

        private c() {
        }
    }

    a7(n6<K, z6<V>> map, int size, @fj.a Comparator<? super V> valueComparator) {
        super(map, size);
        this.f117006i = S(valueComparator);
    }

    public static <K, V> a<K, V> M() {
        return new a<>();
    }

    public static <K, V> a<K, V> N(int expectedKeys) {
        a3.b(expectedKeys, "expectedKeys");
        return new a<>(expectedKeys);
    }

    public static <K, V> a7<K, V> O(k8<? extends K, ? extends V> multimap) {
        return P(multimap, null);
    }

    private static <K, V> a7<K, V> P(k8<? extends K, ? extends V> multimap, @fj.a Comparator<? super V> valueComparator) {
        com.google.common.base.j0.E(multimap);
        if (multimap.isEmpty() && valueComparator == null) {
            return b0();
        }
        if (multimap instanceof a7) {
            a7<K, V> a7Var = (a7) multimap;
            if (!a7Var.z()) {
                return a7Var;
            }
        }
        return W(multimap.l().entrySet(), valueComparator);
    }

    public static <K, V> a7<K, V> Q(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return new a().l(entries).a();
    }

    private static <V> z6<V> S(@fj.a Comparator<? super V> valueComparator) {
        return valueComparator == null ? z6.G() : j7.m0(valueComparator);
    }

    @d6
    public static <T, K, V> Collector<T, ?, a7<K, V>> U(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends Stream<? extends V>> valuesFunction) {
        return y2.E(keyFunction, valuesFunction);
    }

    static <K, V> a7<K, V> V(Collection<? extends Map.Entry<K, h6.b<V>>> mapEntries, @fj.a Comparator<? super V> valueComparator) {
        if (mapEntries.isEmpty()) {
            return b0();
        }
        n6.b bVar = new n6.b(mapEntries.size());
        int size = 0;
        for (Map.Entry<K, h6.b<V>> entry : mapEntries) {
            K key = entry.getKey();
            z6 z6VarK0 = k0(valueComparator, ((z6.a) entry.getValue()).e());
            if (!z6VarK0.isEmpty()) {
                bVar.i(key, z6VarK0);
                size += z6VarK0.size();
            }
        }
        return new a7<>(bVar.d(), size, valueComparator);
    }

    static <K, V> a7<K, V> W(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> mapEntries, @fj.a Comparator<? super V> valueComparator) {
        if (mapEntries.isEmpty()) {
            return b0();
        }
        n6.b bVar = new n6.b(mapEntries.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : mapEntries) {
            K key = entry.getKey();
            z6 z6VarK0 = k0(valueComparator, entry.getValue());
            if (!z6VarK0.isEmpty()) {
                bVar.i(key, z6VarK0);
                size += z6VarK0.size();
            }
        }
        return new a7<>(bVar.d(), size, valueComparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a7<V, K> a0() {
        a aVarM = M();
        nb it = k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVarM.i(entry.getValue(), entry.getKey());
        }
        a7<V, K> a7VarA = aVarM.a();
        a7VarA.f117007j = this;
        return a7VarA;
    }

    public static <K, V> a7<K, V> b0() {
        return d4.f117297m;
    }

    public static <K, V> a7<K, V> c0(K k10, V v10) {
        a aVarM = M();
        aVarM.i(k10, v10);
        return aVarM.a();
    }

    public static <K, V> a7<K, V> d0(K k10, V v10, K k11, V v11) {
        a aVarM = M();
        aVarM.i(k10, v10);
        aVarM.i(k11, v11);
        return aVarM.a();
    }

    public static <K, V> a7<K, V> e0(K k10, V v10, K k11, V v11, K k12, V v12) {
        a aVarM = M();
        aVarM.i(k10, v10);
        aVarM.i(k11, v11);
        aVarM.i(k12, v12);
        return aVarM.a();
    }

    public static <K, V> a7<K, V> f0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        a aVarM = M();
        aVarM.i(k10, v10);
        aVarM.i(k11, v11);
        aVarM.i(k12, v12);
        aVarM.i(k13, v13);
        return aVarM.a();
    }

    public static <K, V> a7<K, V> g0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        a aVarM = M();
        aVarM.i(k10, v10);
        aVarM.i(k11, v11);
        aVarM.i(k12, v12);
        aVarM.i(k13, v13);
        aVarM.i(k14, v14);
        return aVarM.a();
    }

    @d6
    public static <T, K, V> Collector<T, ?, a7<K, V>> j0(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return y2.T(keyFunction, valueFunction);
    }

    private static <V> z6<V> k0(@fj.a Comparator<? super V> valueComparator, Collection<? extends V> values) {
        return valueComparator == null ? z6.A(values) : j7.Y(valueComparator, values);
    }

    private static <V> z6.a<V> m0(@fj.a Comparator<? super V> valueComparator) {
        return valueComparator == null ? new z6.a<>() : new j7.a(valueComparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Comparator comparator = (Comparator) stream.readObject();
        int i10 = stream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Invalid key count " + i10);
        }
        n6.b bVarB = n6.b();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object object = stream.readObject();
            Objects.requireNonNull(object);
            int i13 = stream.readInt();
            if (i13 <= 0) {
                throw new InvalidObjectException("Invalid value count " + i13);
            }
            z6.a aVarM0 = m0(comparator);
            for (int i14 = 0; i14 < i13; i14++) {
                Object object2 = stream.readObject();
                Objects.requireNonNull(object2);
                aVarM0.a(object2);
            }
            z6 z6VarE = aVarM0.e();
            if (z6VarE.size() != i13) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + object);
            }
            bVarB.i(object, z6VarE);
            i11 += i13;
        }
        try {
            r6.e.f118026a.b(this, bVarB.d());
            r6.e.f118027b.a(this, i11);
            c.f117010a.b(this, S(comparator));
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(Y());
        x9.j(this, stream);
    }

    @Override // com.google.common.collect.r6
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public z6<Map.Entry<K, V>> u() {
        z6<Map.Entry<K, V>> z6Var = this.f117008k;
        if (z6Var != null) {
            return z6Var;
        }
        b bVar = new b(this);
        this.f117008k = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.r6
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public z6<V> x(K key) {
        return (z6) com.google.common.base.b0.a((z6) this.f118011f.get(key), this.f117006i);
    }

    @fj.a
    Comparator<? super V> Y() {
        z6<V> z6Var = this.f117006i;
        if (z6Var instanceof j7) {
            return ((j7) z6Var).comparator();
        }
        return null;
    }

    @Override // com.google.common.collect.r6
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public a7<V, K> y() {
        a7<V, K> a7Var = this.f117007j;
        if (a7Var != null) {
            return a7Var;
        }
        a7<V, K> a7VarA0 = a0();
        this.f117007j = a7VarA0;
        return a7VarA0;
    }

    @Override // com.google.common.collect.r6, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final z6<V> c(@fj.a Object key) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.r6, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final z6<V> d(K key, Iterable<? extends V> values) {
        throw new UnsupportedOperationException();
    }
}
