package com.google.firebase.crashlytics;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h.a f121925a;

    private k(h.a aVar) {
        this.f121925a = aVar;
    }

    @NotNull
    public final h a() {
        h hVarB = this.f121925a.b();
        Intrinsics.checkNotNullExpressionValue(hVarB, "build(...)");
        return hVarB;
    }

    public final void b(@NotNull String key, double d10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f121925a.d(key, d10);
    }

    public final void c(@NotNull String key, float f10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f121925a.e(key, f10);
    }

    public final void d(@NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f121925a.f(key, i10);
    }

    public final void e(@NotNull String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f121925a.g(key, j10);
    }

    public final void f(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f121925a.h(key, value);
    }

    public final void g(@NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f121925a.c(key, z10);
    }

    public k() {
        this(new h.a());
    }
}
