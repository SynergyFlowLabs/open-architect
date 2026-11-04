package io.intercom.android.sdk.ui.extension;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ContentTypeExtensionKt {
    public static final boolean isAudio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.V2(str, "audio", false, 2, null);
    }

    public static final boolean isDocument(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.V2(str, "application", false, 2, null) || StringsKt.V2(str, "text", false, 2, null);
    }

    public static final boolean isImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.V2(str, "image", false, 2, null);
    }

    public static final boolean isPdf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.V2(str, "pdf", false, 2, null);
    }

    public static final boolean isVideo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.V2(str, "video", false, 2, null);
    }
}
