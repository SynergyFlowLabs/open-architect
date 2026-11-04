package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public class m6<K, V> extends r6<K, V> implements w7<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final long f117678j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @a8.b
    @r9.j
    @fj.a
    private transient m6<V, K> f117679i;

    public static final class a<K, V> extends r6.c<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.r6.c
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public m6<K, V> a() {
            return (m6) super.a();
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
            super.k(multimap);
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
            super.n(key, values);
            return this;
        }

        a(int expectedKeys) {
            super(expectedKeys);
        }
    }

    m6(n6<K, l6<V>> map, int size) {
        super(map, size);
    }

    public static <K, V> a<K, V> M() {
        return new a<>();
    }

    public static <K, V> a<K, V> N(int expectedKeys) {
        a3.b(expectedKeys, "expectedKeys");
        return new a<>(expectedKeys);
    }

    public static <K, V> m6<K, V> O(k8<? extends K, ? extends V> multimap) {
        if (multimap.isEmpty()) {
            return X();
        }
        if (multimap instanceof m6) {
            m6<K, V> m6Var = (m6) multimap;
            if (!m6Var.z()) {
                return m6Var;
            }
        }
        return T(multimap.l().entrySet(), null);
    }

    public static <K, V> m6<K, V> P(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return new a().l(entries).a();
    }

    @d6
    public static <T, K, V> Collector<T, ?, m6<K, V>> Q(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends Stream<? extends V>> valuesFunction) {
        return y2.D(keyFunction, valuesFunction);
    }

    static <K, V> m6<K, V> S(Collection<? extends Map.Entry<K, h6.b<V>>> mapEntries, @fj.a Comparator<? super V> valueComparator) {
        if (mapEntries.isEmpty()) {
            return X();
        }
        n6.b bVar = new n6.b(mapEntries.size());
        int size = 0;
        int i10 = 3 & 0;
        for (Map.Entry<K, h6.b<V>> entry : mapEntries) {
            K key = entry.getKey();
            l6.a aVar = (l6.a) entry.getValue();
            l6 l6VarE = valueComparator == null ? aVar.e() : aVar.o(valueComparator);
            bVar.i(key, l6VarE);
            size += l6VarE.size();
        }
        return new m6<>(bVar.d(), size);
    }

    static <K, V> m6<K, V> T(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> mapEntries, @fj.a Comparator<? super V> valueComparator) {
        if (mapEntries.isEmpty()) {
            return X();
        }
        n6.b bVar = new n6.b(mapEntries.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : mapEntries) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            l6 l6VarW = valueComparator == null ? l6.w(value) : l6.W(valueComparator, value);
            if (!l6VarW.isEmpty()) {
                bVar.i(key, l6VarW);
                size += l6VarW.size();
            }
        }
        return new m6<>(bVar.d(), size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m6<V, K> W() {
        a aVarM = M();
        nb it = u().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVarM.i(entry.getValue(), entry.getKey());
        }
        m6<V, K> m6VarA = aVarM.a();
        m6VarA.f117679i = this;
        return m6VarA;
    }

    public static <K, V> m6<K, V> X() {
        return c4.f117239k;
    }

    public static <K, V> m6<K, V> Z(K k10, V v10) {
        a aVarM = M();
        aVarM.i(k10, v10);
        return aVarM.a();
    }

    public static <K, V> m6<K, V> a0(K k10, V v10, K k11, V v11) {
        a aVarM = M();
        aVarM.i(k10, v10);
        aVarM.i(k11, v11);
        return aVarM.a();
    }

    public static <K, V> m6<K, V> b0(K k10, V v10, K k11, V v11, K k12, V v12) {
        a aVarM = M();
        aVarM.i(k10, v10);
        aVarM.i(k11, v11);
        aVarM.i(k12, v12);
        return aVarM.a();
    }

    public static <K, V> m6<K, V> c0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        a aVarM = M();
        aVarM.i(k10, v10);
        aVarM.i(k11, v11);
        aVarM.i(k12, v12);
        aVarM.i(k13, v13);
        return aVarM.a();
    }

    public static <K, V> m6<K, V> d0(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        a aVarM = M();
        aVarM.i(k10, v10);
        aVarM.i(k11, v11);
        aVarM.i(k12, v12);
        aVarM.i(k13, v13);
        aVarM.i(k14, v14);
        return aVarM.a();
    }

    @d6
    public static <T, K, V> Collector<T, ?, m6<K, V>> g0(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return y2.M(keyFunction, valueFunction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
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
            l6.a aVarS = l6.s();
            for (int i14 = 0; i14 < i13; i14++) {
                Object object2 = stream.readObject();
                Objects.requireNonNull(object2);
                aVarS.a(object2);
            }
            bVarB.i(object, aVarS.e());
            i11 += i13;
        }
        try {
            r6.e.f118026a.b(this, bVarB.d());
            r6.e.f118027b.a(this, i11);
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        x9.j(this, stream);
    }

    @Override // com.google.common.collect.r6
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public l6<V> x(K key) {
        l6<V> l6Var = (l6) this.f118011f.get(key);
        return l6Var == null ? l6.F() : l6Var;
    }

    @Override // com.google.common.collect.r6
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public m6<V, K> y() {
        m6<V, K> m6Var = this.f117679i;
        if (m6Var != null) {
            return m6Var;
        }
        m6<V, K> m6VarW = W();
        this.f117679i = m6VarW;
        return m6VarW;
    }

    @Override // com.google.common.collect.r6, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final l6<V> c(@fj.a Object key) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.r6, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final l6<V> d(K key, Iterable<? extends V> values) {
        throw new UnsupportedOperationException();
    }
}
