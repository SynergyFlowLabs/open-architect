package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public class l extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InheritableThreadLocal<InputStream> f336619a = new InheritableThreadLocal<>();

    public InputStream a(InputStream inputStream) {
        InputStream inputStream2 = this.f336619a.get();
        this.f336619a.set(inputStream);
        return inputStream2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f336619a.get();
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.f336619a.get();
        if (inputStream != null) {
            return inputStream.read();
        }
        return -1;
    }
}
