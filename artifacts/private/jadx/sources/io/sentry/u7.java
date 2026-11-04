package io.sentry;

import java.time.Instant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class u7 extends e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Instant f306934a;

    public u7() {
        this(Instant.now());
    }

    @Override // io.sentry.e6
    public long k() {
        return p.n(this.f306934a.getEpochSecond()) + ((long) this.f306934a.getNano());
    }

    public u7(@NotNull Instant instant) {
        this.f306934a = instant;
    }
}
