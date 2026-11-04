package io.ktor.client.plugins;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fi.y f295272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f295273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final io.ktor.client.statement.c f295274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Throwable f295275d;

    public z0(@NotNull fi.y request, int i10, @Nullable io.ktor.client.statement.c cVar, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f295272a = request;
        this.f295273b = i10;
        this.f295274c = cVar;
        this.f295275d = th2;
    }

    @Nullable
    public final Throwable a() {
        return this.f295275d;
    }

    @NotNull
    public final fi.y b() {
        return this.f295272a;
    }

    @Nullable
    public final io.ktor.client.statement.c c() {
        return this.f295274c;
    }

    public final int d() {
        return this.f295273b;
    }
}
