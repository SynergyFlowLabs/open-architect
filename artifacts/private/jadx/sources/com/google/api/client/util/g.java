package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class g implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f116074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f116075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f116076c;

    public g(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    @Override // com.google.api.client.util.m0
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f116074a, this.f116075b, this.f116076c);
        outputStream.flush();
    }

    public g(byte[] bArr, int i10, int i11) {
        this.f116074a = (byte[]) h0.d(bArr);
        h0.a(i10 >= 0 && i11 >= 0 && i10 + i11 <= bArr.length);
        this.f116075b = i10;
        this.f116076c = i11;
    }
}
