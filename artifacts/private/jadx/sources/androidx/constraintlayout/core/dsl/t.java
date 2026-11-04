package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f43336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f43337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f43338g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f43332a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f43333b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43334c = 400;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f43335d = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f43339h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f43340i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f43341j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f43342k = 400;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f43343l = 0.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private m f43344m = new m();

    public t(String str, String str2) {
        int i10 = 1 & (-1);
        this.f43336e = null;
        this.f43337f = null;
        this.f43338g = null;
        this.f43336e = "default";
        this.f43338g = str;
        this.f43337f = str2;
    }

    public String a() {
        return this.f43336e;
    }

    public void b(int i10) {
        this.f43342k = i10;
    }

    public void c(String str) {
        this.f43338g = str;
    }

    public void d(String str) {
        this.f43336e = str;
    }

    public void e(p pVar) {
        this.f43344m.a(pVar);
    }

    public void f(r rVar) {
        this.f43332a = rVar;
    }

    public void g(float f10) {
        this.f43343l = f10;
    }

    public void h(String str) {
        this.f43337f = str;
    }

    String i() {
        return toString();
    }

    public String toString() {
        String str = this.f43336e + ":{\nfrom:'" + this.f43338g + "',\nto:'" + this.f43337f + "',\n";
        if (this.f43342k != 400) {
            str = str + "duration:" + this.f43342k + ",\n";
        }
        if (this.f43343l != 0.0f) {
            str = str + "stagger:" + this.f43343l + ",\n";
        }
        if (this.f43332a != null) {
            str = str + this.f43332a.toString();
        }
        return (str + this.f43344m.toString()) + "},\n";
    }

    public t(String str, String str2, String str3) {
        this.f43336e = null;
        this.f43337f = null;
        this.f43338g = null;
        this.f43336e = str;
        this.f43338g = str2;
        this.f43337f = str3;
    }
}
