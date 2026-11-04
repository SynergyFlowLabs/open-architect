package com.google.zxing.common;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f130281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f130283c;

    public c(byte[] bArr) {
        this.f130281a = bArr;
    }

    public int a() {
        return ((this.f130281a.length - this.f130282b) * 8) - this.f130283c;
    }

    public int b() {
        return this.f130283c;
    }

    public int c() {
        return this.f130282b;
    }

    public int d(int i10) {
        if (i10 <= 0 || i10 > 32 || i10 > a()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.f130283c;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int i14 = i10 < i13 ? i10 : i13;
            int i15 = i13 - i14;
            byte[] bArr = this.f130281a;
            int i16 = this.f130282b;
            int i17 = (((255 >> (8 - i14)) << i15) & bArr[i16]) >> i15;
            i10 -= i14;
            int i18 = i11 + i14;
            this.f130283c = i18;
            if (i18 == 8) {
                this.f130283c = 0;
                this.f130282b = i16 + 1;
            }
            i12 = i17;
        }
        if (i10 > 0) {
            while (i10 >= 8) {
                int i19 = i12 << 8;
                byte[] bArr2 = this.f130281a;
                int i20 = this.f130282b;
                i12 = (bArr2[i20] & 255) | i19;
                this.f130282b = i20 + 1;
                i10 -= 8;
            }
            if (i10 > 0) {
                int i21 = 8 - i10;
                int i22 = ((((255 >> i21) << i21) & this.f130281a[this.f130282b]) >> i21) | (i12 << i10);
                this.f130283c += i10;
                return i22;
            }
        }
        return i12;
    }
}
