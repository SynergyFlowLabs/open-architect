package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
public final class y6<C extends Comparable> extends k<C> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y6<Comparable<?>> f118363c = new y6<>(l6.F());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final y6<Comparable<?>> f118364d = new y6<>(l6.G(f9.a()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient l6<f9<C>> f118365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient y6<C> f118366b;

    class a extends l6<f9<C>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f118367f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f118368g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f9 f118369h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ y6 f118370i;

        a(final y6 this$0, final int val$length, final int val$fromIndex, final f9 val$range) {
            this.f118367f = val$length;
            this.f118368g = val$fromIndex;
            this.f118369h = val$range;
            this.f118370i = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public f9<C> get(int index) {
            com.google.common.base.j0.C(index, this.f118367f);
            if (index != 0 && index != this.f118367f - 1) {
                return (f9) this.f118370i.f118365a.get(index + this.f118368g);
            }
            return ((f9) this.f118370i.f118365a.get(index + this.f118368g)).s(this.f118369h);
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f118367f;
        }

        @Override // com.google.common.collect.l6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class b extends j7<C> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final z3<C> f118371l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @a8.b
        @fj.a
        private transient Integer f118372m;

        class a extends com.google.common.collect.c<C> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Iterator<f9<C>> f118374c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Iterator<C> f118375d = p7.t();

            a() {
                this.f118374c = y6.this.f118365a.iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public C b() {
                while (!this.f118375d.hasNext()) {
                    if (!this.f118374c.hasNext()) {
                        return (C) c();
                    }
                    this.f118375d = s3.i1(this.f118374c.next(), b.this.f118371l).iterator();
                }
                return this.f118375d.next();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.y6$b$b, reason: collision with other inner class name */
        class C1076b extends com.google.common.collect.c<C> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Iterator<f9<C>> f118377c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Iterator<C> f118378d = p7.t();

            C1076b() {
                this.f118377c = y6.this.f118365a.U().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public C b() {
                while (!this.f118378d.hasNext()) {
                    if (!this.f118377c.hasNext()) {
                        return (C) c();
                    }
                    this.f118378d = s3.i1(this.f118377c.next(), b.this.f118371l).descendingIterator();
                }
                return this.f118378d.next();
            }
        }

        b(z3<C> domain) {
            super(a9.z());
            this.f118371l = domain;
        }

        @com.google.common.annotations.d
        private void readObject(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.j7
        /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
        public j7<C> q0(C toElement, boolean inclusive) {
            return d1(f9.G(toElement, x.l(inclusive)));
        }

        @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            if (o10 == null) {
                return false;
            }
            try {
                return y6.this.c((Comparable) o10);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        j7<C> d1(f9<C> range) {
            return y6.this.k(range).v(this.f118371l);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.j7
        /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
        public j7<C> P0(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
            return (fromInclusive || toInclusive || f9.h(fromElement, toElement) != 0) ? d1(f9.B(fromElement, x.l(fromInclusive), toElement, x.l(toInclusive))) : j7.t0();
        }

        @Override // com.google.common.collect.j7
        j7<C> h0() {
            return new x3(this);
        }

        @Override // com.google.common.collect.j7, java.util.NavigableSet
        @com.google.common.annotations.c("NavigableSet")
        /* JADX INFO: renamed from: i0 */
        public nb<C> descendingIterator() {
            return new C1076b();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.j7
        /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
        public j7<C> W0(C fromElement, boolean inclusive) {
            return d1(f9.l(fromElement, x.l(inclusive)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.j7
        int indexOf(@fj.a Object target) {
            if (!contains(target)) {
                return -1;
            }
            Objects.requireNonNull(target);
            Comparable comparable = (Comparable) target;
            nb it = y6.this.f118365a.iterator();
            long size = 0;
            while (it.hasNext()) {
                f9 f9Var = (f9) it.next();
                if (f9Var.i(comparable)) {
                    return com.google.common.primitives.l.A(size + ((long) s3.i1(f9Var, this.f118371l).indexOf(comparable)));
                }
                size += (long) s3.i1(f9Var, this.f118371l).size();
            }
            throw new AssertionError("impossible");
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return y6.this.f118365a.m();
        }

        @Override // com.google.common.collect.j7, com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: n */
        public nb<C> iterator() {
            return new a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer numValueOf = this.f118372m;
            if (numValueOf == null) {
                nb it = y6.this.f118365a.iterator();
                long size = 0;
                while (it.hasNext()) {
                    size += (long) s3.i1((f9) it.next(), this.f118371l).size();
                    if (size >= androidx.collection.g3.f12256c) {
                        break;
                    }
                }
                numValueOf = Integer.valueOf(com.google.common.primitives.l.A(size));
                this.f118372m = numValueOf;
            }
            return numValueOf.intValue();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return y6.this.f118365a.toString();
        }

        @Override // com.google.common.collect.j7, com.google.common.collect.z6, com.google.common.collect.h6
        @com.google.common.annotations.d
        Object writeReplace() {
            return new c(y6.this.f118365a, this.f118371l);
        }
    }

    private static class c<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l6<f9<C>> f118380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z3<C> f118381b;

        c(l6<f9<C>> ranges, z3<C> domain) {
            this.f118380a = ranges;
            this.f118381b = domain;
        }

        Object readResolve() {
            return new y6(this.f118380a).v(this.f118381b);
        }
    }

    public static class d<C extends Comparable<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<f9<C>> f118382a = x7.q();

        @z7.a
        public d<C> a(f9<C> range) {
            com.google.common.base.j0.u(!range.u(), "range must not be empty, but was %s", range);
            this.f118382a.add(range);
            return this;
        }

        @z7.a
        public d<C> b(i9<C> ranges) {
            return c(ranges.m());
        }

        @z7.a
        public d<C> c(Iterable<f9<C>> ranges) {
            Iterator<f9<C>> it = ranges.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public y6<C> d() {
            l6.a aVar = new l6.a(this.f118382a.size());
            Collections.sort(this.f118382a, f9.C());
            c9 c9VarS = p7.S(this.f118382a.iterator());
            while (c9VarS.hasNext()) {
                f9 f9VarE = (f9) c9VarS.next();
                while (c9VarS.hasNext()) {
                    f9<C> f9Var = (f9) c9VarS.peek();
                    if (!f9VarE.t(f9Var)) {
                        break;
                    }
                    com.google.common.base.j0.y(f9VarE.s(f9Var).u(), "Overlapping ranges not permitted but found %s overlapping %s", f9VarE, f9Var);
                    f9VarE = f9VarE.E((f9) c9VarS.next());
                }
                aVar.a(f9VarE);
            }
            l6 l6VarE = aVar.e();
            if (l6VarE.isEmpty()) {
                return y6.E();
            }
            return (l6VarE.size() == 1 && ((f9) o7.z(l6VarE)).equals(f9.a())) ? y6.s() : new y6<>(l6VarE);
        }

        @z7.a
        d<C> e(d<C> builder) {
            c(builder.f118382a);
            return this;
        }
    }

    private final class e extends l6<f9<C>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f118383f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f118384g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f118385h;

        /* JADX WARN: Multi-variable type inference failed */
        e() {
            boolean zQ = ((f9) y6.this.f118365a.get(0)).q();
            this.f118383f = zQ;
            boolean zR = ((f9) o7.w(y6.this.f118365a)).r();
            this.f118384g = zR;
            int size = y6.this.f118365a.size();
            size = zQ ? size : size - 1;
            this.f118385h = zR ? size + 1 : size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public f9<C> get(int i10) {
            u3<C> u3VarN;
            com.google.common.base.j0.C(i10, this.f118385h);
            if (this.f118383f) {
                u3VarN = i10 == 0 ? u3.n() : ((f9) y6.this.f118365a.get(i10 - 1)).f117397b;
            } else {
                u3VarN = ((f9) y6.this.f118365a.get(i10)).f117397b;
            }
            return f9.k(u3VarN, (this.f118384g && i10 == this.f118385h + (-1)) ? u3.k() : ((f9) y6.this.f118365a.get(i10 + (!this.f118383f ? 1 : 0))).f117396a);
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f118385h;
        }

        @Override // com.google.common.collect.l6, com.google.common.collect.h6
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private static final class f<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l6<f9<C>> f118387a;

        f(l6<f9<C>> ranges) {
            this.f118387a = ranges;
        }

        Object readResolve() {
            if (this.f118387a.isEmpty()) {
                return y6.E();
            }
            return this.f118387a.equals(l6.G(f9.a())) ? y6.s() : new y6(this.f118387a);
        }
    }

    y6(l6<f9<C>> ranges) {
        this.f118365a = ranges;
    }

    private l6<f9<C>> B(final f9<C> range) {
        if (this.f118365a.isEmpty() || range.u()) {
            return l6.F();
        }
        if (range.n(b())) {
            return this.f118365a;
        }
        int iA = range.q() ? ea.a(this.f118365a, new v6(), range.f117396a, ea.c.f117372d, ea.b.f117366b) : 0;
        int iA2 = (range.r() ? ea.a(this.f118365a, new w6(), range.f117397b, ea.c.f117371c, ea.b.f117366b) : this.f118365a.size()) - iA;
        return iA2 == 0 ? l6.F() : new a(this, iA2, iA, range);
    }

    public static <C extends Comparable> y6<C> E() {
        return f118363c;
    }

    public static <C extends Comparable> y6<C> F(f9<C> range) {
        com.google.common.base.j0.E(range);
        if (range.u()) {
            return E();
        }
        return range.equals(f9.a()) ? s() : new y6<>(l6.G(range));
    }

    @d6
    public static <E extends Comparable<? super E>> Collector<f9<E>, ?, y6<E>> H() {
        return y2.R();
    }

    public static <C extends Comparable<?>> y6<C> J(Iterable<f9<C>> ranges) {
        return y(lb.u(ranges));
    }

    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    static <C extends Comparable> y6<C> s() {
        return f118364d;
    }

    public static <C extends Comparable<?>> d<C> w() {
        return new d<>();
    }

    public static <C extends Comparable> y6<C> y(i9<C> rangeSet) {
        com.google.common.base.j0.E(rangeSet);
        if (rangeSet.isEmpty()) {
            return E();
        }
        if (rangeSet.i(f9.a())) {
            return s();
        }
        if (rangeSet instanceof y6) {
            y6<C> y6Var = (y6) rangeSet;
            if (!y6Var.D()) {
                return y6Var;
            }
        }
        return new y6<>(l6.w(rangeSet.m()));
    }

    public static <C extends Comparable<?>> y6<C> z(Iterable<f9<C>> ranges) {
        return new d().c(ranges).d();
    }

    public y6<C> A(i9<C> other) {
        lb lbVarT = lb.t(this);
        lbVarT.n(other);
        return y(lbVarT);
    }

    public y6<C> C(i9<C> other) {
        lb lbVarT = lb.t(this);
        lbVarT.n(other.d());
        return y(lbVarT);
    }

    boolean D() {
        return this.f118365a.m();
    }

    @Override // com.google.common.collect.i9
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public y6<C> k(f9<C> range) {
        if (!isEmpty()) {
            f9<C> f9VarB = b();
            if (range.n(f9VarB)) {
                return this;
            }
            if (range.t(f9VarB)) {
                return new y6<>(B(range));
            }
        }
        return E();
    }

    public y6<C> I(i9<C> other) {
        return J(o7.f(m(), other.m()));
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void a(f9<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.i9
    public f9<C> b() {
        if (this.f118365a.isEmpty()) {
            throw new NoSuchElementException();
        }
        u3<C> u3Var = this.f118365a.get(0).f117396a;
        l6<f9<C>> l6Var = this.f118365a;
        return f9.k(u3Var, l6Var.get(l6Var.size() - 1).f117397b);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ boolean c(Comparable value) {
        return super.c(value);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public boolean e(f9<C> otherRange) {
        int iB = ea.b(this.f118365a, new w6(), otherRange.f117396a, a9.z(), ea.c.f117369a, ea.b.f117366b);
        if (iB < this.f118365a.size() && this.f118365a.get(iB).t(otherRange) && !this.f118365a.get(iB).s(otherRange).u()) {
            return true;
        }
        if (iB <= 0) {
            return false;
        }
        int i10 = iB - 1;
        return this.f118365a.get(i10).t(otherRange) && !this.f118365a.get(i10).s(otherRange).u();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ boolean equals(@fj.a Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void f(Iterable<f9<C>> other) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ boolean g(i9 other) {
        return super.g(other);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    @fj.a
    public f9<C> h(C value) {
        int iB = ea.b(this.f118365a, new w6(), u3.o(value), a9.z(), ea.c.f117369a, ea.b.f117365a);
        if (iB != -1) {
            f9<C> f9Var = this.f118365a.get(iB);
            if (f9Var.i(value)) {
                return f9Var;
            }
        }
        return null;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public boolean i(f9<C> otherRange) {
        int iB = ea.b(this.f118365a, new w6(), otherRange.f117396a, a9.z(), ea.c.f117369a, ea.b.f117365a);
        return iB != -1 && this.f118365a.get(iB).n(otherRange);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public boolean isEmpty() {
        return this.f118365a.isEmpty();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ boolean j(Iterable ranges) {
        return super.j(ranges);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void n(i9<C> other) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void o(f9<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void p(Iterable<f9<C>> other) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void q(i9<C> other) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.i9
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public z6<f9<C>> l() {
        return this.f118365a.isEmpty() ? z6.G() : new r9(this.f118365a.U(), f9.C().E());
    }

    @Override // com.google.common.collect.i9
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public z6<f9<C>> m() {
        return this.f118365a.isEmpty() ? z6.G() : new r9(this.f118365a, f9.C());
    }

    public j7<C> v(z3<C> domain) {
        com.google.common.base.j0.E(domain);
        if (isEmpty()) {
            return j7.t0();
        }
        f9<C> f9VarE = b().e(domain);
        if (!f9VarE.q()) {
            throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!f9VarE.r()) {
            try {
                domain.e();
            } catch (NoSuchElementException unused) {
                throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new b(domain);
    }

    @com.google.common.annotations.d
    Object writeReplace() {
        return new f(this.f118365a);
    }

    @Override // com.google.common.collect.i9
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public y6<C> d() {
        y6<C> y6Var = this.f118366b;
        if (y6Var != null) {
            return y6Var;
        }
        if (this.f118365a.isEmpty()) {
            y6<C> y6VarS = s();
            this.f118366b = y6VarS;
            return y6VarS;
        }
        int i10 = 3 << 1;
        if (this.f118365a.size() == 1 && this.f118365a.get(0).equals(f9.a())) {
            y6<C> y6VarE = E();
            this.f118366b = y6VarE;
            return y6VarE;
        }
        y6<C> y6Var2 = new y6<>(new e(), this);
        this.f118366b = y6Var2;
        return y6Var2;
    }

    private y6(l6<f9<C>> ranges, y6<C> complement) {
        this.f118365a = ranges;
        this.f118366b = complement;
    }
}
