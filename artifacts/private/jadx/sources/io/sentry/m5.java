package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class m5 implements SendCachedEnvelopeFireAndForgetIntegration.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SendCachedEnvelopeFireAndForgetIntegration.b f305873a;

    public m5(@NotNull SendCachedEnvelopeFireAndForgetIntegration.b bVar) {
        this.f305873a = (SendCachedEnvelopeFireAndForgetIntegration.b) io.sentry.util.y.c(bVar, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.c
    @Nullable
    public SendCachedEnvelopeFireAndForgetIntegration.a d(@NotNull i1 i1Var, @NotNull n8 n8Var) {
        io.sentry.util.y.c(i1Var, "Scopes are required");
        io.sentry.util.y.c(n8Var, "SentryOptions is required");
        String strA = this.f305873a.a();
        if (strA != null && b(strA, n8Var.getLogger())) {
            return a(new d4(i1Var, n8Var.getEnvelopeReader(), n8Var.getSerializer(), n8Var.getLogger(), n8Var.getFlushTimeoutMillis(), n8Var.getMaxQueueSize()), strA, n8Var.getLogger());
        }
        n8Var.getLogger().c(y7.ERROR, "No outbox dir path is defined in options.", new Object[0]);
        return null;
    }
}
