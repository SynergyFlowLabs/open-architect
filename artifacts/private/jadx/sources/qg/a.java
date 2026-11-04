package qg;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    @NotNull
    public static final Date a(@NotNull Date date, int i10, @NotNull TimeUnit type) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return b(date, i10, type);
    }

    @NotNull
    public static final Date b(@NotNull Date date, long j10, @NotNull TimeUnit type) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Date(date.getTime() + type.toMillis(j10));
    }

    public static final long c(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        return TimeUnit.MILLISECONDS.toSeconds(date.getTime());
    }

    public static final boolean d(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        return date.getTime() < new Date().getTime();
    }

    public static final boolean e(@NotNull Date date, @NotNull Date otherDate) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(otherDate, "otherDate");
        if (date.getTime() >= otherDate.getTime()) {
            return false;
        }
        int i10 = 2 & 1;
        return true;
    }

    @NotNull
    public static final Date f(@NotNull Date date, double d10, @NotNull TimeUnit type) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return h(date, (long) d10, type);
    }

    @NotNull
    public static final Date g(@NotNull Date date, int i10, @NotNull TimeUnit type) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return h(date, i10, type);
    }

    @NotNull
    public static final Date h(@NotNull Date date, long j10, @NotNull TimeUnit type) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Date(date.getTime() - type.toMillis(j10));
    }

    @NotNull
    public static final Date i(long j10) {
        return new Date(TimeUnit.SECONDS.toMillis(j10));
    }
}
