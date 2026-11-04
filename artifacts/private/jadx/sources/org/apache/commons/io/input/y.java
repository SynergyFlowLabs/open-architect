package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public class y extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f336671a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f336672b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f336673c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f336674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f336675e;

    public y(InputStream inputStream, boolean z10) {
        this.f336674d = inputStream;
        this.f336675e = z10;
    }

    private int a(boolean z10) {
        if (!z10 && this.f336675e && !this.f336671a) {
            this.f336671a = true;
            return 10;
        }
        return -1;
    }

    private int b() throws IOException {
        int i10 = this.f336674d.read();
        boolean z10 = i10 == -1;
        this.f336673c = z10;
        if (z10) {
            return i10;
        }
        this.f336671a = i10 == 10;
        this.f336672b = i10 == 13;
        return i10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f336674d.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        throw new UnsupportedOperationException("Mark notsupported");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        boolean z10 = this.f336672b;
        if (this.f336673c) {
            return a(z10);
        }
        int iB = b();
        if (this.f336673c) {
            return a(z10);
        }
        if (this.f336672b) {
            return 10;
        }
        return (z10 && this.f336671a) ? read() : iB;
    }
}
