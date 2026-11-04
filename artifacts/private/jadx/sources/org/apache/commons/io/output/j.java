package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class j extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InheritableThreadLocal<OutputStream> f336767a = new InheritableThreadLocal<>();

    public OutputStream a(OutputStream outputStream) {
        OutputStream outputStream2 = this.f336767a.get();
        this.f336767a.set(outputStream);
        return outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f336767a.get();
        if (outputStream != null) {
            outputStream.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.f336767a.get();
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        OutputStream outputStream = this.f336767a.get();
        if (outputStream != null) {
            outputStream.write(i10);
        }
    }
}
