package io.sentry;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, Long> f306555a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n8 f306556b;

    public q(@NotNull n8 n8Var) {
        this.f306556b = n8Var;
    }

    @Override // io.sentry.i0
    @Nullable
    public o7 c(@NotNull o7 o7Var, @NotNull n0 n0Var) {
        io.sentry.protocol.q qVarG0;
        String strK;
        Long lJ;
        if (io.sentry.util.n.h(n0Var, UncaughtExceptionHandlerIntegration.a.class) && (qVarG0 = o7Var.G0()) != null && (strK = qVarG0.k()) != null && (lJ = qVarG0.j()) != null) {
            Long l10 = this.f306555a.get(strK);
            if (l10 == null || l10.equals(lJ)) {
                this.f306555a.put(strK, lJ);
                return o7Var;
            }
            this.f306556b.getLogger().c(y7.INFO, "Event %s has been dropped due to multi-threaded deduplication", o7Var.I());
            io.sentry.util.n.n(n0Var, io.sentry.hints.h.MULTITHREADED_DEDUPLICATION);
            int i10 = 6 ^ 0;
            return null;
        }
        return o7Var;
    }

    @Override // io.sentry.i0
    @Nullable
    public Long getOrder() {
        return 7000L;
    }
}
