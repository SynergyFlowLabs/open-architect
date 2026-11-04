package com.google.zxing;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f130493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f130494b;

    protected j(int i10, int i11) {
        this.f130493a = i10;
        this.f130494b = i11;
    }

    public j a(int i10, int i11, int i12, int i13) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public final int b() {
        return this.f130494b;
    }

    public abstract byte[] c();

    public abstract byte[] d(int i10, byte[] bArr);

    public final int e() {
        return this.f130493a;
    }

    public j f() {
        return new i(this);
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public j i() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public j j() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        char c10;
        int i10 = this.f130493a;
        byte[] bArrD = new byte[i10];
        StringBuilder sb2 = new StringBuilder(this.f130494b * (i10 + 1));
        for (int i11 = 0; i11 < this.f130494b; i11++) {
            bArrD = d(i11, bArrD);
            for (int i12 = 0; i12 < this.f130493a; i12++) {
                int i13 = bArrD[i12] & 255;
                if (i13 < 64) {
                    c10 = '#';
                } else if (i13 < 128) {
                    c10 = '+';
                } else {
                    c10 = i13 < 192 ? '.' : ' ';
                }
                sb2.append(c10);
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
