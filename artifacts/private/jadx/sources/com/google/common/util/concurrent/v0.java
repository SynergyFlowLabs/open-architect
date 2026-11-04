package com.google.common.util.concurrent;

import com.google.common.collect.x4;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public abstract class v0<E> extends x4<E> implements BlockingDeque<E> {
    protected v0() {
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> c10) {
        return L0().drainTo(c10);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e10, long timeout, TimeUnit unit) throws InterruptedException {
        return L0().offer(e10, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e10, long timeout, TimeUnit unit) throws InterruptedException {
        return L0().offerFirst(e10, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e10, long timeout, TimeUnit unit) throws InterruptedException {
        return L0().offerLast(e10, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    @fj.a
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        return L0().poll(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @fj.a
    public E pollFirst(long timeout, TimeUnit unit) throws InterruptedException {
        return L0().pollFirst(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @fj.a
    public E pollLast(long timeout, TimeUnit unit) throws InterruptedException {
        return L0().pollLast(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e10) throws InterruptedException {
        L0().put(e10);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e10) throws InterruptedException {
        L0().putFirst(e10);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e10) throws InterruptedException {
        L0().putLast(e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.x4
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BlockingDeque<E> i1();

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return L0().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return L0().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws InterruptedException {
        return L0().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws InterruptedException {
        return L0().takeLast();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> c10, int maxElements) {
        return L0().drainTo(c10, maxElements);
    }
}
