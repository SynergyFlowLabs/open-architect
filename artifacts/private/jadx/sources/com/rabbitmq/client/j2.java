package com.rabbitmq.client;

/* JADX INFO: loaded from: classes13.dex */
public class j2 extends RuntimeException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f265949c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.rabbitmq.client.impl.s0 f265950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f265951b;

    public j2(com.rabbitmq.client.impl.s0 s0Var, int i10) {
        super("Received frame: " + s0Var + ", expected type " + i10);
        this.f265950a = s0Var;
        this.f265951b = i10;
    }

    public static long c() {
        return 1L;
    }

    public int a() {
        return this.f265951b;
    }

    public com.rabbitmq.client.impl.s0 b() {
        return this.f265950a;
    }
}
