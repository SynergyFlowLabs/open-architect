package com.google.zxing.oned;

/* JADX INFO: loaded from: classes5.dex */
final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f130731c = {1, 1, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f130732a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f130733b = new w();

    x() {
    }

    com.google.zxing.r a(int i10, com.google.zxing.common.a aVar, int i11) throws com.google.zxing.m {
        int[] iArrN = y.n(aVar, i11, false, f130731c);
        try {
            return this.f130733b.b(i10, aVar, iArrN);
        } catch (com.google.zxing.q unused) {
            return this.f130732a.b(i10, aVar, iArrN);
        }
    }
}
