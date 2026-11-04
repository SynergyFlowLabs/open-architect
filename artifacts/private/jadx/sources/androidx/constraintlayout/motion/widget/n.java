package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
class n implements Comparable<n> {

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final String f45278j3 = "MotionPaths";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final boolean f45279k3 = false;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    static final int f45280l3 = 1;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    static final int f45281m3 = 2;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    static String[] f45282n3 = {"position", "x", "y", "width", "height", "pathRotate"};
    private float H1;
    private androidx.constraintlayout.core.motion.utils.d X;
    private float Z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f45285c;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f45301p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private float f45302p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private float f45303p2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f45283a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f45284b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    LinkedHashMap<String, androidx.constraintlayout.widget.a> f45286d = new LinkedHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f45287e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    double[] f45288f = new double[18];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    double[] f45289g = new double[18];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f45291h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45293i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f45295j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f45296k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f45297l = 0.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f45298m = 1.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f45299n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f45300o = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f45304s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f45305t = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f45306v = 0.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f45307w = 0.0f;
    private int Y = 0;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private float f45290g3 = Float.NaN;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private float f45292h3 = Float.NaN;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private int f45294i3 = -1;

    n() {
    }

    private boolean f(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void b(HashMap<String, androidx.constraintlayout.motion.utils.d> map, int i10) {
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
                    case -760884510:
                        if (str.equals(f.f45127l)) {
                            b10 = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals(f.f45128m)) {
                            b10 = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals(f.f45124i)) {
                            b10 = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b10 = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b10 = com.google.common.base.c.f116461n;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b10 = com.google.common.base.c.f116462o;
                        }
                        break;
                }
                float f10 = 0.0f;
                switch (b10) {
                    case 0:
                        dVar.g(i10, Float.isNaN(this.f45297l) ? 0.0f : this.f45297l);
                        break;
                    case 1:
                        if (!Float.isNaN(this.f45283a)) {
                            f10 = this.f45283a;
                        }
                        dVar.g(i10, f10);
                        break;
                    case 2:
                        dVar.g(i10, Float.isNaN(this.f45305t) ? 0.0f : this.f45305t);
                        break;
                    case 3:
                        dVar.g(i10, Float.isNaN(this.f45306v) ? 0.0f : this.f45306v);
                        break;
                    case 4:
                        if (!Float.isNaN(this.f45307w)) {
                            f10 = this.f45307w;
                        }
                        dVar.g(i10, f10);
                        break;
                    case 5:
                        dVar.g(i10, Float.isNaN(this.f45292h3) ? 0.0f : this.f45292h3);
                        break;
                    case 6:
                        dVar.g(i10, Float.isNaN(this.f45298m) ? 1.0f : this.f45298m);
                        break;
                    case 7:
                        dVar.g(i10, Float.isNaN(this.f45299n) ? 1.0f : this.f45299n);
                        break;
                    case 8:
                        dVar.g(i10, Float.isNaN(this.f45300o) ? 0.0f : this.f45300o);
                        break;
                    case 9:
                        dVar.g(i10, Float.isNaN(this.f45304s) ? 0.0f : this.f45304s);
                        break;
                    case 10:
                        if (!Float.isNaN(this.f45296k)) {
                            f10 = this.f45296k;
                        }
                        dVar.g(i10, f10);
                        break;
                    case 11:
                        dVar.g(i10, Float.isNaN(this.f45295j) ? 0.0f : this.f45295j);
                        break;
                    case 12:
                        dVar.g(i10, Float.isNaN(this.f45290g3) ? 0.0f : this.f45290g3);
                        break;
                    case 13:
                        dVar.g(i10, Float.isNaN(this.f45291h) ? 1.0f : this.f45291h);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            if (this.f45286d.containsKey(str2)) {
                                androidx.constraintlayout.widget.a aVar = this.f45286d.get(str2);
                                if (dVar instanceof androidx.constraintlayout.motion.utils.d.b) {
                                    ((androidx.constraintlayout.motion.utils.d.b) dVar).n(i10, aVar);
                                } else {
                                    aVar.k();
                                    dVar.toString();
                                }
                            }
                        }
                        break;
                }
            }
        }
    }

    public void c(View view) {
        this.f45285c = view.getVisibility();
        this.f45291h = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f45293i = false;
        this.f45295j = view.getElevation();
        this.f45296k = view.getRotation();
        this.f45297l = view.getRotationX();
        this.f45283a = view.getRotationY();
        this.f45298m = view.getScaleX();
        this.f45299n = view.getScaleY();
        this.f45300o = view.getPivotX();
        this.f45304s = view.getPivotY();
        this.f45305t = view.getTranslationX();
        this.f45306v = view.getTranslationY();
        this.f45307w = view.getTranslationZ();
    }

    public void d(androidx.constraintlayout.widget.f.a aVar) {
        androidx.constraintlayout.widget.f.d dVar = aVar.f45924c;
        int i10 = dVar.f46052c;
        this.f45284b = i10;
        int i11 = dVar.f46051b;
        this.f45285c = i11;
        this.f45291h = (i11 == 0 || i10 != 0) ? dVar.f46053d : 0.0f;
        androidx.constraintlayout.widget.f.e eVar = aVar.f45927f;
        this.f45293i = eVar.f46079m;
        this.f45295j = eVar.f46080n;
        this.f45296k = eVar.f46068b;
        this.f45297l = eVar.f46069c;
        this.f45283a = eVar.f46070d;
        this.f45298m = eVar.f46071e;
        this.f45299n = eVar.f46072f;
        this.f45300o = eVar.f46073g;
        this.f45304s = eVar.f46074h;
        this.f45305t = eVar.f46076j;
        this.f45306v = eVar.f46077k;
        this.f45307w = eVar.f46078l;
        this.X = androidx.constraintlayout.core.motion.utils.d.c(aVar.f45925d.f46039d);
        androidx.constraintlayout.widget.f.c cVar = aVar.f45925d;
        this.f45290g3 = cVar.f46044i;
        this.Y = cVar.f46041f;
        this.f45294i3 = cVar.f46037b;
        this.f45292h3 = aVar.f45924c.f46054e;
        for (String str : aVar.f45928g.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.f45928g.get(str);
            if (aVar2.n()) {
                this.f45286d.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return Float.compare(this.Z, nVar.Z);
    }

    void k(n nVar, HashSet<String> hashSet) {
        if (f(this.f45291h, nVar.f45291h)) {
            hashSet.add("alpha");
        }
        if (f(this.f45295j, nVar.f45295j)) {
            hashSet.add("elevation");
        }
        int i10 = this.f45285c;
        int i11 = nVar.f45285c;
        if (i10 != i11 && this.f45284b == 0 && (i10 == 0 || i11 == 0)) {
            hashSet.add("alpha");
        }
        if (f(this.f45296k, nVar.f45296k)) {
            hashSet.add(f.f45124i);
        }
        if (!Float.isNaN(this.f45290g3) || !Float.isNaN(nVar.f45290g3)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f45292h3) || !Float.isNaN(nVar.f45292h3)) {
            hashSet.add("progress");
        }
        if (f(this.f45297l, nVar.f45297l)) {
            hashSet.add("rotationX");
        }
        if (f(this.f45283a, nVar.f45283a)) {
            hashSet.add("rotationY");
        }
        if (f(this.f45300o, nVar.f45300o)) {
            hashSet.add(f.f45127l);
        }
        if (f(this.f45304s, nVar.f45304s)) {
            hashSet.add(f.f45128m);
        }
        if (f(this.f45298m, nVar.f45298m)) {
            hashSet.add("scaleX");
        }
        if (f(this.f45299n, nVar.f45299n)) {
            hashSet.add("scaleY");
        }
        if (f(this.f45305t, nVar.f45305t)) {
            hashSet.add("translationX");
        }
        if (f(this.f45306v, nVar.f45306v)) {
            hashSet.add("translationY");
        }
        if (f(this.f45307w, nVar.f45307w)) {
            hashSet.add("translationZ");
        }
    }

    void l(n nVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | f(this.Z, nVar.Z);
        zArr[1] = zArr[1] | f(this.f45301p0, nVar.f45301p0);
        zArr[2] = zArr[2] | f(this.f45302p1, nVar.f45302p1);
        zArr[3] = zArr[3] | f(this.H1, nVar.H1);
        zArr[4] = f(this.f45303p2, nVar.f45303p2) | zArr[4];
    }

    void n(double[] dArr, int[] iArr) {
        int i10 = 0;
        float[] fArr = {this.Z, this.f45301p0, this.f45302p1, this.H1, this.f45303p2, this.f45291h, this.f45295j, this.f45296k, this.f45297l, this.f45283a, this.f45298m, this.f45299n, this.f45300o, this.f45304s, this.f45305t, this.f45306v, this.f45307w, this.f45290g3};
        for (int i11 : iArr) {
            if (i11 < 18) {
                dArr[i10] = fArr[i11];
                i10++;
            }
        }
    }

    int o(String str, double[] dArr, int i10) {
        androidx.constraintlayout.widget.a aVar = this.f45286d.get(str);
        if (aVar.p() == 1) {
            dArr[i10] = aVar.k();
            return 1;
        }
        int iP = aVar.p();
        float[] fArr = new float[iP];
        aVar.l(fArr);
        int i11 = 0;
        while (i11 < iP) {
            dArr[i10] = fArr[i11];
            i11++;
            i10++;
        }
        return iP;
    }

    int p(String str) {
        return this.f45286d.get(str).p();
    }

    boolean q(String str) {
        return this.f45286d.containsKey(str);
    }

    void r(float f10, float f11, float f12, float f13) {
        this.f45301p0 = f10;
        this.f45302p1 = f11;
        this.H1 = f12;
        this.f45303p2 = f13;
    }

    public void s(Rect rect, View view, int i10, float f10) {
        r(rect.left, rect.top, rect.width(), rect.height());
        c(view);
        this.f45300o = Float.NaN;
        this.f45304s = Float.NaN;
        if (i10 == 1) {
            this.f45296k = f10 - 90.0f;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f45296k = f10 + 90.0f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    public void t(Rect rect, androidx.constraintlayout.widget.f fVar, int i10, int i11) {
        float f10;
        r(rect.left, rect.top, rect.width(), rect.height());
        d(fVar.q0(i11));
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = this.f45296k + 90.0f;
                this.f45296k = f10;
                if (f10 > 180.0f) {
                    this.f45296k = f10 - 360.0f;
                }
            } else if (i10 != 3) {
                if (i10 == 4) {
                    f10 = this.f45296k + 90.0f;
                    this.f45296k = f10;
                    if (f10 > 180.0f) {
                        this.f45296k = f10 - 360.0f;
                    }
                }
            }
            return;
        }
        this.f45296k -= 90.0f;
    }

    public void v(View view) {
        r(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        c(view);
    }
}
