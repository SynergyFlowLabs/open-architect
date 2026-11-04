package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public abstract class f6<K, V> extends n6<K, V> implements w<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f117392g = 912559;

    public static final class a<K, V> extends n6.b<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.n6.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public f6<K, V> a() {
            return d();
        }

        @Override // com.google.common.collect.n6.b
        @z7.e
        @Deprecated
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public f6<K, V> c() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // com.google.common.collect.n6.b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public f6<K, V> d() {
            int i10 = this.f117758c;
            if (i10 == 0) {
                return f6.M();
            }
            if (this.f117756a != null) {
                if (this.f117759d) {
                    this.f117757b = Arrays.copyOf(this.f117757b, i10 * 2);
                }
                n6.b.m(this.f117757b, this.f117758c, this.f117756a);
            }
            this.f117759d = true;
            return new l9(this.f117757b, this.f117758c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.n6.b
        @z7.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<K, V> e(n6.b<K, V> builder) {
            super.e(builder);
            return this;
        }

        @Override // com.google.common.collect.n6.b
        @z7.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<K, V> h(Comparator<? super V> valueComparator) {
            super.h(valueComparator);
            return this;
        }

        @Override // com.google.common.collect.n6.b
        @z7.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<K, V> i(K key, V value) {
            super.i(key, value);
            return this;
        }

        @Override // com.google.common.collect.n6.b
        @z7.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public a<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            super.j(entry);
            return this;
        }

        @Override // com.google.common.collect.n6.b
        @z7.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public a<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            super.k(entries);
            return this;
        }

        @Override // com.google.common.collect.n6.b
        @z7.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public a<K, V> l(Map<? extends K, ? extends V> map) {
            super.l(map);
            return this;
        }

        a(int size) {
            super(size);
        }
    }

    @com.google.common.annotations.d
    private static class b<K, V> extends n6.e<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f117393e = 0;

        b(f6<K, V> bimap) {
            super(bimap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.n6.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a<K, V> b(int size) {
            return new a<>(size);
        }
    }

    f6() {
    }

    @d6
    @Deprecated
    @z7.e("Use toImmutableBiMap")
    public static <T, K, V> Collector<T, ?, n6<K, V>> D(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        throw new UnsupportedOperationException();
    }

    @d6
    @Deprecated
    @z7.e("Use toImmutableBiMap")
    public static <T, K, V> Collector<T, ?, n6<K, V>> E(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> a<K, V> G() {
        return new a<>();
    }

    public static <K, V> a<K, V> H(int expectedSize) {
        a3.b(expectedSize, "expectedSize");
        return new a<>(expectedSize);
    }

    public static <K, V> f6<K, V> I(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return new a(entries instanceof Collection ? ((Collection) entries).size() : 4).k(entries).a();
    }

    public static <K, V> f6<K, V> J(Map<? extends K, ? extends V> map) {
        if (map instanceof f6) {
            f6<K, V> f6Var = (f6) map;
            if (!f6Var.n()) {
                return f6Var;
            }
        }
        return I(map.entrySet());
    }

    public static <K, V> f6<K, V> M() {
        return l9.f117633m;
    }

    public static <K, V> f6<K, V> O(K k10, V v10) {
        a3.a(k10, v10);
        return new l9(new Object[]{k10, v10}, 1);
    }

    public static <K, V> f6<K, V> P(K k10, V v10, K k11, V v11) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        return new l9(new Object[]{k10, v10, k11, v11}, 2);
    }

    public static <K, V> f6<K, V> Q(K k10, V v10, K k11, V v11, K k12, V v12) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        return new l9(new Object[]{k10, v10, k11, v11, k12, v12}, 3);
    }

    public static <K, V> f6<K, V> R(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        a3.a(k13, v13);
        return new l9(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13}, 4);
    }

    public static <K, V> f6<K, V> S(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        a3.a(k13, v13);
        a3.a(k14, v14);
        return new l9(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14}, 5);
    }

    public static <K, V> f6<K, V> U(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        a3.a(k13, v13);
        a3.a(k14, v14);
        a3.a(k15, v15);
        return new l9(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15}, 6);
    }

    public static <K, V> f6<K, V> V(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        a3.a(k13, v13);
        a3.a(k14, v14);
        a3.a(k15, v15);
        a3.a(k16, v16);
        return new l9(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16}, 7);
    }

    public static <K, V> f6<K, V> W(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        a3.a(k13, v13);
        a3.a(k14, v14);
        a3.a(k15, v15);
        a3.a(k16, v16);
        a3.a(k17, v17);
        return new l9(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17}, 8);
    }

    public static <K, V> f6<K, V> X(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        a3.a(k10, v10);
        a3.a(k11, v11);
        a3.a(k12, v12);
        a3.a(k13, v13);
        a3.a(k14, v14);
        a3.a(k15, v15);
        a3.a(k16, v16);
        a3.a(k17, v17);
        a3.a(k18, v18);
        return new l9(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18}, 9);
    }

    public static <K, V> f6<K, V> Z(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
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
        return new l9(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19}, 10);
    }

    @SafeVarargs
    public static <K, V> f6<K, V> a0(Map.Entry<? extends K, ? extends V>... entries) {
        return I(Arrays.asList(entries));
    }

    @d6
    public static <T, K, V> Collector<T, ?, f6<K, V>> b0(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return y2.G(keyFunction, valueFunction);
    }

    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.n6
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final z6<V> j() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.w
    /* JADX INFO: renamed from: L */
    public abstract f6<V, K> Y2();

    @Override // com.google.common.collect.w
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    public final V L2(K key, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.n6, java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public z6<V> values() {
        return Y2().keySet();
    }

    @Override // com.google.common.collect.n6
    @com.google.common.annotations.d
    Object writeReplace() {
        return new b(this);
    }
}
