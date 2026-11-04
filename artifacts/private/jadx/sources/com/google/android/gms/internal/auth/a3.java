package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
class a3 extends z2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final byte[] f107554e;

    a3(byte[] bArr) {
        bArr.getClass();
        this.f107554e = bArr;
    }

    @Override // com.google.android.gms.internal.auth.d3
    public byte c(int i10) {
        return this.f107554e[i10];
    }

    @Override // com.google.android.gms.internal.auth.d3
    byte d(int i10) {
        return this.f107554e[i10];
    }

    @Override // com.google.android.gms.internal.auth.d3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d3) || i() != ((d3) obj).i()) {
            return false;
        }
        if (i() == 0) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return obj.equals(this);
        }
        a3 a3Var = (a3) obj;
        int iR = r();
        int iR2 = a3Var.r();
        if (iR != 0 && iR2 != 0 && iR != iR2) {
            return false;
        }
        int i10 = i();
        if (i10 > a3Var.i()) {
            throw new IllegalArgumentException("Length too large: " + i10 + i());
        }
        if (i10 > a3Var.i()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i10 + ", " + a3Var.i());
        }
        byte[] bArr = this.f107554e;
        byte[] bArr2 = a3Var.f107554e;
        a3Var.u();
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

    @Override // com.google.android.gms.internal.auth.d3
    public int i() {
        return this.f107554e.length;
    }

    @Override // com.google.android.gms.internal.auth.d3
    protected final int k(int i10, int i11, int i12) {
        return z3.b(i10, this.f107554e, 0, i12);
    }

    @Override // com.google.android.gms.internal.auth.d3
    public final d3 l(int i10, int i11) {
        int iP = d3.p(0, i11, i());
        return iP == 0 ? d3.f107612b : new w2(this.f107554e, 0, iP);
    }

    @Override // com.google.android.gms.internal.auth.d3
    protected final String m(Charset charset) {
        return new String(this.f107554e, 0, i(), charset);
    }

    @Override // com.google.android.gms.internal.auth.d3
    public final boolean n() {
        return o6.c(this.f107554e, 0, i());
    }

    protected int u() {
        return 0;
    }
}
