package fi;

import io.ktor.http.Url;
import io.ktor.http.j1;
import io.ktor.http.v0;
import io.ktor.utils.io.o0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@o0
public class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.call.b f275279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j1 f275280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Url f275281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.ktor.http.content.w f275282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final v0 f275283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.b f275284f;

    public v(@NotNull io.ktor.client.call.b call, @NotNull z data) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f275279a = call;
        this.f275280b = data.f();
        this.f275281c = data.h();
        this.f275282d = data.b();
        this.f275283e = data.e();
        this.f275284f = data.a();
    }

    @Override // io.ktor.http.f1
    @NotNull
    public v0 O() {
        return this.f275283e;
    }

    @Override // fi.w
    @NotNull
    public io.ktor.util.b getAttributes() {
        return this.f275284f;
    }

    @Override // fi.w
    @NotNull
    public io.ktor.http.content.w getContent() {
        return this.f275282d;
    }

    @Override // fi.w, kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return h().getCoroutineContext();
    }

    @Override // fi.w
    @NotNull
    public j1 getMethod() {
        return this.f275280b;
    }

    @Override // fi.w
    @NotNull
    public Url getUrl() {
        return this.f275281c;
    }

    @Override // fi.w
    @NotNull
    public io.ktor.client.call.b h() {
        return this.f275279a;
    }
}
