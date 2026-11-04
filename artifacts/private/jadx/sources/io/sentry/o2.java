package io.sentry;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class o2 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f305950a;

    public o2(@NotNull n8 n8Var) {
        this.f305950a = n8Var;
    }

    @Override // io.sentry.u1
    public boolean a() {
        io.sentry.internal.a.a().b();
        return w7.e().c(this.f305950a.getFatalLogger());
    }
}
