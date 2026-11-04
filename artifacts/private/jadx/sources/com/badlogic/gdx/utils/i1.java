package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f95575a = 1000000;

    public static long a() {
        return System.currentTimeMillis();
    }

    public static long b(long j10) {
        return j10 * 1000000;
    }

    public static long c() {
        return System.nanoTime();
    }

    public static long d(long j10) {
        return j10 / 1000000;
    }

    public static long e(long j10) {
        return a() - j10;
    }

    public static long f(long j10) {
        return c() - j10;
    }
}
