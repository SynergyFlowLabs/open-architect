package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@z7.f("Use FakeTimeLimiter")
@o0
public interface z2 {
    void a(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) throws TimeoutException;

    @d2
    @z7.a
    <T> T b(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit) throws ExecutionException, TimeoutException;

    @d2
    @z7.a
    <T> T c(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit) throws ExecutionException, InterruptedException, TimeoutException;

    void d(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) throws InterruptedException, TimeoutException;

    <T> T e(T target, Class<T> interfaceType, long timeoutDuration, TimeUnit timeoutUnit);
}
