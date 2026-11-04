package org.slf4j.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: loaded from: classes14.dex */
public class r implements org.slf4j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f339667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile org.slf4j.c f339668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f339669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Method f339670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.slf4j.event.c f339671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Queue<org.slf4j.event.g> f339672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f339673g;

    public r(String str, Queue<org.slf4j.event.g> queue, boolean z10) {
        this.f339667a = str;
        this.f339672f = queue;
        this.f339673g = z10;
    }

    private org.slf4j.c s0() {
        if (this.f339671e == null) {
            this.f339671e = new org.slf4j.event.c(this, this.f339672f);
        }
        return this.f339671e;
    }

    @Override // org.slf4j.c
    public void A(org.slf4j.h hVar, String str) {
        r0().A(hVar, str);
    }

    @Override // org.slf4j.c
    public void B(org.slf4j.h hVar, String str, Throwable th2) {
        r0().B(hVar, str, th2);
    }

    @Override // org.slf4j.c
    public void C(String str, Object obj, Object obj2) {
        r0().C(str, obj, obj2);
    }

    @Override // org.slf4j.c
    public void D(String str, Object obj) {
        r0().D(str, obj);
    }

    @Override // org.slf4j.c
    public void E(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        r0().E(hVar, str, obj, obj2);
    }

    @Override // org.slf4j.c
    public void F(String str, Object obj) {
        r0().F(str, obj);
    }

    @Override // org.slf4j.c
    public void G(org.slf4j.h hVar, String str, Object... objArr) {
        r0().G(hVar, str, objArr);
    }

    @Override // org.slf4j.c
    public org.slf4j.spi.f H() {
        return r0().H();
    }

    @Override // org.slf4j.c
    public void I(String str) {
        r0().I(str);
    }

    @Override // org.slf4j.c
    public void J(String str) {
        r0().J(str);
    }

    @Override // org.slf4j.c
    public org.slf4j.spi.f K() {
        return r0().K();
    }

    @Override // org.slf4j.c
    public void L(org.slf4j.h hVar, String str, Object... objArr) {
        r0().L(hVar, str, objArr);
    }

    @Override // org.slf4j.c
    public boolean M() {
        return r0().M();
    }

    @Override // org.slf4j.c
    public org.slf4j.spi.f N() {
        return r0().N();
    }

    @Override // org.slf4j.c
    public boolean O() {
        return r0().O();
    }

    @Override // org.slf4j.c
    public void P(org.slf4j.h hVar, String str, Object... objArr) {
        r0().P(hVar, str, objArr);
    }

    @Override // org.slf4j.c
    public void Q(org.slf4j.h hVar, String str, Object... objArr) {
        r0().Q(hVar, str, objArr);
    }

    @Override // org.slf4j.c
    public boolean R() {
        return r0().R();
    }

    @Override // org.slf4j.c
    public org.slf4j.spi.f S(org.slf4j.event.e eVar) {
        return r0().S(eVar);
    }

    @Override // org.slf4j.c
    public boolean T(org.slf4j.event.e eVar) {
        return r0().T(eVar);
    }

    @Override // org.slf4j.c
    public void U(org.slf4j.h hVar, String str, Object... objArr) {
        r0().U(hVar, str, objArr);
    }

    @Override // org.slf4j.c
    public boolean V(org.slf4j.h hVar) {
        return r0().V(hVar);
    }

    @Override // org.slf4j.c
    public org.slf4j.spi.f W() {
        return r0().W();
    }

    @Override // org.slf4j.c
    public boolean X(org.slf4j.h hVar) {
        return r0().X(hVar);
    }

    @Override // org.slf4j.c
    public void Y(org.slf4j.h hVar, String str) {
        r0().Y(hVar, str);
    }

    @Override // org.slf4j.c
    public void Z(org.slf4j.h hVar, String str, Throwable th2) {
        r0().Z(hVar, str, th2);
    }

    @Override // org.slf4j.c
    public void a(String str, Object... objArr) {
        r0().a(str, objArr);
    }

    @Override // org.slf4j.c
    public void a0(org.slf4j.h hVar, String str, Throwable th2) {
        r0().a0(hVar, str, th2);
    }

    @Override // org.slf4j.c
    public void b(String str, Object... objArr) {
        r0().b(str, objArr);
    }

    @Override // org.slf4j.c
    public void b0(String str, Object obj) {
        r0().b0(str, obj);
    }

    @Override // org.slf4j.c
    public void c(String str, Throwable th2) {
        r0().c(str, th2);
    }

    @Override // org.slf4j.c
    public void c0(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        r0().c0(hVar, str, obj, obj2);
    }

    @Override // org.slf4j.c
    public void d(String str, Throwable th2) {
        r0().d(str, th2);
    }

    @Override // org.slf4j.c
    public void d0(org.slf4j.h hVar, String str, Object obj) {
        r0().d0(hVar, str, obj);
    }

    @Override // org.slf4j.c
    public void e(String str, Object... objArr) {
        r0().e(str, objArr);
    }

    @Override // org.slf4j.c
    public void e0(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        r0().e0(hVar, str, obj, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f339667a.equals(((r) obj).f339667a);
    }

    @Override // org.slf4j.c
    public void f(String str, Object... objArr) {
        r0().f(str, objArr);
    }

    @Override // org.slf4j.c
    public void g(String str) {
        r0().g(str);
    }

    @Override // org.slf4j.c
    public void g0(org.slf4j.h hVar, String str, Object obj) {
        r0().g0(hVar, str, obj);
    }

    @Override // org.slf4j.c
    public String getName() {
        return this.f339667a;
    }

    @Override // org.slf4j.c
    public void h(String str, Object... objArr) {
        r0().h(str, objArr);
    }

    @Override // org.slf4j.c
    public org.slf4j.spi.f h0() {
        return r0().h0();
    }

    public int hashCode() {
        return this.f339667a.hashCode();
    }

    @Override // org.slf4j.c
    public void i(String str, Object obj, Object obj2) {
        r0().i(str, obj, obj2);
    }

    @Override // org.slf4j.c
    public boolean i0(org.slf4j.h hVar) {
        return r0().i0(hVar);
    }

    @Override // org.slf4j.c
    public void j(String str) {
        r0().j(str);
    }

    @Override // org.slf4j.c
    public void j0(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        r0().j0(hVar, str, obj, obj2);
    }

    @Override // org.slf4j.c
    public void k(String str, Object obj, Object obj2) {
        r0().k(str, obj, obj2);
    }

    @Override // org.slf4j.c
    public boolean k0(org.slf4j.h hVar) {
        return r0().k0(hVar);
    }

    @Override // org.slf4j.c
    public boolean l() {
        return r0().l();
    }

    @Override // org.slf4j.c
    public void l0(org.slf4j.h hVar, String str, Throwable th2) {
        r0().l0(hVar, str, th2);
    }

    @Override // org.slf4j.c
    public void m(String str, Object obj, Object obj2) {
        r0().m(str, obj, obj2);
    }

    @Override // org.slf4j.c
    public void m0(String str) {
        r0().m0(str);
    }

    @Override // org.slf4j.c
    public org.slf4j.spi.f n(org.slf4j.event.e eVar) {
        return r0().n(eVar);
    }

    @Override // org.slf4j.c
    public void n0(org.slf4j.h hVar, String str, Throwable th2) {
        r0().n0(hVar, str, th2);
    }

    @Override // org.slf4j.c
    public void o(String str, Throwable th2) {
        r0().o(str, th2);
    }

    @Override // org.slf4j.c
    public boolean o0(org.slf4j.h hVar) {
        return r0().o0(hVar);
    }

    @Override // org.slf4j.c
    public void p(String str, Throwable th2) {
        r0().p(str, th2);
    }

    @Override // org.slf4j.c
    public void p0(org.slf4j.h hVar, String str, Object obj) {
        r0().p0(hVar, str, obj);
    }

    @Override // org.slf4j.c
    public void q(String str, Throwable th2) {
        r0().q(str, th2);
    }

    @Override // org.slf4j.c
    public void q0(org.slf4j.h hVar, String str) {
        r0().q0(hVar, str);
    }

    @Override // org.slf4j.c
    public void r(org.slf4j.h hVar, String str) {
        r0().r(hVar, str);
    }

    public org.slf4j.c r0() {
        if (this.f339668b != null) {
            return this.f339668b;
        }
        return this.f339673g ? j.f339639d : s0();
    }

    @Override // org.slf4j.c
    public void s(String str, Object obj, Object obj2) {
        r0().s(str, obj, obj2);
    }

    @Override // org.slf4j.c
    public void t(org.slf4j.h hVar, String str, Object obj) {
        r0().t(hVar, str, obj);
    }

    public boolean t0() {
        Boolean bool = this.f339669c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f339670d = this.f339668b.getClass().getMethod("log", org.slf4j.event.f.class);
            this.f339669c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f339669c = Boolean.FALSE;
        }
        return this.f339669c.booleanValue();
    }

    @Override // org.slf4j.c
    public void u(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        r0().u(hVar, str, obj, obj2);
    }

    public boolean u0() {
        return this.f339668b instanceof j;
    }

    @Override // org.slf4j.c
    public void v(String str, Object obj) {
        r0().v(str, obj);
    }

    public boolean v0() {
        return this.f339668b == null;
    }

    @Override // org.slf4j.c
    public void w(String str, Object obj) {
        r0().w(str, obj);
    }

    public void w0(org.slf4j.event.f fVar) {
        if (t0()) {
            try {
                this.f339670d.invoke(this.f339668b, fVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    @Override // org.slf4j.c
    public void x(org.slf4j.h hVar, String str, Object obj) {
        r0().x(hVar, str, obj);
    }

    public void x0(org.slf4j.c cVar) {
        this.f339668b = cVar;
    }

    @Override // org.slf4j.c
    public void y(org.slf4j.h hVar, String str) {
        r0().y(hVar, str);
    }

    @Override // org.slf4j.c
    public boolean z() {
        return r0().z();
    }
}
