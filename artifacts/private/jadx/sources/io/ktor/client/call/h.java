package io.ktor.client.call;

import fi.w;
import io.ktor.http.Url;
import io.ktor.http.j1;
import io.ktor.http.v0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ w f294263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f294264b;

    public h(@NotNull g call, @NotNull w origin) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f294263a = origin;
        this.f294264b = call;
    }

    @Override // io.ktor.http.f1
    @NotNull
    public v0 O() {
        return this.f294263a.O();
    }

    @Override // fi.w
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g h() {
        return this.f294264b;
    }

    @Override // fi.w
    @NotNull
    public io.ktor.util.b getAttributes() {
        return this.f294263a.getAttributes();
    }

    @Override // fi.w
    @NotNull
    public io.ktor.http.content.w getContent() {
        return this.f294263a.getContent();
    }

    @Override // fi.w, kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f294263a.getCoroutineContext();
    }

    @Override // fi.w
    @NotNull
    public j1 getMethod() {
        return this.f294263a.getMethod();
    }

    @Override // fi.w
    @NotNull
    public Url getUrl() {
        return this.f294263a.getUrl();
    }
}
