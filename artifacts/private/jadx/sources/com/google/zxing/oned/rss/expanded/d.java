package com.google.zxing.oned.rss.expanded;

import androidx.compose.runtime.m0;
import androidx.media2.widget.f;
import com.facebook.internal.p;
import com.google.zxing.e;
import com.google.zxing.h;
import com.google.zxing.m;
import com.google.zxing.oned.rss.expanded.decoders.j;
import com.google.zxing.r;
import com.google.zxing.t;
import com.rabbitmq.client.impl.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.g;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends com.google.zxing.oned.rss.a {
    private static final int A = 11;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f130671t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f130672u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f130673v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f130674w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f130675x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f130676y = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<b> f130678k = new ArrayList(11);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<c> f130679l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int[] f130680m = new int[2];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f130681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f130666o = {7, 5, 4, 3, 1};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f130667p = {4, 20, 52, 104, 204};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f130668q = {0, 348, 1388, 2948, 3988};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[][] f130669r = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[][] f130670s = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, me.relex.circleindicator.a.f332619e, f.i.f59773f0, 209, 205}, new int[]{193, f.i.f59799s0, 49, com.planner5d.library.engine.input.f.b.F1, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, f.i.f59777h0, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, f.i.f59801t0, 52, f.i.f59797r0}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, k.b.p.f265340a, 122, 155}, new int[]{43, 129, 176, com.planner5d.library.engine.input.f.b.f160742x1, com.planner5d.library.engine.input.f.b.f160745y1, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, androidx.media3.extractor.metadata.dvbsi.b.f67479d, f.i.f59767c0, 200, 178, com.planner5d.library.engine.input.f.b.B, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, p.f100029m}, new int[]{com.planner5d.library.engine.input.f.b.G1, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, f.i.f59793p0, 40}, new int[]{120, com.planner5d.library.engine.input.f.b.H1, 25, 75, 14, 42, g.f334652s, 167}, new int[]{79, 26, 78, 23, 69, m0.f36245r, 199, 175}, new int[]{com.planner5d.library.engine.input.f.b.f160733u1, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[][] f130677z = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    private static int A(com.google.zxing.common.a aVar, int i10) {
        return aVar.h(i10) ? aVar.j(aVar.k(i10)) : aVar.k(aVar.j(i10));
    }

    private static boolean C(com.google.zxing.oned.rss.c cVar, boolean z10, boolean z11) {
        return (cVar.c() == 0 && z10 && z11) ? false : true;
    }

    private static boolean D(Iterable<b> iterable, Iterable<c> iterable2) {
        for (c cVar : iterable2) {
            for (b bVar : iterable) {
                Iterator<b> it = cVar.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (bVar.equals(it.next())) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static boolean E(List<b> list) {
        for (int[] iArr : f130677z) {
            if (list.size() <= iArr.length) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    if (list.get(i10).b().c() == iArr[i10]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    private com.google.zxing.oned.rss.c F(com.google.zxing.common.a aVar, int i10, boolean z10) {
        int iK;
        int i11;
        int i12;
        if (z10) {
            int i13 = this.f130680m[0] - 1;
            while (i13 >= 0 && !aVar.h(i13)) {
                i13--;
            }
            int i14 = i13 + 1;
            int[] iArr = this.f130680m;
            i12 = iArr[0] - i14;
            iK = iArr[1];
            i11 = i14;
        } else {
            int[] iArr2 = this.f130680m;
            int i15 = iArr2[0];
            iK = aVar.k(iArr2[1] + 1);
            i11 = i15;
            i12 = iK - this.f130680m[1];
        }
        int i16 = iK;
        int[] iArrK = k();
        System.arraycopy(iArrK, 0, iArrK, 1, iArrK.length - 1);
        iArrK[0] = i12;
        try {
            return new com.google.zxing.oned.rss.c(com.google.zxing.oned.rss.a.r(iArrK, f130669r), new int[]{i11, i16}, i11, i16, i10);
        } catch (m unused) {
            return null;
        }
    }

    private static void G(List<b> list, List<c> list2) {
        Iterator<c> it = list2.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.a().size() != list.size()) {
                Iterator<b> it2 = next.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        it.remove();
                        break;
                    }
                    b next2 = it2.next();
                    Iterator<b> it3 = list.iterator();
                    do {
                        if (!it3.hasNext()) {
                            break;
                        }
                    } while (!next2.equals(it3.next()));
                }
            }
        }
    }

    private static void I(int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length / 2; i10++) {
            int i11 = iArr[i10];
            int i12 = (length - i10) - 1;
            iArr[i10] = iArr[i12];
            iArr[i12] = i11;
        }
    }

    private void J(int i10, boolean z10) {
        boolean zC = false;
        int i11 = 0;
        boolean zC2 = false;
        while (i11 < this.f130679l.size()) {
            c cVar = this.f130679l.get(i11);
            if (cVar.b() > i10) {
                zC = cVar.c(this.f130678k);
                break;
            } else {
                zC2 = cVar.c(this.f130678k);
                i11++;
            }
        }
        if (!zC && !zC2 && !D(this.f130678k, this.f130679l)) {
            this.f130679l.add(i11, new c(this.f130678k, i10, z10));
            G(this.f130678k, this.f130679l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    private void s(int i10) throws m {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int iD = w9.a.d(n());
        int iD2 = w9.a.d(l());
        boolean z14 = true;
        if (iD > 13) {
            z11 = true;
            z10 = false;
        } else if (iD < 4) {
            z10 = true;
            z11 = false;
        } else {
            z10 = false;
            z11 = false;
        }
        if (iD2 > 13) {
            z13 = true;
            z12 = false;
        } else if (iD2 < 4) {
            z12 = true;
            z13 = false;
        } else {
            z12 = false;
            z13 = false;
        }
        int i11 = (iD + iD2) - i10;
        boolean z15 = (iD & 1) == 1;
        boolean z16 = (iD2 & 1) == 0;
        if (i11 != 1) {
            if (i11 == -1) {
                if (z15) {
                    if (z16) {
                        throw m.a();
                    }
                } else {
                    if (!z16) {
                        throw m.a();
                    }
                    z12 = true;
                }
            } else {
                if (i11 != 0) {
                    throw m.a();
                }
                if (z15) {
                    if (!z16) {
                        throw m.a();
                    }
                    if (iD < iD2) {
                        z13 = true;
                    } else {
                        z12 = true;
                        z11 = true;
                    }
                } else if (z16) {
                    throw m.a();
                }
            }
            if (z14) {
                if (!z11) {
                    throw m.a();
                }
                com.google.zxing.oned.rss.a.p(n(), o());
            }
            if (z11) {
                com.google.zxing.oned.rss.a.i(n(), o());
            }
            if (z12) {
                if (!z13) {
                    throw m.a();
                }
                com.google.zxing.oned.rss.a.p(l(), o());
            }
            if (z13) {
                com.google.zxing.oned.rss.a.i(l(), m());
            }
        }
        if (z15) {
            if (z16) {
                throw m.a();
            }
            z11 = true;
        } else {
            if (!z16) {
                throw m.a();
            }
            z13 = true;
        }
        z14 = z10;
        if (z14) {
            if (!z11) {
                throw m.a();
            }
            com.google.zxing.oned.rss.a.p(n(), o());
        }
        if (z11) {
            com.google.zxing.oned.rss.a.i(n(), o());
        }
        if (z12) {
            if (!z13) {
                throw m.a();
            }
            com.google.zxing.oned.rss.a.p(l(), o());
        }
        if (z13) {
            com.google.zxing.oned.rss.a.i(l(), m());
        }
    }

    private boolean t() {
        b bVar = this.f130678k.get(0);
        com.google.zxing.oned.rss.b bVarC = bVar.c();
        com.google.zxing.oned.rss.b bVarD = bVar.d();
        if (bVarD == null) {
            return false;
        }
        int iA = bVarD.a();
        int i10 = 2;
        for (int i11 = 1; i11 < this.f130678k.size(); i11++) {
            b bVar2 = this.f130678k.get(i11);
            iA += bVar2.c().a();
            int i12 = i10 + 1;
            com.google.zxing.oned.rss.b bVarD2 = bVar2.d();
            if (bVarD2 != null) {
                iA += bVarD2.a();
                i10 += 2;
            } else {
                i10 = i12;
            }
        }
        return ((i10 + (-4)) * 211) + (iA % 211) == bVarC.b();
    }

    private List<b> u(List<c> list, int i10) throws m {
        while (i10 < this.f130679l.size()) {
            c cVar = this.f130679l.get(i10);
            this.f130678k.clear();
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                this.f130678k.addAll(it.next().a());
            }
            this.f130678k.addAll(cVar.a());
            if (E(this.f130678k)) {
                if (this.t()) {
                    return this.f130678k;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return this.u(arrayList, i10 + 1);
                } catch (m unused) {
                    continue;
                }
            }
            i10++;
        }
        throw m.a();
    }

    private List<b> v(boolean z10) {
        List<b> listU = null;
        if (this.f130679l.size() > 25) {
            this.f130679l.clear();
            return null;
        }
        this.f130678k.clear();
        if (z10) {
            Collections.reverse(this.f130679l);
        }
        try {
            listU = u(new ArrayList(), 0);
        } catch (m unused) {
        }
        if (z10) {
            Collections.reverse(this.f130679l);
        }
        return listU;
    }

    static r w(List<b> list) throws m, h {
        String strD = j.a(a.a(list)).d();
        t[] tVarArrA = list.get(0).b().a();
        t[] tVarArrA2 = list.get(list.size() - 1).b().a();
        return new r(strD, null, new t[]{tVarArrA[0], tVarArrA[1], tVarArrA2[0], tVarArrA2[1]}, com.google.zxing.a.RSS_EXPANDED);
    }

    private void z(com.google.zxing.common.a aVar, List<b> list, int i10) throws m {
        int[] iArrK = k();
        iArrK[0] = 0;
        iArrK[1] = 0;
        iArrK[2] = 0;
        iArrK[3] = 0;
        int iL = aVar.l();
        if (i10 < 0) {
            i10 = list.isEmpty() ? 0 : list.get(list.size() - 1).b().b()[1];
        }
        boolean z10 = list.size() % 2 != 0;
        if (this.f130681n) {
            z10 = !z10;
        }
        boolean z11 = false;
        while (i10 < iL) {
            boolean zH = aVar.h(i10);
            boolean z12 = !zH;
            if (zH) {
                z11 = z12;
                break;
            } else {
                i10++;
                z11 = z12;
            }
        }
        int i11 = 0;
        boolean z13 = z11;
        int i12 = i10;
        while (i10 < iL) {
            if (aVar.h(i10) != z13) {
                iArrK[i11] = iArrK[i11] + 1;
            } else {
                if (i11 == 3) {
                    if (z10) {
                        I(iArrK);
                    }
                    if (com.google.zxing.oned.rss.a.q(iArrK)) {
                        int[] iArr = this.f130680m;
                        iArr[0] = i12;
                        iArr[1] = i10;
                        return;
                    }
                    if (z10) {
                        I(iArrK);
                    }
                    i12 += iArrK[0] + iArrK[1];
                    iArrK[0] = iArrK[2];
                    iArrK[1] = iArrK[3];
                    iArrK[2] = 0;
                    iArrK[3] = 0;
                    i11--;
                } else {
                    i11++;
                }
                iArrK[i11] = 1;
                z13 = !z13;
            }
            i10++;
        }
        throw m.a();
    }

    List<c> B() {
        return this.f130679l;
    }

    b H(com.google.zxing.common.a aVar, List<b> list, int i10) throws m {
        com.google.zxing.oned.rss.c cVarF;
        com.google.zxing.oned.rss.b bVarX;
        boolean z10 = list.size() % 2 == 0;
        if (this.f130681n) {
            z10 = !z10;
        }
        int iA = -1;
        boolean z11 = true;
        do {
            z(aVar, list, iA);
            cVarF = F(aVar, i10, z10);
            if (cVarF == null) {
                iA = A(aVar, this.f130680m[0]);
            } else {
                z11 = false;
            }
        } while (z11);
        com.google.zxing.oned.rss.b bVarX2 = x(aVar, cVarF, z10, true);
        if (!list.isEmpty() && list.get(list.size() - 1).g()) {
            throw m.a();
        }
        try {
            bVarX = x(aVar, cVarF, z10, false);
        } catch (m unused) {
            bVarX = null;
        }
        return new b(bVarX2, bVarX, cVarF, true);
    }

    @Override // com.google.zxing.oned.r
    public r b(int i10, com.google.zxing.common.a aVar, Map<e, ?> map) throws m, h {
        this.f130678k.clear();
        this.f130681n = false;
        try {
            return w(y(i10, aVar));
        } catch (m unused) {
            this.f130678k.clear();
            this.f130681n = true;
            return w(y(i10, aVar));
        }
    }

    @Override // com.google.zxing.oned.r, com.google.zxing.p
    public void reset() {
        this.f130678k.clear();
        this.f130679l.clear();
    }

    com.google.zxing.oned.rss.b x(com.google.zxing.common.a aVar, com.google.zxing.oned.rss.c cVar, boolean z10, boolean z11) throws m {
        int[] iArrJ = j();
        for (int i10 = 0; i10 < iArrJ.length; i10++) {
            iArrJ[i10] = 0;
        }
        if (z11) {
            com.google.zxing.oned.r.g(aVar, cVar.b()[0], iArrJ);
        } else {
            com.google.zxing.oned.r.f(aVar, cVar.b()[1], iArrJ);
            int i11 = 0;
            for (int length = iArrJ.length - 1; i11 < length; length--) {
                int i12 = iArrJ[i11];
                iArrJ[i11] = iArrJ[length];
                iArrJ[length] = i12;
                i11++;
            }
        }
        float fD = w9.a.d(iArrJ) / 17.0f;
        float f10 = (cVar.b()[1] - cVar.b()[0]) / 15.0f;
        if (Math.abs(fD - f10) / f10 > 0.3f) {
            throw m.a();
        }
        int[] iArrN = n();
        int[] iArrL = l();
        float[] fArrO = o();
        float[] fArrM = m();
        for (int i13 = 0; i13 < iArrJ.length; i13++) {
            float f11 = (iArrJ[i13] * 1.0f) / fD;
            int i14 = (int) (0.5f + f11);
            if (i14 <= 0) {
                if (f11 < 0.3f) {
                    throw m.a();
                }
                i14 = 1;
            } else if (i14 > 8) {
                if (f11 > 8.7f) {
                    throw m.a();
                }
                i14 = 8;
            }
            int i15 = i13 / 2;
            if ((i13 & 1) == 0) {
                iArrN[i15] = i14;
                fArrO[i15] = f11 - i14;
            } else {
                iArrL[i15] = i14;
                fArrM[i15] = f11 - i14;
            }
        }
        s(17);
        int iC = (((cVar.c() * 4) + (z10 ? 0 : 2)) + (!z11 ? 1 : 0)) - 1;
        int i16 = 0;
        int i17 = 0;
        for (int length2 = iArrN.length - 1; length2 >= 0; length2--) {
            if (C(cVar, z10, z11)) {
                i16 += iArrN[length2] * f130670s[iC][length2 * 2];
            }
            i17 += iArrN[length2];
        }
        int i18 = 0;
        for (int length3 = iArrL.length - 1; length3 >= 0; length3--) {
            if (C(cVar, z10, z11)) {
                i18 += iArrL[length3] * f130670s[iC][(length3 * 2) + 1];
            }
        }
        int i19 = i16 + i18;
        if ((i17 & 1) != 0 || i17 > 13 || i17 < 4) {
            throw m.a();
        }
        int i20 = (13 - i17) / 2;
        int i21 = f130666o[i20];
        return new com.google.zxing.oned.rss.b((com.google.zxing.oned.rss.f.b(iArrN, i21, true) * f130667p[i20]) + com.google.zxing.oned.rss.f.b(iArrL, 9 - i21, false) + f130668q[i20], i19);
    }

    List<b> y(int i10, com.google.zxing.common.a aVar) throws m {
        boolean z10 = false;
        while (!z10) {
            try {
                List<b> list = this.f130678k;
                list.add(H(aVar, list, i10));
            } catch (m e10) {
                if (this.f130678k.isEmpty()) {
                    throw e10;
                }
                z10 = true;
            }
        }
        if (t()) {
            return this.f130678k;
        }
        boolean zIsEmpty = this.f130679l.isEmpty();
        J(i10, false);
        if (!zIsEmpty) {
            List<b> listV = v(false);
            if (listV != null) {
                return listV;
            }
            List<b> listV2 = v(true);
            if (listV2 != null) {
                return listV2;
            }
        }
        throw m.a();
    }
}
