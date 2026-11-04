package io.ktor.http.cio;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final CharSequence f295488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f295489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final CharSequence f295490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(@NotNull CharSequence version, int i10, @NotNull CharSequence statusText, @NotNull q headers, @NotNull io.ktor.http.cio.internals.d builder) {
        super(headers, builder);
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f295488c = version;
        this.f295489d = i10;
        this.f295490e = statusText;
    }

    public final int b() {
        return this.f295489d;
    }

    @NotNull
    public final CharSequence c() {
        return this.f295490e;
    }

    @NotNull
    public final CharSequence d() {
        return this.f295488c;
    }
}
