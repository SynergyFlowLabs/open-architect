package com.airbnb.lottie.utils;

import android.view.Choreographer;
import androidx.annotation.l0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.x;

/* JADX INFO: loaded from: classes3.dex */
public class g extends a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.k f88850l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f88842d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f88843e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f88844f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f88845g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f88846h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f88847i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f88848j = -2.1474836E9f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f88849k = 2.1474836E9f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l1
    protected boolean f88851m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f88852n = false;

    private void G() {
        if (this.f88850l == null) {
            return;
        }
        float f10 = this.f88846h;
        if (f10 < this.f88848j || f10 > this.f88849k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f88848j), Float.valueOf(this.f88849k), Float.valueOf(this.f88846h)));
        }
    }

    private float l() {
        com.airbnb.lottie.k kVar = this.f88850l;
        if (kVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / kVar.i()) / Math.abs(this.f88842d);
    }

    private boolean q() {
        return p() < 0.0f;
    }

    public void A(float f10) {
        if (this.f88845g == f10) {
            return;
        }
        float fC = i.c(f10, o(), n());
        this.f88845g = fC;
        if (this.f88852n) {
            fC = (float) Math.floor(fC);
        }
        this.f88846h = fC;
        this.f88844f = 0L;
        g();
    }

    public void B(float f10) {
        C(this.f88848j, f10);
    }

    public void C(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        com.airbnb.lottie.k kVar = this.f88850l;
        float fR = kVar == null ? -3.4028235E38f : kVar.r();
        com.airbnb.lottie.k kVar2 = this.f88850l;
        float f12 = kVar2 == null ? Float.MAX_VALUE : kVar2.f();
        float fC = i.c(f10, fR, f12);
        float fC2 = i.c(f11, fR, f12);
        if (fC == this.f88848j && fC2 == this.f88849k) {
            return;
        }
        this.f88848j = fC;
        this.f88849k = fC2;
        A((int) i.c(this.f88846h, fC, fC2));
    }

    public void D(int i10) {
        C(i10, (int) this.f88849k);
    }

    public void E(float f10) {
        this.f88842d = f10;
    }

    public void F(boolean z10) {
        this.f88852n = z10;
    }

    @Override // com.airbnb.lottie.utils.a
    void a() {
        super.a();
        b(q());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @l0
    public void cancel() {
        a();
        u();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        t();
        if (this.f88850l == null || !isRunning()) {
            return;
        }
        com.airbnb.lottie.f.b("LottieValueAnimator#doFrame");
        long j11 = this.f88844f;
        long j12 = 0;
        if (j11 != 0) {
            j12 = j10 - j11;
        }
        float fL = j12 / l();
        float f10 = this.f88845g;
        if (q()) {
            fL = -fL;
        }
        float f11 = f10 + fL;
        boolean zE = i.e(f11, o(), n());
        float f12 = this.f88845g;
        float fC = i.c(f11, o(), n());
        this.f88845g = fC;
        if (this.f88852n) {
            fC = (float) Math.floor(fC);
        }
        this.f88846h = fC;
        this.f88844f = j10;
        if (!this.f88852n || this.f88845g != f12) {
            g();
        }
        if (!zE) {
            if (getRepeatCount() == -1 || this.f88847i < getRepeatCount()) {
                d();
                this.f88847i++;
                if (getRepeatMode() == 2) {
                    this.f88843e = !this.f88843e;
                    x();
                } else {
                    float fN = q() ? n() : o();
                    this.f88845g = fN;
                    this.f88846h = fN;
                }
                this.f88844f = j10;
            } else {
                float fO = this.f88842d < 0.0f ? o() : n();
                this.f88845g = fO;
                this.f88846h = fO;
                u();
                b(q());
            }
        }
        G();
        com.airbnb.lottie.f.c("LottieValueAnimator#doFrame");
    }

    @Override // android.animation.ValueAnimator
    @x(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        float fO;
        float fN;
        float fO2;
        if (this.f88850l == null) {
            return 0.0f;
        }
        if (q()) {
            fO = n() - this.f88846h;
            fN = n();
            fO2 = o();
        } else {
            fO = this.f88846h - o();
            fN = n();
            fO2 = o();
        }
        return fO / (fN - fO2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(j());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        com.airbnb.lottie.k kVar = this.f88850l;
        if (kVar == null) {
            return 0L;
        }
        return (long) kVar.d();
    }

    public void h() {
        this.f88850l = null;
        this.f88848j = -2.1474836E9f;
        this.f88849k = 2.1474836E9f;
    }

    @l0
    public void i() {
        u();
        b(q());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f88851m;
    }

    @x(from = 0.0d, to = 1.0d)
    public float j() {
        com.airbnb.lottie.k kVar = this.f88850l;
        if (kVar == null) {
            return 0.0f;
        }
        return (this.f88846h - kVar.r()) / (this.f88850l.f() - this.f88850l.r());
    }

    public float k() {
        return this.f88846h;
    }

    public float n() {
        com.airbnb.lottie.k kVar = this.f88850l;
        if (kVar == null) {
            return 0.0f;
        }
        float f10 = this.f88849k;
        if (f10 == 2.1474836E9f) {
            f10 = kVar.f();
        }
        return f10;
    }

    public float o() {
        com.airbnb.lottie.k kVar = this.f88850l;
        if (kVar == null) {
            return 0.0f;
        }
        float f10 = this.f88848j;
        return f10 == -2.1474836E9f ? kVar.r() : f10;
    }

    public float p() {
        return this.f88842d;
    }

    @l0
    public void r() {
        u();
        c();
    }

    @l0
    public void s() {
        this.f88851m = true;
        f(q());
        A((int) (q() ? n() : o()));
        this.f88844f = 0L;
        this.f88847i = 0;
        t();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f88843e) {
            return;
        }
        this.f88843e = false;
        x();
    }

    protected void t() {
        if (isRunning()) {
            v(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @l0
    protected void u() {
        v(true);
    }

    @l0
    protected void v(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f88851m = false;
        }
    }

    @l0
    public void w() {
        this.f88851m = true;
        t();
        this.f88844f = 0L;
        if (q() && k() == o()) {
            A(n());
        } else if (!q() && k() == n()) {
            A(o());
        }
        e();
    }

    public void x() {
        E(-p());
    }

    public void z(com.airbnb.lottie.k kVar) {
        boolean z10 = this.f88850l == null;
        this.f88850l = kVar;
        if (z10) {
            C(Math.max(this.f88848j, kVar.r()), Math.min(this.f88849k, kVar.f()));
        } else {
            C((int) kVar.r(), (int) kVar.f());
        }
        float f10 = this.f88846h;
        this.f88846h = 0.0f;
        this.f88845g = 0.0f;
        A((int) f10);
        g();
    }
}
