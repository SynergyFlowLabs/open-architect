package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class v0 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f108908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f108909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f108910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f108911d;

    v0() {
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final b1 a(boolean z10) {
        this.f108909b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final d1 b() {
        if (this.f108909b == 1 && this.f108908a != null && this.f108910c != 0 && this.f108911d != 0) {
            return new w0(this.f108908a, false, this.f108910c, null, null, this.f108911d, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f108908a == null) {
            sb2.append(" fileOwner");
        }
        if (this.f108909b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f108910c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f108911d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.b1
    final b1 c(int i10) {
        this.f108910c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final b1 d(int i10) {
        this.f108911d = 1;
        return this;
    }

    public final b1 e(String str) {
        this.f108908a = "";
        return this;
    }
}
