package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class k7<R, C, V> extends q<R, C, V> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f117563c = 912559;

    @z7.f
    public static final class a<R, C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<oa.a<R, C, V>> f117564a = x7.q();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        private Comparator<? super R> f117565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        private Comparator<? super C> f117566c;

        public k7<R, C, V> a() {
            return b();
        }

        public k7<R, C, V> b() {
            int size = this.f117564a.size();
            if (size != 0) {
                return size != 1 ? t9.D(this.f117564a, this.f117565b, this.f117566c) : new ba((oa.a) o7.z(this.f117564a));
            }
            return k7.p();
        }

        @z7.a
        a<R, C, V> c(a<R, C, V> other) {
            this.f117564a.addAll(other.f117564a);
            return this;
        }

        @z7.a
        public a<R, C, V> d(Comparator<? super C> columnComparator) {
            this.f117566c = (Comparator) com.google.common.base.j0.F(columnComparator, "columnComparator");
            return this;
        }

        @z7.a
        public a<R, C, V> e(Comparator<? super R> rowComparator) {
            this.f117565b = (Comparator) com.google.common.base.j0.F(rowComparator, "rowComparator");
            return this;
        }

        @z7.a
        public a<R, C, V> f(oa.a<? extends R, ? extends C, ? extends V> cell) {
            if (!(cell instanceof bb.c)) {
                g(cell.b(), cell.a(), cell.getValue());
                return this;
            }
            com.google.common.base.j0.F(cell.b(), "row");
            com.google.common.base.j0.F(cell.a(), "column");
            com.google.common.base.j0.F(cell.getValue(), "value");
            this.f117564a.add(cell);
            return this;
        }

        @z7.a
        public a<R, C, V> g(R rowKey, C columnKey, V value) {
            this.f117564a.add(k7.g(rowKey, columnKey, value));
            return this;
        }

        @z7.a
        public a<R, C, V> h(oa<? extends R, ? extends C, ? extends V> table) {
            Iterator<oa.a<? extends R, ? extends C, ? extends V>> it = table.D0().iterator();
            while (it.hasNext()) {
                f(it.next());
            }
            return this;
        }
    }

    static final class b implements Serializable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f117567f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object[] f117568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object[] f117569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[] f117570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f117571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f117572e;

        private b(Object[] rowKeys, Object[] columnKeys, Object[] cellValues, int[] cellRowIndices, int[] cellColumnIndices) {
            this.f117568a = rowKeys;
            this.f117569b = columnKeys;
            this.f117570c = cellValues;
            this.f117571d = cellRowIndices;
            this.f117572e = cellColumnIndices;
        }

        static b a(k7<?, ?, ?> table, int[] cellRowIndices, int[] cellColumnIndices) {
            return new b(table.t().toArray(), table.E0().toArray(), table.values().toArray(), cellRowIndices, cellColumnIndices);
        }

        Object readResolve() {
            Object[] objArr = this.f117570c;
            if (objArr.length == 0) {
                return k7.p();
            }
            int i10 = 0;
            if (objArr.length == 1) {
                return k7.q(this.f117568a[0], this.f117569b[0], objArr[0]);
            }
            l6.a aVar = new l6.a(objArr.length);
            while (true) {
                Object[] objArr2 = this.f117570c;
                if (i10 >= objArr2.length) {
                    return t9.F(aVar.e(), z6.C(this.f117568a), z6.C(this.f117569b));
                }
                aVar.a(k7.g(this.f117568a[this.f117571d[i10]], this.f117569b[this.f117572e[i10]], objArr2[i10]));
                i10++;
            }
        }
    }

    k7() {
    }

    public static <R, C, V> a<R, C, V> e() {
        return new a<>();
    }

    static <R, C, V> oa.a<R, C, V> g(R rowKey, C columnKey, V value) {
        return bb.d(com.google.common.base.j0.F(rowKey, "rowKey"), com.google.common.base.j0.F(columnKey, "columnKey"), com.google.common.base.j0.F(value, "value"));
    }

    public static <R, C, V> k7<R, C, V> l(oa<? extends R, ? extends C, ? extends V> table) {
        return table instanceof k7 ? (k7) table : m(table.D0());
    }

    static <R, C, V> k7<R, C, V> m(Iterable<? extends oa.a<? extends R, ? extends C, ? extends V>> cells) {
        a aVarE = e();
        Iterator<? extends oa.a<? extends R, ? extends C, ? extends V>> it = cells.iterator();
        while (it.hasNext()) {
            aVarE.f(it.next());
        }
        return aVarE.a();
    }

    public static <R, C, V> k7<R, C, V> p() {
        return (k7<R, C, V>) ka.f117575h;
    }

    public static <R, C, V> k7<R, C, V> q(R rowKey, C columnKey, V value) {
        return new ba(rowKey, columnKey, value);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @d6
    public static <T, R, C, V> Collector<T, ?, k7<R, C, V>> x(Function<? super T, ? extends R> rowFunction, Function<? super T, ? extends C> columnFunction, Function<? super T, ? extends V> valueFunction) {
        return ab.j(rowFunction, columnFunction, valueFunction);
    }

    @d6
    public static <T, R, C, V> Collector<T, ?, k7<R, C, V>> y(Function<? super T, ? extends R> rowFunction, Function<? super T, ? extends C> columnFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        return ab.k(rowFunction, columnFunction, valueFunction, mergeFunction);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void A0(oa<? extends R, ? extends C, ? extends V> table) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean F0(@fj.a Object rowKey) {
        return super.F0(rowKey);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean M(@fj.a Object columnKey) {
        return super.M(columnKey);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public boolean containsValue(@fj.a Object value) {
        return values().contains(value);
    }

    @Override // com.google.common.collect.q
    final Iterator<V> d() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    public final V e0(R rowKey, C columnKey, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean equals(@fj.a Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.q
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final nb<oa.a<R, C, V>> a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public z6<oa.a<R, C, V>> D0() {
        return (z6) super.D0();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.oa
    /* JADX INFO: renamed from: i */
    public n6<R, V> c0(C columnKey) {
        com.google.common.base.j0.F(columnKey, "columnKey");
        return (n6) com.google.common.base.b0.a((n6) a0().get(columnKey), n6.q());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public z6<C> E0() {
        return a0().keySet();
    }

    @Override // com.google.common.collect.oa
    /* JADX INFO: renamed from: k */
    public abstract n6<C, Map<R, V>> a0();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.q
    /* JADX INFO: renamed from: n */
    public abstract z6<oa.a<R, C, V>> b();

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public boolean n0(@fj.a Object rowKey, @fj.a Object columnKey) {
        return w(rowKey, columnKey) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.q
    /* JADX INFO: renamed from: o */
    public abstract h6<V> c();

    @Override // com.google.common.collect.oa
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public n6<C, V> J0(R rowKey) {
        com.google.common.base.j0.F(rowKey, "rowKey");
        return (n6) com.google.common.base.b0.a((n6) s().get(rowKey), n6.q());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    public final V remove(@fj.a Object rowKey, @fj.a Object columnKey) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public z6<R> t() {
        return s().keySet();
    }

    @Override // com.google.common.collect.oa
    /* JADX INFO: renamed from: v */
    public abstract n6<R, Map<C, V>> s();

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    @fj.a
    public /* bridge */ /* synthetic */ Object w(@fj.a Object rowKey, @fj.a Object columnKey) {
        return super.w(rowKey, columnKey);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    abstract Object writeReplace();

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public h6<V> values() {
        return (h6) super.values();
    }
}
