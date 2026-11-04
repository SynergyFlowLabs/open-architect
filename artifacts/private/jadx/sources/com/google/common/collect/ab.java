package com.google.common.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@d6
@a4
@com.google.common.annotations.b
final class ab {

    /* JADX INFO: Access modifiers changed from: private */
    static final class b<R, C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<c<R, C, V>> f117095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final oa<R, C, c<R, C, V>> f117096b;

        private b() {
            this.f117095a = new ArrayList();
            this.f117096b = x5.n();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b<R, C, V> a(b<R, C, V> other, BinaryOperator<V> merger) {
            for (c<R, C, V> cVar : other.f117095a) {
                b(cVar.b(), cVar.a(), cVar.getValue(), merger);
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(R row, C column, V value, BinaryOperator<V> merger) {
            c<R, C, V> cVarW = this.f117096b.w(row, column);
            if (cVarW != null) {
                cVarW.c(value, merger);
                return;
            }
            c<R, C, V> cVar = new c<>(row, column, value);
            this.f117095a.add(cVar);
            this.f117096b.e0(row, column, cVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public k7<R, C, V> c() {
            return k7.m(this.f117095a);
        }
    }

    @d6
    private static final class c<R, C, V> extends bb.b<R, C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final R f117097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C f117098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private V f117099c;

        c(R r10, C c10, V v10) {
            this.f117097a = (R) com.google.common.base.j0.F(r10, "row");
            this.f117098b = (C) com.google.common.base.j0.F(c10, "column");
            this.f117099c = (V) com.google.common.base.j0.F(v10, "value");
        }

        @Override // com.google.common.collect.oa.a
        public C a() {
            return this.f117098b;
        }

        @Override // com.google.common.collect.oa.a
        public R b() {
            return this.f117097a;
        }

        void c(V v10, BinaryOperator<V> binaryOperator) {
            com.google.common.base.j0.F(v10, "value");
            this.f117099c = (V) com.google.common.base.j0.F(binaryOperator.apply(this.f117099c, v10), "mergeFunction.apply");
        }

        @Override // com.google.common.collect.oa.a
        public V getValue() {
            return this.f117099c;
        }
    }

    private ab() {
    }

    public static /* synthetic */ Object b(Object obj, Object obj2) {
        throw new IllegalStateException("Conflicting values " + obj + " and " + obj2);
    }

    public static /* synthetic */ b f() {
        return new b();
    }

    public static /* synthetic */ oa g(BinaryOperator binaryOperator, oa oaVar, oa oaVar2) {
        for (oa.a aVar : oaVar2.D0()) {
            i(oaVar, aVar.b(), aVar.a(), aVar.getValue(), binaryOperator);
        }
        return oaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <R, C, V> void i(oa<R, C, V> table, @b9 R row, @b9 C column, V value, BinaryOperator<V> mergeFunction) {
        com.google.common.base.j0.E(value);
        V vW = table.w(row, column);
        if (vW == null) {
            table.e0(row, column, value);
            return;
        }
        Object objApply = mergeFunction.apply(vW, value);
        if (objApply == null) {
            table.remove(row, column);
        } else {
            table.e0(row, column, objApply);
        }
    }

    static <T, R, C, V> Collector<T, ?, k7<R, C, V>> j(final Function<? super T, ? extends R> rowFunction, final Function<? super T, ? extends C> columnFunction, final Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.j0.F(rowFunction, "rowFunction");
        com.google.common.base.j0.F(columnFunction, "columnFunction");
        com.google.common.base.j0.F(valueFunction, "valueFunction");
        int i10 = 2 & 0;
        return Collector.of(new Supplier() { // from class: com.google.common.collect.xa
            @Override // java.util.function.Supplier
            public final Object get() {
                return new k7.a();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.ya
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((k7.a) obj).g(rowFunction.apply(obj2), columnFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.za
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((k7.a) obj).c((k7.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.qa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k7.a) obj).a();
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, R, C, V> Collector<T, ?, k7<R, C, V>> k(final Function<? super T, ? extends R> rowFunction, final Function<? super T, ? extends C> columnFunction, final Function<? super T, ? extends V> valueFunction, final BinaryOperator<V> mergeFunction) {
        com.google.common.base.j0.F(rowFunction, "rowFunction");
        com.google.common.base.j0.F(columnFunction, "columnFunction");
        com.google.common.base.j0.F(valueFunction, "valueFunction");
        com.google.common.base.j0.F(mergeFunction, "mergeFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.ta
            @Override // java.util.function.Supplier
            public final Object get() {
                return ab.f();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.ua
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ab.b bVar = (ab.b) obj;
                bVar.b(rowFunction.apply(obj2), columnFunction.apply(obj2), valueFunction.apply(obj2), mergeFunction);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.va
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ab.b) obj).a((ab.b) obj2, mergeFunction);
            }
        }, new Function() { // from class: com.google.common.collect.wa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ab.b) obj).c();
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, R, C, V, I extends oa<R, C, V>> Collector<T, ?, I> l(final Function<? super T, ? extends R> rowFunction, final Function<? super T, ? extends C> columnFunction, final Function<? super T, ? extends V> valueFunction, final BinaryOperator<V> mergeFunction, Supplier<I> tableSupplier) {
        com.google.common.base.j0.E(rowFunction);
        com.google.common.base.j0.E(columnFunction);
        com.google.common.base.j0.E(valueFunction);
        com.google.common.base.j0.E(mergeFunction);
        com.google.common.base.j0.E(tableSupplier);
        return Collector.of(tableSupplier, new BiConsumer() { // from class: com.google.common.collect.ra
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                oa oaVar = (oa) obj;
                ab.i(oaVar, rowFunction.apply(obj2), columnFunction.apply(obj2), valueFunction.apply(obj2), mergeFunction);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.sa
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ab.g(mergeFunction, (oa) obj, (oa) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, R, C, V, I extends oa<R, C, V>> Collector<T, ?, I> m(Function<? super T, ? extends R> rowFunction, Function<? super T, ? extends C> columnFunction, Function<? super T, ? extends V> valueFunction, Supplier<I> tableSupplier) {
        return l(rowFunction, columnFunction, valueFunction, new BinaryOperator() { // from class: com.google.common.collect.pa
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ab.b(obj, obj2);
            }
        }, tableSupplier);
    }
}
