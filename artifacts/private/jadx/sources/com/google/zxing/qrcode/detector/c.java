package com.google.zxing.qrcode.detector;

import com.google.zxing.common.g;
import com.google.zxing.common.i;
import com.google.zxing.common.k;
import com.google.zxing.h;
import com.google.zxing.m;
import com.google.zxing.qrcode.decoder.j;
import com.google.zxing.t;
import com.google.zxing.u;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f130942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u f130943b;

    public c(com.google.zxing.common.b bVar) {
        this.f130942a = bVar;
    }

    private float b(t tVar, t tVar2) {
        float fM = m((int) tVar.c(), (int) tVar.d(), (int) tVar2.c(), (int) tVar2.d());
        float fM2 = m((int) tVar2.c(), (int) tVar2.d(), (int) tVar.c(), (int) tVar.d());
        if (Float.isNaN(fM)) {
            return fM2 / 7.0f;
        }
        return Float.isNaN(fM2) ? fM / 7.0f : (fM + fM2) / 14.0f;
    }

    private static int c(t tVar, t tVar2, t tVar3, float f10) throws m {
        int iC = (w9.a.c(t.b(tVar, tVar2) / f10) + w9.a.c(t.b(tVar, tVar3) / f10)) / 2;
        int i10 = iC + 7;
        int i11 = i10 & 3;
        if (i11 == 0) {
            return iC + 8;
        }
        if (i11 == 2) {
            return iC + 6;
        }
        if (i11 != 3) {
            return i10;
        }
        throw m.a();
    }

    private static k d(t tVar, t tVar2, t tVar3, t tVar4, int i10) {
        float fC;
        float fD;
        float f10;
        float f11 = i10 - 3.5f;
        if (tVar4 != null) {
            fC = tVar4.c();
            fD = tVar4.d();
            f10 = f11 - 3.0f;
        } else {
            fC = (tVar2.c() - tVar.c()) + tVar3.c();
            fD = (tVar2.d() - tVar.d()) + tVar3.d();
            f10 = f11;
        }
        return k.b(3.5f, 3.5f, f11, 3.5f, f10, f10, 3.5f, f11, tVar.c(), tVar.d(), tVar2.c(), tVar2.d(), fC, fD, tVar3.c(), tVar3.d());
    }

    private static com.google.zxing.common.b k(com.google.zxing.common.b bVar, k kVar, int i10) throws m {
        return i.b().d(bVar, i10, i10, kVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a A[RETURN] */
    private float l(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 1;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int iAbs = Math.abs(i16 - i14);
        int iAbs2 = Math.abs(i17 - i15);
        int i20 = 2;
        int i21 = (-iAbs) / 2;
        int i22 = i14 < i16 ? 1 : -1;
        int i23 = i15 < i17 ? 1 : -1;
        int i24 = i16 + i22;
        int i25 = i14;
        int i26 = i15;
        int i27 = 0;
        while (i25 != i24) {
            boolean z11 = z10;
            if ((i27 == i19 ? i19 : 0) == this.f130942a.e(z10 ? i26 : i25, z10 ? i25 : i26)) {
                if (i27 == 2) {
                    return w9.a.b(i25, i26, i14, i15);
                }
                i27++;
            }
            i21 += iAbs2;
            if (i21 > 0) {
                if (i26 == i17) {
                    i18 = 2;
                    if (i27 == i18) {
                        return w9.a.b(i24, i17, i14, i15);
                    }
                    return Float.NaN;
                }
                i26 += i23;
                i21 -= iAbs;
            }
            i25 += i22;
            iAbs = iAbs;
            z10 = z11;
            i19 = 1;
            i20 = 2;
        }
        i18 = i20;
        if (i27 == i18) {
            return w9.a.b(i24, i17, i14, i15);
        }
        return Float.NaN;
    }

    private float m(int i10, int i11, int i12, int i13) {
        float fL;
        float fH;
        float fL2 = l(i10, i11, i12, i13);
        int iL = i10 - (i12 - i10);
        int iH = 0;
        if (iL < 0) {
            fL = i10 / (i10 - iL);
            iL = 0;
        } else if (iL >= this.f130942a.l()) {
            fL = ((this.f130942a.l() - 1) - i10) / (iL - i10);
            iL = this.f130942a.l() - 1;
        } else {
            fL = 1.0f;
        }
        float f10 = i11;
        int i14 = (int) (f10 - ((i13 - i11) * fL));
        if (i14 < 0) {
            fH = f10 / (i11 - i14);
        } else if (i14 >= this.f130942a.h()) {
            fH = ((this.f130942a.h() - 1) - i11) / (i14 - i11);
            iH = this.f130942a.h() - 1;
        } else {
            iH = i14;
            fH = 1.0f;
        }
        return (fL2 + l(i10, i11, (int) (i10 + ((iL - i10) * fH)), iH)) - 1.0f;
    }

    protected final float a(t tVar, t tVar2, t tVar3) {
        return (b(tVar, tVar2) + b(tVar, tVar3)) / 2.0f;
    }

    public g e() throws m, h {
        return f(null);
    }

    public final g f(Map<com.google.zxing.e, ?> map) throws m, h {
        u uVar = map == null ? null : (u) map.get(com.google.zxing.e.NEED_RESULT_POINT_CALLBACK);
        this.f130943b = uVar;
        return j(new e(this.f130942a, uVar).f(map));
    }

    protected final a g(float f10, int i10, int i11, float f11) throws m {
        int i12 = (int) (f11 * f10);
        int iMax = Math.max(0, i10 - i12);
        int iMin = Math.min(this.f130942a.l() - 1, i10 + i12) - iMax;
        float f12 = 3.0f * f10;
        if (iMin < f12) {
            throw m.a();
        }
        int iMax2 = Math.max(0, i11 - i12);
        int iMin2 = Math.min(this.f130942a.h() - 1, i11 + i12) - iMax2;
        if (iMin2 >= f12) {
            return new b(this.f130942a, iMax, iMax2, iMin, iMin2, f10, this.f130943b).c();
        }
        throw m.a();
    }

    protected final com.google.zxing.common.b h() {
        return this.f130942a;
    }

    protected final u i() {
        return this.f130943b;
    }

    protected final g j(f fVar) throws m, h {
        a aVarG;
        d dVarB = fVar.b();
        d dVarC = fVar.c();
        d dVarA = fVar.a();
        float fA = a(dVarB, dVarC, dVarA);
        if (fA < 1.0f) {
            throw m.a();
        }
        int iC = c(dVarB, dVarC, dVarA, fA);
        j jVarG = j.g(iC);
        int iE = jVarG.e() - 7;
        if (jVarG.d().length <= 0) {
            aVarG = null;
            break;
        }
        float fC = (dVarC.c() - dVarB.c()) + dVarA.c();
        float fD = (dVarC.d() - dVarB.d()) + dVarA.d();
        float f10 = 1.0f - (3.0f / iE);
        int iC2 = (int) (dVarB.c() + ((fC - dVarB.c()) * f10));
        int iD = (int) (dVarB.d() + (f10 * (fD - dVarB.d())));
        int i10 = 4;
        while (true) {
            if (i10 > 16) {
                aVarG = null;
                break;
            }
            try {
                aVarG = g(fA, iC2, iD, i10);
                break;
            } catch (m unused) {
                i10 <<= 1;
            }
        }
        int i11 = 0 >> 3;
        return new g(k(this.f130942a, d(dVarB, dVarC, dVarA, aVarG, iC), iC), aVarG == null ? new t[]{dVarA, dVarB, dVarC} : new t[]{dVarA, dVarB, dVarC, aVarG});
    }
}
