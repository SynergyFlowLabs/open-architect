package io.sentry;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class p {
    private p() {
    }

    public static long a(@NotNull Date date) {
        return i(date.getTime());
    }

    public static double b(@NotNull Date date) {
        return j(date.getTime());
    }

    @NotNull
    public static BigDecimal c(@NotNull Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    @NotNull
    public static Date d() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f307038b).getTime();
    }

    @NotNull
    public static Date e(long j10) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f307038b);
        calendar.setTimeInMillis(j10);
        return calendar.getTime();
    }

    @NotNull
    public static Date f(@NotNull String str) throws IllegalArgumentException {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.g(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException("timestamp is not ISO format " + str);
        }
    }

    @NotNull
    public static Date g(@NotNull String str) throws IllegalArgumentException {
        try {
            return e(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("timestamp is not millis format " + str);
        }
    }

    @NotNull
    public static String h(@NotNull Date date) {
        return io.sentry.vendor.gson.internal.bind.util.a.c(date, true);
    }

    public static long i(long j10) {
        return j10 * 1000000;
    }

    public static double j(double d10) {
        return d10 / 1000.0d;
    }

    public static Date k(long j10) {
        return e(Double.valueOf(l(j10)).longValue());
    }

    public static double l(double d10) {
        return d10 / 1000000.0d;
    }

    public static double m(long j10) {
        return j10 / 1.0E9d;
    }

    public static long n(@NotNull long j10) {
        return j10 * 1000000000;
    }

    @Nullable
    public static Date o(@Nullable e6 e6Var) {
        if (e6Var == null) {
            return null;
        }
        return p(e6Var);
    }

    @NotNull
    public static Date p(@NotNull e6 e6Var) {
        return k(e6Var.k());
    }
}
