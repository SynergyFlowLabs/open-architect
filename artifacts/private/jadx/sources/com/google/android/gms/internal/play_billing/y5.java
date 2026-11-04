package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class y5 extends b6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f109446d;

    y5(byte[] bArr, int i10, int i11) {
        super(bArr);
        d6.n(0, i11, bArr.length);
        this.f109446d = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.b6, com.google.android.gms.internal.play_billing.d6
    public final byte c(int i10) {
        int i11 = this.f109446d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f109056c[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.play_billing.b6, com.google.android.gms.internal.play_billing.d6
    final byte d(int i10) {
        return this.f109056c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.b6, com.google.android.gms.internal.play_billing.d6
    public final int i() {
        return this.f109446d;
    }

    @Override // com.google.android.gms.internal.play_billing.b6
    protected final int s() {
        return 0;
    }
}
