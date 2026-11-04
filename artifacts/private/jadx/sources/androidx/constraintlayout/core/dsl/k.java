package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: classes2.dex */
public class k extends i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f43226w = "KeyCycle";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a f43227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f43228t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f43229u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f43230v;

    public enum a {
        SIN,
        SQUARE,
        TRIANGLE,
        SAW,
        REVERSE_SAW,
        COS
    }

    k(int i10, String str) {
        super(i10, str);
        this.f43227s = null;
        this.f43228t = Float.NaN;
        this.f43229u = Float.NaN;
        this.f43230v = Float.NaN;
        this.f43176a = "KeyCycle";
    }

    public float N() {
        return this.f43229u;
    }

    public float O() {
        return this.f43228t;
    }

    public float P() {
        return this.f43230v;
    }

    public a Q() {
        return this.f43227s;
    }

    public void R(float f10) {
        this.f43229u = f10;
    }

    public void S(float f10) {
        this.f43228t = f10;
    }

    public void T(float f10) {
        this.f43230v = f10;
    }

    public void U(a aVar) {
        this.f43227s = aVar;
    }

    @Override // androidx.constraintlayout.core.dsl.i
    protected void g(StringBuilder sb2) {
        super.g(sb2);
        if (this.f43227s != null) {
            sb2.append("shape:'");
            sb2.append(this.f43227s);
            sb2.append("',\n");
        }
        a(sb2, androidx.constraintlayout.core.motion.utils.v.c.Q, this.f43228t);
        a(sb2, androidx.constraintlayout.core.motion.utils.v.c.R, this.f43229u);
        a(sb2, androidx.constraintlayout.core.motion.utils.v.c.S, this.f43230v);
    }
}
