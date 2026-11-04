package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
final class d0 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<? extends g> f118981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private InputStream f118982b;

    public d0(Iterator<? extends g> it) throws IOException {
        this.f118981a = (Iterator) com.google.common.base.j0.E(it);
        a();
    }

    private void a() throws IOException {
        close();
        if (this.f118981a.hasNext()) {
            this.f118982b = this.f118981a.next().m();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f118982b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f118982b;
        if (inputStream != null) {
            try {
                inputStream.close();
                this.f118982b = null;
            } catch (Throwable th2) {
                this.f118982b = null;
                throw th2;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f118982b;
            if (inputStream == null) {
                return -1;
            }
            int i10 = inputStream.read();
            if (i10 != -1) {
                return i10;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public long skip(long n10) throws IOException {
        InputStream inputStream = this.f118982b;
        if (inputStream == null || n10 <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(n10);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f118982b.skip(n10 - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read(byte[] b10, int off, int len) throws IOException {
        com.google.common.base.j0.E(b10);
        while (true) {
            InputStream inputStream = this.f118982b;
            if (inputStream == null) {
                return -1;
            }
            int i10 = inputStream.read(b10, off, len);
            if (i10 != -1) {
                return i10;
            }
            a();
        }
    }
}
