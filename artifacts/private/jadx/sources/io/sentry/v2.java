package io.sentry;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class v2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f306999a;

    v2(@NotNull n8 n8Var) {
        this.f306999a = n8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f306999a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f306999a.getLogger().c(y7.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
            return;
        }
        if (!this.f306999a.isEnableAutoSessionTracking()) {
            this.f306999a.getLogger().c(y7.DEBUG, "Session tracking is disabled, bailing from previous session mover.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = this.f306999a.getEnvelopeDiskCache();
        if (envelopeDiskCache instanceof io.sentry.cache.f) {
            io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
            fVar.K(io.sentry.cache.f.F(cacheDirPath), io.sentry.cache.f.J(cacheDirPath));
            fVar.D();
        }
    }
}
