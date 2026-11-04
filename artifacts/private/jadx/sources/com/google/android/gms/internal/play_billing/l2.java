package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class l2 extends m2 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final l2 f109185c = new l2(g1.f109125b, e1.f109106b);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f109186d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final h1 f109187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final h1 f109188b;

    private l2(h1 h1Var, h1 h1Var2) {
        this.f109187a = h1Var;
        this.f109188b = h1Var2;
        if (h1Var.compareTo(h1Var2) > 0 || h1Var == e1.f109106b || h1Var2 == g1.f109125b) {
            throw new IllegalArgumentException("Invalid range: ".concat(e(h1Var, h1Var2)));
        }
    }

    public static l2 a() {
        return f109185c;
    }

    private static String e(h1 h1Var, h1 h1Var2) {
        StringBuilder sb2 = new StringBuilder(16);
        h1Var.c(sb2);
        sb2.append("..");
        h1Var2.d(sb2);
        return sb2.toString();
    }

    public final l2 b(l2 l2Var) {
        int iB = this.f109187a.compareTo(l2Var.f109187a);
        int iB2 = this.f109188b.compareTo(l2Var.f109188b);
        if (iB >= 0 && iB2 <= 0) {
            return this;
        }
        if (iB <= 0 && iB2 >= 0) {
            return l2Var;
        }
        h1 h1Var = iB >= 0 ? this.f109187a : l2Var.f109187a;
        h1 h1Var2 = iB2 <= 0 ? this.f109188b : l2Var.f109188b;
        g0.d(h1Var.compareTo(h1Var2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, l2Var);
        return new l2(h1Var, h1Var2);
    }

    public final l2 c(l2 l2Var) {
        int iB = this.f109187a.compareTo(l2Var.f109187a);
        int iB2 = this.f109188b.compareTo(l2Var.f109188b);
        if (iB <= 0 && iB2 >= 0) {
            return this;
        }
        if (iB >= 0 && iB2 <= 0) {
            return l2Var;
        }
        h1 h1Var = iB <= 0 ? this.f109187a : l2Var.f109187a;
        if (iB2 < 0) {
            this = l2Var;
        }
        return new l2(h1Var, this.f109188b);
    }

    public final boolean d() {
        return this.f109187a.equals(this.f109188b);
    }

    public final boolean equals(@fj.a Object obj) {
        if (obj instanceof l2) {
            l2 l2Var = (l2) obj;
            if (this.f109187a.equals(l2Var.f109187a) && this.f109188b.equals(l2Var.f109188b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f109187a.hashCode() * 31) + this.f109188b.hashCode();
    }

    public final String toString() {
        return e(this.f109187a, this.f109188b);
    }
}
