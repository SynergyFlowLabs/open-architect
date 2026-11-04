package io.sentry.util.thread;

import io.sentry.protocol.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f306991a = Thread.currentThread().getId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f306992b = new c();

    private c() {
    }

    public static c g() {
        return f306992b;
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return f(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.a
    @NotNull
    public String b() {
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public long c() {
        return Thread.currentThread().getId();
    }

    @Override // io.sentry.util.thread.a
    public boolean d(long j10) {
        return f306991a == j10;
    }

    @Override // io.sentry.util.thread.a
    public boolean e(@NotNull b0 b0Var) {
        Long l10 = b0Var.l();
        if (l10 == null || !d(l10.longValue())) {
            return false;
        }
        int i10 = 3 | 1;
        return true;
    }

    @Override // io.sentry.util.thread.a
    public boolean f(@NotNull Thread thread) {
        return d(thread.getId());
    }
}
