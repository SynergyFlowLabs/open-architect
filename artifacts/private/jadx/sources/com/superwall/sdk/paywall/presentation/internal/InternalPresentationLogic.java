package com.superwall.sdk.paywall.presentation.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class InternalPresentationLogic {

    @NotNull
    public static final InternalPresentationLogic INSTANCE = new InternalPresentationLogic();

    private InternalPresentationLogic() {
    }

    @NotNull
    public final Throwable presentationError(@NotNull String domain, int i10, @NotNull String title, @NotNull String value) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        return new RuntimeException(domain + ": " + i10 + ", " + title + " - " + value);
    }
}
