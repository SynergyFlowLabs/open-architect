package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class p2 extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(@NotNull String urlString, @NotNull Throwable cause) {
        super("Fail to parse url: " + urlString, cause);
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
