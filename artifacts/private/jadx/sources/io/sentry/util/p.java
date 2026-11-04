package io.sentry.util;

import io.sentry.n8;
import io.sentry.o2;
import io.sentry.x3;
import io.sentry.y7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class p {
    public static boolean a(@Nullable n8 n8Var, @NotNull n8 n8Var2, boolean z10) {
        if (a0.c() && (n8Var2.getVersionDetector() instanceof x3)) {
            n8Var2.setVersionDetector(new o2(n8Var2));
        }
        if (!n8Var2.getVersionDetector().a()) {
            return !z10 || n8Var == null || n8Var2.isForceInit() || n8Var.getInitPriority().ordinal() <= n8Var2.getInitPriority().ordinal();
        }
        n8Var2.getLogger().c(y7.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See " + (a0.a() ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions") + " for more details.");
    }
}
