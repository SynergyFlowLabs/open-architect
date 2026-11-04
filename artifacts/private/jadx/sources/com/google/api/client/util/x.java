package com.google.api.client.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class x extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f116179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f116180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f116181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Level f116182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Logger f116183e;

    public x(Logger logger, Level level, int i10) {
        this.f116183e = (Logger) h0.d(logger);
        this.f116182d = (Level) h0.d(level);
        h0.a(i10 >= 0);
        this.f116180b = i10;
    }

    private static void a(StringBuilder sb2, int i10) {
        if (i10 == 1) {
            sb2.append("1 byte");
        } else {
            sb2.append(NumberFormat.getInstance().format(i10));
            sb2.append(" bytes");
        }
    }

    public final synchronized int b() {
        return this.f116179a;
    }

    public final int c() {
        return this.f116180b;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (!this.f116181c) {
                if (this.f116179a != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Total: ");
                    a(sb2, this.f116179a);
                    int i10 = ((ByteArrayOutputStream) this).count;
                    if (i10 != 0 && i10 < this.f116179a) {
                        sb2.append(" (logging first ");
                        a(sb2, ((ByteArrayOutputStream) this).count);
                        sb2.append(")");
                    }
                    this.f116183e.config(sb2.toString());
                    if (((ByteArrayOutputStream) this).count != 0) {
                        this.f116183e.log(this.f116182d, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                    }
                }
                this.f116181c = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i10) {
        try {
            h0.a(!this.f116181c);
            this.f116179a++;
            if (((ByteArrayOutputStream) this).count < this.f116180b) {
                super.write(i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        try {
            h0.a(!this.f116181c);
            this.f116179a += i11;
            int i12 = ((ByteArrayOutputStream) this).count;
            int i13 = this.f116180b;
            if (i12 < i13) {
                int i14 = i12 + i11;
                if (i14 > i13) {
                    i11 += i13 - i14;
                }
                super.write(bArr, i10, i11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
