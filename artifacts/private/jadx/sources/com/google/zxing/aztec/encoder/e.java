package com.google.zxing.aztec.encoder;

import kotlin.text.b0;

/* JADX INFO: loaded from: classes5.dex */
final class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f130139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f130140d;

    e(g gVar, int i10, int i11) {
        super(gVar);
        this.f130139c = (short) i10;
        this.f130140d = (short) i11;
    }

    @Override // com.google.zxing.aztec.encoder.g
    void c(com.google.zxing.common.a aVar, byte[] bArr) {
        aVar.c(this.f130139c, this.f130140d);
    }

    public String toString() {
        short s10 = this.f130139c;
        short s11 = this.f130140d;
        return "<" + Integer.toBinaryString((1 << this.f130140d) | (s10 & ((1 << s11) - 1)) | (1 << s11)).substring(1) + b0.f313281f;
    }
}
