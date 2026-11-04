package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final OutputStream f96309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f96310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.b f96311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f96312d;

    public c(@NonNull OutputStream outputStream, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void a() throws IOException {
        int i10 = this.f96312d;
        if (i10 > 0) {
            this.f96309a.write(this.f96310b, 0, i10);
            this.f96312d = 0;
        }
    }

    private void b() throws IOException {
        if (this.f96312d == this.f96310b.length) {
            a();
        }
    }

    private void release() {
        byte[] bArr = this.f96310b;
        if (bArr != null) {
            this.f96311c.put(bArr);
            this.f96310b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f96309a.close();
            release();
        } catch (Throwable th2) {
            this.f96309a.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f96309a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f96310b;
        int i11 = this.f96312d;
        this.f96312d = i11 + 1;
        bArr[i11] = (byte) i10;
        b();
    }

    @l1
    c(@NonNull OutputStream outputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, int i10) {
        this.f96309a = outputStream;
        this.f96311c = bVar;
        this.f96310b = (byte[]) bVar.a(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f96312d;
            if (i15 == 0 && i13 >= this.f96310b.length) {
                this.f96309a.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f96310b.length - i15);
            System.arraycopy(bArr, i14, this.f96310b, this.f96312d, iMin);
            this.f96312d += iMin;
            i12 += iMin;
            b();
        } while (i12 < i11);
    }
}
