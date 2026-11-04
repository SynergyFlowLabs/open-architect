package io.ktor.client.utils;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.statement.c f295418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Throwable f295419b;

    public n(@NotNull io.ktor.client.statement.c response, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f295418a = response;
        this.f295419b = cause;
    }

    @NotNull
    public final Throwable a() {
        return this.f295419b;
    }

    @NotNull
    public final io.ktor.client.statement.c b() {
        return this.f295418a;
    }
}
