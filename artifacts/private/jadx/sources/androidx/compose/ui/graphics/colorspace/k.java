package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.d1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    @NotNull
    private static final j0 A;

    @NotNull
    private static final c B;

    @NotNull
    private static final c[] C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f37611a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final float[] f37612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final float[] f37613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final float[] f37614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final k0 f37615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final k0 f37616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final k0 f37617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final k0 f37618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final j0 f37619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final j0 f37620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final j0 f37621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final j0 f37622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final j0 f37623m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final j0 f37624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final j0 f37625o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final j0 f37626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final j0 f37627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final j0 f37628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final j0 f37629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final j0 f37630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final j0 f37631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final j0 f37632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final c f37633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private static final c f37634x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private static final j0 f37635y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private static final j0 f37636z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f37612b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f37613c = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        f37614d = fArr3;
        k0 k0Var = new k0(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f37615e = k0Var;
        k0 k0Var2 = new k0(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f37616f = k0Var2;
        k0 k0Var3 = new k0(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f37617g = k0Var3;
        k0 k0Var4 = new k0(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f37618h = k0Var4;
        o oVar = o.f37659a;
        j0 j0Var = new j0("sRGB IEC61966-2.1", fArr, oVar.h(), k0Var, 0);
        f37619i = j0Var;
        j0 j0Var2 = new j0("sRGB IEC61966-2.1 (Linear)", fArr, oVar.h(), 1.0d, 0.0f, 1.0f, 1);
        f37620j = j0Var2;
        j0 j0Var3 = new j0("scRGB-nl IEC 61966-2-2:2003", fArr, oVar.h(), null, new n() { // from class: androidx.compose.ui.graphics.colorspace.e
            @Override // androidx.compose.ui.graphics.colorspace.n
            public final double a(double d10) {
                return k.k(d10);
            }
        }, new n() { // from class: androidx.compose.ui.graphics.colorspace.f
            @Override // androidx.compose.ui.graphics.colorspace.n
            public final double a(double d10) {
                return k.l(d10);
            }
        }, -0.799f, 2.399f, k0Var, 2);
        f37621k = j0Var3;
        j0 j0Var4 = new j0("scRGB IEC 61966-2-2:2003", fArr, oVar.h(), 1.0d, -0.5f, 7.499f, 3);
        f37622l = j0Var4;
        j0 j0Var5 = new j0("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, oVar.h(), new k0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f37623m = j0Var5;
        j0 j0Var6 = new j0("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, oVar.h(), new k0(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f37624n = j0Var6;
        j0 j0Var7 = new j0("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new m0(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f37625o = j0Var7;
        j0 j0Var8 = new j0("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, oVar.h(), k0Var, 7);
        f37626p = j0Var8;
        j0 j0Var9 = new j0("NTSC (1953)", fArr2, oVar.c(), new k0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f37627q = j0Var9;
        j0 j0Var10 = new j0("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, oVar.h(), new k0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f37628r = j0Var10;
        j0 j0Var11 = new j0("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, oVar.h(), 2.2d, 0.0f, 1.0f, 10);
        f37629s = j0Var11;
        j0 j0Var12 = new j0("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, oVar.d(), new k0(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f37630t = j0Var12;
        j0 j0Var13 = new j0("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, oVar.g(), 1.0d, -65504.0f, 65504.0f, 12);
        f37631u = j0Var13;
        j0 j0Var14 = new j0("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, oVar.g(), 1.0d, -65504.0f, 65504.0f, 13);
        f37632v = j0Var14;
        n0 n0Var = new n0("Generic XYZ", 14);
        f37633w = n0Var;
        p pVar = new p("Generic L*a*b*", 15);
        f37634x = pVar;
        j0 j0Var15 = new j0("None", fArr, oVar.h(), k0Var2, 16);
        f37635y = j0Var15;
        j0 j0Var16 = new j0("Hybrid Log Gamma encoding", fArr3, oVar.h(), null, new n() { // from class: androidx.compose.ui.graphics.colorspace.g
            @Override // androidx.compose.ui.graphics.colorspace.n
            public final double a(double d10) {
                return k.g(d10);
            }
        }, new n() { // from class: androidx.compose.ui.graphics.colorspace.h
            @Override // androidx.compose.ui.graphics.colorspace.n
            public final double a(double d10) {
                return k.h(d10);
            }
        }, 0.0f, 1.0f, k0Var3, 17);
        f37636z = j0Var16;
        j0 j0Var17 = new j0("Perceptual Quantizer encoding", fArr3, oVar.h(), null, new n() { // from class: androidx.compose.ui.graphics.colorspace.i
            @Override // androidx.compose.ui.graphics.colorspace.n
            public final double a(double d10) {
                return k.i(d10);
            }
        }, new n() { // from class: androidx.compose.ui.graphics.colorspace.j
            @Override // androidx.compose.ui.graphics.colorspace.n
            public final double a(double d10) {
                return k.j(d10);
            }
        }, 0.0f, 1.0f, k0Var4, 18);
        A = j0Var17;
        q qVar = new q("Oklab", 19);
        B = qVar;
        C = new c[]{j0Var, j0Var2, j0Var3, j0Var4, j0Var5, j0Var6, j0Var7, j0Var8, j0Var9, j0Var10, j0Var11, j0Var12, j0Var13, j0Var14, n0Var, pVar, j0Var15, j0Var16, j0Var17, qVar};
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(double d10) {
        return f37611a.Q(f37617g, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double h(double d10) {
        return f37611a.P(f37617g, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(double d10) {
        return f37611a.S(f37618h, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(double d10) {
        return f37611a.R(f37618h, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double k(double d10) {
        return d.a(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double l(double d10) {
        return d.b(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    @NotNull
    public final j0 A() {
        return f37625o;
    }

    @NotNull
    public final j0 B() {
        return f37626p;
    }

    @NotNull
    public final j0 C() {
        return f37621k;
    }

    @NotNull
    public final j0 D() {
        return f37622l;
    }

    @NotNull
    public final j0 E() {
        return f37620j;
    }

    @NotNull
    public final j0 F() {
        return f37627q;
    }

    @NotNull
    public final float[] G() {
        return f37613c;
    }

    @NotNull
    public final c H() {
        return B;
    }

    @NotNull
    public final j0 I() {
        return f37630t;
    }

    @NotNull
    public final j0 J() {
        return f37628r;
    }

    @NotNull
    public final j0 K() {
        return f37619i;
    }

    @NotNull
    public final float[] L() {
        return f37612b;
    }

    @NotNull
    public final k0 M() {
        return f37615e;
    }

    @NotNull
    public final j0 N() {
        return f37635y;
    }

    @Nullable
    public final c O(@d1(9) @NotNull float[] fArr, @NotNull k0 k0Var) {
        for (c cVar : C) {
            if (b.h(cVar.g(), b.f37572b.c())) {
                c cVarE = d.e(cVar, o.f37659a.d(), null, 2, null);
                Intrinsics.checkNotNull(cVarE, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                j0 j0Var = (j0) cVarE;
                if (d.i(fArr, j0Var.Z()) && d.g(k0Var, j0Var.W())) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public final double P(@NotNull k0 k0Var, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double dJ = k0Var.j();
        double dK = k0Var.k();
        double dL = k0Var.l();
        double dM = k0Var.m();
        double dN = k0Var.n();
        double d13 = dJ * d12;
        return (k0Var.o() + 1.0d) * d11 * (d13 <= 1.0d ? Math.pow(d13, dK) : Math.exp((d12 - dN) * dL) + dM);
    }

    public final double Q(@NotNull k0 k0Var, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double dJ = 1.0d / k0Var.j();
        double dK = 1.0d / k0Var.k();
        double dL = 1.0d / k0Var.l();
        double dM = k0Var.m();
        double dN = k0Var.n();
        double dO = (d10 * d11) / (k0Var.o() + 1.0d);
        return d11 * (dO <= 1.0d ? dJ * Math.pow(dO, dK) : (dL * Math.log(dO - dM)) + dN);
    }

    public final double R(@NotNull k0 k0Var, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        return d11 * Math.pow(kotlin.ranges.r.s(k0Var.j() + (k0Var.k() * Math.pow(d12, k0Var.l())), 0.0d) / (k0Var.m() + (k0Var.n() * Math.pow(d12, k0Var.l()))), k0Var.o());
    }

    public final double S(@NotNull k0 k0Var, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = -k0Var.j();
        double dM = k0Var.m();
        double dO = 1.0d / k0Var.o();
        return d11 * Math.pow(Math.max(d13 + (dM * Math.pow(d12, dO)), 0.0d) / (k0Var.k() + ((-k0Var.n()) * Math.pow(d12, dO))), 1.0d / k0Var.l());
    }

    @NotNull
    public final j0 m() {
        return f37631u;
    }

    @NotNull
    public final j0 n() {
        return f37632v;
    }

    @NotNull
    public final j0 o() {
        return f37629s;
    }

    @NotNull
    public final j0 p() {
        return f37624n;
    }

    @NotNull
    public final j0 q() {
        return f37636z;
    }

    @NotNull
    public final k0 r() {
        return f37617g;
    }

    @NotNull
    public final j0 s() {
        return A;
    }

    @NotNull
    public final k0 t() {
        return f37618h;
    }

    @NotNull
    public final float[] u() {
        return f37614d;
    }

    @NotNull
    public final j0 v() {
        return f37623m;
    }

    @NotNull
    public final c w() {
        return f37634x;
    }

    @NotNull
    public final c x() {
        return f37633w;
    }

    @NotNull
    public final c y(int i10) {
        return z()[i10];
    }

    @NotNull
    public final c[] z() {
        return C;
    }
}
