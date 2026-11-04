package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IOException f336746a;

    public b(IOException iOException) {
        this.f336746a = iOException;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.f336746a;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        throw this.f336746a;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        throw this.f336746a;
    }

    public b() {
        this(new IOException("Broken output stream"));
    }
}
