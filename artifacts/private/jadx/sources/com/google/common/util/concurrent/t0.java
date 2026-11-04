package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public final class t0 implements z2 {
    @Override // com.google.common.util.concurrent.z2
    public void a(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) {
        d(runnable, timeoutDuration, timeoutUnit);
    }

    @Override // com.google.common.util.concurrent.z2
    @d2
    @z7.a
    public <T> T b(Callable<T> callable, long j10, TimeUnit timeUnit) throws ExecutionException {
        return (T) c(callable, j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.z2
    @d2
    @z7.a
    public <T> T c(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit) throws ExecutionException {
        com.google.common.base.j0.E(callable);
        com.google.common.base.j0.E(timeoutUnit);
        try {
            return callable.call();
        } catch (Error e10) {
            throw new p0(e10);
        } catch (RuntimeException e11) {
            throw new d3(e11);
        } catch (Exception e12) {
            f2.b(e12);
            throw new ExecutionException(e12);
        }
    }

    @Override // com.google.common.util.concurrent.z2
    public void d(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) {
        com.google.common.base.j0.E(runnable);
        com.google.common.base.j0.E(timeoutUnit);
        try {
            runnable.run();
        } catch (Error e10) {
            throw new p0(e10);
        } catch (Exception e11) {
            throw new d3(e11);
        }
    }

    @Override // com.google.common.util.concurrent.z2
    @z7.a
    public <T> T e(T target, Class<T> interfaceType, long timeoutDuration, TimeUnit timeoutUnit) {
        com.google.common.base.j0.E(target);
        com.google.common.base.j0.E(interfaceType);
        com.google.common.base.j0.E(timeoutUnit);
        return target;
    }
}
