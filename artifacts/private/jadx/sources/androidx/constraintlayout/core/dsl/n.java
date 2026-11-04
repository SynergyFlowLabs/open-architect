package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: classes2.dex */
public class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43250a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43252c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43251b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f43253d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f43254e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f43255f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f43256g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f43257h = a.CARTESIAN;

    public enum a {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public n(String str, int i10) {
        int i11 = 0 >> 0;
        this.f43250a = null;
        this.f43252c = 0;
        this.f43250a = str;
        this.f43252c = i10;
    }

    public int g() {
        return this.f43252c;
    }

    public float h() {
        return this.f43254e;
    }

    public float i() {
        return this.f43253d;
    }

    public float j() {
        return this.f43255f;
    }

    public float k() {
        return this.f43256g;
    }

    public a l() {
        return this.f43257h;
    }

    public String m() {
        return this.f43250a;
    }

    public String n() {
        return this.f43251b;
    }

    public void o(int i10) {
        this.f43252c = i10;
    }

    public void p(float f10) {
        this.f43254e = f10;
    }

    public void q(float f10) {
        this.f43253d = f10;
    }

    public void r(float f10) {
        this.f43255f = f10;
    }

    public void s(float f10) {
        this.f43256g = f10;
    }

    public void t(a aVar) {
        this.f43257h = aVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPositions:{\n");
        c(sb2, androidx.constraintlayout.core.motion.utils.v.a.M, this.f43250a);
        sb2.append("frame:");
        sb2.append(this.f43252c);
        sb2.append(",\n");
        if (this.f43257h != null) {
            sb2.append("type:'");
            sb2.append(this.f43257h);
            sb2.append("',\n");
        }
        c(sb2, "easing", this.f43251b);
        a(sb2, "percentX", this.f43255f);
        a(sb2, "percentY", this.f43256g);
        a(sb2, "percentWidth", this.f43253d);
        a(sb2, "percentHeight", this.f43254e);
        sb2.append("},\n");
        return sb2.toString();
    }

    public void u(String str) {
        this.f43250a = str;
    }

    public void v(String str) {
        this.f43251b = str;
    }
}
