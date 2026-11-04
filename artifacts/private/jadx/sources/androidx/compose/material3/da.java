package androidx.compose.material3;

import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDatePicker.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.jvm.kt\nandroidx/compose/material3/DatePicker_jvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,430:1\n1#2:431\n*E\n"})
public final class da {
    @androidx.annotation.w0(26)
    @af
    @NotNull
    public static final z9 a(@NotNull Locale locale, @Nullable LocalDate localDate, @Nullable YearMonth yearMonth, @NotNull IntRange intRange, int i10, @NotNull ww wwVar) {
        return i9.X(locale, j(localDate), yearMonth != null ? Long.valueOf(o(yearMonth)) : null, intRange, i10, wwVar);
    }

    public static /* synthetic */ z9 b(Locale locale, LocalDate localDate, YearMonth yearMonth, IntRange intRange, int i10, ww wwVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            yearMonth = localDate != null ? YearMonth.from(localDate) : null;
        }
        YearMonth yearMonth2 = yearMonth;
        if ((i11 & 8) != 0) {
            intRange = v7.f33887a.q();
        }
        IntRange intRange2 = intRange;
        if ((i11 & 16) != 0) {
            i10 = ed.f27323b.b();
        }
        int i12 = i10;
        if ((i11 & 32) != 0) {
            wwVar = v7.f33887a.m();
        }
        return a(locale, localDate, yearMonth2, intRange2, i12, wwVar);
    }

    @androidx.annotation.w0(26)
    @af
    @NotNull
    public static final jb c(@NotNull Locale locale, @Nullable LocalDate localDate, @Nullable LocalDate localDate2, @Nullable YearMonth yearMonth, @NotNull IntRange intRange, int i10, @NotNull ww wwVar) {
        return za.m(locale, j(localDate), j(localDate2), yearMonth != null ? Long.valueOf(o(yearMonth)) : null, intRange, i10, wwVar);
    }

    public static /* synthetic */ jb d(Locale locale, LocalDate localDate, LocalDate localDate2, YearMonth yearMonth, IntRange intRange, int i10, ww wwVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            yearMonth = localDate != null ? YearMonth.from(localDate) : null;
        }
        YearMonth yearMonth2 = yearMonth;
        if ((i11 & 16) != 0) {
            intRange = v7.f33887a.q();
        }
        IntRange intRange2 = intRange;
        if ((i11 & 32) != 0) {
            i10 = ed.f27323b.b();
        }
        int i12 = i10;
        if ((i11 & 64) != 0) {
            wwVar = v7.f33887a.m();
        }
        return c(locale, localDate, localDate2, yearMonth2, intRange2, i12, wwVar);
    }

    @NotNull
    public static final String e(@NotNull String str, @NotNull String str2) {
        String str3 = String.format(str, Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }

    @NotNull
    public static final String f(@NotNull String str, @NotNull String str2) {
        String str3 = String.format(str, Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }

    @androidx.annotation.w0(26)
    @af
    @NotNull
    public static final YearMonth g(@NotNull z9 z9Var) {
        return n(z9Var.f());
    }

    @androidx.annotation.w0(26)
    @af
    @NotNull
    public static final YearMonth h(@NotNull jb jbVar) {
        return n(jbVar.f());
    }

    @androidx.annotation.w0(26)
    private static final LocalDate i(Long l10) {
        if (l10 == null) {
            return null;
        }
        return Instant.ofEpochMilli(l10.longValue()).atZone(ZoneOffset.UTC).toLocalDate();
    }

    @androidx.annotation.w0(26)
    private static final Long j(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        return Long.valueOf(localDate.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli());
    }

    @androidx.annotation.w0(26)
    @af
    @Nullable
    public static final LocalDate k(@NotNull z9 z9Var) {
        return i(z9Var.j());
    }

    @androidx.annotation.w0(26)
    @af
    @Nullable
    public static final LocalDate l(@NotNull jb jbVar) {
        return i(jbVar.h());
    }

    @androidx.annotation.w0(26)
    @af
    @Nullable
    public static final LocalDate m(@NotNull jb jbVar) {
        return i(jbVar.k());
    }

    @androidx.annotation.w0(26)
    private static final YearMonth n(long j10) {
        return YearMonth.from(Instant.ofEpochMilli(j10).atZone(ZoneOffset.UTC));
    }

    @androidx.annotation.w0(26)
    private static final long o(YearMonth yearMonth) {
        return yearMonth.atDay(1).atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
    }

    @af
    @NotNull
    @androidx.compose.runtime.o
    @androidx.annotation.w0(26)
    public static final z9 p(@Nullable LocalDate localDate, @Nullable YearMonth yearMonth, @Nullable IntRange intRange, int i10, @Nullable ww wwVar, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        if ((i12 & 2) != 0) {
            yearMonth = localDate != null ? YearMonth.from(localDate) : null;
        }
        if ((i12 & 4) != 0) {
            intRange = v7.f33887a.q();
        }
        IntRange intRange2 = intRange;
        if ((i12 & 8) != 0) {
            i10 = ed.f27323b.b();
        }
        int i13 = i10;
        ww wwVarM = (i12 & 16) != 0 ? v7.f33887a.m() : wwVar;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1802387829, i11, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.jvm.kt:70)");
        }
        z9 z9VarX0 = i9.X0(localDate != null ? j(localDate) : null, yearMonth != null ? Long.valueOf(o(yearMonth)) : null, intRange2, i13, wwVarM, c0Var, i11 & 65408, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return z9VarX0;
    }

    @af
    @NotNull
    @androidx.compose.runtime.o
    @androidx.annotation.w0(26)
    public static final jb q(@Nullable LocalDate localDate, @Nullable LocalDate localDate2, @Nullable YearMonth yearMonth, @Nullable IntRange intRange, int i10, @Nullable ww wwVar, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        if ((i12 & 4) != 0) {
            yearMonth = localDate != null ? YearMonth.from(localDate) : null;
        }
        IntRange intRangeQ = (i12 & 8) != 0 ? v7.f33887a.q() : intRange;
        int iB = (i12 & 16) != 0 ? ed.f27323b.b() : i10;
        ww wwVarM = (i12 & 32) != 0 ? v7.f33887a.m() : wwVar;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1580705706, i11, -1, "androidx.compose.material3.rememberDateRangePickerState (DatePicker.jvm.kt:175)");
        }
        jb jbVarE = za.E(localDate != null ? j(localDate) : null, localDate2 != null ? j(localDate2) : null, yearMonth != null ? Long.valueOf(o(yearMonth)) : null, intRangeQ, iB, wwVarM, c0Var, i11 & 523264, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jbVarE;
    }

    @androidx.annotation.w0(26)
    @af
    public static final void r(@NotNull z9 z9Var, @NotNull YearMonth yearMonth) {
        z9Var.a(o(yearMonth));
    }

    @androidx.annotation.w0(26)
    @af
    public static final void s(@NotNull jb jbVar, @NotNull YearMonth yearMonth) {
        jbVar.a(o(yearMonth));
    }

    @androidx.annotation.w0(26)
    @af
    public static final void t(@NotNull z9 z9Var, @Nullable LocalDate localDate) {
        z9Var.g(j(localDate));
    }

    @androidx.annotation.w0(26)
    @af
    public static final void u(@NotNull jb jbVar, @Nullable LocalDate localDate, @Nullable LocalDate localDate2) {
        jbVar.i(j(localDate), j(localDate2));
    }
}
