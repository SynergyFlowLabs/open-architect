package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class j extends k {
    private static final String R = "KeyPosition";
    static final String S = "KeyPosition";
    public static final int T = 3;
    public static final int U = 2;
    public static final int V = 1;
    public static final int W = 0;
    public static final String X = "transitionEasing";
    public static final String Y = "drawPath";
    public static final String Z = "percentWidth";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f45205a0 = "percentHeight";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f45206b0 = "sizePercent";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f45207c0 = "percentX";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f45208d0 = "percentY";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    static final int f45209e0 = 2;
    String F = null;
    int G = f.f45121f;
    int H = 0;
    float I = Float.NaN;
    float J = Float.NaN;
    float K = Float.NaN;
    float L = Float.NaN;
    float M = Float.NaN;
    float N = Float.NaN;
    int O = 0;
    private float P = Float.NaN;
    private float Q = Float.NaN;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f45210a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f45211b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f45212c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f45213d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f45214e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f45215f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f45216g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f45217h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f45218i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f45219j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f45220k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f45221l = 12;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static SparseIntArray f45222m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f45222m = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.j.c.f46544la, 1);
            f45222m.append(androidx.constraintlayout.widget.j.c.f46510ja, 2);
            f45222m.append(androidx.constraintlayout.widget.j.c.f46663sa, 3);
            f45222m.append(androidx.constraintlayout.widget.j.c.f46477ha, 4);
            f45222m.append(androidx.constraintlayout.widget.j.c.f46494ia, 5);
            f45222m.append(androidx.constraintlayout.widget.j.c.f46612pa, 6);
            f45222m.append(androidx.constraintlayout.widget.j.c.f46629qa, 7);
            f45222m.append(androidx.constraintlayout.widget.j.c.f46527ka, 9);
            f45222m.append(androidx.constraintlayout.widget.j.c.f46646ra, 8);
            f45222m.append(androidx.constraintlayout.widget.j.c.f46595oa, 11);
            f45222m.append(androidx.constraintlayout.widget.j.c.f46578na, 12);
            f45222m.append(androidx.constraintlayout.widget.j.c.f46561ma, 10);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(j jVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f45222m.get(index)) {
                    case 1:
                        if (MotionLayout.f44987u4) {
                            int resourceId = typedArray.getResourceId(index, jVar.f45143b);
                            jVar.f45143b = resourceId;
                            if (resourceId == -1) {
                                jVar.f45144c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            jVar.f45144c = typedArray.getString(index);
                        } else {
                            jVar.f45143b = typedArray.getResourceId(index, jVar.f45143b);
                        }
                        break;
                    case 2:
                        jVar.f45142a = typedArray.getInt(index, jVar.f45142a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            jVar.F = typedArray.getString(index);
                        } else {
                            jVar.F = androidx.constraintlayout.core.motion.utils.d.f43750o[typedArray.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        jVar.D = typedArray.getInteger(index, jVar.D);
                        break;
                    case 5:
                        jVar.H = typedArray.getInt(index, jVar.H);
                        break;
                    case 6:
                        jVar.K = typedArray.getFloat(index, jVar.K);
                        break;
                    case 7:
                        jVar.L = typedArray.getFloat(index, jVar.L);
                        break;
                    case 8:
                        float f10 = typedArray.getFloat(index, jVar.J);
                        jVar.I = f10;
                        jVar.J = f10;
                        break;
                    case 9:
                        jVar.O = typedArray.getInt(index, jVar.O);
                        break;
                    case 10:
                        jVar.G = typedArray.getInt(index, jVar.G);
                        break;
                    case 11:
                        jVar.I = typedArray.getFloat(index, jVar.I);
                        break;
                    case 12:
                        jVar.J = typedArray.getFloat(index, jVar.J);
                        break;
                    default:
                        Integer.toHexString(index);
                        f45222m.get(index);
                        break;
                }
            }
            int i11 = jVar.f45142a;
        }
    }

    public j() {
        this.f45145d = 2;
    }

    private void t(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float f16 = Float.isNaN(this.K) ? 0.0f : this.K;
        float f17 = Float.isNaN(this.N) ? 0.0f : this.N;
        float f18 = Float.isNaN(this.L) ? 0.0f : this.L;
        this.P = (int) (f10 + (f16 * f14) + ((Float.isNaN(this.M) ? 0.0f : this.M) * f15));
        this.Q = (int) (f11 + (f14 * f17) + (f15 * f18));
    }

    private void u(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float f16 = this.K;
        float f17 = this.L;
        this.P = f10 + (f14 * f16) + ((-f15) * f17);
        this.Q = f11 + (f15 * f16) + (f14 * f17);
    }

    private void v(int i10, int i11) {
        float f10 = this.K;
        float f11 = 0;
        this.P = (i10 * f10) + f11;
        this.Q = (i11 * f10) + f11;
    }

    public void A(int i10) {
        this.O = i10;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* JADX INFO: renamed from: b */
    public f clone() {
        return new j().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f fVar) {
        super.c(fVar);
        j jVar = (j) fVar;
        this.F = jVar.F;
        this.G = jVar.G;
        this.H = jVar.H;
        this.I = jVar.I;
        this.J = Float.NaN;
        this.K = jVar.K;
        this.L = jVar.L;
        this.M = jVar.M;
        this.N = jVar.N;
        this.P = jVar.P;
        this.Q = jVar.Q;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.j.c.f46460ga));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "transitionEasing":
                this.F = obj.toString();
                break;
            case "percentWidth":
                this.I = m(obj);
                break;
            case "percentHeight":
                this.J = m(obj);
                break;
            case "drawPath":
                this.H = n(obj);
                break;
            case "sizePercent":
                float fM = m(obj);
                this.I = fM;
                this.J = fM;
                break;
            case "percentX":
                this.K = m(obj);
                break;
            case "percentY":
                this.L = m(obj);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.k
    void o(int i10, int i11, float f10, float f11, float f12, float f13) {
        int i12 = this.O;
        if (i12 == 1) {
            u(f10, f11, f12, f13);
        } else if (i12 != 2) {
            t(f10, f11, f12, f13);
        } else {
            v(i10, i11);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.k
    float p() {
        return this.P;
    }

    @Override // androidx.constraintlayout.motion.widget.k
    float q() {
        return this.Q;
    }

    @Override // androidx.constraintlayout.motion.widget.k
    public boolean r(int i10, int i11, RectF rectF, RectF rectF2, float f10, float f11) {
        o(i10, i11, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        return Math.abs(f10 - this.P) < 20.0f && Math.abs(f11 - this.Q) < 20.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.k
    public void s(View view, RectF rectF, RectF rectF2, float f10, float f11, String[] strArr, float[] fArr) {
        int i10 = this.O;
        if (i10 == 1) {
            y(rectF, rectF2, f10, f11, strArr, fArr);
            return;
        }
        if (i10 == 2) {
            z(view, rectF, rectF2, f10, f11, strArr, fArr);
        } else if (i10 != 3) {
            x(rectF, rectF2, f10, f11, strArr, fArr);
        } else {
            w(rectF, rectF2, f10, f11, strArr, fArr);
        }
    }

    void w(RectF rectF, RectF rectF2, float f10, float f11, String[] strArr, float[] fArr) {
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fCenterX2 = rectF2.centerX();
        float fCenterY2 = rectF2.centerY();
        if (fCenterX > fCenterX2) {
            fCenterX2 = fCenterX;
            fCenterX = fCenterX2;
        }
        if (fCenterY <= fCenterY2) {
            fCenterY2 = fCenterY;
            fCenterY = fCenterY2;
        }
        float f12 = fCenterX2 - fCenterX;
        float f13 = fCenterY - fCenterY2;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f10 - fCenterX) / f12;
            strArr[1] = "percentY";
            fArr[1] = (f11 - fCenterY2) / f13;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = (f10 - fCenterX) / f12;
            fArr[1] = (f11 - fCenterY2) / f13;
        } else {
            fArr[1] = (f10 - fCenterX) / f12;
            fArr[0] = (f11 - fCenterY2) / f13;
        }
    }

    void x(RectF rectF, RectF rectF2, float f10, float f11, String[] strArr, float[] fArr) {
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fCenterX2 = rectF2.centerX() - fCenterX;
        float fCenterY2 = rectF2.centerY() - fCenterY;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f10 - fCenterX) / fCenterX2;
            strArr[1] = "percentY";
            fArr[1] = (f11 - fCenterY) / fCenterY2;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = (f10 - fCenterX) / fCenterX2;
            fArr[1] = (f11 - fCenterY) / fCenterY2;
        } else {
            fArr[1] = (f10 - fCenterX) / fCenterX2;
            fArr[0] = (f11 - fCenterY) / fCenterY2;
        }
    }

    void y(RectF rectF, RectF rectF2, float f10, float f11, String[] strArr, float[] fArr) {
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fCenterX2 = rectF2.centerX() - fCenterX;
        float fCenterY2 = rectF2.centerY() - fCenterY;
        float fHypot = (float) Math.hypot(fCenterX2, fCenterY2);
        if (fHypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f12 = fCenterX2 / fHypot;
        float f13 = fCenterY2 / fHypot;
        float f14 = f11 - fCenterY;
        float f15 = f10 - fCenterX;
        float f16 = ((f12 * f14) - (f15 * f13)) / fHypot;
        float f17 = ((f12 * f15) + (f13 * f14)) / fHypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f17;
                fArr[1] = f16;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f17;
        fArr[1] = f16;
    }

    void z(View view, RectF rectF, RectF rectF2, float f10, float f11, String[] strArr, float[] fArr) {
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = f10 / width;
            strArr[1] = "percentY";
            fArr[1] = f11 / height;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = f10 / width;
            fArr[1] = f11 / height;
        } else {
            fArr[1] = f10 / width;
            fArr[0] = f11 / height;
        }
    }
}
