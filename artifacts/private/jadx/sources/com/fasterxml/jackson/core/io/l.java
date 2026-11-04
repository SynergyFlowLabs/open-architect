package com.fasterxml.jackson.core.io;

import java.io.Writer;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.fasterxml.jackson.core.util.n f102454a;

    public l(com.fasterxml.jackson.core.util.a aVar) {
        this.f102454a = new com.fasterxml.jackson.core.util.n(aVar);
    }

    public String a() {
        String strL = this.f102454a.l();
        this.f102454a.z();
        return strL;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.f102454a.c(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        this.f102454a.c(cArr, i10, i11);
    }

    @Override // java.io.Writer
    public void write(int i10) {
        this.f102454a.a((char) i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) {
        write(c10);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        this.f102454a.b(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        String string = charSequence.toString();
        this.f102454a.b(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) {
        this.f102454a.b(str, i10, i11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        String string = charSequence.subSequence(i10, i11).toString();
        this.f102454a.b(string, 0, string.length());
        return this;
    }
}
