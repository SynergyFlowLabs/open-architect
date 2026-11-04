package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public final class bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.common.base.t<? extends Map<?, ?>, ? extends Map<?, ?>> f117191a = new a();

    class a implements com.google.common.base.t<Map<Object, Object>, Map<Object, Object>> {
        a() {
        }

        @Override // com.google.common.base.t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<Object, Object> apply(Map<Object, Object> input) {
            return Collections.unmodifiableMap(input);
        }
    }

    static abstract class b<R, C, V> implements oa.a<R, C, V> {
        b() {
        }

        @Override // com.google.common.collect.oa.a
        public boolean equals(@fj.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof oa.a) {
                oa.a aVar = (oa.a) obj;
                if (com.google.common.base.d0.a(b(), aVar.b()) && com.google.common.base.d0.a(a(), aVar.a()) && com.google.common.base.d0.a(getValue(), aVar.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.oa.a
        public int hashCode() {
            return com.google.common.base.d0.b(b(), a(), getValue());
        }

        public String toString() {
            return "(" + b() + "," + a() + ")=" + getValue();
        }
    }

    static final class c<R, C, V> extends b<R, C, V> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f117192d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        private final R f117193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @b9
        private final C f117194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @b9
        private final V f117195c;

        c(@b9 R rowKey, @b9 C columnKey, @b9 V value) {
            this.f117193a = rowKey;
            this.f117194b = columnKey;
            this.f117195c = value;
        }

        @Override // com.google.common.collect.oa.a
        @b9
        public C a() {
            return this.f117194b;
        }

        @Override // com.google.common.collect.oa.a
        @b9
        public R b() {
            return this.f117193a;
        }

        @Override // com.google.common.collect.oa.a
        @b9
        public V getValue() {
            return this.f117195c;
        }
    }

    private static class d<R, C, V1, V2> extends q<R, C, V2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final oa<R, C, V1> f117196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.google.common.base.t<? super V1, V2> f117197d;

        class a implements com.google.common.base.t<oa.a<R, C, V1>, oa.a<R, C, V2>> {
            a() {
            }

            @Override // com.google.common.base.t
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public oa.a<R, C, V2> apply(oa.a<R, C, V1> cell) {
                return bb.d(cell.b(), cell.a(), d.this.f117197d.apply(cell.getValue()));
            }
        }

        class b implements com.google.common.base.t<Map<C, V1>, Map<C, V2>> {
            b() {
            }

            @Override // com.google.common.base.t
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<C, V2> apply(Map<C, V1> row) {
                return b8.D0(row, d.this.f117197d);
            }
        }

        class c implements com.google.common.base.t<Map<R, V1>, Map<R, V2>> {
            c() {
            }

            @Override // com.google.common.base.t
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<R, V2> apply(Map<R, V1> column) {
                return b8.D0(column, d.this.f117197d);
            }
        }

        d(oa<R, C, V1> fromTable, com.google.common.base.t<? super V1, V2> function) {
            this.f117196c = (oa) com.google.common.base.j0.E(fromTable);
            this.f117197d = (com.google.common.base.t) com.google.common.base.j0.E(function);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        public void A0(oa<? extends R, ? extends C, ? extends V2> table) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        public Set<C> E0() {
            return this.f117196c.E0();
        }

        @Override // com.google.common.collect.oa
        public Map<C, V2> J0(@b9 R rowKey) {
            return b8.D0(this.f117196c.J0(rowKey), this.f117197d);
        }

        @Override // com.google.common.collect.q
        Iterator<oa.a<R, C, V2>> a() {
            return p7.b0(this.f117196c.D0().iterator(), e());
        }

        @Override // com.google.common.collect.oa
        public Map<C, Map<R, V2>> a0() {
            return b8.D0(this.f117196c.a0(), new c());
        }

        @Override // com.google.common.collect.q
        Collection<V2> c() {
            return b3.m(this.f117196c.values(), this.f117197d);
        }

        @Override // com.google.common.collect.oa
        public Map<R, V2> c0(@b9 C columnKey) {
            return b8.D0(this.f117196c.c0(columnKey), this.f117197d);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        public void clear() {
            this.f117196c.clear();
        }

        com.google.common.base.t<oa.a<R, C, V1>, oa.a<R, C, V2>> e() {
            return new a();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        @fj.a
        public V2 e0(@b9 R rowKey, @b9 C columnKey, @b9 V2 value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        public boolean n0(@fj.a Object rowKey, @fj.a Object columnKey) {
            return this.f117196c.n0(rowKey, columnKey);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        @fj.a
        public V2 remove(@fj.a Object obj, @fj.a Object obj2) {
            if (n0(obj, obj2)) {
                return this.f117197d.apply((Object) u8.a(this.f117196c.remove(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.oa
        public Map<R, Map<C, V2>> s() {
            return b8.D0(this.f117196c.s(), new b());
        }

        @Override // com.google.common.collect.oa
        public int size() {
            return this.f117196c.size();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        public Set<R> t() {
            return this.f117196c.t();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        @fj.a
        public V2 w(@fj.a Object obj, @fj.a Object obj2) {
            if (n0(obj, obj2)) {
                return this.f117197d.apply((Object) u8.a(this.f117196c.w(obj, obj2)));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e<C, R, V> extends q<C, R, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final oa<R, C, V> f117201c;

        e(oa<R, C, V> original) {
            this.f117201c = (oa) com.google.common.base.j0.E(original);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        public void A0(oa<? extends C, ? extends R, ? extends V> table) {
            this.f117201c.A0(bb.j(table));
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        public Set<R> E0() {
            return this.f117201c.t();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        public boolean F0(@fj.a Object rowKey) {
            return this.f117201c.M(rowKey);
        }

        @Override // com.google.common.collect.oa
        public Map<R, V> J0(@b9 C rowKey) {
            return this.f117201c.c0(rowKey);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        public boolean M(@fj.a Object columnKey) {
            return this.f117201c.F0(columnKey);
        }

        @Override // com.google.common.collect.q
        Iterator<oa.a<C, R, V>> a() {
            return p7.b0(this.f117201c.D0().iterator(), new com.google.common.base.t() { // from class: com.google.common.collect.cb
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return bb.k((oa.a) obj);
                }
            });
        }

        @Override // com.google.common.collect.oa
        public Map<R, Map<C, V>> a0() {
            return this.f117201c.s();
        }

        @Override // com.google.common.collect.oa
        public Map<C, V> c0(@b9 R columnKey) {
            return this.f117201c.J0(columnKey);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        public void clear() {
            this.f117201c.clear();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        public boolean containsValue(@fj.a Object value) {
            return this.f117201c.containsValue(value);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        @fj.a
        public V e0(@b9 C rowKey, @b9 R columnKey, @b9 V value) {
            return this.f117201c.e0(columnKey, rowKey, value);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        public boolean n0(@fj.a Object rowKey, @fj.a Object columnKey) {
            return this.f117201c.n0(columnKey, rowKey);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        @fj.a
        public V remove(@fj.a Object rowKey, @fj.a Object columnKey) {
            return this.f117201c.remove(columnKey, rowKey);
        }

        @Override // com.google.common.collect.oa
        public Map<C, Map<R, V>> s() {
            return this.f117201c.a0();
        }

        @Override // com.google.common.collect.oa
        public int size() {
            return this.f117201c.size();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        public Set<C> t() {
            return this.f117201c.E0();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        public Collection<V> values() {
            return this.f117201c.values();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.oa
        @fj.a
        public V w(@fj.a Object rowKey, @fj.a Object columnKey) {
            return this.f117201c.w(columnKey, rowKey);
        }
    }

    private static final class f<R, C, V> extends g<R, C, V> implements w9<R, C, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f117202c = 0;

        public f(w9<R, ? extends C, ? extends V> delegate) {
            super(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.bb.g, com.google.common.collect.u5
        /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
        public w9<R, C, V> i1() {
            return (w9) super.i1();
        }

        @Override // com.google.common.collect.bb.g, com.google.common.collect.u5, com.google.common.collect.oa
        public SortedMap<R, Map<C, V>> s() {
            return Collections.unmodifiableSortedMap(b8.F0(i1().s(), bb.n()));
        }

        @Override // com.google.common.collect.bb.g, com.google.common.collect.u5, com.google.common.collect.oa
        public SortedSet<R> t() {
            return Collections.unmodifiableSortedSet(i1().t());
        }
    }

    private static class g<R, C, V> extends u5<R, C, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f117203b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final oa<? extends R, ? extends C, ? extends V> f117204a;

        g(oa<? extends R, ? extends C, ? extends V> delegate) {
            this.f117204a = (oa) com.google.common.base.j0.E(delegate);
        }

        @Override // com.google.common.collect.u5, com.google.common.collect.oa
        public void A0(oa<? extends R, ? extends C, ? extends V> table) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.u5, com.google.common.collect.oa
        public Set<oa.a<R, C, V>> D0() {
            return Collections.unmodifiableSet(super.D0());
        }

        @Override // com.google.common.collect.u5, com.google.common.collect.oa
        public Set<C> E0() {
            return Collections.unmodifiableSet(super.E0());
        }

        @Override // com.google.common.collect.u5, com.google.common.collect.oa
        public Map<C, V> J0(@b9 R rowKey) {
            return Collections.unmodifiableMap(super.J0(rowKey));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.u5, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0 */
        public oa<R, C, V> i1() {
            return this.f117204a;
        }

        @Override // com.google.common.collect.u5, com.google.common.collect.oa
        public Map<C, Map<R, V>> a0() {
            return Collections.unmodifiableMap(b8.D0(super.a0(), bb.n()));
        }

        @Override // com.google.common.collect.u5, com.google.common.collect.oa
        public Map<R, V> c0(@b9 C columnKey) {
            return Collections.unmodifiableMap(super.c0(columnKey));
        }

        @Override // com.google.common.collect.u5, com.google.common.collect.oa
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.u5, com.google.common.collect.oa
        @fj.a
        public V e0(@b9 R rowKey, @b9 C columnKey, @b9 V value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.u5, com.google.common.collect.oa
        @fj.a
        public V remove(@fj.a Object rowKey, @fj.a Object columnKey) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.u5, com.google.common.collect.oa
        public Map<R, Map<C, V>> s() {
            return Collections.unmodifiableMap(b8.D0(super.s(), bb.n()));
        }

        @Override // com.google.common.collect.u5, com.google.common.collect.oa
        public Set<R> t() {
            return Collections.unmodifiableSet(super.t());
        }

        @Override // com.google.common.collect.u5, com.google.common.collect.oa
        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }
    }

    private bb() {
    }

    static boolean c(oa<?, ?, ?> table, @fj.a Object obj) {
        if (obj == table) {
            return true;
        }
        if (obj instanceof oa) {
            return table.D0().equals(((oa) obj).D0());
        }
        return false;
    }

    public static <R, C, V> oa.a<R, C, V> d(@b9 R rowKey, @b9 C columnKey, @b9 V value) {
        return new c(rowKey, columnKey, value);
    }

    public static <R, C, V> oa<R, C, V> e(Map<R, Map<C, V>> backingMap, com.google.common.base.s0<? extends Map<C, V>> factory) {
        com.google.common.base.j0.d(backingMap.isEmpty());
        com.google.common.base.j0.E(factory);
        return new ma(backingMap, factory);
    }

    @com.google.common.annotations.d
    public static <R, C, V> oa<R, C, V> f(oa<R, C, V> table) {
        return na.z(table, null);
    }

    @d6
    public static <T, R, C, V, I extends oa<R, C, V>> Collector<T, ?, I> g(Function<? super T, ? extends R> rowFunction, Function<? super T, ? extends C> columnFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction, Supplier<I> tableSupplier) {
        return ab.l(rowFunction, columnFunction, valueFunction, mergeFunction, tableSupplier);
    }

    @d6
    public static <T, R, C, V, I extends oa<R, C, V>> Collector<T, ?, I> h(Function<? super T, ? extends R> rowFunction, Function<? super T, ? extends C> columnFunction, Function<? super T, ? extends V> valueFunction, Supplier<I> tableSupplier) {
        return ab.m(rowFunction, columnFunction, valueFunction, tableSupplier);
    }

    public static <R, C, V1, V2> oa<R, C, V2> i(oa<R, C, V1> fromTable, com.google.common.base.t<? super V1, V2> function) {
        return new d(fromTable, function);
    }

    public static <R, C, V> oa<C, R, V> j(oa<R, C, V> oaVar) {
        return oaVar instanceof e ? ((e) oaVar).f117201c : new e(oaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <R, C, V> oa.a<C, R, V> k(oa.a<R, C, V> cell) {
        return d(cell.a(), cell.b(), cell.getValue());
    }

    public static <R, C, V> w9<R, C, V> l(w9<R, ? extends C, ? extends V> table) {
        return new f(table);
    }

    public static <R, C, V> oa<R, C, V> m(oa<? extends R, ? extends C, ? extends V> table) {
        return new g(table);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> com.google.common.base.t<Map<K, V>, Map<K, V>> n() {
        return (com.google.common.base.t<Map<K, V>, Map<K, V>>) f117191a;
    }
}
