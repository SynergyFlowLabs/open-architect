package com.facebook.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class s0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private T f100070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private CountDownLatch f100071b;

    public s0(T t10) {
        this.f100070a = t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void b(s0 this$0, Callable callable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callable, "$callable");
        try {
            this$0.f100070a = (T) callable.call();
            return this$0.f100071b == null ? null : null;
        } finally {
            CountDownLatch countDownLatch = this$0.f100071b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    private final void d() {
        CountDownLatch countDownLatch = this.f100071b;
        if (countDownLatch == null) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
    }

    @Nullable
    public final T c() {
        d();
        return this.f100070a;
    }

    public s0(@NotNull final Callable<T> callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.f100071b = new CountDownLatch(1);
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        com.facebook.g0.y().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.r0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s0.b(this.f100064a, callable);
            }
        }));
    }
}
