package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: classes2.dex */
public class i extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f43179d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f43176a = androidx.constraintlayout.core.motion.utils.v.a.f43958a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f43180e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f43181f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f43182g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f43183h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f43184i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f43185j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f43186k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f43187l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f43188m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f43189n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f43190o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f43191p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f43192q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f43193r = Float.NaN;

    public enum a {
        SPLINE,
        LINEAR
    }

    public enum b {
        VISIBLE,
        INVISIBLE,
        GONE
    }

    public i(int i10, String str) {
        int i11 = 3 >> 0;
        this.f43177b = str;
        this.f43178c = i10;
    }

    public void A(float f10) {
        this.f43187l = f10;
    }

    public void B(float f10) {
        this.f43183h = f10;
    }

    public void C(float f10) {
        this.f43184i = f10;
    }

    public void D(float f10) {
        this.f43185j = f10;
    }

    public void E(float f10) {
        this.f43189n = f10;
    }

    public void F(float f10) {
        this.f43190o = f10;
    }

    public void G(String str) {
        this.f43177b = str;
    }

    public void H(String str) {
        this.f43179d = str;
    }

    public void I(float f10) {
        this.f43188m = f10;
    }

    public void J(float f10) {
        this.f43191p = f10;
    }

    public void K(float f10) {
        this.f43192q = f10;
    }

    public void L(float f10) {
        this.f43193r = f10;
    }

    public void M(b bVar) {
        this.f43181f = bVar;
    }

    protected void g(StringBuilder sb2) {
        c(sb2, androidx.constraintlayout.core.motion.utils.v.a.M, this.f43177b);
        sb2.append("frame:");
        sb2.append(this.f43178c);
        sb2.append(",\n");
        c(sb2, "easing", this.f43179d);
        if (this.f43180e != null) {
            sb2.append("fit:'");
            sb2.append(this.f43180e);
            sb2.append("',\n");
        }
        if (this.f43181f != null) {
            sb2.append("visibility:'");
            sb2.append(this.f43181f);
            sb2.append("',\n");
        }
        a(sb2, "alpha", this.f43182g);
        a(sb2, "rotationX", this.f43184i);
        a(sb2, "rotationY", this.f43185j);
        a(sb2, "rotationZ", this.f43183h);
        a(sb2, "pivotX", this.f43186k);
        a(sb2, "pivotY", this.f43187l);
        a(sb2, "pathRotate", this.f43188m);
        a(sb2, "scaleX", this.f43189n);
        a(sb2, "scaleY", this.f43190o);
        a(sb2, "translationX", this.f43191p);
        a(sb2, "translationY", this.f43192q);
        a(sb2, "translationZ", this.f43193r);
    }

    public float h() {
        return this.f43182g;
    }

    public a i() {
        return this.f43180e;
    }

    public float j() {
        return this.f43186k;
    }

    public float k() {
        return this.f43187l;
    }

    public float l() {
        return this.f43183h;
    }

    public float m() {
        return this.f43184i;
    }

    public float n() {
        return this.f43185j;
    }

    public float o() {
        return this.f43189n;
    }

    public float p() {
        return this.f43190o;
    }

    public String q() {
        return this.f43177b;
    }

    public String r() {
        return this.f43179d;
    }

    public float s() {
        return this.f43188m;
    }

    public float t() {
        return this.f43191p;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43176a);
        sb2.append(":{\n");
        g(sb2);
        sb2.append("},\n");
        return sb2.toString();
    }

    public float u() {
        return this.f43192q;
    }

    public float v() {
        return this.f43193r;
    }

    public b w() {
        return this.f43181f;
    }

    public void x(float f10) {
        this.f43182g = f10;
    }

    public void y(a aVar) {
        this.f43180e = aVar;
    }

    public void z(float f10) {
        this.f43186k = f10;
    }
}
