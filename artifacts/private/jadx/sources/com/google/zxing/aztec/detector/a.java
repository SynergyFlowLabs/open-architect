package com.google.zxing.aztec.detector;

import com.google.zxing.common.b;
import com.google.zxing.common.i;
import com.google.zxing.common.reedsolomon.c;
import com.google.zxing.common.reedsolomon.e;
import com.google.zxing.m;
import com.google.zxing.t;
import com.rabbitmq.client.r;
import kotlin.text.b0;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f130107g = {3808, 476, 2107, 1799};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f130108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f130109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f130110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f130111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f130112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f130113f;

    /* JADX INFO: renamed from: com.google.zxing.aztec.detector.a$a, reason: collision with other inner class name */
    static final class C1431a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f130114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f130115b;

        C1431a(int i10, int i11) {
            this.f130114a = i10;
            this.f130115b = i11;
        }

        int a() {
            return this.f130114a;
        }

        int b() {
            return this.f130115b;
        }

        t c() {
            return new t(a(), b());
        }

        public String toString() {
            return "<" + this.f130114a + ' ' + this.f130115b + b0.f313281f;
        }
    }

    public a(b bVar) {
        this.f130108a = bVar;
    }

    private static float c(t tVar, t tVar2) {
        return w9.a.a(tVar.c(), tVar.d(), tVar2.c(), tVar2.d());
    }

    private static float d(C1431a c1431a, C1431a c1431a2) {
        return w9.a.b(c1431a.a(), c1431a.b(), c1431a2.a(), c1431a2.b());
    }

    private static t[] e(t[] tVarArr, int i10, int i11) {
        float f10 = i11 / (i10 * 2.0f);
        float fC = tVarArr[0].c() - tVarArr[2].c();
        float fD = tVarArr[0].d() - tVarArr[2].d();
        float fC2 = (tVarArr[0].c() + tVarArr[2].c()) / 2.0f;
        float fD2 = (tVarArr[0].d() + tVarArr[2].d()) / 2.0f;
        float f11 = fC * f10;
        float f12 = fD * f10;
        t tVar = new t(fC2 + f11, fD2 + f12);
        t tVar2 = new t(fC2 - f11, fD2 - f12);
        float fC3 = tVarArr[1].c() - tVarArr[3].c();
        float fD3 = tVarArr[1].d() - tVarArr[3].d();
        float fC4 = (tVarArr[1].c() + tVarArr[3].c()) / 2.0f;
        float fD4 = (tVarArr[1].d() + tVarArr[3].d()) / 2.0f;
        float f13 = fC3 * f10;
        float f14 = f10 * fD3;
        return new t[]{tVar, new t(fC4 + f13, fD4 + f14), tVar2, new t(fC4 - f13, fD4 - f14)};
    }

    private void f(t[] tVarArr) throws m {
        long j10;
        long j11;
        if (!p(tVarArr[0]) || !p(tVarArr[1]) || !p(tVarArr[2]) || !p(tVarArr[3])) {
            throw m.a();
        }
        int i10 = this.f130112e * 2;
        int[] iArr = {s(tVarArr[0], tVarArr[1], i10), s(tVarArr[1], tVarArr[2], i10), s(tVarArr[2], tVarArr[3], i10), s(tVarArr[3], tVarArr[0], i10)};
        this.f130113f = n(iArr, i10);
        long j12 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = iArr[(this.f130113f + i11) % 4];
            if (this.f130109b) {
                j10 = j12 << 7;
                j11 = (i12 >> 1) & 127;
            } else {
                j10 = j12 << 10;
                j11 = ((i12 >> 2) & 992) + ((i12 >> 1) & 31);
            }
            j12 = j10 + j11;
        }
        int i13 = i(j12, this.f130109b);
        if (this.f130109b) {
            this.f130110c = (i13 >> 6) + 1;
            this.f130111d = (i13 & 63) + 1;
        } else {
            this.f130110c = (i13 >> 11) + 1;
            this.f130111d = (i13 & r.f265987x3) + 1;
        }
    }

    private t[] g(C1431a c1431a) throws m {
        this.f130112e = 1;
        C1431a c1431a2 = c1431a;
        C1431a c1431a3 = c1431a2;
        C1431a c1431a4 = c1431a3;
        boolean z10 = true;
        while (this.f130112e < 9) {
            C1431a c1431aK = k(c1431a, z10, 1, -1);
            C1431a c1431aK2 = k(c1431a2, z10, 1, 1);
            C1431a c1431aK3 = k(c1431a3, z10, -1, 1);
            C1431a c1431aK4 = k(c1431a4, z10, -1, -1);
            if (this.f130112e > 2) {
                double d10 = (d(c1431aK4, c1431aK) * this.f130112e) / (d(c1431a4, c1431a) * (this.f130112e + 2));
                if (d10 < 0.75d || d10 > 1.25d || !q(c1431aK, c1431aK2, c1431aK3, c1431aK4)) {
                    break;
                }
            }
            z10 = !z10;
            this.f130112e++;
            c1431a4 = c1431aK4;
            c1431a = c1431aK;
            c1431a2 = c1431aK2;
            c1431a3 = c1431aK3;
        }
        int i10 = this.f130112e;
        if (i10 != 5 && i10 != 7) {
            throw m.a();
        }
        this.f130109b = i10 == 5;
        t[] tVarArr = {new t(c1431a.a() + 0.5f, c1431a.b() - 0.5f), new t(c1431a2.a() + 0.5f, c1431a2.b() + 0.5f), new t(c1431a3.a() - 0.5f, c1431a3.b() + 0.5f), new t(c1431a4.a() - 0.5f, c1431a4.b() - 0.5f)};
        int i11 = this.f130112e;
        return e(tVarArr, (i11 * 2) - 3, i11 * 2);
    }

    private int h(C1431a c1431a, C1431a c1431a2) {
        float fD = d(c1431a, c1431a2);
        float fA = (c1431a2.a() - c1431a.a()) / fD;
        float fB = (c1431a2.b() - c1431a.b()) / fD;
        float fA2 = c1431a.a();
        float fB2 = c1431a.b();
        boolean zE = this.f130108a.e(c1431a.a(), c1431a.b());
        int iCeil = (int) Math.ceil(fD);
        int i10 = 0;
        for (int i11 = 0; i11 < iCeil; i11++) {
            fA2 += fA;
            fB2 += fB;
            if (this.f130108a.e(w9.a.c(fA2), w9.a.c(fB2)) != zE) {
                i10++;
            }
        }
        float f10 = i10 / fD;
        if (f10 <= 0.1f || f10 >= 0.9f) {
            return (f10 <= 0.1f) == zE ? 1 : -1;
        }
        return 0;
    }

    private static int i(long j10, boolean z10) throws m {
        int i10;
        int i11;
        if (z10) {
            i10 = 7;
            i11 = 2;
        } else {
            i10 = 10;
            i11 = 4;
        }
        int i12 = i10 - i11;
        int[] iArr = new int[i10];
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iArr[i13] = ((int) j10) & 15;
            j10 >>= 4;
        }
        try {
            new c(com.google.zxing.common.reedsolomon.a.f130356k).a(iArr, i12);
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 = (i14 << 4) + iArr[i15];
            }
            return i14;
        } catch (e unused) {
            throw m.a();
        }
    }

    private int j() {
        if (this.f130109b) {
            return (this.f130110c * 4) + 11;
        }
        int i10 = this.f130110c;
        return i10 <= 4 ? (i10 * 4) + 15 : (i10 * 4) + ((((i10 - 4) / 8) + 1) * 2) + 15;
    }

    private C1431a k(C1431a c1431a, boolean z10, int i10, int i11) {
        int iA = c1431a.a() + i10;
        int iB = c1431a.b();
        while (true) {
            iB += i11;
            if (!o(iA, iB) || this.f130108a.e(iA, iB) != z10) {
                break;
            }
            iA += i10;
        }
        int i12 = iA - i10;
        int i13 = iB - i11;
        while (o(i12, i13) && this.f130108a.e(i12, i13) == z10) {
            i12 += i10;
        }
        int i14 = i12 - i10;
        while (o(i14, i13) && this.f130108a.e(i14, i13) == z10) {
            i13 += i11;
        }
        return new C1431a(i14, i13 - i11);
    }

    private C1431a l() {
        t tVarC;
        t tVar;
        t tVar2;
        t tVar3;
        t tVarC2;
        t tVarC3;
        t tVarC4;
        t tVarC5;
        try {
            t[] tVarArrC = new w9.c(this.f130108a).c();
            tVar2 = tVarArrC[0];
            tVar3 = tVarArrC[1];
            tVar = tVarArrC[2];
            tVarC = tVarArrC[3];
        } catch (m unused) {
            int iL = this.f130108a.l() / 2;
            int iH = this.f130108a.h() / 2;
            int i10 = iL + 7;
            int i11 = iH - 7;
            t tVarC6 = k(new C1431a(i10, i11), false, 1, -1).c();
            int i12 = iH + 7;
            t tVarC7 = k(new C1431a(i10, i12), false, 1, 1).c();
            int i13 = iL - 7;
            t tVarC8 = k(new C1431a(i13, i12), false, -1, 1).c();
            tVarC = k(new C1431a(i13, i11), false, -1, -1).c();
            tVar = tVarC8;
            tVar2 = tVarC6;
            tVar3 = tVarC7;
        }
        int iC = w9.a.c((((tVar2.c() + tVarC.c()) + tVar3.c()) + tVar.c()) / 4.0f);
        int iC2 = w9.a.c((((tVar2.d() + tVarC.d()) + tVar3.d()) + tVar.d()) / 4.0f);
        try {
            t[] tVarArrC2 = new w9.c(this.f130108a, 15, iC, iC2).c();
            tVarC2 = tVarArrC2[0];
            tVarC3 = tVarArrC2[1];
            tVarC4 = tVarArrC2[2];
            tVarC5 = tVarArrC2[3];
        } catch (m unused2) {
            int i14 = iC + 7;
            int i15 = iC2 - 7;
            tVarC2 = k(new C1431a(i14, i15), false, 1, -1).c();
            int i16 = iC2 + 7;
            tVarC3 = k(new C1431a(i14, i16), false, 1, 1).c();
            int i17 = iC - 7;
            tVarC4 = k(new C1431a(i17, i16), false, -1, 1).c();
            tVarC5 = k(new C1431a(i17, i15), false, -1, -1).c();
        }
        return new C1431a(w9.a.c((((tVarC2.c() + tVarC5.c()) + tVarC3.c()) + tVarC4.c()) / 4.0f), w9.a.c((((tVarC2.d() + tVarC5.d()) + tVarC3.d()) + tVarC4.d()) / 4.0f));
    }

    private t[] m(t[] tVarArr) {
        return e(tVarArr, this.f130112e * 2, j());
    }

    private static int n(int[] iArr, int i10) throws m {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 = (i11 << 3) + ((i12 >> (i10 - 2)) << 1) + (i12 & 1);
        }
        int i13 = ((i11 & 1) << 11) + (i11 >> 1);
        for (int i14 = 0; i14 < 4; i14++) {
            if (Integer.bitCount(f130107g[i14] ^ i13) <= 2) {
                return i14;
            }
        }
        throw m.a();
    }

    private boolean o(int i10, int i11) {
        return i10 >= 0 && i10 < this.f130108a.l() && i11 > 0 && i11 < this.f130108a.h();
    }

    private boolean p(t tVar) {
        return o(w9.a.c(tVar.c()), w9.a.c(tVar.d()));
    }

    private boolean q(C1431a c1431a, C1431a c1431a2, C1431a c1431a3, C1431a c1431a4) {
        C1431a c1431a5 = new C1431a(c1431a.a() - 3, c1431a.b() + 3);
        C1431a c1431a6 = new C1431a(c1431a2.a() - 3, c1431a2.b() - 3);
        C1431a c1431a7 = new C1431a(c1431a3.a() + 3, c1431a3.b() - 3);
        C1431a c1431a8 = new C1431a(c1431a4.a() + 3, c1431a4.b() + 3);
        int iH = h(c1431a8, c1431a5);
        return iH != 0 && h(c1431a5, c1431a6) == iH && h(c1431a6, c1431a7) == iH && h(c1431a7, c1431a8) == iH;
    }

    private b r(b bVar, t tVar, t tVar2, t tVar3, t tVar4) throws m {
        i iVarB = i.b();
        int iJ = j();
        float f10 = iJ / 2.0f;
        int i10 = this.f130112e;
        float f11 = f10 - i10;
        float f12 = f10 + i10;
        return iVarB.c(bVar, iJ, iJ, f11, f11, f12, f11, f12, f12, f11, f12, tVar.c(), tVar.d(), tVar2.c(), tVar2.d(), tVar3.c(), tVar3.d(), tVar4.c(), tVar4.d());
    }

    private int s(t tVar, t tVar2, int i10) {
        float fC = c(tVar, tVar2);
        float f10 = fC / i10;
        float fC2 = tVar.c();
        float fD = tVar.d();
        float fC3 = ((tVar2.c() - tVar.c()) * f10) / fC;
        float fD2 = (f10 * (tVar2.d() - tVar.d())) / fC;
        int i11 = 0 >> 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            float f11 = i13;
            if (this.f130108a.e(w9.a.c((f11 * fC3) + fC2), w9.a.c((f11 * fD2) + fD))) {
                i12 |= 1 << ((i10 - i13) - 1);
            }
        }
        return i12;
    }

    public v9.a a() throws m {
        return b(false);
    }

    public v9.a b(boolean z10) throws m {
        t[] tVarArrG = g(l());
        if (z10) {
            int i10 = 7 | 0;
            t tVar = tVarArrG[0];
            tVarArrG[0] = tVarArrG[2];
            tVarArrG[2] = tVar;
        }
        f(tVarArrG);
        b bVar = this.f130108a;
        int i11 = this.f130113f;
        return new v9.a(r(bVar, tVarArrG[i11 % 4], tVarArrG[(i11 + 1) % 4], tVarArrG[(i11 + 2) % 4], tVarArrG[(i11 + 3) % 4]), m(tVarArrG), this.f130109b, this.f130111d, this.f130110c);
    }
}
