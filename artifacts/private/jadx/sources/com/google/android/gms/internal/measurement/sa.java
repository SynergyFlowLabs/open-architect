package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class sa extends ta {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f108800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f108801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f108802e;

    /* synthetic */ sa(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.f108802e = Integer.MAX_VALUE;
        this.f108800c = 0;
    }

    public final int c(int i10) throws cc {
        int i11 = this.f108802e;
        this.f108802e = 0;
        int i12 = this.f108800c + this.f108801d;
        this.f108800c = i12;
        if (i12 <= 0) {
            this.f108801d = 0;
            return i11;
        }
        this.f108801d = i12;
        this.f108800c = 0;
        return i11;
    }
}
