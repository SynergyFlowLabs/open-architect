package com.google.zxing;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f130530h = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f130531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f130532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f130533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f130534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f130535g;

    public n(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        super(i14, i15);
        if (i12 + i14 > i10 || i13 + i15 > i11) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f130531c = bArr;
        this.f130532d = i10;
        this.f130533e = i11;
        this.f130534f = i12;
        this.f130535g = i13;
        if (z10) {
            n(i14, i15);
        }
    }

    private void n(int i10, int i11) {
        byte[] bArr = this.f130531c;
        int i12 = (this.f130535g * this.f130532d) + this.f130534f;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = (i10 / 2) + i12;
            int i15 = (i12 + i10) - 1;
            int i16 = i12;
            while (i16 < i14) {
                byte b10 = bArr[i16];
                bArr[i16] = bArr[i15];
                bArr[i15] = b10;
                i16++;
                i15--;
            }
            i13++;
            i12 += this.f130532d;
        }
    }

    @Override // com.google.zxing.j
    public j a(int i10, int i11, int i12, int i13) {
        return new n(this.f130531c, this.f130532d, this.f130533e, this.f130534f + i10, this.f130535g + i11, i12, i13, false);
    }

    @Override // com.google.zxing.j
    public byte[] c() {
        int iE = e();
        int iB = b();
        int i10 = this.f130532d;
        if (iE == i10 && iB == this.f130533e) {
            return this.f130531c;
        }
        int i11 = iE * iB;
        byte[] bArr = new byte[i11];
        int i12 = (this.f130535g * i10) + this.f130534f;
        if (iE == i10) {
            System.arraycopy(this.f130531c, i12, bArr, 0, i11);
            return bArr;
        }
        for (int i13 = 0; i13 < iB; i13++) {
            System.arraycopy(this.f130531c, i12, bArr, i13 * iE, iE);
            i12 += this.f130532d;
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
        System.arraycopy(this.f130531c, ((i10 + this.f130535g) * this.f130532d) + this.f130534f, bArr, 0, iE);
        return bArr;
    }

    @Override // com.google.zxing.j
    public boolean g() {
        return true;
    }

    public int k() {
        return b() / 2;
    }

    public int l() {
        return e() / 2;
    }

    public int[] m() {
        int iE = e() / 2;
        int iB = b() / 2;
        int[] iArr = new int[iE * iB];
        byte[] bArr = this.f130531c;
        int i10 = (this.f130535g * this.f130532d) + this.f130534f;
        for (int i11 = 0; i11 < iB; i11++) {
            int i12 = i11 * iE;
            for (int i13 = 0; i13 < iE; i13++) {
                iArr[i12 + i13] = ((bArr[(i13 << 1) + i10] & 255) * 65793) | (-16777216);
            }
            i10 += this.f130532d << 1;
        }
        return iArr;
    }
}
