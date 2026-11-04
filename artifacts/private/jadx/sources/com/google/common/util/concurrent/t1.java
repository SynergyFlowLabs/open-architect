package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
@o0
@z7.f("Use the methods in Futures (like immediateFuture) or SettableFuture")
public interface t1<V> extends Future<V> {
    void m0(Runnable listener, Executor executor);
}
