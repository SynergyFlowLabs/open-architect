package com.superwall.sdk.utilities;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class DateUtils {

    @NotNull
    public static final DateUtils INSTANCE = new DateUtils();

    @NotNull
    private static final String ISO_MILLIS = "yyyy-MM-dd'T'HH:mm:ss.SSS";

    @NotNull
    private static final String ISO_SECONDS = "yyyy-MM-dd'T'HH:mm:ss";

    @NotNull
    private static final String ISO_SECONDS_TIMEZONE = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    @NotNull
    private static final String SIMPLE = "yyyy-MM-dd HH:mm:ss";

    @NotNull
    private static final String yyyy_MM_dd = "yyyy-MM-dd";

    @NotNull
    private static final String HH_mm_ss = "HH:mm:ss";

    @NotNull
    private static final String MMM_dd_yyyy = "MMM dd, yyyy";

    private DateUtils() {
    }

    @NotNull
    public final String getHH_mm_ss() {
        return HH_mm_ss;
    }

    @NotNull
    public final String getISO_MILLIS() {
        return ISO_MILLIS;
    }

    @NotNull
    public final String getISO_SECONDS() {
        return ISO_SECONDS;
    }

    @NotNull
    public final String getISO_SECONDS_TIMEZONE() {
        return ISO_SECONDS_TIMEZONE;
    }

    @NotNull
    public final String getMMM_dd_yyyy() {
        return MMM_dd_yyyy;
    }

    @NotNull
    public final String getSIMPLE() {
        return SIMPLE;
    }

    @NotNull
    public final String getYyyy_MM_dd() {
        return yyyy_MM_dd;
    }
}
