package org.apache.commons.io.input;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes14.dex */
public class d extends Reader {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f336598f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f336599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f336600b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f336601c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f336602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f336603e;

    public d(Reader reader, int i10) throws IOException {
        this.f336599a = reader;
        this.f336603e = i10;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f336599a.close();
    }

    @Override // java.io.Reader
    public void mark(int i10) throws IOException {
        int i11 = this.f336600b;
        this.f336602d = i10 - i11;
        this.f336601c = i11;
        this.f336599a.mark(i10);
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        int i10 = this.f336600b;
        if (i10 >= this.f336603e) {
            return -1;
        }
        int i11 = this.f336601c;
        if (i11 >= 0 && i10 - i11 >= this.f336602d) {
            return -1;
        }
        this.f336600b = i10 + 1;
        return this.f336599a.read();
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        this.f336600b = this.f336601c;
        this.f336599a.reset();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = read();
            if (i13 == -1) {
                return i12;
            }
            cArr[i10 + i12] = (char) i13;
        }
        return i11;
    }
}
