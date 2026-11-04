package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f304570a;

    v1() {
        this(Looper.getMainLooper());
    }

    @NotNull
    public Thread a() {
        return this.f304570a.getLooper().getThread();
    }

    public void b(@NotNull Runnable runnable) {
        this.f304570a.post(runnable);
    }

    v1(@NotNull Looper looper) {
        this.f304570a = new Handler(looper);
    }
}
