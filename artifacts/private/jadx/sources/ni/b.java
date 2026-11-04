package ni;

import io.ktor.util.date.GMTDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    @NotNull
    public static final GMTDate a(@NotNull GMTDate gMTDate, long j10) {
        Intrinsics.checkNotNullParameter(gMTDate, "<this>");
        return a.b(Long.valueOf(gMTDate.W() - j10));
    }

    @NotNull
    public static final GMTDate b(@NotNull GMTDate minus, long j10) {
        Intrinsics.checkNotNullParameter(minus, "$this$minus");
        return a.b(Long.valueOf(minus.W() - kotlin.time.c.f0(j10)));
    }

    @NotNull
    public static final GMTDate c(@NotNull GMTDate gMTDate, long j10) {
        Intrinsics.checkNotNullParameter(gMTDate, "<this>");
        return a.b(Long.valueOf(gMTDate.W() + j10));
    }

    @NotNull
    public static final GMTDate d(@NotNull GMTDate plus, long j10) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return a.b(Long.valueOf(plus.W() + kotlin.time.c.f0(j10)));
    }

    @NotNull
    public static final GMTDate e(@NotNull GMTDate gMTDate) {
        Intrinsics.checkNotNullParameter(gMTDate, "<this>");
        return a.a(gMTDate.V(), gMTDate.T(), gMTDate.S(), gMTDate.N(), gMTDate.U(), gMTDate.X());
    }
}
