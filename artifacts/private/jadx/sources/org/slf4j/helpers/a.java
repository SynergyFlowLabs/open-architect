package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a implements org.slf4j.c, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f339616b = -2529255052481744503L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f339617a;

    private void s0(org.slf4j.event.e eVar, org.slf4j.h hVar, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            u0(eVar, hVar, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            u0(eVar, hVar, str, new Object[]{obj, obj2}, null);
        }
    }

    private void t0(org.slf4j.event.e eVar, org.slf4j.h hVar, String str, Object[] objArr) {
        Throwable thM = i.m(objArr);
        if (thM != null) {
            u0(eVar, hVar, str, i.u(objArr), thM);
        } else {
            u0(eVar, hVar, str, objArr, null);
        }
    }

    private void v0(org.slf4j.event.e eVar, org.slf4j.h hVar, String str, Throwable th2) {
        u0(eVar, hVar, str, null, th2);
    }

    private void w0(org.slf4j.event.e eVar, org.slf4j.h hVar, String str, Object obj) {
        u0(eVar, hVar, str, new Object[]{obj}, null);
    }

    @Override // org.slf4j.c
    public void A(org.slf4j.h hVar, String str) {
        if (V(hVar)) {
            v0(org.slf4j.event.e.WARN, hVar, str, null);
        }
    }

    @Override // org.slf4j.c
    public void B(org.slf4j.h hVar, String str, Throwable th2) {
        if (i0(hVar)) {
            v0(org.slf4j.event.e.TRACE, hVar, str, th2);
        }
    }

    @Override // org.slf4j.c
    public void C(String str, Object obj, Object obj2) {
        if (z()) {
            s0(org.slf4j.event.e.ERROR, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.c
    public void D(String str, Object obj) {
        if (O()) {
            w0(org.slf4j.event.e.DEBUG, null, str, obj);
        }
    }

    @Override // org.slf4j.c
    public void E(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        if (i0(hVar)) {
            s0(org.slf4j.event.e.TRACE, hVar, str, obj, obj2);
        }
    }

    @Override // org.slf4j.c
    public void F(String str, Object obj) {
        if (z()) {
            int i10 = 4 & 0;
            w0(org.slf4j.event.e.ERROR, null, str, obj);
        }
    }

    @Override // org.slf4j.c
    public void G(org.slf4j.h hVar, String str, Object... objArr) {
        if (k0(hVar)) {
            t0(org.slf4j.event.e.ERROR, hVar, str, objArr);
        }
    }

    @Override // org.slf4j.c
    public void I(String str) {
        if (l()) {
            v0(org.slf4j.event.e.INFO, null, str, null);
        }
    }

    @Override // org.slf4j.c
    public void J(String str) {
        if (R()) {
            v0(org.slf4j.event.e.TRACE, null, str, null);
        }
    }

    @Override // org.slf4j.c
    public void L(org.slf4j.h hVar, String str, Object... objArr) {
        if (o0(hVar)) {
            t0(org.slf4j.event.e.INFO, hVar, str, objArr);
        }
    }

    @Override // org.slf4j.c
    public void P(org.slf4j.h hVar, String str, Object... objArr) {
        if (i0(hVar)) {
            t0(org.slf4j.event.e.TRACE, hVar, str, objArr);
        }
    }

    @Override // org.slf4j.c
    public void Q(org.slf4j.h hVar, String str, Object... objArr) {
        if (V(hVar)) {
            t0(org.slf4j.event.e.WARN, hVar, str, objArr);
        }
    }

    @Override // org.slf4j.c
    public void U(org.slf4j.h hVar, String str, Object... objArr) {
        if (X(hVar)) {
            t0(org.slf4j.event.e.DEBUG, hVar, str, objArr);
        }
    }

    @Override // org.slf4j.c
    public void Y(org.slf4j.h hVar, String str) {
        if (i0(hVar)) {
            v0(org.slf4j.event.e.TRACE, hVar, str, null);
        }
    }

    @Override // org.slf4j.c
    public void Z(org.slf4j.h hVar, String str, Throwable th2) {
        if (V(hVar)) {
            v0(org.slf4j.event.e.WARN, hVar, str, th2);
        }
    }

    @Override // org.slf4j.c
    public void a(String str, Object... objArr) {
        if (z()) {
            t0(org.slf4j.event.e.ERROR, null, str, objArr);
        }
    }

    @Override // org.slf4j.c
    public void a0(org.slf4j.h hVar, String str, Throwable th2) {
        if (o0(hVar)) {
            v0(org.slf4j.event.e.INFO, hVar, str, th2);
        }
    }

    @Override // org.slf4j.c
    public void b(String str, Object... objArr) {
        if (M()) {
            t0(org.slf4j.event.e.WARN, null, str, objArr);
        }
    }

    @Override // org.slf4j.c
    public void b0(String str, Object obj) {
        if (R()) {
            w0(org.slf4j.event.e.TRACE, null, str, obj);
        }
    }

    @Override // org.slf4j.c
    public void c(String str, Throwable th2) {
        if (z()) {
            v0(org.slf4j.event.e.ERROR, null, str, th2);
        }
    }

    @Override // org.slf4j.c
    public void c0(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        if (V(hVar)) {
            s0(org.slf4j.event.e.WARN, hVar, str, obj, obj2);
        }
    }

    @Override // org.slf4j.c
    public void d(String str, Throwable th2) {
        if (O()) {
            v0(org.slf4j.event.e.DEBUG, null, str, th2);
        }
    }

    @Override // org.slf4j.c
    public void d0(org.slf4j.h hVar, String str, Object obj) {
        if (o0(hVar)) {
            w0(org.slf4j.event.e.INFO, hVar, str, obj);
        }
    }

    @Override // org.slf4j.c
    public void e(String str, Object... objArr) {
        if (O()) {
            t0(org.slf4j.event.e.DEBUG, null, str, objArr);
        }
    }

    @Override // org.slf4j.c
    public void e0(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        if (k0(hVar)) {
            s0(org.slf4j.event.e.ERROR, hVar, str, obj, obj2);
        }
    }

    @Override // org.slf4j.c
    public void f(String str, Object... objArr) {
        if (R()) {
            t0(org.slf4j.event.e.TRACE, null, str, objArr);
        }
    }

    @Override // org.slf4j.c
    public void g(String str) {
        if (O()) {
            int i10 = 2 | 0;
            v0(org.slf4j.event.e.DEBUG, null, str, null);
        }
    }

    @Override // org.slf4j.c
    public void g0(org.slf4j.h hVar, String str, Object obj) {
        if (X(hVar)) {
            w0(org.slf4j.event.e.DEBUG, hVar, str, obj);
        }
    }

    @Override // org.slf4j.c
    public String getName() {
        return this.f339617a;
    }

    @Override // org.slf4j.c
    public void h(String str, Object... objArr) {
        if (l()) {
            t0(org.slf4j.event.e.INFO, null, str, objArr);
        }
    }

    @Override // org.slf4j.c
    public void i(String str, Object obj, Object obj2) {
        if (O()) {
            s0(org.slf4j.event.e.DEBUG, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.c
    public void j(String str) {
        if (z()) {
            v0(org.slf4j.event.e.ERROR, null, str, null);
        }
    }

    @Override // org.slf4j.c
    public void j0(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        if (X(hVar)) {
            s0(org.slf4j.event.e.DEBUG, hVar, str, obj, obj2);
        }
    }

    @Override // org.slf4j.c
    public void k(String str, Object obj, Object obj2) {
        if (R()) {
            s0(org.slf4j.event.e.TRACE, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.c
    public void l0(org.slf4j.h hVar, String str, Throwable th2) {
        if (X(hVar)) {
            v0(org.slf4j.event.e.DEBUG, hVar, str, th2);
        }
    }

    @Override // org.slf4j.c
    public void m(String str, Object obj, Object obj2) {
        if (M()) {
            s0(org.slf4j.event.e.WARN, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.c
    public void m0(String str) {
        if (M()) {
            v0(org.slf4j.event.e.WARN, null, str, null);
        }
    }

    @Override // org.slf4j.c
    public void n0(org.slf4j.h hVar, String str, Throwable th2) {
        if (k0(hVar)) {
            v0(org.slf4j.event.e.ERROR, hVar, str, th2);
        }
    }

    @Override // org.slf4j.c
    public void o(String str, Throwable th2) {
        if (l()) {
            v0(org.slf4j.event.e.INFO, null, str, th2);
        }
    }

    @Override // org.slf4j.c
    public void p(String str, Throwable th2) {
        if (M()) {
            v0(org.slf4j.event.e.WARN, null, str, th2);
        }
    }

    @Override // org.slf4j.c
    public void p0(org.slf4j.h hVar, String str, Object obj) {
        if (k0(hVar)) {
            w0(org.slf4j.event.e.ERROR, hVar, str, obj);
        }
    }

    @Override // org.slf4j.c
    public void q(String str, Throwable th2) {
        if (R()) {
            v0(org.slf4j.event.e.TRACE, null, str, th2);
        }
    }

    @Override // org.slf4j.c
    public void q0(org.slf4j.h hVar, String str) {
        if (o0(hVar)) {
            int i10 = 6 << 0;
            v0(org.slf4j.event.e.INFO, hVar, str, null);
        }
    }

    @Override // org.slf4j.c
    public void r(org.slf4j.h hVar, String str) {
        if (k0(hVar)) {
            v0(org.slf4j.event.e.ERROR, hVar, str, null);
        }
    }

    protected abstract String r0();

    protected Object readResolve() throws ObjectStreamException {
        return org.slf4j.e.l(getName());
    }

    @Override // org.slf4j.c
    public void s(String str, Object obj, Object obj2) {
        if (l()) {
            s0(org.slf4j.event.e.INFO, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.c
    public void t(org.slf4j.h hVar, String str, Object obj) {
        if (V(hVar)) {
            w0(org.slf4j.event.e.WARN, hVar, str, obj);
        }
    }

    @Override // org.slf4j.c
    public void u(org.slf4j.h hVar, String str, Object obj, Object obj2) {
        if (o0(hVar)) {
            s0(org.slf4j.event.e.INFO, hVar, str, obj, obj2);
        }
    }

    protected abstract void u0(org.slf4j.event.e eVar, org.slf4j.h hVar, String str, Object[] objArr, Throwable th2);

    @Override // org.slf4j.c
    public void v(String str, Object obj) {
        if (l()) {
            w0(org.slf4j.event.e.INFO, null, str, obj);
        }
    }

    @Override // org.slf4j.c
    public void w(String str, Object obj) {
        if (M()) {
            w0(org.slf4j.event.e.WARN, null, str, obj);
        }
    }

    @Override // org.slf4j.c
    public void x(org.slf4j.h hVar, String str, Object obj) {
        if (i0(hVar)) {
            w0(org.slf4j.event.e.TRACE, hVar, str, obj);
        }
    }

    @Override // org.slf4j.c
    public void y(org.slf4j.h hVar, String str) {
        if (X(hVar)) {
            v0(org.slf4j.event.e.DEBUG, hVar, str, null);
        }
    }
}
