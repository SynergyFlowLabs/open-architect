package xj;

import java.time.Duration;
import kotlin.e1;
import kotlin.internal.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.m2;
import kotlin.time.c;
import kotlin.time.e;
import kotlin.time.j;
import oj.i;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,35:1\n731#2,2:36\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n35#1:36,2\n*E\n"})
@i(name = "DurationConversionsJDK8Kt")
public final class a {
    @m2(markerClass = {j.class})
    @e1(version = "1.6")
    @f
    private static final Duration a(long j10) {
        Duration durationOfSeconds = Duration.ofSeconds(c.i0(j10), c.m0(j10));
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "toComponents-impl(...)");
        return durationOfSeconds;
    }

    @m2(markerClass = {j.class})
    @e1(version = "1.6")
    @f
    private static final long b(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        return c.A0(e.n0(duration.getSeconds(), kotlin.time.f.SECONDS), e.m0(duration.getNano(), kotlin.time.f.NANOSECONDS));
    }
}
