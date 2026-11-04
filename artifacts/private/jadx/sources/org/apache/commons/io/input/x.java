package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class x extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f336669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f336670b;

    public x(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, false);
    }

    @Override // org.apache.commons.io.input.o, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
            if (this.f336670b) {
                this.f336669a.close();
            }
        } catch (Throwable th2) {
            if (this.f336670b) {
                this.f336669a.close();
            }
            throw th2;
        }
    }

    @Override // org.apache.commons.io.input.o, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = super.read();
        if (i10 != -1) {
            this.f336669a.write(i10);
        }
        return i10;
    }

    public x(InputStream inputStream, OutputStream outputStream, boolean z10) {
        super(inputStream);
        this.f336669a = outputStream;
        this.f336670b = z10;
    }

    @Override // org.apache.commons.io.input.o, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = super.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f336669a.write(bArr, i10, i12);
        }
        return i12;
    }

    @Override // org.apache.commons.io.input.o, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i10 = super.read(bArr);
        if (i10 != -1) {
            this.f336669a.write(bArr, 0, i10);
        }
        return i10;
    }
}
