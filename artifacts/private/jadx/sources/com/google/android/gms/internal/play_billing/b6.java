package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
class b6 extends a6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final byte[] f109056c;

    b6(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f109056c = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.d6
    public byte c(int i10) {
        return this.f109056c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.d6
    byte d(int i10) {
        return this.f109056c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.d6
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d6) || i() != ((d6) obj).i()) {
            return false;
        }
        if (i() == 0) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return obj.equals(this);
        }
        b6 b6Var = (b6) obj;
        int iP = p();
        int iP2 = b6Var.p();
        if (iP != 0 && iP2 != 0 && iP != iP2) {
            return false;
        }
        int i10 = i();
        if (i10 > b6Var.i()) {
            throw new IllegalArgumentException("Length too large: " + i10 + i());
        }
        if (i10 > b6Var.i()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i10 + ", " + b6Var.i());
        }
        byte[] bArr = this.f109056c;
        byte[] bArr2 = b6Var.f109056c;
        b6Var.s();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            if (bArr[i11] != bArr2[i12]) {
                return false;
            }
            i11++;
            i12++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.d6
    public int i() {
        return this.f109056c.length;
    }

    @Override // com.google.android.gms.internal.play_billing.d6
    protected final int k(int i10, int i11, int i12) {
        return j7.b(i10, this.f109056c, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.d6
    public final d6 l(int i10, int i11) {
        int iN = d6.n(0, i11, i());
        return iN == 0 ? d6.f109102b : new y5(this.f109056c, 0, iN);
    }

    @Override // com.google.android.gms.internal.play_billing.d6
    final void m(v5 v5Var) throws IOException {
        ((h6) v5Var).C(this.f109056c, 0, i());
    }

    protected int s() {
        return 0;
    }
}
