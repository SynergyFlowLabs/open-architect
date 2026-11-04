package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum p8 {
    STORAGE(q8.AD_STORAGE, q8.ANALYTICS_STORAGE),
    DMA(q8.AD_USER_DATA);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q8[] f110357a;

    p8(q8... q8VarArr) {
        this.f110357a = q8VarArr;
    }

    public final q8[] k() {
        return this.f110357a;
    }

    final /* synthetic */ q8[] l() {
        return this.f110357a;
    }
}
