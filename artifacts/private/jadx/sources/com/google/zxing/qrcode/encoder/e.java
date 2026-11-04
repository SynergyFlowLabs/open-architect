package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.j;
import com.google.zxing.w;
import okhttp3.internal.ws.g;

/* JADX INFO: loaded from: classes5.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[][] f130971a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[][] f130972b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[][] f130973c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, com.planner5d.library.engine.input.f.b.f160742x1, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, g.f334652s, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, com.planner5d.library.engine.input.f.b.B, 138, -1}, new int[]{6, 30, 58, 86, 114, androidx.media2.widget.f.i.f59777h0, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, g.f334652s, 150}, new int[]{6, 24, 50, 76, 102, 128, androidx.media2.widget.f.i.f59793p0}, new int[]{6, 28, 54, 80, com.planner5d.library.engine.input.f.b.f160742x1, 132, androidx.media2.widget.f.i.f59801t0}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, androidx.media2.widget.f.i.f59777h0, 170}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[][] f130974d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f130975e = 7973;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130976f = 1335;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f130977g = 21522;

    private e() {
    }

    static void a(com.google.zxing.common.a aVar, com.google.zxing.qrcode.decoder.f fVar, j jVar, int i10, b bVar) throws w {
        c(bVar);
        d(jVar, bVar);
        l(fVar, i10, bVar);
        s(jVar, bVar);
        f(aVar, i10, bVar);
    }

    static int b(int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iN = n(i11);
        int iN2 = i10 << (iN - 1);
        while (n(iN2) >= iN) {
            iN2 ^= i11 << (n(iN2) - iN);
        }
        return iN2;
    }

    static void c(b bVar) {
        bVar.a((byte) -1);
    }

    static void d(j jVar, b bVar) throws w {
        j(bVar);
        e(bVar);
        r(jVar, bVar);
        k(bVar);
    }

    private static void e(b bVar) throws w {
        if (bVar.b(8, bVar.d() - 8) == 0) {
            throw new w();
        }
        int i10 = 7 ^ 1;
        bVar.g(8, bVar.d() - 8, 1);
    }

    static void f(com.google.zxing.common.a aVar, int i10, b bVar) throws w {
        boolean zH;
        int iE = bVar.e() - 1;
        int iD = bVar.d() - 1;
        int i11 = 0;
        int i12 = -1;
        while (iE > 0) {
            if (iE == 6) {
                iE--;
            }
            while (iD >= 0 && iD < bVar.d()) {
                for (int i13 = 0; i13 < 2; i13++) {
                    int i14 = iE - i13;
                    if (o(bVar.b(i14, iD))) {
                        if (i11 < aVar.l()) {
                            zH = aVar.h(i11);
                            i11++;
                        } else {
                            zH = false;
                        }
                        if (i10 != -1 && d.f(i10, i14, iD)) {
                            zH = !zH;
                        }
                        bVar.h(i14, iD, zH);
                    }
                }
                iD += i12;
            }
            i12 = -i12;
            iD += i12;
            iE -= 2;
        }
        if (i11 == aVar.l()) {
            return;
        }
        throw new w("Not all bits consumed: " + i11 + '/' + aVar.l());
    }

    private static void g(int i10, int i11, b bVar) throws w {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!o(bVar.b(i13, i11))) {
                throw new w();
            }
            bVar.g(i13, i11, 0);
        }
    }

    private static void h(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 5; i12++) {
            int[] iArr = f130972b[i12];
            for (int i13 = 0; i13 < 5; i13++) {
                bVar.g(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    private static void i(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f130971a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                bVar.g(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    private static void j(b bVar) throws w {
        int length = f130971a[0].length;
        i(0, 0, bVar);
        i(bVar.e() - length, 0, bVar);
        i(0, bVar.e() - length, bVar);
        g(0, 7, bVar);
        g(bVar.e() - 8, 7, bVar);
        g(0, bVar.e() - 8, bVar);
        m(7, 0, bVar);
        m(bVar.d() - 8, 0, bVar);
        m(7, bVar.d() - 7, bVar);
    }

    private static void k(b bVar) {
        int i10 = 8;
        while (i10 < bVar.e() - 8) {
            int i11 = i10 + 1;
            int i12 = i11 % 2;
            if (o(bVar.b(i10, 6))) {
                bVar.g(i10, 6, i12);
            }
            if (o(bVar.b(6, i10))) {
                bVar.g(6, i10, i12);
            }
            i10 = i11;
        }
    }

    static void l(com.google.zxing.qrcode.decoder.f fVar, int i10, b bVar) throws w {
        com.google.zxing.common.a aVar = new com.google.zxing.common.a();
        p(fVar, i10, aVar);
        for (int i11 = 0; i11 < aVar.l(); i11++) {
            boolean zH = aVar.h((aVar.l() - 1) - i11);
            int[] iArr = f130974d[i11];
            bVar.h(iArr[0], iArr[1], zH);
            if (i11 < 8) {
                bVar.h((bVar.e() - i11) - 1, 8, zH);
            } else {
                bVar.h(8, (bVar.d() - 7) + (i11 - 8), zH);
            }
        }
    }

    private static void m(int i10, int i11, b bVar) throws w {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!o(bVar.b(i10, i13))) {
                throw new w();
            }
            bVar.g(i10, i13, 0);
        }
    }

    static int n(int i10) {
        return 32 - Integer.numberOfLeadingZeros(i10);
    }

    private static boolean o(int i10) {
        return i10 == -1;
    }

    static void p(com.google.zxing.qrcode.decoder.f fVar, int i10, com.google.zxing.common.a aVar) throws w {
        if (!f.f(i10)) {
            throw new w("Invalid mask pattern");
        }
        int iK = (fVar.k() << 3) | i10;
        aVar.c(iK, 5);
        aVar.c(b(iK, f130976f), 10);
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        aVar2.c(f130977g, 15);
        aVar.v(aVar2);
        if (aVar.l() == 15) {
            return;
        }
        throw new w("should not happen but we got: " + aVar.l());
    }

    static void q(j jVar, com.google.zxing.common.a aVar) throws w {
        aVar.c(jVar.j(), 6);
        aVar.c(b(jVar.j(), f130975e), 12);
        if (aVar.l() == 18) {
            return;
        }
        throw new w("should not happen but we got: " + aVar.l());
    }

    private static void r(j jVar, b bVar) {
        if (jVar.j() >= 2) {
            int[] iArr = f130973c[jVar.j() - 1];
            for (int i10 : iArr) {
                if (i10 >= 0) {
                    for (int i11 : iArr) {
                        if (i11 >= 0 && o(bVar.b(i11, i10))) {
                            h(i11 - 2, i10 - 2, bVar);
                        }
                    }
                }
            }
        }
    }

    static void s(j jVar, b bVar) throws w {
        if (jVar.j() < 7) {
            return;
        }
        com.google.zxing.common.a aVar = new com.google.zxing.common.a();
        q(jVar, aVar);
        int i10 = 17;
        for (int i11 = 0; i11 < 6; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                boolean zH = aVar.h(i10);
                i10--;
                bVar.h(i11, (bVar.d() - 11) + i12, zH);
                bVar.h((bVar.d() - 11) + i12, i11, zH);
            }
        }
    }
}
