package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface p2 {

    @lm.a.c
    public static final String J2 = "none";

    public static final class a implements p2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f306005a;

        public a(@NotNull String str) {
            this.f306005a = str;
        }

        @Override // io.sentry.p2
        @NotNull
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }

        @Override // io.sentry.p2
        @NotNull
        public String name() {
            return this.f306005a;
        }
    }

    public enum b implements p2 {
        NANOSECOND,
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK;

        static {
            boolean z10 = false;
            int i10 = 4 >> 4;
        }

        @Override // io.sentry.p2
        @NotNull
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public enum c implements p2 {
        RATIO,
        PERCENT;

        @Override // io.sentry.p2
        @NotNull
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public enum d implements p2 {
        BIT,
        BYTE,
        KILOBYTE,
        KIBIBYTE,
        MEGABYTE,
        MEBIBYTE,
        GIGABYTE,
        GIBIBYTE,
        TERABYTE,
        TEBIBYTE,
        PETABYTE,
        PEBIBYTE,
        EXABYTE,
        EXBIBYTE;

        @Override // io.sentry.p2
        @NotNull
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    @lm.a.c
    @NotNull
    String apiName();

    @NotNull
    String name();
}
