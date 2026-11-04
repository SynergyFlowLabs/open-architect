package io.ktor.client.plugins.observer;

import fi.w;
import io.ktor.http.Url;
import io.ktor.http.j1;
import io.ktor.http.v0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ w f294927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.call.b f294928b;

    public e(@NotNull io.ktor.client.call.b call, @NotNull w origin) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f294927a = origin;
        this.f294928b = call;
    }

    @Override // io.ktor.http.f1
    @NotNull
    public v0 O() {
        return this.f294927a.O();
    }

    @Override // fi.w
    @NotNull
    public io.ktor.util.b getAttributes() {
        return this.f294927a.getAttributes();
    }

    @Override // fi.w
    @NotNull
    public io.ktor.http.content.w getContent() {
        return this.f294927a.getContent();
    }

    @Override // fi.w, kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f294927a.getCoroutineContext();
    }

    @Override // fi.w
    @NotNull
    public j1 getMethod() {
        return this.f294927a.getMethod();
    }

    @Override // fi.w
    @NotNull
    public Url getUrl() {
        return this.f294927a.getUrl();
    }

    @Override // fi.w
    @NotNull
    public io.ktor.client.call.b h() {
        return this.f294928b;
    }
}
