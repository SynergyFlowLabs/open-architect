package io.sentry.util.thread;

import io.sentry.protocol.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f306990a = new b();

    public static b g() {
        return f306990a;
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return false;
    }

    @Override // io.sentry.util.thread.a
    @NotNull
    public String b() {
        return "";
    }

    @Override // io.sentry.util.thread.a
    public long c() {
        return 0L;
    }

    @Override // io.sentry.util.thread.a
    public boolean d(long j10) {
        return false;
    }

    @Override // io.sentry.util.thread.a
    public boolean e(@NotNull b0 b0Var) {
        return false;
    }

    @Override // io.sentry.util.thread.a
    public boolean f(@NotNull Thread thread) {
        return false;
    }
}
