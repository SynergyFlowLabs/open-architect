package io.customer.datapipelines.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f288344a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C1953a f288345b = new C1953a();

    /* JADX INFO: renamed from: io.customer.datapipelines.util.a$a, reason: collision with other inner class name */
    public static final class C1953a extends ThreadLocal<SimpleDateFormat> {
        C1953a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
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

        @Nullable
        public final String a(long j10) {
            try {
                Result.a aVar = Result.Companion;
                SimpleDateFormat simpleDateFormat = a.f288345b.get();
                if (simpleDateFormat == null) {
                    return null;
                }
                Date date = new Date();
                date.setTime(TimeUnit.SECONDS.toMillis(j10));
                String str = simpleDateFormat.format(date);
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return StringsKt.k2(str, "UTC", org.locationtech.jts.io.gml2.a.f338505w, false, 4, null);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                Object objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
                return (String) (Result.m786isFailureimpl(objM785constructorimpl) ? null : objM785constructorimpl);
            }
        }

        private b() {
        }
    }
}
