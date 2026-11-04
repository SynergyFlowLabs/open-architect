package io.sentry;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class z1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Runtime f307152a = Runtime.getRuntime();

    @Override // io.sentry.d1
    public void c() {
    }

    @Override // io.sentry.d1
    public void d(@NotNull e4 e4Var) {
        e4Var.f(Long.valueOf(this.f307152a.totalMemory() - this.f307152a.freeMemory()));
    }
}
