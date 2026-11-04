package org.apache.commons.io.input;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

/* JADX INFO: loaded from: classes14.dex */
public abstract class p extends FilterReader {
    public p(Reader reader) {
        super(reader);
    }

    protected void a(int i10) throws IOException {
    }

    protected void b(int i10) throws IOException {
    }

    protected void c(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterReader) this).in.close();
        } catch (IOException e10) {
            c(e10);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void mark(int i10) throws IOException {
        try {
            try {
                ((FilterReader) this).in.mark(i10);
            } catch (IOException e10) {
                c(e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean markSupported() {
        return ((FilterReader) this).in.markSupported();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int i10 = 1;
        try {
            b(1);
            int i11 = ((FilterReader) this).in.read();
            if (i11 == -1) {
                i10 = -1;
            }
            a(i10);
            return i11;
        } catch (IOException e10) {
            c(e10);
            return -1;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean ready() throws IOException {
        try {
            return ((FilterReader) this).in.ready();
        } catch (IOException e10) {
            c(e10);
            return false;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void reset() throws IOException {
        try {
            ((FilterReader) this).in.reset();
        } catch (IOException e10) {
            c(e10);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public long skip(long j10) throws IOException {
        try {
            return ((FilterReader) this).in.skip(j10);
        } catch (IOException e10) {
            c(e10);
            return 0L;
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
        int length;
        if (cArr != null) {
            try {
                length = cArr.length;
            } catch (IOException e10) {
                c(e10);
                return -1;
            }
        } else {
            length = 0;
        }
        b(length);
        int i10 = ((FilterReader) this).in.read(cArr);
        a(i10);
        return i10;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        try {
            b(i11);
            int i12 = ((FilterReader) this).in.read(cArr, i10, i11);
            a(i12);
            return i12;
        } catch (IOException e10) {
            c(e10);
            return -1;
        }
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws IOException {
        int length;
        if (charBuffer != null) {
            try {
                length = charBuffer.length();
            } catch (IOException e10) {
                c(e10);
                return -1;
            }
        } else {
            length = 0;
        }
        b(length);
        int i10 = ((FilterReader) this).in.read(charBuffer);
        a(i10);
        return i10;
    }
}
