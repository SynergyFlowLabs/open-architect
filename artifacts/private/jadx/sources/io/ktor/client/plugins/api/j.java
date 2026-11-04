package io.ktor.client.plugins.api;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a<T> f294400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f294401b;

    public j(@NotNull a<T> hook, T t10) {
        Intrinsics.checkNotNullParameter(hook, "hook");
        this.f294400a = hook;
        this.f294401b = t10;
    }

    public final void a(@NotNull io.ktor.client.c client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f294400a.a(client, this.f294401b);
    }
}
