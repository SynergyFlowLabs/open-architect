package com.google.common.util.concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.d
@o0
abstract class x0 implements Condition {
    x0() {
    }

    abstract Condition a();

    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
        a().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long nanosTimeout) throws InterruptedException {
        return a().awaitNanos(nanosTimeout);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        a().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date deadline) throws InterruptedException {
        return a().awaitUntil(deadline);
    }

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        a().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        a().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long time, TimeUnit unit) throws InterruptedException {
        return a().await(time, unit);
    }
}
