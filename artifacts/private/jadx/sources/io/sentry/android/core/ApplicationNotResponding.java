package io.sentry.android.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f303968b = 252541144579117016L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Thread f303969a;

    ApplicationNotResponding(@Nullable String str, @NotNull Thread thread) {
        super(str);
        Thread thread2 = (Thread) io.sentry.util.y.c(thread, "Thread must be provided.");
        this.f303969a = thread2;
        setStackTrace(thread2.getStackTrace());
    }

    @NotNull
    public Thread a() {
        return this.f303969a;
    }
}
