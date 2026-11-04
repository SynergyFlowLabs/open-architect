package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[][] f130961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f130962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130963c;

    public b(int i10, int i11) {
        this.f130961a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f130962b = i10;
        this.f130963c = i11;
    }

    public void a(byte b10) {
        for (byte[] bArr : this.f130961a) {
            Arrays.fill(bArr, b10);
        }
    }

    public byte b(int i10, int i11) {
        return this.f130961a[i11][i10];
    }

    public byte[][] c() {
        return this.f130961a;
    }

    public int d() {
        return this.f130963c;
    }

    public int e() {
        return this.f130962b;
    }

    public void f(int i10, int i11, byte b10) {
        this.f130961a[i11][i10] = b10;
    }

    public void g(int i10, int i11, int i12) {
        this.f130961a[i11][i10] = (byte) i12;
    }

    public void h(int i10, int i11, boolean z10) {
        this.f130961a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f130962b * 2 * this.f130963c) + 2);
        for (int i10 = 0; i10 < this.f130963c; i10++) {
            byte[] bArr = this.f130961a[i10];
            for (int i11 = 0; i11 < this.f130962b; i11++) {
                byte b10 = bArr[i11];
                if (b10 == 0) {
                    sb2.append(" 0");
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
