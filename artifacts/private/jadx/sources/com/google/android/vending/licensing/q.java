package com.google.android.vending.licensing;

/* JADX INFO: loaded from: classes4.dex */
public class q implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f115105d = k.f115074c;

    @Override // com.google.android.vending.licensing.k
    public void a(int i10, n nVar) {
        this.f115105d = i10;
    }

    @Override // com.google.android.vending.licensing.k
    public boolean b() {
        return this.f115105d == 256;
    }
}
