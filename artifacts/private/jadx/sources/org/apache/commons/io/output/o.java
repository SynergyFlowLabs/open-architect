package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class o extends FilterOutputStream {
    public o(OutputStream outputStream) {
        super(outputStream);
    }

    protected void a(int i10) throws IOException {
    }

    protected void b(int i10) throws IOException {
    }

    protected void c(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException e10) {
            c(e10);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException e10) {
            c(e10);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        try {
            b(1);
            ((FilterOutputStream) this).out.write(i10);
            a(1);
        } catch (IOException e10) {
            c(e10);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        int length;
        if (bArr != null) {
            try {
                length = bArr.length;
            } catch (IOException e10) {
                c(e10);
                return;
            }
        } else {
            length = 0;
        }
        b(length);
        ((FilterOutputStream) this).out.write(bArr);
        a(length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            b(i11);
            ((FilterOutputStream) this).out.write(bArr, i10, i11);
            a(i11);
        } catch (IOException e10) {
            c(e10);
        }
    }
}
