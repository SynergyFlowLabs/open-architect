package kotlin.time;

import kotlin.e1;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@m2(markerClass = {j.class})
@e1(version = "1.9")
public interface TimeMark {

    public static final class a {
        public static boolean a(@NotNull TimeMark timeMark) {
            return c.x0(timeMark.k());
        }

        public static boolean b(@NotNull TimeMark timeMark) {
            return !c.x0(timeMark.k());
        }

        @NotNull
        public static TimeMark c(@NotNull TimeMark timeMark, long j10) {
            return timeMark.C(c.R0(j10));
        }

        @NotNull
        public static TimeMark d(@NotNull TimeMark timeMark, long j10) {
            return new kotlin.time.a(timeMark, j10, null);
        }
    }

    @NotNull
    TimeMark C(long j10);

    @NotNull
    TimeMark G(long j10);

    long k();

    boolean l();

    boolean n();
}
