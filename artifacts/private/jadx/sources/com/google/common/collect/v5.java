package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(serializable = true)
final class v5<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator<? super T> f118205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f118206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.a
    private final T f118207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f118208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f118209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @fj.a
    private final T f118210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f118211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient v5<T> f118212h;

    private v5(Comparator<? super T> comparator, boolean z10, @fj.a T t10, x xVar, boolean z11, @fj.a T t11, x xVar2) {
        this.f118205a = (Comparator) com.google.common.base.j0.E(comparator);
        this.f118206b = z10;
        this.f118209e = z11;
        this.f118207c = t10;
        this.f118208d = (x) com.google.common.base.j0.E(xVar);
        this.f118210f = t11;
        this.f118211g = (x) com.google.common.base.j0.E(xVar2);
        if (z10) {
            comparator.compare((Object) u8.a(t10), (Object) u8.a(t10));
        }
        if (z11) {
            comparator.compare((Object) u8.a(t11), (Object) u8.a(t11));
        }
        if (z10 && z11) {
            int iCompare = comparator.compare((Object) u8.a(t10), (Object) u8.a(t11));
            com.google.common.base.j0.y(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t10, t11);
            if (iCompare == 0) {
                x xVar3 = x.OPEN;
                com.google.common.base.j0.d((xVar == xVar3 && xVar2 == xVar3) ? false : true);
            }
        }
    }

    static <T> v5<T> a(Comparator<? super T> comparator) {
        x xVar = x.OPEN;
        return new v5<>(comparator, false, null, xVar, false, null, xVar);
    }

    static <T> v5<T> d(Comparator<? super T> comparator, @b9 T endpoint, x boundType) {
        return new v5<>(comparator, true, endpoint, boundType, false, null, x.OPEN);
    }

    static <T extends Comparable> v5<T> e(f9<T> range) {
        return new v5<>(a9.z(), range.q(), range.q() ? range.y() : null, range.q() ? range.x() : x.OPEN, range.r(), range.r() ? range.J() : null, range.r() ? range.I() : x.OPEN);
    }

    static <T> v5<T> n(Comparator<? super T> comparator, @b9 T lower, x lowerType, @b9 T upper, x upperType) {
        return new v5<>(comparator, true, lower, lowerType, true, upper, upperType);
    }

    static <T> v5<T> r(Comparator<? super T> comparator, @b9 T endpoint, x boundType) {
        return new v5<>(comparator, false, null, x.OPEN, true, endpoint, boundType);
    }

    Comparator<? super T> b() {
        return this.f118205a;
    }

    boolean c(@b9 T t10) {
        return (q(t10) || p(t10)) ? false : true;
    }

    public boolean equals(@fj.a Object obj) {
        if (obj instanceof v5) {
            v5 v5Var = (v5) obj;
            if (this.f118205a.equals(v5Var.f118205a) && this.f118206b == v5Var.f118206b && this.f118209e == v5Var.f118209e && f().equals(v5Var.f()) && h().equals(v5Var.h()) && com.google.common.base.d0.a(g(), v5Var.g()) && com.google.common.base.d0.a(i(), v5Var.i())) {
                return true;
            }
        }
        return false;
    }

    x f() {
        return this.f118208d;
    }

    @fj.a
    T g() {
        return this.f118207c;
    }

    x h() {
        return this.f118211g;
    }

    public int hashCode() {
        return com.google.common.base.d0.b(this.f118205a, g(), f(), i(), h());
    }

    @fj.a
    T i() {
        return this.f118210f;
    }

    boolean j() {
        return this.f118206b;
    }

    boolean k() {
        return this.f118209e;
    }

    v5<T> l(v5<T> other) {
        int iCompare;
        int iCompare2;
        T t10;
        int iCompare3;
        x xVar;
        com.google.common.base.j0.E(other);
        com.google.common.base.j0.d(this.f118205a.equals(other.f118205a));
        boolean z10 = this.f118206b;
        T tG = g();
        x xVarF = f();
        if (!j()) {
            z10 = other.f118206b;
            tG = other.g();
            xVarF = other.f();
        } else if (other.j() && ((iCompare = this.f118205a.compare(g(), other.g())) < 0 || (iCompare == 0 && other.f() == x.OPEN))) {
            tG = other.g();
            xVarF = other.f();
        }
        boolean z11 = z10;
        boolean z12 = this.f118209e;
        T tI = i();
        x xVarH = h();
        if (!k()) {
            z12 = other.f118209e;
            tI = other.i();
            xVarH = other.h();
        } else if (other.k() && ((iCompare2 = this.f118205a.compare(i(), other.i())) > 0 || (iCompare2 == 0 && other.h() == x.OPEN))) {
            tI = other.i();
            xVarH = other.h();
        }
        boolean z13 = z12;
        T t11 = tI;
        if (z11 && z13 && ((iCompare3 = this.f118205a.compare(tG, t11)) > 0 || (iCompare3 == 0 && xVarF == (xVar = x.OPEN) && xVarH == xVar))) {
            xVarF = x.OPEN;
            xVarH = x.CLOSED;
            t10 = t11;
        } else {
            t10 = tG;
        }
        return new v5<>(this.f118205a, z11, t10, xVarF, z13, t11, xVarH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean m() {
        return (k() && q(u8.a(i()))) || (j() && p(u8.a(g())));
    }

    v5<T> o() {
        v5<T> v5Var = this.f118212h;
        if (v5Var != null) {
            return v5Var;
        }
        v5<T> v5Var2 = new v5<>(a9.i(this.f118205a).E(), this.f118209e, i(), h(), this.f118206b, g(), f());
        v5Var2.f118212h = this;
        this.f118212h = v5Var2;
        return v5Var2;
    }

    boolean p(@b9 T t10) {
        if (!k()) {
            return false;
        }
        int iCompare = this.f118205a.compare(t10, u8.a(i()));
        return ((iCompare == 0) & (h() == x.OPEN)) | (iCompare > 0);
    }

    boolean q(@b9 T t10) {
        if (!j()) {
            return false;
        }
        int iCompare = this.f118205a.compare(t10, u8.a(g()));
        return ((iCompare == 0) & (f() == x.OPEN)) | (iCompare < 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f118205a);
        sb2.append(":");
        x xVar = this.f118208d;
        x xVar2 = x.CLOSED;
        sb2.append(xVar == xVar2 ? AbstractJsonLexerKt.BEGIN_LIST : '(');
        sb2.append(this.f118206b ? this.f118207c : "-∞");
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(this.f118209e ? this.f118210f : "∞");
        sb2.append(this.f118211g == xVar2 ? AbstractJsonLexerKt.END_LIST : ')');
        return sb2.toString();
    }
}
