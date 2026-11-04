package com.google.api.client.testing.util;

import com.google.api.client.util.k0;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class c implements k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f116024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f116025c;

    public final int a() {
        return this.f116024b;
    }

    public final long b() {
        return this.f116025c;
    }

    @Override // com.google.api.client.util.k0
    public void e(long j10) throws InterruptedException {
        this.f116024b++;
        this.f116025c = j10;
    }
}
