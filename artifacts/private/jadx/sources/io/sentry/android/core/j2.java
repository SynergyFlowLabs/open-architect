package io.sentry.android.core;

import android.util.Log;
import io.sentry.d8;
import io.sentry.h5;
import io.sentry.t5;
import io.sentry.y7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class j2 {
    private static void a(@Nullable String str, @NotNull y7 y7Var, @Nullable String str2) {
        b(str, y7Var, str2, null);
    }

    private static void b(@Nullable String str, @NotNull y7 y7Var, @Nullable String str2, @Nullable Throwable th2) {
        io.sentry.f fVar = new io.sentry.f();
        fVar.T("Logcat");
        fVar.W(str2);
        fVar.V(y7Var);
        if (str != null) {
            fVar.U("tag", str);
        }
        if (th2 != null && th2.getMessage() != null) {
            fVar.U("throwable", th2.getMessage());
        }
        t5.g(fVar);
    }

    private static void c(@Nullable String str, @NotNull y7 y7Var, @Nullable Throwable th2) {
        b(str, y7Var, null, th2);
    }

    private static void d(@NotNull d8 d8Var, @Nullable String str, @Nullable Throwable th2) {
        h5 h5VarQ = h5.q();
        if (h5VarQ.b().getLogs().b()) {
            String message = th2 != null ? th2.getMessage() : null;
            io.sentry.logger.h hVar = new io.sentry.logger.h();
            hVar.g("auto.log.logcat");
            if (th2 != null && message != null) {
                io.sentry.logger.a aVarV0 = h5VarQ.V0();
                if (str != null) {
                    message = str + "\n" + message;
                }
                aVarV0.k(d8Var, hVar, message, new Object[0]);
                return;
            }
            h5VarQ.V0().k(d8Var, hVar, str, new Object[0]);
        }
    }

    public static int e(@Nullable String str, @Nullable String str2) {
        a(str, y7.DEBUG, str2);
        d(d8.DEBUG, str2, null);
        return Log.d(str, str2);
    }

    public static int f(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        b(str, y7.DEBUG, str2, th2);
        d(d8.DEBUG, str2, th2);
        return Log.d(str, str2, th2);
    }

    public static int g(@Nullable String str, @Nullable String str2) {
        a(str, y7.ERROR, str2);
        d(d8.ERROR, str2, null);
        return Log.e(str, str2);
    }

    public static int h(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        b(str, y7.ERROR, str2, th2);
        d(d8.ERROR, str2, th2);
        return Log.e(str, str2, th2);
    }

    public static int i(@Nullable String str, @Nullable String str2) {
        a(str, y7.INFO, str2);
        int i10 = 3 >> 0;
        d(d8.INFO, str2, null);
        return Log.i(str, str2);
    }

    public static int j(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        b(str, y7.INFO, str2, th2);
        d(d8.INFO, str2, th2);
        return Log.i(str, str2, th2);
    }

    public static int k(@Nullable String str, @Nullable String str2) {
        a(str, y7.DEBUG, str2);
        d(d8.TRACE, str2, null);
        return Log.v(str, str2);
    }

    public static int l(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        b(str, y7.DEBUG, str2, th2);
        d(d8.TRACE, str2, th2);
        return Log.v(str, str2, th2);
    }

    public static int m(@Nullable String str, @Nullable String str2) {
        a(str, y7.WARNING, str2);
        d(d8.WARN, str2, null);
        return Log.w(str, str2);
    }

    public static int n(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        b(str, y7.WARNING, str2, th2);
        d(d8.WARN, str2, th2);
        return Log.w(str, str2, th2);
    }

    public static int o(@Nullable String str, @Nullable Throwable th2) {
        c(str, y7.WARNING, th2);
        d(d8.WARN, null, th2);
        return Log.w(str, th2);
    }

    public static int p(@Nullable String str, @Nullable String str2) {
        a(str, y7.ERROR, str2);
        d(d8.FATAL, str2, null);
        return Log.wtf(str, str2);
    }

    public static int q(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        b(str, y7.ERROR, str2, th2);
        d(d8.FATAL, str2, th2);
        return Log.wtf(str, str2, th2);
    }

    public static int r(@Nullable String str, @Nullable Throwable th2) {
        c(str, y7.ERROR, th2);
        d(d8.FATAL, null, th2);
        return Log.wtf(str, th2);
    }
}
