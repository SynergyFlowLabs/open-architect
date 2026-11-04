package fi;

import io.ktor.http.Url;
import io.ktor.http.j1;
import io.ktor.http.v0;
import io.ktor.utils.io.o0;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Url f275292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j1 f275293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v0 f275294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.ktor.http.content.w f275295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final p2 f275296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.b f275297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Set<io.ktor.client.engine.h<?>> f275298g;

    @o0
    public z(@NotNull Url url, @NotNull j1 method, @NotNull v0 headers, @NotNull io.ktor.http.content.w body, @NotNull p2 executionContext, @NotNull io.ktor.util.b attributes) {
        Set<io.ktor.client.engine.h<?>> setKeySet;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f275292a = url;
        this.f275293b = method;
        this.f275294c = headers;
        this.f275295d = body;
        this.f275296e = executionContext;
        this.f275297f = attributes;
        Map map = (Map) attributes.e(io.ktor.client.engine.i.b());
        this.f275298g = (map == null || (setKeySet = map.keySet()) == null) ? SetsKt.emptySet() : setKeySet;
    }

    @NotNull
    public final io.ktor.util.b a() {
        return this.f275297f;
    }

    @NotNull
    public final io.ktor.http.content.w b() {
        return this.f275295d;
    }

    @Nullable
    public final <T> T c(@NotNull io.ktor.client.engine.h<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.f275297f.e(io.ktor.client.engine.i.b());
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
    }

    @NotNull
    public final p2 d() {
        return this.f275296e;
    }

    @NotNull
    public final v0 e() {
        return this.f275294c;
    }

    @NotNull
    public final j1 f() {
        return this.f275293b;
    }

    @NotNull
    public final Set<io.ktor.client.engine.h<?>> g() {
        return this.f275298g;
    }

    @NotNull
    public final Url h() {
        return this.f275292a;
    }

    @NotNull
    public String toString() {
        return "HttpRequestData(url=" + this.f275292a + ", method=" + this.f275293b + ')';
    }
}
