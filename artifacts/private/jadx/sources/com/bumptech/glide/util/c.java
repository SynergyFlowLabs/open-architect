package com.bumptech.glide.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f97465c = "ContentLengthStream";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f97466d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f97467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f97468b;

    private c(@NonNull InputStream inputStream, long j10) {
        super(inputStream);
        this.f97467a = j10;
    }

    private int a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f97468b += i10;
            return i10;
        }
        if (this.f97467a - ((long) this.f97468b) <= 0) {
            return i10;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f97467a + ", but read: " + this.f97468b);
    }

    @NonNull
    public static InputStream b(@NonNull InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    @NonNull
    public static InputStream c(@NonNull InputStream inputStream, @p0 String str) {
        return b(inputStream, d(str));
    }

    private static int d(@p0 String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f97467a - ((long) this.f97468b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i10;
        try {
            i10 = super.read();
            a(i10 >= 0 ? 1 : -1);
        } finally {
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        return a(super.read(bArr, i10, i11));
    }
}
