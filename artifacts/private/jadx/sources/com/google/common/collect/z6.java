package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
public abstract class z6<E> extends h6<E> implements Set<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f118426e = 1073741824;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final double f118427f = 0.7d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f118428g = 751619276;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f118429h = 912559;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a8.b
    @r9.j
    @fj.a
    private transient l6<E> f118430d;

    public static class a<E> extends h6.a<E> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @com.google.common.annotations.e
        @fj.a
        Object[] f118431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f118432f;

        public a() {
            super(4);
        }

        private void n(E element) {
            Objects.requireNonNull(this.f118431e);
            int length = this.f118431e.length - 1;
            int iHashCode = element.hashCode();
            int iC = c6.c(iHashCode);
            while (true) {
                int i10 = iC & length;
                Object[] objArr = this.f118431e;
                Object obj = objArr[i10];
                if (obj == null) {
                    objArr[i10] = element;
                    this.f118432f += iHashCode;
                    super.a(element);
                    return;
                } else if (obj.equals(element)) {
                    return;
                } else {
                    iC = i10 + 1;
                }
            }
        }

        @Override // com.google.common.collect.h6.a
        @z7.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a<E> a(E element) {
            com.google.common.base.j0.E(element);
            if (this.f118431e != null && z6.u(this.f117444c) <= this.f118431e.length) {
                n(element);
                return this;
            }
            this.f118431e = null;
            super.a(element);
            return this;
        }

        @Override // com.google.common.collect.h6.a, com.google.common.collect.h6.b
        @z7.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... elements) {
            if (this.f118431e == null) {
                super.b(elements);
                return this;
            }
            for (E e10 : elements) {
                a(e10);
            }
            return this;
        }

        @Override // com.google.common.collect.h6.a, com.google.common.collect.h6.b
        @z7.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> elements) {
            com.google.common.base.j0.E(elements);
            if (this.f118431e == null) {
                super.c(elements);
                return this;
            }
            Iterator<? extends E> it = elements.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.h6.b
        @z7.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> elements) {
            com.google.common.base.j0.E(elements);
            while (elements.hasNext()) {
                a(elements.next());
            }
            return this;
        }

        @Override // com.google.common.collect.h6.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public z6<E> e() {
            z6<E> z6VarV;
            int i10 = this.f117444c;
            if (i10 == 0) {
                return z6.G();
            }
            if (i10 == 1) {
                Object obj = this.f117443b[0];
                Objects.requireNonNull(obj);
                return z6.J(obj);
            }
            if (this.f118431e == null || z6.u(i10) != this.f118431e.length) {
                z6VarV = z6.v(this.f117444c, this.f117443b);
                this.f117444c = z6VarV.size();
            } else {
                Object[] objArrCopyOf = z6.P(this.f117444c, this.f117443b.length) ? Arrays.copyOf(this.f117443b, this.f117444c) : this.f117443b;
                int i11 = this.f118432f;
                Object[] objArr = this.f118431e;
                z6VarV = new p9<>(objArrCopyOf, i11, objArr, objArr.length - 1, this.f117444c);
            }
            this.f117445d = true;
            this.f118431e = null;
            return z6VarV;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @z7.a
        a<E> p(a<E> other) {
            if (this.f118431e == null) {
                h(other.f117443b, other.f117444c);
                return this;
            }
            for (int i10 = 0; i10 < other.f117444c; i10++) {
                Object obj = other.f117443b[i10];
                Objects.requireNonNull(obj);
                a(obj);
            }
            return this;
        }

        a(int capacity, boolean makeHashTable) {
            super(capacity);
            if (makeHashTable) {
                this.f118431e = new Object[z6.u(capacity)];
            }
        }
    }

    @com.google.common.annotations.d
    private static class b implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f118433b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object[] f118434a;

        b(Object[] elements) {
            this.f118434a = elements;
        }

        Object readResolve() {
            return z6.C(this.f118434a);
        }
    }

    z6() {
    }

    public static <E> z6<E> A(Collection<? extends E> elements) {
        if ((elements instanceof z6) && !(elements instanceof SortedSet)) {
            z6<E> z6Var = (z6) elements;
            if (!z6Var.m()) {
                return z6Var;
            }
        }
        Object[] array = elements.toArray();
        return v(array.length, array);
    }

    public static <E> z6<E> B(Iterator<? extends E> elements) {
        if (!elements.hasNext()) {
            return G();
        }
        E next = elements.next();
        return !elements.hasNext() ? J(next) : new a().a(next).d(elements).e();
    }

    public static <E> z6<E> C(E[] elements) {
        int length = elements.length;
        if (length != 0) {
            return length != 1 ? v(elements.length, (Object[]) elements.clone()) : J(elements[0]);
        }
        return G();
    }

    public static <E> z6<E> G() {
        return p9.f117960o;
    }

    public static <E> z6<E> J(E e10) {
        return new aa(e10);
    }

    public static <E> z6<E> K(E e10, E e11) {
        return v(2, e10, e11);
    }

    public static <E> z6<E> L(E e10, E e11, E e12) {
        return v(3, e10, e11, e12);
    }

    public static <E> z6<E> M(E e10, E e11, E e12, E e13) {
        return v(4, e10, e11, e12, e13);
    }

    public static <E> z6<E> N(E e10, E e11, E e12, E e13, E e14) {
        return v(5, e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    public static <E> z6<E> O(E e10, E e11, E e12, E e13, E e14, E e15, E... others) {
        com.google.common.base.j0.e(others.length <= 2147483641, "the total number of elements must fit in an int");
        int length = others.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        int i10 = 1 << 5;
        objArr[5] = e15;
        System.arraycopy(others, 0, objArr, 6, others.length);
        return v(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean P(int actualUnique, int expectedUnique) {
        if (actualUnique >= (expectedUnique >> 1) + (expectedUnique >> 2)) {
            return false;
        }
        int i10 = 5 | 1;
        return true;
    }

    @d6
    public static <E> Collector<E, ?, z6<E>> Q() {
        return y2.S();
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
        return new a<>(expectedSize, true);
    }

    @com.google.common.annotations.e
    static int u(int setSize) {
        int iMax = Math.max(setSize, 2);
        if (iMax >= f118428g) {
            com.google.common.base.j0.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * f118427f < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> z6<E> v(int n10, Object... elements) {
        if (n10 == 0) {
            return G();
        }
        if (n10 == 1) {
            Object obj = elements[0];
            Objects.requireNonNull(obj);
            return J(obj);
        }
        int iU = u(n10);
        Object[] objArr = new Object[iU];
        int i10 = iU - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < n10; i13++) {
            Object objA = x8.a(elements[i13], i13);
            int iHashCode = objA.hashCode();
            int iC = c6.c(iHashCode);
            while (true) {
                int i14 = iC & i10;
                Object obj2 = objArr[i14];
                if (obj2 == null) {
                    elements[i12] = objA;
                    objArr[i14] = objA;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iC++;
            }
        }
        Arrays.fill(elements, i12, n10, (Object) null);
        if (i12 == 1) {
            Object obj3 = elements[0];
            Objects.requireNonNull(obj3);
            return new aa(obj3);
        }
        if (u(i12) < iU / 2) {
            return v(i12, elements);
        }
        if (P(i12, elements.length)) {
            elements = Arrays.copyOf(elements, i12);
        }
        return new p9(elements, i11, objArr, i10, i12);
    }

    public static <E> z6<E> w(Iterable<? extends E> elements) {
        return elements instanceof Collection ? A((Collection) elements) : B(elements.iterator());
    }

    l6<E> D() {
        return l6.p(toArray());
    }

    boolean F() {
        return false;
    }

    @Override // com.google.common.collect.h6
    public l6<E> c() {
        l6<E> l6Var = this.f118430d;
        if (l6Var != null) {
            return l6Var;
        }
        l6<E> l6VarD = D();
        this.f118430d = l6VarD;
        return l6VarD;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if ((object instanceof z6) && F() && ((z6) object).F() && hashCode() != object.hashCode()) {
            return false;
        }
        return z9.g(this, object);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return z9.k(this);
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public abstract nb<E> iterator();

    @Override // com.google.common.collect.h6
    @com.google.common.annotations.d
    Object writeReplace() {
        return new b(toArray());
    }
}
