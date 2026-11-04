package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
public final class o7 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends s4<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f117892b;

        a(final Iterable val$iterable) {
            this.f117892b = val$iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return p7.q(this.f117892b);
        }

        @Override // com.google.common.collect.s4
        public String toString() {
            return this.f117892b.toString() + " (cycled)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> extends s4<List<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f117893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f117894c;

        b(final Iterable val$iterable, final int val$size) {
            this.f117893b = val$iterable;
            this.f117894c = val$size;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return p7.P(this.f117893b.iterator(), this.f117894c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class c<T> extends s4<List<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f117895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f117896c;

        c(final Iterable val$iterable, final int val$size) {
            this.f117895b = val$iterable;
            this.f117896c = val$size;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return p7.O(this.f117895b.iterator(), this.f117896c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class d<T> extends s4<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f117897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.k0 f117898c;

        d(final Iterable val$unfiltered, final com.google.common.base.k0 val$retainIfTrue) {
            this.f117897b = val$unfiltered;
            this.f117898c = val$retainIfTrue;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return p7.w(this.f117897b.iterator(), this.f117898c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class e<T> extends s4<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f117899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.t f117900c;

        e(final Iterable val$fromIterable, final com.google.common.base.t val$function) {
            this.f117899b = val$fromIterable;
            this.f117900c = val$function;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return p7.b0(this.f117899b.iterator(), this.f117900c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class f<T> extends s4<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f117901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f117902c;

        class a implements Iterator<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            boolean f117903a = true;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f117904b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f f117905c;

            a(final f this$0, final Iterator val$iterator) {
                this.f117904b = val$iterator;
                this.f117905c = this$0;
                int i10 = 2 << 1;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f117904b.hasNext();
            }

            @Override // java.util.Iterator
            @b9
            public T next() {
                T t10 = (T) this.f117904b.next();
                this.f117903a = false;
                return t10;
            }

            @Override // java.util.Iterator
            public void remove() {
                a3.e(!this.f117903a);
                this.f117904b.remove();
            }
        }

        f(final Iterable val$iterable, final int val$numberToSkip) {
            this.f117901b = val$iterable;
            this.f117902c = val$numberToSkip;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f117901b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f117902c), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            p7.b(it, this.f117902c);
            return new a(this, it);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class g<T> extends s4<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f117906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f117907c;

        g(final Iterable val$iterable, final int val$limitSize) {
            this.f117906b = val$iterable;
            this.f117907c = val$limitSize;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return p7.M(this.f117906b.iterator(), this.f117907c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class h<T> extends s4<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f117908b;

        h(final Iterable val$iterable) {
            this.f117908b = val$iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f117908b;
            return iterable instanceof Queue ? new r3((Queue) iterable) : p7.o(iterable.iterator());
        }

        @Override // com.google.common.collect.s4
        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class i<T> extends s4<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f117909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Comparator f117910c;

        i(final Iterable val$iterables, final Comparator val$comparator) {
            this.f117909b = val$iterables;
            this.f117910c = val$comparator;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return p7.N(o7.T(this.f117909b, new t4()), this.f117910c);
        }
    }

    private static final class j<T> extends s4<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterable<? extends T> f117911b;

        /* synthetic */ j(Iterable iterable, a aVar) {
            this(iterable);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return p7.e0(this.f117911b.iterator());
        }

        @Override // com.google.common.collect.s4
        public String toString() {
            return this.f117911b.toString();
        }

        private j(Iterable<? extends T> iterable) {
            this.f117911b = iterable;
        }
    }

    private o7() {
    }

    @b9
    public static <T> T A(Iterable<? extends T> iterable, @b9 T t10) {
        return (T) p7.K(iterable.iterator(), t10);
    }

    public static <T> int B(Iterable<T> iterable, com.google.common.base.k0<? super T> predicate) {
        return p7.L(iterable.iterator(), predicate);
    }

    public static boolean C(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> D(final Iterable<T> iterable, final int limitSize) {
        com.google.common.base.j0.E(iterable);
        com.google.common.base.j0.e(limitSize >= 0, "limit is negative");
        return new g(iterable, limitSize);
    }

    public static <T> Iterable<T> E(final Iterable<? extends Iterable<? extends T>> iterables, final Comparator<? super T> comparator) {
        com.google.common.base.j0.F(iterables, "iterables");
        com.google.common.base.j0.F(comparator, "comparator");
        return new j(new i(iterables, comparator), null);
    }

    public static <T> Iterable<List<T>> F(final Iterable<T> iterable, final int size) {
        com.google.common.base.j0.E(iterable);
        com.google.common.base.j0.d(size > 0);
        return new c(iterable, size);
    }

    public static <T> Iterable<List<T>> G(final Iterable<T> iterable, final int size) {
        com.google.common.base.j0.E(iterable);
        com.google.common.base.j0.d(size > 0);
        return new b(iterable, size);
    }

    @z7.a
    public static boolean H(Iterable<?> removeFrom, Collection<?> elementsToRemove) {
        return removeFrom instanceof Collection ? ((Collection) removeFrom).removeAll((Collection) com.google.common.base.j0.E(elementsToRemove)) : p7.U(removeFrom.iterator(), elementsToRemove);
    }

    @fj.a
    static <T> T I(Iterable<T> removeFrom, com.google.common.base.k0<? super T> predicate) {
        com.google.common.base.j0.E(predicate);
        Iterator<T> it = removeFrom.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    @z7.a
    public static <T> boolean J(Iterable<T> removeFrom, com.google.common.base.k0<? super T> predicate) {
        return ((removeFrom instanceof RandomAccess) && (removeFrom instanceof List)) ? K((List) removeFrom, (com.google.common.base.k0) com.google.common.base.j0.E(predicate)) : p7.V(removeFrom.iterator(), predicate);
    }

    private static <T> boolean K(List<T> list, com.google.common.base.k0<? super T> predicate) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            T t10 = list.get(i10);
            if (!predicate.apply(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (IllegalArgumentException unused) {
                        O(list, predicate, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        O(list, predicate, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    @z7.a
    public static boolean L(Iterable<?> removeFrom, Collection<?> elementsToRetain) {
        return removeFrom instanceof Collection ? ((Collection) removeFrom).retainAll((Collection) com.google.common.base.j0.E(elementsToRetain)) : p7.W(removeFrom.iterator(), elementsToRetain);
    }

    public static int M(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : p7.Y(iterable.iterator());
    }

    public static <T> Iterable<T> N(final Iterable<T> iterable, final int numberToSkip) {
        com.google.common.base.j0.E(iterable);
        com.google.common.base.j0.e(numberToSkip >= 0, "number to skip cannot be negative");
        return new f(iterable, numberToSkip);
    }

    private static <T> void O(List<T> list, com.google.common.base.k0<? super T> predicate, int to, int from) {
        for (int size = list.size() - 1; size > from; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i10 = from - 1; i10 >= to; i10--) {
            list.remove(i10);
        }
    }

    static Object[] P(Iterable<?> iterable) {
        return d(iterable).toArray();
    }

    @com.google.common.annotations.c
    public static <T> T[] Q(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) R(iterable, x8.i(cls, 0));
    }

    static <T> T[] R(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) d(iterable).toArray(tArr);
    }

    public static String S(Iterable<?> iterable) {
        return p7.a0(iterable.iterator());
    }

    public static <F, T> Iterable<T> T(final Iterable<F> fromIterable, final com.google.common.base.t<? super F, ? extends T> function) {
        com.google.common.base.j0.E(fromIterable);
        com.google.common.base.j0.E(function);
        return new e(fromIterable, function);
    }

    public static <T> com.google.common.base.e0<T> U(Iterable<T> iterable, com.google.common.base.k0<? super T> predicate) {
        return p7.c0(iterable.iterator(), predicate);
    }

    @Deprecated
    public static <E> Iterable<E> V(h6<E> iterable) {
        return (Iterable) com.google.common.base.j0.E(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> W(final Iterable<? extends T> iterable) {
        com.google.common.base.j0.E(iterable);
        return ((iterable instanceof j) || (iterable instanceof h6)) ? iterable : new j(iterable, null);
    }

    @z7.a
    public static <T> boolean a(Collection<T> addTo, Iterable<? extends T> elementsToAdd) {
        return elementsToAdd instanceof Collection ? addTo.addAll((Collection) elementsToAdd) : p7.a(addTo, ((Iterable) com.google.common.base.j0.E(elementsToAdd)).iterator());
    }

    public static <T> boolean b(Iterable<T> iterable, com.google.common.base.k0<? super T> predicate) {
        return p7.c(iterable.iterator(), predicate);
    }

    public static <T> boolean c(Iterable<T> iterable, com.google.common.base.k0<? super T> predicate) {
        return p7.d(iterable.iterator(), predicate);
    }

    private static <E> Collection<E> d(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : x7.s(iterable.iterator());
    }

    public static <T> Iterable<T> e(Iterable<? extends Iterable<? extends T>> inputs) {
        return s4.l(inputs);
    }

    public static <T> Iterable<T> f(Iterable<? extends T> a10, Iterable<? extends T> b10) {
        return s4.m(a10, b10);
    }

    public static <T> Iterable<T> g(Iterable<? extends T> a10, Iterable<? extends T> b10, Iterable<? extends T> c10) {
        return s4.n(a10, b10, c10);
    }

    public static <T> Iterable<T> h(Iterable<? extends T> a10, Iterable<? extends T> b10, Iterable<? extends T> c10, Iterable<? extends T> d10) {
        return s4.p(a10, b10, c10, d10);
    }

    @SafeVarargs
    public static <T> Iterable<T> i(Iterable<? extends T>... inputs) {
        return s4.r(inputs);
    }

    public static <T> Iterable<T> j(final Iterable<T> iterable) {
        com.google.common.base.j0.E(iterable);
        return new h(iterable);
    }

    public static boolean k(Iterable<? extends Object> iterable, @fj.a Object element) {
        return iterable instanceof Collection ? b3.j((Collection) iterable, element) : p7.p(iterable.iterator(), element);
    }

    public static <T> Iterable<T> l(final Iterable<T> iterable) {
        com.google.common.base.j0.E(iterable);
        return new a(iterable);
    }

    @SafeVarargs
    public static <T> Iterable<T> m(T... elements) {
        return l(x7.t(elements));
    }

    public static boolean n(Iterable<?> iterable1, Iterable<?> iterable2) {
        if ((iterable1 instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable1).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return p7.s(iterable1.iterator(), iterable2.iterator());
    }

    public static <T> Iterable<T> o(final Iterable<T> unfiltered, final com.google.common.base.k0<? super T> retainIfTrue) {
        com.google.common.base.j0.E(unfiltered);
        com.google.common.base.j0.E(retainIfTrue);
        return new d(unfiltered, retainIfTrue);
    }

    @com.google.common.annotations.c
    public static <T> Iterable<T> p(final Iterable<?> unfiltered, final Class<T> desiredType) {
        com.google.common.base.j0.E(unfiltered);
        com.google.common.base.j0.E(desiredType);
        return o(unfiltered, com.google.common.base.l0.o(desiredType));
    }

    @b9
    public static <T> T q(Iterable<T> iterable, com.google.common.base.k0<? super T> k0Var) {
        return (T) p7.y(iterable.iterator(), k0Var);
    }

    @fj.a
    public static <T> T r(Iterable<? extends T> iterable, com.google.common.base.k0<? super T> k0Var, @fj.a T t10) {
        return (T) p7.z(iterable.iterator(), k0Var, t10);
    }

    public static int s(Iterable<?> iterable, @fj.a Object obj) {
        if (iterable instanceof q8) {
            return ((q8) iterable).P3(obj);
        }
        return iterable instanceof Set ? ((Set) iterable).contains(obj) ? 1 : 0 : p7.D(iterable.iterator(), obj);
    }

    @b9
    public static <T> T t(Iterable<T> iterable, int i10) {
        com.google.common.base.j0.E(iterable);
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) p7.E(iterable.iterator(), i10);
    }

    @b9
    public static <T> T u(Iterable<? extends T> iterable, int i10, @b9 T t10) {
        com.google.common.base.j0.E(iterable);
        p7.f(i10);
        if (iterable instanceof List) {
            List listF = x7.f(iterable);
            return i10 < listF.size() ? (T) listF.get(i10) : t10;
        }
        Iterator<? extends T> it = iterable.iterator();
        p7.b(it, i10);
        return (T) p7.I(it, t10);
    }

    @b9
    public static <T> T v(Iterable<? extends T> iterable, @b9 T t10) {
        return (T) p7.I(iterable.iterator(), t10);
    }

    @b9
    public static <T> T w(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) p7.G(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) y(list);
    }

    @b9
    public static <T> T x(Iterable<? extends T> iterable, @b9 T t10) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t10;
            }
            if (iterable instanceof List) {
                return (T) y(x7.f(iterable));
            }
        }
        return (T) p7.H(iterable.iterator(), t10);
    }

    @b9
    private static <T> T y(List<T> list) {
        return list.get(list.size() - 1);
    }

    @b9
    public static <T> T z(Iterable<T> iterable) {
        return (T) p7.J(iterable.iterator());
    }
}
