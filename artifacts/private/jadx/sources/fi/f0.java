package fi;

import io.ktor.http.k1;
import io.ktor.http.l1;
import io.ktor.http.v0;
import io.ktor.util.date.GMTDate;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l1 f275231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final GMTDate f275232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v0 f275233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final k1 f275234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f275235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f275236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final GMTDate f275237g;

    public f0(@NotNull l1 statusCode, @NotNull GMTDate requestTime, @NotNull v0 headers, @NotNull k1 version, @NotNull Object body, @NotNull CoroutineContext callContext) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(requestTime, "requestTime");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        this.f275231a = statusCode;
        this.f275232b = requestTime;
        this.f275233c = headers;
        this.f275234d = version;
        this.f275235e = body;
        this.f275236f = callContext;
        this.f275237g = ni.a.c(null, 1, null);
    }

    @NotNull
    public final Object a() {
        return this.f275235e;
    }

    @NotNull
    public final CoroutineContext b() {
        return this.f275236f;
    }

    @NotNull
    public final v0 c() {
        return this.f275233c;
    }

    @NotNull
    public final GMTDate d() {
        return this.f275232b;
    }

    @NotNull
    public final GMTDate e() {
        return this.f275237g;
    }

    @NotNull
    public final l1 f() {
        return this.f275231a;
    }

    @NotNull
    public final k1 g() {
        return this.f275234d;
    }

    @NotNull
    public String toString() {
        return "HttpResponseData=(statusCode=" + this.f275231a + ')';
    }
}
