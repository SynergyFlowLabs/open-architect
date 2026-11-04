package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
final class j9<C extends Comparable> extends s3<C> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f117517n = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f9<C> f117518m;

    class a extends l<C> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final C f117519b;

        a(Comparable comparable) {
            super(comparable);
            this.f117519b = (C) j9.this.last();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.l
        @fj.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C b(C c10) {
            if (j9.B1(c10, this.f117519b)) {
                return null;
            }
            return (C) j9.this.f118082l.g(c10);
        }
    }

    class b extends l<C> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final C f117521b;

        b(Comparable comparable) {
            super(comparable);
            this.f117521b = (C) j9.this.first();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.l
        @fj.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C b(C c10) {
            if (j9.B1(c10, this.f117521b)) {
                return null;
            }
            return (C) j9.this.f118082l.i(c10);
        }
    }

    class c extends e6<C> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.e6
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public j7<C> b0() {
            return j9.this;
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
        public C get(int i10) {
            com.google.common.base.j0.C(i10, size());
            j9 j9Var = j9.this;
            return (C) j9Var.f118082l.h(j9Var.first(), i10);
        }

        @Override // com.google.common.collect.e6, com.google.common.collect.l6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final class d<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f9<C> f117524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final z3<C> f117525b;

        /* synthetic */ d(f9 f9Var, z3 z3Var, a aVar) {
            this(f9Var, z3Var);
        }

        private Object readResolve() {
            return new j9(this.f117524a, this.f117525b);
        }

        private d(f9<C> range, z3<C> domain) {
            this.f117524a = range;
            this.f117525b = domain;
        }
    }

    j9(f9<C> range, z3<C> domain) {
        super(domain);
        this.f117518m = range;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean B1(Comparable<?> left, @fj.a Comparable<?> right) {
        return right != null && f9.h(left, right) == 0;
    }

    private s3<C> D1(f9<C> other) {
        return this.f117518m.t(other) ? s3.i1(this.f117518m.s(other), this.f118082l) : new b4(this.f118082l);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.j7, java.util.SortedSet
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public C first() {
        Comparable comparableX = this.f117518m.f117396a.x(this.f118082l);
        Objects.requireNonNull(comparableX);
        return (C) comparableX;
    }

    @Override // com.google.common.collect.z6
    l6<C> D() {
        return this.f118082l.f118414a ? new c() : super.D();
    }

    @Override // com.google.common.collect.j7, java.util.SortedSet
    /* JADX INFO: renamed from: F1, reason: merged with bridge method [inline-methods] */
    public C last() {
        Comparable comparableV = this.f117518m.f117397b.v(this.f118082l);
        Objects.requireNonNull(comparableV);
        return (C) comparableV;
    }

    @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@fj.a Object object) {
        if (object == null) {
            return false;
        }
        try {
            return this.f117518m.i((Comparable) object);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> targets) {
        return b3.b(this, targets);
    }

    @Override // com.google.common.collect.z6, java.util.Collection, java.util.Set
    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof j9) {
            j9 j9Var = (j9) object;
            if (this.f118082l.equals(j9Var.f118082l)) {
                return first().equals(j9Var.first()) && last().equals(j9Var.last());
            }
        }
        return super.equals(object);
    }

    @Override // com.google.common.collect.z6, java.util.Collection, java.util.Set
    public int hashCode() {
        return z9.k(this);
    }

    @Override // com.google.common.collect.j7, java.util.NavigableSet
    @com.google.common.annotations.c
    /* JADX INFO: renamed from: i0 */
    public nb<C> descendingIterator() {
        return new b(last());
    }

    @Override // com.google.common.collect.j7
    @com.google.common.annotations.c
    int indexOf(@fj.a Object target) {
        if (!contains(target)) {
            return -1;
        }
        Objects.requireNonNull(target);
        return (int) this.f118082l.b(first(), (Comparable) target);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.h6
    boolean m() {
        return false;
    }

    @Override // com.google.common.collect.j7, com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public nb<C> iterator() {
        return new a(first());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.s3, com.google.common.collect.j7
    /* JADX INFO: renamed from: n1 */
    public s3<C> q0(C toElement, boolean inclusive) {
        return D1(f9.G(toElement, x.l(inclusive)));
    }

    @Override // com.google.common.collect.s3
    public s3<C> o1(s3<C> other) {
        com.google.common.base.j0.E(other);
        com.google.common.base.j0.d(this.f118082l.equals(other.f118082l));
        if (other.isEmpty()) {
            return other;
        }
        Comparable comparable = (Comparable) a9.z().s(first(), other.first());
        Comparable comparable2 = (Comparable) a9.z().w(last(), other.last());
        return comparable.compareTo(comparable2) <= 0 ? s3.i1(f9.f(comparable, comparable2), this.f118082l) : new b4(this.f118082l);
    }

    @Override // com.google.common.collect.s3
    public f9<C> q1() {
        x xVar = x.CLOSED;
        return r1(xVar, xVar);
    }

    @Override // com.google.common.collect.s3
    public f9<C> r1(x lowerBoundType, x upperBoundType) {
        return f9.k(this.f117518m.f117396a.E(lowerBoundType, this.f118082l), this.f117518m.f117397b.H(upperBoundType, this.f118082l));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long jB = this.f118082l.b(first(), last());
        if (jB >= androidx.collection.g3.f12256c) {
            return Integer.MAX_VALUE;
        }
        return ((int) jB) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.s3, com.google.common.collect.j7
    /* JADX INFO: renamed from: v1 */
    public s3<C> P0(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
        return (fromElement.compareTo(toElement) != 0 || fromInclusive || toInclusive) ? D1(f9.B(fromElement, x.l(fromInclusive), toElement, x.l(toInclusive))) : new b4(this.f118082l);
    }

    @Override // com.google.common.collect.s3, com.google.common.collect.j7, com.google.common.collect.z6, com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return new d(this.f117518m, this.f118082l, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.s3, com.google.common.collect.j7
    /* JADX INFO: renamed from: z1 */
    public s3<C> W0(C fromElement, boolean inclusive) {
        return D1(f9.l(fromElement, x.l(inclusive)));
    }
}
