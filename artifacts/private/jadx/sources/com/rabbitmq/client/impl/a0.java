package com.rabbitmq.client.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes13.dex */
public final class a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f265115e = 16;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f265116f = Runtime.getRuntime().availableProcessors() * 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f265117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f265118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p2<com.rabbitmq.client.k, Runnable> f265119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f265120d;

    private final class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList(16);
            try {
                com.rabbitmq.client.k kVar = (com.rabbitmq.client.k) a0.this.f265119c.o(arrayList, 16);
                if (kVar == null) {
                    return;
                }
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    if (a0.this.f265119c.f(kVar)) {
                        a0.this.f265117a.execute(a0.this.new b());
                    }
                } catch (Throwable th2) {
                    if (a0.this.f265119c.f(kVar)) {
                        a0.this.f265117a.execute(a0.this.new b());
                    }
                    throw th2;
                }
            } catch (RuntimeException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public a0(ExecutorService executorService, ThreadFactory threadFactory, int i10, int i11) {
        this.f265118b = executorService == null;
        this.f265117a = executorService == null ? Executors.newFixedThreadPool(f265116f, threadFactory) : executorService;
        this.f265119c = new p2<>(i10);
        this.f265120d = i11;
    }

    public void c(com.rabbitmq.client.k kVar, Runnable runnable) {
        if (this.f265119c.c(kVar, runnable)) {
            this.f265117a.execute(new b());
        }
    }

    public int d() {
        return this.f265120d;
    }

    public void e(com.rabbitmq.client.k kVar) {
        this.f265119c.q(kVar);
    }

    public void f(com.rabbitmq.client.k kVar, boolean z10) {
        if (z10) {
            this.f265119c.s(kVar);
        } else {
            this.f265119c.m(kVar);
        }
    }

    public void g() {
        this.f265119c.t();
        if (this.f265118b) {
            this.f265117a.shutdown();
        }
    }

    public void h(com.rabbitmq.client.k kVar) {
        this.f265119c.u(kVar);
    }

    public boolean i() {
        return this.f265118b;
    }

    public a0(ExecutorService executorService, ThreadFactory threadFactory, int i10) {
        this(executorService, threadFactory, -1, i10);
    }
}
