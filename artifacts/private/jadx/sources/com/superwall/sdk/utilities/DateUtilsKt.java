package com.superwall.sdk.utilities;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class DateUtilsKt {

    @NotNull
    private static final SimpleDateFormat DateFormatterUtil = dateFormat$default(null, 1, null);

    @NotNull
    public static final SimpleDateFormat dateFormat(@NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return new SimpleDateFormat(format, Locale.US);
    }

    public static /* synthetic */ SimpleDateFormat dateFormat$default(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = DateUtils.INSTANCE.getISO_MILLIS();
        }
        return dateFormat(str);
    }

    @NotNull
    public static final SimpleDateFormat getDateFormatterUtil() {
        return DateFormatterUtil;
    }
}
