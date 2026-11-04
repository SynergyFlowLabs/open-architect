package com.nineoldandroids.view;

import android.view.View;
import android.view.animation.Interpolator;
import com.nineoldandroids.animation.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
class c extends com.nineoldandroids.view.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f131325n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f131326o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f131327p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f131328q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f131329r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f131330s = 16;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f131331t = 32;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f131332u = 64;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f131333v = 128;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f131334w = 256;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f131335x = 512;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f131336y = 511;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<View> f131337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f131338c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Interpolator f131342g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f131339d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f131340e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f131341f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f131343h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.nineoldandroids.animation.a.InterfaceC1443a f131344i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f131345j = new b(this, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ArrayList<C1447c> f131346k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Runnable f131347l = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private HashMap<com.nineoldandroids.animation.a, d> f131348m = new HashMap<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.O();
        }
    }

    private class b implements com.nineoldandroids.animation.a.InterfaceC1443a, q.g {
        private b() {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void a(com.nineoldandroids.animation.a aVar) {
            if (c.this.f131344i != null) {
                c.this.f131344i.a(aVar);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void b(com.nineoldandroids.animation.a aVar) {
            if (c.this.f131344i != null) {
                c.this.f131344i.b(aVar);
            }
            c.this.f131348m.remove(aVar);
            if (c.this.f131348m.isEmpty()) {
                c.this.f131344i = null;
            }
        }

        @Override // com.nineoldandroids.animation.q.g
        public void c(q qVar) {
            View view;
            float fL = qVar.L();
            d dVar = (d) c.this.f131348m.get(qVar);
            if ((dVar.f131354a & 511) != 0 && (view = (View) c.this.f131337b.get()) != null) {
                view.invalidate();
            }
            ArrayList<C1447c> arrayList = dVar.f131355b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C1447c c1447c = arrayList.get(i10);
                    c.this.N(c1447c.f131351a, c1447c.f131352b + (c1447c.f131353c * fL));
                }
            }
            View view2 = (View) c.this.f131337b.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void d(com.nineoldandroids.animation.a aVar) {
            if (c.this.f131344i != null) {
                c.this.f131344i.d(aVar);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void e(com.nineoldandroids.animation.a aVar) {
            if (c.this.f131344i != null) {
                c.this.f131344i.e(aVar);
            }
        }

        /* synthetic */ b(c cVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.nineoldandroids.view.c$c, reason: collision with other inner class name */
    private static class C1447c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f131352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f131353c;

        C1447c(int i10, float f10, float f11) {
            this.f131351a = i10;
            this.f131352b = f10;
            this.f131353c = f11;
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<C1447c> f131355b;

        d(int i10, ArrayList<C1447c> arrayList) {
            this.f131354a = i10;
            this.f131355b = arrayList;
        }

        boolean a(int i10) {
            ArrayList<C1447c> arrayList;
            if ((this.f131354a & i10) != 0 && (arrayList = this.f131355b) != null) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (this.f131355b.get(i11).f131351a == i10) {
                        this.f131355b.remove(i11);
                        this.f131354a = (~i10) & this.f131354a;
                        return true;
                    }
                }
            }
            return false;
        }
    }

    c(View view) {
        this.f131337b = new WeakReference<>(view);
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
        if (this.f131348m.size() > 0) {
            Iterator<com.nineoldandroids.animation.a> it = this.f131348m.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                d dVar = this.f131348m.get(next);
                if (dVar.a(i10) && dVar.f131354a == 0) {
                    break;
                }
            }
            if (next != null) {
                next.cancel();
            }
        }
        this.f131346k.add(new C1447c(i10, f10, f11));
        View view = this.f131337b.get();
        if (view != null) {
            view.removeCallbacks(this.f131347l);
            view.post(this.f131347l);
        }
    }

    private float M(int i10) {
        View view = this.f131337b.get();
        if (view != null) {
            if (i10 == 1) {
                return view.getTranslationX();
            }
            if (i10 == 2) {
                return view.getTranslationY();
            }
            if (i10 == 4) {
                return view.getScaleX();
            }
            if (i10 == 8) {
                return view.getScaleY();
            }
            if (i10 == 16) {
                return view.getRotation();
            }
            if (i10 == 32) {
                return view.getRotationX();
            }
            if (i10 == 64) {
                return view.getRotationY();
            }
            if (i10 == 128) {
                return view.getX();
            }
            if (i10 == 256) {
                return view.getY();
            }
            if (i10 == 512) {
                return view.getAlpha();
            }
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i10, float f10) {
        View view = this.f131337b.get();
        if (view != null) {
            if (i10 == 1) {
                view.setTranslationX(f10);
                return;
            }
            if (i10 == 2) {
                view.setTranslationY(f10);
                return;
            }
            if (i10 == 4) {
                view.setScaleX(f10);
                return;
            }
            if (i10 == 8) {
                view.setScaleY(f10);
                return;
            }
            if (i10 == 16) {
                view.setRotation(f10);
                return;
            }
            if (i10 == 32) {
                view.setRotationX(f10);
                return;
            }
            if (i10 == 64) {
                view.setRotationY(f10);
                return;
            }
            if (i10 == 128) {
                view.setX(f10);
            } else if (i10 == 256) {
                view.setY(f10);
            } else {
                if (i10 != 512) {
                    return;
                }
                view.setAlpha(f10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        q qVarX = q.X(1.0f);
        ArrayList arrayList = (ArrayList) this.f131346k.clone();
        this.f131346k.clear();
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 |= ((C1447c) arrayList.get(i11)).f131351a;
        }
        this.f131348m.put(qVarX, new d(i10, arrayList));
        qVarX.E(this.f131345j);
        qVarX.a(this.f131345j);
        if (this.f131341f) {
            qVarX.n(this.f131340e);
        }
        if (this.f131339d) {
            qVarX.k(this.f131338c);
        }
        if (this.f131343h) {
            qVarX.l(this.f131342g);
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
        if (this.f131348m.size() > 0) {
            Iterator it = ((HashMap) this.f131348m.clone()).keySet().iterator();
            while (it.hasNext()) {
                ((com.nineoldandroids.animation.a) it.next()).cancel();
            }
        }
        this.f131346k.clear();
        View view = this.f131337b.get();
        if (view != null) {
            view.removeCallbacks(this.f131347l);
        }
    }

    @Override // com.nineoldandroids.view.b
    public long e() {
        return this.f131339d ? this.f131338c : new q().d();
    }

    @Override // com.nineoldandroids.view.b
    public long f() {
        if (this.f131341f) {
            return this.f131340e;
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
            this.f131339d = true;
            this.f131338c = j10;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j10);
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b r(Interpolator interpolator) {
        this.f131343h = true;
        this.f131342g = interpolator;
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b s(com.nineoldandroids.animation.a.InterfaceC1443a interfaceC1443a) {
        this.f131344i = interfaceC1443a;
        return this;
    }

    @Override // com.nineoldandroids.view.b
    public com.nineoldandroids.view.b t(long j10) {
        if (j10 >= 0) {
            this.f131341f = true;
            this.f131340e = j10;
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
