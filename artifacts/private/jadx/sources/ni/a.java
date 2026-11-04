package ni;

import io.ktor.util.date.GMTDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.lang3.time.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nDateJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateJvm.kt\nio/ktor/util/date/DateJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeZone f333358a = TimeZone.getTimeZone(m.f337525a);

    @NotNull
    public static final GMTDate a(int i10, int i11, int i12, int i13, @NotNull h month, int i14) {
        Intrinsics.checkNotNullParameter(month, "month");
        Calendar calendar = Calendar.getInstance(f333358a, Locale.ROOT);
        Intrinsics.checkNotNull(calendar);
        calendar.set(1, i14);
        calendar.set(2, month.ordinal());
        calendar.set(5, i13);
        calendar.set(11, i12);
        calendar.set(12, i11);
        calendar.set(13, i10);
        calendar.set(14, 0);
        return e(calendar, null);
    }

    @NotNull
    public static final GMTDate b(@Nullable Long l10) {
        Calendar calendar = Calendar.getInstance(f333358a, Locale.ROOT);
        Intrinsics.checkNotNull(calendar);
        return e(calendar, l10);
    }

    public static /* synthetic */ GMTDate c(Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        return b(l10);
    }

    public static final long d() {
        return System.currentTimeMillis();
    }

    @NotNull
    public static final GMTDate e(@NotNull Calendar calendar, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        int i10 = calendar.get(15) + calendar.get(16);
        return new GMTDate(calendar.get(13), calendar.get(12), calendar.get(11), i.f333391b.a((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), h.f333375b.a(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + ((long) i10));
    }

    @NotNull
    public static final Date f(@NotNull GMTDate gMTDate) {
        Intrinsics.checkNotNullParameter(gMTDate, "<this>");
        return new Date(gMTDate.W());
    }
}
