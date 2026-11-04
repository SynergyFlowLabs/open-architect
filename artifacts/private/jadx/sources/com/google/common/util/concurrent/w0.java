package com.google.common.util.concurrent;

import com.google.common.collect.n5;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public abstract class w0<E> extends n5<E> implements BlockingQueue<E> {
    protected w0() {
    }

    @Override // java.util.concurrent.BlockingQueue
    @z7.a
    public int drainTo(Collection<? super E> c10, int maxElements) {
        return L0().drainTo(c10, maxElements);
    }

    @Override // java.util.concurrent.BlockingQueue
    @z7.a
    public boolean offer(E e10, long timeout, TimeUnit unit) throws InterruptedException {
        return L0().offer(e10, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingQueue
    @z7.a
    @fj.a
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        return L0().poll(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e10) throws InterruptedException {
        L0().put(e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.n5
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BlockingQueue<E> i1();

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return L0().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    @z7.a
    public E take() throws InterruptedException {
        return L0().take();
    }

    @Override // java.util.concurrent.BlockingQueue
    @z7.a
    public int drainTo(Collection<? super E> c10) {
        return L0().drainTo(c10);
    }
}
