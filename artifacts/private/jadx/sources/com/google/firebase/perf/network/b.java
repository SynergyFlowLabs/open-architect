package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.i;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f124055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Timer f124056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    i f124057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f124058d = -1;

    public b(OutputStream outputStream, i iVar, Timer timer) {
        this.f124055a = outputStream;
        this.f124057c = iVar;
        this.f124056b = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j10 = this.f124058d;
        if (j10 != -1) {
            this.f124057c.t(j10);
        }
        this.f124057c.x(this.f124056b.c());
        try {
            this.f124055a.close();
        } catch (IOException e10) {
            this.f124057c.y(this.f124056b.c());
            h.d(this.f124057c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f124055a.flush();
        } catch (IOException e10) {
            this.f124057c.y(this.f124056b.c());
            h.d(this.f124057c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        try {
            this.f124055a.write(i10);
            long j10 = this.f124058d + 1;
            this.f124058d = j10;
            this.f124057c.t(j10);
        } catch (IOException e10) {
            this.f124057c.y(this.f124056b.c());
            h.d(this.f124057c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f124055a.write(bArr);
            long length = this.f124058d + ((long) bArr.length);
            this.f124058d = length;
            this.f124057c.t(length);
        } catch (IOException e10) {
            this.f124057c.y(this.f124056b.c());
            h.d(this.f124057c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.f124055a.write(bArr, i10, i11);
            long j10 = this.f124058d + ((long) i11);
            this.f124058d = j10;
            this.f124057c.t(j10);
        } catch (IOException e10) {
            this.f124057c.y(this.f124056b.c());
            h.d(this.f124057c);
            throw e10;
        }
    }
}
