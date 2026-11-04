package com.rabbitmq.client.impl.nio;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<b0> f265556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f265557b;

    public a(BlockingQueue<b0> blockingQueue, int i10) {
        this.f265556a = blockingQueue;
        this.f265557b = i10;
    }

    @Override // com.rabbitmq.client.impl.nio.s
    public boolean a(b0 b0Var) throws InterruptedException {
        return this.f265556a.offer(b0Var, this.f265557b, TimeUnit.MILLISECONDS);
    }

    @Override // com.rabbitmq.client.impl.nio.s
    public boolean isEmpty() {
        return this.f265556a.isEmpty();
    }

    @Override // com.rabbitmq.client.impl.nio.s
    public b0 poll() {
        return this.f265556a.poll();
    }

    @Override // com.rabbitmq.client.impl.nio.s
    public int size() {
        return this.f265556a.size();
    }
}
