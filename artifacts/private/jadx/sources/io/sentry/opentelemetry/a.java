package io.sentry.opentelemetry;

import io.sentry.c3;
import io.sentry.h8;
import io.sentry.n8;
import io.sentry.util.a0;
import io.sentry.util.g0;
import io.sentry.util.u;
import io.sentry.y7;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class a {
    @lm.a.c
    public static void a(@NotNull n8 n8Var) {
        if (a0.c()) {
            Iterator<String> it = b(n8Var).iterator();
            while (it.hasNext()) {
                n8Var.addIgnoredSpanOrigin(it.next());
            }
        }
    }

    @NotNull
    private static List<String> b(@NotNull n8 n8Var) {
        h8 openTelemetryMode = n8Var.getOpenTelemetryMode();
        return h8.OFF.equals(openTelemetryMode) ? Collections.EMPTY_LIST : g0.a(openTelemetryMode);
    }

    @lm.a.c
    public static void c(@NotNull n8 n8Var, @NotNull u uVar) {
        if (a0.c()) {
            if (h8.AUTO.equals(n8Var.getOpenTelemetryMode())) {
                if (uVar.a("io.sentry.opentelemetry.agent.AgentMarker", c3.e())) {
                    n8Var.getLogger().c(y7.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    n8Var.setOpenTelemetryMode(h8.AGENT);
                } else if (uVar.a("io.sentry.opentelemetry.agent.AgentlessMarker", c3.e())) {
                    n8Var.getLogger().c(y7.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    n8Var.setOpenTelemetryMode(h8.AGENTLESS);
                } else if (uVar.a("io.sentry.opentelemetry.agent.AgentlessSpringMarker", c3.e())) {
                    n8Var.getLogger().c(y7.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    n8Var.setOpenTelemetryMode(h8.AGENTLESS_SPRING);
                }
            }
        }
    }
}
