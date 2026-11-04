package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
public class hb<R, C, V> extends la<R, C, V> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f117447k = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Comparator<? super C> f117448j;

    class a extends com.google.common.collect.c<C> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        C f117449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Iterator f117450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Comparator f117451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hb f117452f;

        a(final hb this$0, final Iterator val$merged, final Comparator val$comparator) {
            this.f117450d = val$merged;
            this.f117451e = val$comparator;
            this.f117452f = this$0;
        }

        @Override // com.google.common.collect.c
        @fj.a
        protected C b() {
            while (this.f117450d.hasNext()) {
                C c10 = (C) this.f117450d.next();
                C c11 = this.f117449c;
                if (c11 == null || this.f117451e.compare(c10, c11) != 0) {
                    this.f117449c = c10;
                    return c10;
                }
            }
            this.f117449c = null;
            return c();
        }
    }

    private static class b<C, V> implements com.google.common.base.s0<Map<C, V>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f117453b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Comparator<? super C> f117454a;

        b(Comparator<? super C> comparator) {
            this.f117454a = comparator;
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get() {
            return new TreeMap(this.f117454a);
        }
    }

    private class c extends ma<R, C, V>.g implements SortedMap<C, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        final C f117455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.a
        final C f117456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @fj.a
        transient SortedMap<C, V> f117457f;

        c(final hb this$0, R rowKey) {
            this(rowKey, null, null);
        }

        @Override // com.google.common.collect.ma.g
        void c() {
            j();
            SortedMap<C, V> sortedMap = this.f117457f;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            hb.this.f117685c.remove(this.f117712a);
            this.f117457f = null;
            this.f117713b = null;
        }

        @Override // java.util.SortedMap
        public Comparator<? super C> comparator() {
            return hb.this.r();
        }

        @Override // com.google.common.collect.ma.g, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return i(key) && super.containsKey(key);
        }

        int f(Object a10, Object b10) {
            return comparator().compare(a10, b10);
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            d();
            Map<C, V> map = this.f117713b;
            if (map != null) {
                return (C) ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ma.g
        @fj.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedMap<C, V> b() {
            j();
            SortedMap<C, V> sortedMapTailMap = this.f117457f;
            if (sortedMapTailMap == null) {
                return null;
            }
            C c10 = this.f117455d;
            if (c10 != null) {
                sortedMapTailMap = sortedMapTailMap.tailMap(c10);
            }
            C c11 = this.f117456e;
            return c11 != null ? sortedMapTailMap.headMap(c11) : sortedMapTailMap;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public SortedSet<C> keySet() {
            return new b8.g0(this);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> headMap(C toKey) {
            com.google.common.base.j0.d(i(com.google.common.base.j0.E(toKey)));
            return new c(this.f117712a, this.f117455d, toKey);
        }

        boolean i(@fj.a Object o10) {
            C c10;
            C c11;
            return o10 != null && ((c10 = this.f117455d) == null || f(c10, o10) <= 0) && ((c11 = this.f117456e) == null || f(c11, o10) > 0);
        }

        void j() {
            SortedMap<C, V> sortedMap = this.f117457f;
            if (sortedMap == null || (sortedMap.isEmpty() && hb.this.f117685c.containsKey(this.f117712a))) {
                this.f117457f = (SortedMap) hb.this.f117685c.get(this.f117712a);
            }
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            d();
            Map<C, V> map = this.f117713b;
            if (map != null) {
                return (C) ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.ma.g, java.util.AbstractMap, java.util.Map
        @fj.a
        public V put(C c10, V v10) {
            com.google.common.base.j0.d(i(com.google.common.base.j0.E(c10)));
            return (V) super.put(c10, v10);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> subMap(C fromKey, C toKey) {
            com.google.common.base.j0.d(i(com.google.common.base.j0.E(fromKey)) && i(com.google.common.base.j0.E(toKey)));
            return new c(this.f117712a, fromKey, toKey);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> tailMap(C fromKey) {
            com.google.common.base.j0.d(i(com.google.common.base.j0.E(fromKey)));
            return new c(this.f117712a, fromKey, this.f117456e);
        }

        c(@fj.a R rowKey, @fj.a C lowerBound, C upperBound) {
            super(rowKey);
            this.f117455d = lowerBound;
            this.f117456e = upperBound;
            com.google.common.base.j0.d(lowerBound == null || upperBound == null || f(lowerBound, upperBound) <= 0);
        }
    }

    hb(Comparator<? super R> rowComparator, Comparator<? super C> columnComparator) {
        super(new TreeMap(rowComparator), new b(columnComparator));
        this.f117448j = columnComparator;
    }

    public static <R extends Comparable, C extends Comparable, V> hb<R, C, V> u() {
        return new hb<>(a9.z(), a9.z());
    }

    public static <R, C, V> hb<R, C, V> v(hb<R, C, ? extends V> table) {
        hb<R, C, V> hbVar = new hb<>(table.z(), table.r());
        hbVar.A0(table);
        return hbVar;
    }

    public static <R, C, V> hb<R, C, V> x(Comparator<? super R> rowComparator, Comparator<? super C> columnComparator) {
        com.google.common.base.j0.E(rowComparator);
        com.google.common.base.j0.E(columnComparator);
        return new hb<>(rowComparator, columnComparator);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ void A0(oa table) {
        super.A0(table);
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ Set D0() {
        return super.D0();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ Set E0() {
        return super.E0();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean F0(@fj.a Object rowKey) {
        return super.F0(rowKey);
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean M(@fj.a Object columnKey) {
        return super.M(columnKey);
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ Map a0() {
        return super.a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ma, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ Map c0(Object columnKey) {
        return super.c0(columnKey);
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean containsValue(@fj.a Object value) {
        return super.containsValue(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    @z7.a
    @fj.a
    public /* bridge */ /* synthetic */ Object e0(Object rowKey, Object columnKey, Object value) {
        return super.e0(rowKey, columnKey, value);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean equals(@fj.a Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.ma
    Iterator<C> i() {
        Comparator<? super C> comparatorR = r();
        return new a(this, p7.N(o7.T(this.f117685c.values(), new com.google.common.base.t() { // from class: com.google.common.collect.gb
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return ((Map) obj).keySet().iterator();
            }
        }), comparatorR), comparatorR);
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean n0(@fj.a Object rowKey, @fj.a Object columnKey) {
        return super.n0(rowKey, columnKey);
    }

    @Deprecated
    public Comparator<? super C> r() {
        return this.f117448j;
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    @z7.a
    @fj.a
    public /* bridge */ /* synthetic */ Object remove(@fj.a Object rowKey, @fj.a Object columnKey) {
        return super.remove(rowKey, columnKey);
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.q
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    @fj.a
    public /* bridge */ /* synthetic */ Object w(@fj.a Object rowKey, @fj.a Object columnKey) {
        return super.w(rowKey, columnKey);
    }

    @Override // com.google.common.collect.ma, com.google.common.collect.oa
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public SortedMap<C, V> J0(R rowKey) {
        return new c(this, rowKey);
    }

    @Deprecated
    public Comparator<? super R> z() {
        Comparator<? super R> comparator = t().comparator();
        Objects.requireNonNull(comparator);
        return comparator;
    }

    @Override // com.google.common.collect.la, com.google.common.collect.ma, com.google.common.collect.oa
    public SortedMap<R, Map<C, V>> s() {
        return super.s();
    }

    @Override // com.google.common.collect.la, com.google.common.collect.ma, com.google.common.collect.q, com.google.common.collect.oa
    public SortedSet<R> t() {
        return super.t();
    }
}
