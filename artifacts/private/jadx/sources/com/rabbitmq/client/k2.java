package com.rabbitmq.client;

/* JADX INFO: loaded from: classes13.dex */
public class k2 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f265953b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f265954a;

    public k2(o0 o0Var) {
        this.f265954a = o0Var;
    }

    public o0 a() {
        return this.f265954a;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ": " + this.f265954a;
    }
}
