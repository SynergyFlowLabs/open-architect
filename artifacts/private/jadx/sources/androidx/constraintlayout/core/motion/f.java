package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.v;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class f implements v {
    public static final int A = 0;
    public static final int B = 0;
    public static final int C = -1;
    public static final int D = -1;
    public static final int E = -2;
    public static final int F = Integer.MIN_VALUE;
    public static final int G = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f43596m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f43597n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f43598o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f43599p = -2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f43600q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f43601r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f43602s = -3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f43603t = -4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f43604u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f43605v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f43606w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f43607x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f43608y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f43609z = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    androidx.constraintlayout.core.state.v f43610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a f43611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    b f43612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f43613k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f43614l;

    public static class a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f43615n = -2;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f43616o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f43617p = -3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f43618a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43619b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f43620c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f43621d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f43622e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f43623f = Float.NaN;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f43624g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f43625h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f43626i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f43627j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f43628k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f43629l = -3;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f43630m = -1;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f43631a = 4;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43632b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f43633c = 1.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f43634d = Float.NaN;
    }

    public f() {
        this.f43610h = new androidx.constraintlayout.core.state.v();
        this.f43611i = new a();
        this.f43612j = new b();
    }

    public float A(int i10) {
        switch (i10) {
            case 303:
                return this.f43610h.f44474p;
            case 304:
                return this.f43610h.f44469k;
            case 305:
                return this.f43610h.f44470l;
            case 306:
                return this.f43610h.f44471m;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.f43610h.f44466h;
            case 309:
                return this.f43610h.f44467i;
            case 310:
                return this.f43610h.f44468j;
            case 311:
                return this.f43610h.f44472n;
            case 312:
                return this.f43610h.f44473o;
            case 313:
                return this.f43610h.f44464f;
            case 314:
                return this.f43610h.f44465g;
            case 315:
                return this.f43613k;
            case v.a.f43974q /* 316 */:
                return this.f43614l;
        }
    }

    public int B() {
        return this.f43612j.f43631a;
    }

    public androidx.constraintlayout.core.state.v C() {
        return this.f43610h;
    }

    public int D() {
        androidx.constraintlayout.core.state.v vVar = this.f43610h;
        return vVar.f44462d - vVar.f44460b;
    }

    public int E() {
        return this.f43610h.f44460b;
    }

    public int F() {
        return this.f43610h.f44461c;
    }

    public void G(int i10, int i11, int i12, int i13) {
        H(i10, i11, i12, i13);
    }

    public void H(int i10, int i11, int i12, int i13) {
        if (this.f43610h == null) {
            this.f43610h = new androidx.constraintlayout.core.state.v((androidx.constraintlayout.core.widgets.e) null);
        }
        androidx.constraintlayout.core.state.v vVar = this.f43610h;
        vVar.f44461c = i11;
        vVar.f44460b = i10;
        vVar.f44462d = i12;
        vVar.f44463e = i13;
    }

    public void I(String str, int i10, float f10) {
        this.f43610h.x(str, i10, f10);
    }

    public void J(String str, int i10, int i11) {
        this.f43610h.y(str, i10, i11);
    }

    public void K(String str, int i10, String str2) {
        this.f43610h.z(str, i10, str2);
    }

    public void L(String str, int i10, boolean z10) {
        this.f43610h.A(str, i10, z10);
    }

    public void M(androidx.constraintlayout.core.motion.a aVar, float[] fArr) {
        this.f43610h.x(aVar.f43472b, 901, fArr[0]);
    }

    public void N(float f10) {
        this.f43610h.f44464f = f10;
    }

    public void O(float f10) {
        this.f43610h.f44465g = f10;
    }

    public void P(float f10) {
        this.f43610h.f44466h = f10;
    }

    public void Q(float f10) {
        this.f43610h.f44467i = f10;
    }

    public void R(float f10) {
        this.f43610h.f44468j = f10;
    }

    public void S(float f10) {
        this.f43610h.f44472n = f10;
    }

    public void T(float f10) {
        this.f43610h.f44473o = f10;
    }

    public void U(float f10) {
        this.f43610h.f44469k = f10;
    }

    public void V(float f10) {
        this.f43610h.f44470l = f10;
    }

    public void W(float f10) {
        this.f43610h.f44471m = f10;
    }

    public boolean X(int i10, float f10) {
        switch (i10) {
            case 303:
                this.f43610h.f44474p = f10;
                break;
            case 304:
                this.f43610h.f44469k = f10;
                break;
            case 305:
                this.f43610h.f44470l = f10;
                break;
            case 306:
                this.f43610h.f44471m = f10;
                break;
            case 307:
            default:
                return false;
            case 308:
                this.f43610h.f44466h = f10;
                break;
            case 309:
                this.f43610h.f44467i = f10;
                break;
            case 310:
                this.f43610h.f44468j = f10;
                break;
            case 311:
                this.f43610h.f44472n = f10;
                break;
            case 312:
                this.f43610h.f44473o = f10;
                break;
            case 313:
                this.f43610h.f44464f = f10;
                break;
            case 314:
                this.f43610h.f44465g = f10;
                break;
            case 315:
                this.f43613k = f10;
                break;
            case v.a.f43974q /* 316 */:
                this.f43614l = f10;
                break;
        }
        return true;
    }

    public boolean Y(int i10, float f10) {
        switch (i10) {
            case 600:
                this.f43611i.f43623f = f10;
                break;
            case 601:
                this.f43611i.f43625h = f10;
                break;
            case v.e.f44049r /* 602 */:
                this.f43611i.f43626i = f10;
                break;
            default:
                return false;
        }
        return true;
    }

    public boolean Z(int i10, int i11) {
        switch (i10) {
            case v.e.f44053v /* 606 */:
                this.f43611i.f43619b = i11;
                return true;
            case v.e.f44054w /* 607 */:
                this.f43611i.f43621d = i11;
                return true;
            case v.e.f44055x /* 608 */:
                this.f43611i.f43622e = i11;
                return true;
            case v.e.f44056y /* 609 */:
                this.f43611i.f43624g = i11;
                return true;
            case v.e.f44057z /* 610 */:
                this.f43611i.f43627j = i11;
                return true;
            case v.e.A /* 611 */:
                this.f43611i.f43629l = i11;
                return true;
            case v.e.B /* 612 */:
                this.f43611i.f43630m = i11;
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        int iA = v.a.a(str);
        return iA != -1 ? iA : v.e.a(str);
    }

    public boolean a0(int i10, String str) {
        if (i10 == 603) {
            this.f43611i.f43620c = str;
            return true;
        }
        if (i10 != 604) {
            return false;
        }
        this.f43611i.f43628k = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i10, int i11) {
        if (X(i10, i11)) {
            return true;
        }
        return Z(i10, i11);
    }

    public void b0(int i10) {
        this.f43612j.f43631a = i10;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i10, float f10) {
        if (X(i10, f10)) {
            return true;
        }
        return Y(i10, f10);
    }

    public void c0(v vVar) {
        if (this.f43610h.m() != null) {
            this.f43610h.m().g(vVar);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i10, boolean z10) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i10, String str) {
        if (i10 != 605) {
            return a0(i10, str);
        }
        this.f43611i.f43618a = str;
        return true;
    }

    public f f(int i10) {
        return null;
    }

    public float g() {
        return this.f43610h.f44474p;
    }

    public int h() {
        return this.f43610h.f44463e;
    }

    public androidx.constraintlayout.core.motion.b i(String str) {
        return this.f43610h.h(str);
    }

    public Set<String> j() {
        return this.f43610h.i();
    }

    public int k() {
        androidx.constraintlayout.core.state.v vVar = this.f43610h;
        return vVar.f44463e - vVar.f44461c;
    }

    public int l() {
        return this.f43610h.f44460b;
    }

    public String m() {
        return this.f43610h.l();
    }

    public f n() {
        return null;
    }

    public float o() {
        return this.f43610h.f44464f;
    }

    public float p() {
        return this.f43610h.f44465g;
    }

    public int q() {
        return this.f43610h.f44462d;
    }

    public float r() {
        return this.f43610h.f44466h;
    }

    public float s() {
        return this.f43610h.f44467i;
    }

    public float t() {
        return this.f43610h.f44468j;
    }

    public String toString() {
        return this.f43610h.f44460b + ", " + this.f43610h.f44461c + ", " + this.f43610h.f44462d + ", " + this.f43610h.f44463e;
    }

    public float u() {
        return this.f43610h.f44472n;
    }

    public float v() {
        return this.f43610h.f44473o;
    }

    public int w() {
        return this.f43610h.f44461c;
    }

    public float x() {
        return this.f43610h.f44469k;
    }

    public float y() {
        return this.f43610h.f44470l;
    }

    public float z() {
        return this.f43610h.f44471m;
    }

    public f(androidx.constraintlayout.core.state.v vVar) {
        this.f43610h = new androidx.constraintlayout.core.state.v();
        this.f43611i = new a();
        this.f43612j = new b();
        this.f43610h = vVar;
    }
}
