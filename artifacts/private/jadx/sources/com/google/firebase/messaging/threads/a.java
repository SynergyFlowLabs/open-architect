package com.google.firebase.messaging.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import z7.d;

/* JADX INFO: loaded from: classes5.dex */
public interface a {
    ScheduledExecutorService a(int i10, c cVar);

    ExecutorService b(int i10, ThreadFactory threadFactory, c cVar);

    ExecutorService c(int i10, c cVar);

    ExecutorService d(ThreadFactory threadFactory, c cVar);

    ExecutorService e(c cVar);

    ScheduledExecutorService f(int i10, ThreadFactory threadFactory, c cVar);

    ExecutorService g(c cVar);

    Future<?> h(@d String str, @d String str2, c cVar, Runnable runnable);

    void i(@d String str, @d String str2, c cVar, Runnable runnable);

    ExecutorService j(ThreadFactory threadFactory, c cVar);
}
