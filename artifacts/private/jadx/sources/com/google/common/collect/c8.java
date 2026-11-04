package com.google.common.collect;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public final class c8<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f117257g = 1431655765;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f117258h = -1431655766;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f117259i = 11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c8<E>.c f117260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c8<E>.c f117261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.google.common.annotations.e
    final int f117262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f117263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f117264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f117265f;

    public static final class b<B> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f117266d = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparator<B> f117267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f117268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f117269c;

        /* JADX INFO: Access modifiers changed from: private */
        public <T extends B> a9<T> g() {
            return a9.i(this.f117267a);
        }

        public <T extends B> c8<T> c() {
            return d(Collections.EMPTY_SET);
        }

        public <T extends B> c8<T> d(Iterable<? extends T> initialContents) {
            c8<T> c8Var = new c8<>(this, c8.A(this.f117268b, this.f117269c, initialContents));
            Iterator<? extends T> it = initialContents.iterator();
            while (it.hasNext()) {
                c8Var.offer(it.next());
            }
            return c8Var;
        }

        @z7.a
        public b<B> e(int expectedSize) {
            com.google.common.base.j0.d(expectedSize >= 0);
            this.f117268b = expectedSize;
            return this;
        }

        @z7.a
        public b<B> f(int maximumSize) {
            com.google.common.base.j0.d(maximumSize > 0);
            this.f117269c = maximumSize;
            return this;
        }

        private b(Comparator<B> comparator) {
            int i10 = 6 | (-1);
            this.f117268b = -1;
            this.f117269c = Integer.MAX_VALUE;
            this.f117267a = (Comparator) com.google.common.base.j0.E(comparator);
        }
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a9<E> f117270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @r9.m
        c8<E>.c f117271b;

        c(a9<E> ordering) {
            this.f117270a = ordering;
        }

        private int k(int i10) {
            return m(m(i10));
        }

        private int l(int i10) {
            return (i10 * 2) + 1;
        }

        private int m(int i10) {
            return (i10 - 1) / 2;
        }

        private int n(int i10) {
            return (i10 * 2) + 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean q(int i10) {
            if (l(i10) < c8.this.f117264e && d(i10, l(i10)) > 0) {
                return false;
            }
            if (n(i10) < c8.this.f117264e && d(i10, n(i10)) > 0) {
                return false;
            }
            if (i10 <= 0 || d(i10, m(i10)) <= 0) {
                return i10 <= 2 || d(k(i10), i10) <= 0;
            }
            return false;
        }

        void b(int index, E x10) {
            int iF = f(index, x10);
            if (iF != index) {
                this = this.f117271b;
                index = iF;
            }
            this.c(index, x10);
        }

        @z7.a
        int c(int i10, E e10) {
            while (i10 > 2) {
                int iK = k(i10);
                Object objR = c8.this.r(iK);
                if (this.f117270a.compare((E) objR, e10) <= 0) {
                    break;
                }
                c8.this.f117263d[i10] = objR;
                i10 = iK;
            }
            c8.this.f117263d[i10] = e10;
            return i10;
        }

        int d(int i10, int i11) {
            return this.f117270a.compare((E) c8.this.r(i10), (E) c8.this.r(i11));
        }

        int e(int i10, E e10) {
            int i11 = i(i10);
            if (i11 <= 0 || this.f117270a.compare((E) c8.this.r(i11), e10) >= 0) {
                return f(i10, e10);
            }
            c8.this.f117263d[i10] = c8.this.r(i11);
            c8.this.f117263d[i11] = e10;
            return i11;
        }

        int f(int i10, E e10) {
            int iN;
            if (i10 == 0) {
                c8.this.f117263d[0] = e10;
                return 0;
            }
            int iM = m(i10);
            Object objR = c8.this.r(iM);
            if (iM != 0 && (iN = n(m(iM))) != iM && l(iN) >= c8.this.f117264e) {
                Object objR2 = c8.this.r(iN);
                if (this.f117270a.compare((E) objR2, (E) objR) < 0) {
                    iM = iN;
                    objR = objR2;
                }
            }
            if (this.f117270a.compare((E) objR, e10) >= 0) {
                c8.this.f117263d[i10] = e10;
                return i10;
            }
            c8.this.f117263d[i10] = objR;
            c8.this.f117263d[iM] = e10;
            return iM;
        }

        int g(int index) {
            while (true) {
                int iJ = j(index);
                if (iJ <= 0) {
                    return index;
                }
                c8.this.f117263d[index] = c8.this.r(iJ);
                index = iJ;
            }
        }

        int h(int index, int len) {
            if (index >= c8.this.f117264e) {
                return -1;
            }
            com.google.common.base.j0.g0(index > 0);
            int iMin = Math.min(index, c8.this.f117264e - len) + len;
            for (int i10 = index + 1; i10 < iMin; i10++) {
                if (d(i10, index) < 0) {
                    index = i10;
                }
            }
            return index;
        }

        int i(int index) {
            return h(l(index), 2);
        }

        int j(int index) {
            int iL = l(index);
            if (iL < 0) {
                return -1;
            }
            return h(l(iL), 4);
        }

        int o(E e10) {
            int iN;
            int iM = m(c8.this.f117264e);
            if (iM != 0 && (iN = n(m(iM))) != iM && l(iN) >= c8.this.f117264e) {
                Object objR = c8.this.r(iN);
                if (this.f117270a.compare((E) objR, e10) < 0) {
                    c8.this.f117263d[iN] = e10;
                    c8.this.f117263d[c8.this.f117264e] = objR;
                    return iN;
                }
            }
            return c8.this.f117264e;
        }

        @fj.a
        d<E> p(int removeIndex, int vacated, E toTrickle) {
            int iE = e(vacated, toTrickle);
            if (iE == vacated) {
                return null;
            }
            Object objR = iE < removeIndex ? c8.this.r(removeIndex) : c8.this.r(m(removeIndex));
            if (this.f117271b.c(iE, toTrickle) < removeIndex) {
                return new d<>(toTrickle, objR);
            }
            return null;
        }
    }

    static class d<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final E f117273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final E f117274b;

        d(E toTrickle, E replaced) {
            this.f117273a = toTrickle;
            this.f117274b = replaced;
        }
    }

    private class e implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f117275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f117276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f117277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        private Queue<E> f117278d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.a
        private List<E> f117279e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @fj.a
        private E f117280f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f117281g;

        private e() {
            this.f117275a = -1;
            this.f117276b = -1;
            this.f117277c = c8.this.f117265f;
        }

        private void b() {
            if (c8.this.f117265f != this.f117277c) {
                throw new ConcurrentModificationException();
            }
        }

        private boolean c(Iterable<E> elements, E target) {
            Iterator<E> it = elements.iterator();
            while (it.hasNext()) {
                if (it.next() == target) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void d(int c10) {
            if (this.f117276b < c10) {
                if (this.f117279e != null) {
                    while (c10 < c8.this.size() && c(this.f117279e, c8.this.r(c10))) {
                        c10++;
                    }
                }
                this.f117276b = c10;
            }
        }

        private boolean e(Object target) {
            for (int i10 = 0; i10 < c8.this.f117264e; i10++) {
                if (c8.this.f117263d[i10] == target) {
                    c8.this.J(i10);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Queue<E> queue;
            b();
            d(this.f117275a + 1);
            return this.f117276b < c8.this.size() || !((queue = this.f117278d) == null || queue.isEmpty());
        }

        @Override // java.util.Iterator
        public E next() {
            b();
            d(this.f117275a + 1);
            if (this.f117276b < c8.this.size()) {
                int i10 = this.f117276b;
                this.f117275a = i10;
                this.f117281g = true;
                return (E) c8.this.r(i10);
            }
            if (this.f117278d != null) {
                this.f117275a = c8.this.size();
                E ePoll = this.f117278d.poll();
                this.f117280f = ePoll;
                if (ePoll != null) {
                    this.f117281g = true;
                    return ePoll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        @Override // java.util.Iterator
        public void remove() {
            a3.e(this.f117281g);
            b();
            this.f117281g = false;
            this.f117277c++;
            if (this.f117275a >= c8.this.size()) {
                E e10 = this.f117280f;
                Objects.requireNonNull(e10);
                com.google.common.base.j0.g0(e(e10));
                this.f117280f = null;
                return;
            }
            d<E> dVarJ = c8.this.J(this.f117275a);
            if (dVarJ != null) {
                if (this.f117278d == null || this.f117279e == null) {
                    this.f117278d = new ArrayDeque();
                    this.f117279e = new ArrayList(3);
                }
                if (!c(this.f117279e, dVarJ.f117273a)) {
                    this.f117278d.add(dVarJ.f117273a);
                }
                if (!c(this.f117278d, dVarJ.f117274b)) {
                    this.f117279e.add(dVarJ.f117274b);
                }
            }
            this.f117275a--;
            this.f117276b--;
        }
    }

    @com.google.common.annotations.e
    static int A(int configuredExpectedSize, int maximumSize, Iterable<?> initialContents) {
        if (configuredExpectedSize == -1) {
            configuredExpectedSize = 11;
        }
        if (initialContents instanceof Collection) {
            configuredExpectedSize = Math.max(configuredExpectedSize, ((Collection) initialContents).size());
        }
        return l(configuredExpectedSize, maximumSize);
    }

    @com.google.common.annotations.e
    static boolean B(int index) {
        int i10 = ~(~(index + 1));
        com.google.common.base.j0.h0(i10 > 0, "negative index");
        return (f117257g & i10) > (i10 & f117258h);
    }

    public static b<Comparable> D(int maximumSize) {
        return new b(a9.z()).f(maximumSize);
    }

    public static <B> b<B> F(Comparator<B> comparator) {
        return new b<>(comparator);
    }

    private E G(int index) {
        E eR = r(index);
        J(index);
        return eR;
    }

    private int k() {
        int length = this.f117263d.length;
        return l(length < 64 ? (length + 1) * 2 : com.google.common.math.f.d(length / 2, 3), this.f117262c);
    }

    private static int l(int queueSize, int maximumSize) {
        return Math.min(queueSize - 1, maximumSize) + 1;
    }

    public static <E extends Comparable<E>> c8<E> n() {
        return new b(a9.z()).c();
    }

    public static <E extends Comparable<E>> c8<E> p(Iterable<? extends E> initialContents) {
        return new b(a9.z()).d(initialContents);
    }

    public static b<Comparable> s(int expectedSize) {
        int i10 = 7 ^ 0;
        return new b(a9.z()).e(expectedSize);
    }

    @fj.a
    private d<E> t(int index, E toTrickle) {
        c8<E>.c cVarW = w(index);
        int iG = cVarW.g(index);
        int iC = cVarW.c(iG, toTrickle);
        if (iC == iG) {
            return cVarW.p(index, iG, toTrickle);
        }
        if (iC < index) {
            return new d<>(toTrickle, r(index));
        }
        return null;
    }

    private int u() {
        int i10 = this.f117264e;
        if (i10 != 1) {
            return (i10 == 2 || this.f117261b.d(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    private void v() {
        if (this.f117264e > this.f117263d.length) {
            Object[] objArr = new Object[k()];
            Object[] objArr2 = this.f117263d;
            int i10 = 4 & 0;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f117263d = objArr;
        }
    }

    private c8<E>.c w(int i10) {
        return B(i10) ? this.f117260a : this.f117261b;
    }

    @com.google.common.annotations.e
    boolean C() {
        for (int i10 = 1; i10 < this.f117264e; i10++) {
            if (!w(i10).q(i10)) {
                return false;
            }
        }
        return true;
    }

    @z7.a
    @com.google.common.annotations.e
    @fj.a
    d<E> J(int index) {
        com.google.common.base.j0.d0(index, this.f117264e);
        this.f117265f++;
        int i10 = this.f117264e - 1;
        this.f117264e = i10;
        if (i10 == index) {
            this.f117263d[i10] = null;
            return null;
        }
        E eR = r(i10);
        int iO = w(this.f117264e).o(eR);
        if (iO == index) {
            this.f117263d[this.f117264e] = null;
            return null;
        }
        E eR2 = r(this.f117264e);
        this.f117263d[this.f117264e] = null;
        d<E> dVarT = t(index, eR2);
        if (iO < index) {
            return dVarT == null ? new d<>(eR, eR2) : new d<>(eR, dVarT.f117274b);
        }
        return dVarT;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @z7.a
    public boolean add(E element) {
        offer(element);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @z7.a
    public boolean addAll(Collection<? extends E> newElements) {
        Iterator<? extends E> it = newElements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            offer(it.next());
            z10 = true;
        }
        return z10;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i10 = 0; i10 < this.f117264e; i10++) {
            this.f117263d[i10] = null;
        }
        this.f117264e = 0;
    }

    public Comparator<? super E> comparator() {
        return this.f117260a.f117270a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new e();
    }

    @com.google.common.annotations.e
    int m() {
        return this.f117263d.length;
    }

    @Override // java.util.Queue
    @z7.a
    public boolean offer(E element) {
        com.google.common.base.j0.E(element);
        this.f117265f++;
        int i10 = this.f117264e;
        this.f117264e = i10 + 1;
        v();
        w(i10).b(i10, element);
        return this.f117264e <= this.f117262c || pollLast() != element;
    }

    @Override // java.util.Queue
    @fj.a
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return r(0);
    }

    @fj.a
    public E peekFirst() {
        return peek();
    }

    @fj.a
    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return r(u());
    }

    @Override // java.util.Queue
    @z7.a
    @fj.a
    public E poll() {
        if (!isEmpty()) {
            return G(0);
        }
        int i10 = 3 & 0;
        return null;
    }

    @z7.a
    @fj.a
    public E pollFirst() {
        return poll();
    }

    @z7.a
    @fj.a
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return G(u());
    }

    E r(int i10) {
        E e10 = (E) this.f117263d[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @z7.a
    public E removeFirst() {
        return remove();
    }

    @z7.a
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return G(u());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f117264e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @com.google.common.annotations.d
    public Object[] toArray() {
        int i10 = this.f117264e;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f117263d, 0, objArr, 0, i10);
        return objArr;
    }

    private c8(b<? super E> builder, int queueSize) {
        a9 a9VarG = builder.g();
        c8<E>.c cVar = new c(a9VarG);
        this.f117260a = cVar;
        c8<E>.c cVar2 = new c(a9VarG.E());
        this.f117261b = cVar2;
        cVar.f117271b = cVar2;
        cVar2.f117271b = cVar;
        this.f117262c = ((b) builder).f117269c;
        this.f117263d = new Object[queueSize];
    }
}
