package com.google.vr.ndk.base;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    static final double X = 0.015d;
    static final int Y = 200;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DisplayMetrics f127001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f127002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f127003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f127004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[][] f127005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f127006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f127007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f127008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private double[] f127009k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f127011m;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f127015t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f127016v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f126999a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f127000b = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f127010l = new float[2];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f127012n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float[] f127013o = new float[2];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float[] f127014s = new float[2];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final float[] f127017w = new float[2];

    private void i(MotionEvent motionEvent, float f10, float f11) {
        int pointerCount = motionEvent.getPointerCount();
        com.google.common.logging.nano.a.C1088a c1088a = new com.google.common.logging.nano.a.C1088a();
        com.google.common.logging.nano.a.C1088a.j jVar = new com.google.common.logging.nano.a.C1088a.j();
        c1088a.f119077i3 = jVar;
        jVar.f119276c = new com.google.common.logging.nano.a.C1088a.p[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            c1088a.f119077i3.f119276c[i10] = new com.google.common.logging.nano.a.C1088a.p();
            c1088a.f119077i3.f119276c[i10].f119341c = Float.valueOf(motionEvent.getX(i10) + f10);
            c1088a.f119077i3.f119276c[i10].f119342d = Float.valueOf(motionEvent.getY(i10) + f11);
        }
        c1088a.f119077i3.f119277d = new com.google.common.logging.nano.a.C1088a.p();
        c1088a.f119077i3.f119277d.f119341c = Float.valueOf(this.f127010l[0]);
        int i11 = 3 | 1;
        c1088a.f119077i3.f119277d.f119342d = Float.valueOf(this.f127010l[1]);
        if (pointerCount == 2 && this.f127005g.length == 2) {
            c1088a.f119077i3.f119278e = Float.valueOf((float) Math.toDegrees(b(motionEvent)));
            motionEvent.getX(0);
            motionEvent.getY(0);
            motionEvent.getX(1);
            motionEvent.getY(1);
        }
        h(2012, c1088a);
    }

    private void k() {
        this.f127011m = false;
        float[] fArr = this.f127010l;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        this.f127015t = 0.0f;
        this.f127006h = 0;
    }

    public Rect a(DisplayMetrics displayMetrics) {
        float[][] fArr = this.f127005g;
        if (fArr == null || fArr.length == 0) {
            return null;
        }
        double d10 = X / ((double) this.f127002d);
        double d11 = X / ((double) this.f127003e);
        int iMin = displayMetrics.widthPixels;
        int iMin2 = displayMetrics.heightPixels;
        int i10 = 0;
        int i11 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (true) {
            float[][] fArr2 = this.f127005g;
            if (i11 >= fArr2.length) {
                int i12 = i10;
                return new Rect(Math.max(iMin, i12), Math.max(iMin2, i12), Math.min(iMax, displayMetrics.widthPixels), Math.min(iMax2, displayMetrics.heightPixels));
            }
            float[] fArr3 = fArr2[i11];
            int i13 = i10;
            iMin = (int) Math.min(iMin, ((double) fArr3[i10]) - d10);
            iMax = (int) Math.max(iMax, ((double) fArr3[i13]) + d10 + 1.0d);
            iMin2 = (int) Math.min(iMin2, ((double) fArr3[1]) - d11);
            iMax2 = (int) Math.max(iMax2, ((double) fArr3[1]) + d11 + 1.0d);
            i11++;
            i10 = i13;
        }
    }

    float b(MotionEvent motionEvent) {
        float[][] fArr = this.f127005g;
        if (fArr == null || fArr.length != 2) {
            return 0.0f;
        }
        boolean z10 = !false;
        double dAtan2 = Math.atan2(motionEvent.getY(0) - motionEvent.getY(1), motionEvent.getX(0) - motionEvent.getX(1));
        float[][] fArr2 = this.f127005g;
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0];
        float[] fArr4 = fArr2[1];
        float fAtan2 = (float) (dAtan2 - Math.atan2(fArr3[1] - fArr4[1], f10 - fArr4[0]));
        if (fAtan2 > 1.5707963267948966d) {
            fAtan2 -= 3.1415927f;
        }
        return ((double) fAtan2) < -1.5707963267948966d ? fAtan2 + 3.1415927f : fAtan2;
    }

    void c(float[] fArr) {
        if (fArr.length < 2) {
            throw new IllegalArgumentException("Translation array too small");
        }
        float[] fArr2 = this.f127010l;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
    }

    public void d(float[] fArr) {
        if (fArr.length < 2) {
            throw new IllegalArgumentException("Translation array too small");
        }
        DisplayMetrics displayMetrics = this.f127001c;
        if (displayMetrics == null) {
            return;
        }
        float[] fArr2 = this.f127010l;
        float f10 = fArr2[0] / displayMetrics.widthPixels;
        fArr[0] = f10;
        float f11 = fArr2[1] / displayMetrics.heightPixels;
        fArr[1] = f11;
        fArr[0] = f10 * 2.0f;
        fArr[1] = f11 * (-2.0f);
    }

    protected final boolean e(MotionEvent motionEvent, float f10, float f11) {
        if (!j(motionEvent, f10, f11)) {
            return false;
        }
        d(this.f127014s);
        float[] fArr = this.f127014s;
        float f12 = fArr[0];
        float[] fArr2 = this.f127013o;
        int i10 = 7 & 1;
        if (f12 != fArr2[0] || fArr[1] != fArr2[1]) {
            fArr2[0] = f12;
            fArr2[1] = fArr[1];
            n(fArr[0], fArr[1], this.f127015t);
        }
        return true;
    }

    protected final void f(DisplayMetrics displayMetrics, com.google.vr.sdk.proto.nano.b.a aVar, com.google.vr.cardboard.b.a aVar2) {
        this.f127001c = displayMetrics;
        this.f127004f = com.google.vr.cardboard.g.a(aVar);
        this.f127002d = com.google.vr.cardboard.g.g(this.f127001c.xdpi);
        this.f127003e = com.google.vr.cardboard.g.g(this.f127001c.ydpi);
        if (aVar2 != null) {
            int iC = aVar2.c();
            int iD = displayMetrics.widthPixels - aVar2.d();
            int iB = ((displayMetrics.heightPixels - aVar2.b()) + aVar2.e()) / 2;
            float[] fArr = this.f127017w;
            fArr[0] = ((iD + iC) / 2) - (displayMetrics.widthPixels / 2);
            fArr[1] = iB - (displayMetrics.heightPixels / 2);
        } else {
            float[] fArr2 = this.f127017w;
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
        }
        k();
    }

    protected abstract boolean g();

    protected abstract void h(int i10, com.google.common.logging.nano.a.C1088a c1088a);

    boolean j(MotionEvent motionEvent, float f10, float f11) {
        if (!o()) {
            this.f127011m = false;
            return false;
        }
        if (!g()) {
            return true;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > this.f127006h) {
            this.f127007i = new int[pointerCount];
            this.f127006h = pointerCount;
        }
        for (int i10 = 0; i10 < this.f127005g.length; i10++) {
            this.f127008j[i10] = -1;
            this.f127009k[i10] = 2.25E-4d;
        }
        for (int i11 = 0; i11 < pointerCount; i11++) {
            this.f127007i[i11] = -1;
            int i12 = 0;
            double d10 = 2.25E-4d;
            while (true) {
                float[][] fArr = this.f127005g;
                if (i12 < fArr.length) {
                    float x10 = (fArr[i12][0] - (motionEvent.getX(i11) + f10)) * this.f127002d;
                    float y10 = (this.f127005g[i12][1] - (motionEvent.getY(i11) + f11)) * this.f127003e;
                    double d11 = (x10 * x10) + (y10 * y10);
                    if (d11 < d10) {
                        this.f127007i[i11] = i12;
                        d10 = d11;
                    }
                    double[] dArr = this.f127009k;
                    if (d11 < dArr[i12]) {
                        dArr[i12] = d11;
                        this.f127008j[i12] = i11;
                    }
                    i12++;
                }
            }
        }
        int i13 = 0;
        int i14 = 0;
        float x11 = 0.0f;
        float y11 = 0.0f;
        while (true) {
            int[] iArr = this.f127008j;
            if (i13 >= iArr.length) {
                break;
            }
            int i15 = iArr[i13];
            if (i15 != -1) {
                if (this.f127007i[i15] != i13) {
                    iArr[i13] = -1;
                } else {
                    i14++;
                    x11 += (motionEvent.getX(i15) + f10) - this.f127005g[i13][0];
                    y11 += (motionEvent.getY(this.f127008j[i13]) + f11) - this.f127005g[i13][1];
                }
            }
            i13++;
        }
        if (i14 > 0) {
            this.f127011m = true;
            float[] fArr2 = this.f127010l;
            float f12 = i14;
            float f13 = x11 / f12;
            fArr2[0] = f13;
            float f14 = y11 / f12;
            fArr2[1] = f14;
            float[] fArr3 = this.f127017w;
            fArr2[0] = f13 + fArr3[0];
            fArr2[1] = f14 + fArr3[1];
        } else {
            this.f127011m = false;
            float[] fArr4 = this.f127010l;
            fArr4[0] = 0.0f;
            fArr4[1] = 0.0f;
        }
        if (i14 == 2 && this.f127016v) {
            this.f127015t = b(motionEvent);
        } else {
            this.f127015t = 0.0f;
        }
        if (pointerCount > 0) {
            int i16 = this.f127000b + 1;
            this.f127000b = i16;
            if (i16 == 200) {
                i(motionEvent, f10, f11);
            }
        }
        return true;
    }

    protected final void l(com.google.vr.sdk.proto.nano.a.c cVar) {
        com.google.vr.sdk.proto.nano.a.b bVar;
        com.google.vr.sdk.proto.nano.a.e[] eVarArr;
        if (cVar == null || (bVar = cVar.f129894t) == null || (eVarArr = bVar.f129872e) == null) {
            this.f127005g = null;
            return;
        }
        if (this.f127001c == null) {
            return;
        }
        this.f127005g = new float[eVarArr.length][];
        this.f127009k = new double[eVarArr.length];
        this.f127008j = new int[eVarArr.length];
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            com.google.vr.sdk.proto.nano.a.e eVar = eVarArr[i10];
            this.f127005g[i10] = new float[]{(this.f127001c.widthPixels / 2) + (eVar.s() / this.f127002d), 0.0f};
            this.f127005g[i10][1] = this.f127001c.heightPixels - (((eVar.t() + cVar.w()) - this.f127004f) / this.f127003e);
        }
        this.f127016v = cVar.f129894t.r();
    }

    public void m(boolean z10) {
        this.f127012n = z10;
        if (!z10) {
            k();
        }
    }

    protected abstract void n(float f10, float f11, float f12);

    boolean o() {
        float[][] fArr;
        return this.f127012n && (fArr = this.f127005g) != null && fArr.length > 0;
    }

    boolean p() {
        return this.f127011m;
    }
}
