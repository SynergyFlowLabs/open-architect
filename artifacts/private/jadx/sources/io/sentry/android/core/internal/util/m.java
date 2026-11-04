package io.sentry.android.core.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f304317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.transport.p f304318b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f304320d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f304319c = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicLong f304321e = new AtomicLong(0);

    public m(@NotNull io.sentry.transport.p pVar, long j10, int i10) {
        this.f304318b = pVar;
        this.f304317a = j10;
        this.f304320d = i10 <= 0 ? 1 : i10;
    }

    public boolean a() {
        long jA = this.f304318b.a();
        if (this.f304321e.get() == 0 || this.f304321e.get() + this.f304317a <= jA) {
            this.f304319c.set(0);
            this.f304321e.set(jA);
            return false;
        }
        if (this.f304319c.incrementAndGet() < this.f304320d) {
            return false;
        }
        this.f304319c.set(0);
        return true;
    }
}
