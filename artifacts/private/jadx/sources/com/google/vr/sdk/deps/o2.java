package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
final class o2 extends r2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f129511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f129512f;

    o2(byte[] bArr, int i10, int i11) {
        super(bArr);
        k2.A(i10, i10 + i11, bArr.length);
        this.f129511e = i10;
        this.f129512f = i11;
    }

    @Override // com.google.vr.sdk.deps.r2
    protected final int J() {
        return this.f129511e;
    }

    @Override // com.google.vr.sdk.deps.r2, com.google.vr.sdk.deps.k2
    public final byte c(int i10) {
        int i11 = this.f129512f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f129563d[this.f129511e + i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append("Index < 0: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Index > length: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.vr.sdk.deps.r2, com.google.vr.sdk.deps.k2
    protected final void t(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f129563d, this.f129511e, bArr, 0, i12);
    }

    @Override // com.google.vr.sdk.deps.r2, com.google.vr.sdk.deps.k2
    final byte u(int i10) {
        return this.f129563d[this.f129511e + i10];
    }

    @Override // com.google.vr.sdk.deps.r2, com.google.vr.sdk.deps.k2
    public final int v() {
        return this.f129512f;
    }
}
