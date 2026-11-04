package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class o {
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 3;
    public static final int R = 4;
    public static final int S = 5;
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;
    public static final int X = 4;
    public static final int Y = 5;
    public static final int Z = 6;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f45308a0 = 1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f45309b0 = 2;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f45310c0 = "MotionController";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final boolean f45311d0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final boolean f45312e0 = false;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    static final int f45313f0 = 0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    static final int f45314g0 = 1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    static final int f45315h0 = 2;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    static final int f45316i0 = 3;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    static final int f45317j0 = 4;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    static final int f45318k0 = 5;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int f45319l0 = -1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final int f45320m0 = -2;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final int f45321n0 = -3;
    private HashMap<String, androidx.constraintlayout.motion.utils.f> B;
    private HashMap<String, androidx.constraintlayout.motion.utils.d> C;
    private HashMap<String, androidx.constraintlayout.motion.utils.c> D;
    private m[] E;
    private int F;
    private int G;
    private View H;
    private int I;
    private float J;
    private Interpolator K;
    private boolean L;
    String[] M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    View f45323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f45324c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f45326e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b[] f45332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b f45333l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f45337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float f45338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int[] f45339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private double[] f45340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double[] f45341t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String[] f45342u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int[] f45343v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Rect f45322a = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f45325d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45327f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s f45328g = new s();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s f45329h = new s();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n f45330i = new n();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n f45331j = new n();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f45334m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f45335n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f45336o = 1.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f45344w = 4;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float[] f45345x = new float[4];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ArrayList<s> f45346y = new ArrayList<>();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float[] f45347z = new float[1];
    private ArrayList<f> A = new ArrayList<>();

    class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f45348a;

        a(androidx.constraintlayout.core.motion.utils.d dVar) {
            this.f45348a = dVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) this.f45348a.a(f10);
        }
    }

    o(View view) {
        int i10 = f.f45121f;
        this.F = i10;
        this.G = i10;
        this.H = null;
        this.I = i10;
        this.J = Float.NaN;
        this.K = null;
        this.L = false;
        Z(view);
    }

    private float D() {
        float[] fArr = new float[2];
        float f10 = 1.0f / 99;
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i10 = 0;
        float fHypot = 0.0f;
        while (i10 < 100) {
            float f11 = i10 * f10;
            double dA = f11;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f45328g.f45362a;
            float f12 = Float.NaN;
            float f13 = 0.0f;
            for (s sVar : this.f45346y) {
                androidx.constraintlayout.core.motion.utils.d dVar2 = sVar.f45362a;
                if (dVar2 != null) {
                    float f14 = sVar.f45364c;
                    if (f14 < f11) {
                        dVar = dVar2;
                        f13 = f14;
                    } else if (Float.isNaN(f12)) {
                        f12 = sVar.f45364c;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f12)) {
                    f12 = 1.0f;
                }
                float f15 = f12 - f13;
                dA = (((float) dVar.a((f11 - f13) / f15)) * f15) + f13;
            }
            double d12 = dA;
            this.f45332k[0].d(d12, this.f45340s);
            int i11 = i10;
            this.f45328g.n(d12, this.f45339r, this.f45340s, fArr, 0);
            if (i11 > 0) {
                fHypot += (float) Math.hypot(d11 - ((double) fArr[1]), d10 - ((double) fArr[0]));
            }
            d10 = fArr[0];
            d11 = fArr[1];
            i10 = i11 + 1;
        }
        return fHypot;
    }

    private void K(s sVar) {
        int iBinarySearch = Collections.binarySearch(this.f45346y, sVar);
        if (iBinarySearch == 0) {
            float f10 = sVar.f45365d;
        }
        this.f45346y.add((-iBinarySearch) - 1, sVar);
    }

    private void O(s sVar) {
        sVar.E((int) this.f45323b.getX(), (int) this.f45323b.getY(), this.f45323b.getWidth(), this.f45323b.getHeight());
    }

    private float j(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f45336o;
            if (f12 != 1.0d) {
                float f13 = this.f45335n;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        androidx.constraintlayout.core.motion.utils.d dVar = this.f45328g.f45362a;
        float f14 = Float.NaN;
        for (s sVar : this.f45346y) {
            androidx.constraintlayout.core.motion.utils.d dVar2 = sVar.f45362a;
            if (dVar2 != null) {
                float f15 = sVar.f45364c;
                if (f15 < f10) {
                    dVar = dVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = sVar.f45364c;
                }
            }
        }
        if (dVar == null) {
            return f10;
        }
        float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
        double d10 = (f10 - f11) / f16;
        float fA = (((float) dVar.a(d10)) * f16) + f11;
        if (fArr != null) {
            fArr[0] = (float) dVar.b(d10);
        }
        return fA;
    }

    private static Interpolator v(Context context, int i10, String str, int i11) {
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(context, i11);
        }
        if (i10 == -1) {
            return new a(androidx.constraintlayout.core.motion.utils.d.c(str));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    double[] A(double d10) {
        this.f45332k[0].d(d10, this.f45340s);
        androidx.constraintlayout.core.motion.utils.b bVar = this.f45333l;
        if (bVar != null) {
            double[] dArr = this.f45340s;
            if (dArr.length > 0) {
                bVar.d(d10, dArr);
            }
        }
        return this.f45340s;
    }

    k B(int i10, int i11, float f10, float f11) {
        int i12;
        int i13;
        float f12;
        float f13;
        RectF rectF = new RectF();
        s sVar = this.f45328g;
        float f14 = sVar.f45366e;
        rectF.left = f14;
        float f15 = sVar.f45367f;
        rectF.top = f15;
        rectF.right = f14 + sVar.f45368g;
        rectF.bottom = f15 + sVar.f45369h;
        RectF rectF2 = new RectF();
        s sVar2 = this.f45329h;
        float f16 = sVar2.f45366e;
        rectF2.left = f16;
        float f17 = sVar2.f45367f;
        rectF2.top = f17;
        rectF2.right = f16 + sVar2.f45368g;
        rectF2.bottom = f17 + sVar2.f45369h;
        for (f fVar : this.A) {
            if (fVar instanceof k) {
                k kVar = (k) fVar;
                i12 = i10;
                i13 = i11;
                f12 = f10;
                f13 = f11;
                if (kVar.r(i12, i13, rectF, rectF2, f12, f13)) {
                    return kVar;
                }
            } else {
                i12 = i10;
                i13 = i11;
                f12 = f10;
                f13 = f11;
            }
            i10 = i12;
            i11 = i13;
            f10 = f12;
            f11 = f13;
        }
        return null;
    }

    void C(float f10, int i10, int i11, float f11, float f12, float[] fArr) {
        float fJ = j(f10, this.f45347z);
        HashMap<String, androidx.constraintlayout.motion.utils.d> map = this.C;
        androidx.constraintlayout.motion.utils.d dVar = map == null ? null : map.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.d> map2 = this.C;
        androidx.constraintlayout.motion.utils.d dVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, androidx.constraintlayout.motion.utils.d> map3 = this.C;
        androidx.constraintlayout.motion.utils.d dVar3 = map3 == null ? null : map3.get(f.f45124i);
        HashMap<String, androidx.constraintlayout.motion.utils.d> map4 = this.C;
        androidx.constraintlayout.motion.utils.d dVar4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, androidx.constraintlayout.motion.utils.d> map5 = this.C;
        androidx.constraintlayout.motion.utils.d dVar5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map6 = this.D;
        androidx.constraintlayout.motion.utils.c cVar = map6 == null ? null : map6.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map7 = this.D;
        androidx.constraintlayout.motion.utils.c cVar2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map8 = this.D;
        androidx.constraintlayout.motion.utils.c cVar3 = map8 == null ? null : map8.get(f.f45124i);
        HashMap<String, androidx.constraintlayout.motion.utils.c> map9 = this.D;
        androidx.constraintlayout.motion.utils.c cVar4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map10 = this.D;
        androidx.constraintlayout.motion.utils.c cVar5 = map10 != null ? map10.get("scaleY") : null;
        androidx.constraintlayout.core.motion.utils.x xVar = new androidx.constraintlayout.core.motion.utils.x();
        xVar.b();
        xVar.d(dVar3, fJ);
        xVar.h(dVar, dVar2, fJ);
        xVar.f(dVar4, dVar5, fJ);
        xVar.c(cVar3, fJ);
        xVar.g(cVar, cVar2, fJ);
        xVar.e(cVar4, cVar5, fJ);
        androidx.constraintlayout.core.motion.utils.b bVar = this.f45333l;
        if (bVar != null) {
            double[] dArr = this.f45340s;
            if (dArr.length > 0) {
                double d10 = fJ;
                bVar.d(d10, dArr);
                this.f45333l.g(d10, this.f45341t);
                this.f45328g.H(f11, f12, fArr, this.f45339r, this.f45341t, this.f45340s);
            }
            xVar.a(f11, f12, i10, i11, fArr);
            return;
        }
        int i12 = 0;
        if (this.f45332k == null) {
            s sVar = this.f45329h;
            float f13 = sVar.f45366e;
            s sVar2 = this.f45328g;
            float f14 = f13 - sVar2.f45366e;
            float f15 = sVar.f45367f - sVar2.f45367f;
            float f16 = (sVar.f45368g - sVar2.f45368g) + f14;
            float f17 = f15 + (sVar.f45369h - sVar2.f45369h);
            fArr[0] = (f14 * (1.0f - f11)) + (f16 * f11);
            fArr[1] = (f15 * (1.0f - f12)) + (f17 * f12);
            xVar.b();
            xVar.d(dVar3, fJ);
            xVar.h(dVar, dVar2, fJ);
            xVar.f(dVar4, dVar5, fJ);
            xVar.c(cVar3, fJ);
            xVar.g(cVar, cVar2, fJ);
            xVar.e(cVar4, cVar5, fJ);
            xVar.a(f11, f12, i10, i11, fArr);
            return;
        }
        double dJ = j(fJ, this.f45347z);
        this.f45332k[0].g(dJ, this.f45341t);
        this.f45332k[0].d(dJ, this.f45340s);
        float f18 = this.f45347z[0];
        while (true) {
            double[] dArr2 = this.f45341t;
            if (i12 >= dArr2.length) {
                this.f45328g.H(f11, f12, fArr, this.f45339r, dArr2, this.f45340s);
                xVar.a(f11, f12, i10, i11, fArr);
                return;
            } else {
                dArr2[i12] = dArr2[i12] * ((double) f18);
                i12++;
            }
        }
    }

    public float E() {
        return this.f45328g.f45369h;
    }

    public float F() {
        return this.f45328g.f45368g;
    }

    public float G() {
        return this.f45328g.f45366e;
    }

    public float H() {
        return this.f45328g.f45367f;
    }

    public int I() {
        return this.G;
    }

    public View J() {
        return this.f45323b;
    }

    boolean L(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
        androidx.constraintlayout.motion.utils.f.d dVar;
        boolean zK;
        View view2;
        View view3;
        float f11;
        double d10;
        View view4 = view;
        float fJ = j(f10, null);
        int i10 = this.I;
        if (i10 != f.f45121f) {
            float f12 = 1.0f / i10;
            float fFloor = ((float) Math.floor(fJ / f12)) * f12;
            float f13 = (fJ % f12) / f12;
            if (!Float.isNaN(this.J)) {
                f13 = (f13 + this.J) % 1.0f;
            }
            Interpolator interpolator = this.K;
            fJ = ((interpolator != null ? interpolator.getInterpolation(f13) : ((double) f13) > 0.5d ? 1.0f : 0.0f) * f12) + fFloor;
        }
        HashMap<String, androidx.constraintlayout.motion.utils.d> map = this.C;
        if (map != null) {
            Iterator<androidx.constraintlayout.motion.utils.d> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().m(view4, fJ);
            }
        }
        HashMap<String, androidx.constraintlayout.motion.utils.f> map2 = this.B;
        if (map2 != null) {
            androidx.constraintlayout.motion.utils.f.d dVar2 = null;
            boolean zJ = false;
            for (androidx.constraintlayout.motion.utils.f fVar : map2.values()) {
                if (fVar instanceof androidx.constraintlayout.motion.utils.f.d) {
                    dVar2 = (androidx.constraintlayout.motion.utils.f.d) fVar;
                } else {
                    zJ |= fVar.j(view4, fJ, j10, gVar);
                    view4 = view;
                }
            }
            zK = zJ;
            dVar = dVar2;
        } else {
            dVar = null;
            zK = false;
        }
        androidx.constraintlayout.core.motion.utils.b[] bVarArr = this.f45332k;
        if (bVarArr != null) {
            double d11 = fJ;
            bVarArr[0].d(d11, this.f45340s);
            this.f45332k[0].g(d11, this.f45341t);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f45333l;
            if (bVar != null) {
                double[] dArr = this.f45340s;
                if (dArr.length > 0) {
                    bVar.d(d11, dArr);
                    this.f45333l.g(d11, this.f45341t);
                }
            }
            if (this.L) {
                view3 = view;
                f11 = 0.0f;
                d10 = d11;
            } else {
                float f14 = fJ;
                d10 = d11;
                f11 = 0.0f;
                this.f45328g.I(f14, view, this.f45339r, this.f45340s, this.f45341t, null, this.f45325d);
                fJ = f14;
                view3 = view;
                this.f45325d = false;
            }
            if (this.G != f.f45121f) {
                if (this.H == null) {
                    this.H = ((View) view3.getParent()).findViewById(this.G);
                }
                View view5 = this.H;
                if (view5 != null) {
                    float top = (view5.getTop() + this.H.getBottom()) / 2.0f;
                    float left = (this.H.getLeft() + this.H.getRight()) / 2.0f;
                    if (view3.getRight() - view3.getLeft() > 0 && view3.getBottom() - view3.getTop() > 0) {
                        float left2 = left - view3.getLeft();
                        float top2 = top - view3.getTop();
                        view3.setPivotX(left2);
                        view3.setPivotY(top2);
                    }
                }
            }
            HashMap<String, androidx.constraintlayout.motion.utils.d> map3 = this.C;
            if (map3 != null) {
                for (androidx.constraintlayout.motion.utils.d dVar3 : map3.values()) {
                    if (dVar3 instanceof androidx.constraintlayout.motion.utils.d.C0365d) {
                        double[] dArr2 = this.f45341t;
                        if (dArr2.length > 1) {
                            ((androidx.constraintlayout.motion.utils.d.C0365d) dVar3).n(view3, fJ, dArr2[0], dArr2[1]);
                        }
                    }
                    view3 = view;
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.f45341t;
                view2 = view;
                float f15 = fJ;
                fJ = f15;
                zK |= dVar.k(view2, gVar, f15, j10, dArr3[0], dArr3[1]);
            } else {
                view2 = view;
            }
            int i11 = 1;
            while (true) {
                androidx.constraintlayout.core.motion.utils.b[] bVarArr2 = this.f45332k;
                if (i11 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i11].e(d10, this.f45345x);
                androidx.constraintlayout.motion.utils.a.b(this.f45328g.f45376o.get(this.f45342u[i11 - 1]), view2, this.f45345x);
                i11++;
            }
            n nVar = this.f45330i;
            if (nVar.f45284b == 0) {
                if (fJ <= f11) {
                    view2.setVisibility(nVar.f45285c);
                } else if (fJ >= 1065353216) {
                    view2.setVisibility(this.f45331j.f45285c);
                } else if (this.f45331j.f45285c != nVar.f45285c) {
                    view2.setVisibility(0);
                }
            }
            if (this.E != null) {
                int i12 = 0;
                while (true) {
                    m[] mVarArr = this.E;
                    if (i12 >= mVarArr.length) {
                        break;
                    }
                    mVarArr[i12].A(fJ, view2);
                    i12++;
                }
            }
        } else {
            view2 = view;
            s sVar = this.f45328g;
            float f16 = sVar.f45366e;
            s sVar2 = this.f45329h;
            float f17 = f16 + ((sVar2.f45366e - f16) * fJ);
            float f18 = sVar.f45367f;
            float f19 = f18 + ((sVar2.f45367f - f18) * fJ);
            float f20 = sVar.f45368g;
            float f21 = sVar2.f45368g;
            float f22 = sVar.f45369h;
            float f23 = sVar2.f45369h;
            float f24 = f17 + 0.5f;
            int i13 = (int) f24;
            float f25 = f19 + 0.5f;
            int i14 = (int) f25;
            int i15 = (int) (f24 + ((f21 - f20) * fJ) + f20);
            int i16 = (int) (f25 + ((f23 - f22) * fJ) + f22);
            int i17 = i15 - i13;
            int i18 = i16 - i14;
            if (f21 != f20 || f23 != f22 || this.f45325d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                this.f45325d = false;
            }
            view2.layout(i13, i14, i15, i16);
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> map4 = this.D;
        if (map4 != null) {
            for (androidx.constraintlayout.motion.utils.c cVar : map4.values()) {
                if (cVar instanceof androidx.constraintlayout.motion.utils.c.d) {
                    double[] dArr4 = this.f45341t;
                    ((androidx.constraintlayout.motion.utils.c.d) cVar).n(view2, fJ, dArr4[0], dArr4[1]);
                } else {
                    cVar.m(view2, fJ);
                }
            }
        }
        return zK;
    }

    String M() {
        return this.f45323b.getContext().getResources().getResourceEntryName(this.f45323b.getId());
    }

    void N(View view, k kVar, float f10, float f11, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        s sVar = this.f45328g;
        float f12 = sVar.f45366e;
        rectF.left = f12;
        float f13 = sVar.f45367f;
        rectF.top = f13;
        rectF.right = f12 + sVar.f45368g;
        rectF.bottom = f13 + sVar.f45369h;
        RectF rectF2 = new RectF();
        s sVar2 = this.f45329h;
        float f14 = sVar2.f45366e;
        rectF2.left = f14;
        float f15 = sVar2.f45367f;
        rectF2.top = f15;
        rectF2.right = f14 + sVar2.f45368g;
        rectF2.bottom = f15 + sVar2.f45369h;
        kVar.s(view, rectF, rectF2, f10, f11, strArr, fArr);
    }

    public void P() {
        this.f45325d = true;
    }

    void Q(Rect rect, Rect rect2, int i10, int i11, int i12) {
        if (i10 == 1) {
            int i13 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i12 - ((i13 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i10 == 2) {
            int i14 = rect.left + rect.right;
            rect2.left = i11 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i14 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i10 == 3) {
            int i15 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i15 / 2);
            rect2.top = i12 - ((i15 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        int i16 = 4 >> 4;
        if (i10 != 4) {
            return;
        }
        int i17 = rect.left + rect.right;
        rect2.left = i11 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i17 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    void R(View view) {
        s sVar = this.f45328g;
        sVar.f45364c = 0.0f;
        sVar.f45365d = 0.0f;
        this.L = true;
        sVar.E(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f45329h.E(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f45330i.v(view);
        this.f45331j.v(view);
    }

    public void S(int i10) {
        this.f45328g.f45363b = i10;
    }

    void T(Rect rect, androidx.constraintlayout.widget.f fVar, int i10, int i11) {
        o oVar;
        int i12 = fVar.f45918e;
        if (i12 != 0) {
            oVar = this;
            oVar.Q(rect, this.f45322a, i12, i10, i11);
            rect = oVar.f45322a;
        } else {
            oVar = this;
        }
        s sVar = oVar.f45329h;
        sVar.f45364c = 1.0f;
        sVar.f45365d = 1.0f;
        oVar.O(sVar);
        oVar.f45329h.E(rect.left, rect.top, rect.width(), rect.height());
        oVar.f45329h.b(fVar.q0(oVar.f45324c));
        oVar.f45331j.t(rect, fVar, i12, oVar.f45324c);
    }

    public void U(int i10) {
        this.F = i10;
    }

    void V(View view) {
        s sVar = this.f45328g;
        sVar.f45364c = 0.0f;
        sVar.f45365d = 0.0f;
        sVar.E(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f45330i.v(view);
    }

    void W(Rect rect, androidx.constraintlayout.widget.f fVar, int i10, int i11) {
        o oVar;
        Rect rect2;
        int i12 = fVar.f45918e;
        if (i12 != 0) {
            oVar = this;
            rect2 = rect;
            oVar.Q(rect2, this.f45322a, i12, i10, i11);
        } else {
            oVar = this;
            rect2 = rect;
        }
        s sVar = oVar.f45328g;
        sVar.f45364c = 0.0f;
        sVar.f45365d = 0.0f;
        oVar.O(sVar);
        oVar.f45328g.E(rect2.left, rect2.top, rect2.width(), rect2.height());
        androidx.constraintlayout.widget.f.a aVarQ0 = fVar.q0(oVar.f45324c);
        oVar.f45328g.b(aVarQ0);
        oVar.f45334m = aVarQ0.f45925d.f46042g;
        oVar.f45330i.t(rect2, fVar, i12, oVar.f45324c);
        oVar.G = aVarQ0.f45927f.f46075i;
        androidx.constraintlayout.widget.f.c cVar = aVarQ0.f45925d;
        oVar.I = cVar.f46046k;
        oVar.J = cVar.f46045j;
        Context context = oVar.f45323b.getContext();
        androidx.constraintlayout.widget.f.c cVar2 = aVarQ0.f45925d;
        oVar.K = v(context, cVar2.f46048m, cVar2.f46047l, cVar2.f46049n);
    }

    public void X(androidx.constraintlayout.motion.utils.e eVar, View view, int i10, int i11, int i12) {
        s sVar = this.f45328g;
        sVar.f45364c = 0.0f;
        sVar.f45365d = 0.0f;
        Rect rect = new Rect();
        if (i10 == 1) {
            int i13 = eVar.f44967b + eVar.f44969d;
            rect.left = ((eVar.f44968c + eVar.f44970e) - eVar.c()) / 2;
            rect.top = i11 - ((i13 + eVar.b()) / 2);
            rect.right = rect.left + eVar.c();
            rect.bottom = rect.top + eVar.b();
        } else if (i10 == 2) {
            int i14 = eVar.f44967b + eVar.f44969d;
            rect.left = i12 - (((eVar.f44968c + eVar.f44970e) + eVar.c()) / 2);
            rect.top = (i14 - eVar.b()) / 2;
            rect.right = rect.left + eVar.c();
            rect.bottom = rect.top + eVar.b();
        }
        this.f45328g.E(rect.left, rect.top, rect.width(), rect.height());
        this.f45330i.s(rect, view, i10, eVar.f44966a);
    }

    public void Y(int i10) {
        this.G = i10;
        this.H = null;
    }

    public void Z(View view) {
        this.f45323b = view;
        this.f45324c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.f45326e = ((ConstraintLayout.b) layoutParams).a();
        }
    }

    public void a(f fVar) {
        this.A.add(fVar);
    }

    public void a0(int i10, int i11, float f10, long j10) {
        ArrayList arrayList;
        String[] strArr;
        androidx.constraintlayout.widget.a aVar;
        androidx.constraintlayout.motion.utils.f fVarI;
        androidx.constraintlayout.widget.a aVar2;
        Integer num;
        androidx.constraintlayout.motion.utils.d dVarL;
        androidx.constraintlayout.widget.a aVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i12 = this.F;
        if (i12 != f.f45121f) {
            this.f45328g.f45372k = i12;
        }
        this.f45330i.k(this.f45331j, hashSet2);
        ArrayList<f> arrayList2 = this.A;
        if (arrayList2 != null) {
            arrayList = null;
            for (f fVar : arrayList2) {
                if (fVar instanceof j) {
                    j jVar = (j) fVar;
                    K(new s(i10, i11, jVar, this.f45328g, this.f45329h));
                    int i13 = jVar.D;
                    if (i13 != f.f45121f) {
                        this.f45327f = i13;
                    }
                } else if (fVar instanceof h) {
                    fVar.d(hashSet3);
                } else if (fVar instanceof l) {
                    fVar.d(hashSet);
                } else if (fVar instanceof m) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((m) fVar);
                } else {
                    fVar.i(map);
                    fVar.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i14 = 0;
        if (arrayList != null) {
            this.E = (m[]) arrayList.toArray(new m[0]);
        }
        char c10 = 1;
        if (!hashSet2.isEmpty()) {
            this.C = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    for (f fVar2 : this.A) {
                        HashMap<String, androidx.constraintlayout.widget.a> map2 = fVar2.f45146e;
                        if (map2 != null && (aVar3 = map2.get(str2)) != null) {
                            sparseArray.append(fVar2.f45142a, aVar3);
                        }
                    }
                    dVarL = androidx.constraintlayout.motion.utils.d.k(str, sparseArray);
                } else {
                    dVarL = androidx.constraintlayout.motion.utils.d.l(str);
                }
                if (dVarL != null) {
                    dVarL.i(str);
                    this.C.put(str, dVarL);
                }
            }
            ArrayList<f> arrayList3 = this.A;
            if (arrayList3 != null) {
                for (f fVar3 : arrayList3) {
                    if (fVar3 instanceof g) {
                        fVar3.a(this.C);
                    }
                }
            }
            this.f45330i.b(this.C, 0);
            this.f45331j.b(this.C, 100);
            for (String str3 : this.C.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                androidx.constraintlayout.motion.utils.d dVar = this.C.get(str3);
                if (dVar != null) {
                    dVar.j(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.B == null) {
                this.B = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.B.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        for (f fVar4 : this.A) {
                            HashMap<String, androidx.constraintlayout.widget.a> map3 = fVar4.f45146e;
                            if (map3 != null && (aVar2 = map3.get(str5)) != null) {
                                sparseArray2.append(fVar4.f45142a, aVar2);
                            }
                        }
                        fVarI = androidx.constraintlayout.motion.utils.f.h(str4, sparseArray2);
                    } else {
                        fVarI = androidx.constraintlayout.motion.utils.f.i(str4, j10);
                    }
                    if (fVarI != null) {
                        fVarI.e(str4);
                        this.B.put(str4, fVarI);
                    }
                }
            }
            ArrayList<f> arrayList4 = this.A;
            if (arrayList4 != null) {
                for (f fVar5 : arrayList4) {
                    if (fVar5 instanceof l) {
                        ((l) fVar5).W(this.B);
                    }
                }
            }
            for (String str6 : this.B.keySet()) {
                this.B.get(str6).f(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.f45346y.size();
        int i15 = size + 2;
        s[] sVarArr = new s[i15];
        sVarArr[0] = this.f45328g;
        sVarArr[size + 1] = this.f45329h;
        if (this.f45346y.size() > 0 && this.f45327f == -1) {
            this.f45327f = 0;
        }
        Iterator<s> it = this.f45346y.iterator();
        int i16 = 1;
        while (it.hasNext()) {
            sVarArr[i16] = it.next();
            i16++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f45329h.f45376o.keySet()) {
            if (this.f45328g.f45376o.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f45342u = strArr2;
        this.f45343v = new int[strArr2.length];
        int i17 = 0;
        while (true) {
            strArr = this.f45342u;
            if (i17 >= strArr.length) {
                break;
            }
            String str8 = strArr[i17];
            this.f45343v[i17] = 0;
            for (int i18 = 0; i18 < i15; i18++) {
                if (sVarArr[i18].f45376o.containsKey(str8) && (aVar = sVarArr[i18].f45376o.get(str8)) != null) {
                    int[] iArr = this.f45343v;
                    iArr[i17] = iArr[i17] + aVar.p();
                    break;
                }
            }
            i17++;
        }
        boolean z10 = sVarArr[0].f45372k != f.f45121f;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i19 = 1; i19 < i15; i19++) {
            sVarArr[i19].f(sVarArr[i19 - 1], zArr, this.f45342u, z10);
        }
        int i20 = 0;
        for (int i21 = 1; i21 < length; i21++) {
            if (zArr[i21]) {
                i20++;
            }
        }
        this.f45339r = new int[i20];
        int i22 = 2;
        int iMax = Math.max(2, i20);
        this.f45340s = new double[iMax];
        this.f45341t = new double[iMax];
        int i23 = 0;
        for (int i24 = 1; i24 < length; i24++) {
            if (zArr[i24]) {
                this.f45339r[i23] = i24;
                i23++;
            }
        }
        int[] iArr2 = {i15, this.f45339r.length};
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i15];
        for (int i25 = 0; i25 < i15; i25++) {
            sVarArr[i25].k(dArr[i25], this.f45339r);
            dArr2[i25] = sVarArr[i25].f45364c;
        }
        int i26 = 0;
        while (true) {
            int[] iArr3 = this.f45339r;
            if (i26 >= iArr3.length) {
                break;
            }
            if (iArr3[i26] < s.f45358l3.length) {
                String str9 = s.f45358l3[this.f45339r[i26]] + " [";
                for (int i27 = 0; i27 < i15; i27++) {
                    str9 = str9 + dArr[i27][i26];
                }
            }
            i26++;
        }
        this.f45332k = new androidx.constraintlayout.core.motion.utils.b[this.f45342u.length + 1];
        int i28 = 0;
        while (true) {
            String[] strArr3 = this.f45342u;
            if (i28 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i28];
            int i29 = i14;
            int i30 = i29;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i29 < i15) {
                char c11 = c10;
                if (sVarArr[i29].t(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i15];
                        int[] iArr4 = new int[i22];
                        iArr4[c11] = sVarArr[i29].r(str10);
                        iArr4[i14] = i15;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    }
                    s sVar = sVarArr[i29];
                    dArr3[i30] = sVar.f45364c;
                    sVar.q(str10, dArr4[i30], 0);
                    i30++;
                }
                i29++;
                c10 = c11;
                sVarArr = sVarArr;
                i22 = 2;
                i14 = 0;
            }
            i28++;
            this.f45332k[i28] = androidx.constraintlayout.core.motion.utils.b.a(this.f45327f, Arrays.copyOf(dArr3, i30), (double[][]) Arrays.copyOf(dArr4, i30));
            c10 = c10;
            sVarArr = sVarArr;
            i22 = 2;
            i14 = 0;
        }
        s[] sVarArr2 = sVarArr;
        char c12 = c10;
        this.f45332k[0] = androidx.constraintlayout.core.motion.utils.b.a(this.f45327f, dArr2, dArr);
        if (sVarArr2[0].f45372k != f.f45121f) {
            int[] iArr5 = new int[i15];
            double[] dArr5 = new double[i15];
            int[] iArr6 = new int[2];
            iArr6[c12] = 2;
            iArr6[0] = i15;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i31 = 0; i31 < i15; i31++) {
                s sVar2 = sVarArr2[i31];
                iArr5[i31] = sVar2.f45372k;
                dArr5[i31] = sVar2.f45364c;
                double[] dArr7 = dArr6[i31];
                dArr7[0] = sVar2.f45366e;
                dArr7[c12] = sVar2.f45367f;
            }
            this.f45333l = androidx.constraintlayout.core.motion.utils.b.b(iArr5, dArr5, dArr6);
        }
        this.D = new HashMap<>();
        if (this.A != null) {
            float fD = Float.NaN;
            for (String str11 : hashSet3) {
                androidx.constraintlayout.motion.utils.c cVarL = androidx.constraintlayout.motion.utils.c.l(str11);
                if (cVarL != null) {
                    if (cVarL.k() && Float.isNaN(fD)) {
                        fD = D();
                    }
                    cVarL.i(str11);
                    this.D.put(str11, cVarL);
                }
            }
            for (f fVar6 : this.A) {
                if (fVar6 instanceof h) {
                    ((h) fVar6).a0(this.D);
                }
            }
            Iterator<androidx.constraintlayout.motion.utils.c> it2 = this.D.values().iterator();
            while (it2.hasNext()) {
                it2.next().j(fD);
            }
        }
    }

    void b(ArrayList<f> arrayList) {
        this.A.addAll(arrayList);
    }

    public void b0(o oVar) {
        this.f45328g.L(oVar, oVar.f45328g);
        this.f45329h.L(oVar, oVar.f45329h);
    }

    void c(float[] fArr, int i10) {
        float f10 = 1.0f / (i10 - 1);
        HashMap<String, androidx.constraintlayout.motion.utils.d> map = this.C;
        if (map != null) {
            map.get("translationX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.d> map2 = this.C;
        if (map2 != null) {
            map2.get("translationY");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> map3 = this.D;
        if (map3 != null) {
            map3.get("translationX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> map4 = this.D;
        if (map4 != null) {
            map4.get("translationY");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            float fMin = i11 * f10;
            float f11 = this.f45336o;
            float f12 = 0.0f;
            if (f11 != 1.0f) {
                float f13 = this.f45335n;
                if (fMin < f13) {
                    fMin = 0.0f;
                }
                if (fMin > f13 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f13) * f11, 1.0f);
                }
            }
            double dA = fMin;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f45328g.f45362a;
            float f14 = Float.NaN;
            for (s sVar : this.f45346y) {
                androidx.constraintlayout.core.motion.utils.d dVar2 = sVar.f45362a;
                if (dVar2 != null) {
                    float f15 = sVar.f45364c;
                    if (f15 < fMin) {
                        dVar = dVar2;
                        f12 = f15;
                    } else if (Float.isNaN(f14)) {
                        f14 = sVar.f45364c;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f14)) {
                    f14 = 1.0f;
                }
                float f16 = f14 - f12;
                dA = (((float) dVar.a((fMin - f12) / f16)) * f16) + f12;
            }
            this.f45332k[0].d(dA, this.f45340s);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f45333l;
            if (bVar != null) {
                double[] dArr = this.f45340s;
                if (dArr.length > 0) {
                    bVar.d(dA, dArr);
                }
            }
            this.f45328g.l(this.f45339r, this.f45340s, fArr, i11 * 2);
        }
    }

    int d(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrH = this.f45332k[0].h();
        if (iArr != null) {
            Iterator<s> it = this.f45346y.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = it.next().f45377s;
                i10++;
            }
        }
        int i11 = 0;
        for (double d10 : dArrH) {
            this.f45332k[0].d(d10, this.f45340s);
            this.f45328g.l(this.f45339r, this.f45340s, fArr, i11);
            i11 += 2;
        }
        return i11 / 2;
    }

    int e(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrH = this.f45332k[0].h();
        if (iArr != null) {
            Iterator<s> it = this.f45346y.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = it.next().f45377s;
                i10++;
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < dArrH.length; i12++) {
            this.f45332k[0].d(dArrH[i12], this.f45340s);
            this.f45328g.n(dArrH[i12], this.f45339r, this.f45340s, fArr, i11);
            i11 += 2;
        }
        return i11 / 2;
    }

    void f(float[] fArr, int i10) {
        int i11 = i10;
        float f10 = 1.0f;
        float f11 = 1.0f / (i11 - 1);
        HashMap<String, androidx.constraintlayout.motion.utils.d> map = this.C;
        androidx.constraintlayout.motion.utils.d dVar = map == null ? null : map.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.d> map2 = this.C;
        androidx.constraintlayout.motion.utils.d dVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map3 = this.D;
        androidx.constraintlayout.motion.utils.c cVar = map3 == null ? null : map3.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map4 = this.D;
        androidx.constraintlayout.motion.utils.c cVar2 = map4 != null ? map4.get("translationY") : null;
        int i12 = 0;
        while (i12 < i11) {
            float fMin = i12 * f11;
            float f12 = this.f45336o;
            float f13 = 0.0f;
            if (f12 != f10) {
                float f14 = this.f45335n;
                if (fMin < f14) {
                    fMin = 0.0f;
                }
                if (fMin > f14 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f14) * f12, f10);
                }
            }
            double dA = fMin;
            androidx.constraintlayout.core.motion.utils.d dVar3 = this.f45328g.f45362a;
            float f15 = Float.NaN;
            for (s sVar : this.f45346y) {
                androidx.constraintlayout.core.motion.utils.d dVar4 = sVar.f45362a;
                if (dVar4 != null) {
                    float f16 = sVar.f45364c;
                    if (f16 < fMin) {
                        f13 = f16;
                        dVar3 = dVar4;
                    } else if (Float.isNaN(f15)) {
                        f15 = sVar.f45364c;
                    }
                }
            }
            if (dVar3 != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                float f17 = f15 - f13;
                dA = (((float) dVar3.a((fMin - f13) / f17)) * f17) + f13;
            }
            this.f45332k[0].d(dA, this.f45340s);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f45333l;
            if (bVar != null) {
                double[] dArr = this.f45340s;
                if (dArr.length > 0) {
                    bVar.d(dA, dArr);
                }
            }
            int i13 = i12 * 2;
            this.f45328g.n(dA, this.f45339r, this.f45340s, fArr, i13);
            if (cVar != null) {
                fArr[i13] = fArr[i13] + cVar.a(fMin);
            } else if (dVar != null) {
                fArr[i13] = fArr[i13] + dVar.a(fMin);
            }
            if (cVar2 != null) {
                int i14 = i13 + 1;
                fArr[i14] = fArr[i14] + cVar2.a(fMin);
            } else if (dVar2 != null) {
                int i15 = i13 + 1;
                fArr[i15] = fArr[i15] + dVar2.a(fMin);
            }
            i12++;
            i11 = i10;
            f10 = 1.0f;
        }
    }

    void g(float f10, float[] fArr, int i10) {
        this.f45332k[0].d(j(f10, null), this.f45340s);
        this.f45328g.s(this.f45339r, this.f45340s, fArr, i10);
    }

    void h(float[] fArr, int i10) {
        float f10 = 1.0f / (i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f45332k[0].d(j(i11 * f10, null), this.f45340s);
            this.f45328g.s(this.f45339r, this.f45340s, fArr, i11 * 8);
        }
    }

    void i(boolean z10) {
        if (!"button".equals(c.k(this.f45323b)) || this.E == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            m[] mVarArr = this.E;
            if (i10 >= mVarArr.length) {
                return;
            }
            mVarArr[i10].A(z10 ? -100.0f : 100.0f, this.f45323b);
            i10++;
        }
    }

    public int k() {
        return this.f45328g.f45373l;
    }

    int l(String str, float[] fArr, int i10) {
        androidx.constraintlayout.motion.utils.d dVar = this.C.get(str);
        if (dVar == null) {
            return -1;
        }
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr[i11] = dVar.a(i11 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void m(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f45332k[0].d(d10, dArr);
        this.f45332k[0].g(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f45328g.o(d10, this.f45339r, dArr, fArr, dArr2, fArr2);
    }

    public float n() {
        return this.f45337p;
    }

    public float o() {
        return this.f45338q;
    }

    void p(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float fJ = j(f10, this.f45347z);
        androidx.constraintlayout.core.motion.utils.b[] bVarArr = this.f45332k;
        int i10 = 0;
        if (bVarArr == null) {
            s sVar = this.f45329h;
            float f13 = sVar.f45366e;
            s sVar2 = this.f45328g;
            float f14 = f13 - sVar2.f45366e;
            float f15 = sVar.f45367f - sVar2.f45367f;
            float f16 = (sVar.f45368g - sVar2.f45368g) + f14;
            float f17 = (sVar.f45369h - sVar2.f45369h) + f15;
            fArr[0] = (f14 * (1.0f - f11)) + (f16 * f11);
            fArr[1] = (f15 * (1.0f - f12)) + (f17 * f12);
            return;
        }
        double d10 = fJ;
        bVarArr[0].g(d10, this.f45341t);
        this.f45332k[0].d(d10, this.f45340s);
        float f18 = this.f45347z[0];
        while (true) {
            dArr = this.f45341t;
            if (i10 >= dArr.length) {
                break;
            }
            dArr[i10] = dArr[i10] * ((double) f18);
            i10++;
        }
        androidx.constraintlayout.core.motion.utils.b bVar = this.f45333l;
        if (bVar == null) {
            this.f45328g.H(f11, f12, fArr, this.f45339r, dArr, this.f45340s);
            return;
        }
        double[] dArr2 = this.f45340s;
        if (dArr2.length > 0) {
            bVar.d(d10, dArr2);
            this.f45333l.g(d10, this.f45341t);
            this.f45328g.H(f11, f12, fArr, this.f45339r, this.f45341t, this.f45340s);
        }
    }

    public int q() {
        int iMax = this.f45328g.f45363b;
        Iterator<s> it = this.f45346y.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f45363b);
        }
        return Math.max(iMax, this.f45329h.f45363b);
    }

    public float r() {
        return this.f45329h.f45369h;
    }

    public float s() {
        return this.f45329h.f45368g;
    }

    public float t() {
        return this.f45329h.f45366e;
    }

    public String toString() {
        return " start: x: " + this.f45328g.f45366e + " y: " + this.f45328g.f45367f + " end: x: " + this.f45329h.f45366e + " y: " + this.f45329h.f45367f;
    }

    public float u() {
        return this.f45329h.f45367f;
    }

    s w(int i10) {
        return this.f45346y.get(i10);
    }

    public int x(int i10, int[] iArr) {
        float[] fArr = new float[2];
        int i11 = 0;
        int i12 = 0;
        for (f fVar : this.A) {
            int i13 = fVar.f45145d;
            if (i13 == i10 || i10 != -1) {
                iArr[i12] = 0;
                iArr[i12 + 1] = i13;
                int i14 = fVar.f45142a;
                iArr[i12 + 2] = i14;
                double d10 = i14 / 100.0f;
                this.f45332k[0].d(d10, this.f45340s);
                this.f45328g.n(d10, this.f45339r, this.f45340s, fArr, 0);
                iArr[i12 + 3] = Float.floatToIntBits(fArr[0]);
                int i15 = i12 + 4;
                iArr[i15] = Float.floatToIntBits(fArr[1]);
                if (fVar instanceof j) {
                    j jVar = (j) fVar;
                    iArr[i12 + 5] = jVar.O;
                    iArr[i12 + 6] = Float.floatToIntBits(jVar.K);
                    i15 = i12 + 7;
                    iArr[i15] = Float.floatToIntBits(jVar.L);
                }
                int i16 = i15 + 1;
                iArr[i12] = i16 - i12;
                i11++;
                i12 = i16;
            }
        }
        return i11;
    }

    float y(int i10, float f10, float f11) {
        s sVar = this.f45329h;
        float f12 = sVar.f45366e;
        s sVar2 = this.f45328g;
        float f13 = sVar2.f45366e;
        float f14 = f12 - f13;
        float f15 = sVar.f45367f;
        float f16 = sVar2.f45367f;
        float f17 = f15 - f16;
        float f18 = f13 + (sVar2.f45368g / 2.0f);
        float f19 = f16 + (sVar2.f45369h / 2.0f);
        float fHypot = (float) Math.hypot(f14, f17);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f20 = f10 - f18;
        float f21 = f11 - f19;
        if (((float) Math.hypot(f20, f21)) == 0.0f) {
            return 0.0f;
        }
        float f22 = (f20 * f14) + (f21 * f17);
        if (i10 == 0) {
            return f22 / fHypot;
        }
        if (i10 == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f22 * f22));
        }
        if (i10 == 2) {
            return f20 / f14;
        }
        if (i10 == 3) {
            return f21 / f14;
        }
        if (i10 == 4) {
            return f20 / f17;
        }
        if (i10 != 5) {
            return 0.0f;
        }
        return f21 / f17;
    }

    public int z(int[] iArr, float[] fArr) {
        int i10 = 0;
        int i11 = 0;
        for (f fVar : this.A) {
            int i12 = fVar.f45142a;
            iArr[i10] = (fVar.f45145d * 1000) + i12;
            double d10 = i12 / 100.0f;
            this.f45332k[0].d(d10, this.f45340s);
            this.f45328g.n(d10, this.f45339r, this.f45340s, fArr, i11);
            i11 += 2;
            i10++;
        }
        return i10;
    }
}
