package com.google.common.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@d6
@a4
@com.google.common.annotations.b
public final class j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collector<Object, ?, Optional<Object>> f117511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f117512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Collector<Object, ?, Object> f117513c;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f117514c = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        Object f117515a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<Object> f117516b = Collections.EMPTY_LIST;

        a() {
        }

        void a(Object o10) {
            com.google.common.base.j0.E(o10);
            if (this.f117515a == null) {
                this.f117515a = o10;
                return;
            }
            if (this.f117516b.isEmpty()) {
                ArrayList arrayList = new ArrayList(4);
                this.f117516b = arrayList;
                arrayList.add(o10);
            } else {
                if (this.f117516b.size() >= 4) {
                    throw e(true);
                }
                this.f117516b.add(o10);
            }
        }

        a b(a other) {
            if (this.f117515a == null) {
                return other;
            }
            if (other.f117515a != null) {
                if (this.f117516b.isEmpty()) {
                    this.f117516b = new ArrayList();
                }
                this.f117516b.add(other.f117515a);
                this.f117516b.addAll(other.f117516b);
                if (this.f117516b.size() > 4) {
                    List<Object> list = this.f117516b;
                    list.subList(4, list.size()).clear();
                    throw e(true);
                }
            }
            return this;
        }

        Object c() {
            if (this.f117515a == null) {
                throw new NoSuchElementException();
            }
            if (this.f117516b.isEmpty()) {
                return this.f117515a;
            }
            throw e(false);
        }

        @d6
        Optional<Object> d() {
            if (this.f117516b.isEmpty()) {
                return Optional.ofNullable(this.f117515a);
            }
            throw e(false);
        }

        IllegalArgumentException e(boolean overflow) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("expected one element but was: <");
            sb2.append(this.f117515a);
            for (Object obj : this.f117516b) {
                sb2.append(", ");
                sb2.append(obj);
            }
            if (overflow) {
                sb2.append(", ...");
            }
            sb2.append(kotlin.text.b0.f313281f);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    static {
        Supplier supplier = new Supplier() { // from class: com.google.common.collect.d8
            @Override // java.util.function.Supplier
            public final Object get() {
                return new j8.a();
            }
        };
        BiConsumer biConsumer = new BiConsumer() { // from class: com.google.common.collect.e8
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((j8.a) obj).a(obj2);
            }
        };
        BinaryOperator binaryOperator = new BinaryOperator() { // from class: com.google.common.collect.f8
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((j8.a) obj).b((j8.a) obj2);
            }
        };
        Function function = new Function() { // from class: com.google.common.collect.g8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((j8.a) obj).d();
            }
        };
        Collector.Characteristics characteristics = Collector.Characteristics.UNORDERED;
        f117511a = Collector.of(supplier, biConsumer, binaryOperator, function, characteristics);
        f117512b = new Object();
        f117513c = Collector.of(new Supplier() { // from class: com.google.common.collect.d8
            @Override // java.util.function.Supplier
            public final Object get() {
                return new j8.a();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.h8
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                j8.a((j8.a) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.f8
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((j8.a) obj).b((j8.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.i8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j8.b((j8.a) obj);
            }
        }, characteristics);
    }

    private j8() {
    }

    public static /* synthetic */ void a(a aVar, Object obj) {
        if (obj == null) {
            obj = f117512b;
        }
        aVar.a(obj);
    }

    public static /* synthetic */ Object b(a aVar) {
        Object objC = aVar.c();
        if (objC == f117512b) {
            return null;
        }
        return objC;
    }

    public static <T> Collector<T, ?, T> c() {
        return (Collector<T, ?, T>) f117513c;
    }

    public static <T> Collector<T, ?, Optional<T>> d() {
        return (Collector<T, ?, Optional<T>>) f117511a;
    }
}
