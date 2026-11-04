package com.bumptech.glide.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f97476a = 1.0d / Math.pow(10.0d, 6.0d);

    private g() {
    }

    public static double a(long j10) {
        return (b() - j10) * f97476a;
    }

    @e.b(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
