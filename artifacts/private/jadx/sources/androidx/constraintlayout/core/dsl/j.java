package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class j extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f43202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43203c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f43205e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f43201a = androidx.constraintlayout.core.motion.utils.v.a.f43958a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f43204d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b[] f43206f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f43207g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f43208h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f43209i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f43210j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f43211k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f43212l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float[] f43213m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float[] f43214n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float[] f43215o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float[] f43216p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float[] f43217q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float[] f43218r = null;

    public enum a {
        SPLINE,
        LINEAR;

        static {
            int i10 = 7 << 1;
        }
    }

    public enum b {
        VISIBLE,
        INVISIBLE,
        GONE
    }

    j(int i10, String... strArr) {
        this.f43205e = null;
        this.f43202b = strArr;
        int[] iArr = new int[i10];
        this.f43205e = iArr;
        float length = 100.0f / (iArr.length + 1);
        int i11 = 0;
        int i12 = 2 >> 0;
        while (true) {
            int[] iArr2 = this.f43205e;
            if (i11 >= iArr2.length) {
                return;
            }
            iArr2[i11] = (int) ((i11 * length) + length);
            i11++;
        }
    }

    public void A(float... fArr) {
        this.f43212l = fArr;
    }

    public void B(float... fArr) {
        this.f43208h = fArr;
    }

    public void C(float... fArr) {
        this.f43209i = fArr;
    }

    public void D(float... fArr) {
        this.f43210j = fArr;
    }

    public void E(float[] fArr) {
        this.f43214n = fArr;
    }

    public void F(float[] fArr) {
        this.f43215o = fArr;
    }

    public void G(String[] strArr) {
        this.f43202b = strArr;
    }

    public void H(String str) {
        this.f43203c = str;
    }

    public void I(float... fArr) {
        this.f43213m = fArr;
    }

    public void J(float[] fArr) {
        this.f43216p = fArr;
    }

    public void K(float[] fArr) {
        this.f43217q = fArr;
    }

    public void L(float[] fArr) {
        this.f43218r = fArr;
    }

    public void M(b... bVarArr) {
        this.f43206f = bVarArr;
    }

    protected void g(StringBuilder sb2) {
        e(sb2, androidx.constraintlayout.core.motion.utils.v.a.M, this.f43202b);
        sb2.append("frame:");
        sb2.append(Arrays.toString(this.f43205e));
        sb2.append(",\n");
        c(sb2, "easing", this.f43203c);
        if (this.f43204d != null) {
            sb2.append("fit:'");
            sb2.append(this.f43204d);
            sb2.append("',\n");
        }
        if (this.f43206f != null) {
            sb2.append("visibility:'");
            sb2.append(Arrays.toString(this.f43206f));
            sb2.append("',\n");
        }
        d(sb2, "alpha", this.f43207g);
        d(sb2, "rotationX", this.f43209i);
        d(sb2, "rotationY", this.f43210j);
        d(sb2, "rotationZ", this.f43208h);
        d(sb2, "pivotX", this.f43211k);
        d(sb2, "pivotY", this.f43212l);
        d(sb2, "pathRotate", this.f43213m);
        d(sb2, "scaleX", this.f43214n);
        d(sb2, "scaleY", this.f43215o);
        d(sb2, "translationX", this.f43216p);
        d(sb2, "translationY", this.f43217q);
        d(sb2, "translationZ", this.f43218r);
    }

    public float[] h() {
        return this.f43207g;
    }

    public a i() {
        return this.f43204d;
    }

    public float[] j() {
        return this.f43211k;
    }

    public float[] k() {
        return this.f43212l;
    }

    public float[] l() {
        return this.f43208h;
    }

    public float[] m() {
        return this.f43209i;
    }

    public float[] n() {
        return this.f43210j;
    }

    public float[] o() {
        return this.f43214n;
    }

    public float[] p() {
        return this.f43215o;
    }

    public String[] q() {
        return this.f43202b;
    }

    public String r() {
        return this.f43203c;
    }

    public float[] s() {
        return this.f43213m;
    }

    public float[] t() {
        return this.f43216p;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43201a);
        sb2.append(":{\n");
        g(sb2);
        sb2.append("},\n");
        return sb2.toString();
    }

    public float[] u() {
        return this.f43217q;
    }

    public float[] v() {
        return this.f43218r;
    }

    public b[] w() {
        return this.f43206f;
    }

    public void x(float... fArr) {
        this.f43207g = fArr;
    }

    public void y(a aVar) {
        this.f43204d = aVar;
    }

    public void z(float... fArr) {
        this.f43211k = fArr;
    }
}
