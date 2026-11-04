package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f130822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f130825d;

    a(int i10, int i11) {
        b[] bVarArr = new b[i10];
        this.f130822a = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f130822a[i12] = new b(((i11 + 4) * 17) + 1);
        }
        this.f130825d = i11 * 17;
        this.f130824c = i10;
        this.f130823b = -1;
    }

    b a() {
        return this.f130822a[this.f130823b];
    }

    public byte[][] b() {
        return c(1, 1);
    }

    public byte[][] c(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f130824c * i11, this.f130825d * i10);
        int i12 = this.f130824c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f130822a[i13 / i11].b(i10);
        }
        return bArr;
    }

    void d(int i10, int i11, byte b10) {
        this.f130822a[i11].c(i10, b10);
    }

    void e() {
        this.f130823b++;
    }
}
