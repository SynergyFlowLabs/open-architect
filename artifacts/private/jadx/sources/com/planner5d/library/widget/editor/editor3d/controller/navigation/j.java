package com.planner5d.library.widget.editor.editor3d.controller.navigation;

import android.content.Context;
import android.os.Bundle;
import com.planner5d.library.engine.util.math.n;
import com.planner5d.library.math.m;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.y1;

/* JADX INFO: loaded from: classes12.dex */
public class j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final com.planner5d.library.math.k f255543l = new com.planner5d.library.math.k(1.0f, 0.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final com.planner5d.library.math.k f255544m = new com.planner5d.library.math.k(0.0f, 1.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final m f255545n = new m(1.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final m f255546o = new m(0.0f, 180.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f255547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f255548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f255549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f255550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f255551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.math.k f255552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.math.k f255553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.math.k f255554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f255555i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f255556j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final m f255557k;

    public j(Context context) {
        this.f255547a = new m();
        this.f255548b = new m();
        this.f255549c = new m();
        this.f255550d = new m();
        this.f255551e = new m();
        this.f255552f = new com.planner5d.library.math.k();
        this.f255553g = new com.planner5d.library.math.k();
        this.f255554h = new com.planner5d.library.math.k();
        this.f255555i = new Object();
        float fP = com.planner5d.library.widget.editor.editor3d.scene3d.j.p(context);
        this.f255557k = new m(-500.0f, 707.0f, 500.0f).v0(fP).R(f255546o);
        int i10 = 2 ^ 0;
        this.f255556j = new float[]{30.0f * fP, fP * 2500.0f};
        s();
    }

    private m d(com.planner5d.library.math.k kVar, m mVar) {
        double d10 = -Math.sin(kVar.f180480a);
        return mVar.y0((float) (Math.cos(kVar.f180481b) * d10), (float) (-Math.cos(kVar.f180480a)), (float) (d10 * Math.sin(kVar.f180481b)));
    }

    private float g(float f10) {
        double d10 = f10;
        float[] fArr = this.f255556j;
        return (float) n(d10, fArr[0], fArr[1]);
    }

    private double n(double d10, double d11, double d12) {
        return Math.max(d11, Math.min(d12, d10));
    }

    void A(float f10) {
        synchronized (this.f255555i) {
            try {
                c(this.f255550d);
                this.f255547a.A0(this.f255548b).H0(this.f255550d.v0(g(f10)));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void B(m mVar) {
        synchronized (this.f255555i) {
            try {
                float f10 = f();
                c(this.f255549c);
                this.f255548b.A0(this.f255547a.A0(mVar)).R(this.f255549c.v0(f10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void C(m mVar, m mVar2) {
        synchronized (this.f255555i) {
            try {
                this.f255547a.A0(mVar);
                this.f255548b.A0(mVar2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void D(float f10, float f11) {
        synchronized (this.f255555i) {
            this.f255550d.A0(this.f255548b).f180482a = f10;
            m mVar = this.f255550d;
            mVar.f180484c = f11;
            E(mVar);
        }
    }

    void E(m mVar) {
        synchronized (this.f255555i) {
            float f10 = f();
            c(this.f255549c);
            mVar.f180482a = (float) n(mVar.f180482a, 0.0d, 8000.0d);
            mVar.f180484c = (float) n(mVar.f180484c, 0.0d, 8000.0d);
            this.f255547a.A0(this.f255548b.A0(mVar)).H0(this.f255549c.v0(f10));
        }
    }

    void F(com.planner5d.library.engine.g gVar, float f10) {
        synchronized (this.f255555i) {
            try {
                c(gVar.Q1());
                gVar.getPosition().A0(this.f255548b).H0(gVar.Q1().v0(f()));
                gVar.getPosition().f180483b = f10 + Math.max(25.0f, gVar.getPosition().f180483b);
                gVar.Q1().u0();
                gc.d.f(gVar.getPosition());
                m(gVar.z());
                gVar.L1();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void G(float f10) {
        synchronized (this.f255555i) {
            try {
                m mVar = this.f255548b;
                this.f255547a.f180483b = f10;
                mVar.f180483b = f10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Bundle H() {
        Bundle bundleA;
        synchronized (this.f255555i) {
            com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
            r rVar = r.data;
            m mVar = this.f255547a;
            float f10 = mVar.f180482a;
            float f11 = mVar.f180483b;
            float f12 = mVar.f180484c;
            m mVar2 = this.f255548b;
            bundleA = iVar.o(rVar, new float[]{f10, f11, f12, mVar2.f180482a, mVar2.f180483b, mVar2.f180484c}).a();
        }
        return bundleA;
    }

    public vd.a I() {
        return new vd.a(this.f255547a, this.f255548b, 0.0f);
    }

    void a() {
        k(this.f255552f);
        com.planner5d.library.math.k kVar = this.f255552f;
        kVar.f180480a = (float) com.planner5d.library.engine.util.math.e.d(kVar.f180480a, Math.toRadians(1.0d), Math.toRadians(130.0d));
        z(this.f255552f);
    }

    public void b(Bundle bundle) {
        float[] fArrK = new com.planner5d.library.services.utility.j(bundle).k(r.data, null);
        if (fArrK == null || fArrK.length != 6) {
            return;
        }
        synchronized (this.f255555i) {
            this.f255547a.y0(fArrK[0], fArrK[1], fArrK[2]);
            this.f255548b.y0(fArrK[3], fArrK[4], fArrK[5]);
        }
    }

    m c(m mVar) {
        m mVarU0;
        synchronized (this.f255555i) {
            try {
                mVarU0 = mVar.A0(this.f255548b).H0(this.f255547a).u0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVarU0;
    }

    com.planner5d.library.math.k e(com.planner5d.library.math.k kVar) {
        com.planner5d.library.math.k kVarM;
        synchronized (this.f255555i) {
            try {
                c(this.f255550d);
                if (this.f255550d.n0(y1.f229858c) && this.f255550d.n0(f255545n)) {
                    m(this.f255550d);
                }
                m mVar = this.f255550d;
                kVarM = kVar.U(mVar.f180482a, mVar.f180484c).M();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVarM;
    }

    float f() {
        float fG;
        synchronized (this.f255555i) {
            fG = g(this.f255549c.A0(this.f255548b).H0(this.f255547a).t());
        }
        return fG;
    }

    m h(m mVar) {
        return mVar.A0(this.f255548b).H0(c(this.f255550d).v0(f()));
    }

    void i(m mVar, m mVar2) {
        synchronized (this.f255555i) {
            try {
                mVar.A0(this.f255547a);
                mVar2.A0(this.f255548b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    m j(m mVar) {
        m mVarU0;
        synchronized (this.f255555i) {
            mVarU0 = m(mVar).V(c(this.f255550d)).u0();
        }
        return mVarU0;
    }

    public com.planner5d.library.math.k k(com.planner5d.library.math.k kVar) {
        synchronized (this.f255555i) {
            try {
                c(this.f255550d);
                com.planner5d.library.math.k kVar2 = this.f255553g;
                float f10 = this.f255550d.f180483b;
                float f11 = kVar2.U((float) Math.sqrt(1.0f - (f10 * f10)), -this.f255550d.f180483b).f(f255544m);
                com.planner5d.library.math.k kVar3 = this.f255553g;
                m mVar = this.f255550d;
                kVar.U(f11, -kVar3.U(-mVar.f180482a, -mVar.f180484c).f(f255543l));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    m l(m mVar) {
        m mVarA0;
        synchronized (this.f255555i) {
            try {
                mVarA0 = mVar.A0(this.f255548b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVarA0;
    }

    m m(m mVar) {
        m mVarU0;
        synchronized (this.f255555i) {
            try {
                c(this.f255549c);
                m mVarA0 = mVar.A0(this.f255549c);
                m mVar2 = y1.f229859d;
                if (mVarA0.V(mVar2).isZero()) {
                    this.f255549c.f180482a += 1.0E-4f;
                }
                mVarU0 = mVar.A0(this.f255549c).V(mVar2).u0().V(this.f255549c).u0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVarU0;
    }

    void o(double d10, double d11) {
        synchronized (this.f255555i) {
            e(this.f255552f);
            this.f255551e.A0(this.f255547a);
            this.f255551e.f180482a += this.f255554h.V(this.f255552f).R(-((float) d11)).f180480a;
            m mVar = this.f255551e;
            float f10 = mVar.f180484c;
            com.planner5d.library.math.k kVar = this.f255554h;
            mVar.f180484c = f10 + kVar.f180481b;
            mVar.f180482a += kVar.V(this.f255552f).O(-1).R((float) d10).f180480a;
            m mVar2 = this.f255551e;
            mVar2.f180484c += this.f255554h.f180481b;
            B(mVar2);
        }
    }

    void p(double d10) {
        synchronized (this.f255555i) {
            m mVar = this.f255547a;
            mVar.f180483b = (float) Math.max(0.0d, ((double) mVar.f180483b) * d10);
            c(this.f255549c).v0(g(f() * ((float) d10)));
            this.f255547a.A0(this.f255548b).H0(this.f255549c);
        }
    }

    void q(double d10) {
        synchronized (this.f255555i) {
            m mVar = this.f255547a;
            mVar.f180483b = (float) Math.max(0.0d, ((double) mVar.f180483b) + d10);
            c(this.f255549c).v0(f());
            this.f255547a.A0(this.f255548b).H0(this.f255549c);
        }
    }

    void r(double d10, double d11) {
        float f10;
        synchronized (this.f255555i) {
            try {
                k(this.f255552f);
                l(this.f255550d);
                m mVar = this.f255550d;
                float f11 = mVar.f180483b;
                if (f11 > 300.0f) {
                    f11 -= f255546o.f180483b;
                    f10 = 10.0f;
                } else {
                    f10 = 200.0f;
                }
                double d12 = 1.0f + (f11 / f10);
                mVar.f180482a = (float) (((double) mVar.f180482a) + (((Math.cos(this.f255552f.f180481b) * d11) - (Math.sin(this.f255552f.f180481b) * d10)) * d12));
                m mVar2 = this.f255550d;
                mVar2.f180484c = (float) (((double) mVar2.f180484c) + (((d11 * Math.sin(this.f255552f.f180481b)) + (d10 * Math.cos(this.f255552f.f180481b))) * d12));
                E(this.f255550d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s() {
        synchronized (this.f255555i) {
            this.f255548b.A0(f255546o);
            this.f255547a.A0(this.f255557k);
        }
    }

    void t(float f10, m mVar) {
        synchronized (this.f255555i) {
            try {
                c(this.f255550d).v0(f());
                n.f(this.f255550d, mVar, f10);
                this.f255548b.A0(this.f255547a).R(this.f255550d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void u(float f10, m mVar) {
        synchronized (this.f255555i) {
            c(this.f255550d).v0(f());
            n.f(this.f255550d, mVar, f10);
            this.f255547a.A0(this.f255548b).H0(this.f255550d);
        }
    }

    void v(com.planner5d.library.math.k kVar) {
        w(kVar, null, null);
    }

    void w(com.planner5d.library.math.k kVar, Integer num, Integer num2) {
        k(this.f255552f).a(kVar.f180481b, kVar.f180480a);
        if (this.f255552f.f180480a > Math.toRadians(130.0d) || this.f255552f.f180480a < Math.toRadians(1.0d) || ((num2 != null && this.f255552f.f180480a > Math.toRadians(num2.intValue())) || (num != null && this.f255552f.f180480a < Math.toRadians(num.intValue())))) {
            this.f255552f.f180480a -= kVar.f180481b;
        }
        z(this.f255552f);
    }

    void x(j jVar) {
        C(jVar.f255547a, jVar.f255548b);
    }

    void y(m mVar) {
        synchronized (this.f255555i) {
            this.f255547a.A0(this.f255548b).H0(this.f255549c.A0(mVar).u0().v0(f()));
        }
    }

    void z(com.planner5d.library.math.k kVar) {
        y(d(kVar, this.f255550d));
    }

    public j(j jVar) {
        this(jVar, jVar.f255547a, jVar.f255548b);
    }

    public j(j jVar, m mVar, m mVar2) {
        m mVar3 = new m();
        this.f255547a = mVar3;
        m mVar4 = new m();
        this.f255548b = mVar4;
        this.f255549c = new m();
        this.f255550d = new m();
        this.f255551e = new m();
        this.f255552f = new com.planner5d.library.math.k();
        this.f255553g = new com.planner5d.library.math.k();
        this.f255554h = new com.planner5d.library.math.k();
        this.f255555i = new Object();
        mVar3.A0(mVar);
        mVar4.A0(mVar2);
        this.f255557k = jVar.f255557k;
        this.f255556j = jVar.f255556j;
    }
}
