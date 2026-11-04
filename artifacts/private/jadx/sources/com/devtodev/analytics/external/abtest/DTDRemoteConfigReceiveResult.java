package com.devtodev.analytics.external.abtest;

/* JADX INFO: loaded from: classes3.dex */
public enum DTDRemoteConfigReceiveResult {
    Failure(0),
    Success(1),
    Empty(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98014a;

    DTDRemoteConfigReceiveResult(int i10) {
        this.f98014a = i10;
    }

    public final int getValue() {
        return this.f98014a;
    }
}
