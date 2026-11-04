package io.sentry;

import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f306628a = "io.sentry.opentelemetry.OtelSpanFactory";

    @NotNull
    public static q1 a(@NotNull io.sentry.util.u uVar, @NotNull ILogger iLogger) {
        Class<?> clsC;
        if (io.sentry.util.a0.c() && uVar.a(f306628a, iLogger) && (clsC = uVar.c(f306628a, iLogger)) != null) {
            try {
                Object objNewInstance = clsC.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof q1)) {
                    return (q1) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new u();
    }
}
