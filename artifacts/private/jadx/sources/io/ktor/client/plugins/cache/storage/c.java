package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Url;
import io.ktor.http.k1;
import io.ktor.http.l1;
import io.ktor.http.v0;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Url f294545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l1 f294546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final GMTDate f294547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final GMTDate f294548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final k1 f294549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final GMTDate f294550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final v0 f294551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f294552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final byte[] f294553i;

    public c(@NotNull Url url, @NotNull l1 statusCode, @NotNull GMTDate requestTime, @NotNull GMTDate responseTime, @NotNull k1 version, @NotNull GMTDate expires, @NotNull v0 headers, @NotNull Map<String, String> varyKeys, @NotNull byte[] body) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(requestTime, "requestTime");
        Intrinsics.checkNotNullParameter(responseTime, "responseTime");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(expires, "expires");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(varyKeys, "varyKeys");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f294545a = url;
        this.f294546b = statusCode;
        this.f294547c = requestTime;
        this.f294548d = responseTime;
        this.f294549e = version;
        this.f294550f = expires;
        this.f294551g = headers;
        this.f294552h = varyKeys;
        this.f294553i = body;
    }

    @NotNull
    public final c a(@NotNull Map<String, String> varyKeys, @NotNull GMTDate expires) {
        Intrinsics.checkNotNullParameter(varyKeys, "varyKeys");
        Intrinsics.checkNotNullParameter(expires, "expires");
        return new c(this.f294545a, this.f294546b, this.f294547c, this.f294548d, this.f294549e, expires, this.f294551g, varyKeys, this.f294553i);
    }

    @NotNull
    public final byte[] b() {
        return this.f294553i;
    }

    @NotNull
    public final GMTDate c() {
        return this.f294550f;
    }

    @NotNull
    public final v0 d() {
        return this.f294551g;
    }

    @NotNull
    public final GMTDate e() {
        return this.f294547c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f294545a, cVar.f294545a) && Intrinsics.areEqual(this.f294552h, cVar.f294552h);
    }

    @NotNull
    public final GMTDate f() {
        return this.f294548d;
    }

    @NotNull
    public final l1 g() {
        return this.f294546b;
    }

    @NotNull
    public final Url h() {
        return this.f294545a;
    }

    public int hashCode() {
        return (this.f294545a.hashCode() * 31) + this.f294552h.hashCode();
    }

    @NotNull
    public final Map<String, String> i() {
        return this.f294552h;
    }

    @NotNull
    public final k1 j() {
        return this.f294549e;
    }
}
