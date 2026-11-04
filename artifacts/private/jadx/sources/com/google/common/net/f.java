package com.google.common.net;

import com.google.common.base.a0;
import com.google.common.base.e0;
import com.google.common.base.j0;
import com.google.common.base.o0;
import com.google.common.collect.l6;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@a
@z7.j
@com.google.common.annotations.b(emulated = true)
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.common.base.e f119580e = com.google.common.base.e.d(".。．｡");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o0 f119581f = o0.h('.');

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a0 f119582g = a0.o('.');

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f119583h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f119584i = -2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f119585j = 127;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f119586k = 253;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f119587l = 63;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final com.google.common.base.e f119588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final com.google.common.base.e f119589n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.google.common.base.e f119590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final com.google.common.base.e f119591p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f119592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l6<String> f119593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a8.b
    private int f119594c = -2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a8.b
    private int f119595d = -2;

    static {
        com.google.common.base.e eVarD = com.google.common.base.e.d("-_");
        f119588m = eVarD;
        com.google.common.base.e eVarM = com.google.common.base.e.m(org.locationtech.jts.geom.l.f338160j, '9');
        f119589n = eVarM;
        com.google.common.base.e eVarI = com.google.common.base.e.m('a', ni.f.f333372i).I(com.google.common.base.e.m('A', 'Z'));
        f119590o = eVarI;
        f119591p = eVarM.I(eVarI).I(eVarD);
    }

    f(String name) {
        String strG = com.google.common.base.c.g(f119580e.N(name, '.'));
        strG = strG.endsWith(".") ? strG.substring(0, strG.length() - 1) : strG;
        j0.u(strG.length() <= 253, "Domain name too long: '%s':", strG);
        this.f119592a = strG;
        l6<String> l6VarV = l6.v(f119581f.n(strG));
        this.f119593b = l6VarV;
        j0.u(l6VarV.size() <= 127, "Domain has too many parts: '%s'", strG);
        j0.u(y(l6VarV), "Not a valid domain name: '%s'", strG);
    }

    private f a(int levels) {
        l6<String> l6Var = this.f119593b;
        l6<String> l6VarSubList = l6Var.subList(levels, l6Var.size());
        int length = levels;
        for (int i10 = 0; i10 < levels; i10++) {
            length += this.f119593b.get(i10).length();
        }
        return new f(this.f119592a.substring(length), l6VarSubList);
    }

    private int c(e0<com.google.thirdparty.publicsuffix.b> desiredType) {
        int size = this.f119593b.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strK = f119582g.k(this.f119593b.subList(i10, size));
            if (i10 > 0 && o(desiredType, e0.c(com.google.thirdparty.publicsuffix.a.f126693b.get(strK)))) {
                return i10 - 1;
            }
            if (o(desiredType, e0.c(com.google.thirdparty.publicsuffix.a.f126692a.get(strK)))) {
                return i10;
            }
            if (com.google.thirdparty.publicsuffix.a.f126694c.containsKey(strK)) {
                return i10 + 1;
            }
        }
        return -1;
    }

    @z7.a
    public static f d(String domain) {
        return new f((String) j0.E(domain));
    }

    public static boolean n(String name) {
        try {
            d(name);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private static boolean o(e0<com.google.thirdparty.publicsuffix.b> desiredType, e0<com.google.thirdparty.publicsuffix.b> actualType) {
        return desiredType.e() ? desiredType.equals(actualType) : actualType.e();
    }

    private int s() {
        int i10 = this.f119594c;
        if (i10 != -2) {
            return i10;
        }
        int iC = c(e0.a());
        this.f119594c = iC;
        return iC;
    }

    private int u() {
        int i10 = this.f119595d;
        if (i10 != -2) {
            return i10;
        }
        int iC = c(e0.f(com.google.thirdparty.publicsuffix.b.REGISTRY));
        this.f119595d = iC;
        return iC;
    }

    private static boolean x(String part, boolean isFinalPart) {
        if (part.length() >= 1 && part.length() <= 63) {
            if (!f119591p.C(com.google.common.base.e.f().P(part))) {
                return false;
            }
            com.google.common.base.e eVar = f119588m;
            if (!eVar.B(part.charAt(0)) && !eVar.B(part.charAt(part.length() - 1))) {
                return (isFinalPart && f119589n.B(part.charAt(0))) ? false : true;
            }
        }
        return false;
    }

    private static boolean y(List<String> parts) {
        int size = parts.size() - 1;
        if (!x(parts.get(size), true)) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!x(parts.get(i10), false)) {
                return false;
            }
        }
        return true;
    }

    public f b(String leftParts) {
        return d(((String) j0.E(leftParts)) + "." + this.f119592a);
    }

    public boolean e() {
        return this.f119593b.size() > 1;
    }

    public boolean equals(@fj.a Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof f) {
            return this.f119592a.equals(((f) object).f119592a);
        }
        return false;
    }

    public boolean f() {
        return s() != -1;
    }

    public boolean g() {
        return u() != -1;
    }

    public boolean h() {
        return s() == 0;
    }

    public int hashCode() {
        return this.f119592a.hashCode();
    }

    public boolean i() {
        return u() == 0;
    }

    public boolean j() {
        return u() == 1;
    }

    public boolean k() {
        return s() == 1;
    }

    public boolean l() {
        return s() > 0;
    }

    public boolean m() {
        return u() > 0;
    }

    public f p() {
        j0.x0(e(), "Domain '%s' has no parent", this.f119592a);
        return a(1);
    }

    public l6<String> q() {
        return this.f119593b;
    }

    @fj.a
    public f r() {
        if (f()) {
            return a(s());
        }
        return null;
    }

    @fj.a
    public f t() {
        if (g()) {
            return a(u());
        }
        return null;
    }

    public String toString() {
        return this.f119592a;
    }

    public f v() {
        if (j()) {
            return this;
        }
        j0.x0(m(), "Not under a registry suffix: %s", this.f119592a);
        return a(u() - 1);
    }

    public f w() {
        if (k()) {
            return this;
        }
        j0.x0(l(), "Not under a public suffix: %s", this.f119592a);
        return a(s() - 1);
    }

    private f(String name, l6<String> parts) {
        j0.e(!parts.isEmpty(), "Cannot create an InternetDomainName with zero parts.");
        this.f119592a = name;
        this.f119593b = parts;
    }
}
