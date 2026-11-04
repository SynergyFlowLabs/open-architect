package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import io.sentry.protocol.d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class t implements androidx.constraintlayout.core.motion.utils.v {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    static final int D = 0;
    static final int E = 1;
    static final int F = 2;
    static final int G = 3;
    static final int H = 4;
    static final int I = 5;
    static final int J = 6;
    private static final int K = -1;
    private static final int L = -2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final boolean f44393z = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HashMap<Integer, HashMap<String, a>> f44394h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashMap<String, c> f44395i = new HashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.u f44396j = new androidx.constraintlayout.core.motion.utils.u();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f44397k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f44398l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.d f44399m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f44400n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f44401o = 400;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f44402p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b f44403q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final d f44404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f44405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f44406t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f44407u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f44408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f44409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f44410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f44411y;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f44412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f44413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f44414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f44415d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f44416e;

        a(String str, int i10, int i11, float f10, float f11) {
            this.f44413b = str;
            this.f44412a = i10;
            this.f44414c = i11;
            this.f44415d = f10;
            this.f44416e = f11;
        }
    }

    static class b {
        public static final int A = 6;
        public static final int D = 0;
        public static final int E = 1;
        public static final int F = 2;
        public static final int G = 3;
        public static final int H = 4;
        public static final int I = 5;
        public static final int J = 6;
        public static final int K = 7;
        public static final int M = 0;
        public static final int N = 1;
        public static final int P = 0;
        public static final int Q = 1;
        public static final int R = 2;
        public static final int S = 3;
        public static final int T = 4;
        public static final int U = 5;
        public static final int V = 6;
        public static final int W = 7;
        public static final int Y = 0;
        public static final int Z = 1;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public static final int f44417a0 = 2;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public static final int f44418b0 = 3;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f44421u = 0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f44422v = 1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f44423w = 2;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f44424x = 3;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f44425y = 4;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f44426z = 5;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f44427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f44428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.constraintlayout.core.motion.utils.r f44429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f44430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f44431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f44432f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f44433g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f44434h = 1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f44435i = 10.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f44436j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f44437k = 4.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f44438l = 1.2f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f44439m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f44440n = 1.0f;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private float f44441o = 400.0f;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private float f44442p = 10.0f;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f44443q = 0.01f;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private float f44444r = 0.0f;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f44445s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f44446t;
        public static final String[] B = {"top", "left", "right", VerticalAlignment.BOTTOM, "middle", "start", "end"};
        private static final float[][] C = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
        public static final String[] L = {"up", "down", "left", "right", "start", "end", "clockwise", "anticlockwise"};
        public static final String[] O = {"velocity", d0.f306177c};
        public static final String[] X = {"autocomplete", "toStart", "toEnd", "stop", "decelerate", "decelerateComplete", "neverCompleteStart", "neverCompleteEnd"};

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public static final String[] f44419c0 = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        private static final float[][] f44420d0 = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

        b() {
            int i10 = 1 << 0;
        }

        void a(float f10, float f11, long j10, float f12) {
            androidx.constraintlayout.core.motion.utils.p pVar;
            androidx.constraintlayout.core.motion.utils.s sVar;
            androidx.constraintlayout.core.motion.utils.s.a aVar;
            this.f44446t = j10;
            float fAbs = Math.abs(f11);
            float f13 = this.f44437k;
            if (fAbs > f13) {
                f11 = Math.signum(f11) * f13;
            }
            float f14 = f11;
            float fB = b(f10, f14, f12);
            this.f44444r = fB;
            if (fB == f10) {
                this.f44429c = null;
                return;
            }
            if (this.f44439m == 4 && this.f44436j == 0) {
                androidx.constraintlayout.core.motion.utils.r rVar = this.f44429c;
                if (rVar instanceof androidx.constraintlayout.core.motion.utils.s.a) {
                    aVar = (androidx.constraintlayout.core.motion.utils.s.a) rVar;
                } else {
                    aVar = new androidx.constraintlayout.core.motion.utils.s.a();
                    this.f44429c = aVar;
                }
                aVar.e(f10, this.f44444r, f14);
                return;
            }
            if (this.f44436j == 0) {
                androidx.constraintlayout.core.motion.utils.r rVar2 = this.f44429c;
                if (rVar2 instanceof androidx.constraintlayout.core.motion.utils.s) {
                    sVar = (androidx.constraintlayout.core.motion.utils.s) rVar2;
                } else {
                    sVar = new androidx.constraintlayout.core.motion.utils.s();
                    this.f44429c = sVar;
                }
                sVar.f(f10, this.f44444r, f14, f12, this.f44438l, this.f44437k);
                return;
            }
            androidx.constraintlayout.core.motion.utils.r rVar3 = this.f44429c;
            if (rVar3 instanceof androidx.constraintlayout.core.motion.utils.p) {
                pVar = (androidx.constraintlayout.core.motion.utils.p) rVar3;
            } else {
                pVar = new androidx.constraintlayout.core.motion.utils.p();
                this.f44429c = pVar;
            }
            pVar.h(f10, this.f44444r, f14, this.f44440n, this.f44441o, this.f44442p, this.f44443q, this.f44445s);
        }

        float b(float f10, float f11, float f12) {
            float fAbs = (((Math.abs(f11) * 0.5f) * f11) / this.f44438l) + f10;
            switch (this.f44439m) {
                case 1:
                    return f10 >= 1.0f ? 1.0f : 0.0f;
                case 2:
                    return f10 <= 0.0f ? 0.0f : 1.0f;
                case 3:
                    return Float.NaN;
                case 4:
                    return Math.max(0.0f, Math.min(1.0f, fAbs));
                case 5:
                    if (fAbs <= 0.2f || fAbs >= 0.8f) {
                        return fAbs > 0.5f ? 1.0f : 0.0f;
                    }
                    return fAbs;
                case 6:
                    return 1.0f;
                default:
                    if (fAbs > 0.5d) {
                        return 1.0f;
                    }
                case 7:
                    return 0.0f;
            }
        }

        float[] c() {
            return f44420d0[this.f44433g];
        }

        float d() {
            return this.f44434h;
        }

        float[] e() {
            return C[this.f44428b];
        }

        public float f(long j10) {
            return this.f44429c.d() ? this.f44444r : this.f44429c.getInterpolation((j10 - this.f44446t) * 1.0E-9f);
        }

        public boolean g(float f10) {
            if (this.f44439m == 3) {
                return false;
            }
            androidx.constraintlayout.core.motion.utils.r rVar = this.f44429c;
            return (rVar == null || rVar.d()) ? false : true;
        }

        public void h() {
            if (this.f44436j == 0) {
                System.out.println("velocity = " + this.f44429c.a());
                System.out.println("mMaxAcceleration = " + this.f44438l);
                System.out.println("mMaxVelocity = " + this.f44437k);
                return;
            }
            System.out.println("mSpringMass          = " + this.f44440n);
            System.out.println("mSpringStiffness     = " + this.f44441o);
            System.out.println("mSpringDamping       = " + this.f44442p);
            System.out.println("mSpringStopThreshold = " + this.f44443q);
            System.out.println("mSpringBoundary      = " + this.f44445s);
        }

        void i(String str) {
            this.f44427a = str;
        }

        void j(int i10) {
            this.f44428b = i10;
        }

        void k(int i10) {
            this.f44436j = i10;
        }

        void l(int i10) {
            this.f44433g = i10;
            this.f44432f = i10 < 2;
        }

        void m(float f10) {
            if (Float.isNaN(f10)) {
                return;
            }
            this.f44434h = f10;
        }

        void n(float f10) {
            if (Float.isNaN(f10)) {
                return;
            }
            this.f44435i = f10;
        }

        void o(String str) {
            this.f44431e = str;
        }

        void p(float f10) {
            if (Float.isNaN(f10)) {
                return;
            }
            this.f44438l = f10;
        }

        void q(float f10) {
            if (Float.isNaN(f10)) {
                return;
            }
            this.f44437k = f10;
        }

        void r(int i10) {
            this.f44439m = i10;
        }

        void s(String str) {
            this.f44430d = str;
        }

        void t(int i10) {
            this.f44445s = i10;
        }

        void u(float f10) {
            if (Float.isNaN(f10)) {
                return;
            }
            this.f44442p = f10;
        }

        void v(float f10) {
            if (Float.isNaN(f10)) {
                return;
            }
            this.f44440n = f10;
        }

        void w(float f10) {
            if (Float.isNaN(f10)) {
                return;
            }
            this.f44441o = f10;
        }

        void x(float f10) {
            if (Float.isNaN(f10)) {
                return;
            }
            this.f44443q = f10;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        androidx.constraintlayout.core.motion.c f44450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f44451e = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        androidx.constraintlayout.core.motion.utils.g f44455i = new androidx.constraintlayout.core.motion.utils.g();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f44456j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f44457k = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        v f44447a = new v();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        v f44448b = new v();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        v f44449c = new v();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.constraintlayout.core.motion.f f44452f = new androidx.constraintlayout.core.motion.f(this.f44447a);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.constraintlayout.core.motion.f f44453g = new androidx.constraintlayout.core.motion.f(this.f44448b);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        androidx.constraintlayout.core.motion.f f44454h = new androidx.constraintlayout.core.motion.f(this.f44449c);

        public c() {
            androidx.constraintlayout.core.motion.c cVar = new androidx.constraintlayout.core.motion.c(this.f44452f);
            this.f44450d = cVar;
            cVar.d0(this.f44452f);
            this.f44450d.Y(this.f44453g);
        }

        public v a(int i10) {
            if (i10 == 0) {
                return this.f44447a;
            }
            return i10 == 1 ? this.f44448b : this.f44449c;
        }

        String b() {
            return this.f44450d.p();
        }

        public void c(int i10, int i11, float f10, t tVar) {
            this.f44456j = i11;
            this.f44457k = i10;
            if (this.f44451e) {
                this.f44450d.h0(i10, i11, 1.0f, System.nanoTime());
                this.f44451e = false;
            }
            v.p(i10, i11, this.f44449c, this.f44447a, this.f44448b, tVar, f10);
            this.f44449c.f44475q = f10;
            this.f44450d.R(this.f44454h, f10, System.nanoTime(), this.f44455i);
        }

        public void d(androidx.constraintlayout.core.motion.utils.u uVar) {
            androidx.constraintlayout.core.motion.key.c cVar = new androidx.constraintlayout.core.motion.key.c();
            uVar.g(cVar);
            this.f44450d.f(cVar);
        }

        public void e(androidx.constraintlayout.core.motion.utils.u uVar, androidx.constraintlayout.core.motion.b[] bVarArr) {
            androidx.constraintlayout.core.motion.key.c cVar = new androidx.constraintlayout.core.motion.key.c();
            uVar.g(cVar);
            if (bVarArr != null) {
                for (int i10 = 0; i10 < bVarArr.length; i10++) {
                    cVar.f43664l.put(bVarArr[i10].k(), bVarArr[i10]);
                }
            }
            this.f44450d.f(cVar);
        }

        public void f(androidx.constraintlayout.core.motion.utils.u uVar) {
            androidx.constraintlayout.core.motion.key.d dVar = new androidx.constraintlayout.core.motion.key.d();
            uVar.g(dVar);
            this.f44450d.f(dVar);
        }

        public void g(androidx.constraintlayout.core.motion.utils.u uVar) {
            androidx.constraintlayout.core.motion.key.e eVar = new androidx.constraintlayout.core.motion.key.e();
            uVar.g(eVar);
            this.f44450d.f(eVar);
        }

        public void h(c cVar) {
            this.f44450d.j0(cVar.f44450d);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void i(androidx.constraintlayout.core.widgets.e eVar, int i10) {
            if (i10 == 0) {
                this.f44447a.F(eVar);
                androidx.constraintlayout.core.motion.f fVar = this.f44452f;
                fVar.c0(fVar);
                this.f44450d.d0(this.f44452f);
                this.f44451e = true;
            } else if (i10 == 1) {
                this.f44448b.F(eVar);
                this.f44450d.Y(this.f44453g);
                this.f44451e = true;
            }
            this.f44457k = -1;
        }
    }

    public t(@NonNull d dVar) {
        this.f44404r = dVar;
    }

    public static g L(int i10, final String str) {
        switch (i10) {
            case -1:
                return new g() { // from class: androidx.constraintlayout.core.state.l
                    @Override // androidx.constraintlayout.core.state.g
                    public final float getInterpolation(float f10) {
                        return t.i(str, f10);
                    }
                };
            case 0:
                return new g() { // from class: androidx.constraintlayout.core.state.m
                    @Override // androidx.constraintlayout.core.state.g
                    public final float getInterpolation(float f10) {
                        return t.f(f10);
                    }
                };
            case 1:
                return new g() { // from class: androidx.constraintlayout.core.state.n
                    @Override // androidx.constraintlayout.core.state.g
                    public final float getInterpolation(float f10) {
                        return t.m(f10);
                    }
                };
            case 2:
                return new g() { // from class: androidx.constraintlayout.core.state.o
                    @Override // androidx.constraintlayout.core.state.g
                    public final float getInterpolation(float f10) {
                        return t.k(f10);
                    }
                };
            case 3:
                return new g() { // from class: androidx.constraintlayout.core.state.p
                    @Override // androidx.constraintlayout.core.state.g
                    public final float getInterpolation(float f10) {
                        return t.j(f10);
                    }
                };
            case 4:
                return new g() { // from class: androidx.constraintlayout.core.state.s
                    @Override // androidx.constraintlayout.core.state.g
                    public final float getInterpolation(float f10) {
                        return t.g(f10);
                    }
                };
            case 5:
                return new g() { // from class: androidx.constraintlayout.core.state.r
                    @Override // androidx.constraintlayout.core.state.g
                    public final float getInterpolation(float f10) {
                        return t.l(f10);
                    }
                };
            case 6:
                return new g() { // from class: androidx.constraintlayout.core.state.q
                    @Override // androidx.constraintlayout.core.state.g
                    public final float getInterpolation(float f10) {
                        return t.h(f10);
                    }
                };
            default:
                return null;
        }
    }

    private c T(String str) {
        return this.f44395i.get(str);
    }

    public static /* synthetic */ float f(float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("standard").a(f10);
    }

    public static /* synthetic */ float g(float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").a(f10);
    }

    public static /* synthetic */ float h(float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("anticipate").a(f10);
    }

    public static /* synthetic */ float i(String str, float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c(str).a(f10);
    }

    public static /* synthetic */ float j(float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("linear").a(f10);
    }

    public static /* synthetic */ float k(float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("decelerate").a(f10);
    }

    public static /* synthetic */ float l(float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("overshoot").a(f10);
    }

    public static /* synthetic */ float m(float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("accelerate").a(f10);
    }

    private void v(float f10) {
        int i10 = this.f44405s;
        this.f44409w = (int) (i10 + 0.5f + ((this.f44407u - i10) * f10));
        int i11 = this.f44406t;
        this.f44410x = (int) (i11 + 0.5f + ((this.f44408v - i11) * f10));
    }

    public void A(v vVar, float[] fArr, float[] fArr2, float[] fArr3) {
        a aVar;
        int i10 = 0;
        for (int i11 = 0; i11 <= 100; i11++) {
            HashMap<String, a> map = this.f44394h.get(Integer.valueOf(i11));
            if (map != null && (aVar = map.get(vVar.f44459a.f44730o)) != null) {
                fArr[i10] = aVar.f44415d;
                fArr2[i10] = aVar.f44416e;
                fArr3[i10] = aVar.f44412a;
                i10++;
            }
        }
    }

    public a B(String str, int i10) {
        a aVar;
        while (i10 <= 100) {
            HashMap<String, a> map = this.f44394h.get(Integer.valueOf(i10));
            if (map != null && (aVar = map.get(str)) != null) {
                return aVar;
            }
            i10++;
        }
        return null;
    }

    public a C(String str, int i10) {
        a aVar;
        while (i10 >= 0) {
            HashMap<String, a> map = this.f44394h.get(Integer.valueOf(i10));
            if (map != null && (aVar = map.get(str)) != null) {
                return aVar;
            }
            i10--;
        }
        return null;
    }

    public int D() {
        return this.f44400n;
    }

    public v E(androidx.constraintlayout.core.widgets.e eVar) {
        return U(eVar.f44730o, null, 1).f44448b;
    }

    public v F(String str) {
        c cVar = this.f44395i.get(str);
        if (cVar == null) {
            return null;
        }
        return cVar.f44448b;
    }

    public v G(androidx.constraintlayout.core.widgets.e eVar) {
        return U(eVar.f44730o, null, 2).f44449c;
    }

    public v H(String str) {
        c cVar = this.f44395i.get(str);
        if (cVar != null) {
            return cVar.f44449c;
        }
        int i10 = 2 ^ 0;
        return null;
    }

    public int I() {
        return this.f44410x;
    }

    public int J() {
        return this.f44409w;
    }

    public g K() {
        return L(this.f44397k, this.f44398l);
    }

    public int M(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.f44395i.get(str).f44450d.j(fArr, iArr, iArr2);
    }

    public androidx.constraintlayout.core.motion.c N(String str) {
        return U(str, null, 0).f44450d;
    }

    public int O(v vVar) {
        int i10 = 0;
        for (int i11 = 0; i11 <= 100; i11++) {
            HashMap<String, a> map = this.f44394h.get(Integer.valueOf(i11));
            if (map != null && map.get(vVar.f44459a.f44730o) != null) {
                i10++;
            }
        }
        return i10;
    }

    public float[] P(String str) {
        c cVar = this.f44395i.get(str);
        float[] fArr = new float[124];
        cVar.f44450d.k(fArr, 62);
        return fArr;
    }

    public v Q(androidx.constraintlayout.core.widgets.e eVar) {
        return U(eVar.f44730o, null, 0).f44447a;
    }

    public v R(String str) {
        c cVar = this.f44395i.get(str);
        if (cVar == null) {
            return null;
        }
        return cVar.f44447a;
    }

    public float S(long j10) {
        b bVar = this.f44403q;
        if (bVar != null) {
            return bVar.f(j10);
        }
        return 0.0f;
    }

    public c U(String str, androidx.constraintlayout.core.widgets.e eVar, int i10) {
        c cVar = this.f44395i.get(str);
        if (cVar == null) {
            cVar = new c();
            this.f44396j.g(cVar.f44450d);
            cVar.f44452f.c0(cVar.f44450d);
            this.f44395i.put(str, cVar);
            if (eVar != null) {
                cVar.i(eVar, i10);
            }
        }
        return cVar;
    }

    public boolean V() {
        return this.f44403q != null;
    }

    public boolean W() {
        return this.f44394h.size() > 0;
    }

    public void X(int i10, int i11, float f10) {
        if (this.f44411y) {
            v(f10);
        }
        androidx.constraintlayout.core.motion.utils.d dVar = this.f44399m;
        if (dVar != null) {
            f10 = (float) dVar.a(f10);
        }
        Iterator<String> it = this.f44395i.keySet().iterator();
        while (it.hasNext()) {
            this.f44395i.get(it.next()).c(i10, i11, f10, this);
        }
    }

    public boolean Y() {
        return this.f44395i.isEmpty();
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean Z(float f10, float f11) {
        b bVar = this.f44403q;
        if (bVar == null) {
            return false;
        }
        String str = bVar.f44431e;
        if (str == null) {
            return true;
        }
        c cVar = this.f44395i.get(str);
        if (cVar == null) {
            System.err.println("mLimitBoundsTo target is null");
            return false;
        }
        v vVarA = cVar.a(2);
        return f10 >= ((float) vVarA.f44460b) && f10 < ((float) vVarA.f44462d) && f11 >= ((float) vVarA.f44461c) && f11 < ((float) vVarA.f44463e);
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        return 0;
    }

    public boolean a0(float f10) {
        return this.f44403q.g(f10);
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i10, int i11) {
        return false;
    }

    void b0() {
        this.f44403q = null;
        this.f44396j.h();
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i10, float f10) {
        if (i10 == 706) {
            this.f44402p = f10;
        }
        return false;
    }

    public void c0(float f10, long j10, float f11, float f12) {
        b bVar = this.f44403q;
        if (bVar != null) {
            c cVar = this.f44395i.get(bVar.f44427a);
            float[] fArr = new float[2];
            float[] fArrC = this.f44403q.c();
            float[] fArrE = this.f44403q.e();
            cVar.f44450d.u(f10, fArrE[0], fArrE[1], fArr);
            if (Math.abs((fArrC[0] * fArr[0]) + (fArrC[1] * fArr[1])) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[1] = 0.01f;
            }
            this.f44403q.a(f10, (fArrC[0] != 0.0f ? f11 / fArr[0] : f12 / fArr[1]) * this.f44403q.d(), j10, this.f44401o * 0.001f);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i10, boolean z10) {
        return false;
    }

    public void d0(androidx.constraintlayout.core.motion.utils.u uVar) {
        uVar.f(this.f44396j);
        uVar.g(this);
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i10, String str) {
        if (i10 != 705) {
            return false;
        }
        this.f44398l = str;
        this.f44399m = androidx.constraintlayout.core.motion.utils.d.c(str);
        return false;
    }

    public void e0(androidx.constraintlayout.core.widgets.f fVar, int i10) {
        androidx.constraintlayout.core.widgets.e.b[] bVarArr = fVar.f44705b0;
        androidx.constraintlayout.core.widgets.e.b bVar = bVarArr[0];
        androidx.constraintlayout.core.widgets.e.b bVar2 = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
        boolean z10 = bVar == bVar2;
        this.f44411y = z10;
        this.f44411y = z10 | (bVarArr[1] == bVar2);
        if (i10 == 0) {
            int iM0 = fVar.m0();
            this.f44405s = iM0;
            this.f44409w = iM0;
            int iD = fVar.D();
            this.f44406t = iD;
            this.f44410x = iD;
        } else {
            this.f44407u = fVar.m0();
            this.f44408v = fVar.D();
        }
        ArrayList<androidx.constraintlayout.core.widgets.e> arrayListM2 = fVar.m2();
        int size = arrayListM2.size();
        c[] cVarArr = new c[size];
        for (int i11 = 0; i11 < size; i11++) {
            androidx.constraintlayout.core.widgets.e eVar = arrayListM2.get(i11);
            c cVarU = U(eVar.f44730o, null, i10);
            cVarArr[i11] = cVarU;
            cVarU.i(eVar, i10);
            String strB = cVarU.b();
            if (strB != null) {
                cVarU.h(U(strB, null, i10));
            }
        }
        u();
    }

    public void n(int i10, String str, String str2, int i11) {
        U(str, null, i10).a(i10).c(str2, i11);
    }

    public void o(int i10, String str, String str2, float f10) {
        U(str, null, i10).a(i10).d(str2, f10);
    }

    public void p(String str, androidx.constraintlayout.core.motion.utils.u uVar) {
        U(str, null, 0).d(uVar);
    }

    public void q(String str, androidx.constraintlayout.core.motion.utils.u uVar, androidx.constraintlayout.core.motion.b[] bVarArr) {
        U(str, null, 0).e(uVar, bVarArr);
    }

    public void r(String str, androidx.constraintlayout.core.motion.utils.u uVar) {
        U(str, null, 0).f(uVar);
    }

    public void s(String str, int i10, int i11, float f10, float f11) {
        androidx.constraintlayout.core.motion.utils.u uVar = new androidx.constraintlayout.core.motion.utils.u();
        uVar.b(androidx.constraintlayout.core.motion.utils.v.g.f44098r, 2);
        uVar.b(100, i10);
        uVar.a(506, f10);
        uVar.a(androidx.constraintlayout.core.motion.utils.v.g.f44095o, f11);
        U(str, null, 0).g(uVar);
        a aVar = new a(str, i10, i11, f10, f11);
        HashMap<String, a> map = this.f44394h.get(Integer.valueOf(i10));
        if (map == null) {
            map = new HashMap<>();
            this.f44394h.put(Integer.valueOf(i10), map);
        }
        map.put(str, aVar);
    }

    public void t(String str, androidx.constraintlayout.core.motion.utils.u uVar) {
        U(str, null, 0).g(uVar);
    }

    public void u() {
        float fMin;
        float fMax;
        float f10 = this.f44402p;
        if (f10 == 0.0f) {
            return;
        }
        boolean z10 = ((double) f10) < 0.0d;
        float fAbs = Math.abs(f10);
        Iterator<String> it = this.f44395i.keySet().iterator();
        do {
            fMin = Float.MAX_VALUE;
            fMax = -3.4028235E38f;
            if (!it.hasNext()) {
                Iterator<String> it2 = this.f44395i.keySet().iterator();
                while (it2.hasNext()) {
                    androidx.constraintlayout.core.motion.c cVar = this.f44395i.get(it2.next()).f44450d;
                    float fY = cVar.y() + cVar.z();
                    fMin = Math.min(fMin, fY);
                    fMax = Math.max(fMax, fY);
                }
                Iterator<String> it3 = this.f44395i.keySet().iterator();
                while (it3.hasNext()) {
                    androidx.constraintlayout.core.motion.c cVar2 = this.f44395i.get(it3.next()).f44450d;
                    float fY2 = cVar2.y() + cVar2.z();
                    float f11 = fMax - fMin;
                    float f12 = fAbs - (((fY2 - fMin) * fAbs) / f11);
                    if (z10) {
                        f12 = fAbs - (((fMax - fY2) / f11) * fAbs);
                    }
                    cVar2.c0(1.0f / (1.0f - fAbs));
                    cVar2.b0(f12);
                }
                return;
            }
        } while (Float.isNaN(this.f44395i.get(it.next()).f44450d.F()));
        Iterator<String> it4 = this.f44395i.keySet().iterator();
        while (it4.hasNext()) {
            float F2 = this.f44395i.get(it4.next()).f44450d.F();
            if (!Float.isNaN(F2)) {
                fMin = Math.min(fMin, F2);
                fMax = Math.max(fMax, F2);
            }
        }
        Iterator<String> it5 = this.f44395i.keySet().iterator();
        while (it5.hasNext()) {
            androidx.constraintlayout.core.motion.c cVar3 = this.f44395i.get(it5.next()).f44450d;
            float F3 = cVar3.F();
            if (!Float.isNaN(F3)) {
                float f13 = 1.0f / (1.0f - fAbs);
                float f14 = fMax - fMin;
                float f15 = fAbs - (((F3 - fMin) * fAbs) / f14);
                if (z10) {
                    f15 = fAbs - (((fMax - F3) / f14) * fAbs);
                }
                cVar3.c0(f13);
                cVar3.b0(f15);
            }
        }
    }

    public void w() {
        this.f44395i.clear();
    }

    public boolean x(String str) {
        return this.f44395i.containsKey(str);
    }

    b y() {
        b bVar = new b();
        this.f44403q = bVar;
        return bVar;
    }

    public float z(float f10, int i10, int i11, float f11, float f12) {
        float fAbs;
        float fD;
        Iterator<c> it = this.f44395i.values().iterator();
        c next = it.hasNext() ? it.next() : null;
        b bVar = this.f44403q;
        if (bVar == null || next == null) {
            if (next != null) {
                return (-f12) / next.f44456j;
            }
            return 1.0f;
        }
        String str = bVar.f44427a;
        if (str == null) {
            float[] fArrC = bVar.c();
            int i12 = next.f44456j;
            float f13 = i12;
            float f14 = i12;
            float f15 = fArrC[0];
            fAbs = f15 != 0.0f ? (f11 * Math.abs(f15)) / f13 : (f12 * Math.abs(fArrC[1])) / f14;
            fD = this.f44403q.d();
        } else {
            c cVar = this.f44395i.get(str);
            float[] fArrC2 = this.f44403q.c();
            float[] fArrE = this.f44403q.e();
            float[] fArr = new float[2];
            cVar.c(i10, i11, f10, this);
            cVar.f44450d.u(f10, fArrE[0], fArrE[1], fArr);
            float f16 = fArrC2[0];
            fAbs = f16 != 0.0f ? (f11 * Math.abs(f16)) / fArr[0] : (f12 * Math.abs(fArrC2[1])) / fArr[1];
            fD = this.f44403q.d();
        }
        return fAbs * fD;
    }
}
