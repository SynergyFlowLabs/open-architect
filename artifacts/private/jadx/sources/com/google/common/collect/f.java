package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
abstract class f<E> extends i<E> implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final long f117376e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient y8<E> f117377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient long f117378d;

    class a extends f<E>.c<E> {
        a() {
            super();
        }

        @Override // com.google.common.collect.f.c
        @b9
        E c(int entryIndex) {
            return f.this.f117377c.j(entryIndex);
        }
    }

    class b extends f<E>.c<q8.a<E>> {
        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.f.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public q8.a<E> c(int entryIndex) {
            return f.this.f117377c.h(entryIndex);
        }
    }

    abstract class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f117381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f117382b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f117383c;

        c() {
            this.f117381a = f.this.f117377c.f();
            this.f117383c = f.this.f117377c.f118397d;
        }

        private void b() {
            if (f.this.f117377c.f118397d != this.f117383c) {
                throw new ConcurrentModificationException();
            }
        }

        @b9
        abstract T c(int entryIndex);

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f117381a >= 0;
        }

        @Override // java.util.Iterator
        @b9
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tC = c(this.f117381a);
            int i10 = this.f117381a;
            this.f117382b = i10;
            this.f117381a = f.this.f117377c.t(i10);
            return tC;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            a3.e(this.f117382b != -1);
            f fVar = f.this;
            fVar.f117378d -= (long) fVar.f117377c.y(this.f117382b);
            this.f117381a = f.this.f117377c.u(this.f117381a, this.f117382b);
            this.f117382b = -1;
            this.f117383c = f.this.f117377c.f118397d;
        }
    }

    f(int distinctElements) {
        this.f117377c = p(distinctElements);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int iH = x9.h(stream);
        this.f117377c = p(3);
        x9.g(this, stream, iH);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        x9.k(this, stream);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    @z7.a
    public final int H(@b9 E element, int occurrences) {
        if (occurrences == 0) {
            return P3(element);
        }
        com.google.common.base.j0.k(occurrences > 0, "occurrences cannot be negative: %s", occurrences);
        int iN = this.f117377c.n(element);
        if (iN == -1) {
            this.f117377c.v(element, occurrences);
            this.f117378d += (long) occurrences;
            return 0;
        }
        int iL = this.f117377c.l(iN);
        long j10 = occurrences;
        long j11 = ((long) iL) + j10;
        com.google.common.base.j0.p(j11 <= androidx.collection.g3.f12256c, "too many occurrences: %s", j11);
        this.f117377c.C(iN, (int) j11);
        this.f117378d += j10;
        return iL;
    }

    @Override // com.google.common.collect.q8
    public final int P3(@fj.a Object element) {
        return this.f117377c.g(element);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    public final boolean Q2(@b9 E element, int oldCount, int newCount) {
        a3.b(oldCount, "oldCount");
        a3.b(newCount, "newCount");
        int iN = this.f117377c.n(element);
        if (iN == -1) {
            if (oldCount != 0) {
                return false;
            }
            if (newCount > 0) {
                this.f117377c.v(element, newCount);
                this.f117378d += (long) newCount;
            }
            return true;
        }
        if (this.f117377c.l(iN) != oldCount) {
            return false;
        }
        if (newCount == 0) {
            this.f117377c.y(iN);
            this.f117378d -= (long) oldCount;
        } else {
            this.f117377c.C(iN, newCount);
            this.f117378d += (long) (newCount - oldCount);
        }
        return true;
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f117377c.a();
        this.f117378d = 0L;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    @z7.a
    public final int f0(@fj.a Object element, int occurrences) {
        if (occurrences == 0) {
            return P3(element);
        }
        com.google.common.base.j0.k(occurrences > 0, "occurrences cannot be negative: %s", occurrences);
        int iN = this.f117377c.n(element);
        if (iN == -1) {
            return 0;
        }
        int iL = this.f117377c.l(iN);
        if (iL > occurrences) {
            this.f117377c.C(iN, iL - occurrences);
        } else {
            this.f117377c.y(iN);
            occurrences = iL;
        }
        this.f117378d -= (long) occurrences;
        return iL;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.q8
    @z7.a
    public final int g1(@b9 E element, int count) {
        a3.b(count, "count");
        y8<E> y8Var = this.f117377c;
        int iW = count == 0 ? y8Var.w(element) : y8Var.v(element, count);
        this.f117378d += (long) (count - iW);
        return iW;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.q8
    public final Iterator<E> iterator() {
        return r8.n(this);
    }

    @Override // com.google.common.collect.i
    final int k() {
        return this.f117377c.D();
    }

    @Override // com.google.common.collect.i
    final Iterator<E> l() {
        return new a();
    }

    @Override // com.google.common.collect.i
    final Iterator<q8.a<E>> m() {
        return new b();
    }

    void n(q8<? super E> q8Var) {
        com.google.common.base.j0.E(q8Var);
        int iF = this.f117377c.f();
        while (iF >= 0) {
            q8Var.H(this.f117377c.j(iF), this.f117377c.l(iF));
            iF = this.f117377c.t(iF);
        }
    }

    abstract y8<E> p(int distinctElements);

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
    public final int size() {
        return com.google.common.primitives.l.A(this.f117378d);
    }
}
