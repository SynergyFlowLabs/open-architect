package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f43276q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f43277r = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f43278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f43279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f43281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f43282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f43283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f43284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f43285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f43286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f43287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f43288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f43289l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f43290m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f43291n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f43292o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private c f43293p;

    public enum a {
        OVERSHOOT,
        BOUNCE_START,
        BOUNCE_END,
        BOUNCE_BOTH;

        static {
            int i10 = 4 >> 1;
        }
    }

    public enum b {
        UP,
        DOWN,
        LEFT,
        RIGHT,
        START,
        END,
        CLOCKWISE,
        ANTICLOCKWISE
    }

    public enum c {
        VELOCITY,
        SPRING
    }

    public enum d {
        TOP,
        LEFT,
        RIGHT,
        BOTTOM,
        MIDDLE,
        START,
        END
    }

    public enum e {
        AUTOCOMPLETE,
        TO_START,
        NEVER_COMPLETE_END,
        TO_END,
        STOP,
        DECELERATE,
        DECELERATE_COMPLETE,
        NEVER_COMPLETE_START
    }

    public r() {
        this.f43278a = null;
        this.f43279b = null;
        this.f43280c = null;
        this.f43281d = null;
        this.f43282e = null;
        this.f43283f = null;
        this.f43284g = Float.NaN;
        this.f43285h = Float.NaN;
        this.f43286i = Float.NaN;
        this.f43287j = Float.NaN;
        this.f43288k = Float.NaN;
        this.f43289l = Float.NaN;
        this.f43290m = Float.NaN;
        this.f43291n = Float.NaN;
        this.f43292o = null;
        this.f43293p = null;
    }

    public r A(float f10) {
        this.f43288k = f10;
        return this;
    }

    public r B(float f10) {
        this.f43289l = f10;
        return this;
    }

    public r C(float f10) {
        this.f43290m = f10;
        return this;
    }

    public r D(float f10) {
        this.f43291n = f10;
        return this;
    }

    public r E(String str) {
        this.f43280c = str;
        return this;
    }

    public r F(d dVar) {
        this.f43279b = dVar;
        return this;
    }

    public c a() {
        return this.f43293p;
    }

    public b b() {
        return this.f43278a;
    }

    public float c() {
        return this.f43286i;
    }

    public float d() {
        return this.f43287j;
    }

    public String e() {
        return this.f43281d;
    }

    public float f() {
        return this.f43285h;
    }

    public float g() {
        return this.f43284g;
    }

    public e h() {
        return this.f43282e;
    }

    public String i() {
        return this.f43283f;
    }

    public a j() {
        return this.f43292o;
    }

    public float k() {
        return this.f43288k;
    }

    public float l() {
        return this.f43289l;
    }

    public float m() {
        return this.f43290m;
    }

    public float n() {
        return this.f43291n;
    }

    public String o() {
        return this.f43280c;
    }

    public d p() {
        return this.f43279b;
    }

    public void q(c cVar) {
        this.f43293p = cVar;
    }

    public r r(b bVar) {
        this.f43278a = bVar;
        return this;
    }

    public r s(int i10) {
        this.f43286i = i10;
        return this;
    }

    public r t(int i10) {
        this.f43287j = i10;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("OnSwipe:{\n");
        if (this.f43280c != null) {
            sb2.append("anchor:'");
            sb2.append(this.f43280c);
            sb2.append("',\n");
        }
        if (this.f43278a != null) {
            sb2.append("direction:'");
            sb2.append(this.f43278a.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (this.f43279b != null) {
            sb2.append("side:'");
            sb2.append(this.f43279b.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f43286i)) {
            sb2.append("scale:'");
            sb2.append(this.f43286i);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f43287j)) {
            sb2.append("threshold:'");
            sb2.append(this.f43287j);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f43284g)) {
            sb2.append("maxVelocity:'");
            sb2.append(this.f43284g);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f43285h)) {
            sb2.append("maxAccel:'");
            sb2.append(this.f43285h);
            sb2.append("',\n");
        }
        if (this.f43281d != null) {
            sb2.append("limitBounds:'");
            sb2.append(this.f43281d);
            sb2.append("',\n");
        }
        if (this.f43293p != null) {
            sb2.append("mode:'");
            sb2.append(this.f43293p.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (this.f43282e != null) {
            sb2.append("touchUp:'");
            sb2.append(this.f43282e.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f43289l)) {
            sb2.append("springMass:'");
            sb2.append(this.f43289l);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f43290m)) {
            sb2.append("springStiffness:'");
            sb2.append(this.f43290m);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f43288k)) {
            sb2.append("springDamping:'");
            sb2.append(this.f43288k);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f43291n)) {
            sb2.append("stopThreshold:'");
            sb2.append(this.f43291n);
            sb2.append("',\n");
        }
        if (this.f43292o != null) {
            sb2.append("springBoundary:'");
            sb2.append(this.f43292o);
            sb2.append("',\n");
        }
        if (this.f43283f != null) {
            sb2.append("around:'");
            sb2.append(this.f43283f);
            sb2.append("',\n");
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public r u(String str) {
        this.f43281d = str;
        return this;
    }

    public r v(int i10) {
        this.f43285h = i10;
        return this;
    }

    public r w(int i10) {
        this.f43284g = i10;
        return this;
    }

    public r x(e eVar) {
        this.f43282e = eVar;
        return this;
    }

    public r y(String str) {
        this.f43283f = str;
        return this;
    }

    public r z(a aVar) {
        this.f43292o = aVar;
        return this;
    }

    public r(String str, d dVar, b bVar) {
        this.f43281d = null;
        this.f43282e = null;
        this.f43283f = null;
        this.f43284g = Float.NaN;
        this.f43285h = Float.NaN;
        this.f43286i = Float.NaN;
        this.f43287j = Float.NaN;
        this.f43288k = Float.NaN;
        this.f43289l = Float.NaN;
        this.f43290m = Float.NaN;
        this.f43291n = Float.NaN;
        this.f43292o = null;
        this.f43293p = null;
        this.f43280c = str;
        this.f43279b = dVar;
        this.f43278a = bVar;
    }
}
