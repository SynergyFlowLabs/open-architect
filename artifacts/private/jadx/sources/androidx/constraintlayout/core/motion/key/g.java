package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class g extends b {
    private static final String R = "KeyTrigger";
    public static final String S = "viewTransitionOnCross";
    public static final String T = "viewTransitionOnPositiveCross";
    public static final String U = "viewTransitionOnNegativeCross";
    public static final String V = "postLayout";
    public static final String W = "triggerSlack";
    public static final String X = "triggerCollisionView";
    public static final String Y = "triggerCollisionId";
    public static final String Z = "triggerID";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f43678a0 = "positiveCross";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f43679b0 = "negativeCross";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f43680c0 = "triggerReceiver";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f43681d0 = "CROSS";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f43682e0 = 301;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f43683f0 = 302;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f43684g0 = 303;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f43685h0 = 304;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f43686i0 = 305;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f43687j0 = 306;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f43688k0 = 307;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f43689l0 = 308;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f43690m0 = 309;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f43691n0 = 310;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f43692o0 = 311;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f43693p0 = 312;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f43694q0 = 5;
    private int A;
    private String B;
    private String C;
    private int D;
    private int E;
    float F;
    private boolean G;
    private boolean H;
    private boolean I;
    private float J;
    private float K;
    private boolean L;
    int M;
    int N;
    int O;
    androidx.constraintlayout.core.motion.utils.e P;
    androidx.constraintlayout.core.motion.utils.e Q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f43695y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f43696z = null;

    public g() {
        int i10 = b.f43648m;
        this.A = i10;
        this.B = null;
        this.C = null;
        this.D = i10;
        this.E = i10;
        this.F = 0.1f;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = Float.NaN;
        this.L = false;
        this.M = i10;
        this.N = i10;
        this.O = i10;
        this.P = new androidx.constraintlayout.core.motion.utils.e();
        this.Q = new androidx.constraintlayout.core.motion.utils.e();
        this.f43663k = 5;
        this.f43664l = new HashMap<>();
    }

    private void x(String str, androidx.constraintlayout.core.motion.f fVar) {
        boolean z10 = str.length() == 1;
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f43664l.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z10 || lowerCase.matches(str)) {
                androidx.constraintlayout.core.motion.b bVar = this.f43664l.get(str2);
                if (bVar != null) {
                    bVar.a(fVar);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        str.getClass();
        switch (str) {
            case "positiveCross":
                return 309;
            case "viewTransitionOnPositiveCross":
                return 302;
            case "triggerCollisionId":
                return 307;
            case "triggerID":
                return 308;
            case "negativeCross":
                return 310;
            case "triggerCollisionView":
                return 306;
            case "viewTransitionOnNegativeCross":
                return 303;
            case "triggerSlack":
                return 305;
            case "viewTransitionOnCross":
                return 301;
            case "postLayout":
                return 304;
            case "triggerReceiver":
                return 311;
            default:
                return -1;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i10, int i11) {
        if (i10 == 307) {
            this.E = i11;
            return true;
        }
        if (i10 == 308) {
            this.D = u(Integer.valueOf(i11));
            return true;
        }
        if (i10 == 311) {
            this.A = i11;
            return true;
        }
        switch (i10) {
            case 301:
                this.O = i11;
                return true;
            case 302:
                this.N = i11;
                return true;
            case 303:
                this.M = i11;
                return true;
            default:
                return super.b(i10, i11);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i10, float f10) {
        if (i10 != 305) {
            return super.c(i10, f10);
        }
        this.F = f10;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i10, boolean z10) {
        if (i10 != 304) {
            return super.d(i10, z10);
        }
        this.L = z10;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i10, String str) {
        if (i10 == 309) {
            this.C = str;
        } else if (i10 == 310) {
            this.B = str;
        } else {
            if (i10 != 312) {
                return super.e(i10, str);
            }
            this.f43696z = str;
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, o> map) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* JADX INFO: renamed from: g */
    public b clone() {
        return new g().h(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
    }

    public void v(float f10, androidx.constraintlayout.core.motion.f fVar) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public g h(b bVar) {
        super.h(bVar);
        g gVar = (g) bVar;
        this.f43695y = gVar.f43695y;
        this.f43696z = gVar.f43696z;
        this.A = gVar.A;
        this.B = gVar.B;
        this.C = gVar.C;
        this.D = gVar.D;
        this.E = gVar.E;
        this.F = gVar.F;
        this.G = gVar.G;
        this.H = gVar.H;
        this.I = gVar.I;
        this.J = gVar.J;
        this.K = gVar.K;
        this.L = gVar.L;
        this.P = gVar.P;
        this.Q = gVar.Q;
        return this;
    }
}
