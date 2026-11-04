package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public final class b3 {

    static class a<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Collection<E> f117103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.common.base.k0<? super E> f117104b;

        a(Collection<E> unfiltered, com.google.common.base.k0<? super E> predicate) {
            this.f117103a = unfiltered;
            this.f117104b = predicate;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@b9 E element) {
            com.google.common.base.j0.d(this.f117104b.apply(element));
            return this.f117103a.add(element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                com.google.common.base.j0.d(this.f117104b.apply(it.next()));
            }
            return this.f117103a.addAll(collection);
        }

        a<E> c(com.google.common.base.k0<? super E> newPredicate) {
            return new a<>(this.f117103a, com.google.common.base.l0.d(this.f117104b, newPredicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            o7.J(this.f117103a, this.f117104b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@fj.a Object element) {
            if (b3.j(this.f117103a, element)) {
                return this.f117104b.apply(element);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return b3.b(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !o7.c(this.f117103a, this.f117104b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return p7.w(this.f117103a.iterator(), this.f117104b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@fj.a Object element) {
            return contains(element) && this.f117103a.remove(element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(final Collection<?> collection) {
            Iterator<E> it = this.f117103a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f117104b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(final Collection<?> collection) {
            Iterator<E> it = this.f117103a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f117104b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f117103a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f117104b.apply(it.next())) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return x7.s(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) x7.s(iterator()).toArray(tArr);
        }
    }

    private static final class b<E> extends AbstractCollection<List<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final l6<E> f117105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Comparator<? super E> f117106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f117107c;

        b(Iterable<E> input, Comparator<? super E> comparator) {
            l6<E> l6VarW = l6.W(comparator, input);
            this.f117105a = l6VarW;
            this.f117106b = comparator;
            this.f117107c = c(l6VarW, comparator);
        }

        private static <E> int c(List<E> sortedInputList, Comparator<? super E> comparator) {
            int i10 = 1;
            int iU = 1;
            int i11 = 1;
            while (i10 < sortedInputList.size()) {
                if (comparator.compare(sortedInputList.get(i10 - 1), sortedInputList.get(i10)) < 0) {
                    iU = com.google.common.math.f.u(iU, com.google.common.math.f.a(i10, i11));
                    if (iU == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    i11 = 0;
                }
                i10++;
                i11++;
            }
            return com.google.common.math.f.u(iU, com.google.common.math.f.a(i10, i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@fj.a Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return b3.e(this.f117105a, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new c(this.f117105a, this.f117106b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f117107c;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "orderedPermutationCollection(" + this.f117105a + ")";
        }
    }

    private static final class c<E> extends com.google.common.collect.c<List<E>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        List<E> f117108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Comparator<? super E> f117109d;

        c(List<E> list, Comparator<? super E> comparator) {
            this.f117108c = x7.r(list);
            this.f117109d = comparator;
        }

        void e() {
            int iG = g();
            if (iG == -1) {
                this.f117108c = null;
                return;
            }
            Objects.requireNonNull(this.f117108c);
            Collections.swap(this.f117108c, iG, h(iG));
            Collections.reverse(this.f117108c.subList(iG + 1, this.f117108c.size()));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c
        @fj.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public List<E> b() {
            List<E> list = this.f117108c;
            if (list == null) {
                return c();
            }
            l6 l6VarW = l6.w(list);
            e();
            return l6VarW;
        }

        int g() {
            Objects.requireNonNull(this.f117108c);
            for (int size = this.f117108c.size() - 2; size >= 0; size--) {
                if (this.f117109d.compare(this.f117108c.get(size), this.f117108c.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        int h(int i10) {
            Objects.requireNonNull(this.f117108c);
            E e10 = this.f117108c.get(i10);
            for (int size = this.f117108c.size() - 1; size > i10; size--) {
                if (this.f117109d.compare(e10, this.f117108c.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }
    }

    private static final class d<E> extends AbstractCollection<List<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final l6<E> f117110a;

        d(l6<E> input) {
            this.f117110a = input;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@fj.a Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return b3.e(this.f117110a, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new e(this.f117110a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return com.google.common.math.f.h(this.f117110a.size());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "permutations(" + this.f117110a + ")";
        }
    }

    private static class e<E> extends com.google.common.collect.c<List<E>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List<E> f117111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int[] f117112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int[] f117113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f117114f;

        e(List<E> list) {
            this.f117111c = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.f117112d = iArr;
            int[] iArr2 = new int[size];
            this.f117113e = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
            this.f117114f = Integer.MAX_VALUE;
        }

        void e() {
            int size = this.f117111c.size() - 1;
            this.f117114f = size;
            if (size == -1) {
                return;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f117112d;
                int i11 = this.f117114f;
                int i12 = iArr[i11];
                int i13 = this.f117113e[i11] + i12;
                if (i13 < 0) {
                    g();
                } else if (i13 != i11 + 1) {
                    Collections.swap(this.f117111c, (i11 - i12) + i10, (i11 - i13) + i10);
                    this.f117112d[this.f117114f] = i13;
                    return;
                } else {
                    if (i11 == 0) {
                        return;
                    }
                    i10++;
                    g();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c
        @fj.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public List<E> b() {
            if (this.f117114f <= 0) {
                return c();
            }
            l6 l6VarW = l6.w(this.f117111c);
            e();
            return l6VarW;
        }

        void g() {
            int[] iArr = this.f117113e;
            int i10 = this.f117114f;
            iArr[i10] = -iArr[i10];
            this.f117114f = i10 - 1;
        }
    }

    static class f<F, T> extends AbstractCollection<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Collection<F> f117115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.common.base.t<? super F, ? extends T> f117116b;

        f(Collection<F> fromCollection, com.google.common.base.t<? super F, ? extends T> function) {
            this.f117115a = (Collection) com.google.common.base.j0.E(fromCollection);
            this.f117116b = (com.google.common.base.t) com.google.common.base.j0.E(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f117115a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f117115a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return p7.b0(this.f117115a.iterator(), this.f117116b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f117115a.size();
        }
    }

    private b3() {
    }

    static boolean b(Collection<?> self, Collection<?> c10) {
        Iterator<?> it = c10.iterator();
        while (it.hasNext()) {
            if (!self.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static <E> y8<E> c(Collection<E> collection) {
        y8<E> y8Var = new y8<>();
        for (E e10 : collection) {
            y8Var.v(e10, y8Var.g(e10) + 1);
        }
        return y8Var;
    }

    public static <E> Collection<E> d(Collection<E> unfiltered, com.google.common.base.k0<? super E> predicate) {
        return unfiltered instanceof a ? ((a) unfiltered).c(predicate) : new a((Collection) com.google.common.base.j0.E(unfiltered), (com.google.common.base.k0) com.google.common.base.j0.E(predicate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(List<?> first, List<?> second) {
        if (first.size() != second.size()) {
            return false;
        }
        y8 y8VarC = c(first);
        y8 y8VarC2 = c(second);
        if (first.size() != second.size()) {
            return false;
        }
        for (int i10 = 0; i10 < first.size(); i10++) {
            if (y8VarC.l(i10) != y8VarC2.g(y8VarC.j(i10))) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder f(int size) {
        a3.b(size, "size");
        return new StringBuilder((int) Math.min(((long) size) * 8, org.apache.commons.io.k.f336695f));
    }

    public static <E extends Comparable<? super E>> Collection<List<E>> g(Iterable<E> elements) {
        return h(elements, a9.z());
    }

    public static <E> Collection<List<E>> h(Iterable<E> elements, Comparator<? super E> comparator) {
        return new b(elements, comparator);
    }

    public static <E> Collection<List<E>> i(Collection<E> elements) {
        return new d(l6.w(elements));
    }

    static boolean j(Collection<?> collection, @fj.a Object object) {
        com.google.common.base.j0.E(collection);
        try {
            return collection.contains(object);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static boolean k(Collection<?> collection, @fj.a Object object) {
        com.google.common.base.j0.E(collection);
        try {
            return collection.remove(object);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static String l(final Collection<?> collection) {
        StringBuilder sbF = f(collection.size());
        sbF.append(AbstractJsonLexerKt.BEGIN_LIST);
        boolean z10 = true;
        for (Object obj : collection) {
            if (!z10) {
                sbF.append(", ");
            }
            if (obj == collection) {
                sbF.append("(this Collection)");
            } else {
                sbF.append(obj);
            }
            z10 = false;
        }
        sbF.append(AbstractJsonLexerKt.END_LIST);
        return sbF.toString();
    }

    public static <F, T> Collection<T> m(Collection<F> fromCollection, com.google.common.base.t<? super F, T> function) {
        return new f(fromCollection, function);
    }
}
