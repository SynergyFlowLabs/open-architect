package io.ktor.client.plugins;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fi.y f295263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final io.ktor.client.statement.c f295264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Throwable f295265c;

    public y0(@NotNull fi.y request, @Nullable io.ktor.client.statement.c cVar, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f295263a = request;
        this.f295264b = cVar;
        this.f295265c = th2;
    }

    @Nullable
    public final Throwable a() {
        return this.f295265c;
    }

    @NotNull
    public final fi.y b() {
        return this.f295263a;
    }

    @Nullable
    public final io.ktor.client.statement.c c() {
        return this.f295264b;
    }
}
