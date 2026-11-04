package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class l5 implements SendCachedEnvelopeFireAndForgetIntegration.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SendCachedEnvelopeFireAndForgetIntegration.b f305835a;

    public l5(@NotNull SendCachedEnvelopeFireAndForgetIntegration.b bVar) {
        this.f305835a = (SendCachedEnvelopeFireAndForgetIntegration.b) io.sentry.util.y.c(bVar, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.c
    @Nullable
    public SendCachedEnvelopeFireAndForgetIntegration.a d(@NotNull i1 i1Var, @NotNull n8 n8Var) {
        io.sentry.util.y.c(i1Var, "Scopes are required");
        io.sentry.util.y.c(n8Var, "SentryOptions is required");
        String strA = this.f305835a.a();
        if (strA != null && b(strA, n8Var.getLogger())) {
            return a(new h0(i1Var, n8Var.getSerializer(), n8Var.getLogger(), n8Var.getFlushTimeoutMillis(), n8Var.getMaxQueueSize()), strA, n8Var.getLogger());
        }
        boolean z10 = false;
        n8Var.getLogger().c(y7.ERROR, "No cache dir path is defined in options.", new Object[0]);
        return null;
    }
}
