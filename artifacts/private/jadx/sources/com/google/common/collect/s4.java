package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
public abstract class s4<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.base.e0<Iterable<E>> f118083a;

    class a extends s4<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f118084b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Iterable iterable, final Iterable val$iterable) {
            super(iterable);
            this.f118084b = val$iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f118084b.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> extends s4<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f118085b;

        b(final Iterable val$inputs) {
            this.f118085b = val$inputs;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return p7.h(p7.b0(this.f118085b.iterator(), new t4()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class c<T> extends s4<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable[] f118086b;

        class a extends com.google.common.collect.b<Iterator<? extends T>> {
            a(int size) {
                super(size);
            }

            @Override // com.google.common.collect.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Iterator<? extends T> b(int i10) {
                return c.this.f118086b[i10].iterator();
            }
        }

        c(final Iterable[] val$inputs) {
            this.f118086b = val$inputs;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return p7.h(new a(this.f118086b.length));
        }
    }

    private static class d<E> implements com.google.common.base.t<Iterable<E>, s4<E>> {
        private d() {
        }

        @Override // com.google.common.base.t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s4<E> apply(Iterable<E> fromObject) {
            return s4.D(fromObject);
        }
    }

    protected s4() {
        this.f118083a = com.google.common.base.e0.a();
    }

    @z7.m(replacement = "checkNotNull(iterable)", staticImports = {"com.google.common.base.Preconditions.checkNotNull"})
    @Deprecated
    public static <E> s4<E> C(s4<E> iterable) {
        return (s4) com.google.common.base.j0.E(iterable);
    }

    public static <E> s4<E> D(final Iterable<E> iterable) {
        return iterable instanceof s4 ? (s4) iterable : new a(iterable, iterable);
    }

    public static <E> s4<E> F(E[] elements) {
        return D(Arrays.asList(elements));
    }

    private Iterable<E> G() {
        return this.f118083a.i(this);
    }

    public static <E> s4<E> N() {
        return D(Collections.EMPTY_LIST);
    }

    public static <E> s4<E> O(@b9 E element, E... elements) {
        return D(x7.c(element, elements));
    }

    public static <T> s4<T> l(final Iterable<? extends Iterable<? extends T>> inputs) {
        com.google.common.base.j0.E(inputs);
        return new b(inputs);
    }

    public static <T> s4<T> m(Iterable<? extends T> a10, Iterable<? extends T> b10) {
        return s(a10, b10);
    }

    public static <T> s4<T> n(Iterable<? extends T> a10, Iterable<? extends T> b10, Iterable<? extends T> c10) {
        return s(a10, b10, c10);
    }

    public static <T> s4<T> p(Iterable<? extends T> a10, Iterable<? extends T> b10, Iterable<? extends T> c10, Iterable<? extends T> d10) {
        return s(a10, b10, c10, d10);
    }

    @SafeVarargs
    public static <T> s4<T> r(Iterable<? extends T>... inputs) {
        return s((Iterable[]) Arrays.copyOf(inputs, inputs.length));
    }

    private static <T> s4<T> s(final Iterable<? extends T>... inputs) {
        for (Iterable<? extends T> iterable : inputs) {
            com.google.common.base.j0.E(iterable);
        }
        return new c(inputs);
    }

    public final com.google.common.base.e0<E> A() {
        Iterator<E> it = G().iterator();
        return it.hasNext() ? com.google.common.base.e0.f(it.next()) : com.google.common.base.e0.a();
    }

    public final com.google.common.base.e0<E> B(com.google.common.base.k0<? super E> predicate) {
        return o7.U(G(), predicate);
    }

    public final <K> m6<K, E> J(com.google.common.base.t<? super E, K> keyFunction) {
        return n8.s(G(), keyFunction);
    }

    public final String K(com.google.common.base.a0 joiner) {
        return joiner.k(this);
    }

    public final com.google.common.base.e0<E> L() {
        E next;
        Iterable<E> iterableG = G();
        if (iterableG instanceof List) {
            List list = (List) iterableG;
            return list.isEmpty() ? com.google.common.base.e0.a() : com.google.common.base.e0.f(list.get(list.size() - 1));
        }
        Iterator<E> it = iterableG.iterator();
        if (!it.hasNext()) {
            return com.google.common.base.e0.a();
        }
        if (iterableG instanceof SortedSet) {
            return com.google.common.base.e0.f(((SortedSet) iterableG).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return com.google.common.base.e0.f(next);
    }

    public final s4<E> M(int maxSize) {
        return D(o7.D(G(), maxSize));
    }

    public final s4<E> P(int numberToSkip) {
        return D(o7.N(G(), numberToSkip));
    }

    @com.google.common.annotations.c
    public final E[] Q(Class<E> cls) {
        return (E[]) o7.Q(G(), cls);
    }

    public final l6<E> R() {
        return l6.v(G());
    }

    public final <V> n6<E, V> S(com.google.common.base.t<? super E, V> valueFunction) {
        return b8.w0(G(), valueFunction);
    }

    public final t6<E> T() {
        return t6.u(G());
    }

    public final z6<E> U() {
        return z6.w(G());
    }

    public final l6<E> V(Comparator<? super E> comparator) {
        return a9.i(comparator).l(G());
    }

    public final j7<E> W(Comparator<? super E> comparator) {
        return j7.W(comparator, G());
    }

    public final <T> s4<T> Y(com.google.common.base.t<? super E, T> function) {
        return D(o7.T(G(), function));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> s4<T> Z(com.google.common.base.t<? super E, ? extends Iterable<? extends T>> function) {
        return l(Y(function));
    }

    public final <K> n6<K, E> a0(com.google.common.base.t<? super E, K> keyFunction) {
        return b8.G0(G(), keyFunction);
    }

    public final boolean c(com.google.common.base.k0<? super E> predicate) {
        return o7.b(G(), predicate);
    }

    public final boolean contains(@fj.a Object target) {
        return o7.k(G(), target);
    }

    public final boolean d(com.google.common.base.k0<? super E> predicate) {
        return o7.c(G(), predicate);
    }

    @b9
    public final E get(int i10) {
        return (E) o7.t(G(), i10);
    }

    public final s4<E> i(Iterable<? extends E> other) {
        return m(G(), other);
    }

    public final boolean isEmpty() {
        return !G().iterator().hasNext();
    }

    public final s4<E> k(E... elements) {
        return m(G(), Arrays.asList(elements));
    }

    public final int size() {
        return o7.M(G());
    }

    @z7.a
    public final <C extends Collection<? super E>> C t(C collection) {
        com.google.common.base.j0.E(collection);
        Iterable<E> iterableG = G();
        if (iterableG instanceof Collection) {
            collection.addAll((Collection) iterableG);
            return collection;
        }
        Iterator<E> it = iterableG.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public String toString() {
        return o7.S(G());
    }

    public final s4<E> u() {
        return D(o7.l(G()));
    }

    public final s4<E> v(com.google.common.base.k0<? super E> predicate) {
        return D(o7.o(G(), predicate));
    }

    @com.google.common.annotations.c
    public final <T> s4<T> w(Class<T> type) {
        return D(o7.p(G(), type));
    }

    s4(Iterable<E> iterable) {
        this.f118083a = com.google.common.base.e0.f(iterable);
    }
}
