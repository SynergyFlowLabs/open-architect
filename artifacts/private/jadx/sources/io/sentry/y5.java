package io.sentry;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class y5 implements f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f6 f307142a;

    public y5() {
        if (b()) {
            this.f307142a = new v7();
        } else {
            this.f307142a = new g8();
        }
    }

    private static boolean b() {
        return io.sentry.util.a0.c() && io.sentry.util.a0.b();
    }

    @Override // io.sentry.f6
    @NotNull
    public e6 a() {
        return this.f307142a.a();
    }
}
