package com.segment.analytics.kotlin.core.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class r {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f267019a = new a();

    public static final class a extends ThreadLocal<SimpleDateFormat> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSSzzz", Locale.ROOT);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull Date date) {
            Intrinsics.checkNotNullParameter(date, "date");
            String str = r.f267019a.get().format(date);
            Intrinsics.checkNotNullExpressionValue(str, "formatters.get().format(date)");
            return StringsKt.k2(str, "UTC", org.locationtech.jts.io.gml2.a.f338505w, false, 4, null);
        }

        @NotNull
        public final String b() {
            return a(new Date());
        }

        private b() {
        }
    }
}
