package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
class qa extends pa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final byte[] f108752c;

    qa(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f108752c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.ra
    public byte c(int i10) {
        return this.f108752c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.ra
    byte d(int i10) {
        return this.f108752c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.ra
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra) || i() != ((ra) obj).i()) {
            return false;
        }
        if (i() == 0) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return obj.equals(this);
        }
        qa qaVar = (qa) obj;
        int iP = p();
        int iP2 = qaVar.p();
        if (iP != 0 && iP2 != 0 && iP != iP2) {
            return false;
        }
        int i10 = i();
        if (i10 > qaVar.i()) {
            int i11 = i();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length());
            sb2.append("Length too large: ");
            sb2.append(i10);
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 > qaVar.i()) {
            int i12 = qaVar.i();
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 27 + String.valueOf(i12).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i12);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f108752c;
        byte[] bArr2 = qaVar.f108752c;
        qaVar.s();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            if (bArr[i13] != bArr2[i14]) {
                return false;
            }
            i13++;
            i14++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ra
    public int i() {
        return this.f108752c.length;
    }

    @Override // com.google.android.gms.internal.measurement.ra
    public final ra k(int i10, int i11) {
        int iR = ra.r(0, i11, i());
        return iR == 0 ? ra.f108771b : new ma(this.f108752c, 0, iR);
    }

    @Override // com.google.android.gms.internal.measurement.ra
    final void l(ia iaVar) throws IOException {
        ((ua) iaVar).H(this.f108752c, 0, i());
    }

    @Override // com.google.android.gms.internal.measurement.ra
    protected final int m(int i10, int i11, int i12) {
        return ac.c(i10, this.f108752c, 0, i12);
    }

    protected int s() {
        return 0;
    }
}
