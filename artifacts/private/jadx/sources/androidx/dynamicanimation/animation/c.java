package androidx.dynamicanimation.animation;

import androidx.annotation.x;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends b<c> {
    private final a G;

    static final class a implements f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final float f51017d = -4.2f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final float f51018e = 62.5f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f51020b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f51019a = f51017d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b.p f51021c = new b.p();

        a() {
        }

        @Override // androidx.dynamicanimation.animation.f
        public float a(float f10, float f11) {
            return f11 * this.f51019a;
        }

        @Override // androidx.dynamicanimation.animation.f
        public boolean b(float f10, float f11) {
            return Math.abs(f11) < this.f51020b;
        }

        float c() {
            return this.f51019a / f51017d;
        }

        void d(float f10) {
            this.f51019a = f10 * f51017d;
        }

        void e(float f10) {
            this.f51020b = f10 * f51018e;
        }

        b.p f(float f10, float f11, long j10) {
            float f12 = j10;
            this.f51021c.f51016b = (float) (((double) f11) * Math.exp((f12 / 1000.0f) * this.f51019a));
            b.p pVar = this.f51021c;
            float f13 = this.f51019a;
            pVar.f51015a = (float) (((double) (f10 - (f11 / f13))) + (((double) (f11 / f13)) * Math.exp((f13 * f12) / 1000.0f)));
            b.p pVar2 = this.f51021c;
            if (b(pVar2.f51015a, pVar2.f51016b)) {
                this.f51021c.f51016b = 0.0f;
            }
            return this.f51021c;
        }
    }

    public c(e eVar) {
        super(eVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }

    public c A(@x(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.G.d(f10);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public c p(float f10) {
        super.p(f10);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public c q(float f10) {
        super.q(f10);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public c u(float f10) {
        super.u(f10);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    float f(float f10, float f11) {
        return this.G.a(f10, f11);
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean j(float f10, float f11) {
        return f10 >= this.f51007g || f10 <= this.f51008h || this.G.b(f10, f11);
    }

    @Override // androidx.dynamicanimation.animation.b
    void v(float f10) {
        this.G.e(f10);
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean y(long j10) {
        b.p pVarF = this.G.f(this.f51002b, this.f51001a, j10);
        float f10 = pVarF.f51015a;
        this.f51002b = f10;
        float f11 = pVarF.f51016b;
        this.f51001a = f11;
        float f12 = this.f51008h;
        if (f10 < f12) {
            this.f51002b = f12;
            return true;
        }
        float f13 = this.f51007g;
        if (f10 <= f13) {
            return j(f10, f11);
        }
        this.f51002b = f13;
        return true;
    }

    public float z() {
        return this.G.c();
    }

    public <K> c(K k10, d<K> dVar) {
        super(k10, dVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }
}
