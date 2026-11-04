package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.text.format.DateFormat;
import io.intercom.android.sdk.R;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class TimeFormatterExtKt {
    @NotNull
    public static final String formattedDateForDayDivider(long j10, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (j10 <= 0) {
            return "";
        }
        Date date = new Date(j10 * ((long) 1000));
        Locale localeCompat = UtilsKt.getLocaleCompat(context);
        String str = new SimpleDateFormat(DateFormat.getBestDateTimePattern(localeCompat, "MMMM d"), localeCompat).format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String formattedDateFromLong(long j10, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return j10 <= 0 ? "" : getFormattedTime(context, new Date(j10 * ((long) 1000)));
    }

    private static final long getDifferenceInDays(Date date) {
        return TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - date.getTime());
    }

    private static final long getDifferenceInHours(Date date) {
        return TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - date.getTime());
    }

    private static final long getDifferenceInMinutes(Date date) {
        return TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - date.getTime());
    }

    private static final String getFormattedTime(Context context, Date date) {
        long differenceInMinutes = getDifferenceInMinutes(date);
        long differenceInHours = getDifferenceInHours(date);
        long differenceInDays = getDifferenceInDays(date);
        long j10 = differenceInDays / ((long) 7);
        if (j10 > 0) {
            return Phrase.from(context, R.string.intercom_time_week_ago).put("delta", String.valueOf(j10)).format().toString();
        }
        if (differenceInDays > 0) {
            return Phrase.from(context, R.string.intercom_time_day_ago).put("delta", String.valueOf(differenceInDays)).format().toString();
        }
        if (differenceInHours > 0) {
            return Phrase.from(context, R.string.intercom_time_hour_ago).put("delta", String.valueOf(differenceInHours)).format().toString();
        }
        return differenceInMinutes >= 1 ? Phrase.from(context, R.string.intercom_time_minute_ago).put("delta", String.valueOf(differenceInMinutes)).format().toString() : context.getText(R.string.intercom_time_just_now).toString();
    }

    @NotNull
    public static final String toHourOfDay(long j10) {
        return toHourOfDayApi26$default(j10, null, 1, null);
    }

    @NotNull
    public static final String toHourOfDayApi26(long j10, @NotNull ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j10 * ((long) 1000)), zoneId);
        String str = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH).format(zonedDateTimeOfInstant);
        if (zonedDateTimeOfInstant.getHour() == 0) {
            Intrinsics.checkNotNull(str);
            return StringsKt.k2(str, "12:00", "00:00", false, 4, null);
        }
        Intrinsics.checkNotNull(str);
        return str;
    }

    public static /* synthetic */ String toHourOfDayApi26$default(long j10, ZoneId zoneId, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return toHourOfDayApi26(j10, zoneId);
    }

    @NotNull
    public static final String toHourOfDayPreApi26(long j10, @NotNull TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(timeZone);
        long j11 = j10 * ((long) 1000);
        String str = simpleDateFormat.format(Long.valueOf(j11));
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j11);
        if (calendar.get(11) == 0) {
            Intrinsics.checkNotNull(str);
            return StringsKt.k2(str, "12:00", "00:00", false, 4, null);
        }
        Intrinsics.checkNotNull(str);
        return str;
    }

    public static /* synthetic */ String toHourOfDayPreApi26$default(long j10, TimeZone timeZone, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return toHourOfDayPreApi26(j10, timeZone);
    }

    @NotNull
    public static final String toISOFormat(long j10) {
        return toISOFormatApi26(j10);
    }

    @NotNull
    public static final String toISOFormatApi26(long j10) {
        String str = DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(j10 * ((long) 1000)));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String toISOFormatPreApi26(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(Long.valueOf(j10 * ((long) 1000)));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
