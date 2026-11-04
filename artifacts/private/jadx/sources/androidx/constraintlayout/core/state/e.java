package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f44259i = new String("FIXED_DIMENSION");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f44260j = new String("WRAP_DIMENSION");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f44261k = new String("SPREAD_DIMENSION");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f44262l = new String("PARENT_DIMENSION");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f44263m = new String("PERCENT_DIMENSION");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f44264n = new String("RATIO_DIMENSION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f44265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f44266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f44267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f44268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f44269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f44270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f44271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f44272h;

    public enum a {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT;

        static {
            int i10 = 4 << 1;
        }
    }

    private e() {
        this.f44265a = -2;
        this.f44266b = 0;
        this.f44267c = Integer.MAX_VALUE;
        this.f44268d = 1.0f;
        this.f44269e = 0;
        this.f44270f = null;
        this.f44271g = f44260j;
        this.f44272h = false;
    }

    @Deprecated
    public static e a(int i10) {
        return k(i10);
    }

    @Deprecated
    public static e b(Object obj) {
        e eVar = new e(f44259i);
        eVar.v(obj);
        return eVar;
    }

    @Deprecated
    public static e c() {
        return m();
    }

    @Deprecated
    public static e d(Object obj, float f10) {
        return n(obj, f10);
    }

    @Deprecated
    public static e e(String str) {
        return o(str);
    }

    @Deprecated
    public static e f() {
        return p();
    }

    @Deprecated
    public static e g(int i10) {
        return q(i10);
    }

    @Deprecated
    public static e h(Object obj) {
        return r(obj);
    }

    @Deprecated
    public static e i() {
        return s();
    }

    public static e k(int i10) {
        e eVar = new e(f44259i);
        eVar.u(i10);
        return eVar;
    }

    public static e l(Object obj) {
        e eVar = new e(f44259i);
        eVar.v(obj);
        return eVar;
    }

    public static e m() {
        return new e(f44262l);
    }

    public static e n(Object obj, float f10) {
        e eVar = new e(f44263m);
        eVar.B(obj, f10);
        return eVar;
    }

    public static e o(String str) {
        e eVar = new e(f44264n);
        eVar.C(str);
        return eVar;
    }

    public static e p() {
        return new e(f44261k);
    }

    public static e q(int i10) {
        e eVar = new e();
        eVar.E(i10);
        return eVar;
    }

    public static e r(Object obj) {
        e eVar = new e();
        eVar.F(obj);
        return eVar;
    }

    public static e s() {
        return new e(f44260j);
    }

    public e A(Object obj) {
        if (obj == f44260j) {
            this.f44266b = -2;
        }
        return this;
    }

    public e B(Object obj, float f10) {
        this.f44268d = f10;
        return this;
    }

    public e C(String str) {
        this.f44270f = str;
        return this;
    }

    void D(int i10) {
        this.f44272h = false;
        this.f44271g = null;
        this.f44269e = i10;
    }

    public e E(int i10) {
        this.f44272h = true;
        if (i10 >= 0) {
            this.f44267c = i10;
        }
        return this;
    }

    public e F(Object obj) {
        this.f44271g = obj;
        this.f44272h = true;
        return this;
    }

    public void j(k kVar, androidx.constraintlayout.core.widgets.e eVar, int i10) {
        String str = this.f44270f;
        if (str != null) {
            eVar.o1(str);
        }
        int i11 = 2;
        if (i10 == 0) {
            if (this.f44272h) {
                eVar.E1(androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT);
                Object obj = this.f44271g;
                if (obj == f44260j) {
                    i11 = 1;
                } else if (obj != f44263m) {
                    i11 = 0;
                }
                eVar.F1(i11, this.f44266b, this.f44267c, this.f44268d);
                return;
            }
            int i12 = this.f44266b;
            if (i12 > 0) {
                eVar.Q1(i12);
            }
            int i13 = this.f44267c;
            if (i13 < Integer.MAX_VALUE) {
                eVar.N1(i13);
            }
            Object obj2 = this.f44271g;
            if (obj2 == f44260j) {
                eVar.E1(androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT);
            } else if (obj2 == f44262l) {
                eVar.E1(androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT);
            } else if (obj2 == null) {
                eVar.E1(androidx.constraintlayout.core.widgets.e.b.FIXED);
                eVar.d2(this.f44269e);
            }
        } else {
            if (this.f44272h) {
                eVar.Z1(androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT);
                Object obj3 = this.f44271g;
                if (obj3 == f44260j) {
                    i11 = 1;
                } else if (obj3 != f44263m) {
                    i11 = 0;
                }
                eVar.a2(i11, this.f44266b, this.f44267c, this.f44268d);
                return;
            }
            int i14 = this.f44266b;
            if (i14 > 0) {
                eVar.P1(i14);
            }
            int i15 = this.f44267c;
            if (i15 < Integer.MAX_VALUE) {
                eVar.M1(i15);
            }
            Object obj4 = this.f44271g;
            if (obj4 == f44260j) {
                eVar.Z1(androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT);
            } else if (obj4 == f44262l) {
                eVar.Z1(androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT);
            } else if (obj4 == null) {
                eVar.Z1(androidx.constraintlayout.core.widgets.e.b.FIXED);
                eVar.z1(this.f44269e);
            }
        }
    }

    public boolean t(int i10) {
        return this.f44271g == null && this.f44269e == i10;
    }

    public e u(int i10) {
        this.f44271g = null;
        this.f44269e = i10;
        return this;
    }

    public e v(Object obj) {
        this.f44271g = obj;
        if (obj instanceof Integer) {
            this.f44269e = ((Integer) obj).intValue();
            this.f44271g = null;
        }
        return this;
    }

    int w() {
        return this.f44269e;
    }

    public e x(int i10) {
        if (this.f44267c >= 0) {
            this.f44267c = i10;
        }
        return this;
    }

    public e y(Object obj) {
        Object obj2 = f44260j;
        if (obj == obj2 && this.f44272h) {
            this.f44271g = obj2;
            this.f44267c = Integer.MAX_VALUE;
        }
        return this;
    }

    public e z(int i10) {
        if (i10 >= 0) {
            this.f44266b = i10;
        }
        return this;
    }

    private e(Object obj) {
        this.f44265a = -2;
        this.f44266b = 0;
        this.f44267c = Integer.MAX_VALUE;
        this.f44268d = 1.0f;
        this.f44269e = 0;
        this.f44270f = null;
        this.f44272h = false;
        this.f44271g = obj;
    }
}
