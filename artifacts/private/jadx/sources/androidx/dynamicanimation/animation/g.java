package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends b<g> {
    private static final float J = Float.MAX_VALUE;
    private h G;
    private float H;
    private boolean I;

    public g(e eVar) {
        super(eVar);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
    }

    private void C() {
        h hVar = this.G;
        if (hVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d10 = hVar.d();
        if (d10 > this.f51007g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d10 < this.f51008h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public boolean A() {
        return this.G.f51036b > 0.0d;
    }

    public h B() {
        return this.G;
    }

    public g D(h hVar) {
        this.G = hVar;
        return this;
    }

    public void E() {
        if (!A()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f51006f) {
            this.I = true;
        }
    }

    @Override // androidx.dynamicanimation.animation.b
    float f(float f10, float f11) {
        return this.G.a(f10, f11);
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean j(float f10, float f11) {
        return this.G.b(f10, f11);
    }

    @Override // androidx.dynamicanimation.animation.b
    void v(float f10) {
    }

    @Override // androidx.dynamicanimation.animation.b
    public void w() {
        C();
        this.G.j(i());
        super.w();
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean y(long j10) {
        if (this.I) {
            float f10 = this.H;
            if (f10 != Float.MAX_VALUE) {
                this.G.h(f10);
                this.H = Float.MAX_VALUE;
            }
            this.f51002b = this.G.d();
            this.f51001a = 0.0f;
            this.I = false;
            return true;
        }
        if (this.H != Float.MAX_VALUE) {
            this.G.d();
            long j11 = j10 / 2;
            b.p pVarK = this.G.k(this.f51002b, this.f51001a, j11);
            this.G.h(this.H);
            this.H = Float.MAX_VALUE;
            b.p pVarK2 = this.G.k(pVarK.f51015a, pVarK.f51016b, j11);
            this.f51002b = pVarK2.f51015a;
            this.f51001a = pVarK2.f51016b;
        } else {
            b.p pVarK3 = this.G.k(this.f51002b, this.f51001a, j10);
            this.f51002b = pVarK3.f51015a;
            this.f51001a = pVarK3.f51016b;
        }
        float fMax = Math.max(this.f51002b, this.f51008h);
        this.f51002b = fMax;
        float fMin = Math.min(fMax, this.f51007g);
        this.f51002b = fMin;
        if (!j(fMin, this.f51001a)) {
            return false;
        }
        this.f51002b = this.G.d();
        this.f51001a = 0.0f;
        return true;
    }

    public void z(float f10) {
        if (k()) {
            this.H = f10;
            return;
        }
        if (this.G == null) {
            this.G = new h(f10);
        }
        this.G.h(f10);
        w();
    }

    public <K> g(K k10, d<K> dVar) {
        super(k10, dVar);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
    }

    public <K> g(K k10, d<K> dVar, float f10) {
        super(k10, dVar);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
        this.G = new h(f10);
    }
}
