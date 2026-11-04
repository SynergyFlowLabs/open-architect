package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class h extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f116082a;

    h() {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f116082a += (long) i11;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f116082a++;
    }
}
