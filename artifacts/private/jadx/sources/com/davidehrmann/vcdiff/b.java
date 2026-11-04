package com.davidehrmann.vcdiff;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f97797a;

    public b(g gVar) {
        this.f97797a = (g) com.davidehrmann.vcdiff.util.a.b(gVar, "decoder was null");
    }

    public void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, OutputStream outputStream) throws IOException {
        this.f97797a.d(byteBuffer);
        this.f97797a.c(byteBuffer2, outputStream);
        this.f97797a.e();
    }

    @Deprecated
    public void b(byte[] bArr, byte[] bArr2, int i10, int i11, OutputStream outputStream) throws IOException {
        a(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr2, i10, i11), outputStream);
    }

    public void c(byte[] bArr, byte[] bArr2, OutputStream outputStream) throws IOException {
        a(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr2), outputStream);
    }
}
