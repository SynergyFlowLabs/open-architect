package io.ktor.http;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpMessagePropertiesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpMessagePropertiesJvm.kt\nio/ktor/http/HttpMessagePropertiesJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class h1 {
    @Nullable
    public static final Date a(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        String str = f1Var.O().get(d1.f295782a.G());
        if (str != null) {
            return i(str);
        }
        return null;
    }

    @Nullable
    public static final Date b(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        String str = f1Var.O().get(d1.f295782a.L());
        if (str != null) {
            return i(str);
        }
        return null;
    }

    @Nullable
    public static final Date c(@NotNull g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        String str = g1Var.O().get(d1.f295782a.L());
        if (str != null) {
            return i(str);
        }
        return null;
    }

    private static final String d(Date date) {
        String str = e().format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private static final SimpleDateFormat e() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(org.apache.commons.lang3.time.m.f337525a));
        return simpleDateFormat;
    }

    public static final void f(@NotNull g1 g1Var, @NotNull Date date) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        Intrinsics.checkNotNullParameter(date, "date");
        g1Var.O().a(d1.f295782a.S(), d(date));
    }

    @Nullable
    public static final Date g(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        String str = f1Var.O().get(d1.f295782a.X());
        if (str != null) {
            return i(str);
        }
        return null;
    }

    @Nullable
    public static final Date h(@NotNull g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        String str = g1Var.O().get(d1.f295782a.X());
        if (str != null) {
            return i(str);
        }
        return null;
    }

    private static final Date i(String str) throws ParseException {
        Date date = e().parse(str);
        Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
        return date;
    }
}
