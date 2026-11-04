package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class s extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected OutputStream f336777a;

    public s(OutputStream outputStream, OutputStream outputStream2) {
        super(outputStream);
        this.f336777a = outputStream2;
    }

    @Override // org.apache.commons.io.output.o, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
            this.f336777a.close();
        } catch (Throwable th2) {
            this.f336777a.close();
            throw th2;
        }
    }

    @Override // org.apache.commons.io.output.o, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        super.flush();
        this.f336777a.flush();
    }

    @Override // org.apache.commons.io.output.o, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        try {
            super.write(bArr);
            this.f336777a.write(bArr);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.apache.commons.io.output.o, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) throws IOException {
        super.write(bArr, i10, i11);
        this.f336777a.write(bArr, i10, i11);
    }

    @Override // org.apache.commons.io.output.o, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int i10) throws IOException {
        super.write(i10);
        this.f336777a.write(i10);
    }
}
