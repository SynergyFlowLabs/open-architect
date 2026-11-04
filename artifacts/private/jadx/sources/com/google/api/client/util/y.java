package com.google.api.client.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class y extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f116184a;

    public y(InputStream inputStream, Logger logger, Level level, int i10) {
        super(inputStream);
        this.f116184a = new x(logger, level, i10);
    }

    public final x a() {
        return this.f116184a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f116184a.close();
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = super.read();
        this.f116184a.write(i10);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = super.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f116184a.write(bArr, i10, i12);
        }
        return i12;
    }
}
