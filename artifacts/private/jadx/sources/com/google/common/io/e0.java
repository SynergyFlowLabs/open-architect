package com.google.common.io;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
class e0 extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator<? extends k> f118983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private Reader f118984b;

    e0(Iterator<? extends k> readers) throws IOException {
        this.f118983a = readers;
        a();
    }

    private void a() throws IOException {
        close();
        if (this.f118983a.hasNext()) {
            this.f118984b = this.f118983a.next().m();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.f118984b;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f118984b = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(char[] cbuf, int off, int len) throws IOException {
        com.google.common.base.j0.E(cbuf);
        Reader reader = this.f118984b;
        if (reader == null) {
            return -1;
        }
        int i10 = reader.read(cbuf, off, len);
        if (i10 != -1) {
            return i10;
        }
        a();
        return read(cbuf, off, len);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.f118984b;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public long skip(long n10) throws IOException {
        com.google.common.base.j0.e(n10 >= 0, "n is negative");
        if (n10 > 0) {
            while (true) {
                Reader reader = this.f118984b;
                if (reader == null) {
                    break;
                }
                long jSkip = reader.skip(n10);
                if (jSkip > 0) {
                    return jSkip;
                }
                a();
            }
        }
        return 0L;
    }
}
