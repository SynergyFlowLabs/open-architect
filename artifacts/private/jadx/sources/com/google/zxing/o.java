package com.google.zxing;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f130536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f130537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f130538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f130539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f130540g;

    public o(int i10, int i11, int[] iArr) {
        super(i10, i11);
        this.f130537d = i10;
        this.f130538e = i11;
        this.f130539f = 0;
        this.f130540g = 0;
        int i12 = i10 * i11;
        this.f130536c = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = iArr[i13];
            this.f130536c[i13] = (byte) (((((i14 >> 16) & 255) + ((i14 >> 7) & androidx.constraintlayout.core.motion.utils.v.g.f44098r)) + (i14 & 255)) / 4);
        }
    }

    @Override // com.google.zxing.j
    public j a(int i10, int i11, int i12, int i13) {
        return new o(this.f130536c, this.f130537d, this.f130538e, this.f130539f + i10, this.f130540g + i11, i12, i13);
    }

    @Override // com.google.zxing.j
    public byte[] c() {
        int iE = e();
        int iB = b();
        int i10 = this.f130537d;
        if (iE == i10 && iB == this.f130538e) {
            return this.f130536c;
        }
        int i11 = iE * iB;
        byte[] bArr = new byte[i11];
        int i12 = (this.f130540g * i10) + this.f130539f;
        if (iE == i10) {
            System.arraycopy(this.f130536c, i12, bArr, 0, i11);
            return bArr;
        }
        for (int i13 = 0; i13 < iB; i13++) {
            System.arraycopy(this.f130536c, i12, bArr, i13 * iE, iE);
            i12 += this.f130537d;
        }
        return bArr;
    }

    @Override // com.google.zxing.j
    public byte[] d(int i10, byte[] bArr) {
        if (i10 < 0 || i10 >= b()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i10)));
        }
        int iE = e();
        if (bArr == null || bArr.length < iE) {
            bArr = new byte[iE];
        }
        System.arraycopy(this.f130536c, ((i10 + this.f130540g) * this.f130537d) + this.f130539f, bArr, 0, iE);
        return bArr;
    }

    @Override // com.google.zxing.j
    public boolean g() {
        return true;
    }

    private o(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i14, i15);
        if (i14 + i12 <= i10 && i15 + i13 <= i11) {
            this.f130536c = bArr;
            this.f130537d = i10;
            this.f130538e = i11;
            this.f130539f = i12;
            this.f130540g = i13;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }
}
