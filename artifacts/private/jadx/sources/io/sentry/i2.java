package io.sentry;

import java.io.IOException;
import java.io.Writer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class i2 implements z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.vendor.gson.stream.d f305545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h2 f305546b;

    public i2(@NotNull Writer writer, int i10) {
        this.f305545a = new io.sentry.vendor.gson.stream.d(writer);
        this.f305546b = new h2(i10);
    }

    @Override // io.sentry.z3
    public void C1(boolean z10) {
        this.f305545a.C1(z10);
    }

    @Override // io.sentry.z3
    @Nullable
    public String a() {
        return this.f305545a.h();
    }

    @Override // io.sentry.z3
    public z3 g(@Nullable String str) throws IOException {
        this.f305545a.o(str);
        return this;
    }

    @Override // io.sentry.z3
    public void h(@Nullable String str) {
        this.f305545a.N(str);
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public i2 J0() throws IOException {
        this.f305545a.c();
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public i2 m1() throws IOException {
        this.f305545a.d();
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public i2 F0() throws IOException {
        this.f305545a.f();
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public i2 F1() throws IOException {
        this.f305545a.g();
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public i2 f(@NotNull String str) throws IOException {
        this.f305545a.q(str);
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public i2 l() throws IOException {
        this.f305545a.t();
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public i2 d(double d10) throws IOException {
        this.f305545a.X(d10);
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public i2 c(long j10) throws IOException {
        this.f305545a.Y(j10);
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public i2 j(@NotNull ILogger iLogger, @Nullable Object obj) throws IOException {
        this.f305546b.a(this, iLogger, obj);
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public i2 k(@Nullable Boolean bool) throws IOException {
        this.f305545a.d0(bool);
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public i2 i(@Nullable Number number) throws IOException {
        this.f305545a.f0(number);
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public i2 b(@Nullable String str) throws IOException {
        this.f305545a.g0(str);
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public i2 e(boolean z10) throws IOException {
        this.f305545a.j0(z10);
        return this;
    }
}
