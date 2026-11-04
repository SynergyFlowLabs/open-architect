package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public abstract class c1 extends y0 implements x1 {
    protected c1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.y0
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public abstract x1 i1();

    @Override // com.google.common.util.concurrent.y0, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.x1
    public <T> t1<T> submit(Callable<T> task) {
        return i1().submit((Callable) task);
    }

    @Override // com.google.common.util.concurrent.y0, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.x1
    public t1<?> submit(Runnable task) {
        return i1().submit(task);
    }

    @Override // com.google.common.util.concurrent.y0, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.x1
    public <T> t1<T> submit(Runnable task, @d2 T result) {
        return i1().submit(task, (Object) result);
    }
}
