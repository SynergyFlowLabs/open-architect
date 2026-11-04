package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class h extends f {
    private static final String X = "KeyCycle";
    static final String Y = "KeyCycle";
    public static final String Z = "wavePeriod";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f45166a0 = "waveOffset";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f45167b0 = "wavePhase";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f45168c0 = "waveShape";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f45169d0 = 0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f45170e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f45171f0 = 2;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f45172g0 = 3;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f45173h0 = 4;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f45174i0 = 5;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f45175j0 = 6;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f45176k0 = 4;
    private String D = null;
    private int E = 0;
    private int F = -1;
    private String G = null;
    private float H = Float.NaN;
    private float I = 0.0f;
    private float J = 0.0f;
    private float K = Float.NaN;
    private int L = -1;
    private float M = Float.NaN;
    private float N = Float.NaN;
    private float O = Float.NaN;
    private float P = Float.NaN;
    private float Q = Float.NaN;
    private float R = Float.NaN;
    private float S = Float.NaN;
    private float T = Float.NaN;
    private float U = Float.NaN;
    private float V = Float.NaN;
    private float W = Float.NaN;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f45177a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f45178b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f45179c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f45180d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f45181e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f45182f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f45183g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f45184h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f45185i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f45186j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f45187k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f45188l = 12;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f45189m = 13;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f45190n = 14;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f45191o = 15;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f45192p = 16;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f45193q = 17;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final int f45194r = 18;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final int f45195s = 19;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f45196t = 20;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final int f45197u = 21;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static SparseIntArray f45198v;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f45198v = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.j.c.V9, 1);
            f45198v.append(androidx.constraintlayout.widget.j.c.T9, 2);
            f45198v.append(androidx.constraintlayout.widget.j.c.W9, 3);
            f45198v.append(androidx.constraintlayout.widget.j.c.S9, 4);
            f45198v.append(androidx.constraintlayout.widget.j.c.f46375ba, 5);
            f45198v.append(androidx.constraintlayout.widget.j.c.Z9, 6);
            f45198v.append(androidx.constraintlayout.widget.j.c.Y9, 7);
            f45198v.append(androidx.constraintlayout.widget.j.c.f46392ca, 8);
            f45198v.append(androidx.constraintlayout.widget.j.c.I9, 9);
            f45198v.append(androidx.constraintlayout.widget.j.c.R9, 10);
            f45198v.append(androidx.constraintlayout.widget.j.c.N9, 11);
            f45198v.append(androidx.constraintlayout.widget.j.c.O9, 12);
            f45198v.append(androidx.constraintlayout.widget.j.c.P9, 13);
            f45198v.append(androidx.constraintlayout.widget.j.c.X9, 14);
            f45198v.append(androidx.constraintlayout.widget.j.c.L9, 15);
            f45198v.append(androidx.constraintlayout.widget.j.c.M9, 16);
            f45198v.append(androidx.constraintlayout.widget.j.c.J9, 17);
            f45198v.append(androidx.constraintlayout.widget.j.c.K9, 18);
            f45198v.append(androidx.constraintlayout.widget.j.c.Q9, 19);
            f45198v.append(androidx.constraintlayout.widget.j.c.U9, 20);
            f45198v.append(androidx.constraintlayout.widget.j.c.f46358aa, 21);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(h hVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f45198v.get(index)) {
                    case 1:
                        if (MotionLayout.f44987u4) {
                            int resourceId = typedArray.getResourceId(index, hVar.f45143b);
                            hVar.f45143b = resourceId;
                            if (resourceId == -1) {
                                hVar.f45144c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            hVar.f45144c = typedArray.getString(index);
                        } else {
                            hVar.f45143b = typedArray.getResourceId(index, hVar.f45143b);
                        }
                        break;
                    case 2:
                        hVar.f45142a = typedArray.getInt(index, hVar.f45142a);
                        break;
                    case 3:
                        hVar.D = typedArray.getString(index);
                        break;
                    case 4:
                        hVar.E = typedArray.getInteger(index, hVar.E);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            hVar.G = typedArray.getString(index);
                            hVar.F = 7;
                        } else {
                            hVar.F = typedArray.getInt(index, hVar.F);
                        }
                        break;
                    case 6:
                        hVar.H = typedArray.getFloat(index, hVar.H);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            hVar.I = typedArray.getDimension(index, hVar.I);
                        } else {
                            hVar.I = typedArray.getFloat(index, hVar.I);
                        }
                        break;
                    case 8:
                        hVar.L = typedArray.getInt(index, hVar.L);
                        break;
                    case 9:
                        hVar.M = typedArray.getFloat(index, hVar.M);
                        break;
                    case 10:
                        hVar.N = typedArray.getDimension(index, hVar.N);
                        break;
                    case 11:
                        hVar.O = typedArray.getFloat(index, hVar.O);
                        break;
                    case 12:
                        hVar.Q = typedArray.getFloat(index, hVar.Q);
                        break;
                    case 13:
                        hVar.R = typedArray.getFloat(index, hVar.R);
                        break;
                    case 14:
                        hVar.P = typedArray.getFloat(index, hVar.P);
                        break;
                    case 15:
                        hVar.S = typedArray.getFloat(index, hVar.S);
                        break;
                    case 16:
                        hVar.T = typedArray.getFloat(index, hVar.T);
                        break;
                    case 17:
                        hVar.U = typedArray.getDimension(index, hVar.U);
                        break;
                    case 18:
                        hVar.V = typedArray.getDimension(index, hVar.V);
                        break;
                    case 19:
                        hVar.W = typedArray.getDimension(index, hVar.W);
                        break;
                    case 20:
                        hVar.K = typedArray.getFloat(index, hVar.K);
                        break;
                    case 21:
                        hVar.J = typedArray.getFloat(index, hVar.J) / 360.0f;
                        break;
                    default:
                        Integer.toHexString(index);
                        f45198v.get(index);
                        break;
                }
            }
        }
    }

    public h() {
        this.f45145d = 4;
        this.f45146e = new HashMap<>();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> map) {
        c.n(androidx.constraintlayout.core.motion.utils.v.c.f44000a, "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            androidx.constraintlayout.motion.utils.d dVar = map.get(str);
            if (dVar != null) {
                str.getClass();
                byte b10 = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b10 = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b10 = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b10 = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b10 = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b10 = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b10 = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b10 = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b10 = 7;
                        }
                        break;
                    case -40300674:
                        if (str.equals(f.f45124i)) {
                            b10 = 8;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b10 = 9;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b10 = 10;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b10 = 11;
                        }
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            b10 = com.google.common.base.c.f116461n;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            b10 = com.google.common.base.c.f116462o;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        dVar.g(this.f45142a, this.Q);
                        break;
                    case 1:
                        dVar.g(this.f45142a, this.R);
                        break;
                    case 2:
                        dVar.g(this.f45142a, this.U);
                        break;
                    case 3:
                        dVar.g(this.f45142a, this.V);
                        break;
                    case 4:
                        dVar.g(this.f45142a, this.W);
                        break;
                    case 5:
                        dVar.g(this.f45142a, this.K);
                        break;
                    case 6:
                        dVar.g(this.f45142a, this.S);
                        break;
                    case 7:
                        dVar.g(this.f45142a, this.T);
                        break;
                    case 8:
                        dVar.g(this.f45142a, this.O);
                        break;
                    case 9:
                        dVar.g(this.f45142a, this.N);
                        break;
                    case 10:
                        dVar.g(this.f45142a, this.P);
                        break;
                    case 11:
                        dVar.g(this.f45142a, this.M);
                        break;
                    case 12:
                        dVar.g(this.f45142a, this.I);
                        break;
                    case 13:
                        dVar.g(this.f45142a, this.J);
                        break;
                    default:
                        str.startsWith("CUSTOM");
                        break;
                }
            }
        }
    }

    public void a0(HashMap<String, androidx.constraintlayout.motion.utils.c> map) {
        androidx.constraintlayout.motion.utils.c cVar;
        androidx.constraintlayout.motion.utils.c cVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.a aVar = this.f45146e.get(str.substring(7));
                if (aVar != null && aVar.j() == androidx.constraintlayout.widget.a.EnumC0369a.FLOAT_TYPE && (cVar = map.get(str)) != null) {
                    cVar.g(this.f45142a, this.F, this.G, this.L, this.H, this.I, this.J, aVar.k(), aVar);
                }
            } else {
                float fB0 = b0(str);
                if (!Float.isNaN(fB0) && (cVar2 = map.get(str)) != null) {
                    cVar2.f(this.f45142a, this.F, this.G, this.L, this.H, this.I, this.J, fB0);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* JADX INFO: renamed from: b */
    public f clone() {
        return new h().c(this);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public float b0(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    b10 = 0;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b10 = 1;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b10 = 2;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b10 = 3;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b10 = 4;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    b10 = 5;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 6;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 7;
                }
                break;
            case -40300674:
                if (str.equals(f.f45124i)) {
                    b10 = 8;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b10 = 9;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b10 = 10;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = 11;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
        }
        switch (b10) {
            case 0:
                return this.Q;
            case 1:
                return this.R;
            case 2:
                return this.U;
            case 3:
                return this.V;
            case 4:
                return this.W;
            case 5:
                return this.K;
            case 6:
                return this.S;
            case 7:
                return this.T;
            case 8:
                return this.O;
            case 9:
                return this.N;
            case 10:
                return this.P;
            case 11:
                return this.M;
            case 12:
                return this.I;
            case 13:
                return this.J;
            default:
                str.startsWith("CUSTOM");
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f fVar) {
        super.c(fVar);
        h hVar = (h) fVar;
        this.D = hVar.D;
        this.E = hVar.E;
        this.F = hVar.F;
        this.G = hVar.G;
        this.H = hVar.H;
        this.I = hVar.I;
        this.J = hVar.J;
        this.K = hVar.K;
        this.L = hVar.L;
        this.M = hVar.M;
        this.N = hVar.N;
        this.O = hVar.O;
        this.P = hVar.P;
        this.Q = hVar.Q;
        this.R = hVar.R;
        this.S = hVar.S;
        this.T = hVar.T;
        this.U = hVar.U;
        this.V = hVar.V;
        this.W = hVar.W;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.M)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add(f.f45124i);
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.R)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.S)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.T)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.U)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.V)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.W)) {
            hashSet.add("translationZ");
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
        a.b(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.j.c.H9));
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
            case 1530034690:
                if (str.equals("wavePhase")) {
                    b10 = com.google.common.base.c.f116465r;
                }
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    b10 = 17;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.K = m(obj);
                break;
            case 1:
                this.D = obj.toString();
                break;
            case 2:
                this.Q = m(obj);
                break;
            case 3:
                this.R = m(obj);
                break;
            case 4:
                this.U = m(obj);
                break;
            case 5:
                this.V = m(obj);
                break;
            case 6:
                this.W = m(obj);
                break;
            case 7:
                this.S = m(obj);
                break;
            case 8:
                this.T = m(obj);
                break;
            case 9:
                this.O = m(obj);
                break;
            case 10:
                this.N = m(obj);
                break;
            case 11:
                this.P = m(obj);
                break;
            case 12:
                this.M = m(obj);
                break;
            case 13:
                this.I = m(obj);
                break;
            case 14:
                this.H = m(obj);
                break;
            case 15:
                this.E = n(obj);
                break;
            case 16:
                this.J = m(obj);
                break;
            case 17:
                if (!(obj instanceof Integer)) {
                    this.F = 7;
                    this.G = obj.toString();
                } else {
                    this.F = n(obj);
                }
                break;
        }
    }
}
