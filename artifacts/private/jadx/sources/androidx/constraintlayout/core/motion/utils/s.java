package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes2.dex */
public class s implements r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f43886q = 1.0E-5f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f43887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f43888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f43889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f43890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f43891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f43892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f43893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f43894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f43895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f43896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f43897k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f43899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f43900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f43901o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f43898l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f43902p = false;

    public static class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f43903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f43904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f43905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f43906d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f43907e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f43908f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f43909g = false;

        @Override // androidx.constraintlayout.core.motion.utils.r
        public float a() {
            return this.f43906d;
        }

        @Override // androidx.constraintlayout.core.motion.utils.r
        public float b(float f10) {
            if (f10 > this.f43907e) {
                return 0.0f;
            }
            float f11 = this.f43904b + (this.f43905c * f10);
            this.f43906d = f11;
            return f11;
        }

        @Override // androidx.constraintlayout.core.motion.utils.r
        public String c(String str, float f10) {
            return this.f43907e + " " + this.f43906d;
        }

        @Override // androidx.constraintlayout.core.motion.utils.r
        public boolean d() {
            return this.f43909g;
        }

        public void e(float f10, float f11, float f12) {
            this.f43909g = false;
            this.f43903a = f11;
            this.f43904b = f12;
            this.f43908f = f10;
            float f13 = (f11 - f10) / (f12 / 2.0f);
            this.f43907e = f13;
            this.f43905c = (-f12) / f13;
        }

        @Override // androidx.constraintlayout.core.motion.utils.r
        public float getInterpolation(float f10) {
            if (f10 > this.f43907e) {
                this.f43909g = true;
                return this.f43903a;
            }
            b(f10);
            return this.f43908f + ((this.f43904b + ((this.f43905c * f10) / 2.0f)) * f10);
        }
    }

    private float e(float f10) {
        this.f43902p = false;
        float f11 = this.f43890d;
        if (f10 <= f11) {
            float f12 = this.f43887a;
            return (f12 * f10) + ((((this.f43888b - f12) * f10) * f10) / (f11 * 2.0f));
        }
        int i10 = this.f43896j;
        if (i10 == 1) {
            return this.f43893g;
        }
        float f13 = f10 - f11;
        float f14 = this.f43891e;
        if (f13 < f14) {
            float f15 = this.f43893g;
            float f16 = this.f43888b;
            return f15 + (f16 * f13) + ((((this.f43889c - f16) * f13) * f13) / (f14 * 2.0f));
        }
        if (i10 == 2) {
            return this.f43894h;
        }
        float f17 = f13 - f14;
        float f18 = this.f43892f;
        if (f17 > f18) {
            this.f43902p = true;
            return this.f43895i;
        }
        float f19 = this.f43894h;
        float f20 = this.f43889c;
        return (f19 + (f20 * f17)) - (((f20 * f17) * f17) / (f18 * 2.0f));
    }

    private void g(float f10, float f11, float f12, float f13, float f14) {
        this.f43902p = false;
        this.f43895i = f11;
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12);
            if (fSqrt < f13) {
                this.f43897k = "backward accelerate, decelerate";
                this.f43896j = 2;
                this.f43887a = f10;
                this.f43888b = fSqrt;
                this.f43889c = 0.0f;
                float f17 = (fSqrt - f10) / f12;
                this.f43890d = f17;
                this.f43891e = fSqrt / f12;
                this.f43893g = ((f10 + fSqrt) * f17) / 2.0f;
                this.f43894h = f11;
                this.f43895i = f11;
                return;
            }
            this.f43897k = "backward accelerate cruse decelerate";
            this.f43896j = 3;
            this.f43887a = f10;
            this.f43888b = f13;
            this.f43889c = f13;
            float f18 = (f13 - f10) / f12;
            this.f43890d = f18;
            float f19 = f13 / f12;
            this.f43892f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f43891e = ((f11 - f20) - f21) / f13;
            this.f43893g = f20;
            this.f43894h = f11 - f21;
            this.f43895i = f11;
            return;
        }
        if (f16 >= f11) {
            this.f43897k = "hard stop";
            this.f43896j = 1;
            this.f43887a = f10;
            this.f43888b = 0.0f;
            this.f43893g = f11;
            this.f43890d = (2.0f * f11) / f10;
            return;
        }
        float f22 = f11 - f16;
        float f23 = f22 / f10;
        if (f23 + f15 < f14) {
            this.f43897k = "cruse decelerate";
            this.f43896j = 2;
            this.f43887a = f10;
            this.f43888b = f10;
            this.f43889c = 0.0f;
            this.f43893g = f22;
            this.f43894h = f11;
            this.f43890d = f23;
            this.f43891e = f15;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f12 * f11) + ((f10 * f10) / 2.0f));
        float f24 = (fSqrt2 - f10) / f12;
        this.f43890d = f24;
        float f25 = fSqrt2 / f12;
        this.f43891e = f25;
        if (fSqrt2 < f13) {
            this.f43897k = "accelerate decelerate";
            this.f43896j = 2;
            this.f43887a = f10;
            this.f43888b = fSqrt2;
            this.f43889c = 0.0f;
            this.f43890d = f24;
            this.f43891e = f25;
            this.f43893g = ((f10 + fSqrt2) * f24) / 2.0f;
            this.f43894h = f11;
            return;
        }
        this.f43897k = "accelerate cruse decelerate";
        this.f43896j = 3;
        this.f43887a = f10;
        this.f43888b = f13;
        this.f43889c = f13;
        float f26 = (f13 - f10) / f12;
        this.f43890d = f26;
        float f27 = f13 / f12;
        this.f43892f = f27;
        float f28 = ((f10 + f13) * f26) / 2.0f;
        float f29 = (f27 * f13) / 2.0f;
        this.f43891e = ((f11 - f28) - f29) / f13;
        this.f43893g = f28;
        this.f43894h = f11 - f29;
        this.f43895i = f11;
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float a() {
        return this.f43898l ? -b(this.f43901o) : b(this.f43901o);
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float b(float f10) {
        float f11;
        float f12;
        float f13 = this.f43890d;
        if (f10 <= f13) {
            f11 = this.f43887a;
            f12 = this.f43888b;
        } else {
            int i10 = this.f43896j;
            if (i10 == 1) {
                return 0.0f;
            }
            f10 -= f13;
            f13 = this.f43891e;
            if (f10 >= f13) {
                if (i10 == 2) {
                    return 0.0f;
                }
                float f14 = f10 - f13;
                float f15 = this.f43892f;
                if (f14 >= f15) {
                    return 0.0f;
                }
                float f16 = this.f43889c;
                return f16 - ((f14 * f16) / f15);
            }
            f11 = this.f43888b;
            f12 = this.f43889c;
        }
        return f11 + (((f12 - f11) * f10) / f13);
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public String c(String str, float f10) {
        String str2 = str + " ===== " + this.f43897k + "\n";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        sb2.append(this.f43898l ? "backwards" : "forward ");
        sb2.append(" time = ");
        sb2.append(f10);
        sb2.append("  stages ");
        sb2.append(this.f43896j);
        sb2.append("\n");
        String str3 = sb2.toString() + str + " dur " + this.f43890d + " vel " + this.f43887a + " pos " + this.f43893g + "\n";
        if (this.f43896j > 1) {
            str3 = str3 + str + " dur " + this.f43891e + " vel " + this.f43888b + " pos " + this.f43894h + "\n";
        }
        if (this.f43896j > 2) {
            str3 = str3 + str + " dur " + this.f43892f + " vel " + this.f43889c + " pos " + this.f43895i + "\n";
        }
        float f11 = this.f43890d;
        if (f10 <= f11) {
            return str3 + str + "stage 0\n";
        }
        int i10 = this.f43896j;
        if (i10 == 1) {
            return str3 + str + "end stage 0\n";
        }
        float f12 = f10 - f11;
        float f13 = this.f43891e;
        if (f12 < f13) {
            return str3 + str + " stage 1\n";
        }
        if (i10 == 2) {
            return str3 + str + "end stage 1\n";
        }
        if (f12 - f13 < this.f43892f) {
            return str3 + str + " stage 2\n";
        }
        return str3 + str + " end stage 2\n";
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public boolean d() {
        return a() < f43886q && Math.abs(this.f43895i - this.f43900n) < f43886q;
    }

    public void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f43902p = false;
        this.f43899m = f10;
        boolean z10 = f10 > f11;
        this.f43898l = z10;
        if (z10) {
            g(-f12, f10 - f11, f14, f15, f13);
        } else {
            g(f12, f11 - f10, f14, f15, f13);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float getInterpolation(float f10) {
        float fE = e(f10);
        this.f43900n = fE;
        this.f43901o = f10;
        boolean z10 = this.f43898l;
        float f11 = this.f43899m;
        return z10 ? f11 - fE : f11 + fE;
    }
}
