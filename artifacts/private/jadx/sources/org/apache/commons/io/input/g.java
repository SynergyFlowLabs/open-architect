package org.apache.commons.io.input;

import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class g extends Reader implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f336612d = 3724187752191401220L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f336613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f336614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f336615c;

    public g(String str) {
        this.f336613a = str == null ? "" : str;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f336614b = 0;
        this.f336615c = 0;
    }

    @Override // java.io.Reader
    public void mark(int i10) {
        this.f336615c = this.f336614b;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() {
        if (this.f336614b >= this.f336613a.length()) {
            return -1;
        }
        CharSequence charSequence = this.f336613a;
        int i10 = this.f336614b;
        this.f336614b = i10 + 1;
        return charSequence.charAt(i10);
    }

    @Override // java.io.Reader
    public void reset() {
        this.f336614b = this.f336615c;
    }

    @Override // java.io.Reader
    public long skip(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Number of characters to skip is less than zero: " + j10);
        }
        if (this.f336614b >= this.f336613a.length()) {
            return -1L;
        }
        int iMin = (int) Math.min(this.f336613a.length(), ((long) this.f336614b) + j10);
        int i10 = iMin - this.f336614b;
        this.f336614b = iMin;
        return i10;
    }

    public String toString() {
        return this.f336613a.toString();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        if (this.f336614b >= this.f336613a.length()) {
            return -1;
        }
        if (cArr != null) {
            if (i11 < 0 || i10 < 0 || i10 + i11 > cArr.length) {
                throw new IndexOutOfBoundsException("Array Size=" + cArr.length + ", offset=" + i10 + ", length=" + i11);
            }
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = read();
                if (i14 == -1) {
                    break;
                }
                cArr[i10 + i13] = (char) i14;
                i12++;
            }
            return i12;
        }
        throw new NullPointerException("Character array is missing");
    }
}
