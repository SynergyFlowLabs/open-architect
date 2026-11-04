package androidx.constraintlayout.core.dsl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    public static final c J = new c("parent");
    static int K = Integer.MIN_VALUE;
    static Map<EnumC0355c, String> L;
    private int A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    private String[] G;
    private boolean H;
    private boolean I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f43093b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f43094c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f43095d = new d(e.LEFT);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f43096e = new d(e.RIGHT);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f43097f = new g(h.TOP);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g f43098g = new g(h.BOTTOM);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f43099h = new d(e.START);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f43100i = new d(e.END);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f43101j = new g(h.BASELINE);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f43102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f43103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f43104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f43105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f43106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f43107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f43108q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f43109r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f43110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f43111t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f43112u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f43113v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private EnumC0355c f43114w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private EnumC0355c f43115x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private b f43116y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private b f43117z;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f f43118a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f43120c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f43119b = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f43121d = Integer.MIN_VALUE;

        a(f fVar) {
            this.f43118a = fVar;
        }

        public void a(StringBuilder sb2) {
            if (this.f43119b != null) {
                sb2.append(this.f43118a.toString().toLowerCase());
                sb2.append(":");
                sb2.append(this);
                sb2.append(",\n");
            }
        }

        public String b() {
            return c.this.f43092a;
        }

        c c() {
            return c.this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            if (this.f43119b != null) {
                sb2.append("'");
                sb2.append(this.f43119b.b());
                sb2.append("',");
                sb2.append("'");
                sb2.append(this.f43119b.f43118a.toString().toLowerCase());
                sb2.append("'");
            }
            if (this.f43120c != 0) {
                sb2.append(",");
                sb2.append(this.f43120c);
            }
            if (this.f43121d != Integer.MIN_VALUE) {
                if (this.f43120c == 0) {
                    sb2.append(",0,");
                    sb2.append(this.f43121d);
                } else {
                    sb2.append(",");
                    sb2.append(this.f43121d);
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    public enum b {
        SPREAD,
        WRAP,
        PERCENT,
        RATIO,
        RESOLVED;

        static {
            int i10 = 3 >> 4;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.dsl.c$c, reason: collision with other inner class name */
    public enum EnumC0355c {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public class d extends a {
        d(e eVar) {
            super(f.valueOf(eVar.name()));
        }
    }

    public enum e {
        LEFT,
        RIGHT,
        START,
        END;

        static {
            int i10 = 2 ^ 2;
        }
    }

    public enum f {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        START,
        END,
        BASELINE;

        static {
            int i10 = 5 << 3;
        }
    }

    public class g extends a {
        g(h hVar) {
            super(f.valueOf(hVar.name()));
        }
    }

    public enum h {
        TOP,
        BOTTOM,
        BASELINE
    }

    static {
        HashMap map = new HashMap();
        L = map;
        map.put(EnumC0355c.SPREAD, "spread");
        L.put(EnumC0355c.SPREAD_INSIDE, "spread_inside");
        L.put(EnumC0355c.PACKED, "packed");
    }

    public c(String str) {
        int i10 = K;
        this.f43102k = i10;
        this.f43103l = i10;
        this.f43104m = Float.NaN;
        this.f43105n = Float.NaN;
        this.f43106o = null;
        this.f43107p = null;
        this.f43108q = Integer.MIN_VALUE;
        this.f43109r = Float.NaN;
        this.f43110s = Integer.MIN_VALUE;
        this.f43111t = Integer.MIN_VALUE;
        this.f43112u = Float.NaN;
        this.f43113v = Float.NaN;
        this.f43114w = null;
        this.f43115x = null;
        this.f43116y = null;
        this.f43117z = null;
        this.A = i10;
        this.B = i10;
        this.C = i10;
        this.D = i10;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = null;
        this.H = false;
        this.I = false;
        this.f43092a = str;
    }

    public EnumC0355c A() {
        return this.f43115x;
    }

    public void A0(int i10) {
        this.A = i10;
    }

    public float B() {
        return this.f43112u;
    }

    public void B0(int i10) {
        this.C = i10;
    }

    public int C() {
        return this.f43102k;
    }

    public void C0(float f10) {
        this.E = f10;
    }

    public b D() {
        return this.f43116y;
    }

    public int E() {
        return this.A;
    }

    public int F() {
        return this.C;
    }

    public float G() {
        return this.E;
    }

    public boolean H() {
        return this.I;
    }

    public boolean I() {
        return this.H;
    }

    public void J(g gVar) {
        K(gVar, 0);
    }

    public void K(g gVar, int i10) {
        L(gVar, i10, Integer.MIN_VALUE);
    }

    public void L(g gVar, int i10, int i11) {
        g gVar2 = this.f43101j;
        gVar2.f43119b = gVar;
        gVar2.f43120c = i10;
        gVar2.f43121d = i11;
    }

    public void M(g gVar) {
        N(gVar, 0);
    }

    public void N(g gVar, int i10) {
        O(gVar, i10, Integer.MIN_VALUE);
    }

    public void O(g gVar, int i10, int i11) {
        g gVar2 = this.f43098g;
        gVar2.f43119b = gVar;
        gVar2.f43120c = i10;
        gVar2.f43121d = i11;
    }

    public void P(d dVar) {
        Q(dVar, 0);
    }

    public void Q(d dVar, int i10) {
        R(dVar, i10, Integer.MIN_VALUE);
    }

    public void R(d dVar, int i10, int i11) {
        d dVar2 = this.f43100i;
        dVar2.f43119b = dVar;
        dVar2.f43120c = i10;
        dVar2.f43121d = i11;
    }

    public void S(d dVar) {
        T(dVar, 0);
    }

    public void T(d dVar, int i10) {
        U(dVar, i10, Integer.MIN_VALUE);
    }

    public void U(d dVar, int i10, int i11) {
        d dVar2 = this.f43095d;
        dVar2.f43119b = dVar;
        dVar2.f43120c = i10;
        dVar2.f43121d = i11;
    }

    public void V(d dVar) {
        W(dVar, 0);
    }

    public void W(d dVar, int i10) {
        X(dVar, i10, Integer.MIN_VALUE);
    }

    public void X(d dVar, int i10, int i11) {
        d dVar2 = this.f43096e;
        dVar2.f43119b = dVar;
        dVar2.f43120c = i10;
        dVar2.f43121d = i11;
    }

    public void Y(d dVar) {
        Z(dVar, 0);
    }

    public void Z(d dVar, int i10) {
        a0(dVar, i10, Integer.MIN_VALUE);
    }

    public void a0(d dVar, int i10, int i11) {
        d dVar2 = this.f43099h;
        dVar2.f43119b = dVar;
        dVar2.f43120c = i10;
        dVar2.f43121d = i11;
    }

    protected void b(StringBuilder sb2, String str, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        sb2.append(str);
        sb2.append(":");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public void b0(g gVar) {
        c0(gVar, 0);
    }

    public String c(String[] strArr) {
        StringBuilder sb2 = new StringBuilder("[");
        int i10 = 0;
        while (i10 < strArr.length) {
            sb2.append(i10 == 0 ? "'" : ",'");
            sb2.append(strArr[i10]);
            sb2.append("'");
            i10++;
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void c0(g gVar, int i10) {
        d0(gVar, i10, Integer.MIN_VALUE);
    }

    public g d() {
        return this.f43101j;
    }

    public void d0(g gVar, int i10, int i11) {
        g gVar2 = this.f43097f;
        gVar2.f43119b = gVar;
        gVar2.f43120c = i10;
        gVar2.f43121d = i11;
    }

    public g e() {
        return this.f43098g;
    }

    public void e0(float f10) {
        this.f43109r = f10;
    }

    public float f() {
        return this.f43109r;
    }

    public void f0(String str) {
        this.f43107p = str;
    }

    public String g() {
        return this.f43107p;
    }

    public void g0(int i10) {
        this.f43108q = i10;
    }

    public int h() {
        return this.f43108q;
    }

    public void h0(boolean z10) {
        this.I = z10;
    }

    public String i() {
        return this.f43106o;
    }

    public void i0(boolean z10) {
        this.H = z10;
    }

    public int j() {
        return this.f43110s;
    }

    public void j0(String str) {
        this.f43106o = str;
    }

    public int k() {
        return this.f43111t;
    }

    public void k0(int i10) {
        this.f43110s = i10;
    }

    public d l() {
        return this.f43100i;
    }

    public void l0(int i10) {
        this.f43111t = i10;
    }

    public int m() {
        return this.f43103l;
    }

    public void m0(int i10) {
        this.f43103l = i10;
    }

    public b n() {
        return this.f43117z;
    }

    public void n0(b bVar) {
        this.f43117z = bVar;
    }

    public int o() {
        return this.B;
    }

    public void o0(int i10) {
        this.B = i10;
    }

    public int p() {
        return this.D;
    }

    public void p0(int i10) {
        this.D = i10;
    }

    public float q() {
        return this.F;
    }

    public void q0(float f10) {
        this.F = f10;
    }

    public float r() {
        return this.f43104m;
    }

    public void r0(float f10) {
        this.f43104m = f10;
    }

    public EnumC0355c s() {
        return this.f43114w;
    }

    public void s0(EnumC0355c enumC0355c) {
        this.f43114w = enumC0355c;
    }

    public float t() {
        return this.f43113v;
    }

    public void t0(float f10) {
        this.f43113v = f10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f43092a + ":{\n");
        this.f43095d.a(sb2);
        this.f43096e.a(sb2);
        this.f43097f.a(sb2);
        this.f43098g.a(sb2);
        this.f43099h.a(sb2);
        this.f43100i.a(sb2);
        this.f43101j.a(sb2);
        if (this.f43102k != K) {
            sb2.append("width:");
            sb2.append(this.f43102k);
            sb2.append(",\n");
        }
        if (this.f43103l != K) {
            sb2.append("height:");
            sb2.append(this.f43103l);
            sb2.append(",\n");
        }
        b(sb2, "horizontalBias", this.f43104m);
        b(sb2, "verticalBias", this.f43105n);
        if (this.f43106o != null) {
            sb2.append("dimensionRatio:'");
            sb2.append(this.f43106o);
            sb2.append("',\n");
        }
        if (this.f43107p != null && (!Float.isNaN(this.f43109r) || this.f43108q != Integer.MIN_VALUE)) {
            sb2.append("circular:['");
            sb2.append(this.f43107p);
            sb2.append("'");
            if (!Float.isNaN(this.f43109r)) {
                sb2.append(",");
                sb2.append(this.f43109r);
            }
            if (this.f43108q != Integer.MIN_VALUE) {
                if (Float.isNaN(this.f43109r)) {
                    sb2.append(",0,");
                    sb2.append(this.f43108q);
                } else {
                    sb2.append(",");
                    sb2.append(this.f43108q);
                }
            }
            sb2.append("],\n");
        }
        b(sb2, "verticalWeight", this.f43112u);
        b(sb2, "horizontalWeight", this.f43113v);
        if (this.f43114w != null) {
            sb2.append("horizontalChainStyle:'");
            sb2.append(L.get(this.f43114w));
            sb2.append("',\n");
        }
        if (this.f43115x != null) {
            sb2.append("verticalChainStyle:'");
            sb2.append(L.get(this.f43115x));
            sb2.append("',\n");
        }
        if (this.f43116y != null) {
            int i10 = this.A;
            int i11 = K;
            if (i10 == i11 && this.C == i11) {
                sb2.append("width:'");
                sb2.append(this.f43116y.toString().toLowerCase());
                sb2.append("',\n");
            } else {
                sb2.append("width:{value:'");
                sb2.append(this.f43116y.toString().toLowerCase());
                sb2.append("'");
                if (this.A != K) {
                    sb2.append(",max:");
                    sb2.append(this.A);
                }
                if (this.C != K) {
                    sb2.append(",min:");
                    sb2.append(this.C);
                }
                sb2.append("},\n");
            }
        }
        if (this.f43117z != null) {
            int i12 = this.B;
            int i13 = K;
            if (i12 == i13 && this.D == i13) {
                sb2.append("height:'");
                sb2.append(this.f43117z.toString().toLowerCase());
                sb2.append("',\n");
            } else {
                sb2.append("height:{value:'");
                sb2.append(this.f43117z.toString().toLowerCase());
                sb2.append("'");
                if (this.B != K) {
                    sb2.append(",max:");
                    sb2.append(this.B);
                }
                if (this.D != K) {
                    sb2.append(",min:");
                    sb2.append(this.D);
                }
                sb2.append("},\n");
            }
        }
        if (!Double.isNaN(this.E)) {
            sb2.append("width:'");
            sb2.append((int) this.E);
            sb2.append("%',\n");
        }
        if (!Double.isNaN(this.F)) {
            sb2.append("height:'");
            sb2.append((int) this.F);
            sb2.append("%',\n");
        }
        if (this.G != null) {
            sb2.append("referenceIds:");
            sb2.append(c(this.G));
            sb2.append(",\n");
        }
        if (this.H) {
            sb2.append("constrainedWidth:");
            sb2.append(this.H);
            sb2.append(",\n");
        }
        if (this.I) {
            sb2.append("constrainedHeight:");
            sb2.append(this.I);
            sb2.append(",\n");
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public d u() {
        return this.f43095d;
    }

    public void u0(String[] strArr) {
        this.G = strArr;
    }

    public String[] v() {
        return this.G;
    }

    public void v0(float f10) {
        this.f43105n = f10;
    }

    public d w() {
        return this.f43096e;
    }

    public void w0(EnumC0355c enumC0355c) {
        this.f43115x = enumC0355c;
    }

    public d x() {
        return this.f43099h;
    }

    public void x0(float f10) {
        this.f43112u = f10;
    }

    public g y() {
        return this.f43097f;
    }

    public void y0(int i10) {
        this.f43102k = i10;
    }

    public float z() {
        return this.f43105n;
    }

    public void z0(b bVar) {
        this.f43116y = bVar;
    }
}
