package org.locationtech.jts.util;

/* JADX INFO: loaded from: classes14.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f339147a = 1024.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f339148b = 1048576.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f339149c = 1.073741824E9d;

    public static String a() {
        return "Used: " + i() + "   Free: " + d() + "   Total: " + g();
    }

    public static String b(long j10) {
        double d10 = j10;
        if (d10 < 2048.0d) {
            return j10 + " bytes";
        }
        if (d10 < 2097152.0d) {
            return e(d10 / 1024.0d) + " KB";
        }
        if (d10 < 2.147483648E9d) {
            return e(d10 / 1048576.0d) + " MB";
        }
        return e(d10 / 1.073741824E9d) + " GB";
    }

    public static long c() {
        return Runtime.getRuntime().freeMemory();
    }

    public static String d() {
        return b(c());
    }

    public static double e(double d10) {
        return Math.ceil(d10 * 100.0d) / 100.0d;
    }

    public static long f() {
        return Runtime.getRuntime().totalMemory();
    }

    public static String g() {
        return b(f());
    }

    public static long h() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static String i() {
        return b(h());
    }

    public static String j() {
        return "Used: " + i() + "   Total: " + g();
    }
}
