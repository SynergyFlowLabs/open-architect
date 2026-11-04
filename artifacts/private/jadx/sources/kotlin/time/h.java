package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class h {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f313427a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f313427a = iArr;
        }
    }

    @e1(version = "1.3")
    public static final double a(double d10, @NotNull f sourceUnit, @NotNull f targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long jConvert = targetUnit.n().convert(1L, sourceUnit.n());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.n().convert(1L, targetUnit.n());
    }

    @e1(version = "1.5")
    public static final long b(long j10, @NotNull f sourceUnit, @NotNull f targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.n().convert(j10, sourceUnit.n());
    }

    @e1(version = "1.5")
    public static final long c(long j10, @NotNull f sourceUnit, @NotNull f targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.n().convert(j10, sourceUnit.n());
    }

    @m2(markerClass = {j.class})
    @e1(version = "1.8")
    @NotNull
    public static final f d(@NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "<this>");
        switch (a.f313427a[timeUnit.ordinal()]) {
            case 1:
                return f.NANOSECONDS;
            case 2:
                return f.MICROSECONDS;
            case 3:
                return f.MILLISECONDS;
            case 4:
                return f.SECONDS;
            case 5:
                return f.MINUTES;
            case 6:
                return f.HOURS;
            case 7:
                return f.DAYS;
            default:
                throw new k0();
        }
    }

    @m2(markerClass = {j.class})
    @e1(version = "1.8")
    @NotNull
    public static TimeUnit e(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.n();
    }
}
