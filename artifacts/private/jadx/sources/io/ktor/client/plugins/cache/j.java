package io.ktor.client.plugins.cache;

import fi.w;
import fi.z;
import io.ktor.http.Url;
import io.ktor.http.j1;
import io.ktor.http.v0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
final class j implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j1 f294531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Url f294532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.b f294533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.ktor.http.content.w f294534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final v0 f294535e;

    public j(@NotNull z data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f294531a = data.f();
        this.f294532b = data.h();
        this.f294533c = data.a();
        this.f294534d = data.b();
        this.f294535e = data.e();
    }

    @Override // io.ktor.http.f1
    @NotNull
    public v0 O() {
        return this.f294535e;
    }

    @Override // fi.w
    @NotNull
    public io.ktor.util.b getAttributes() {
        return this.f294533c;
    }

    @Override // fi.w
    @NotNull
    public io.ktor.http.content.w getContent() {
        return this.f294534d;
    }

    @Override // fi.w, kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return w.a.a(this);
    }

    @Override // fi.w
    @NotNull
    public j1 getMethod() {
        return this.f294531a;
    }

    @Override // fi.w
    @NotNull
    public Url getUrl() {
        return this.f294532b;
    }

    @Override // fi.w
    @NotNull
    public io.ktor.client.call.b h() {
        throw new IllegalStateException("This request has no call");
    }
}
