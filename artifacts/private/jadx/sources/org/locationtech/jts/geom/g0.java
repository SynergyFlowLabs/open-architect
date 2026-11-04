package org.locationtech.jts.geom;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class g0 implements Serializable, Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f338116c = 7777263578777803835L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f338117d = new a("FIXED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f338118e = new a("FLOATING");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f338119f = new a("FLOATING SINGLE");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final double f338120g = 9.007199254740992E15d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f338121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338122b;

    public static class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f338123b = -5528602631731589822L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Map f338124c = new HashMap();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f338125a;

        public a(String str) {
            this.f338125a = str;
            f338124c.put(str, this);
        }

        private Object readResolve() {
            return f338124c.get(this.f338125a);
        }

        public String toString() {
            return this.f338125a;
        }
    }

    public g0() {
        this.f338121a = f338118e;
    }

    public static g0 t(g0 g0Var, g0 g0Var2) {
        return g0Var.compareTo(g0Var2) >= 0 ? g0Var : g0Var2;
    }

    private void v(double d10) {
        this.f338122b = Math.abs(d10);
    }

    public void D(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        if (q()) {
            aVar2.f338092a = aVar.f338092a;
            aVar2.f338093b = aVar.f338093b;
        } else {
            aVar2.f338092a = r(aVar.f338092a);
            aVar2.f338093b = r(aVar.f338093b);
        }
        aVar2.f338094c = aVar.f338094c;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return new Integer(k()).compareTo(new Integer(((g0) obj).k()));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f338121a == g0Var.f338121a && this.f338122b == g0Var.f338122b;
    }

    public int k() {
        a aVar = this.f338121a;
        if (aVar == f338118e) {
            return 16;
        }
        if (aVar == f338119f) {
            return 6;
        }
        if (aVar == f338117d) {
            return ((int) Math.ceil(Math.log(o()) / Math.log(10.0d))) + 1;
        }
        return 16;
    }

    public double l() {
        return 0.0d;
    }

    public double n() {
        return 0.0d;
    }

    public double o() {
        return this.f338122b;
    }

    public a p() {
        return this.f338121a;
    }

    public boolean q() {
        a aVar = this.f338121a;
        return aVar == f338118e || aVar == f338119f;
    }

    public double r(double d10) {
        if (Double.isNaN(d10)) {
            return d10;
        }
        a aVar = this.f338121a;
        if (aVar == f338119f) {
            return (float) d10;
        }
        return aVar == f338117d ? Math.round(d10 * this.f338122b) / this.f338122b : d10;
    }

    public void s(org.locationtech.jts.geom.a aVar) {
        if (this.f338121a == f338118e) {
            return;
        }
        aVar.f338092a = r(aVar.f338092a);
        aVar.f338093b = r(aVar.f338093b);
    }

    public String toString() {
        a aVar = this.f338121a;
        if (aVar == f338118e) {
            return "Floating";
        }
        if (aVar == f338119f) {
            return "Floating-Single";
        }
        if (aVar != f338117d) {
            return "UNKNOWN";
        }
        return "Fixed (Scale=" + o() + ")";
    }

    public org.locationtech.jts.geom.a w(org.locationtech.jts.geom.a aVar) {
        return new org.locationtech.jts.geom.a(aVar);
    }

    public void x(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        aVar2.f338092a = aVar.f338092a;
        aVar2.f338093b = aVar.f338093b;
    }

    public org.locationtech.jts.geom.a z(org.locationtech.jts.geom.a aVar) {
        org.locationtech.jts.geom.a aVar2 = new org.locationtech.jts.geom.a(aVar);
        s(aVar2);
        return aVar2;
    }

    public g0(a aVar) {
        this.f338121a = aVar;
        if (aVar == f338117d) {
            v(1.0d);
        }
    }

    public g0(double d10, double d11, double d12) {
        this.f338121a = f338117d;
        v(d10);
    }

    public g0(double d10) {
        this.f338121a = f338117d;
        v(d10);
    }

    public g0(g0 g0Var) {
        this.f338121a = g0Var.f338121a;
        this.f338122b = g0Var.f338122b;
    }
}
