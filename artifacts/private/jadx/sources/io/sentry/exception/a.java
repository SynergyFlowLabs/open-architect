package io.sentry.exception;

import io.sentry.protocol.j;
import io.sentry.util.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f305394e = 142345454265713915L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f305395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Throwable f305396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Thread f305397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f305398d;

    public a(@NotNull j jVar, @NotNull Throwable th2, @NotNull Thread thread, boolean z10) {
        this.f305395a = (j) y.c(jVar, "Mechanism is required.");
        this.f305396b = (Throwable) y.c(th2, "Throwable is required.");
        this.f305397c = (Thread) y.c(thread, "Thread is required.");
        this.f305398d = z10;
    }

    @NotNull
    public j a() {
        return this.f305395a;
    }

    @NotNull
    public Thread b() {
        return this.f305397c;
    }

    @NotNull
    public Throwable c() {
        return this.f305396b;
    }

    public boolean d() {
        return this.f305398d;
    }

    public a(@NotNull j jVar, @NotNull Throwable th2, @NotNull Thread thread) {
        this(jVar, th2, thread, false);
    }
}
