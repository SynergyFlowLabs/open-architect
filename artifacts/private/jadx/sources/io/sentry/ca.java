package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class ca implements ILogger {
    @NotNull
    private String e(@NotNull Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // io.sentry.ILogger
    public void a(@NotNull y7 y7Var, @NotNull String str, @Nullable Throwable th2) {
        if (th2 == null) {
            c(y7Var, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", y7Var, String.format(str, th2.toString()), e(th2)));
        }
    }

    @Override // io.sentry.ILogger
    public void b(@NotNull y7 y7Var, @Nullable Throwable th2, @NotNull String str, @Nullable Object... objArr) {
        if (th2 == null) {
            c(y7Var, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", y7Var, String.format(str, objArr), th2.toString(), e(th2)));
        }
    }

    @Override // io.sentry.ILogger
    public void c(@NotNull y7 y7Var, @NotNull String str, @Nullable Object... objArr) {
        System.out.println(String.format("%s: %s", y7Var, String.format(str, objArr)));
    }

    @Override // io.sentry.ILogger
    public boolean d(@Nullable y7 y7Var) {
        return true;
    }
}
