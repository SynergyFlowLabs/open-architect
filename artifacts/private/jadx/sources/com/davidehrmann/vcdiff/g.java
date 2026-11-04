package com.davidehrmann.vcdiff;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface g {
    void a(byte[] bArr, OutputStream outputStream) throws IOException;

    @Deprecated
    void b(byte[] bArr);

    void c(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException;

    void d(ByteBuffer byteBuffer);

    void e() throws IOException;

    @Deprecated
    void f(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException;

    void g(boolean z10);

    boolean h(long j10);

    boolean i(int i10);
}
