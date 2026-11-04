package pe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nHttpDateTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpDateTime.kt\ncom/planner5d/library/utils/network/HttpDateTime\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f345633a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final SimpleDateFormat f345634b = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);

    private c() {
    }

    @n
    public static final long a(@Nullable String str) {
        if (str != null) {
            try {
                Date date = f345634b.parse(str);
                Long lValueOf = date != null ? Long.valueOf(date.getTime()) : null;
                if (lValueOf != null) {
                    return lValueOf.longValue();
                }
            } catch (ParseException e10) {
                timber.log.b.f381052a.e(e10);
            }
        }
        return 0L;
    }

    @NotNull
    public final String b(long j10) {
        String str = f345634b.format(new Date(j10));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
