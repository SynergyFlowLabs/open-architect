package org.apache.commons.io.output;

import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes14.dex */
public class q extends Writer implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336774b = -146927496096066153L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f336775a;

    public q() {
        this.f336775a = new StringBuilder();
    }

    public StringBuilder a() {
        return this.f336775a;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.f336775a.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f336775a.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        if (cArr != null) {
            this.f336775a.append(cArr, i10, i11);
        }
    }

    public q(int i10) {
        this.f336775a = new StringBuilder(i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) {
        this.f336775a.append(c10);
        return this;
    }

    public q(StringBuilder sb2) {
        this.f336775a = sb2 == null ? new StringBuilder() : sb2;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f336775a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        this.f336775a.append(charSequence, i10, i11);
        return this;
    }
}
