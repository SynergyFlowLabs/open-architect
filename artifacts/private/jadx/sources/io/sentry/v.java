package io.sentry;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class v implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f306998a;

    public v(@NotNull n8 n8Var) {
        this.f306998a = n8Var;
    }

    @Override // io.sentry.u1
    public boolean a() {
        return w7.e().c(this.f306998a.getFatalLogger());
    }
}
