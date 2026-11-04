package com.devtodev.analytics.external.abtest;

/* JADX INFO: loaded from: classes3.dex */
public enum DTDRemoteConfigSource {
    Empty(0),
    Remote(1),
    Defaults(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98016a;

    DTDRemoteConfigSource(int i10) {
        this.f98016a = i10;
    }

    public final int getValue() {
        return this.f98016a;
    }
}
