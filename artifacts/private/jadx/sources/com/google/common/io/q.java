package com.google.common.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public final class q extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f119046a;

    public q(OutputStream out) {
        super((OutputStream) com.google.common.base.j0.E(out));
    }

    public long a() {
        return this.f119046a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] b10, int off, int len) throws IOException {
        ((FilterOutputStream) this).out.write(b10, off, len);
        this.f119046a += (long) len;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int b10) throws IOException {
        ((FilterOutputStream) this).out.write(b10);
        this.f119046a++;
    }
}
