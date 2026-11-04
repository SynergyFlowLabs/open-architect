package io.customer.messaginginapp.ui.bridge;

import android.net.UrlQuerySanitizer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AndroidUrlQuerySanitizer implements UrlQuerySanitizerWrapper {

    @NotNull
    private final UrlQuerySanitizer sanitizer;

    public AndroidUrlQuerySanitizer(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.sanitizer = new UrlQuerySanitizer(url);
    }

    @Override // io.customer.messaginginapp.ui.bridge.UrlQuerySanitizerWrapper
    @NotNull
    public String getValue(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String value = this.sanitizer.getValue(key);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return value;
    }
}
