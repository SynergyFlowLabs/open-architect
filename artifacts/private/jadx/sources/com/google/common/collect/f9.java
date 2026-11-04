package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@z7.j(containerOf = {"C"})
@com.google.common.annotations.b
public final class f9<C extends Comparable> extends g9 implements com.google.common.base.k0<C>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f9<Comparable> f117394c = new f9<>(u3.n(), u3.k());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f117395d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final u3<C> f117396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final u3<C> f117397b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f117398a;

        static {
            int[] iArr = new int[x.values().length];
            f117398a = iArr;
            try {
                iArr[x.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f117398a[x.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class b extends a9<f9<?>> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final a9<?> f117399c = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f117400d = 0;

        private b() {
        }

        @Override // com.google.common.collect.a9, java.util.Comparator
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public int compare(f9<?> left, f9<?> right) {
            return n3.n().i(left.f117396a, right.f117396a).i(left.f117397b, right.f117397b).m();
        }
    }

    private f9(u3<C> lowerBound, u3<C> upperBound) {
        this.f117396a = (u3) com.google.common.base.j0.E(lowerBound);
        this.f117397b = (u3) com.google.common.base.j0.E(upperBound);
        if (lowerBound.compareTo(upperBound) > 0 || lowerBound == u3.k() || upperBound == u3.n()) {
            throw new IllegalArgumentException("Invalid range: " + F(lowerBound, upperBound));
        }
    }

    public static <C extends Comparable<?>> f9<C> A(C lower, C upper) {
        return k(u3.l(lower), u3.l(upper));
    }

    public static <C extends Comparable<?>> f9<C> B(C lower, x lowerType, C upper, x upperType) {
        com.google.common.base.j0.E(lowerType);
        com.google.common.base.j0.E(upperType);
        x xVar = x.OPEN;
        return k(lowerType == xVar ? u3.l(lower) : u3.o(lower), upperType == xVar ? u3.o(upper) : u3.l(upper));
    }

    static <C extends Comparable<?>> a9<f9<C>> C() {
        return (a9<f9<C>>) b.f117399c;
    }

    public static <C extends Comparable<?>> f9<C> D(C value) {
        return f(value, value);
    }

    private static String F(u3<?> lowerBound, u3<?> upperBound) {
        StringBuilder sb2 = new StringBuilder(16);
        lowerBound.r(sb2);
        sb2.append("..");
        upperBound.s(sb2);
        return sb2.toString();
    }

    public static <C extends Comparable<?>> f9<C> G(C endpoint, x boundType) {
        int i10 = a.f117398a[boundType.ordinal()];
        if (i10 == 1) {
            return v(endpoint);
        }
        if (i10 == 2) {
            return d(endpoint);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> f9<C> a() {
        return (f9<C>) f117394c;
    }

    public static <C extends Comparable<?>> f9<C> c(C endpoint) {
        return k(u3.o(endpoint), u3.k());
    }

    public static <C extends Comparable<?>> f9<C> d(C endpoint) {
        return k(u3.n(), u3.l(endpoint));
    }

    public static <C extends Comparable<?>> f9<C> f(C lower, C upper) {
        return k(u3.o(lower), u3.l(upper));
    }

    public static <C extends Comparable<?>> f9<C> g(C lower, C upper) {
        return k(u3.o(lower), u3.o(upper));
    }

    static int h(Comparable left, Comparable right) {
        return left.compareTo(right);
    }

    static <C extends Comparable<?>> f9<C> k(u3<C> lowerBound, u3<C> upperBound) {
        return new f9<>(lowerBound, upperBound);
    }

    public static <C extends Comparable<?>> f9<C> l(C endpoint, x boundType) {
        int i10 = a.f117398a[boundType.ordinal()];
        int i11 = 5 & 1;
        if (i10 == 1) {
            return p(endpoint);
        }
        if (i10 == 2) {
            return c(endpoint);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> f9<C> m(Iterable<C> values) {
        com.google.common.base.j0.E(values);
        if (values instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) values;
            Comparator comparator = sortedSet.comparator();
            if (a9.z().equals(comparator) || comparator == null) {
                return f((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = values.iterator();
        Comparable comparable = (Comparable) com.google.common.base.j0.E(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) com.google.common.base.j0.E(it.next());
            comparable = (Comparable) a9.z().w(comparable, comparable3);
            comparable2 = (Comparable) a9.z().s(comparable2, comparable3);
        }
        return f(comparable, comparable2);
    }

    public static <C extends Comparable<?>> f9<C> p(C endpoint) {
        return k(u3.l(endpoint), u3.k());
    }

    public static <C extends Comparable<?>> f9<C> v(C endpoint) {
        return k(u3.n(), u3.o(endpoint));
    }

    public static <C extends Comparable<?>> f9<C> z(C lower, C upper) {
        return k(u3.l(lower), u3.o(upper));
    }

    public f9<C> E(f9<C> other) {
        int iQ = this.f117396a.compareTo(other.f117396a);
        int iQ2 = this.f117397b.compareTo(other.f117397b);
        if (iQ <= 0 && iQ2 >= 0) {
            return this;
        }
        if (iQ < 0 || iQ2 > 0) {
            return k(iQ <= 0 ? this.f117396a : other.f117396a, iQ2 >= 0 ? this.f117397b : other.f117397b);
        }
        return other;
    }

    u3<C> H() {
        return this.f117397b;
    }

    public x I() {
        return this.f117397b.D();
    }

    public C J() {
        return (C) this.f117397b.t();
    }

    @Override // com.google.common.base.k0
    @Deprecated
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean apply(C input) {
        return i(input);
    }

    public f9<C> e(z3<C> domain) {
        com.google.common.base.j0.E(domain);
        u3<C> u3VarP = this.f117396a.p(domain);
        u3<C> u3VarP2 = this.f117397b.p(domain);
        return (u3VarP == this.f117396a && u3VarP2 == this.f117397b) ? this : k(u3VarP, u3VarP2);
    }

    @Override // com.google.common.base.k0
    public boolean equals(@fj.a Object object) {
        if (object instanceof f9) {
            f9 f9Var = (f9) object;
            if (this.f117396a.equals(f9Var.f117396a) && this.f117397b.equals(f9Var.f117397b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f117396a.hashCode() * 31) + this.f117397b.hashCode();
    }

    public boolean i(C value) {
        com.google.common.base.j0.E(value);
        return this.f117396a.w(value) && !this.f117397b.w(value);
    }

    public boolean j(Iterable<? extends C> values) {
        if (o7.C(values)) {
            return true;
        }
        if (values instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) values;
            Comparator comparator = sortedSet.comparator();
            if (a9.z().equals(comparator) || comparator == null) {
                return i((Comparable) sortedSet.first()) && i((Comparable) sortedSet.last());
            }
        }
        Iterator<? extends C> it = values.iterator();
        while (it.hasNext()) {
            if (!i(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean n(f9<C> other) {
        return this.f117396a.compareTo(other.f117396a) <= 0 && this.f117397b.compareTo(other.f117397b) >= 0;
    }

    public f9<C> o(f9<C> otherRange) {
        if (this.f117396a.compareTo(otherRange.f117397b) < 0 && otherRange.f117396a.compareTo(this.f117397b) < 0) {
            throw new IllegalArgumentException("Ranges have a nonempty intersection: " + this + ", " + otherRange);
        }
        boolean z10 = this.f117396a.compareTo(otherRange.f117396a) < 0;
        f9<C> f9Var = z10 ? this : otherRange;
        if (z10) {
            this = otherRange;
        }
        return k(f9Var.f117397b, this.f117396a);
    }

    public boolean q() {
        return this.f117396a != u3.n();
    }

    public boolean r() {
        return this.f117397b != u3.k();
    }

    Object readResolve() {
        if (equals(f117394c)) {
            this = a();
        }
        return this;
    }

    public f9<C> s(f9<C> connectedRange) {
        int iQ = this.f117396a.compareTo(connectedRange.f117396a);
        int iQ2 = this.f117397b.compareTo(connectedRange.f117397b);
        if (iQ >= 0 && iQ2 <= 0) {
            return this;
        }
        if (iQ <= 0 && iQ2 >= 0) {
            return connectedRange;
        }
        u3<C> u3Var = iQ >= 0 ? this.f117396a : connectedRange.f117396a;
        u3<C> u3Var2 = iQ2 <= 0 ? this.f117397b : connectedRange.f117397b;
        com.google.common.base.j0.y(u3Var.compareTo(u3Var2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, connectedRange);
        return k(u3Var, u3Var2);
    }

    public boolean t(f9<C> other) {
        return this.f117396a.compareTo(other.f117397b) <= 0 && other.f117396a.compareTo(this.f117397b) <= 0;
    }

    public String toString() {
        return F(this.f117396a, this.f117397b);
    }

    public boolean u() {
        return this.f117396a.equals(this.f117397b);
    }

    u3<C> w() {
        return this.f117396a;
    }

    public x x() {
        return this.f117396a.z();
    }

    public C y() {
        return (C) this.f117396a.t();
    }
}
