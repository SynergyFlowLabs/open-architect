package io.sentry.profiling;

import io.sentry.ILogger;
import io.sentry.e1;
import io.sentry.h5;
import io.sentry.l1;
import io.sentry.v0;
import io.sentry.y2;
import io.sentry.y7;
import java.util.Iterator;
import java.util.ServiceLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class c {
    @NotNull
    public static v0 a(ILogger iLogger, String str, int i10, l1 l1Var) {
        try {
            a aVar = (a) c(a.class);
            if (aVar != null) {
                iLogger.c(y7.DEBUG, "Loaded continuous profiler from provider: %s", aVar.getClass().getName());
                return aVar.a(iLogger, str, i10, l1Var);
            }
            iLogger.c(y7.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
            return y2.a();
        } catch (Throwable th2) {
            iLogger.a(y7.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th2);
            return y2.a();
        }
    }

    @Nullable
    public static e1 b() {
        ILogger logger = h5.q().g().b().getLogger();
        try {
            b bVar = (b) c(b.class);
            if (bVar != null) {
                logger.c(y7.DEBUG, "Loaded profile converter from provider: %s", bVar.getClass().getName());
                return bVar.a();
            }
            logger.c(y7.DEBUG, "No profile converter provider found, returning null", new Object[0]);
            return null;
        } catch (Throwable th2) {
            logger.a(y7.ERROR, "Failed to load profile converter provider, returning null", th2);
            return null;
        }
    }

    @Nullable
    private static <T> T c(Class<T> cls) {
        Iterator it = ServiceLoader.load(cls).iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        return null;
    }
}
