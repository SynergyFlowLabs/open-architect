package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements View.OnTouchListener {
    private static final int H1 = 1;
    public static final float X = 0.0f;
    public static final int Y = 0;
    public static final int Z = 1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int f49078g3 = 315;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int f49079h3 = 1575;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final float f49080i3 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final float f49081j3 = 0.2f;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final float f49082k3 = 1.0f;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final int f49083l3 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final int f49084m3 = 500;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final int f49085n3 = 500;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f49086p0 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f49087p1 = 0;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f49088p2 = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final float f49089v = 0.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f49090w = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f49093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f49094d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f49097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f49098h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f49102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f49103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f49104n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f49105o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f49106s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f49107t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0419a f49091a = new C0419a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Interpolator f49092b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f49095e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f49096f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f49099i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f49100j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f49101k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0419a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f49108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f49109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f49110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f49111d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f49117j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f49118k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f49112e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f49116i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f49113f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f49114g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f49115h = 0;

        C0419a() {
        }

        private float e(long j10) {
            long j11 = this.f49112e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f49116i;
            if (j12 >= 0 && j10 >= j12) {
                float f10 = this.f49117j;
                return (1.0f - f10) + (f10 * a.e((j10 - j12) / this.f49118k, 0.0f, 1.0f));
            }
            return a.e((j10 - j11) / this.f49108a, 0.0f, 1.0f) * 0.5f;
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f49113f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f49113f;
            this.f49113f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f49114g = (int) (this.f49110c * f10);
            this.f49115h = (int) (f10 * this.f49111d);
        }

        public int b() {
            return this.f49114g;
        }

        public int c() {
            return this.f49115h;
        }

        public int d() {
            float f10 = this.f49110c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f49111d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f49116i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f49116i + ((long) this.f49118k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f49118k = a.f((int) (jCurrentAnimationTimeMillis - this.f49112e), 0, this.f49109b);
            this.f49117j = e(jCurrentAnimationTimeMillis);
            this.f49116i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f49109b = i10;
        }

        public void k(int i10) {
            this.f49108a = i10;
        }

        public void l(float f10, float f11) {
            this.f49110c = f10;
            this.f49111d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f49112e = jCurrentAnimationTimeMillis;
            this.f49116i = -1L;
            this.f49113f = jCurrentAnimationTimeMillis;
            this.f49117j = 0.5f;
            this.f49114g = 0;
            this.f49115h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f49105o) {
                if (aVar.f49103m) {
                    aVar.f49103m = false;
                    aVar.f49091a.m();
                }
                C0419a c0419a = a.this.f49091a;
                if (!c0419a.h() && a.this.x()) {
                    a aVar2 = a.this;
                    if (aVar2.f49104n) {
                        aVar2.f49104n = false;
                        aVar2.c();
                    }
                    c0419a.a();
                    a.this.l(c0419a.b(), c0419a.c());
                    u1.u1(a.this.f49093c, this);
                    return;
                }
                a.this.f49105o = false;
            }
        }
    }

    public a(@NonNull View view) {
        this.f49093c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        r(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        s(f12, f12);
        n(1);
        q(Float.MAX_VALUE, Float.MAX_VALUE);
        v(0.2f, 0.2f);
        w(1.0f, 1.0f);
        m(f49083l3);
        u(500);
        t(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f49095e[i10], f11, this.f49096f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f49099i[i10];
        float f14 = this.f49100j[i10];
        float f15 = this.f49101k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        if (i10 > i12) {
            return i12;
        }
        return i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f49097g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f49105o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f49092b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f49092b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void k() {
        if (this.f49103m) {
            this.f49105o = false;
        } else {
            this.f49091a.i();
        }
    }

    private void y() {
        int i10;
        if (this.f49094d == null) {
            this.f49094d = new b();
        }
        this.f49105o = true;
        this.f49103m = true;
        if (this.f49102l || (i10 = this.f49098h) <= 0) {
            this.f49094d.run();
        } else {
            u1.v1(this.f49093c, this.f49094d, i10);
        }
        this.f49102l = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i10 = 6 >> 0;
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f49093c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public boolean i() {
        return this.f49106s;
    }

    public boolean j() {
        return this.f49107t;
    }

    public abstract void l(int i10, int i11);

    @NonNull
    public a m(int i10) {
        this.f49098h = i10;
        return this;
    }

    @NonNull
    public a n(int i10) {
        this.f49097g = i10;
        return this;
    }

    public a o(boolean z10) {
        if (this.f49106s && !z10) {
            k();
        }
        this.f49106s = z10;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0018  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f49106s) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                k();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    k();
                }
            }
            return !this.f49107t && this.f49105o;
        }
        this.f49104n = true;
        this.f49102l = false;
        this.f49091a.l(d(0, motionEvent.getX(), view.getWidth(), this.f49093c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f49093c.getHeight()));
        if (!this.f49105o && x()) {
            y();
        }
        if (this.f49107t) {
        }
    }

    public a p(boolean z10) {
        this.f49107t = z10;
        return this;
    }

    @NonNull
    public a q(float f10, float f11) {
        float[] fArr = this.f49096f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    @NonNull
    public a r(float f10, float f11) {
        float[] fArr = this.f49101k;
        int i10 = 3 << 0;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    @NonNull
    public a s(float f10, float f11) {
        float[] fArr = this.f49100j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    @NonNull
    public a t(int i10) {
        this.f49091a.j(i10);
        return this;
    }

    @NonNull
    public a u(int i10) {
        this.f49091a.k(i10);
        return this;
    }

    @NonNull
    public a v(float f10, float f11) {
        float[] fArr = this.f49095e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    @NonNull
    public a w(float f10, float f11) {
        float[] fArr = this.f49099i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean x() {
        C0419a c0419a = this.f49091a;
        int iF = c0419a.f();
        int iD = c0419a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }
}
