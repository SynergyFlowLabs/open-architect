package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class w2 extends a3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f107864f;

    w2(byte[] bArr, int i10, int i11) {
        super(bArr);
        d3.p(0, i11, bArr.length);
        this.f107864f = i11;
    }

    @Override // com.google.android.gms.internal.auth.a3, com.google.android.gms.internal.auth.d3
    public final byte c(int i10) {
        int i11 = this.f107864f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f107554e[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.auth.a3, com.google.android.gms.internal.auth.d3
    final byte d(int i10) {
        return this.f107554e[i10];
    }

    @Override // com.google.android.gms.internal.auth.a3, com.google.android.gms.internal.auth.d3
    public final int i() {
        return this.f107864f;
    }

    @Override // com.google.android.gms.internal.auth.a3
    protected final int u() {
        return 0;
    }
}
