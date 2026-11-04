package com.google.zxing;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f130492c;

    public i(j jVar) {
        super(jVar.e(), jVar.b());
        this.f130492c = jVar;
    }

    @Override // com.google.zxing.j
    public j a(int i10, int i11, int i12, int i13) {
        return new i(this.f130492c.a(i10, i11, i12, i13));
    }

    @Override // com.google.zxing.j
    public byte[] c() {
        byte[] bArrC = this.f130492c.c();
        int iE = e() * b();
        byte[] bArr = new byte[iE];
        for (int i10 = 0; i10 < iE; i10++) {
            bArr[i10] = (byte) (255 - (bArrC[i10] & 255));
        }
        return bArr;
    }

    @Override // com.google.zxing.j
    public byte[] d(int i10, byte[] bArr) {
        byte[] bArrD = this.f130492c.d(i10, bArr);
        int iE = e();
        for (int i11 = 0; i11 < iE; i11++) {
            bArrD[i11] = (byte) (255 - (bArrD[i11] & 255));
        }
        return bArrD;
    }

    @Override // com.google.zxing.j
    public j f() {
        return this.f130492c;
    }

    @Override // com.google.zxing.j
    public boolean g() {
        return this.f130492c.g();
    }

    @Override // com.google.zxing.j
    public boolean h() {
        return this.f130492c.h();
    }

    @Override // com.google.zxing.j
    public j i() {
        return new i(this.f130492c.i());
    }

    @Override // com.google.zxing.j
    public j j() {
        return new i(this.f130492c.j());
    }
}
