package io.ktor.client.call;

import io.ktor.http.Url;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.l(level = n.WARNING, message = "This exception is deprecated, use UnsupportedContentTypeException instead.", replaceWith = @b1(expression = "UnsupportedContentTypeException(content)", imports = {}))
public final class k extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Url url) {
        super("Unsupported upgrade protocol exception: " + url);
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
