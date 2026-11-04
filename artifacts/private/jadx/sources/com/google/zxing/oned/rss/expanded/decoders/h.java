package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes5.dex */
abstract class h extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f130695c = 40;

    h(com.google.zxing.common.a aVar) {
        super(aVar);
    }

    private static void e(StringBuilder sb2, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < 13; i12++) {
            int iCharAt = sb2.charAt(i12 + i10) - '0';
            if ((i12 & 1) == 0) {
                iCharAt *= 3;
            }
            i11 += iCharAt;
        }
        int i13 = 10 - (i11 % 10);
        sb2.append(i13 != 10 ? i13 : 0);
    }

    final void f(StringBuilder sb2, int i10) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        g(sb2, i10, length);
    }

    final void g(StringBuilder sb2, int i10, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            int iF = b().f((i12 * 10) + i10, 10);
            if (iF / 100 == 0) {
                sb2.append(org.locationtech.jts.geom.l.f338160j);
            }
            if (iF / 10 == 0) {
                sb2.append(org.locationtech.jts.geom.l.f338160j);
            }
            sb2.append(iF);
        }
        e(sb2, i11);
    }
}
