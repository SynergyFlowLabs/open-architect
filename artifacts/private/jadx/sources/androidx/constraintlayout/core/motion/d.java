package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.m;
import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
class d implements Comparable<d> {

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final String f43537j3 = "MotionPaths";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final boolean f43538k3 = false;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    static final int f43539l3 = 1;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    static final int f43540m3 = 2;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    static String[] f43541n3 = {"position", "x", "y", "width", "height", "pathRotate"};
    private float X;
    private float Y;
    private float Z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f43544c;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.d f43563s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f43565v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f43566w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f43542a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f43543b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f43545d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f43546e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f43547f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f43548g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f43550h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f43552i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f43554j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f43555k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f43556l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f43557m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f43558n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f43559o = 0.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f43564t = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f43560p0 = Float.NaN;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private float f43561p1 = Float.NaN;
    private int H1 = -1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    LinkedHashMap<String, b> f43562p2 = new LinkedHashMap<>();

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    int f43549g3 = 0;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    double[] f43551h3 = new double[18];

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    double[] f43553i3 = new double[18];

    d() {
    }

    private boolean e(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void b(HashMap<String, o> map, int i10) {
        for (String str : map.keySet()) {
            o oVar = map.get(str);
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
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        b10 = 2;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b10 = 3;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b10 = 4;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b10 = 5;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b10 = 6;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        b10 = 7;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        b10 = 8;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b10 = 9;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b10 = 10;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b10 = 11;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        b10 = com.google.common.base.c.f116461n;
                    }
                    break;
            }
            float f10 = 1.0f;
            float f11 = 0.0f;
            switch (b10) {
                case 0:
                    oVar.g(i10, Float.isNaN(this.f43548g) ? 0.0f : this.f43548g);
                    break;
                case 1:
                    if (!Float.isNaN(this.f43550h)) {
                        f11 = this.f43550h;
                    }
                    oVar.g(i10, f11);
                    break;
                case 2:
                    oVar.g(i10, Float.isNaN(this.f43547f) ? 0.0f : this.f43547f);
                    break;
                case 3:
                    oVar.g(i10, Float.isNaN(this.f43557m) ? 0.0f : this.f43557m);
                    break;
                case 4:
                    oVar.g(i10, Float.isNaN(this.f43558n) ? 0.0f : this.f43558n);
                    break;
                case 5:
                    if (!Float.isNaN(this.f43559o)) {
                        f11 = this.f43559o;
                    }
                    oVar.g(i10, f11);
                    break;
                case 6:
                    if (!Float.isNaN(this.f43561p1)) {
                        f11 = this.f43561p1;
                    }
                    oVar.g(i10, f11);
                    break;
                case 7:
                    oVar.g(i10, Float.isNaN(this.f43555k) ? 0.0f : this.f43555k);
                    break;
                case 8:
                    if (!Float.isNaN(this.f43556l)) {
                        f11 = this.f43556l;
                    }
                    oVar.g(i10, f11);
                    break;
                case 9:
                    oVar.g(i10, Float.isNaN(this.f43552i) ? 1.0f : this.f43552i);
                    break;
                case 10:
                    if (!Float.isNaN(this.f43554j)) {
                        f10 = this.f43554j;
                    }
                    oVar.g(i10, f10);
                    break;
                case 11:
                    oVar.g(i10, Float.isNaN(this.f43542a) ? 1.0f : this.f43542a);
                    break;
                case 12:
                    if (!Float.isNaN(this.f43560p0)) {
                        f11 = this.f43560p0;
                    }
                    oVar.g(i10, f11);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f43562p2.containsKey(str2)) {
                            b bVar = this.f43562p2.get(str2);
                            if (oVar instanceof o.c) {
                                ((o.c) oVar).k(i10, bVar);
                            } else {
                                w.f("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + bVar.n() + oVar);
                            }
                        }
                    } else {
                        w.f("MotionPaths", "UNKNOWN spline " + str);
                    }
                    break;
            }
        }
    }

    public void c(f fVar) {
        float fG;
        this.f43544c = fVar.B();
        if (fVar.B() != 4) {
            fG = 0.0f;
            int i10 = 6 << 0;
        } else {
            fG = fVar.g();
        }
        this.f43542a = fG;
        this.f43545d = false;
        this.f43547f = fVar.t();
        this.f43548g = fVar.r();
        this.f43550h = fVar.s();
        this.f43552i = fVar.u();
        this.f43554j = fVar.v();
        this.f43555k = fVar.o();
        this.f43556l = fVar.p();
        this.f43557m = fVar.x();
        this.f43558n = fVar.y();
        this.f43559o = fVar.z();
        for (String str : fVar.j()) {
            b bVarI = fVar.i(str);
            if (bVarI != null && bVarI.q()) {
                this.f43562p2.put(str, bVarI);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        return Float.compare(this.f43565v, dVar.f43565v);
    }

    void f(d dVar, HashSet<String> hashSet) {
        if (e(this.f43542a, dVar.f43542a)) {
            hashSet.add("alpha");
        }
        if (e(this.f43546e, dVar.f43546e)) {
            hashSet.add("translationZ");
        }
        int i10 = this.f43544c;
        int i11 = dVar.f43544c;
        if (i10 != i11 && this.f43543b == 0 && (i10 == 4 || i11 == 4)) {
            hashSet.add("alpha");
        }
        if (e(this.f43547f, dVar.f43547f)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f43560p0) || !Float.isNaN(dVar.f43560p0)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f43561p1) || !Float.isNaN(dVar.f43561p1)) {
            hashSet.add("progress");
        }
        if (e(this.f43548g, dVar.f43548g)) {
            hashSet.add("rotationX");
        }
        if (e(this.f43550h, dVar.f43550h)) {
            hashSet.add("rotationY");
        }
        if (e(this.f43555k, dVar.f43555k)) {
            hashSet.add("pivotX");
        }
        if (e(this.f43556l, dVar.f43556l)) {
            hashSet.add("pivotY");
        }
        if (e(this.f43552i, dVar.f43552i)) {
            hashSet.add("scaleX");
        }
        if (e(this.f43554j, dVar.f43554j)) {
            hashSet.add("scaleY");
        }
        if (e(this.f43557m, dVar.f43557m)) {
            hashSet.add("translationX");
        }
        if (e(this.f43558n, dVar.f43558n)) {
            hashSet.add("translationY");
        }
        if (e(this.f43559o, dVar.f43559o)) {
            hashSet.add("translationZ");
        }
        if (e(this.f43546e, dVar.f43546e)) {
            hashSet.add("elevation");
        }
    }

    void k(d dVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | e(this.f43565v, dVar.f43565v);
        zArr[1] = zArr[1] | e(this.f43566w, dVar.f43566w);
        zArr[2] = zArr[2] | e(this.X, dVar.X);
        zArr[3] = zArr[3] | e(this.Y, dVar.Y);
        zArr[4] = e(this.Z, dVar.Z) | zArr[4];
    }

    void l(double[] dArr, int[] iArr) {
        int i10 = 0;
        float[] fArr = {this.f43565v, this.f43566w, this.X, this.Y, this.Z, this.f43542a, this.f43546e, this.f43547f, this.f43548g, this.f43550h, this.f43552i, this.f43554j, this.f43555k, this.f43556l, this.f43557m, this.f43558n, this.f43559o, this.f43560p0};
        for (int i11 : iArr) {
            if (i11 < 18) {
                dArr[i10] = fArr[i11];
                i10++;
            }
        }
    }

    int n(String str, double[] dArr, int i10) {
        b bVar = this.f43562p2.get(str);
        if (bVar.r() == 1) {
            dArr[i10] = bVar.n();
            return 1;
        }
        int iR = bVar.r();
        float[] fArr = new float[iR];
        bVar.o(fArr);
        int i11 = 0;
        while (i11 < iR) {
            dArr[i10] = fArr[i11];
            i11++;
            i10++;
        }
        return iR;
    }

    int o(String str) {
        return this.f43562p2.get(str).r();
    }

    boolean p(String str) {
        return this.f43562p2.containsKey(str);
    }

    void q(float f10, float f11, float f12, float f13) {
        this.f43566w = f10;
        this.X = f11;
        this.Y = f12;
        this.Z = f13;
    }

    public void r(f fVar) {
        q(fVar.E(), fVar.F(), fVar.D(), fVar.k());
        c(fVar);
    }

    public void s(m mVar, f fVar, int i10, float f10) {
        q(mVar.f43851b, mVar.f43853d, mVar.b(), mVar.a());
        c(fVar);
        this.f43555k = Float.NaN;
        this.f43556l = Float.NaN;
        if (i10 == 1) {
            this.f43547f = f10 - 90.0f;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f43547f = f10 + 90.0f;
        }
    }
}
