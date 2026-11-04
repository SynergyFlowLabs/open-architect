package com.github.luben.zstd;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class q extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ZstdInputStreamNoFinalizer f103053a;

    public q(InputStream inputStream) throws IOException {
        super(inputStream);
        this.f103053a = new ZstdInputStreamNoFinalizer(inputStream);
    }

    public static long b() {
        return ZstdInputStreamNoFinalizer.recommendedDInSize();
    }

    public static long c() {
        return ZstdInputStreamNoFinalizer.recommendedDOutSize();
    }

    public boolean a() {
        return this.f103053a.a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.f103053a.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f103053a.close();
    }

    public q d(boolean z10) {
        this.f103053a.c(z10);
        return this;
    }

    public q e(ZstdDictDecompress zstdDictDecompress) throws IOException {
        this.f103053a.d(zstdDictDecompress);
        return this;
    }

    public q f(byte[] bArr) throws IOException {
        this.f103053a.e(bArr);
        return this;
    }

    protected void finalize() throws Throwable {
        close();
    }

    @Deprecated
    public void g(boolean z10) {
    }

    public q h(int i10) throws IOException {
        this.f103053a.f(i10);
        return this;
    }

    public q j(boolean z10) throws IOException {
        this.f103053a.g(z10);
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return this.f103053a.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f103053a.read(bArr, i10, i11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        return this.f103053a.skip(j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        return this.f103053a.read();
    }

    public q(InputStream inputStream, c cVar) throws IOException {
        super(inputStream);
        this.f103053a = new ZstdInputStreamNoFinalizer(inputStream, cVar);
    }
}
