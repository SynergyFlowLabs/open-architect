package com.google.api.client.testing.http;

import com.google.api.client.util.l;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class a implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicLong f115974b;

    public a() {
        this(0L);
    }

    public a a(long j10) {
        this.f115974b.set(j10);
        return this;
    }

    @Override // com.google.api.client.util.l
    public long currentTimeMillis() {
        return this.f115974b.get();
    }

    public a(long j10) {
        this.f115974b = new AtomicLong(j10);
    }
}
