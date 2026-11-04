package com.github.luben.zstd;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class r extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ZstdOutputStreamNoFinalizer f103054a;

    @Deprecated
    public r(OutputStream outputStream, int i10, boolean z10, boolean z11) throws IOException {
        super(outputStream);
        ZstdOutputStreamNoFinalizer zstdOutputStreamNoFinalizer = new ZstdOutputStreamNoFinalizer(outputStream, i10);
        this.f103054a = zstdOutputStreamNoFinalizer;
        zstdOutputStreamNoFinalizer.d(z10);
        this.f103054a.c(z11);
    }

    public static long a() {
        return ZstdOutputStreamNoFinalizer.recommendedCOutSize();
    }

    public r E(int i10) throws IOException {
        this.f103054a.y(i10);
        return this;
    }

    public r b(int i10) throws IOException {
        this.f103054a.b(i10);
        return this;
    }

    public r c(boolean z10) throws IOException {
        this.f103054a.c(z10);
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f103054a.close();
    }

    public r d(boolean z10) {
        this.f103054a.d(z10);
        return this;
    }

    public r e(ZstdDictCompress zstdDictCompress) throws IOException {
        this.f103054a.e(zstdDictCompress);
        return this;
    }

    public r f(byte[] bArr) throws IOException {
        this.f103054a.f(bArr);
        return this;
    }

    protected void finalize() throws Throwable {
        close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f103054a.flush();
    }

    @Deprecated
    public void g(boolean z10) {
    }

    public r h(int i10) throws IOException {
        this.f103054a.g(i10);
        return this;
    }

    public r j(int i10) throws IOException {
        this.f103054a.h(i10);
        return this;
    }

    public r l(int i10) throws IOException {
        this.f103054a.j(i10);
        return this;
    }

    public r m(int i10) throws IOException {
        this.f103054a.l(i10);
        return this;
    }

    public r o(int i10) throws IOException {
        this.f103054a.m(i10);
        return this;
    }

    public r q(int i10) throws IOException {
        this.f103054a.o(i10);
        return this;
    }

    public r r(int i10) throws IOException {
        this.f103054a.q(i10);
        return this;
    }

    public r t(int i10) throws IOException {
        this.f103054a.r(i10);
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws Throwable {
        this.f103054a.write(bArr, i10, i11);
    }

    public r x(int i10) throws IOException {
        this.f103054a.t(i10);
        return this;
    }

    public r y(int i10) throws IOException {
        this.f103054a.x(i10);
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws Throwable {
        this.f103054a.write(i10);
    }

    @Deprecated
    public r(OutputStream outputStream, int i10, boolean z10) throws IOException {
        super(outputStream);
        ZstdOutputStreamNoFinalizer zstdOutputStreamNoFinalizer = new ZstdOutputStreamNoFinalizer(outputStream, i10);
        this.f103054a = zstdOutputStreamNoFinalizer;
        zstdOutputStreamNoFinalizer.d(z10);
    }

    public r(OutputStream outputStream, int i10) throws IOException {
        this(outputStream, f.f103032a);
        this.f103054a.j(i10);
    }

    public r(OutputStream outputStream) throws IOException {
        this(outputStream, f.f103032a);
    }

    public r(OutputStream outputStream, c cVar, int i10) throws IOException {
        this(outputStream, cVar);
        this.f103054a.j(i10);
    }

    public r(OutputStream outputStream, c cVar) throws IOException {
        super(outputStream);
        this.f103054a = new ZstdOutputStreamNoFinalizer(outputStream, cVar);
    }
}
