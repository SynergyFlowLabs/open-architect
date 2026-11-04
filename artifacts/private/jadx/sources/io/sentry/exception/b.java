package io.sentry.exception;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f305399b = -8353316997083420940L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f305400a;

    public b(@NotNull String str) {
        this(str, null);
    }

    @NotNull
    public String a() {
        return this.f305400a;
    }

    public b(@NotNull String str, @Nullable Throwable th2) {
        super("sentry-trace header does not conform to expected format: " + str, th2);
        this.f305400a = str;
    }
}
