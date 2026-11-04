package io.sentry;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class a implements t1 {
    @Override // io.sentry.t1
    @NotNull
    public io.sentry.transport.q a(@NotNull n8 n8Var, @NotNull q4 q4Var) {
        io.sentry.util.y.c(n8Var, "options is required");
        io.sentry.util.y.c(q4Var, "requestDetails is required");
        return new io.sentry.transport.e(n8Var, new io.sentry.transport.a0(n8Var), n8Var.getTransportGate(), q4Var);
    }
}
