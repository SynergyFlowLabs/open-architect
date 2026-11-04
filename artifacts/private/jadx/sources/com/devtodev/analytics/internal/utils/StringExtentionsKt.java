package com.devtodev.analytics.internal.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nStringExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtentions.kt\ncom/devtodev/analytics/internal/utils/StringExtentionsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,19:1\n1174#2,2:20\n*S KotlinDebug\n*F\n+ 1 StringExtentions.kt\ncom/devtodev/analytics/internal/utils/StringExtentionsKt\n*L\n14#1:20,2\n*E\n"})
public final class StringExtentionsKt {
    public static final boolean isInvalidAdvertisingId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strK2 = StringsKt.k2(str, "-", "", false, 4, null);
        for (int i10 = 0; i10 < strK2.length(); i10++) {
            if (strK2.charAt(i10) != '0') {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final String offsetCharacterByOne(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        String str2 = "";
        for (int i10 = 0; i10 < length; i10++) {
            str2 = str2 + ((char) (str.charAt(i10) + 1));
        }
        return str2;
    }
}
