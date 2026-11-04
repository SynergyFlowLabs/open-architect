package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class g extends f {
    static final String U = "KeyAttribute";
    private static final String V = "KeyAttributes";
    private static final boolean W = false;
    public static final int X = 1;
    private String D;
    private int E = -1;
    private boolean F = false;
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
    private float R = Float.NaN;
    private float S = Float.NaN;
    private float T = Float.NaN;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f45147a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f45148b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f45149c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f45150d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f45151e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f45152f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f45153g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f45154h = 9;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f45155i = 10;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f45156j = 12;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f45157k = 13;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f45158l = 14;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f45159m = 15;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f45160n = 16;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f45161o = 17;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f45162p = 18;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f45163q = 19;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final int f45164r = 20;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static SparseIntArray f45165s;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f45165s = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.j.c.f46594o9, 1);
            f45165s.append(androidx.constraintlayout.widget.j.c.f46781z9, 2);
            f45165s.append(androidx.constraintlayout.widget.j.c.f46713v9, 4);
            f45165s.append(androidx.constraintlayout.widget.j.c.f46730w9, 5);
            f45165s.append(androidx.constraintlayout.widget.j.c.f46747x9, 6);
            f45165s.append(androidx.constraintlayout.widget.j.c.f46611p9, 19);
            f45165s.append(androidx.constraintlayout.widget.j.c.f46628q9, 20);
            f45165s.append(androidx.constraintlayout.widget.j.c.f46679t9, 7);
            f45165s.append(androidx.constraintlayout.widget.j.c.G9, 8);
            f45165s.append(androidx.constraintlayout.widget.j.c.F9, 9);
            f45165s.append(androidx.constraintlayout.widget.j.c.D9, 10);
            f45165s.append(androidx.constraintlayout.widget.j.c.B9, 12);
            f45165s.append(androidx.constraintlayout.widget.j.c.A9, 13);
            f45165s.append(androidx.constraintlayout.widget.j.c.f46696u9, 14);
            f45165s.append(androidx.constraintlayout.widget.j.c.f46645r9, 15);
            f45165s.append(androidx.constraintlayout.widget.j.c.f46662s9, 16);
            f45165s.append(androidx.constraintlayout.widget.j.c.f46764y9, 17);
            f45165s.append(androidx.constraintlayout.widget.j.c.C9, 18);
        }

        private a() {
        }

        public static void a(g gVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f45165s.get(index)) {
                    case 1:
                        gVar.G = typedArray.getFloat(index, gVar.G);
                        break;
                    case 2:
                        gVar.H = typedArray.getDimension(index, gVar.H);
                        break;
                    case 3:
                    case 11:
                    default:
                        Integer.toHexString(index);
                        f45165s.get(index);
                        break;
                    case 4:
                        gVar.I = typedArray.getFloat(index, gVar.I);
                        break;
                    case 5:
                        gVar.J = typedArray.getFloat(index, gVar.J);
                        break;
                    case 6:
                        gVar.K = typedArray.getFloat(index, gVar.K);
                        break;
                    case 7:
                        gVar.O = typedArray.getFloat(index, gVar.O);
                        break;
                    case 8:
                        gVar.N = typedArray.getFloat(index, gVar.N);
                        break;
                    case 9:
                        gVar.D = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f44987u4) {
                            int resourceId = typedArray.getResourceId(index, gVar.f45143b);
                            gVar.f45143b = resourceId;
                            if (resourceId == -1) {
                                gVar.f45144c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            gVar.f45144c = typedArray.getString(index);
                        } else {
                            gVar.f45143b = typedArray.getResourceId(index, gVar.f45143b);
                        }
                        break;
                    case 12:
                        gVar.f45142a = typedArray.getInt(index, gVar.f45142a);
                        break;
                    case 13:
                        gVar.E = typedArray.getInteger(index, gVar.E);
                        break;
                    case 14:
                        gVar.P = typedArray.getFloat(index, gVar.P);
                        break;
                    case 15:
                        gVar.Q = typedArray.getDimension(index, gVar.Q);
                        break;
                    case 16:
                        gVar.R = typedArray.getDimension(index, gVar.R);
                        break;
                    case 17:
                        gVar.S = typedArray.getDimension(index, gVar.S);
                        break;
                    case 18:
                        gVar.T = typedArray.getFloat(index, gVar.T);
                        break;
                    case 19:
                        gVar.L = typedArray.getDimension(index, gVar.L);
                        break;
                    case 20:
                        gVar.M = typedArray.getDimension(index, gVar.M);
                        break;
                }
            }
        }
    }

    public g() {
        this.f45145d = 1;
        this.f45146e = new HashMap<>();
    }

    int T() {
        return this.E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> map) {
        for (String str : map.keySet()) {
            androidx.constraintlayout.motion.utils.d dVar = map.get(str);
            if (dVar != null) {
                byte b10 = 7;
                if (!str.startsWith("CUSTOM")) {
                    switch (str.hashCode()) {
                        case -1249320806:
                            if (str.equals("rotationX")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -1249320805:
                            if (str.equals("rotationY")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -1225497657:
                            if (str.equals("translationX")) {
                                b10 = 2;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -1225497656:
                            if (str.equals("translationY")) {
                                b10 = 3;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -1225497655:
                            if (str.equals("translationZ")) {
                                b10 = 4;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -1001078227:
                            if (str.equals("progress")) {
                                b10 = 5;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -908189618:
                            if (str.equals("scaleX")) {
                                b10 = 6;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -908189617:
                            if (!str.equals("scaleY")) {
                                b10 = -1;
                            }
                            break;
                        case -760884510:
                            if (str.equals(f.f45127l)) {
                                b10 = 8;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -760884509:
                            if (str.equals(f.f45128m)) {
                                b10 = 9;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -40300674:
                            if (str.equals(f.f45124i)) {
                                b10 = 10;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -4379043:
                            if (str.equals("elevation")) {
                                b10 = 11;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 37232917:
                            if (str.equals("transitionPathRotate")) {
                                b10 = com.google.common.base.c.f116461n;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 92909918:
                            if (str.equals("alpha")) {
                                b10 = com.google.common.base.c.f116462o;
                            } else {
                                b10 = -1;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        case 0:
                            if (!Float.isNaN(this.J)) {
                                dVar.g(this.f45142a, this.J);
                            }
                            break;
                        case 1:
                            if (!Float.isNaN(this.K)) {
                                dVar.g(this.f45142a, this.K);
                            }
                            break;
                        case 2:
                            if (!Float.isNaN(this.Q)) {
                                dVar.g(this.f45142a, this.Q);
                            }
                            break;
                        case 3:
                            if (!Float.isNaN(this.R)) {
                                dVar.g(this.f45142a, this.R);
                            }
                            break;
                        case 4:
                            if (!Float.isNaN(this.S)) {
                                dVar.g(this.f45142a, this.S);
                            }
                            break;
                        case 5:
                            if (!Float.isNaN(this.T)) {
                                dVar.g(this.f45142a, this.T);
                            }
                            break;
                        case 6:
                            if (!Float.isNaN(this.O)) {
                                dVar.g(this.f45142a, this.O);
                            }
                            break;
                        case 7:
                            if (!Float.isNaN(this.P)) {
                                dVar.g(this.f45142a, this.P);
                            }
                            break;
                        case 8:
                            if (!Float.isNaN(this.J)) {
                                dVar.g(this.f45142a, this.L);
                            }
                            break;
                        case 9:
                            if (!Float.isNaN(this.K)) {
                                dVar.g(this.f45142a, this.M);
                            }
                            break;
                        case 10:
                            if (!Float.isNaN(this.I)) {
                                dVar.g(this.f45142a, this.I);
                            }
                            break;
                        case 11:
                            if (!Float.isNaN(this.H)) {
                                dVar.g(this.f45142a, this.H);
                            }
                            break;
                        case 12:
                            if (!Float.isNaN(this.N)) {
                                dVar.g(this.f45142a, this.N);
                            }
                            break;
                        case 13:
                            if (!Float.isNaN(this.G)) {
                                dVar.g(this.f45142a, this.G);
                            }
                            break;
                    }
                } else {
                    androidx.constraintlayout.widget.a aVar = this.f45146e.get(str.substring(7));
                    if (aVar != null) {
                        ((androidx.constraintlayout.motion.utils.d.b) dVar).n(this.f45142a, aVar);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* JADX INFO: renamed from: b */
    public f clone() {
        return new g().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f fVar) {
        super.c(fVar);
        g gVar = (g) fVar;
        this.E = gVar.E;
        this.F = gVar.F;
        this.G = gVar.G;
        this.H = gVar.H;
        this.I = gVar.I;
        this.J = gVar.J;
        this.K = gVar.K;
        this.L = gVar.L;
        this.M = gVar.M;
        this.N = gVar.N;
        this.O = gVar.O;
        this.P = gVar.P;
        this.Q = gVar.Q;
        this.R = gVar.R;
        this.S = gVar.S;
        this.T = gVar.T;
        this.D = gVar.D;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add(f.f45124i);
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add(f.f45127l);
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add(f.f45128m);
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.R)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.S)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.T)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.j.c.f46577n9));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void i(HashMap<String, Integer> map) {
        if (this.E == -1) {
            return;
        }
        if (!Float.isNaN(this.G)) {
            map.put("alpha", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.H)) {
            map.put("elevation", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.I)) {
            map.put(f.f45124i, Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.J)) {
            map.put("rotationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.K)) {
            map.put("rotationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.L)) {
            map.put(f.f45127l, Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.M)) {
            map.put(f.f45128m, Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.Q)) {
            map.put("translationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.R)) {
            map.put("translationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.S)) {
            map.put("translationZ", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.N)) {
            map.put("transitionPathRotate", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.O)) {
            map.put("scaleX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.P)) {
            map.put("scaleY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.T)) {
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
            case -760884510:
                if (str.equals(f.f45127l)) {
                    b10 = 9;
                }
                break;
            case -760884509:
                if (str.equals(f.f45128m)) {
                    b10 = 10;
                }
                break;
            case -40300674:
                if (str.equals(f.f45124i)) {
                    b10 = 11;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = com.google.common.base.c.f116463p;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    b10 = com.google.common.base.c.f116464q;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b10 = com.google.common.base.c.f116465r;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.T = m(obj);
                break;
            case 1:
                this.D = obj.toString();
                break;
            case 2:
                this.J = m(obj);
                break;
            case 3:
                this.K = m(obj);
                break;
            case 4:
                this.Q = m(obj);
                break;
            case 5:
                this.R = m(obj);
                break;
            case 6:
                this.S = m(obj);
                break;
            case 7:
                this.O = m(obj);
                break;
            case 8:
                this.P = m(obj);
                break;
            case 9:
                this.L = m(obj);
                break;
            case 10:
                this.M = m(obj);
                break;
            case 11:
                this.I = m(obj);
                break;
            case 12:
                this.H = m(obj);
                break;
            case 13:
                this.N = m(obj);
                break;
            case 14:
                this.G = m(obj);
                break;
            case 15:
                this.E = n(obj);
                break;
            case 16:
                this.F = l(obj);
                break;
        }
    }
}
