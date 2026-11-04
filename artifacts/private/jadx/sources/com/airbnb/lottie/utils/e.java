package com.airbnb.lottie.utils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class e implements ThreadFactory {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f88833d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadGroup f88834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f88835b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f88836c;

    public e() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f88834a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f88836c = "lottie-" + f88833d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f88834a, runnable, this.f88836c + this.f88835b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
