package com.google.zxing.qrcode.decoder;

/* JADX INFO: loaded from: classes5.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f130878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f130879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f130880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f130881d;

    a(com.google.zxing.common.b bVar) throws com.google.zxing.h {
        int iH = bVar.h();
        if (iH < 21 || (iH & 3) != 1) {
            throw com.google.zxing.h.a();
        }
        this.f130878a = bVar;
    }

    private int a(int i10, int i11, int i12) {
        boolean z10 = this.f130881d;
        com.google.zxing.common.b bVar = this.f130878a;
        return z10 ? bVar.e(i11, i10) : bVar.e(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    void b() {
        int i10 = 0;
        while (i10 < this.f130878a.l()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f130878a.h(); i12++) {
                if (this.f130878a.e(i10, i12) != this.f130878a.e(i12, i10)) {
                    this.f130878a.d(i12, i10);
                    this.f130878a.d(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    byte[] c() throws com.google.zxing.h {
        g gVarD = d();
        j jVarE = e();
        c cVar = c.values()[gVarD.c()];
        int iH = this.f130878a.h();
        cVar.c(this.f130878a, iH);
        com.google.zxing.common.b bVarA = jVarE.a();
        byte[] bArr = new byte[jVarE.h()];
        int i10 = iH - 1;
        boolean z10 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i11 == 6) {
                i11--;
            }
            for (int i15 = 0; i15 < iH; i15++) {
                int i16 = z10 ? i10 - i15 : i15;
                for (int i17 = 0; i17 < 2; i17++) {
                    int i18 = i11 - i17;
                    if (!bVarA.e(i18, i16)) {
                        i13++;
                        i14 <<= 1;
                        if (this.f130878a.e(i18, i16)) {
                            i14 |= 1;
                        }
                        if (i13 == 8) {
                            bArr[i12] = (byte) i14;
                            i12++;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i11 -= 2;
        }
        if (i12 == jVarE.h()) {
            return bArr;
        }
        throw com.google.zxing.h.a();
    }

    g d() throws com.google.zxing.h {
        g gVar = this.f130880c;
        if (gVar != null) {
            return gVar;
        }
        int iA = 0;
        int iA2 = 0;
        for (int i10 = 0; i10 < 6; i10++) {
            iA2 = a(i10, 8, iA2);
        }
        int iA3 = a(8, 7, a(8, 8, a(7, 8, iA2)));
        for (int i11 = 5; i11 >= 0; i11--) {
            iA3 = a(8, i11, iA3);
        }
        int iH = this.f130878a.h();
        int i12 = iH - 7;
        for (int i13 = iH - 1; i13 >= i12; i13--) {
            iA = a(8, i13, iA);
        }
        for (int i14 = iH - 8; i14 < iH; i14++) {
            iA = a(i14, 8, iA);
        }
        g gVarA = g.a(iA3, iA);
        this.f130880c = gVarA;
        if (gVarA != null) {
            return gVarA;
        }
        throw com.google.zxing.h.a();
    }

    j e() throws com.google.zxing.h {
        j jVar = this.f130879b;
        if (jVar != null) {
            return jVar;
        }
        int iH = this.f130878a.h();
        int i10 = (iH - 17) / 4;
        if (i10 <= 6) {
            return j.i(i10);
        }
        int i11 = iH - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = iH - 9; i13 >= i11; i13--) {
                iA2 = a(i13, i12, iA2);
            }
        }
        j jVarC = j.c(iA2);
        if (jVarC != null && jVarC.e() == iH) {
            this.f130879b = jVarC;
            return jVarC;
        }
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = iH - 9; i15 >= i11; i15--) {
                iA = a(i14, i15, iA);
            }
        }
        j jVarC2 = j.c(iA);
        if (jVarC2 == null || jVarC2.e() != iH) {
            throw com.google.zxing.h.a();
        }
        this.f130879b = jVarC2;
        return jVarC2;
    }

    void f() {
        if (this.f130880c == null) {
            return;
        }
        c.values()[this.f130880c.c()].c(this.f130878a, this.f130878a.h());
    }

    void g(boolean z10) {
        this.f130879b = null;
        this.f130880c = null;
        this.f130881d = z10;
    }
}
