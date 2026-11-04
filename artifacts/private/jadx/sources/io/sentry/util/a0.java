package io.sentry.util;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f306940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f306941b;

    static {
        try {
            f306940a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f306940a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f306941b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f306941b = false;
            }
        } catch (Throwable unused2) {
            f306941b = false;
        }
    }

    public static boolean a() {
        return f306940a;
    }

    public static boolean b() {
        return f306941b;
    }

    public static boolean c() {
        return !f306940a;
    }
}
