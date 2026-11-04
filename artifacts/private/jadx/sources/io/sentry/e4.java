package io.sentry;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Double f305385a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Long f305386b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Long f305387c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f305388d;

    public e4(long j10) {
        this.f305388d = j10;
    }

    @Nullable
    public Double a() {
        return this.f305385a;
    }

    public long b() {
        return this.f305388d;
    }

    @Nullable
    public Long c() {
        return this.f305386b;
    }

    @Nullable
    public Long d() {
        return this.f305387c;
    }

    public void e(@Nullable Double d10) {
        this.f305385a = d10;
    }

    public void f(@Nullable Long l10) {
        this.f305386b = l10;
    }

    public void g(@Nullable Long l10) {
        this.f305387c = l10;
    }
}
