package io.ktor.client.call;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f294255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ri.b f294256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Throwable f294257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull b request, @NotNull ri.b info, @NotNull Throwable cause) {
        super("Fail to run receive pipeline: " + cause);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f294255a = request;
        this.f294256b = info;
        this.f294257c = cause;
    }

    @NotNull
    public final ri.b a() {
        return this.f294256b;
    }

    @NotNull
    public final b b() {
        return this.f294255a;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable getCause() {
        return this.f294257c;
    }
}
