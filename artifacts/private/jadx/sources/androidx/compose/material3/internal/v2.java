package androidx.compose.material3.internal;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLegacyCalendarModelImpl.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/internal/LegacyCalendarModelImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,241:1\n70#2,6:242\n*S KotlinDebug\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/internal/LegacyCalendarModelImpl\n*L\n61#1:242,6\n*E\n"})
public final class v2 extends k1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f29190f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f29191g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final TimeZone f29192h = TimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<Pair<String, String>> f29194e;

    @SourceDebugExtension({"SMAP\nLegacyCalendarModelImpl.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/internal/LegacyCalendarModelImpl$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,241:1\n381#2,7:242\n*S KotlinDebug\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/internal/LegacyCalendarModelImpl$Companion\n*L\n192#1:242,7\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SimpleDateFormat b(String str, Locale locale, Map<String, Object> map) {
            String str2 = str + locale.toLanguageTag();
            Object obj = map.get(str2);
            Object obj2 = obj;
            if (obj == null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
                simpleDateFormat.setTimeZone(v2.f29190f.c());
                map.put(str2, simpleDateFormat);
                obj2 = simpleDateFormat;
            }
            return (SimpleDateFormat) obj2;
        }

        @NotNull
        public final String a(long j10, @NotNull String str, @NotNull Locale locale, @NotNull Map<String, Object> map) {
            SimpleDateFormat simpleDateFormatB = b(str, locale, map);
            Calendar calendar = Calendar.getInstance(c());
            calendar.setTimeInMillis(j10);
            return simpleDateFormatB.format(Long.valueOf(calendar.getTimeInMillis()));
        }

        @NotNull
        public final TimeZone c() {
            return v2.f29192h;
        }

        private a() {
        }
    }

    public v2(@NotNull Locale locale) {
        super(locale);
        this.f29193d = v(Calendar.getInstance(locale).getFirstDayOfWeek());
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        List listDrop = ArraysKt.drop(weekdays, 2);
        int size = listDrop.size();
        for (int i10 = 0; i10 < size; i10++) {
            listCreateListBuilder.add(new Pair((String) listDrop.get(i10), shortWeekdays[i10 + 2]));
        }
        listCreateListBuilder.add(new Pair(weekdays[1], shortWeekdays[1]));
        this.f29194e = CollectionsKt.build(listCreateListBuilder);
    }

    private final int v(int i10) {
        int i11 = (i10 + 6) % 7;
        if (i11 == 0) {
            return 7;
        }
        return i11;
    }

    private final o1 w(Calendar calendar) {
        int iV = v(calendar.get(7)) - j();
        if (iV < 0) {
            iV += 7;
        }
        return new o1(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), iV, calendar.getTimeInMillis());
    }

    private final Calendar x(j1 j1Var, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.clear();
        calendar.set(1, j1Var.w());
        calendar.set(2, j1Var.t() - 1);
        calendar.set(5, j1Var.s());
        return calendar;
    }

    private final Calendar y(o1 o1Var) {
        Calendar calendar = Calendar.getInstance(f29192h);
        calendar.setTimeInMillis(o1Var.m());
        return calendar;
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public String a(long j10, @NotNull String str, @NotNull Locale locale) {
        return f29190f.a(j10, str, locale, k());
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public j1 f(long j10) {
        Calendar calendar = Calendar.getInstance(f29192h);
        calendar.setTimeInMillis(j10);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new j1(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public v1 g(@NotNull Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        Intrinsics.checkNotNull(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return m1.a(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // androidx.compose.material3.internal.k1
    public int i(@NotNull j1 j1Var) {
        return v(x(j1Var, TimeZone.getDefault()).get(7));
    }

    @Override // androidx.compose.material3.internal.k1
    public int j() {
        return this.f29193d;
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public o1 m(int i10, int i11) {
        Calendar calendar = Calendar.getInstance(f29192h);
        calendar.clear();
        calendar.set(1, i10);
        calendar.set(2, i11 - 1);
        calendar.set(5, 1);
        return w(calendar);
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public o1 n(long j10) {
        Calendar calendar = Calendar.getInstance(f29192h);
        calendar.setTimeInMillis(j10);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return w(calendar);
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public o1 o(@NotNull j1 j1Var) {
        return m(j1Var.w(), j1Var.t());
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public j1 p() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new j1(calendar.get(1), 1 + calendar.get(2), calendar.get(5), calendar.getTimeInMillis() + ((long) (calendar.get(15) + calendar.get(16))));
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public List<Pair<String, String>> q() {
        return this.f29194e;
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public o1 r(@NotNull o1 o1Var, int i10) {
        if (i10 <= 0) {
            return o1Var;
        }
        Calendar calendarY = y(o1Var);
        calendarY.add(2, -i10);
        return w(calendarY);
    }

    @Override // androidx.compose.material3.internal.k1
    @Nullable
    public j1 s(@NotNull String str, @NotNull String str2, @NotNull Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = f29192h;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date);
            return new j1(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public o1 t(@NotNull o1 o1Var, int i10) {
        if (i10 <= 0) {
            return o1Var;
        }
        Calendar calendarY = y(o1Var);
        calendarY.add(2, i10);
        return w(calendarY);
    }

    @NotNull
    public String toString() {
        return "LegacyCalendarModel";
    }
}
