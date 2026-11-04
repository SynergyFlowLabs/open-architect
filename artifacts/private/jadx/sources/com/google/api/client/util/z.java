package com.google.api.client.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class z extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f116185a;

    public z(OutputStream outputStream, Logger logger, Level level, int i10) {
        super(outputStream);
        this.f116185a = new x(logger, level, i10);
    }

    public final x a() {
        return this.f116185a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f116185a.close();
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10);
        this.f116185a.write(i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        this.f116185a.write(bArr, i10, i11);
    }
}
