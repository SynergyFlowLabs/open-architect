package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f43262a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f43265d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43263b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f43264c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f43266e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f43267f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f43268g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f43269h = null;

    public enum a {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public o(int i10, String... strArr) {
        this.f43265d = null;
        this.f43262a = strArr;
        int[] iArr = new int[i10];
        this.f43265d = iArr;
        float length = 100.0f / (iArr.length + 1);
        int i11 = 0;
        while (true) {
            int[] iArr2 = this.f43265d;
            if (i11 >= iArr2.length) {
                return;
            }
            iArr2[i11] = (int) ((i11 * length) + length);
            i11++;
        }
    }

    public int[] g() {
        return this.f43265d;
    }

    public float[] h() {
        return this.f43267f;
    }

    public float[] i() {
        return this.f43266e;
    }

    public float[] j() {
        return this.f43268g;
    }

    public float[] k() {
        return this.f43269h;
    }

    public a l() {
        return this.f43264c;
    }

    public String[] m() {
        return this.f43262a;
    }

    public String n() {
        return this.f43263b;
    }

    public void o(int... iArr) {
        this.f43265d = iArr;
    }

    public void p(float... fArr) {
        this.f43267f = fArr;
    }

    public void q(float... fArr) {
        this.f43266e = fArr;
    }

    public void r(float... fArr) {
        this.f43268g = fArr;
    }

    public void s(float... fArr) {
        this.f43269h = fArr;
    }

    public void t(a aVar) {
        this.f43264c = aVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPositions:{\n");
        e(sb2, androidx.constraintlayout.core.motion.utils.v.a.M, this.f43262a);
        sb2.append("frame:");
        sb2.append(Arrays.toString(this.f43265d));
        sb2.append(",\n");
        if (this.f43264c != null) {
            sb2.append("type:'");
            sb2.append(this.f43264c);
            sb2.append("',\n");
        }
        c(sb2, "easing", this.f43263b);
        d(sb2, "percentX", this.f43268g);
        d(sb2, "percentX", this.f43269h);
        d(sb2, "percentWidth", this.f43266e);
        d(sb2, "percentHeight", this.f43267f);
        sb2.append("},\n");
        return sb2.toString();
    }

    public void u(String str) {
        this.f43263b = str;
    }
}
