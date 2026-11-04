package androidx.compose.material3.internal;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@androidx.annotation.w0(26)
@SourceDebugExtension({"SMAP\nCalendarModelImpl.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/internal/CalendarModelImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,232:1\n150#2,3:233\n34#2,6:236\n153#2:242\n*S KotlinDebug\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/internal/CalendarModelImpl\n*L\n69#1:233,3\n69#1:236,6\n69#1:242\n*E\n"})
public final class l1 extends k1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f28990f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f28991g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final ZoneId f28992h = ZoneId.of("UTC");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f28993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<Pair<String, String>> f28994e;

    @SourceDebugExtension({"SMAP\nCalendarModelImpl.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/internal/CalendarModelImpl$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,232:1\n381#2,7:233\n*S KotlinDebug\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/internal/CalendarModelImpl$Companion\n*L\n194#1:233,7\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DateTimeFormatter c(String str, Locale locale, Map<String, Object> map) {
            String str2 = "P:" + str + locale.toLanguageTag();
            Object objWithDecimalStyle = map.get(str2);
            if (objWithDecimalStyle == null) {
                objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
                map.put(str2, objWithDecimalStyle);
            }
            Intrinsics.checkNotNull(objWithDecimalStyle, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
            return (DateTimeFormatter) objWithDecimalStyle;
        }

        @NotNull
        public final String b(long j10, @NotNull String str, @NotNull Locale locale, @NotNull Map<String, Object> map) {
            return Instant.ofEpochMilli(j10).atZone(d()).toLocalDate().format(c(str, locale, map));
        }

        @NotNull
        public final ZoneId d() {
            return l1.f28992h;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<DayOfWeek> f28995a = kotlin.enums.c.c(DayOfWeek.values());
    }

    public l1(@NotNull Locale locale) {
        super(locale);
        this.f28993d = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        kotlin.enums.a<DayOfWeek> aVar = b.f28995a;
        ArrayList arrayList = new ArrayList(aVar.size());
        int size = aVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            DayOfWeek dayOfWeek = aVar.get(i10);
            arrayList.add(TuplesKt.to(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, locale), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.f28994e = arrayList;
    }

    private final o1 v(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - j();
        if (value < 0) {
            value += 7;
        }
        return new o1(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(f28992h).toInstant().toEpochMilli());
    }

    private final LocalDate w(j1 j1Var) {
        return LocalDate.of(j1Var.w(), j1Var.t(), j1Var.s());
    }

    private final LocalDate x(o1 o1Var) {
        return Instant.ofEpochMilli(o1Var.m()).atZone(f28992h).toLocalDate();
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public String a(long j10, @NotNull String str, @NotNull Locale locale) {
        return f28990f.b(j10, str, locale, k());
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public j1 f(long j10) {
        LocalDate localDate = Instant.ofEpochMilli(j10).atZone(f28992h).toLocalDate();
        return new j1(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), ((long) 1000) * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public v1 g(@NotNull Locale locale) {
        return m1.a(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // androidx.compose.material3.internal.k1
    public int i(@NotNull j1 j1Var) {
        return w(j1Var).getDayOfWeek().getValue();
    }

    @Override // androidx.compose.material3.internal.k1
    public int j() {
        return this.f28993d;
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public o1 m(int i10, int i11) {
        return v(LocalDate.of(i10, i11, 1));
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public o1 n(long j10) {
        return v(Instant.ofEpochMilli(j10).atZone(f28992h).withDayOfMonth(1).toLocalDate());
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public o1 o(@NotNull j1 j1Var) {
        return v(LocalDate.of(j1Var.w(), j1Var.t(), 1));
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public j1 p() {
        LocalDate localDateNow = LocalDate.now();
        return new j1(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(f28992h).toInstant().toEpochMilli());
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public List<Pair<String, String>> q() {
        return this.f28994e;
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public o1 r(@NotNull o1 o1Var, int i10) {
        return i10 <= 0 ? o1Var : v(x(o1Var).minusMonths(i10));
    }

    @Override // androidx.compose.material3.internal.k1
    @Nullable
    public j1 s(@NotNull String str, @NotNull String str2, @NotNull Locale locale) {
        try {
            LocalDate localDate = LocalDate.parse(str, f28990f.c(str2, locale, k()));
            return new j1(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(f28992h).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.internal.k1
    @NotNull
    public o1 t(@NotNull o1 o1Var, int i10) {
        return i10 <= 0 ? o1Var : v(x(o1Var).plusMonths(i10));
    }

    @NotNull
    public String toString() {
        return "CalendarModel";
    }
}
