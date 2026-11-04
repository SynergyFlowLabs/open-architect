package com.badlogic.gdx.math;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f95007a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f95008b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f95009c = new r(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f95010d = new s(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f95011e = new t(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f95012f = new r(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f95013g = new s(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t f95014h = new t(3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f95015i = new r(4);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s f95016j = new s(4);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t f95017k = new t(4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r f95018l = new r(5);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f95019m = new s(5);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final t f95020n = new t(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q f95021o = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f95022p = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f95023q = new e();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o f95024r = new o(2.0f, 10.0f);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p f95025s = new p(2.0f, 10.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0845q f95026t = new C0845q(2.0f, 10.0f);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final o f95027u = new o(2.0f, 5.0f);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p f95028v = new p(2.0f, 5.0f);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0845q f95029w = new C0845q(2.0f, 5.0f);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final q f95030x = new f();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final q f95031y = new g();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final q f95032z = new h();
    public static final l A = new l(2.0f, 10.0f, 7, 1.0f);
    public static final m B = new m(2.0f, 10.0f, 6, 1.0f);
    public static final n C = new n(2.0f, 10.0f, 7, 1.0f);
    public static final u D = new u(1.5f);
    public static final v E = new v(2.0f);
    public static final w F = new w(2.0f);
    public static final i G = new i(4);
    public static final j H = new j(4);
    public static final k I = new k(4);

    class a extends q {
        a() {
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            return f10;
        }
    }

    class b extends q {
        b() {
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            return com.badlogic.gdx.math.s.e(f10 * f10 * f10 * ((f10 * ((6.0f * f10) - 15.0f)) + 10.0f), 0.0f, 1.0f);
        }
    }

    class c extends q {
        c() {
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            return (1.0f - com.badlogic.gdx.math.s.i(f10 * 3.1415927f)) / 2.0f;
        }
    }

    class d extends q {
        d() {
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            return 1.0f - com.badlogic.gdx.math.s.i((f10 * 3.1415927f) / 2.0f);
        }
    }

    class e extends q {
        e() {
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            return com.badlogic.gdx.math.s.L((f10 * 3.1415927f) / 2.0f);
        }
    }

    class f extends q {
        f() {
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            if (f10 <= 0.5f) {
                float f11 = f10 * 2.0f;
                return (1.0f - ((float) Math.sqrt(1.0f - (f11 * f11)))) / 2.0f;
            }
            float f12 = (f10 - 1.0f) * 2.0f;
            return (((float) Math.sqrt(1.0f - (f12 * f12))) + 1.0f) / 2.0f;
        }
    }

    class g extends q {
        g() {
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            return 1.0f - ((float) Math.sqrt(1.0f - (f10 * f10)));
        }
    }

    class h extends q {
        h() {
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            float f11 = f10 - 1.0f;
            return (float) Math.sqrt(1.0f - (f11 * f11));
        }
    }

    public static class i extends k {
        public i(float[] fArr, float[] fArr2) {
            super(fArr, fArr2);
        }

        private float c(float f10) {
            float f11 = this.J[0];
            float f12 = (f11 / 2.0f) + f10;
            return f12 < f11 ? (f12 / (f11 / 2.0f)) - 1.0f : super.a(f10);
        }

        @Override // com.badlogic.gdx.math.q.k, com.badlogic.gdx.math.q
        public float a(float f10) {
            return f10 <= 0.5f ? (1.0f - c(1.0f - (f10 * 2.0f))) / 2.0f : (c((f10 * 2.0f) - 1.0f) / 2.0f) + 0.5f;
        }

        public i(int i10) {
            super(i10);
        }
    }

    public static class j extends k {
        public j(float[] fArr, float[] fArr2) {
            super(fArr, fArr2);
        }

        @Override // com.badlogic.gdx.math.q.k, com.badlogic.gdx.math.q
        public float a(float f10) {
            return 1.0f - super.a(1.0f - f10);
        }

        public j(int i10) {
            super(i10);
        }
    }

    public static class l extends q {
        final float J;
        final float K;
        final float L;
        final float M;

        public l(float f10, float f11, int i10, float f12) {
            this.J = f10;
            this.K = f11;
            this.L = f12;
            this.M = i10 * 3.1415927f * (i10 % 2 == 0 ? 1 : -1);
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            if (f10 <= 0.5f) {
                float f11 = f10 * 2.0f;
                return ((((float) Math.pow(this.J, this.K * (f11 - 1.0f))) * com.badlogic.gdx.math.s.L(f11 * this.M)) * this.L) / 2.0f;
            }
            float f12 = (1.0f - f10) * 2.0f;
            return 1.0f - (((((float) Math.pow(this.J, this.K * (f12 - 1.0f))) * com.badlogic.gdx.math.s.L(f12 * this.M)) * this.L) / 2.0f);
        }
    }

    public static class m extends l {
        public m(float f10, float f11, int i10, float f12) {
            super(f10, f11, i10, f12);
        }

        @Override // com.badlogic.gdx.math.q.l, com.badlogic.gdx.math.q
        public float a(float f10) {
            if (f10 >= 0.99d) {
                return 1.0f;
            }
            return ((float) Math.pow(this.J, this.K * (f10 - 1.0f))) * com.badlogic.gdx.math.s.L(f10 * this.M) * this.L;
        }
    }

    public static class n extends l {
        public n(float f10, float f11, int i10, float f12) {
            super(f10, f11, i10, f12);
        }

        @Override // com.badlogic.gdx.math.q.l, com.badlogic.gdx.math.q
        public float a(float f10) {
            float f11 = 1.0f - f10;
            return 1.0f - ((((float) Math.pow(this.J, this.K * (f11 - 1.0f))) * com.badlogic.gdx.math.s.L(f11 * this.M)) * this.L);
        }
    }

    public static class o extends q {
        final float J;
        final float K;
        final float L;
        final float M;

        public o(float f10, float f11) {
            this.J = f10;
            this.K = f11;
            float fPow = (float) Math.pow(f10, -f11);
            this.L = fPow;
            this.M = 1.0f / (1.0f - fPow);
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            return f10 <= 0.5f ? ((((float) Math.pow(this.J, this.K * ((f10 * 2.0f) - 1.0f))) - this.L) * this.M) / 2.0f : (2.0f - ((((float) Math.pow(this.J, (-this.K) * ((f10 * 2.0f) - 1.0f))) - this.L) * this.M)) / 2.0f;
        }
    }

    public static class p extends o {
        public p(float f10, float f11) {
            super(f10, f11);
        }

        @Override // com.badlogic.gdx.math.q.o, com.badlogic.gdx.math.q
        public float a(float f10) {
            return (((float) Math.pow(this.J, this.K * (f10 - 1.0f))) - this.L) * this.M;
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.math.q$q, reason: collision with other inner class name */
    public static class C0845q extends o {
        public C0845q(float f10, float f11) {
            super(f10, f11);
        }

        @Override // com.badlogic.gdx.math.q.o, com.badlogic.gdx.math.q
        public float a(float f10) {
            return 1.0f - ((((float) Math.pow(this.J, (-this.K) * f10)) - this.L) * this.M);
        }
    }

    public static class r extends q {
        final int J;

        public r(int i10) {
            this.J = i10;
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            if (f10 <= 0.5f) {
                return ((float) Math.pow(f10 * 2.0f, this.J)) / 2.0f;
            }
            return (((float) Math.pow((f10 - 1.0f) * 2.0f, this.J)) / (this.J % 2 == 0 ? -2 : 2)) + 1.0f;
        }
    }

    public static class s extends r {
        public s(int i10) {
            super(i10);
        }

        @Override // com.badlogic.gdx.math.q.r, com.badlogic.gdx.math.q
        public float a(float f10) {
            return (float) Math.pow(f10, this.J);
        }
    }

    public static class t extends r {
        public t(int i10) {
            super(i10);
        }

        @Override // com.badlogic.gdx.math.q.r, com.badlogic.gdx.math.q
        public float a(float f10) {
            return (((float) Math.pow(f10 - 1.0f, this.J)) * (this.J % 2 == 0 ? -1 : 1)) + 1.0f;
        }
    }

    public static class u extends q {
        private final float J;

        public u(float f10) {
            this.J = f10 * 2.0f;
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            if (f10 <= 0.5f) {
                float f11 = f10 * 2.0f;
                float f12 = this.J;
                return ((f11 * f11) * (((1.0f + f12) * f11) - f12)) / 2.0f;
            }
            float f13 = (f10 - 1.0f) * 2.0f;
            float f14 = this.J;
            return (((f13 * f13) * (((f14 + 1.0f) * f13) + f14)) / 2.0f) + 1.0f;
        }
    }

    public static class v extends q {
        private final float J;

        public v(float f10) {
            this.J = f10;
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            float f11 = this.J;
            return f10 * f10 * (((1.0f + f11) * f10) - f11);
        }
    }

    public static class w extends q {
        private final float J;

        public w(float f10) {
            this.J = f10;
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            float f11 = f10 - 1.0f;
            float f12 = this.J;
            return (f11 * f11 * (((f12 + 1.0f) * f11) + f12)) + 1.0f;
        }
    }

    public abstract float a(float f10);

    public float b(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * a(f12));
    }

    public static class k extends q {
        final float[] J;
        final float[] K;

        public k(float[] fArr, float[] fArr2) {
            if (fArr.length != fArr2.length) {
                throw new IllegalArgumentException("Must be the same number of widths and heights.");
            }
            this.J = fArr;
            this.K = fArr2;
        }

        @Override // com.badlogic.gdx.math.q
        public float a(float f10) {
            float[] fArr = this.J;
            float f11 = f10 + (fArr[0] / 2.0f);
            int length = fArr.length;
            float f12 = 0.0f;
            float f13 = 0.0f;
            for (int i10 = 0; i10 < length; i10++) {
                f13 = this.J[i10];
                if (f11 <= f13) {
                    f12 = this.K[i10];
                    break;
                }
                f11 -= f13;
            }
            float f14 = f11 / f13;
            float f15 = (4.0f / f13) * f12 * f14;
            return 1.0f - ((f15 - (f14 * f15)) * f13);
        }

        public k(int i10) {
            if (i10 < 2 || i10 > 5) {
                throw new IllegalArgumentException("bounces cannot be < 2 or > 5: " + i10);
            }
            float[] fArr = new float[i10];
            this.J = fArr;
            float[] fArr2 = new float[i10];
            this.K = fArr2;
            int i11 = 4 & 0;
            fArr2[0] = 1.0f;
            if (i10 == 2) {
                fArr[0] = 0.6f;
                fArr[1] = 0.4f;
                fArr2[1] = 0.33f;
            } else if (i10 == 3) {
                fArr[0] = 0.4f;
                fArr[1] = 0.4f;
                fArr[2] = 0.2f;
                fArr2[1] = 0.33f;
                fArr2[2] = 0.1f;
            } else if (i10 == 4) {
                fArr[0] = 0.34f;
                fArr[1] = 0.34f;
                fArr[2] = 0.2f;
                fArr[3] = 0.15f;
                fArr2[1] = 0.26f;
                fArr2[2] = 0.11f;
                fArr2[3] = 0.03f;
            } else if (i10 == 5) {
                fArr[0] = 0.3f;
                fArr[1] = 0.3f;
                fArr[2] = 0.2f;
                fArr[3] = 0.1f;
                fArr[4] = 0.1f;
                fArr2[1] = 0.45f;
                fArr2[2] = 0.3f;
                fArr2[3] = 0.15f;
                fArr2[4] = 0.06f;
            }
            fArr[0] = fArr[0] * 2.0f;
        }
    }
}
