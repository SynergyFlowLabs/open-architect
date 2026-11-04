package io.ktor.client.plugins.cache;

import io.ktor.http.Url;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Url requestUrl) {
        super("The entry for url: " + requestUrl + " was removed from cache");
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
    }
}
