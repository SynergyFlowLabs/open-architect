package io.ktor.client.call;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f294239a;

    public a(@NotNull b call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f294239a = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.f294239a;
    }
}
