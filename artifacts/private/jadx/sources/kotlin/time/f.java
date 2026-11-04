package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.e1;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@m2(markerClass = {j.class})
@e1(version = "1.6")
public enum f {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f313425j = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final TimeUnit f313426a;

    static {
        int i10 = 0 >> 4;
        int i11 = 7 ^ 6;
    }

    f(TimeUnit timeUnit) {
        this.f313426a = timeUnit;
    }

    @NotNull
    public static kotlin.enums.a<f> l() {
        return f313425j;
    }

    @NotNull
    public final TimeUnit n() {
        return this.f313426a;
    }
}
