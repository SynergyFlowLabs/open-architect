package kotlin.time;

import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
class i extends h {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f313428a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f313428a = iArr;
        }
    }

    @e1(version = "1.5")
    @NotNull
    public static final f f(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return f.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        }
        if (c10 == 'H') {
            return f.HOURS;
        }
        if (c10 == 'M') {
            return f.MINUTES;
        }
        if (c10 == 'S') {
            return f.SECONDS;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
    }

    @e1(version = "1.5")
    @NotNull
    public static final f g(@NotNull String shortName) {
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return f.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return f.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return f.MILLISECONDS;
                        }
                    } else if (shortName.equals("s")) {
                        return f.SECONDS;
                    }
                } else if (shortName.equals(androidx.media3.exoplayer.upstream.h.f66001o)) {
                    return f.MINUTES;
                }
            } else if (shortName.equals(androidx.media3.exoplayer.upstream.h.f65993g)) {
                return f.HOURS;
            }
        } else if (shortName.equals("d")) {
            return f.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    @e1(version = "1.3")
    @NotNull
    public static final String h(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        switch (a.f313428a[fVar.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return androidx.media3.exoplayer.upstream.h.f66001o;
            case 6:
                return androidx.media3.exoplayer.upstream.h.f65993g;
            case 7:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + fVar).toString());
        }
    }
}
