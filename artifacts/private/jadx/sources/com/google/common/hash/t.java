package com.google.common.hash;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
@k
@com.google.common.annotations.a
public final class t extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f118914a;

    public t(q hashFunction, InputStream in) {
        super((InputStream) com.google.common.base.j0.E(in));
        this.f118914a = (r) com.google.common.base.j0.E(hashFunction.i());
    }

    public p a() {
        return this.f118914a.n();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int readlimit) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @z7.a
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f118914a.g((byte) i10);
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @z7.a
    public int read(byte[] bytes, int off, int len) throws IOException {
        int i10 = ((FilterInputStream) this).in.read(bytes, off, len);
        if (i10 != -1) {
            this.f118914a.k(bytes, off, i10);
        }
        return i10;
    }
}
