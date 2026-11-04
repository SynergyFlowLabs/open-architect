package io.ktor.client.plugins;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fi.y f294384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final io.ktor.client.statement.c f294385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Throwable f294386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f294387d;

    public a1(@NotNull fi.y request, @Nullable io.ktor.client.statement.c cVar, @Nullable Throwable th2, int i10) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f294384a = request;
        this.f294385b = cVar;
        this.f294386c = th2;
        this.f294387d = i10;
    }

    @Nullable
    public final Throwable a() {
        return this.f294386c;
    }

    @NotNull
    public final fi.y b() {
        return this.f294384a;
    }

    @Nullable
    public final io.ktor.client.statement.c c() {
        return this.f294385b;
    }

    public final int d() {
        return this.f294387d;
    }
}
