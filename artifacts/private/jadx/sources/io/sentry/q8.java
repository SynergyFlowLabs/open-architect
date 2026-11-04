package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class q8 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f306586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f306587b;

    public q8(@Nullable String str, @Nullable String str2) {
        this.f306586a = str;
        this.f306587b = str2;
    }

    @NotNull
    private <T extends z5> T e(@NotNull T t10) {
        if (t10.E().l() == null) {
            t10.E().E(new io.sentry.protocol.x());
        }
        io.sentry.protocol.x xVarL = t10.E().l();
        if (xVarL != null && xVarL.d() == null && xVarL.f() == null) {
            xVarL.g(this.f306587b);
            xVarL.i(this.f306586a);
        }
        return t10;
    }

    @Override // io.sentry.i0
    @NotNull
    public o7 c(@NotNull o7 o7Var, @Nullable n0 n0Var) {
        return (o7) e(o7Var);
    }

    @Override // io.sentry.i0
    @NotNull
    public io.sentry.protocol.c0 d(@NotNull io.sentry.protocol.c0 c0Var, @Nullable n0 n0Var) {
        return (io.sentry.protocol.c0) e(c0Var);
    }

    @Override // io.sentry.i0
    @Nullable
    public Long getOrder() {
        return 2000L;
    }

    public q8() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
