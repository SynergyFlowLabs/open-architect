package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.v;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class e extends b {
    static final String L = "KeyPosition";
    protected static final float M = 20.0f;
    public static final int N = 2;
    public static final int O = 1;
    public static final int P = 0;
    static final int Q = 2;
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    private float J;
    private float K;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f43674y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f43675z;

    public e() {
        int i10 = b.f43648m;
        this.f43674y = i10;
        this.f43675z = null;
        this.A = i10;
        this.B = 0;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = 0;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.f43663k = 2;
    }

    private void v(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float f16 = Float.isNaN(this.E) ? 0.0f : this.E;
        float f17 = Float.isNaN(this.H) ? 0.0f : this.H;
        float f18 = Float.isNaN(this.F) ? 0.0f : this.F;
        this.J = (int) (f10 + (f16 * f14) + ((Float.isNaN(this.G) ? 0.0f : this.G) * f15));
        this.K = (int) (f11 + (f14 * f17) + (f15 * f18));
    }

    private void w(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float f16 = this.E;
        float f17 = this.F;
        this.J = f10 + (f14 * f16) + ((-f15) * f17);
        this.K = f11 + (f15 * f16) + (f14 * f17);
    }

    private void y(int i10, int i11) {
        float f10 = this.E;
        float f11 = 0;
        this.J = (i10 * f10) + f11;
        this.K = (i11 * f10) + f11;
    }

    float A() {
        return this.K;
    }

    public boolean B(int i10, int i11, androidx.constraintlayout.core.motion.utils.e eVar, androidx.constraintlayout.core.motion.utils.e eVar2, float f10, float f11) {
        x(i10, i11, eVar.a(), eVar.b(), eVar2.a(), eVar2.b());
        return Math.abs(f10 - this.J) < 20.0f && Math.abs(f11 - this.K) < 20.0f;
    }

    public void C(androidx.constraintlayout.core.motion.f fVar, androidx.constraintlayout.core.motion.utils.e eVar, androidx.constraintlayout.core.motion.utils.e eVar2, float f10, float f11, String[] strArr, float[] fArr) {
        int i10 = this.I;
        if (i10 == 1) {
            E(eVar, eVar2, f10, f11, strArr, fArr);
            return;
        }
        int i11 = 1 >> 2;
        if (i10 != 2) {
            D(eVar, eVar2, f10, f11, strArr, fArr);
        } else {
            F(fVar, eVar, eVar2, f10, f11, strArr, fArr);
        }
    }

    void D(androidx.constraintlayout.core.motion.utils.e eVar, androidx.constraintlayout.core.motion.utils.e eVar2, float f10, float f11, String[] strArr, float[] fArr) {
        float fA = eVar.a();
        float fB = eVar.b();
        float fA2 = eVar2.a() - fA;
        float fB2 = eVar2.b() - fB;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f10 - fA) / fA2;
            strArr[1] = "percentY";
            fArr[1] = (f11 - fB) / fB2;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = (f10 - fA) / fA2;
            fArr[1] = (f11 - fB) / fB2;
        } else {
            fArr[1] = (f10 - fA) / fA2;
            fArr[0] = (f11 - fB) / fB2;
        }
    }

    void E(androidx.constraintlayout.core.motion.utils.e eVar, androidx.constraintlayout.core.motion.utils.e eVar2, float f10, float f11, String[] strArr, float[] fArr) {
        float fA = eVar.a();
        float fB = eVar.b();
        float fA2 = eVar2.a() - fA;
        float fB2 = eVar2.b() - fB;
        float fHypot = (float) Math.hypot(fA2, fB2);
        int i10 = 0 >> 1;
        if (fHypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            int i11 = 7 << 0;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f12 = fA2 / fHypot;
        float f13 = fB2 / fHypot;
        float f14 = f11 - fB;
        float f15 = f10 - fA;
        float f16 = ((f12 * f14) - (f15 * f13)) / fHypot;
        float f17 = ((f12 * f15) + (f13 * f14)) / fHypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f17;
                fArr[1] = f16;
            }
        } else {
            strArr[0] = "percentX";
            strArr[1] = "percentY";
            fArr[0] = f17;
            fArr[1] = f16;
        }
    }

    void F(androidx.constraintlayout.core.motion.f fVar, androidx.constraintlayout.core.motion.utils.e eVar, androidx.constraintlayout.core.motion.utils.e eVar2, float f10, float f11, String[] strArr, float[] fArr) {
        eVar.a();
        eVar.b();
        eVar2.a();
        eVar2.b();
        androidx.constraintlayout.core.motion.f fVarN = fVar.n();
        int iD = fVarN.D();
        int iK = fVarN.k();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = f10 / iD;
            strArr[1] = "percentY";
            fArr[1] = f11 / iK;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = f10 / iD;
            fArr[1] = f11 / iK;
        } else {
            fArr[1] = f10 / iD;
            fArr[0] = f11 / iK;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        return v.g.a(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i10, int i11) {
        if (i10 == 100) {
            this.f43660h = i11;
        } else if (i10 == 508) {
            this.f43674y = i11;
        } else {
            if (i10 != 510) {
                return super.b(i10, i11);
            }
            this.I = i11;
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i10, float f10) {
        switch (i10) {
            case 503:
                this.C = f10;
                break;
            case 504:
                this.D = f10;
                break;
            case 505:
                this.C = f10;
                this.D = f10;
                break;
            case 506:
                this.E = f10;
                break;
            case v.g.f44095o /* 507 */:
                this.F = f10;
                break;
            default:
                return super.c(i10, f10);
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i10, String str) {
        if (i10 != 501) {
            return super.e(i10, str);
        }
        this.f43675z = str.toString();
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, o> map) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* JADX INFO: renamed from: g */
    public b clone() {
        return new e().h(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public b h(b bVar) {
        super.h(bVar);
        e eVar = (e) bVar;
        this.f43675z = eVar.f43675z;
        this.A = eVar.A;
        this.B = eVar.B;
        this.C = eVar.C;
        this.D = Float.NaN;
        this.E = eVar.E;
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
        this.J = eVar.J;
        this.K = eVar.K;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
    }

    void x(int i10, int i11, float f10, float f11, float f12, float f13) {
        int i12 = this.I;
        if (i12 == 1) {
            w(f10, f11, f12, f13);
        } else if (i12 != 2) {
            v(f10, f11, f12, f13);
        } else {
            y(i10, i11);
        }
    }

    float z() {
        return this.J;
    }
}
