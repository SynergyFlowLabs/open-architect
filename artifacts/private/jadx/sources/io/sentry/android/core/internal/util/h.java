package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class h implements io.sentry.util.thread.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f304309a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f304310b = Process.myTid();

    private h() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.g
            @Override // java.lang.Runnable
            public final void run() {
                h.f304310b = Process.myTid();
            }
        });
    }

    public static h h() {
        return f304309a;
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return f(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.a
    @NotNull
    public String b() {
        return a() ? io.sentry.protocol.b0.b.f306153h : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public long c() {
        return Process.myTid();
    }

    @Override // io.sentry.util.thread.a
    public boolean d(long j10) {
        return Looper.getMainLooper().getThread().getId() == j10;
    }

    @Override // io.sentry.util.thread.a
    public boolean e(@NotNull io.sentry.protocol.b0 b0Var) {
        Long l10 = b0Var.l();
        return l10 != null && d(l10.longValue());
    }

    @Override // io.sentry.util.thread.a
    public boolean f(@NotNull Thread thread) {
        return d(thread.getId());
    }
}
