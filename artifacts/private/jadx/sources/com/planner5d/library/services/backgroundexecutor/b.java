package com.planner5d.library.services.backgroundexecutor;

import androidx.annotation.NonNull;
import com.planner5d.library.services.backgroundexecutor.e;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b<T extends e, R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f223977a;

    public b(@NonNull final g sender) {
        this.f223977a = sender;
    }

    protected long a() {
        return this.f223977a.e();
    }

    protected R b(T message, long timeout) throws Throwable {
        BackgroundExecutorMessageContainer backgroundExecutorMessageContainerG = this.f223977a.g(true, message, timeout);
        if (backgroundExecutorMessageContainerG == null) {
            return null;
        }
        return c(backgroundExecutorMessageContainerG.f223967a);
    }

    protected abstract R c(T message) throws Throwable;

    protected void d(T message) {
        this.f223977a.g(false, message, 18000L);
    }
}
