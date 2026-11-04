package com.nineoldandroids.view;

import android.view.View;
import android.view.animation.Interpolator;
import com.nineoldandroids.animation.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
class e extends com.nineoldandroids.view.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f131360o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f131361p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f131362q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f131363r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f131364s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f131365t = 16;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f131366u = 32;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f131367v = 64;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f131368w = 128;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f131369x = 256;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f131370y = 512;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f131371z = 511;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.nineoldandroids.view.animation.a f131372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<View> f131373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f131374d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Interpolator f131378h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f131375e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f131376f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f131377g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f131379i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.nineoldandroids.animation.a.InterfaceC1443a f131380j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f131381k = new b(this, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ArrayList<c> f131382l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Runnable f131383m = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private HashMap<com.nineoldandroids.animation.a, d> f131384n = new HashMap<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.O();
        }
    }

    private class b implements com.nineoldandroids.animation.a.InterfaceC1443a, q.g {
        private b() {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void a(com.nineoldandroids.animation.a aVar) {
            if (e.this.f131380j != null) {
                e.this.f131380j.a(aVar);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void b(com.nineoldandroids.animation.a aVar) {
            if (e.this.f131380j != null) {
                e.this.f131380j.b(aVar);
            }
            e.this.f131384n.remove(aVar);
            if (e.this.f131384n.isEmpty()) {
                e.this.f131380j = null;
            }
        }

        @Override // com.nineoldandroids.animation.q.g
        public void c(q qVar) {
            View view;
            float fL = qVar.L();
            d dVar = (d) e.this.f131384n.get(qVar);
            if ((dVar.f131390a & 511) != 0 && (view = (View) e.this.f131373c.get()) != null) {
                view.invalidate();
            }
            ArrayList<c> arrayList = dVar.f131391b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c cVar = arrayList.get(i10);
                    e.this.N(cVar.f131387a, cVar.f131388b + (cVar.f131389c * fL));
                }
            }
            View view2 = (View) e.this.f131373c.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void d(com.nineoldandroids.animation.a aVar) {
            if (e.this.f131380j != null) {
                e.this.f131380j.d(aVar);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void e(com.nineoldandroids.animation.a aVar) {
            if (e.this.f131380j != null) {
                e.this.f131380j.e(aVar);
            }
        }

        /* synthetic */ b(e eVar, a aVar) {
            this();
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f131388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f131389c;

        c(int i10, float f10, float f11) {
            this.f131387a = i10;
            this.f131388b = f10;
            this.f131389c = f11;
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<c> f131391b;

        d(int i10, ArrayList<c> arrayList) {
            this.f131390a = i10;
            this.f131391b = arrayList;
        }

        boolean a(int i10) {
            ArrayList<c> arrayList;
            if ((this.f131390a & i10) != 0 && (arrayList = this.f131391b) != null) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (this.f131391b.get(i11).f131387a == i10) {
                        this.f131391b.remove(i11);
                        this.f131390a = (~i10) & this.f131390a;
                        return true;
                    }
                }
            }
            return false;
        }
    }

    e(View view) {
        this.f131373c = new WeakReference<>(view);
        this.f131372b = com.nineoldandroids.view.animation.a.I(view);
    }

    private void J(int i10, float f10) {
        float fM = M(i10);
        L(i10, fM, f10 - fM);
    }

    private void K(int i10, float f10) {
        L(i10, M(i10), f10);
    }

    private void L(int i10, float f10, float f11) {
        com.nineoldandroids.animation.a next;
        if (this.f131384n.size() > 0) {
            Iterator<com.nineoldandroids.animation.a> it = this.f131384n.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                d dVar = this.f131384n.get(next);
                if (dVar.a(i10) && dVar.f131390a == 0) {
                    break;
                }
            }
            if (next != null) {
                next.cancel();
            }
        }
        this.f131382l.add(new c(i10, f10, f11));
        View view = this.f131373c.get();
        if (view != null) {
            view.removeCallbacks(this.f131383m);
            view.post(this.f131383m);
        }
    }

    private float M(int i10) {
        if (i10 == 1) {
            return this.f131372b.l();
        }
        if (i10 == 2) {
            return this.f131372b.n();
        }
        if (i10 == 4) {
            return this.f131372b.h();
        }
        if (i10 == 8) {
            return this.f131372b.i();
        }
        if (i10 == 16) {
            return this.f131372b.e();
        }
        if (i10 == 32) {
            return this.f131372b.f();
        }
        if (i10 == 64) {
            return this.f131372b.g();
        }
        if (i10 == 128) {
            return this.f131372b.o();
        }
        if (i10 == 256) {
            return this.f131372b.p();
        }
        if (i10 != 512) {
            return 0.0f;
        }
        return this.f131372b.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i10, float f10) {
        if (i10 == 1) {
            this.f131372b.D(f10);
            return;
        }
        if (i10 == 2) {
            this.f131372b.E(f10);
            return;
        }
        if (i10 == 4) {
            this.f131372b.z(f10);
            return;
        }
        if (i10 == 8) {
            this.f131372b.A(f10);
            return;
        }
        if (i10 == 16) {
            this.f131372b.v(f10);
            return;
        }
        if (i10 == 32) {
            this.f131372b.w(f10);
            return;
        }
        if (i10 == 64) {
            this.f131372b.x(f10);
            return;
        }
        if (i10 == 128) {
            this.f131372b.F(f10);
        } else if (i10 == 256) {
            this.f131372b.G(f10);
        } else {
            if (i10 != 512) {
                return;
            }
            this.f131372b.s(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        q qVarX = q.X(1.0f);
        ArrayList arrayList = (ArrayList) this.f131382l.clone();
        this.f131382l.clear();
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 |= ((c) arrayList.get(i11)).f131387a;
        }
        this.f131384n.put(qVarX, new d(i10, arrayList));
        qVarX.E(this.f131381k);
        qVarX.a(this.f131381k);
        if (this.f131377g) {
            qVarX.n(this.f131376f);
        }
        if (this.f131375e) {
            qVarX.k(this.f131374d);
        }
        if (this.f131379i) {
            qVarX.l(this.f131378h);
        }
        qVarX.r();
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b A(float f10) {
        K(128, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b B(float f10) {
        J(256, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b C(float f10) {
        K(256, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b a(float f10) {
        J(512, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b b(float f10) {
        K(512, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public void d() {
        if (this.f131384n.size() > 0) {
            Iterator it = ((HashMap) this.f131384n.clone()).keySet().iterator();
            while (it.hasNext()) {
                ((com.nineoldandroids.animation.a) it.next()).cancel();
            }
        }
        this.f131382l.clear();
        View view = this.f131373c.get();
        if (view != null) {
            view.removeCallbacks(this.f131383m);
        }
    }

    @Override // com.nineoldandroids.view.b
    public long e() {
        return this.f131375e ? this.f131374d : new q().d();
    }

    @Override // com.nineoldandroids.view.b
    public long f() {
        if (this.f131377g) {
            return this.f131376f;
        }
        return 0L;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b g(float f10) {
        J(16, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b h(float f10) {
        K(16, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b i(float f10) {
        J(32, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b j(float f10) {
        K(32, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b k(float f10) {
        J(64, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b l(float f10) {
        K(64, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b m(float f10) {
        J(4, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b n(float f10) {
        K(4, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b o(float f10) {
        J(8, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b p(float f10) {
        K(8, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b q(long j10) {
        if (j10 >= 0) {
            this.f131375e = true;
            this.f131374d = j10;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j10);
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b r(Interpolator interpolator) {
        this.f131379i = true;
        this.f131378h = interpolator;
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b s(com.nineoldandroids.animation.a.InterfaceC1443a interfaceC1443a) {
        this.f131380j = interfaceC1443a;
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b t(long j10) {
        if (j10 >= 0) {
            this.f131377g = true;
            this.f131376f = j10;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j10);
    }

    @Override // com.nineoldandroids.view.b
    public void u() {
        O();
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b v(float f10) {
        J(1, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b w(float f10) {
        K(1, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b x(float f10) {
        J(2, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b y(float f10) {
        K(2, f10);
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b z(float f10) {
        J(128, f10);
        return this;
    }
}
