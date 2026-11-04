package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.n8;
import io.sentry.y7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class u {
    public boolean a(@NotNull String str, @Nullable ILogger iLogger) {
        return c(str, iLogger) != null;
    }

    public boolean b(@NotNull String str, @Nullable n8 n8Var) {
        return a(str, n8Var != null ? n8Var.getLogger() : null);
    }

    @Nullable
    public Class<?> c(@NotNull String str, @Nullable ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.c(y7.INFO, "Class not available: " + str, new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e10) {
            if (iLogger == null) {
                return null;
            }
            iLogger.a(y7.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e10);
            return null;
        } catch (Throwable th2) {
            if (iLogger == null) {
                return null;
            }
            iLogger.a(y7.ERROR, "Failed to initialize " + str, th2);
            return null;
        }
    }
}
