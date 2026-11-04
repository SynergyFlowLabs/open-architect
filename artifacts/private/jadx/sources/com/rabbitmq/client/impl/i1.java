package com.rabbitmq.client.impl;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i1<T> implements e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final org.slf4j.c f265262e = org.slf4j.e.k(i1.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<T> f265263a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lock f265264b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference<CountDownLatch> f265265c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AtomicBoolean f265266d = new AtomicBoolean(false);

    @Override // com.rabbitmq.client.impl.e0
    public void a() {
        if (!this.f265264b.tryLock()) {
            try {
                f265262e.g("Waiting for token refresh to be finished");
                while (!this.f265266d.get()) {
                    Thread.sleep(10L);
                }
                this.f265265c.get().await();
                f265262e.g("Done waiting for token refresh");
                return;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        org.slf4j.c cVar = f265262e;
        cVar.g("Refreshing token");
        try {
            this.f265265c.set(new CountDownLatch(1));
            this.f265266d.set(true);
            this.f265263a.set(f());
            cVar.g("Token refreshed");
            this.f265265c.get().countDown();
        } finally {
            this.f265265c.get().countDown();
            this.f265266d.set(false);
            this.f265264b.unlock();
        }
    }

    @Override // com.rabbitmq.client.impl.e0
    public String b() {
        if (this.f265263a.get() == null) {
            a();
        }
        return e(this.f265263a.get());
    }

    @Override // com.rabbitmq.client.impl.e0
    public Duration c() {
        if (this.f265263a.get() == null) {
            a();
        }
        return g(this.f265263a.get());
    }

    @Override // com.rabbitmq.client.impl.e0
    public String d() {
        if (this.f265263a.get() == null) {
            a();
        }
        return h(this.f265263a.get());
    }

    protected abstract String e(T t10);

    protected abstract T f();

    protected abstract Duration g(T t10);

    protected abstract String h(T t10);
}
