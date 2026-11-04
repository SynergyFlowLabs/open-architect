package com.rabbitmq.client;

import java.net.ProtocolException;

/* JADX INFO: loaded from: classes13.dex */
public class t0 extends ProtocolException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f266051c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.rabbitmq.client.impl.m2 f266052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.rabbitmq.client.impl.m2 f266053b;

    public t0(com.rabbitmq.client.impl.m2 m2Var, com.rabbitmq.client.impl.m2 m2Var2) {
        super("Protocol version mismatch: expected " + m2Var + ", got " + m2Var2);
        this.f266052a = m2Var;
        this.f266053b = m2Var2;
    }

    public int a() {
        return this.f266052a.c();
    }

    public int b() {
        return this.f266052a.d();
    }

    public com.rabbitmq.client.impl.m2 c() {
        return this.f266052a;
    }

    public int d() {
        return this.f266053b.c();
    }

    public int e() {
        return this.f266053b.d();
    }

    public com.rabbitmq.client.impl.m2 f() {
        return this.f266053b;
    }
}
