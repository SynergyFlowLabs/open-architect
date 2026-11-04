package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
public abstract class i7<E> extends t6<E> implements ga<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f117472h = 912559;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @a8.b
    @fj.a
    transient i7<E> f117473g;

    public static class a<E> extends t6.b<E> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Comparator<? super E> f117474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @com.google.common.annotations.e
        E[] f117475f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int[] f117476g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f117477h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f117478i;

        public a(Comparator<? super E> comparator) {
            super(true);
            this.f117474e = (Comparator) com.google.common.base.j0.E(comparator);
            this.f117475f = (E[]) new Object[4];
            this.f117476g = new int[4];
        }

        private void u(boolean z10) {
            int i10 = this.f117477h;
            if (i10 == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.f117475f, i10);
            Arrays.sort(objArr, this.f117474e);
            int i11 = 1;
            for (int i12 = 1; i12 < objArr.length; i12++) {
                if (this.f117474e.compare((Object) objArr[i11 - 1], (Object) objArr[i12]) < 0) {
                    objArr[i11] = objArr[i12];
                    i11++;
                }
            }
            Arrays.fill(objArr, i11, this.f117477h, (Object) null);
            if (z10) {
                int i13 = i11 * 4;
                int i14 = this.f117477h;
                if (i13 > i14 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, com.google.common.math.f.t(i14, (i14 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i15 = 0; i15 < this.f117477h; i15++) {
                int iBinarySearch = Arrays.binarySearch(objArr, 0, i11, this.f117475f[i15], this.f117474e);
                int i16 = this.f117476g[i15];
                if (i16 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i16;
                } else {
                    iArr[iBinarySearch] = ~i16;
                }
            }
            this.f117475f = (E[]) objArr;
            this.f117476g = iArr;
            this.f117477h = i11;
        }

        private void v() {
            u(false);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = this.f117477h;
                if (i10 >= i12) {
                    Arrays.fill(this.f117475f, i11, i12, (Object) null);
                    Arrays.fill(this.f117476g, i11, this.f117477h, 0);
                    this.f117477h = i11;
                    return;
                }
                int[] iArr = this.f117476g;
                int i13 = iArr[i10];
                if (i13 > 0) {
                    E[] eArr = this.f117475f;
                    eArr[i11] = eArr[i10];
                    iArr[i11] = i13;
                    i11++;
                }
                i10++;
            }
        }

        private void w() {
            int i10 = this.f117477h;
            E[] eArr = this.f117475f;
            if (i10 == eArr.length) {
                u(true);
            } else if (this.f117478i) {
                this.f117475f = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.f117478i = false;
        }

        @Override // com.google.common.collect.t6.b
        @z7.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a<E> a(E element) {
            return k(element, 1);
        }

        @Override // com.google.common.collect.t6.b
        @z7.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... elements) {
            for (E e10 : elements) {
                a(e10);
            }
            return this;
        }

        @Override // com.google.common.collect.t6.b
        @z7.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> elements) {
            if (elements instanceof q8) {
                for (q8.a<E> aVar : ((q8) elements).entrySet()) {
                    k(aVar.X0(), aVar.getCount());
                }
            } else {
                Iterator<? extends E> it = elements.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.t6.b
        @z7.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> elements) {
            while (elements.hasNext()) {
                a(elements.next());
            }
            return this;
        }

        @Override // com.google.common.collect.t6.b
        @z7.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<E> k(E element, int occurrences) {
            com.google.common.base.j0.E(element);
            a3.b(occurrences, "occurrences");
            if (occurrences == 0) {
                return this;
            }
            w();
            E[] eArr = this.f117475f;
            int i10 = this.f117477h;
            eArr[i10] = element;
            this.f117476g[i10] = occurrences;
            this.f117477h = i10 + 1;
            return this;
        }

        @Override // com.google.common.collect.t6.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public i7<E> e() {
            v();
            int i10 = this.f117477h;
            if (i10 == 0) {
                return i7.m0(this.f117474e);
            }
            r9 r9Var = (r9) j7.T(this.f117474e, i10, this.f117475f);
            long[] jArr = new long[this.f117477h + 1];
            int i11 = 0;
            while (i11 < this.f117477h) {
                int i12 = i11 + 1;
                jArr[i12] = jArr[i11] + ((long) this.f117476g[i11]);
                i11 = i12;
            }
            this.f117478i = true;
            return new q9(r9Var, jArr, 0, this.f117477h);
        }

        @Override // com.google.common.collect.t6.b
        @z7.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public a<E> m(E element, int count) {
            com.google.common.base.j0.E(element);
            a3.b(count, "count");
            w();
            E[] eArr = this.f117475f;
            int i10 = this.f117477h;
            eArr[i10] = element;
            this.f117476g[i10] = ~count;
            this.f117477h = i10 + 1;
            return this;
        }
    }

    @com.google.common.annotations.d
    private static final class b<E> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Comparator<? super E> f117479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final E[] f117480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int[] f117481c;

        b(ga<E> gaVar) {
            this.f117479a = gaVar.comparator();
            int size = gaVar.entrySet().size();
            this.f117480b = (E[]) new Object[size];
            this.f117481c = new int[size];
            int i10 = 0;
            for (q8.a<E> aVar : gaVar.entrySet()) {
                this.f117480b[i10] = aVar.X0();
                this.f117481c[i10] = aVar.getCount();
                i10++;
            }
        }

        Object readResolve() {
            int length = this.f117480b.length;
            a aVar = new a(this.f117479a);
            for (int i10 = 0; i10 < length; i10++) {
                aVar.k(this.f117480b[i10], this.f117481c[i10]);
            }
            return aVar.e();
        }
    }

    i7() {
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/i7<TE;>; */
    public static i7 A0(Comparable e10, Comparable e11, Comparable e12, Comparable e13, Comparable e14) {
        return Y(a9.z(), Arrays.asList(e10, e11, e12, e13, e14));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/i7<TE;>; */
    public static i7 C0(Comparable e10, Comparable e11, Comparable e12, Comparable e13, Comparable e14, Comparable e15, Comparable... remaining) {
        ArrayList arrayListU = x7.u(remaining.length + 6);
        Collections.addAll(arrayListU, e10, e11, e12, e13, e14, e15);
        Collections.addAll(arrayListU, remaining);
        return Y(a9.z(), arrayListU);
    }

    @z7.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> i7<E> D0(E e10) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> i7<E> E0(E e10, E e11) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> i7<E> F0(E e10, E e11, E e12) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> i7<E> G0(E e10, E e11, E e12, E e13) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> i7<E> H0(E e10, E e11, E e12, E e13, E e14) {
        throw new UnsupportedOperationException();
    }

    @z7.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> i7<E> I0(E e10, E e11, E e12, E e13, E e14, E e15, E... remaining) {
        throw new UnsupportedOperationException();
    }

    public static <E> a<E> J0(Comparator<E> comparator) {
        return new a<>(comparator);
    }

    public static <E extends Comparable<?>> a<E> K0() {
        return new a<>(a9.z().E());
    }

    @d6
    @z7.e("Use toImmutableSortedMultiset.")
    @Deprecated
    public static <E> Collector<E, ?, t6<E>> O() {
        throw new UnsupportedOperationException();
    }

    @d6
    public static <E> Collector<E, ?, i7<E>> O0(Comparator<? super E> comparator) {
        return P0(comparator, Function.identity(), new ToIntFunction() { // from class: com.google.common.collect.h7
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return i7.S(obj);
            }
        });
    }

    @d6
    @Deprecated
    @z7.e("Use toImmutableSortedMultiset.")
    public static <T, E> Collector<T, ?, t6<E>> P(Function<? super T, ? extends E> elementFunction, ToIntFunction<? super T> countFunction) {
        throw new UnsupportedOperationException();
    }

    @d6
    public static <T, E> Collector<T, ?, i7<E>> P0(final Comparator<? super E> comparator, final Function<? super T, ? extends E> elementFunction, final ToIntFunction<? super T> countFunction) {
        com.google.common.base.j0.E(comparator);
        com.google.common.base.j0.E(elementFunction);
        com.google.common.base.j0.E(countFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.d7
            @Override // java.util.function.Supplier
            public final Object get() {
                return jb.K(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.e7
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                i7.p0(obj2, (q8) obj, elementFunction, countFunction);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.f7
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return i7.U((q8) obj, (q8) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.g7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return i7.h0(comparator, ((q8) obj).entrySet());
            }
        }, new Collector.Characteristics[0]);
    }

    public static /* synthetic */ int S(Object obj) {
        return 1;
    }

    public static /* synthetic */ q8 U(q8 q8Var, q8 q8Var2) {
        q8Var.addAll(q8Var2);
        return q8Var;
    }

    @z7.e("Use naturalOrder.")
    @Deprecated
    public static <E> a<E> V() {
        throw new UnsupportedOperationException();
    }

    public static <E> i7<E> W(Iterable<? extends E> elements) {
        return Y(a9.z(), elements);
    }

    public static <E> i7<E> Y(Comparator<? super E> comparator, Iterable<? extends E> elements) {
        if (elements instanceof i7) {
            i7<E> i7Var = (i7) elements;
            if (comparator.equals(i7Var.comparator())) {
                return i7Var.m() ? h0(comparator, i7Var.entrySet().c()) : i7Var;
            }
        }
        return new a(comparator).c(elements).e();
    }

    public static <E> i7<E> Z(Comparator<? super E> comparator, Iterator<? extends E> elements) {
        com.google.common.base.j0.E(comparator);
        return new a(comparator).d(elements).e();
    }

    public static <E> i7<E> a0(Iterator<? extends E> elements) {
        return Z(a9.z(), elements);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/i7<TE;>; */
    public static i7 b0(Comparable[] elements) {
        return Y(a9.z(), Arrays.asList(elements));
    }

    @z7.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <Z> i7<Z> c0(Z[] elements) {
        throw new UnsupportedOperationException();
    }

    public static <E> i7<E> e0(ga<E> sortedMultiset) {
        return h0(sortedMultiset.comparator(), x7.r(sortedMultiset.entrySet()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> i7<E> h0(Comparator<? super E> comparator, Collection<q8.a<E>> entries) {
        if (entries.isEmpty()) {
            return m0(comparator);
        }
        l6.a aVar = new l6.a(entries.size());
        long[] jArr = new long[entries.size() + 1];
        int i10 = 0;
        for (q8.a<E> aVar2 : entries) {
            aVar.a(aVar2.X0());
            int i11 = i10 + 1;
            jArr[i11] = jArr[i10] + ((long) aVar2.getCount());
            i10 = i11;
        }
        return new q9(new r9(aVar.e(), comparator), jArr, 0, entries.size());
    }

    static <E> i7<E> m0(Comparator<? super E> comparator) {
        return a9.z().equals(comparator) ? (i7<E>) q9.f117997n : new q9(comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @d6
    public static <T, E> void p0(T t10, q8<E> multiset, Function<? super T, ? extends E> elementFunction, ToIntFunction<? super T> countFunction) {
        multiset.H(com.google.common.base.j0.E(elementFunction.apply(t10)), countFunction.applyAsInt(t10));
    }

    public static <E extends Comparable<?>> a<E> q0() {
        return new a<>(a9.z());
    }

    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> i7<E> s0() {
        return (i7<E>) q9.f117997n;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/i7<TE;>; */
    public static i7 t0(Comparable e10) {
        return new q9((r9) j7.u0(e10), new long[]{0, 1}, 0, 1);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/i7<TE;>; */
    public static i7 u0(Comparable e10, Comparable e11) {
        return Y(a9.z(), Arrays.asList(e10, e11));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/i7<TE;>; */
    public static i7 v0(Comparable e10, Comparable e11, Comparable e12) {
        return Y(a9.z(), Arrays.asList(e10, e11, e12));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/i7<TE;>; */
    public static i7 z0(Comparable e10, Comparable e11, Comparable e12, Comparable e13) {
        return Y(a9.z(), Arrays.asList(e10, e11, e12, e13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ga
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public i7<E> x3(E lowerBound, x lowerBoundType, E upperBound, x upperBoundType) {
        com.google.common.base.j0.y(comparator().compare(lowerBound, upperBound) <= 0, "Expected lowerBound <= upperBound but %s > %s", lowerBound, upperBound);
        return b4(lowerBound, lowerBoundType).T2(upperBound, upperBoundType);
    }

    @Override // com.google.common.collect.ga
    /* JADX INFO: renamed from: N0 */
    public abstract i7<E> b4(E lowerBound, x boundType);

    @Override // com.google.common.collect.ga, com.google.common.collect.ca
    public final Comparator<? super E> comparator() {
        return o().comparator();
    }

    @Override // com.google.common.collect.ga
    /* JADX INFO: renamed from: i0 */
    public i7<E> J2() {
        i7<E> i7VarM0 = this.f117473g;
        if (i7VarM0 == null) {
            i7VarM0 = isEmpty() ? m0(a9.i(comparator()).E()) : new w3<>(this);
            this.f117473g = i7VarM0;
        }
        return i7VarM0;
    }

    @Override // com.google.common.collect.t6, com.google.common.collect.q8
    /* JADX INFO: renamed from: l0 */
    public abstract j7<E> o();

    @Override // com.google.common.collect.ga
    /* JADX INFO: renamed from: n0 */
    public abstract i7<E> T2(E upperBound, x boundType);

    @Override // com.google.common.collect.ga
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    public final q8.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ga
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    public final q8.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.t6, com.google.common.collect.h6
    @com.google.common.annotations.d
    Object writeReplace() {
        return new b(this);
    }
}
