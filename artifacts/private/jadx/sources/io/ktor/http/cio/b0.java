package io.ktor.http.cio;

import io.ktor.http.j1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final j1 f295476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final CharSequence f295477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final CharSequence f295478e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@NotNull j1 method, @NotNull CharSequence uri, @NotNull CharSequence version, @NotNull q headers, @NotNull io.ktor.http.cio.internals.d builder) {
        super(headers, builder);
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f295476c = method;
        this.f295477d = uri;
        this.f295478e = version;
    }

    @NotNull
    public final j1 b() {
        return this.f295476c;
    }

    @NotNull
    public final CharSequence c() {
        return this.f295477d;
    }

    @NotNull
    public final CharSequence d() {
        return this.f295478e;
    }
}
