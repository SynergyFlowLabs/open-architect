package io.sentry.android.core;

import android.util.Log;
import io.sentry.ILogger;
import io.sentry.y7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class x implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f304616a;

    public x() {
        this("Sentry");
    }

    private int e(@NotNull y7 y7Var) {
        return 7;
    }

    @Override // io.sentry.ILogger
    public void a(@NotNull y7 y7Var, @NotNull String str, @Nullable Throwable th2) {
        Log.wtf(this.f304616a, str, th2);
    }

    @Override // io.sentry.ILogger
    public void b(@NotNull y7 y7Var, @Nullable Throwable th2, @NotNull String str, @Nullable Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            a(y7Var, str, th2);
        } else {
            a(y7Var, String.format(str, objArr), th2);
        }
    }

    @Override // io.sentry.ILogger
    public void c(@NotNull y7 y7Var, @NotNull String str, @Nullable Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(e(y7Var), this.f304616a, str);
        } else {
            Log.println(e(y7Var), this.f304616a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean d(@Nullable y7 y7Var) {
        return true;
    }

    public x(@NotNull String str) {
        this.f304616a = str;
    }
}
