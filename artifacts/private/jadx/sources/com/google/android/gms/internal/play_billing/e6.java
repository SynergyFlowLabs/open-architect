package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class e6 extends g6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f109109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f109110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f109111e;

    /* synthetic */ e6(byte[] bArr, int i10, int i11, boolean z10, f6 f6Var) {
        super(null);
        this.f109111e = Integer.MAX_VALUE;
        this.f109109c = 0;
    }

    public final int c(int i10) throws l7 {
        int i11 = this.f109111e;
        this.f109111e = 0;
        int i12 = this.f109109c + this.f109110d;
        this.f109109c = i12;
        if (i12 <= 0) {
            this.f109110d = 0;
            return i11;
        }
        this.f109110d = i12;
        this.f109109c = 0;
        return i11;
    }
}
