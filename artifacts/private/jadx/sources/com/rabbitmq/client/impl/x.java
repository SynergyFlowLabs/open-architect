package com.rabbitmq.client.impl;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes13.dex */
public class x implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.rabbitmq.client.o0 f265887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CompletableFuture<com.rabbitmq.client.m> f265888b;

    public x(com.rabbitmq.client.o0 o0Var, CompletableFuture<com.rabbitmq.client.m> completableFuture) {
        this.f265887a = o0Var;
        this.f265888b = completableFuture;
    }

    @Override // com.rabbitmq.client.impl.k1
    public boolean a(e eVar) {
        return d.a.f(this.f265887a, eVar.getMethod());
    }

    @Override // com.rabbitmq.client.impl.k1
    public void b(com.rabbitmq.client.l1 l1Var) {
        this.f265888b.completeExceptionally(l1Var);
    }

    @Override // com.rabbitmq.client.impl.k1
    public void c(e eVar) {
        this.f265888b.complete(eVar);
    }
}
