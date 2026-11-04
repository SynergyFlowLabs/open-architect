package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes5.dex */
public class u extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f124795b;

    public u(long j10) {
        this("Fetch was throttled.", j10);
    }

    public long b() {
        return this.f124795b;
    }

    public u(String str, long j10) {
        super(str);
        this.f124795b = j10;
    }
}
