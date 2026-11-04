package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: classes2.dex */
public class l extends j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a f43238s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float[] f43239t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float[] f43240u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float[] f43241v;

    public enum a {
        SIN,
        SQUARE,
        TRIANGLE,
        SAW,
        REVERSE_SAW,
        COS;

        static {
            int i10 = 4 | 4;
        }
    }

    l(int i10, String... strArr) {
        super(i10, strArr);
        this.f43238s = null;
        this.f43239t = null;
        this.f43240u = null;
        this.f43241v = null;
        this.f43201a = androidx.constraintlayout.core.motion.utils.v.c.f44000a;
    }

    public float[] N() {
        return this.f43240u;
    }

    public float[] O() {
        return this.f43239t;
    }

    public float[] P() {
        return this.f43241v;
    }

    public a Q() {
        return this.f43238s;
    }

    public void R(float... fArr) {
        this.f43240u = fArr;
    }

    public void S(float... fArr) {
        this.f43239t = fArr;
    }

    public void T(float... fArr) {
        this.f43241v = fArr;
    }

    public void U(a aVar) {
        this.f43238s = aVar;
    }

    @Override // androidx.constraintlayout.core.dsl.j
    protected void g(StringBuilder sb2) {
        super.g(sb2);
        if (this.f43238s != null) {
            sb2.append("shape:'");
            sb2.append(this.f43238s);
            sb2.append("',\n");
        }
        d(sb2, androidx.constraintlayout.core.motion.utils.v.c.Q, this.f43239t);
        d(sb2, androidx.constraintlayout.core.motion.utils.v.c.R, this.f43240u);
        d(sb2, androidx.constraintlayout.core.motion.utils.v.c.S, this.f43241v);
    }
}
