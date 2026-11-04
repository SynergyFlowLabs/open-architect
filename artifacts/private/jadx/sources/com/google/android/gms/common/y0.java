package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class y0 extends x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f106991b;

    y0(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f106991b = bArr;
    }

    @Override // com.google.android.gms.common.x0
    final byte[] p() {
        return this.f106991b;
    }
}
