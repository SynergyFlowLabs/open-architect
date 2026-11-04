package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class l extends f {
    public static final String V = "wavePeriod";
    public static final String W = "waveOffset";
    public static final String X = "waveShape";
    public static final int Y = 0;
    public static final int Z = 1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f45223a0 = 2;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f45224b0 = 3;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f45225c0 = 4;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f45226d0 = 5;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f45227e0 = 6;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f45228f0 = 3;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    static final String f45229g0 = "KeyTimeCycle";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final String f45230h0 = "KeyTimeCycle";
    private String D;
    private int E = -1;
    private float F = Float.NaN;
    private float G = Float.NaN;
    private float H = Float.NaN;
    private float I = Float.NaN;
    private float J = Float.NaN;
    private float K = Float.NaN;
    private float L = Float.NaN;
    private float M = Float.NaN;
    private float N = Float.NaN;
    private float O = Float.NaN;
    private float P = Float.NaN;
    private float Q = Float.NaN;
    private int R = 0;
    private String S = null;
    private float T = Float.NaN;
    private float U = 0.0f;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f45231a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f45232b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f45233c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f45234d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f45235e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f45236f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f45237g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f45238h = 9;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f45239i = 10;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f45240j = 12;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f45241k = 13;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f45242l = 14;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f45243m = 15;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f45244n = 16;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f45245o = 17;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f45246p = 18;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f45247q = 19;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final int f45248r = 20;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final int f45249s = 21;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static SparseIntArray f45250t;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f45250t = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.j.c.f46697ua, 1);
            f45250t.append(androidx.constraintlayout.widget.j.c.Da, 2);
            f45250t.append(androidx.constraintlayout.widget.j.c.f46782za, 4);
            int i10 = 6 ^ 5;
            f45250t.append(androidx.constraintlayout.widget.j.c.Aa, 5);
            f45250t.append(androidx.constraintlayout.widget.j.c.Ba, 6);
            f45250t.append(androidx.constraintlayout.widget.j.c.f46748xa, 7);
            f45250t.append(androidx.constraintlayout.widget.j.c.Ja, 8);
            f45250t.append(androidx.constraintlayout.widget.j.c.Ia, 9);
            f45250t.append(androidx.constraintlayout.widget.j.c.Ha, 10);
            f45250t.append(androidx.constraintlayout.widget.j.c.Fa, 12);
            f45250t.append(androidx.constraintlayout.widget.j.c.Ea, 13);
            f45250t.append(androidx.constraintlayout.widget.j.c.f46765ya, 14);
            f45250t.append(androidx.constraintlayout.widget.j.c.f46714va, 15);
            f45250t.append(androidx.constraintlayout.widget.j.c.f46731wa, 16);
            f45250t.append(androidx.constraintlayout.widget.j.c.Ca, 17);
            f45250t.append(androidx.constraintlayout.widget.j.c.Ga, 18);
            f45250t.append(androidx.constraintlayout.widget.j.c.Ma, 20);
            f45250t.append(androidx.constraintlayout.widget.j.c.La, 21);
            f45250t.append(androidx.constraintlayout.widget.j.c.Oa, 19);
        }

        private a() {
        }

        public static void a(l lVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f45250t.get(index)) {
                    case 1:
                        lVar.F = typedArray.getFloat(index, lVar.F);
                        break;
                    case 2:
                        lVar.G = typedArray.getDimension(index, lVar.G);
                        break;
                    case 3:
                    case 11:
                    default:
                        Integer.toHexString(index);
                        f45250t.get(index);
                        break;
                    case 4:
                        lVar.H = typedArray.getFloat(index, lVar.H);
                        break;
                    case 5:
                        lVar.I = typedArray.getFloat(index, lVar.I);
                        break;
                    case 6:
                        lVar.J = typedArray.getFloat(index, lVar.J);
                        break;
                    case 7:
                        lVar.L = typedArray.getFloat(index, lVar.L);
                        break;
                    case 8:
                        lVar.K = typedArray.getFloat(index, lVar.K);
                        break;
                    case 9:
                        lVar.D = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f44987u4) {
                            int resourceId = typedArray.getResourceId(index, lVar.f45143b);
                            lVar.f45143b = resourceId;
                            if (resourceId == -1) {
                                lVar.f45144c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            lVar.f45144c = typedArray.getString(index);
                        } else {
                            lVar.f45143b = typedArray.getResourceId(index, lVar.f45143b);
                        }
                        break;
                    case 12:
                        lVar.f45142a = typedArray.getInt(index, lVar.f45142a);
                        break;
                    case 13:
                        lVar.E = typedArray.getInteger(index, lVar.E);
                        break;
                    case 14:
                        lVar.M = typedArray.getFloat(index, lVar.M);
                        break;
                    case 15:
                        lVar.N = typedArray.getDimension(index, lVar.N);
                        break;
                    case 16:
                        lVar.O = typedArray.getDimension(index, lVar.O);
                        break;
                    case 17:
                        lVar.P = typedArray.getDimension(index, lVar.P);
                        break;
                    case 18:
                        lVar.Q = typedArray.getFloat(index, lVar.Q);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            lVar.S = typedArray.getString(index);
                            lVar.R = 7;
                        } else {
                            lVar.R = typedArray.getInt(index, lVar.R);
                        }
                        break;
                    case 20:
                        lVar.T = typedArray.getFloat(index, lVar.T);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            lVar.U = typedArray.getDimension(index, lVar.U);
                        } else {
                            lVar.U = typedArray.getFloat(index, lVar.U);
                        }
                        break;
                }
            }
        }
    }

    public l() {
        this.f45145d = 3;
        this.f45146e = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    public void W(HashMap<String, androidx.constraintlayout.motion.utils.f> map) {
        for (String str : map.keySet()) {
            androidx.constraintlayout.motion.utils.f fVar = map.get(str);
            if (fVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.I)) {
                                break;
                            } else {
                                fVar.c(this.f45142a, this.I, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.J)) {
                                break;
                            } else {
                                fVar.c(this.f45142a, this.J, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.N)) {
                                break;
                            } else {
                                fVar.c(this.f45142a, this.N, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.O)) {
                                break;
                            } else {
                                fVar.c(this.f45142a, this.O, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.P)) {
                                break;
                            } else {
                                fVar.c(this.f45142a, this.P, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.Q)) {
                                break;
                            } else {
                                fVar.c(this.f45142a, this.Q, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.L)) {
                                break;
                            } else {
                                fVar.c(this.f45142a, this.L, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.M)) {
                                break;
                            } else {
                                fVar.c(this.f45142a, this.M, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.H)) {
                                break;
                            } else {
                                fVar.c(this.f45142a, this.H, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.G)) {
                                break;
                            } else {
                                fVar.c(this.f45142a, this.G, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                fVar.c(this.f45142a, this.K, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.F)) {
                                break;
                            } else {
                                fVar.c(this.f45142a, this.F, this.T, this.R, this.U);
                                break;
                            }
                            break;
                    }
                } else {
                    androidx.constraintlayout.widget.a aVar = this.f45146e.get(str.substring(7));
                    if (aVar != null) {
                        ((androidx.constraintlayout.motion.utils.f.b) fVar).k(this.f45142a, aVar, this.T, this.R, this.U);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* JADX INFO: renamed from: b */
    public f clone() {
        return new l().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f fVar) {
        super.c(fVar);
        l lVar = (l) fVar;
        this.D = lVar.D;
        this.E = lVar.E;
        this.R = lVar.R;
        this.T = lVar.T;
        this.U = lVar.U;
        this.Q = lVar.Q;
        this.F = lVar.F;
        this.G = lVar.G;
        this.H = lVar.H;
        this.K = lVar.K;
        this.I = lVar.I;
        this.J = lVar.J;
        this.L = lVar.L;
        this.M = lVar.M;
        this.N = lVar.N;
        this.O = lVar.O;
        this.P = lVar.P;
        this.S = lVar.S;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.F)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add(f.f45124i);
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("progress");
        }
        if (this.f45146e.size() > 0) {
            Iterator<String> it = this.f45146e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.j.c.f46680ta));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void i(HashMap<String, Integer> map) {
        if (this.E == -1) {
            return;
        }
        if (!Float.isNaN(this.F)) {
            map.put("alpha", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.G)) {
            map.put("elevation", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.H)) {
            map.put(f.f45124i, Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.I)) {
            map.put("rotationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.J)) {
            map.put("rotationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.N)) {
            map.put("translationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.O)) {
            map.put("translationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.P)) {
            map.put("translationZ", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.K)) {
            map.put("transitionPathRotate", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.L)) {
            map.put("scaleX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.L)) {
            map.put("scaleY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.Q)) {
            map.put("progress", Integer.valueOf(this.E));
        }
        if (this.f45146e.size() > 0) {
            Iterator<String> it = this.f45146e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.E));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals(f.A)) {
                    b10 = 0;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    b10 = 1;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    b10 = 2;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b10 = 3;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b10 = 4;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b10 = 5;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b10 = 6;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 7;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 8;
                }
                break;
            case -40300674:
                if (str.equals(f.f45124i)) {
                    b10 = 9;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b10 = 10;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b10 = 11;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
            case 184161818:
                if (str.equals("wavePeriod")) {
                    b10 = com.google.common.base.c.f116463p;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    b10 = com.google.common.base.c.f116464q;
                }
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    b10 = com.google.common.base.c.f116465r;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.Q = m(obj);
                break;
            case 1:
                this.D = obj.toString();
                break;
            case 2:
                this.I = m(obj);
                break;
            case 3:
                this.J = m(obj);
                break;
            case 4:
                this.N = m(obj);
                break;
            case 5:
                this.O = m(obj);
                break;
            case 6:
                this.P = m(obj);
                break;
            case 7:
                this.L = m(obj);
                break;
            case 8:
                this.M = m(obj);
                break;
            case 9:
                this.H = m(obj);
                break;
            case 10:
                this.G = m(obj);
                break;
            case 11:
                this.K = m(obj);
                break;
            case 12:
                this.F = m(obj);
                break;
            case 13:
                this.U = m(obj);
                break;
            case 14:
                this.T = m(obj);
                break;
            case 15:
                this.E = n(obj);
                break;
            case 16:
                if (!(obj instanceof Integer)) {
                    this.R = 7;
                    this.S = obj.toString();
                } else {
                    this.R = n(obj);
                }
                break;
        }
    }
}
