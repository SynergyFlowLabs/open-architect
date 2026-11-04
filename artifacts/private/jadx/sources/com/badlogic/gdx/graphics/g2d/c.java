package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.k;
import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static final int A = 3;
    public static final int B = 4;
    public static final int C = 5;
    public static final int D = 6;
    public static final int E = 7;
    public static final int F = 8;
    private static final com.badlogic.gdx.graphics.b G = new com.badlogic.gdx.graphics.b();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f94259x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f94260y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f94261z = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f94262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f94263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f94264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f94265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f94266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f94267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f94268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f94269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f94270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f94271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f94272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f94273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f94274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f94275n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f94276o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f94277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float[] f94278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f94279r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.badlogic.gdx.graphics.b f94280s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f94281t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f94282u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f94283v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f94284w;

    public c(k kVar, int i10, int i11, int i12, int i13) {
        this(new e(kVar), i10, i11, i12, i13);
    }

    private int a(e eVar, float f10, boolean z10, boolean z11) {
        k kVar = this.f94262a;
        if (kVar == null) {
            this.f94262a = eVar.f();
        } else if (kVar != eVar.f()) {
            throw new IllegalArgumentException("All regions must be from the same texture.");
        }
        float f11 = eVar.f94290b;
        float f12 = eVar.f94293e;
        float f13 = eVar.f94292d;
        float f14 = eVar.f94291c;
        if (z10) {
            float fO = 0.5f / this.f94262a.o();
            f11 += fO;
            f13 -= fO;
        }
        if (z11) {
            float f15 = 0.5f / this.f94262a.f();
            f12 -= f15;
            f14 += f15;
        }
        float[] fArr = this.f94278q;
        int i10 = this.f94279r;
        int i11 = i10 + 3;
        this.f94279r = i11;
        fArr[i10 + 2] = f10;
        int i12 = i10 + 4;
        this.f94279r = i12;
        fArr[i11] = f11;
        fArr[i12] = f12;
        int i13 = i10 + 8;
        this.f94279r = i13;
        fArr[i10 + 7] = f10;
        int i14 = i10 + 9;
        this.f94279r = i14;
        fArr[i13] = f11;
        fArr[i14] = f14;
        int i15 = i10 + 13;
        this.f94279r = i15;
        fArr[i10 + 12] = f10;
        int i16 = i10 + 14;
        this.f94279r = i16;
        fArr[i15] = f13;
        fArr[i16] = f14;
        int i17 = i10 + 18;
        this.f94279r = i17;
        fArr[i10 + 17] = f10;
        int i18 = i10 + 19;
        this.f94279r = i18;
        fArr[i17] = f13;
        this.f94279r = i10 + 20;
        fArr[i18] = f12;
        return i10;
    }

    private void q(e[] eVarArr) {
        float fG = com.badlogic.gdx.graphics.b.f94169f.G();
        e eVar = eVarArr[6];
        if (eVar != null) {
            this.f94263b = a(eVar, fG, false, false);
            this.f94272k = eVarArr[6].c();
            this.f94277p = eVarArr[6].b();
        }
        e eVar2 = eVarArr[7];
        if (eVar2 != null) {
            this.f94264c = a(eVar2, fG, true, false);
            this.f94274m = Math.max(this.f94274m, eVarArr[7].c());
            this.f94277p = Math.max(this.f94277p, eVarArr[7].b());
        }
        e eVar3 = eVarArr[8];
        if (eVar3 != null) {
            this.f94265d = a(eVar3, fG, false, false);
            this.f94273l = Math.max(this.f94273l, eVarArr[8].c());
            this.f94277p = Math.max(this.f94277p, eVarArr[8].b());
        }
        e eVar4 = eVarArr[3];
        if (eVar4 != null) {
            this.f94266e = a(eVar4, fG, false, true);
            this.f94272k = Math.max(this.f94272k, eVarArr[3].c());
            this.f94275n = Math.max(this.f94275n, eVarArr[3].b());
        }
        e eVar5 = eVarArr[4];
        if (eVar5 != null) {
            this.f94267f = a(eVar5, fG, true, true);
            this.f94274m = Math.max(this.f94274m, eVarArr[4].c());
            this.f94275n = Math.max(this.f94275n, eVarArr[4].b());
        }
        e eVar6 = eVarArr[5];
        if (eVar6 != null) {
            this.f94268g = a(eVar6, fG, false, true);
            this.f94273l = Math.max(this.f94273l, eVarArr[5].c());
            this.f94275n = Math.max(this.f94275n, eVarArr[5].b());
        }
        e eVar7 = eVarArr[0];
        if (eVar7 != null) {
            this.f94269h = a(eVar7, fG, false, false);
            this.f94272k = Math.max(this.f94272k, eVarArr[0].c());
            this.f94276o = Math.max(this.f94276o, eVarArr[0].b());
        }
        e eVar8 = eVarArr[1];
        if (eVar8 != null) {
            this.f94270i = a(eVar8, fG, true, false);
            this.f94274m = Math.max(this.f94274m, eVarArr[1].c());
            this.f94276o = Math.max(this.f94276o, eVarArr[1].b());
        }
        e eVar9 = eVarArr[2];
        if (eVar9 != null) {
            this.f94271j = a(eVar9, fG, false, false);
            this.f94273l = Math.max(this.f94273l, eVarArr[2].c());
            this.f94276o = Math.max(this.f94276o, eVarArr[2].b());
        }
        int i10 = this.f94279r;
        float[] fArr = this.f94278q;
        if (i10 < fArr.length) {
            float[] fArr2 = new float[i10];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f94278q = fArr2;
        }
    }

    private void s(int i10, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f12 + f10;
        float f16 = f13 + f11;
        float[] fArr = this.f94278q;
        fArr[i10] = f10;
        fArr[i10 + 1] = f11;
        fArr[i10 + 2] = f14;
        fArr[i10 + 5] = f10;
        fArr[i10 + 6] = f16;
        fArr[i10 + 7] = f14;
        fArr[i10 + 10] = f15;
        fArr[i10 + 11] = f16;
        fArr[i10 + 12] = f14;
        fArr[i10 + 15] = f15;
        fArr[i10 + 16] = f11;
        fArr[i10 + 17] = f14;
    }

    public void A(int i10) {
        this.f94282u = i10;
    }

    public void B(int i10) {
        this.f94283v = i10;
    }

    public void C(int i10, int i11, int i12, int i13) {
        this.f94281t = i10;
        this.f94282u = i11;
        this.f94283v = i12;
        this.f94284w = i13;
    }

    public void D(float f10) {
        this.f94273l = f10;
    }

    public void E(float f10) {
        this.f94276o = f10;
    }

    public void b(b bVar, float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        float f16 = f10 + this.f94272k;
        float f17 = f10 + f12;
        float f18 = f17 - this.f94273l;
        float f19 = f11 + this.f94277p;
        float f20 = f11 + f13;
        float f21 = f20 - this.f94276o;
        float fG = G.D(this.f94280s).n(bVar.m1()).G();
        int i10 = this.f94263b;
        if (i10 != -1) {
            s(i10, f10, f11, f16 - f10, f19 - f11, fG);
        }
        int i11 = this.f94264c;
        if (i11 != -1) {
            s(i11, f16, f11, f18 - f16, f19 - f11, fG);
        }
        int i12 = this.f94265d;
        if (i12 != -1) {
            s(i12, f18, f11, f17 - f18, f19 - f11, fG);
        }
        int i13 = this.f94266e;
        if (i13 != -1) {
            f14 = f19;
            s(i13, f10, f14, f16 - f10, f21 - f19, fG);
        } else {
            f14 = f19;
        }
        int i14 = this.f94267f;
        if (i14 != -1) {
            s(i14, f16, f14, f18 - f16, f21 - f14, fG);
        }
        int i15 = this.f94268g;
        if (i15 != -1) {
            s(i15, f18, f14, f17 - f18, f21 - f14, fG);
        }
        int i16 = this.f94269h;
        if (i16 != -1) {
            f15 = f21;
            s(i16, f10, f15, f16 - f10, f20 - f21, fG);
        } else {
            f15 = f21;
        }
        int i17 = this.f94270i;
        if (i17 != -1) {
            s(i17, f16, f15, f18 - f16, f20 - f15, fG);
        }
        int i18 = this.f94271j;
        if (i18 != -1) {
            s(i18, f18, f15, f17 - f18, f20 - f15, fG);
        }
        bVar.i1(this.f94262a, this.f94278q, 0, this.f94279r);
    }

    public float c() {
        return this.f94277p;
    }

    public com.badlogic.gdx.graphics.b d() {
        return this.f94280s;
    }

    public float e() {
        return this.f94272k;
    }

    public float f() {
        return this.f94275n;
    }

    public float g() {
        return this.f94274m;
    }

    public float h() {
        int i10 = this.f94284w;
        return i10 == -1 ? c() : i10;
    }

    public float i() {
        int i10 = this.f94281t;
        return i10 == -1 ? e() : i10;
    }

    public float j() {
        int i10 = this.f94282u;
        return i10 == -1 ? l() : i10;
    }

    public float k() {
        int i10 = this.f94283v;
        return i10 == -1 ? n() : i10;
    }

    public float l() {
        return this.f94273l;
    }

    public k m() {
        return this.f94262a;
    }

    public float n() {
        return this.f94276o;
    }

    public float o() {
        return this.f94276o + this.f94275n + this.f94277p;
    }

    public float p() {
        return this.f94272k + this.f94274m + this.f94273l;
    }

    public void r(float f10, float f11) {
        this.f94272k *= f10;
        this.f94273l *= f10;
        this.f94276o *= f11;
        this.f94277p *= f11;
        this.f94281t = (int) (this.f94281t * f10);
        this.f94282u = (int) (this.f94282u * f10);
        this.f94283v = (int) (this.f94283v * f11);
        this.f94284w = (int) (this.f94284w * f11);
    }

    public void t(float f10) {
        this.f94277p = f10;
    }

    public void u(com.badlogic.gdx.graphics.b bVar) {
        this.f94280s.D(bVar);
    }

    public void v(float f10) {
        this.f94272k = f10;
    }

    public void w(float f10) {
        this.f94275n = f10;
    }

    public void x(float f10) {
        this.f94274m = f10;
    }

    public void y(int i10) {
        this.f94284w = i10;
    }

    public void z(int i10) {
        this.f94281t = i10;
    }

    public c(e eVar, int i10, int i11, int i12, int i13) {
        this.f94263b = -1;
        this.f94264c = -1;
        this.f94265d = -1;
        this.f94266e = -1;
        this.f94267f = -1;
        this.f94268g = -1;
        this.f94269h = -1;
        this.f94270i = -1;
        this.f94271j = -1;
        this.f94278q = new float[180];
        this.f94280s = new com.badlogic.gdx.graphics.b(com.badlogic.gdx.graphics.b.f94169f);
        this.f94281t = -1;
        this.f94282u = -1;
        this.f94283v = -1;
        this.f94284w = -1;
        if (eVar == null) {
            throw new IllegalArgumentException("region cannot be null.");
        }
        int iC = (eVar.c() - i10) - i11;
        int iB = (eVar.b() - i12) - i13;
        e[] eVarArr = new e[9];
        if (i12 > 0) {
            if (i10 > 0) {
                eVarArr[0] = new e(eVar, 0, 0, i10, i12);
            }
            if (iC > 0) {
                eVarArr[1] = new e(eVar, i10, 0, iC, i12);
            }
            if (i11 > 0) {
                eVarArr[2] = new e(eVar, i10 + iC, 0, i11, i12);
            }
        }
        if (iB > 0) {
            if (i10 > 0) {
                eVarArr[3] = new e(eVar, 0, i12, i10, iB);
            }
            if (iC > 0) {
                eVarArr[4] = new e(eVar, i10, i12, iC, iB);
            }
            if (i11 > 0) {
                eVarArr[5] = new e(eVar, i10 + iC, i12, i11, iB);
            }
        }
        if (i13 > 0) {
            if (i10 > 0) {
                eVarArr[6] = new e(eVar, 0, i12 + iB, i10, i13);
            }
            if (iC > 0) {
                eVarArr[7] = new e(eVar, i10, i12 + iB, iC, i13);
            }
            if (i11 > 0) {
                eVarArr[8] = new e(eVar, i10 + iC, i12 + iB, i11, i13);
            }
        }
        if (i10 == 0 && iC == 0) {
            eVarArr[1] = eVarArr[2];
            eVarArr[4] = eVarArr[5];
            eVarArr[7] = eVarArr[8];
            eVarArr[2] = null;
            eVarArr[5] = null;
            eVarArr[8] = null;
        }
        if (i12 == 0 && iB == 0) {
            eVarArr[3] = eVarArr[6];
            eVarArr[4] = eVarArr[7];
            eVarArr[5] = eVarArr[8];
            eVarArr[6] = null;
            eVarArr[7] = null;
            eVarArr[8] = null;
        }
        q(eVarArr);
    }

    public c(k kVar, com.badlogic.gdx.graphics.b bVar) {
        this(kVar);
        u(bVar);
    }

    public c(k kVar) {
        this(new e(kVar));
    }

    public c(e eVar, com.badlogic.gdx.graphics.b bVar) {
        this(eVar);
        u(bVar);
    }

    public c(e eVar) {
        this.f94263b = -1;
        this.f94264c = -1;
        this.f94265d = -1;
        this.f94266e = -1;
        this.f94267f = -1;
        this.f94268g = -1;
        this.f94269h = -1;
        this.f94270i = -1;
        this.f94271j = -1;
        this.f94278q = new float[180];
        this.f94280s = new com.badlogic.gdx.graphics.b(com.badlogic.gdx.graphics.b.f94169f);
        this.f94281t = -1;
        this.f94282u = -1;
        this.f94283v = -1;
        this.f94284w = -1;
        int i10 = 0 << 0;
        q(new e[]{null, null, null, null, eVar, null, null, null, null});
    }

    public c(e... eVarArr) {
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        e eVar5;
        e eVar6;
        e eVar7;
        e eVar8;
        this.f94263b = -1;
        this.f94264c = -1;
        this.f94265d = -1;
        this.f94266e = -1;
        this.f94267f = -1;
        this.f94268g = -1;
        this.f94269h = -1;
        this.f94270i = -1;
        this.f94271j = -1;
        this.f94278q = new float[180];
        this.f94280s = new com.badlogic.gdx.graphics.b(com.badlogic.gdx.graphics.b.f94169f);
        this.f94281t = -1;
        this.f94282u = -1;
        this.f94283v = -1;
        this.f94284w = -1;
        if (eVarArr == null || eVarArr.length != 9) {
            throw new IllegalArgumentException("NinePatch needs nine TextureRegions");
        }
        q(eVarArr);
        float fE = e();
        e eVar9 = eVarArr[0];
        if ((eVar9 != null && eVar9.c() != fE) || (((eVar = eVarArr[3]) != null && eVar.c() != fE) || ((eVar2 = eVarArr[6]) != null && eVar2.c() != fE))) {
            throw new t("Left side patches must have the same width");
        }
        float fL = l();
        e eVar10 = eVarArr[2];
        if ((eVar10 != null && eVar10.c() != fL) || (((eVar3 = eVarArr[5]) != null && eVar3.c() != fL) || ((eVar4 = eVarArr[8]) != null && eVar4.c() != fL))) {
            throw new t("Right side patches must have the same width");
        }
        float fC = c();
        e eVar11 = eVarArr[6];
        if ((eVar11 != null && eVar11.b() != fC) || (((eVar5 = eVarArr[7]) != null && eVar5.b() != fC) || ((eVar6 = eVarArr[8]) != null && eVar6.b() != fC))) {
            throw new t("Bottom side patches must have the same height");
        }
        float fN = n();
        e eVar12 = eVarArr[0];
        if ((eVar12 != null && eVar12.b() != fN) || (((eVar7 = eVarArr[1]) != null && eVar7.b() != fN) || ((eVar8 = eVarArr[2]) != null && eVar8.b() != fN))) {
            throw new t("Top side patches must have the same height");
        }
    }

    public c(c cVar) {
        this(cVar, cVar.f94280s);
    }

    public c(c cVar, com.badlogic.gdx.graphics.b bVar) {
        this.f94263b = -1;
        this.f94264c = -1;
        this.f94265d = -1;
        this.f94266e = -1;
        this.f94267f = -1;
        this.f94268g = -1;
        this.f94269h = -1;
        this.f94270i = -1;
        this.f94271j = -1;
        this.f94278q = new float[180];
        com.badlogic.gdx.graphics.b bVar2 = new com.badlogic.gdx.graphics.b(com.badlogic.gdx.graphics.b.f94169f);
        this.f94280s = bVar2;
        this.f94281t = -1;
        this.f94282u = -1;
        this.f94283v = -1;
        this.f94284w = -1;
        this.f94262a = cVar.f94262a;
        this.f94263b = cVar.f94263b;
        this.f94264c = cVar.f94264c;
        this.f94265d = cVar.f94265d;
        this.f94266e = cVar.f94266e;
        this.f94267f = cVar.f94267f;
        this.f94268g = cVar.f94268g;
        this.f94269h = cVar.f94269h;
        this.f94270i = cVar.f94270i;
        this.f94271j = cVar.f94271j;
        this.f94272k = cVar.f94272k;
        this.f94273l = cVar.f94273l;
        this.f94274m = cVar.f94274m;
        this.f94275n = cVar.f94275n;
        this.f94276o = cVar.f94276o;
        this.f94277p = cVar.f94277p;
        this.f94281t = cVar.f94281t;
        this.f94283v = cVar.f94283v;
        this.f94284w = cVar.f94284w;
        this.f94282u = cVar.f94282u;
        float[] fArr = new float[cVar.f94278q.length];
        this.f94278q = fArr;
        float[] fArr2 = cVar.f94278q;
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        this.f94279r = cVar.f94279r;
        bVar2.D(bVar);
    }
}
