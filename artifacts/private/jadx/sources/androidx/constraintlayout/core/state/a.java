package androidx.constraintlayout.core.state;

import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f44194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final k f44196b;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private float f44199c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f44201d0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    e f44205f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    e f44207g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Object f44209h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.e f44211i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private HashMap<String, Integer> f44213j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private HashMap<String, Float> f44215k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    androidx.constraintlayout.core.motion.utils.u f44217l0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f44198c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.constraintlayout.core.state.helpers.e f44200d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f44202e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f44204f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f44206g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f44208h = -1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected float f44210i = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f44212j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f44214k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f44216l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f44218m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f44219n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f44220o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f44221p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected int f44222q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f44223r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected int f44224s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f44225t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f44226u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected int f44227v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f44228w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f44229x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    float f44230y = Float.NaN;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    float f44231z = Float.NaN;
    float A = Float.NaN;
    float B = Float.NaN;
    float C = Float.NaN;
    float D = Float.NaN;
    float E = Float.NaN;
    float F = Float.NaN;
    float G = Float.NaN;
    float H = Float.NaN;
    float I = Float.NaN;
    int J = 0;
    protected Object K = null;
    protected Object L = null;
    protected Object M = null;
    protected Object N = null;
    protected Object O = null;
    protected Object P = null;
    protected Object Q = null;
    protected Object R = null;
    protected Object S = null;
    protected Object T = null;

    @p0
    Object U = null;
    protected Object V = null;
    protected Object W = null;

    @p0
    Object X = null;
    Object Y = null;
    Object Z = null;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    Object f44195a0 = null;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    Object f44197b0 = null;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    k.b f44203e0 = null;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0358a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44232a;

        static {
            int[] iArr = new int[k.b.values().length];
            f44232a = iArr;
            try {
                iArr[k.b.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44232a[k.b.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44232a[k.b.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44232a[k.b.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44232a[k.b.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44232a[k.b.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44232a[k.b.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44232a[k.b.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44232a[k.b.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44232a[k.b.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44232a[k.b.TOP_TO_BASELINE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f44232a[k.b.BOTTOM_TO_TOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f44232a[k.b.BOTTOM_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f44232a[k.b.BOTTOM_TO_BASELINE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f44232a[k.b.BASELINE_TO_BOTTOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f44232a[k.b.BASELINE_TO_TOP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f44232a[k.b.BASELINE_TO_BASELINE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f44232a[k.b.CIRCULAR_CONSTRAINT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f44232a[k.b.CENTER_HORIZONTALLY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f44232a[k.b.CENTER_VERTICALLY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public interface b {
        a a(k kVar);
    }

    static class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList<String> f44233a;

        c(ArrayList<String> arrayList) {
            this.f44233a = arrayList;
        }

        public ArrayList<String> a() {
            return this.f44233a;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return toString();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.f44233a.toString();
        }
    }

    public a(k kVar) {
        Object obj = e.f44260j;
        this.f44205f0 = e.l(obj);
        this.f44207g0 = e.l(obj);
        this.f44213j0 = new HashMap<>();
        this.f44215k0 = new HashMap<>();
        this.f44217l0 = null;
        this.f44196b = kVar;
    }

    private void A() {
        this.K = E(this.K);
        this.L = E(this.L);
        this.M = E(this.M);
        this.N = E(this.N);
        this.O = E(this.O);
        this.P = E(this.P);
        this.Q = E(this.Q);
        this.R = E(this.R);
        this.S = E(this.S);
        this.T = E(this.T);
        this.V = E(this.V);
        this.W = E(this.W);
        this.Y = E(this.Y);
        this.Z = E(this.Z);
        this.f44195a0 = E(this.f44195a0);
    }

    private Object E(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof a) ? this.f44196b.C(obj) : obj;
    }

    private androidx.constraintlayout.core.widgets.e R(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).a();
        }
        return null;
    }

    private void h(androidx.constraintlayout.core.widgets.e eVar, Object obj, k.b bVar) {
        androidx.constraintlayout.core.widgets.e eVarR = R(obj);
        if (eVarR == null) {
            return;
        }
        int[] iArr = C0358a.f44232a;
        int i10 = iArr[bVar.ordinal()];
        switch (iArr[bVar.ordinal()]) {
            case 1:
                androidx.constraintlayout.core.widgets.d.a aVar = androidx.constraintlayout.core.widgets.d.a.LEFT;
                eVar.r(aVar).b(eVarR.r(aVar), this.f44214k, this.f44222q, false);
                break;
            case 2:
                eVar.r(androidx.constraintlayout.core.widgets.d.a.LEFT).b(eVarR.r(androidx.constraintlayout.core.widgets.d.a.RIGHT), this.f44214k, this.f44222q, false);
                break;
            case 3:
                eVar.r(androidx.constraintlayout.core.widgets.d.a.RIGHT).b(eVarR.r(androidx.constraintlayout.core.widgets.d.a.LEFT), this.f44216l, this.f44223r, false);
                break;
            case 4:
                androidx.constraintlayout.core.widgets.d.a aVar2 = androidx.constraintlayout.core.widgets.d.a.RIGHT;
                eVar.r(aVar2).b(eVarR.r(aVar2), this.f44216l, this.f44223r, false);
                break;
            case 5:
                androidx.constraintlayout.core.widgets.d.a aVar3 = androidx.constraintlayout.core.widgets.d.a.LEFT;
                eVar.r(aVar3).b(eVarR.r(aVar3), this.f44218m, this.f44224s, false);
                break;
            case 6:
                eVar.r(androidx.constraintlayout.core.widgets.d.a.LEFT).b(eVarR.r(androidx.constraintlayout.core.widgets.d.a.RIGHT), this.f44218m, this.f44224s, false);
                break;
            case 7:
                eVar.r(androidx.constraintlayout.core.widgets.d.a.RIGHT).b(eVarR.r(androidx.constraintlayout.core.widgets.d.a.LEFT), this.f44219n, this.f44225t, false);
                break;
            case 8:
                androidx.constraintlayout.core.widgets.d.a aVar4 = androidx.constraintlayout.core.widgets.d.a.RIGHT;
                eVar.r(aVar4).b(eVarR.r(aVar4), this.f44219n, this.f44225t, false);
                break;
            case 9:
                androidx.constraintlayout.core.widgets.d.a aVar5 = androidx.constraintlayout.core.widgets.d.a.TOP;
                eVar.r(aVar5).b(eVarR.r(aVar5), this.f44220o, this.f44226u, false);
                break;
            case 10:
                eVar.r(androidx.constraintlayout.core.widgets.d.a.TOP).b(eVarR.r(androidx.constraintlayout.core.widgets.d.a.BOTTOM), this.f44220o, this.f44226u, false);
                break;
            case 11:
                eVar.v0(androidx.constraintlayout.core.widgets.d.a.TOP, eVarR, androidx.constraintlayout.core.widgets.d.a.BASELINE, this.f44220o, this.f44226u);
                break;
            case 12:
                eVar.r(androidx.constraintlayout.core.widgets.d.a.BOTTOM).b(eVarR.r(androidx.constraintlayout.core.widgets.d.a.TOP), this.f44221p, this.f44227v, false);
                break;
            case 13:
                androidx.constraintlayout.core.widgets.d.a aVar6 = androidx.constraintlayout.core.widgets.d.a.BOTTOM;
                eVar.r(aVar6).b(eVarR.r(aVar6), this.f44221p, this.f44227v, false);
                break;
            case 14:
                eVar.v0(androidx.constraintlayout.core.widgets.d.a.BOTTOM, eVarR, androidx.constraintlayout.core.widgets.d.a.BASELINE, this.f44221p, this.f44227v);
                break;
            case 15:
                eVar.v0(androidx.constraintlayout.core.widgets.d.a.BASELINE, eVarR, androidx.constraintlayout.core.widgets.d.a.BOTTOM, this.f44228w, this.f44229x);
                break;
            case 16:
                eVar.v0(androidx.constraintlayout.core.widgets.d.a.BASELINE, eVarR, androidx.constraintlayout.core.widgets.d.a.TOP, this.f44228w, this.f44229x);
                break;
            case 17:
                androidx.constraintlayout.core.widgets.d.a aVar7 = androidx.constraintlayout.core.widgets.d.a.BASELINE;
                eVar.v0(aVar7, eVarR, aVar7, this.f44228w, this.f44229x);
                break;
            case 18:
                eVar.m(eVarR, this.f44199c0, (int) this.f44201d0);
                break;
        }
    }

    public a A0(e eVar) {
        this.f44205f0 = eVar;
        return this;
    }

    public a B() {
        if (this.Q != null) {
            this.f44203e0 = k.b.END_TO_START;
            return this;
        }
        this.f44203e0 = k.b.END_TO_END;
        return this;
    }

    public a B0() {
        if (this.O != null) {
            this.f44203e0 = k.b.START_TO_START;
            return this;
        }
        this.f44203e0 = k.b.START_TO_END;
        return this;
    }

    public a C(Object obj) {
        this.f44203e0 = k.b.END_TO_END;
        this.R = obj;
        return this;
    }

    public a C0(Object obj) {
        this.f44203e0 = k.b.START_TO_END;
        this.P = obj;
        return this;
    }

    public a D(Object obj) {
        this.f44203e0 = k.b.END_TO_START;
        this.Q = obj;
        return this;
    }

    public a D0(Object obj) {
        this.f44203e0 = k.b.START_TO_START;
        this.O = obj;
        return this;
    }

    public a E0() {
        if (this.S != null) {
            this.f44203e0 = k.b.TOP_TO_TOP;
            return this;
        }
        this.f44203e0 = k.b.TOP_TO_BOTTOM;
        return this;
    }

    public float F() {
        return this.G;
    }

    a F0(Object obj) {
        this.f44203e0 = k.b.TOP_TO_BASELINE;
        this.U = obj;
        return this;
    }

    public e G() {
        return this.f44207g0;
    }

    public a G0(Object obj) {
        this.f44203e0 = k.b.TOP_TO_BOTTOM;
        this.T = obj;
        return this;
    }

    public int H() {
        return this.f44202e;
    }

    public a H0(Object obj) {
        this.f44203e0 = k.b.TOP_TO_TOP;
        this.S = obj;
        return this;
    }

    public float I() {
        return this.f44206g;
    }

    public a I0(float f10) {
        this.D = f10;
        return this;
    }

    public float J() {
        return this.f44230y;
    }

    public a J0(float f10) {
        this.E = f10;
        return this;
    }

    public float K() {
        return this.f44231z;
    }

    public a K0(float f10) {
        this.F = f10;
        return this;
    }

    public float L() {
        return this.A;
    }

    public void L0() throws c {
        ArrayList arrayList = new ArrayList();
        if (this.K != null && this.L != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.M != null && this.N != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.O != null && this.P != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.Q != null && this.R != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.K != null || this.L != null || this.M != null || this.N != null) && (this.O != null || this.P != null || this.Q != null || this.R != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new c(arrayList);
        }
    }

    public float M() {
        return this.B;
    }

    public a M0(float f10) {
        this.f44212j = f10;
        return this;
    }

    public float N() {
        return this.C;
    }

    public a N0(int i10) {
        this.J = i10;
        return this;
    }

    public float O() {
        return this.H;
    }

    public a O0(e eVar) {
        return A0(eVar);
    }

    public float P() {
        return this.I;
    }

    public String Q() {
        return this.f44198c;
    }

    public float S() {
        return this.D;
    }

    public float T() {
        return this.E;
    }

    public float U() {
        return this.F;
    }

    public int V(int i10) {
        return this.f44204f;
    }

    public float W() {
        return this.f44208h;
    }

    public Object X() {
        return this.f44209h0;
    }

    public e Y() {
        return this.f44205f0;
    }

    public a Z(e eVar) {
        return t0(eVar);
    }

    @Override // androidx.constraintlayout.core.state.h
    public androidx.constraintlayout.core.widgets.e a() {
        if (this.f44211i0 == null) {
            androidx.constraintlayout.core.widgets.e eVarZ = z();
            this.f44211i0 = eVarZ;
            eVarZ.i1(this.f44209h0);
        }
        return this.f44211i0;
    }

    public a a0(float f10) {
        this.f44210i = f10;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.h
    public void apply() {
        if (this.f44211i0 == null) {
            return;
        }
        androidx.constraintlayout.core.state.helpers.e eVar = this.f44200d;
        if (eVar != null) {
            eVar.apply();
        }
        this.f44205f0.j(this.f44196b, this.f44211i0, 0);
        this.f44207g0.j(this.f44196b, this.f44211i0, 1);
        A();
        i();
        int i10 = this.f44202e;
        if (i10 != 0) {
            this.f44211i0.C1(i10);
        }
        int i11 = this.f44204f;
        if (i11 != 0) {
            this.f44211i0.X1(i11);
        }
        float f10 = this.f44206g;
        if (f10 != -1.0f) {
            this.f44211i0.G1(f10);
        }
        float f11 = this.f44208h;
        if (f11 != -1.0f) {
            this.f44211i0.b2(f11);
        }
        this.f44211i0.B1(this.f44210i);
        this.f44211i0.W1(this.f44212j);
        androidx.constraintlayout.core.widgets.e eVar2 = this.f44211i0;
        v vVar = eVar2.f44728n;
        vVar.f44464f = this.f44230y;
        vVar.f44465g = this.f44231z;
        vVar.f44466h = this.A;
        vVar.f44467i = this.B;
        vVar.f44468j = this.C;
        vVar.f44469k = this.D;
        vVar.f44470l = this.E;
        vVar.f44471m = this.F;
        vVar.f44472n = this.H;
        vVar.f44473o = this.I;
        vVar.f44474p = this.G;
        int i12 = this.J;
        vVar.f44476r = i12;
        eVar2.c2(i12);
        this.f44211i0.f44728n.C(this.f44217l0);
        HashMap<String, Integer> map = this.f44213j0;
        if (map != null) {
            for (String str : map.keySet()) {
                this.f44211i0.f44728n.y(str, 902, this.f44213j0.get(str).intValue());
            }
        }
        HashMap<String, Float> map2 = this.f44215k0;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                this.f44211i0.f44728n.x(str2, 901, this.f44215k0.get(str2).floatValue());
            }
        }
    }

    @Override // androidx.constraintlayout.core.state.h
    public void b(androidx.constraintlayout.core.widgets.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f44211i0 = eVar;
        eVar.i1(this.f44209h0);
    }

    public a b0() {
        if (this.K != null) {
            this.f44203e0 = k.b.LEFT_TO_LEFT;
            return this;
        }
        this.f44203e0 = k.b.LEFT_TO_RIGHT;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.h
    public void c(Object obj) {
        this.f44194a = obj;
    }

    public a c0(Object obj) {
        this.f44203e0 = k.b.LEFT_TO_LEFT;
        this.K = obj;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.h
    public androidx.constraintlayout.core.state.helpers.e d() {
        return this.f44200d;
    }

    public a d0(Object obj) {
        this.f44203e0 = k.b.LEFT_TO_RIGHT;
        this.L = obj;
        return this;
    }

    public void e(String str, int i10) {
        this.f44213j0.put(str, Integer.valueOf(i10));
    }

    public a e0(int i10) {
        k.b bVar = this.f44203e0;
        if (bVar == null) {
            this.f44214k = i10;
            this.f44216l = i10;
            this.f44218m = i10;
            this.f44219n = i10;
            this.f44220o = i10;
            this.f44221p = i10;
            return this;
        }
        switch (C0358a.f44232a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.f44214k = i10;
                break;
            case 3:
            case 4:
                this.f44216l = i10;
                break;
            case 5:
            case 6:
                this.f44218m = i10;
                break;
            case 7:
            case 8:
                this.f44219n = i10;
                break;
            case 9:
            case 10:
            case 11:
                this.f44220o = i10;
                break;
            case 12:
            case 13:
            case 14:
                this.f44221p = i10;
                break;
            case 15:
            case 16:
            case 17:
                this.f44228w = i10;
                break;
            case 18:
                this.f44201d0 = i10;
                break;
        }
        return this;
    }

    public void f(String str, float f10) {
        if (this.f44215k0 == null) {
            this.f44215k0 = new HashMap<>();
        }
        this.f44215k0.put(str, Float.valueOf(f10));
    }

    public a f0(Object obj) {
        return e0(this.f44196b.g(obj));
    }

    public a g(float f10) {
        this.G = f10;
        return this;
    }

    public a g0(int i10) {
        k.b bVar = this.f44203e0;
        if (bVar == null) {
            this.f44222q = i10;
            this.f44223r = i10;
            this.f44224s = i10;
            this.f44225t = i10;
            this.f44226u = i10;
            this.f44227v = i10;
            return this;
        }
        switch (C0358a.f44232a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.f44222q = i10;
                break;
            case 3:
            case 4:
                this.f44223r = i10;
                break;
            case 5:
            case 6:
                this.f44224s = i10;
                break;
            case 7:
            case 8:
                this.f44225t = i10;
                break;
            case 9:
            case 10:
            case 11:
                this.f44226u = i10;
                break;
            case 12:
            case 13:
            case 14:
                this.f44227v = i10;
                break;
            case 15:
            case 16:
            case 17:
                this.f44229x = i10;
                break;
        }
        return this;
    }

    @Override // androidx.constraintlayout.core.state.h
    public Object getKey() {
        return this.f44194a;
    }

    public a h0(Object obj) {
        return g0(this.f44196b.g(obj));
    }

    public void i() {
        h(this.f44211i0, this.K, k.b.LEFT_TO_LEFT);
        h(this.f44211i0, this.L, k.b.LEFT_TO_RIGHT);
        h(this.f44211i0, this.M, k.b.RIGHT_TO_LEFT);
        h(this.f44211i0, this.N, k.b.RIGHT_TO_RIGHT);
        h(this.f44211i0, this.O, k.b.START_TO_START);
        h(this.f44211i0, this.P, k.b.START_TO_END);
        h(this.f44211i0, this.Q, k.b.END_TO_START);
        h(this.f44211i0, this.R, k.b.END_TO_END);
        h(this.f44211i0, this.S, k.b.TOP_TO_TOP);
        h(this.f44211i0, this.T, k.b.TOP_TO_BOTTOM);
        h(this.f44211i0, this.U, k.b.TOP_TO_BASELINE);
        h(this.f44211i0, this.V, k.b.BOTTOM_TO_TOP);
        h(this.f44211i0, this.W, k.b.BOTTOM_TO_BOTTOM);
        h(this.f44211i0, this.X, k.b.BOTTOM_TO_BASELINE);
        h(this.f44211i0, this.Y, k.b.BASELINE_TO_BASELINE);
        h(this.f44211i0, this.Z, k.b.BASELINE_TO_TOP);
        h(this.f44211i0, this.f44195a0, k.b.BASELINE_TO_BOTTOM);
        h(this.f44211i0, this.f44197b0, k.b.CIRCULAR_CONSTRAINT);
    }

    public a i0(float f10) {
        this.f44230y = f10;
        return this;
    }

    public a j() {
        this.f44203e0 = k.b.BASELINE_TO_BASELINE;
        return this;
    }

    public a j0(float f10) {
        this.f44231z = f10;
        return this;
    }

    public a k(Object obj) {
        this.f44203e0 = k.b.BASELINE_TO_BASELINE;
        this.Y = obj;
        return this;
    }

    public a k0() {
        if (this.M != null) {
            this.f44203e0 = k.b.RIGHT_TO_LEFT;
            return this;
        }
        this.f44203e0 = k.b.RIGHT_TO_RIGHT;
        return this;
    }

    public a l(Object obj) {
        this.f44203e0 = k.b.BASELINE_TO_BOTTOM;
        this.f44195a0 = obj;
        return this;
    }

    public a l0(Object obj) {
        this.f44203e0 = k.b.RIGHT_TO_LEFT;
        this.M = obj;
        return this;
    }

    public a m(Object obj) {
        this.f44203e0 = k.b.BASELINE_TO_TOP;
        this.Z = obj;
        return this;
    }

    public a m0(Object obj) {
        this.f44203e0 = k.b.RIGHT_TO_RIGHT;
        this.N = obj;
        return this;
    }

    public a n(float f10) {
        k.b bVar = this.f44203e0;
        if (bVar != null) {
            int i10 = C0358a.f44232a[bVar.ordinal()];
            if (i10 != 19) {
                if (i10 != 20) {
                    switch (i10) {
                    }
                }
                this.f44212j = f10;
                return this;
            }
            this.f44210i = f10;
            return this;
        }
        return this;
    }

    public a n0(float f10) {
        this.A = f10;
        return this;
    }

    public a o() {
        if (this.V != null) {
            this.f44203e0 = k.b.BOTTOM_TO_TOP;
            return this;
        }
        this.f44203e0 = k.b.BOTTOM_TO_BOTTOM;
        return this;
    }

    public a o0(float f10) {
        this.B = f10;
        return this;
    }

    a p(Object obj) {
        this.f44203e0 = k.b.BOTTOM_TO_BASELINE;
        this.X = obj;
        return this;
    }

    public a p0(float f10) {
        this.C = f10;
        return this;
    }

    public a q(Object obj) {
        this.f44203e0 = k.b.BOTTOM_TO_BOTTOM;
        this.W = obj;
        return this;
    }

    public a q0(float f10) {
        this.H = f10;
        return this;
    }

    public a r(Object obj) {
        this.f44203e0 = k.b.BOTTOM_TO_TOP;
        this.V = obj;
        return this;
    }

    public a r0(float f10) {
        this.I = f10;
        return this;
    }

    public a s(Object obj) {
        Object objE = E(obj);
        this.O = objE;
        this.R = objE;
        this.f44203e0 = k.b.CENTER_HORIZONTALLY;
        this.f44210i = 0.5f;
        return this;
    }

    public void s0(androidx.constraintlayout.core.state.helpers.e eVar) {
        this.f44200d = eVar;
        if (eVar != null) {
            b(eVar.a());
        }
    }

    public a t(Object obj) {
        Object objE = E(obj);
        this.S = objE;
        this.W = objE;
        this.f44203e0 = k.b.CENTER_VERTICALLY;
        this.f44212j = 0.5f;
        return this;
    }

    public a t0(e eVar) {
        this.f44207g0 = eVar;
        return this;
    }

    public a u(Object obj, float f10, float f11) {
        this.f44197b0 = E(obj);
        this.f44199c0 = f10;
        this.f44201d0 = f11;
        this.f44203e0 = k.b.CIRCULAR_CONSTRAINT;
        return this;
    }

    public void u0(int i10) {
        this.f44202e = i10;
    }

    public a v() {
        k.b bVar = this.f44203e0;
        if (bVar == null) {
            w();
            return this;
        }
        switch (C0358a.f44232a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.K = null;
                this.L = null;
                this.f44214k = 0;
                this.f44222q = 0;
                break;
            case 3:
            case 4:
                this.M = null;
                this.N = null;
                this.f44216l = 0;
                this.f44223r = 0;
                break;
            case 5:
            case 6:
                this.O = null;
                this.P = null;
                this.f44218m = 0;
                this.f44224s = 0;
                break;
            case 7:
            case 8:
                this.Q = null;
                this.R = null;
                this.f44219n = 0;
                this.f44225t = 0;
                break;
            case 9:
            case 10:
            case 11:
                this.S = null;
                this.T = null;
                this.U = null;
                this.f44220o = 0;
                this.f44226u = 0;
                break;
            case 12:
            case 13:
            case 14:
                this.V = null;
                this.W = null;
                this.X = null;
                this.f44221p = 0;
                this.f44227v = 0;
                break;
            case 17:
                this.Y = null;
                break;
            case 18:
                this.f44197b0 = null;
                break;
        }
        return this;
    }

    public void v0(float f10) {
        this.f44206g = f10;
    }

    public a w() {
        this.K = null;
        this.L = null;
        this.f44214k = 0;
        this.M = null;
        this.N = null;
        this.f44216l = 0;
        this.O = null;
        this.P = null;
        this.f44218m = 0;
        this.Q = null;
        this.R = null;
        this.f44219n = 0;
        this.S = null;
        this.T = null;
        this.f44220o = 0;
        this.V = null;
        this.W = null;
        this.f44221p = 0;
        this.Y = null;
        this.f44197b0 = null;
        this.f44210i = 0.5f;
        this.f44212j = 0.5f;
        this.f44222q = 0;
        this.f44223r = 0;
        this.f44224s = 0;
        this.f44225t = 0;
        this.f44226u = 0;
        this.f44227v = 0;
        return this;
    }

    public void w0(String str) {
        this.f44198c = str;
    }

    public a x() {
        B0().v();
        B().v();
        b0().v();
        k0().v();
        return this;
    }

    public void x0(int i10) {
        this.f44204f = i10;
    }

    public a y() {
        E0().v();
        j().v();
        o().v();
        return this;
    }

    public void y0(float f10) {
        this.f44208h = f10;
    }

    public androidx.constraintlayout.core.widgets.e z() {
        return new androidx.constraintlayout.core.widgets.e(Y().w(), G().w());
    }

    public void z0(Object obj) {
        this.f44209h0 = obj;
        androidx.constraintlayout.core.widgets.e eVar = this.f44211i0;
        if (eVar != null) {
            eVar.i1(obj);
        }
    }
}
