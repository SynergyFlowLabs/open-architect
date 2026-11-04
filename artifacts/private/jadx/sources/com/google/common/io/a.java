package com.google.common.io;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
class a extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Appendable f118926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f118927b;

    a(Appendable target) {
        this.f118926a = (Appendable) com.google.common.base.j0.E(target);
    }

    private void a() throws IOException {
        if (this.f118927b) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f118927b = true;
        Appendable appendable = this.f118926a;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        a();
        Appendable appendable = this.f118926a;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cbuf, int off, int len) throws IOException {
        a();
        this.f118926a.append(new String(cbuf, off, len));
    }

    @Override // java.io.Writer
    public void write(int c10) throws IOException {
        a();
        this.f118926a.append((char) c10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) throws IOException {
        a();
        this.f118926a.append(c10);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        com.google.common.base.j0.E(str);
        a();
        this.f118926a.append(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@fj.a CharSequence charSeq) throws IOException {
        a();
        this.f118926a.append(charSeq);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@fj.a CharSequence charSeq, int start, int end) throws IOException {
        a();
        this.f118926a.append(charSeq, start, end);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int off, int len) throws IOException {
        com.google.common.base.j0.E(str);
        a();
        this.f118926a.append(str, off, len + off);
    }
}
