package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public abstract class l6<E> extends h6<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ob<Object> f117599d = new b(m9.f117681h, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f117600e = -889275714;

    public static final class a<E> extends h6.a<E> {
        public a() {
            this(4);
        }

        @Override // com.google.common.collect.h6.a
        @z7.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a<E> a(E element) {
            super.a(element);
            return this;
        }

        @Override // com.google.common.collect.h6.a, com.google.common.collect.h6.b
        @z7.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... elements) {
            super.b(elements);
            return this;
        }

        @Override // com.google.common.collect.h6.a, com.google.common.collect.h6.b
        @z7.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> elements) {
            super.c(elements);
            return this;
        }

        @Override // com.google.common.collect.h6.b
        @z7.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> elements) {
            super.d(elements);
            return this;
        }

        @Override // com.google.common.collect.h6.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public l6<E> e() {
            this.f117445d = true;
            return l6.r(this.f117443b, this.f117444c);
        }

        l6<E> o(Comparator<? super E> comparator) {
            this.f117445d = true;
            Arrays.sort(this.f117443b, 0, this.f117444c, comparator);
            return l6.r(this.f117443b, this.f117444c);
        }

        @z7.a
        a<E> p(a<E> other) {
            h(other.f117443b, other.f117444c);
            return this;
        }

        a(int capacity) {
            super(capacity);
        }
    }

    static class b<E> extends com.google.common.collect.b<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l6<E> f117601c;

        b(l6<E> list, int index) {
            super(list.size(), index);
            this.f117601c = list;
        }

        @Override // com.google.common.collect.b
        protected E b(int index) {
            return this.f117601c.get(index);
        }
    }

    private static class c<E> extends l6<E> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient l6<E> f117602f;

        c(l6<E> backingList) {
            this.f117602f = backingList;
        }

        private int b0(int index) {
            return (size() - 1) - index;
        }

        private int c0(int index) {
            return size() - index;
        }

        @Override // com.google.common.collect.l6
        public l6<E> U() {
            return this.f117602f;
        }

        @Override // com.google.common.collect.l6, java.util.List
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public l6<E> subList(int fromIndex, int toIndex) {
            com.google.common.base.j0.f0(fromIndex, toIndex, size());
            return this.f117602f.subList(c0(toIndex), c0(fromIndex)).U();
        }

        @Override // com.google.common.collect.l6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object object) {
            return this.f117602f.contains(object);
        }

        @Override // java.util.List
        public E get(int index) {
            com.google.common.base.j0.C(index, size());
            return this.f117602f.get(b0(index));
        }

        @Override // com.google.common.collect.l6, java.util.List
        public int indexOf(@fj.a Object object) {
            int iLastIndexOf = this.f117602f.lastIndexOf(object);
            if (iLastIndexOf >= 0) {
                return b0(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.l6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.l6, java.util.List
        public int lastIndexOf(@fj.a Object object) {
            int iIndexOf = this.f117602f.indexOf(object);
            if (iIndexOf >= 0) {
                return b0(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.l6, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return this.f117602f.m();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f117602f.size();
        }

        @Override // com.google.common.collect.l6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.l6, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int index) {
            return super.listIterator(index);
        }
    }

    @com.google.common.annotations.d
    static class d implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f117603b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object[] f117604a;

        d(Object[] elements) {
            this.f117604a = elements;
        }

        Object readResolve() {
            return l6.B(this.f117604a);
        }
    }

    class e extends l6<E> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final transient int f117605f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final transient int f117606g;

        e(int offset, int length) {
            this.f117605f = offset;
            this.f117606g = length;
        }

        @Override // com.google.common.collect.l6, java.util.List
        /* JADX INFO: renamed from: Y */
        public l6<E> subList(int fromIndex, int toIndex) {
            com.google.common.base.j0.f0(fromIndex, toIndex, this.f117606g);
            l6 l6Var = l6.this;
            int i10 = this.f117605f;
            return l6Var.subList(fromIndex + i10, toIndex + i10);
        }

        @Override // java.util.List
        public E get(int index) {
            com.google.common.base.j0.C(index, this.f117606g);
            return l6.this.get(index + this.f117605f);
        }

        @Override // com.google.common.collect.h6
        @fj.a
        Object[] i() {
            return l6.this.i();
        }

        @Override // com.google.common.collect.l6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.h6
        int k() {
            return l6.this.l() + this.f117605f + this.f117606g;
        }

        @Override // com.google.common.collect.h6
        int l() {
            return l6.this.l() + this.f117605f;
        }

        @Override // com.google.common.collect.l6, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f117606g;
        }

        @Override // com.google.common.collect.l6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.l6, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int index) {
            return super.listIterator(index);
        }
    }

    l6() {
    }

    public static <E> l6<E> A(Iterator<? extends E> elements) {
        if (!elements.hasNext()) {
            return F();
        }
        E next = elements.next();
        return !elements.hasNext() ? G(next) : new a().a(next).d(elements).e();
    }

    public static <E> l6<E> B(E[] elements) {
        return elements.length == 0 ? F() : u((Object[]) elements.clone());
    }

    public static <E> l6<E> F() {
        return (l6<E>) m9.f117681h;
    }

    public static <E> l6<E> G(E e10) {
        return u(e10);
    }

    public static <E> l6<E> J(E e10, E e11) {
        return u(e10, e11);
    }

    public static <E> l6<E> K(E e10, E e11, E e12) {
        return u(e10, e11, e12);
    }

    public static <E> l6<E> L(E e10, E e11, E e12, E e13) {
        return u(e10, e11, e12, e13);
    }

    public static <E> l6<E> M(E e10, E e11, E e12, E e13, E e14) {
        return u(e10, e11, e12, e13, e14);
    }

    public static <E> l6<E> N(E e10, E e11, E e12, E e13, E e14, E e15) {
        return u(e10, e11, e12, e13, e14, e15);
    }

    public static <E> l6<E> O(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return u(e10, e11, e12, e13, e14, e15, e16);
    }

    public static <E> l6<E> P(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17) {
        return u(e10, e11, e12, e13, e14, e15, e16, e17);
    }

    public static <E> l6<E> Q(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18) {
        return u(e10, e11, e12, e13, e14, e15, e16, e17, e18);
    }

    public static <E> l6<E> R(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19) {
        return u(e10, e11, e12, e13, e14, e15, e16, e17, e18, e19);
    }

    public static <E> l6<E> S(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e110) {
        return u(e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e110);
    }

    @SafeVarargs
    public static <E> l6<E> T(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e110, E e111, E... others) {
        com.google.common.base.j0.e(others.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[others.length + 12];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        objArr[6] = e16;
        objArr[7] = e17;
        objArr[8] = e18;
        objArr[9] = e19;
        objArr[10] = e110;
        objArr[11] = e111;
        System.arraycopy(others, 0, objArr, 12, others.length);
        return u(objArr);
    }

    public static <E extends Comparable<? super E>> l6<E> V(Iterable<? extends E> elements) {
        Comparable[] comparableArr = (Comparable[]) o7.R(elements, new Comparable[0]);
        x8.b(comparableArr);
        Arrays.sort(comparableArr);
        return p(comparableArr);
    }

    public static <E> l6<E> W(Comparator<? super E> comparator, Iterable<? extends E> elements) {
        com.google.common.base.j0.E(comparator);
        Object[] objArrP = o7.P(elements);
        x8.b(objArrP);
        Arrays.sort(objArrP, comparator);
        return p(objArrP);
    }

    @d6
    public static <E> Collector<E, ?, l6<E>> a0() {
        return y2.L();
    }

    static <E> l6<E> p(Object[] elements) {
        return r(elements, elements.length);
    }

    static <E> l6<E> r(Object[] elements, int length) {
        return length == 0 ? F() : new m9(elements, length);
    }

    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> a<E> s() {
        return new a<>();
    }

    public static <E> a<E> t(int expectedSize) {
        a3.b(expectedSize, "expectedSize");
        return new a<>(expectedSize);
    }

    private static <E> l6<E> u(Object... elements) {
        return p(x8.b(elements));
    }

    public static <E> l6<E> v(Iterable<? extends E> elements) {
        com.google.common.base.j0.E(elements);
        return elements instanceof Collection ? w((Collection) elements) : A(elements.iterator());
    }

    public static <E> l6<E> w(Collection<? extends E> elements) {
        if (!(elements instanceof h6)) {
            return u(elements.toArray());
        }
        l6<E> l6VarC = ((h6) elements).c();
        if (l6VarC.m()) {
            l6VarC = p(l6VarC.toArray());
        }
        return l6VarC;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public ob<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public ob<E> listIterator(int i10) {
        com.google.common.base.j0.d0(i10, size());
        return isEmpty() ? (ob<E>) f117599d : new b(this, i10);
    }

    public l6<E> U() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: Y */
    public l6<E> subList(int fromIndex, int toIndex) {
        com.google.common.base.j0.f0(fromIndex, toIndex, size());
        int i10 = toIndex - fromIndex;
        if (i10 == size()) {
            return this;
        }
        return i10 == 0 ? F() : Z(fromIndex, toIndex);
    }

    l6<E> Z(int fromIndex, int toIndex) {
        return new e(fromIndex, toIndex - fromIndex);
    }

    @Override // java.util.List
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    public final boolean addAll(int index, Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h6
    @z7.m(replacement = "this")
    @Deprecated
    public final l6<E> c() {
        return this;
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object object) {
        return indexOf(object) >= 0;
    }

    @Override // com.google.common.collect.h6
    int d(Object[] dst, int offset) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            dst[offset + i10] = get(i10);
        }
        return offset + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@fj.a Object obj) {
        return x7.j(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(@fj.a Object object) {
        if (object == null) {
            return -1;
        }
        return x7.l(this, object);
    }

    @Override // java.util.List
    public int lastIndexOf(@fj.a Object object) {
        if (object == null) {
            return -1;
        }
        return x7.n(this, object);
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public nb<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    public final E remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    public final E set(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return new d(toArray());
    }
}
