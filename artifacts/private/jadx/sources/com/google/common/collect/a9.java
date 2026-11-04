package com.google.common.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class a9<T> implements Comparator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f117087a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f117088b = -1;

    @com.google.common.annotations.d
    @com.google.common.annotations.e
    static class a extends a9<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f117089c = new AtomicInteger(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ConcurrentMap<Object, Integer> f117090d = d9.m(new z7()).i();

        a() {
        }

        private Integer H(Object obj) {
            Integer numPutIfAbsent;
            Integer numValueOf = this.f117090d.get(obj);
            return (numValueOf != null || (numPutIfAbsent = this.f117090d.putIfAbsent(obj, (numValueOf = Integer.valueOf(this.f117089c.getAndIncrement())))) == null) ? numValueOf : numPutIfAbsent;
        }

        int I(Object object) {
            return System.identityHashCode(object);
        }

        @Override // com.google.common.collect.a9, java.util.Comparator
        public int compare(@fj.a Object left, @fj.a Object right) {
            if (left == right) {
                return 0;
            }
            if (left == null) {
                return -1;
            }
            if (right == null) {
                return 1;
            }
            int I = I(left);
            int I2 = I(right);
            if (I != I2) {
                return I < I2 ? -1 : 1;
            }
            int iCompareTo = H(left).compareTo(H(right));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    @com.google.common.annotations.d
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a9<Object> f117091a = new a();

        private b() {
        }
    }

    static class c extends ClassCastException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f117092b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f117093a;

        c(Object value) {
            super("Cannot compare value: " + value);
            this.f117093a = value;
        }
    }

    protected a9() {
    }

    @com.google.common.annotations.b(serializable = true)
    public static a9<Object> G() {
        return qb.f118002c;
    }

    @com.google.common.annotations.b(serializable = true)
    public static a9<Object> a() {
        return r.f118004c;
    }

    @com.google.common.annotations.d
    public static a9<Object> b() {
        return b.f117091a;
    }

    @com.google.common.annotations.b(serializable = true)
    public static <T> a9<T> d(Iterable<? extends Comparator<? super T>> comparators) {
        return new o3(comparators);
    }

    @com.google.common.annotations.b(serializable = true)
    public static <T> a9<T> f(T leastValue, T... remainingValuesInOrder) {
        return g(x7.c(leastValue, remainingValuesInOrder));
    }

    @com.google.common.annotations.b(serializable = true)
    public static <T> a9<T> g(List<T> valuesInOrder) {
        return new i4(valuesInOrder);
    }

    @com.google.common.annotations.b(serializable = true)
    @Deprecated
    public static <T> a9<T> h(a9<T> ordering) {
        return (a9) com.google.common.base.j0.E(ordering);
    }

    @com.google.common.annotations.b(serializable = true)
    public static <T> a9<T> i(Comparator<T> comparator) {
        return comparator instanceof a9 ? (a9) comparator : new h3(comparator);
    }

    @com.google.common.annotations.b(serializable = true)
    public static <C extends Comparable> a9<C> z() {
        return t8.f118139e;
    }

    @com.google.common.annotations.b(serializable = true)
    public <S extends T> a9<S> A() {
        return new v8(this);
    }

    @com.google.common.annotations.b(serializable = true)
    public <S extends T> a9<S> B() {
        return new w8(this);
    }

    <T2 extends T> a9<Map.Entry<T2, ?>> C() {
        return (a9<Map.Entry<T2, ?>>) D(b8.R());
    }

    @com.google.common.annotations.b(serializable = true)
    public <F> a9<F> D(com.google.common.base.t<F, ? extends T> function) {
        return new y(function, this);
    }

    @com.google.common.annotations.b(serializable = true)
    public <S extends T> a9<S> E() {
        return new v9(this);
    }

    public <E extends T> List<E> F(Iterable<E> elements) {
        Object[] objArrP = o7.P(elements);
        Arrays.sort(objArrP, this);
        return x7.r(Arrays.asList(objArrP));
    }

    @Deprecated
    public int c(List<? extends T> sortedList, @b9 T key) {
        return Collections.binarySearch(sortedList, key, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(@b9 T left, @b9 T right);

    @com.google.common.annotations.b(serializable = true)
    public <U extends T> a9<U> e(Comparator<? super U> secondaryComparator) {
        return new o3(this, (Comparator) com.google.common.base.j0.E(secondaryComparator));
    }

    public <E extends T> List<E> j(Iterable<E> iterable, int k10) {
        return E().o(iterable, k10);
    }

    public <E extends T> List<E> k(Iterator<E> iterator, int k10) {
        return E().p(iterator, k10);
    }

    public <E extends T> l6<E> l(Iterable<E> elements) {
        return l6.W(this, elements);
    }

    public boolean m(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (compare(next, next2) > 0) {
                    return false;
                }
                next = next2;
            }
        }
        return true;
    }

    public boolean n(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (compare(next, next2) >= 0) {
                    return false;
                }
                next = next2;
            }
        }
        return true;
    }

    public <E extends T> List<E> o(Iterable<E> iterable, int k10) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= ((long) k10) * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > k10) {
                    array = Arrays.copyOf(array, k10);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return p(iterable.iterator(), k10);
    }

    public <E extends T> List<E> p(Iterator<E> iterator, int k10) {
        com.google.common.base.j0.E(iterator);
        a3.b(k10, "k");
        if (k10 == 0 || !iterator.hasNext()) {
            return Collections.EMPTY_LIST;
        }
        if (k10 < 1073741823) {
            db dbVarE = db.e(k10, this);
            dbVarE.h(iterator);
            return dbVarE.k();
        }
        ArrayList arrayListS = x7.s(iterator);
        Collections.sort(arrayListS, this);
        if (arrayListS.size() > k10) {
            arrayListS.subList(k10, arrayListS.size()).clear();
        }
        arrayListS.trimToSize();
        return Collections.unmodifiableList(arrayListS);
    }

    @com.google.common.annotations.b(serializable = true)
    public <S extends T> a9<Iterable<S>> q() {
        return new r7(this);
    }

    @b9
    public <E extends T> E r(Iterable<E> iterable) {
        return (E) u(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @b9
    public <E extends T> E s(@b9 E a10, @b9 E b10) {
        return compare(a10, b10) >= 0 ? a10 : b10;
    }

    @b9
    public <E extends T> E t(@b9 E e10, @b9 E e11, @b9 E e12, E... eArr) {
        E e13 = (E) s(s(e10, e11), e12);
        for (E e14 : eArr) {
            e13 = (E) s(e13, e14);
        }
        return e13;
    }

    @b9
    public <E extends T> E u(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) s(next, it.next());
        }
        return next;
    }

    @b9
    public <E extends T> E v(Iterable<E> iterable) {
        return (E) y(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @b9
    public <E extends T> E w(@b9 E a10, @b9 E b10) {
        return compare(a10, b10) <= 0 ? a10 : b10;
    }

    @b9
    public <E extends T> E x(@b9 E e10, @b9 E e11, @b9 E e12, E... eArr) {
        E e13 = (E) w(w(e10, e11), e12);
        for (E e14 : eArr) {
            e13 = (E) w(e13, e14);
        }
        return e13;
    }

    @b9
    public <E extends T> E y(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) w(next, it.next());
        }
        return next;
    }
}
