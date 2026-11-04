package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f43773h = "KeyCycleOscillator";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b f43774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f43775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43777d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f43778e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43779f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<e> f43780g = new ArrayList<>();

    class a implements Comparator<e> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e eVar, e eVar2) {
            return Integer.compare(eVar.f43804a, eVar2.f43804a);
        }
    }

    private static class b extends h {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        String f43782i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f43783j;

        b(String str) {
            this.f43782i = str;
            this.f43783j = v.c.a(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.h
        public void h(androidx.constraintlayout.core.motion.f fVar, float f10) {
            fVar.c(this.f43783j, a(f10));
        }
    }

    static class c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final int f43784q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f43785r = "CycleOscillator";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        l f43787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f43788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f43789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f43790e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float[] f43791f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        double[] f43792g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float[] f43793h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float[] f43794i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float[] f43795j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float[] f43796k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f43797l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        androidx.constraintlayout.core.motion.utils.b f43798m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        double[] f43799n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        double[] f43800o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f43801p;

        c(int i10, String str, int i11, int i12) {
            l lVar = new l();
            this.f43787b = lVar;
            this.f43788c = 0;
            this.f43789d = 1;
            this.f43790e = 2;
            this.f43797l = i10;
            this.f43786a = i11;
            lVar.g(i10, str);
            this.f43791f = new float[i12];
            this.f43792g = new double[i12];
            this.f43793h = new float[i12];
            this.f43794i = new float[i12];
            this.f43795j = new float[i12];
            this.f43796k = new float[i12];
        }

        public double a() {
            return this.f43799n[1];
        }

        public double b(float f10) {
            androidx.constraintlayout.core.motion.utils.b bVar = this.f43798m;
            if (bVar != null) {
                double d10 = f10;
                bVar.g(d10, this.f43800o);
                this.f43798m.d(d10, this.f43799n);
            } else {
                double[] dArr = this.f43800o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d11 = f10;
            double dE = this.f43787b.e(d11, this.f43799n[1]);
            double d12 = this.f43787b.d(d11, this.f43799n[1], this.f43800o[1]);
            double[] dArr2 = this.f43800o;
            return dArr2[0] + (dE * dArr2[2]) + (d12 * this.f43799n[2]);
        }

        public double c(float f10) {
            androidx.constraintlayout.core.motion.utils.b bVar = this.f43798m;
            if (bVar != null) {
                bVar.d(f10, this.f43799n);
            } else {
                double[] dArr = this.f43799n;
                dArr[0] = this.f43794i[0];
                dArr[1] = this.f43795j[0];
                dArr[2] = this.f43791f[0];
            }
            double[] dArr2 = this.f43799n;
            return dArr2[0] + (this.f43787b.e(f10, dArr2[1]) * this.f43799n[2]);
        }

        public void d(int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f43792g[i10] = ((double) i11) / 100.0d;
            this.f43793h[i10] = f10;
            this.f43794i[i10] = f11;
            this.f43795j[i10] = f12;
            this.f43791f[i10] = f13;
        }

        public void e(float f10) {
            this.f43801p = f10;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f43792g.length, 3);
            float[] fArr = this.f43791f;
            this.f43799n = new double[fArr.length + 2];
            this.f43800o = new double[fArr.length + 2];
            if (this.f43792g[0] > 0.0d) {
                this.f43787b.a(0.0d, this.f43793h[0]);
            }
            double[] dArr2 = this.f43792g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f43787b.a(1.0d, this.f43793h[length]);
            }
            for (int i10 = 0; i10 < dArr.length; i10++) {
                double[] dArr3 = dArr[i10];
                dArr3[0] = this.f43794i[i10];
                dArr3[1] = this.f43795j[i10];
                dArr3[2] = this.f43791f[i10];
                this.f43787b.a(this.f43792g[i10], this.f43793h[i10]);
            }
            this.f43787b.f();
            double[] dArr4 = this.f43792g;
            if (dArr4.length > 1) {
                this.f43798m = androidx.constraintlayout.core.motion.utils.b.a(0, dArr4, dArr);
            } else {
                this.f43798m = null;
            }
        }
    }

    public static class d extends h {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        String f43802i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f43803j;

        public d(String str) {
            this.f43802i = str;
            this.f43803j = v.c.a(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.h
        public void h(androidx.constraintlayout.core.motion.f fVar, float f10) {
            fVar.c(this.f43803j, a(f10));
        }

        public void l(androidx.constraintlayout.core.motion.f fVar, float f10, double d10, double d11) {
            fVar.R(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f43804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f43805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f43806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f43807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f43808e;

        e(int i10, float f10, float f11, float f12, float f13) {
            this.f43804a = i10;
            this.f43805b = f13;
            this.f43806c = f11;
            this.f43807d = f10;
            this.f43808e = f12;
        }
    }

    public static h d(String str) {
        return str.equals("pathRotate") ? new d(str) : new b(str);
    }

    public float a(float f10) {
        return (float) this.f43775b.c(f10);
    }

    public androidx.constraintlayout.core.motion.utils.b b() {
        return this.f43774a;
    }

    public float c(float f10) {
        return (float) this.f43775b.b(f10);
    }

    protected void e(Object obj) {
    }

    public void f(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13) {
        this.f43780g.add(new e(i10, f10, f11, f12, f13));
        if (i12 != -1) {
            this.f43779f = i12;
        }
        this.f43777d = i11;
        this.f43778e = str;
    }

    public void g(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13, Object obj) {
        this.f43780g.add(new e(i10, f10, f11, f12, f13));
        if (i12 != -1) {
            this.f43779f = i12;
        }
        this.f43777d = i11;
        e(obj);
        this.f43778e = str;
    }

    public void h(androidx.constraintlayout.core.motion.f fVar, float f10) {
    }

    public void i(String str) {
        this.f43776c = str;
    }

    public void j(float f10) {
        int size = this.f43780g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f43780g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f43775b = new c(this.f43777d, this.f43778e, this.f43779f, size);
        int i10 = 0;
        for (e eVar : this.f43780g) {
            float f11 = eVar.f43807d;
            dArr[i10] = ((double) f11) * 0.01d;
            double[] dArr3 = dArr2[i10];
            float f12 = eVar.f43805b;
            dArr3[0] = f12;
            float f13 = eVar.f43806c;
            dArr3[1] = f13;
            float f14 = eVar.f43808e;
            dArr3[2] = f14;
            this.f43775b.d(i10, eVar.f43804a, f11, f13, f14, f12);
            i10++;
        }
        this.f43775b.e(f10);
        this.f43774a = androidx.constraintlayout.core.motion.utils.b.a(0, dArr, dArr2);
    }

    public boolean k() {
        return this.f43779f == 1;
    }

    public String toString() {
        String str = this.f43776c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (e eVar : this.f43780g) {
            str = str + "[" + eVar.f43804a + " , " + decimalFormat.format(eVar.f43805b) + "] ";
        }
        return str;
    }
}
