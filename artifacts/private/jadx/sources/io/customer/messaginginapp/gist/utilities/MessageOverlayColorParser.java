package io.customer.messaginginapp.gist.utilities;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class MessageOverlayColorParser {

    @NotNull
    public static final MessageOverlayColorParser INSTANCE = new MessageOverlayColorParser();

    private MessageOverlayColorParser() {
    }

    private final boolean doesNotHaveExpectedColorCharCount(String str) {
        return (str.length() == 6 || str.length() == 8) ? false : true;
    }

    @Nullable
    public final String parseColor(@Nullable String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        String strD4 = StringsKt.d4(str, "#");
        if (doesNotHaveExpectedColorCharCount(strD4)) {
            return null;
        }
        String strSubstring2 = strD4.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String strSubstring3 = strD4.substring(2, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        String strSubstring4 = strD4.substring(4, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        if (strD4.length() == 8) {
            strSubstring = strD4.substring(6, 8);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        return "#" + strSubstring + strSubstring2 + strSubstring3 + strSubstring4;
    }
}
