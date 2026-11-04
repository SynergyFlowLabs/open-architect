package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public class z extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f336676a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f336677b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f336678c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f336679d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InputStream f336680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f336681f;

    public z(InputStream inputStream, boolean z10) {
        this.f336680e = inputStream;
        this.f336681f = z10;
    }

    private int a() {
        if (!this.f336681f) {
            return -1;
        }
        boolean z10 = this.f336677b;
        if (!z10 && !this.f336676a) {
            this.f336676a = true;
            return 13;
        }
        if (z10) {
            return -1;
        }
        this.f336676a = false;
        this.f336677b = true;
        return 10;
    }

    private int b() throws IOException {
        int i10 = this.f336680e.read();
        boolean z10 = i10 == -1;
        this.f336679d = z10;
        if (z10) {
            return i10;
        }
        this.f336676a = i10 == 13;
        this.f336677b = i10 == 10;
        return i10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f336680e.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        try {
            throw new UnsupportedOperationException("Mark not supported");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f336679d) {
            return a();
        }
        if (this.f336678c) {
            this.f336678c = false;
            return 10;
        }
        boolean z10 = this.f336676a;
        int iB = b();
        if (this.f336679d) {
            return a();
        }
        if (iB != 10 || z10) {
            return iB;
        }
        this.f336678c = true;
        return 13;
    }
}
