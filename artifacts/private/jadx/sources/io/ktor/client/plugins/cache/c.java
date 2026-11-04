package io.ktor.client.plugins.cache;

import io.ktor.http.v0;
import io.ktor.http.w0;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpCacheEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCacheEntry.kt\nio/ktor/client/plugins/cache/HttpCacheEntry\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,146:1\n30#2:147\n*S KotlinDebug\n*F\n+ 1 HttpCacheEntry.kt\nio/ktor/client/plugins/cache/HttpCacheEntry\n*L\n33#1:147\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final GMTDate f294513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f294514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.statement.c f294515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final byte[] f294516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final v0 f294517e;

    public c(@NotNull GMTDate expires, @NotNull Map<String, String> varyKeys, @NotNull io.ktor.client.statement.c response, @NotNull byte[] body) {
        Intrinsics.checkNotNullParameter(expires, "expires");
        Intrinsics.checkNotNullParameter(varyKeys, "varyKeys");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f294513a = expires;
        this.f294514b = varyKeys;
        this.f294515c = response;
        this.f294516d = body;
        v0.a aVar = v0.f296123a;
        w0 w0Var = new w0(0, 1, null);
        w0Var.j(response.O());
        this.f294517e = w0Var.build();
    }

    @NotNull
    public final byte[] a() {
        return this.f294516d;
    }

    @NotNull
    public final GMTDate b() {
        return this.f294513a;
    }

    @NotNull
    public final io.ktor.client.statement.c c() {
        return this.f294515c;
    }

    @NotNull
    public final v0 d() {
        return this.f294517e;
    }

    @NotNull
    public final Map<String, String> e() {
        return this.f294514b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return Intrinsics.areEqual(this.f294514b, ((c) obj).f294514b);
    }

    @NotNull
    public final io.ktor.client.statement.c f() {
        return new io.ktor.client.call.g(this.f294515c.h().i(), this.f294515c.h().j(), this.f294515c, this.f294516d).k();
    }

    public int hashCode() {
        return this.f294514b.hashCode();
    }
}
