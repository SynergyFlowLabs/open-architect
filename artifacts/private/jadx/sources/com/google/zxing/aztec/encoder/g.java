package com.google.zxing.aztec.encoder;

/* JADX INFO: loaded from: classes5.dex */
abstract class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final g f130146b = new e(null, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f130147a;

    g(g gVar) {
        this.f130147a = gVar;
    }

    final g a(int i10, int i11) {
        return new e(this, i10, i11);
    }

    final g b(int i10, int i11) {
        return new b(this, i10, i11);
    }

    abstract void c(com.google.zxing.common.a aVar, byte[] bArr);

    final g d() {
        return this.f130147a;
    }
}
