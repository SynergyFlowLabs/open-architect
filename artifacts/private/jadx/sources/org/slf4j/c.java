package org.slf4j;

/* JADX INFO: loaded from: classes14.dex */
public interface c {
    public static final String Y2 = "ROOT";

    void A(h hVar, String str);

    void B(h hVar, String str, Throwable th2);

    void C(String str, Object obj, Object obj2);

    void D(String str, Object obj);

    void E(h hVar, String str, Object obj, Object obj2);

    void F(String str, Object obj);

    void G(h hVar, String str, Object... objArr);

    @org.slf4j.helpers.e
    default org.slf4j.spi.f H() {
        return O() ? n(org.slf4j.event.e.DEBUG) : org.slf4j.spi.i.b();
    }

    void I(String str);

    void J(String str);

    @org.slf4j.helpers.e
    default org.slf4j.spi.f K() {
        return l() ? n(org.slf4j.event.e.INFO) : org.slf4j.spi.i.b();
    }

    void L(h hVar, String str, Object... objArr);

    boolean M();

    @org.slf4j.helpers.e
    default org.slf4j.spi.f N() {
        return M() ? n(org.slf4j.event.e.WARN) : org.slf4j.spi.i.b();
    }

    boolean O();

    void P(h hVar, String str, Object... objArr);

    void Q(h hVar, String str, Object... objArr);

    boolean R();

    @org.slf4j.helpers.e
    default org.slf4j.spi.f S(org.slf4j.event.e eVar) {
        return T(eVar) ? n(eVar) : org.slf4j.spi.i.b();
    }

    default boolean T(org.slf4j.event.e eVar) {
        int iN = eVar.n();
        if (iN == 0) {
            return R();
        }
        if (iN == 10) {
            return O();
        }
        if (iN == 20) {
            return l();
        }
        if (iN == 30) {
            return M();
        }
        if (iN == 40) {
            return z();
        }
        throw new IllegalArgumentException("Level [" + eVar + "] not recognized.");
    }

    void U(h hVar, String str, Object... objArr);

    boolean V(h hVar);

    @org.slf4j.helpers.e
    default org.slf4j.spi.f W() {
        return z() ? n(org.slf4j.event.e.ERROR) : org.slf4j.spi.i.b();
    }

    boolean X(h hVar);

    void Y(h hVar, String str);

    void Z(h hVar, String str, Throwable th2);

    void a(String str, Object... objArr);

    void a0(h hVar, String str, Throwable th2);

    void b(String str, Object... objArr);

    void b0(String str, Object obj);

    void c(String str, Throwable th2);

    void c0(h hVar, String str, Object obj, Object obj2);

    void d(String str, Throwable th2);

    void d0(h hVar, String str, Object obj);

    void e(String str, Object... objArr);

    void e0(h hVar, String str, Object obj, Object obj2);

    void f(String str, Object... objArr);

    void g(String str);

    void g0(h hVar, String str, Object obj);

    String getName();

    void h(String str, Object... objArr);

    @org.slf4j.helpers.e
    default org.slf4j.spi.f h0() {
        return R() ? n(org.slf4j.event.e.TRACE) : org.slf4j.spi.i.b();
    }

    void i(String str, Object obj, Object obj2);

    boolean i0(h hVar);

    void j(String str);

    void j0(h hVar, String str, Object obj, Object obj2);

    void k(String str, Object obj, Object obj2);

    boolean k0(h hVar);

    boolean l();

    void l0(h hVar, String str, Throwable th2);

    void m(String str, Object obj, Object obj2);

    void m0(String str);

    default org.slf4j.spi.f n(org.slf4j.event.e eVar) {
        return new org.slf4j.spi.b(this, eVar);
    }

    void n0(h hVar, String str, Throwable th2);

    void o(String str, Throwable th2);

    boolean o0(h hVar);

    void p(String str, Throwable th2);

    void p0(h hVar, String str, Object obj);

    void q(String str, Throwable th2);

    void q0(h hVar, String str);

    void r(h hVar, String str);

    void s(String str, Object obj, Object obj2);

    void t(h hVar, String str, Object obj);

    void u(h hVar, String str, Object obj, Object obj2);

    void v(String str, Object obj);

    void w(String str, Object obj);

    void x(h hVar, String str, Object obj);

    void y(h hVar, String str);

    boolean z();
}
