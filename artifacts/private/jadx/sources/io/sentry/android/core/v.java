package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.ILogger;
import io.sentry.e4;
import io.sentry.y7;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class v implements io.sentry.d1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final ILogger f304567h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f304560a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f304561b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f304562c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f304563d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f304564e = 1000000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f304565f = 1.0E9d / 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final File f304566g = new File("/proc/self/stat");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f304568i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Pattern f304569j = Pattern.compile("[\n\t\r ]");

    public v(@NotNull ILogger iLogger) {
        this.f304567h = (ILogger) io.sentry.util.y.c(iLogger, "Logger is required.");
    }

    private long e() {
        String strC;
        try {
            strC = io.sentry.util.i.c(this.f304566g);
        } catch (IOException e10) {
            this.f304568i = false;
            this.f304567h.a(y7.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e10);
            strC = null;
        }
        if (strC != null) {
            String[] strArrSplit = this.f304569j.split(strC.trim());
            try {
                return (long) ((Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f304565f);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e11) {
                this.f304567h.a(y7.ERROR, "Error parsing /proc/self/stat file.", e11);
            }
        }
        return 0L;
    }

    @Override // io.sentry.d1
    public void c() {
        this.f304568i = true;
        this.f304562c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f304563d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f304565f = 1.0E9d / this.f304562c;
        this.f304561b = e();
    }

    @Override // io.sentry.d1
    public void d(@NotNull e4 e4Var) {
        if (this.f304568i) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j10 = jElapsedRealtimeNanos - this.f304560a;
            this.f304560a = jElapsedRealtimeNanos;
            long jE = e();
            long j11 = jE - this.f304561b;
            this.f304561b = jE;
            e4Var.e(Double.valueOf(((j11 / j10) / this.f304563d) * 100.0d));
        }
    }
}
