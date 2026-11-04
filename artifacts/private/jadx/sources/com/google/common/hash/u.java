package com.google.common.hash;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
@k
@com.google.common.annotations.a
public final class u extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f118915a;

    public u(q hashFunction, OutputStream out) {
        super((OutputStream) com.google.common.base.j0.E(out));
        this.f118915a = (r) com.google.common.base.j0.E(hashFunction.i());
    }

    public p a() {
        return this.f118915a.n();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int b10) throws IOException {
        this.f118915a.g((byte) b10);
        ((FilterOutputStream) this).out.write(b10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bytes, int off, int len) throws IOException {
        this.f118915a.k(bytes, off, len);
        ((FilterOutputStream) this).out.write(bytes, off, len);
    }
}
