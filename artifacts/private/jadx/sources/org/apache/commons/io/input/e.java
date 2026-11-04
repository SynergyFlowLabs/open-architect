package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public class e extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IOException f336604a;

    public e(IOException iOException) {
        this.f336604a = iOException;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        throw this.f336604a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.f336604a;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        throw this.f336604a;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            throw this.f336604a;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        throw this.f336604a;
    }

    public e() {
        this(new IOException("Broken input stream"));
    }
}
