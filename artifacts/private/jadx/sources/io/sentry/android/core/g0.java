package io.sentry.android.core;

import android.net.TrafficStats;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class g0 implements io.sentry.o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f304155a = 61441;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g0 f304156b = new g0();

    private g0() {
    }

    public static g0 c() {
        return f304156b;
    }

    @Override // io.sentry.o1
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.o1
    public void b() {
        TrafficStats.setThreadStatsTag(f304155a);
    }
}
