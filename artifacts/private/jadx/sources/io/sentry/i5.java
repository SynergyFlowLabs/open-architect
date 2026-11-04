package io.sentry;

import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f305549a = "io.sentry.opentelemetry.OtelContextScopesStorage";

    @NotNull
    public static j1 a(@NotNull io.sentry.util.u uVar, @NotNull ILogger iLogger) {
        j1 j1VarB = b(uVar, iLogger);
        j1VarB.r();
        return j1VarB;
    }

    @NotNull
    private static j1 b(@NotNull io.sentry.util.u uVar, @NotNull ILogger iLogger) {
        Class<?> clsC;
        if (io.sentry.util.a0.c() && uVar.a(f305549a, iLogger) && (clsC = uVar.c(f305549a, iLogger)) != null) {
            try {
                Object objNewInstance = clsC.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof j1)) {
                    return (j1) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new t();
    }
}
