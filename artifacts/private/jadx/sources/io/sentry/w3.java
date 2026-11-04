package io.sentry;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class w3 implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w3 f307100a = new w3();

    private w3() {
    }

    public static w3 b() {
        return f307100a;
    }

    @Override // io.sentry.t1
    @NotNull
    public io.sentry.transport.q a(@NotNull n8 n8Var, @NotNull q4 q4Var) {
        return io.sentry.transport.t.a();
    }
}
