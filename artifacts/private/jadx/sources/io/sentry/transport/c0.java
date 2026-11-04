package io.sentry.transport;

import io.sentry.g6;
import io.sentry.n0;
import io.sentry.n1;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n1 f306860a;

    public c0(@NotNull n1 n1Var) {
        this.f306860a = (n1) io.sentry.util.y.c(n1Var, "Serializer is required");
    }

    @Override // io.sentry.transport.q
    public void H2(@NotNull g6 g6Var, @NotNull n0 n0Var) throws IOException {
        io.sentry.util.y.c(g6Var, "SentryEnvelope is required");
        try {
            this.f306860a.b(g6Var, System.out);
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.sentry.transport.q
    public void i(boolean z10) {
    }

    @Override // io.sentry.transport.q
    @Nullable
    public a0 i0() {
        return null;
    }

    @Override // io.sentry.transport.q
    public void w(long j10) {
        System.out.println("Flushing");
    }
}
