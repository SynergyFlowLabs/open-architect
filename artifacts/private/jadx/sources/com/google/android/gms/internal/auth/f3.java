package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class f3 extends h3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f107630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f107631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f107632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f107633f;

    /* synthetic */ f3(byte[] bArr, int i10, int i11, boolean z10, e3 e3Var) {
        super(null);
        this.f107633f = Integer.MAX_VALUE;
        this.f107630c = bArr;
        this.f107631d = 0;
    }

    public final int c(int i10) throws a4 {
        int i11 = this.f107633f;
        this.f107633f = 0;
        int i12 = this.f107631d + this.f107632e;
        this.f107631d = i12;
        if (i12 <= 0) {
            this.f107632e = 0;
            return i11;
        }
        this.f107632e = i12;
        this.f107631d = 0;
        return i11;
    }
}
