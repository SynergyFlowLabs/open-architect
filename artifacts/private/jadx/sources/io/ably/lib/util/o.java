package io.ably.lib.util;

/* JADX INFO: loaded from: classes13.dex */
public class o {
    private static float a(int i10) {
        return Math.min((i10 + 2) / 3.0f, 2.0f);
    }

    private static double b() {
        return 1.0d - (Math.random() * 0.2d);
    }

    public static int c(long j10, int i10) {
        return Double.valueOf(j10 * b() * ((double) a(i10))).intValue();
    }
}
