package com.devtodev.analytics.internal.validator;

import com.devtodev.analytics.internal.logger.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Bounder implements IBounder {

    @NotNull
    public static final Bounder INSTANCE = new Bounder();

    @NotNull
    private static final Regex regex = new Regex("\\p{C}");

    private Bounder() {
    }

    @Nullable
    public final String deleteNonPrintCharacters(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return regex.replace(str, "");
    }

    @Override // com.devtodev.analytics.internal.validator.IBounder
    @NotNull
    public String maxNotNullStringLength(@NotNull String method, @NotNull String argument, @NotNull String value, int i10) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(argument, "argument");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length() <= i10) {
            return value;
        }
        Logger.INSTANCE.warning("In the " + method + " method problem has occurred:\n\t" + argument + ": " + value + " is longer than it is permitted.\n\tThe string was truncated to length '" + i10 + "'!", null);
        String strSubstring = value.substring(0, i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // com.devtodev.analytics.internal.validator.IBounder
    @Nullable
    public String maxStringLength(@NotNull String method, @NotNull String argument, @Nullable String str, int i10) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(argument, "argument");
        if (str == null) {
            return null;
        }
        if (str.length() <= i10) {
            return str;
        }
        Logger.INSTANCE.warning("In the " + method + " method problem has occurred:\n\t" + argument + ": " + str + " is longer than it is permitted.\n\tThe string was truncated to length '" + i10 + "'!", null);
        String strSubstring = str.substring(0, i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
