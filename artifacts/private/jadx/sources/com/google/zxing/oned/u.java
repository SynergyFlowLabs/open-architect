package com.google.zxing.oned;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements com.google.zxing.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f130725a = new j();

    @Override // com.google.zxing.v
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.g, ?> map) throws com.google.zxing.w {
        if (aVar == com.google.zxing.a.UPC_A) {
            return this.f130725a.a(com.facebook.appevents.p.f99189d0.concat(String.valueOf(str)), com.google.zxing.a.EAN_13, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }

    @Override // com.google.zxing.v
    public com.google.zxing.common.b b(String str, com.google.zxing.a aVar, int i10, int i11) throws com.google.zxing.w {
        return a(str, aVar, i10, i11, null);
    }
}
