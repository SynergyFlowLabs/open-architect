package io.sentry.transport;

import io.sentry.g6;
import io.sentry.n0;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class t implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final t f306895a = new t();

    private t() {
    }

    @NotNull
    public static t a() {
        return f306895a;
    }

    @Override // io.sentry.transport.q
    public void H2(@NotNull g6 g6Var, @NotNull n0 n0Var) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // io.sentry.transport.q
    public void i(boolean z10) throws IOException {
    }

    @Override // io.sentry.transport.q
    @Nullable
    public a0 i0() {
        return null;
    }

    @Override // io.sentry.transport.q
    public void w(long j10) {
    }
}
