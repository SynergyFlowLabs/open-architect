package com.rabbitmq.client.impl;

/* JADX INFO: loaded from: classes13.dex */
class h2 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f265209b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f265210a;

    public h2(int i10) {
        super("Unknown channel number " + i10);
        this.f265210a = i10;
    }

    public int a() {
        return this.f265210a;
    }
}
