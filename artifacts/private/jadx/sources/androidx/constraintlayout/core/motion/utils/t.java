package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f43910k = "SplineSet";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final int f43911l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final int f43912m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final int f43913n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static float f43914o = 6.2831855f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected androidx.constraintlayout.core.motion.utils.b f43915a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f43919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f43920f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected long f43923i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f43916b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int[] f43917c = new int[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float[][] f43918d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected float[] f43921g = new float[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f43922h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f43924j = Float.NaN;

    public static class a extends t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f43925p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        i.a f43926q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        i.c f43927r = new i.c();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        float[] f43928s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float[] f43929t;

        public a(String str, i.a aVar) {
            this.f43925p = str.split(",")[1];
            this.f43926q = aVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void c(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void f(int i10) {
            int iF = this.f43926q.f();
            int iH = this.f43926q.g(0).h();
            double[] dArr = new double[iF];
            int i11 = iH + 2;
            this.f43928s = new float[i11];
            this.f43929t = new float[iH];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iF, i11);
            for (int i12 = 0; i12 < iF; i12++) {
                int iD = this.f43926q.d(i12);
                androidx.constraintlayout.core.motion.a aVarG = this.f43926q.g(i12);
                float[] fArrG = this.f43927r.g(i12);
                dArr[i12] = ((double) iD) * 0.01d;
                aVarG.e(this.f43928s);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f43928s;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iH] = fArrG[0];
                dArr3[iH + 1] = fArrG[1];
            }
            this.f43915a = androidx.constraintlayout.core.motion.utils.b.a(i10, dArr, dArr2);
        }

        public void g(int i10, androidx.constraintlayout.core.motion.a aVar, float f10, int i11, float f11) {
            this.f43926q.a(i10, aVar);
            this.f43927r.a(i10, new float[]{f10, f11});
            this.f43916b = Math.max(this.f43916b, i11);
        }

        public boolean h(androidx.constraintlayout.core.motion.f fVar, float f10, long j10, g gVar) {
            this.f43915a.e(f10, this.f43928s);
            float[] fArr = this.f43928s;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f43923i;
            if (Float.isNaN(this.f43924j)) {
                float fA = gVar.a(fVar, this.f43925p, 0);
                this.f43924j = fA;
                if (Float.isNaN(fA)) {
                    this.f43924j = 0.0f;
                }
            }
            float f13 = (float) ((((double) this.f43924j) + ((j11 * 1.0E-9d) * ((double) f11))) % 1.0d);
            this.f43924j = f13;
            this.f43923i = j10;
            float fA2 = a(f13);
            this.f43922h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f43929t;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f43922h;
                float f14 = this.f43928s[i10];
                this.f43922h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA2) + f12;
                i10++;
            }
            fVar.M(this.f43926q.g(0), this.f43929t);
            if (f11 != 0.0f) {
                this.f43922h = true;
            }
            return this.f43922h;
        }
    }

    public static class b extends t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f43930p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        i.b f43931q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        i.c f43932r = new i.c();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        float[] f43933s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float[] f43934t;

        public b(String str, i.b bVar) {
            this.f43930p = str.split(",")[1];
            this.f43931q = bVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void c(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void f(int i10) {
            int iF = this.f43931q.f();
            int iR = this.f43931q.g(0).r();
            double[] dArr = new double[iF];
            int i11 = iR + 2;
            this.f43933s = new float[i11];
            this.f43934t = new float[iR];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iF, i11);
            for (int i12 = 0; i12 < iF; i12++) {
                int iD = this.f43931q.d(i12);
                androidx.constraintlayout.core.motion.b bVarG = this.f43931q.g(i12);
                float[] fArrG = this.f43932r.g(i12);
                dArr[i12] = ((double) iD) * 0.01d;
                bVarG.o(this.f43933s);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f43933s;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iR] = fArrG[0];
                dArr3[iR + 1] = fArrG[1];
            }
            this.f43915a = androidx.constraintlayout.core.motion.utils.b.a(i10, dArr, dArr2);
        }

        public void g(int i10, androidx.constraintlayout.core.motion.b bVar, float f10, int i11, float f11) {
            this.f43931q.a(i10, bVar);
            this.f43932r.a(i10, new float[]{f10, f11});
            this.f43916b = Math.max(this.f43916b, i11);
        }

        public boolean h(androidx.constraintlayout.core.motion.f fVar, float f10, long j10, g gVar) {
            this.f43915a.e(f10, this.f43933s);
            float[] fArr = this.f43933s;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f43923i;
            if (Float.isNaN(this.f43924j)) {
                float fA = gVar.a(fVar, this.f43930p, 0);
                this.f43924j = fA;
                if (Float.isNaN(fA)) {
                    this.f43924j = 0.0f;
                }
            }
            float f13 = (float) ((((double) this.f43924j) + ((j11 * 1.0E-9d) * ((double) f11))) % 1.0d);
            this.f43924j = f13;
            this.f43923i = j10;
            float fA2 = a(f13);
            this.f43922h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f43934t;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f43922h;
                float f14 = this.f43933s[i10];
                this.f43922h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA2) + f12;
                i10++;
            }
            this.f43931q.g(0).w(fVar, this.f43934t);
            if (f11 != 0.0f) {
                this.f43922h = true;
            }
            return this.f43922h;
        }
    }

    protected static class c {
        protected c() {
        }

        static void a(int[] iArr, float[][] fArr, int i10, int i11) {
            int[] iArr2 = new int[iArr.length + 10];
            int i12 = 2 << 0;
            iArr2[0] = i11;
            iArr2[1] = i10;
            int i13 = 2;
            while (i13 > 0) {
                int i14 = iArr2[i13 - 1];
                int i15 = i13 - 2;
                int i16 = iArr2[i15];
                if (i14 < i16) {
                    int iB = b(iArr, fArr, i14, i16);
                    iArr2[i15] = iB - 1;
                    iArr2[i13 - 1] = i14;
                    int i17 = i13 + 1;
                    iArr2[i13] = i16;
                    i13 += 2;
                    iArr2[i17] = iB + 1;
                } else {
                    i13 = i15;
                }
            }
        }

        private static int b(int[] iArr, float[][] fArr, int i10, int i11) {
            int i12 = iArr[i11];
            int i13 = i10;
            while (i10 < i11) {
                if (iArr[i10] <= i12) {
                    c(iArr, fArr, i13, i10);
                    i13++;
                }
                i10++;
            }
            c(iArr, fArr, i13, i11);
            return i13;
        }

        private static void c(int[] iArr, float[][] fArr, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float[] fArr2 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = fArr2;
        }
    }

    public t() {
        int i10 = 1 & 3;
    }

    protected float a(float f10) {
        switch (this.f43916b) {
            case 1:
                return Math.signum(f10 * f43914o);
            case 2:
                return 1.0f - Math.abs(f10);
            case 3:
                return (((f10 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                return 1.0f - (((f10 * 2.0f) + 1.0f) % 2.0f);
            case 5:
                return (float) Math.cos(f10 * f43914o);
            case 6:
                float fAbs = 1.0f - Math.abs(((f10 * 4.0f) % 4.0f) - 2.0f);
                return 1.0f - (fAbs * fAbs);
            default:
                return (float) Math.sin(f10 * f43914o);
        }
    }

    public androidx.constraintlayout.core.motion.utils.b b() {
        return this.f43915a;
    }

    public void c(int i10, float f10, float f11, int i11, float f12) {
        int[] iArr = this.f43917c;
        int i12 = this.f43919e;
        iArr[i12] = i10;
        float[] fArr = this.f43918d[i12];
        fArr[0] = f10;
        fArr[1] = f11;
        int i13 = 7 & 2;
        fArr[2] = f12;
        this.f43916b = Math.max(this.f43916b, i11);
        this.f43919e++;
    }

    protected void d(long j10) {
        this.f43923i = j10;
    }

    public void e(String str) {
        this.f43920f = str;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    public void f(int i10) {
        int i11 = this.f43919e;
        if (i11 == 0) {
            System.err.println("Error no points added to " + this.f43920f);
            return;
        }
        c.a(this.f43917c, this.f43918d, 0, i11 - 1);
        int i12 = 1;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f43917c;
            if (i12 >= iArr.length) {
                break;
            }
            if (iArr[i12] != iArr[i12 - 1]) {
                i13++;
            }
            i12++;
        }
        if (i13 == 0) {
            i13 = 1;
        }
        double[] dArr = new double[i13];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i13, 3);
        int i14 = 0;
        for (int i15 = 0; i15 < this.f43919e; i15++) {
            if (i15 > 0) {
                int[] iArr2 = this.f43917c;
                if (iArr2[i15] != iArr2[i15 - 1]) {
                    dArr[i14] = ((double) this.f43917c[i15]) * 0.01d;
                    double[] dArr3 = dArr2[i14];
                    float[] fArr = this.f43918d[i15];
                    dArr3[0] = fArr[0];
                    dArr3[1] = fArr[1];
                    dArr3[2] = fArr[2];
                    i14++;
                }
            } else {
                dArr[i14] = ((double) this.f43917c[i15]) * 0.01d;
                double[] dArr4 = dArr2[i14];
                float[] fArr2 = this.f43918d[i15];
                dArr4[0] = fArr2[0];
                dArr4[1] = fArr2[1];
                dArr4[2] = fArr2[2];
                i14++;
            }
        }
        this.f43915a = androidx.constraintlayout.core.motion.utils.b.a(i10, dArr, dArr2);
    }

    public String toString() {
        String str = this.f43920f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f43919e; i10++) {
            str = str + "[" + this.f43917c[i10] + " , " + decimalFormat.format(this.f43918d[i10]) + "] ";
        }
        return str;
    }
}
