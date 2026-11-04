package com.google.zxing.pdf417.encoder;

/* JADX INFO: loaded from: classes5.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f130826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130827b = 0;

    b(int i10) {
        this.f130826a = new byte[i10];
    }

    private void d(int i10, boolean z10) {
        this.f130826a[i10] = z10 ? (byte) 1 : (byte) 0;
    }

    void a(boolean z10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f130827b;
            this.f130827b = i12 + 1;
            d(i12, z10);
        }
    }

    byte[] b(int i10) {
        int length = this.f130826a.length * i10;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = this.f130826a[i11 / i10];
        }
        return bArr;
    }

    void c(int i10, byte b10) {
        this.f130826a[i10] = b10;
    }
}
