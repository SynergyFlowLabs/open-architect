package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public abstract class t extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f336778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f336779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f336780c;

    public t(int i10) {
        this.f336778a = i10;
    }

    protected void a(int i10) throws IOException {
        if (this.f336780c || this.f336779b + ((long) i10) <= this.f336778a) {
            return;
        }
        this.f336780c = true;
        h();
    }

    public long b() {
        return this.f336779b;
    }

    protected abstract OutputStream c() throws IOException;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
        c().close();
    }

    public int d() {
        return this.f336778a;
    }

    public boolean e() {
        return this.f336779b > ((long) this.f336778a);
    }

    protected void f() {
        this.f336780c = false;
        this.f336779b = 0L;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        c().flush();
    }

    protected void g(long j10) {
        this.f336779b = j10;
    }

    protected abstract void h() throws IOException;

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        a(1);
        c().write(i10);
        this.f336779b++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        a(bArr.length);
        c().write(bArr);
        this.f336779b += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        a(i11);
        c().write(bArr, i10, i11);
        this.f336779b += (long) i11;
    }
}
