package org.slf4j.helpers;

/* JADX INFO: loaded from: classes14.dex */
public abstract class h extends n implements org.slf4j.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f339633c = 9044267456635152283L;

    @Override // org.slf4j.c
    public void A(org.slf4j.h hVar, String str) {
        m0(str);
    }

    @Override // org.slf4j.c
    public void B(org.slf4j.h hVar, String str, Throwable th2) {
        q(str, th2);
    }

    @Override // org.slf4j.c
    public void E(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        k(str, obj, obj2);
    }

    @Override // org.slf4j.c
    public void G(org.slf4j.h hVar, String str, Object... objArr) {
        a(str, objArr);
    }

    @Override // org.slf4j.c
    public void L(org.slf4j.h hVar, String str, Object... objArr) {
        h(str, objArr);
    }

    @Override // org.slf4j.c
    public void P(org.slf4j.h hVar, String str, Object... objArr) {
        f(str, objArr);
    }

    @Override // org.slf4j.c
    public void Q(org.slf4j.h hVar, String str, Object... objArr) {
        b(str, objArr);
    }

    @Override // org.slf4j.c
    public void U(org.slf4j.h hVar, String str, Object... objArr) {
        e(str, objArr);
    }

    @Override // org.slf4j.c
    public boolean V(org.slf4j.h hVar) {
        return M();
    }

    @Override // org.slf4j.c
    public boolean X(org.slf4j.h hVar) {
        return O();
    }

    @Override // org.slf4j.c
    public void Y(org.slf4j.h hVar, String str) {
        J(str);
    }

    @Override // org.slf4j.c
    public void Z(org.slf4j.h hVar, String str, Throwable th2) {
        p(str, th2);
    }

    @Override // org.slf4j.c
    public void a0(org.slf4j.h hVar, String str, Throwable th2) {
        o(str, th2);
    }

    @Override // org.slf4j.c
    public void c0(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        m(str, obj, obj2);
    }

    @Override // org.slf4j.c
    public void d0(org.slf4j.h hVar, String str, Object obj) {
        v(str, obj);
    }

    @Override // org.slf4j.c
    public void e0(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        C(str, obj, obj2);
    }

    @Override // org.slf4j.c
    public void g0(org.slf4j.h hVar, String str, Object obj) {
        D(str, obj);
    }

    @Override // org.slf4j.helpers.n, org.slf4j.c
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    @Override // org.slf4j.c
    public boolean i0(org.slf4j.h hVar) {
        return R();
    }

    @Override // org.slf4j.c
    public void j0(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        i(str, obj, obj2);
    }

    @Override // org.slf4j.c
    public boolean k0(org.slf4j.h hVar) {
        return z();
    }

    @Override // org.slf4j.c
    public void l0(org.slf4j.h hVar, String str, Throwable th2) {
        d(str, th2);
    }

    @Override // org.slf4j.c
    public void n0(org.slf4j.h hVar, String str, Throwable th2) {
        c(str, th2);
    }

    @Override // org.slf4j.c
    public boolean o0(org.slf4j.h hVar) {
        return l();
    }

    @Override // org.slf4j.c
    public void p0(org.slf4j.h hVar, String str, Object obj) {
        F(str, obj);
    }

    @Override // org.slf4j.c
    public void q0(org.slf4j.h hVar, String str) {
        I(str);
    }

    @Override // org.slf4j.c
    public void r(org.slf4j.h hVar, String str) {
        j(str);
    }

    @Override // org.slf4j.c
    public void t(org.slf4j.h hVar, String str, Object obj) {
        w(str, obj);
    }

    public String toString() {
        return getClass().getName() + "(" + getName() + ")";
    }

    @Override // org.slf4j.c
    public void u(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        s(str, obj, obj2);
    }

    @Override // org.slf4j.c
    public void x(org.slf4j.h hVar, String str, Object obj) {
        b0(str, obj);
    }

    @Override // org.slf4j.c
    public void y(org.slf4j.h hVar, String str) {
        g(str);
    }
}
